package com.bsoft.mybatis.Interceptor;

import org.apache.commons.collections4.map.CaseInsensitiveMap;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;
import org.springframework.stereotype.Repository;

import java.sql.Statement;
import java.util.*;

/**
 * ProjectName: fy
 * User: TongChang
 * Date: 2019/11/20
 * Time: 7:55 下午
 * Description:
 **/
@Repository
@Intercepts(@Signature(type = ResultSetHandler.class, method = "handleResultSets", args = Statement.class))
public class InterceptorForMap implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        ResultSetHandler resultSetHandler = (ResultSetHandler) invocation.getTarget();
        Object result = invocation.proceed();
        boolean isWrap = false;
        if (result instanceof Collection) {
            Collection resultList = (Collection) result;
            List<Object> list = new ArrayList<>();
            Iterator r = resultList.iterator();
            while (r.hasNext()) {
                Object itor = r.next();
                if (itor instanceof Map) {
                    list.add(getWrapMap((Map) itor));
                }else{
                    list.add(itor);
                }
            }
            isWrap = true;
            result = list;
        }
        if (result instanceof Map) {
            Map<String, Object> resultMap = (Map<String, Object>) result;
            result = getWrapMap(resultMap);
            isWrap = true;
        }
        if (!isWrap)
            throw new RuntimeException("数据库底层返回的类型不是预期的，类型为：" + result.getClass().getName() + "==请假此类型反馈给童昌");
        return result;
    }

    private Map<String, Object> getWrapMap(Map<String, Object> resultMap) {
        Map<String, Object> wrapMap = new CaseInsensitiveMap();
        Set<String> keySet = resultMap.keySet();
        keySet.forEach(k -> {
            wrapMap.put(k, resultMap.get(k));
        });
        return wrapMap;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
