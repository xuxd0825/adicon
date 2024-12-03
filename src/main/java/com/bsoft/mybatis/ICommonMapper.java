package com.bsoft.mybatis;

import java.util.List;
import java.util.Map;

/**
 * Created by wjtc8 on 2016/8/16.
 */
public interface ICommonMapper {

    <E> List<E> selectList(String sqlKey, String dataSource, Object param);

    <T> T selectOne(String sqlKey, String dataSource, Object param);

//    PageList selectPage(String sqlKey, String dataSource, Object param);

    Pager selectListByPage(String sqlKey, String dataSource, Object param, int pageNo, int pageSize);

    int insert(String sqlKey, String dataSource, Object param);

    int update(String sqlKey, String dataSource, Object param);

    int delete(String sqlKey, String dataSource, Object param);

    int insertBatch(String sqlKey, String dataSource, List<? extends Object> list);

    int updateBatch(String sqlKey, String dataSource, List<? extends Object> list);

    int deleteBatch(String sqlKey, String dataSource, List<? extends Object> list);


    <E> List<E> selectListCommon(String tableName, String dataSource, Object conditions);

    <T> T selectOneCommon(String tableName, String dataSource, Object conditions);

    Pager selectListByPageCommon(String tableName, String dataSource, Object conditions, int pageNo, int pageSize);

    int insertCommon(String tableName, String dataSource, Object fields);

    int updateCommon(String tableName, String dataSource, Object fields, Object conditions);

    int deleteCommon(String tableName, String dataSource, Object conditions);

    int insertBatchCommon(String tableName, String dataSource, List<? extends Object> fields);

    int updateBatchCommon(String tableName, String dataSource, List<Map<String, Object>> params);

    int deleteBatchCommon(String tableName, String dataSource, List<? extends Object> conditions);
}
