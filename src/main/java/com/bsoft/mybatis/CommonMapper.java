package com.bsoft.mybatis;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wjtc8 on 2016/8/16.
 */
@Repository
@Log4j2
public class CommonMapper implements ICommonMapper {

    @Autowired
    private SqlSessionTemplate template;

    /**
     * @param sqlKey     sql id
     * @param dataSource 数据源
     * @param param      参数
     * @return
     */
    public <E> List<E> selectList(String sqlKey, String dataSource, Object param) {
        List<E> result = template.selectList(sqlKey, param);
        if (result != null && result.size() == 1 && result.get(0) == null) {
            return null;
        } else {
            return result;
        }
    }

    public <T> T selectOne(String sqlKey, String dataSource, Object param) {
        return template.selectOne(sqlKey, param);
    }

    public Pager selectListByPage(String sqlKey, String dataSource, Object param, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize, true, false, false);
        Pager pager = new Pager();
        Page page = (Page) template.selectList(sqlKey, param);
        pager.setPageNum(page.getPageNum());
        pager.setPageSize(page.getPageSize());
        pager.setTotal(page.getTotal());
        pager.setItems(page.getResult());
        pager.setPages(page.getPages());
        return pager;
    }

    public int insert(String sqlKey, String dataSource, Object param) {
        return template.insert(sqlKey, param);
    }

    @Override
    public int update(String sqlKey, String dataSource, Object param) {
        return template.update(sqlKey, param);
    }

    @Override
    public int delete(String sqlKey, String dataSource, Object param) {
        return 0;
    }

    public int insertBatch(String sqlKey, String dataSource, List<? extends Object> list) {
        Map<String, Integer> r = new HashMap<>();
        r.put("count", 0);
        list.stream().forEach(v -> {
            int c = r.get("count");
            c += template.insert(sqlKey, v);
            r.put("count", c);
        });
        return r.get("count");
    }

    @Override
    public int updateBatch(String sqlKey, String dataSource, List<? extends Object> list) {
        Map<String, Integer> r = new HashMap<>();
        r.put("count", 0);
        list.stream().forEach(v -> {
            int c = r.get("count");
            c += template.update(sqlKey, v);
            r.put("count", c);
        });
        return r.get("count");
    }

    @Override
    public int deleteBatch(String sqlKey, String dataSource, List<? extends Object> list) {
        Map<String, Integer> r = new HashMap<>();
        r.put("count", 0);
        list.stream().forEach(v -> {
            int c = r.get("count");
            c += template.delete(sqlKey, v);
            r.put("count", c);
        });
        return r.get("count");
    }

    @Override
    public <E> List<E> selectListCommon(String tableName, String dataSource, Object conditions) {
        Map<String, Object> param = new HashMap<>();
//        param.put("fields",fields);
        if(conditions == null)
            conditions = new HashMap<>();
        param.put("conditions", conditions);
        param.put("tableName", tableName);
        return template.selectList("mybatis.common.list", param);
    }

    @Override
    public <T> T selectOneCommon(String tableName, String dataSource, Object conditions) {
        Map<String, Object> param = new HashMap<>();
//        param.put("fields",fields);
        if(conditions == null)
            conditions = new HashMap<>();
        param.put("conditions", conditions);
        param.put("tableName", tableName);
        return template.selectOne("mybatis.common.list", param);
    }

    @Override
    public Pager selectListByPageCommon(String tableName, String dataSource, Object conditions, int pageNo, int pageSize) {
        Map<String, Object> param = new HashMap<>();
        if(conditions == null)
            conditions = new HashMap<>();
        param.put("conditions", conditions);
        param.put("tableName", tableName);
        PageHelper.startPage(pageNo, pageSize, true, false, false);
        Pager pager = new Pager();
        Page page = (Page) template.selectList("mybatis.common.list", param);
        pager.setPageNum(page.getPageNum());
        pager.setPageSize(page.getPageSize());
        pager.setTotal(page.getTotal());
        pager.setItems(page.getResult());
        pager.setPages(page.getPages());
        return pager;
    }

    @Override
    public int insertCommon(String tableName, String dataSource, Object fields) {
        Map<String, Object> param = new HashMap<>();
        param.put("fields", fields);
//        Set<String> s =  ((Map<String,Object>)fields).keySet();
//        s.forEach(e->{
//            log.error("==={}:{}===",e,((Map<String,Object>)fields).get(e));
//        });
        param.put("tableName", tableName);
        return template.insert("mybatis.common.insert", param);
    }

    @Override
    public int updateCommon(String tableName, String dataSource, Object fields, Object conditions) {
        Map<String, Object> param = new HashMap<>();
        param.put("fields", fields);
        if(conditions == null)
            conditions = new HashMap<>();
        param.put("conditions", conditions);
        param.put("tableName", tableName);
        return template.insert("mybatis.common.update", param);
    }

    @Override
    public int deleteCommon(String tableName, String dataSource, Object conditions) {
        Map<String, Object> param = new HashMap<>();
        if(conditions == null)
            conditions = new HashMap<>();
        param.put("conditions", conditions);
        param.put("tableName", tableName);
        return template.insert("mybatis.common.delete", param);
    }

    @Override
    public int insertBatchCommon(String tableName, String dataSource, List<?> fields) {
        Map<String, Integer> r = new HashMap<>();
        r.put("count", 0);
        fields.stream().forEach(v -> {
            int c = r.get("count");
            Map<String, Object> param = new HashMap<>();
            param.put("fields", v);
            param.put("tableName", tableName);
            c += template.insert("mybatis.common.insert", param);
            r.put("count", c);
        });
        return r.get("count");
    }

    @Override
    public int updateBatchCommon(String tableName, String dataSource, List<Map<String, Object>> params) {
        Map<String, Integer> r = new HashMap<>();
        r.put("count", 0);
        params.stream().forEach(v -> {
            int c = r.get("count");
            Map<String, Object> param = new HashMap<>();
            param.put("fields", v.get("fields"));
            param.put("conditions", v.get("conditions"));
            param.put("tableName", tableName);
            c += template.insert("mybatis.common.insert", param);
            r.put("count", c);
        });
        return r.get("count");
    }

    @Override
    public int deleteBatchCommon(String tableName, String dataSource, List<?> conditions) {
        Map<String, Integer> r = new HashMap<>();
        r.put("count", 0);
        conditions.stream().forEach(v -> {
            int c = r.get("count");
            Map<String, Object> param = new HashMap<>();
            param.put("conditions", v);
            param.put("tableName", tableName);
            c += template.delete("mybatis.common.delete", param);
            r.put("count", c);
        });
        return r.get("count");
    }

}
