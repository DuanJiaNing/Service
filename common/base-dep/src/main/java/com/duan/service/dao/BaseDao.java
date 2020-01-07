package com.duan.service.dao;

import java.util.List;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
public interface BaseDao<T> {

    /**
     * 根据 id 查找数据
     *
     * @param id id
     * @return 记录
     */
    T findById(int id);

    /**
     * 根据 t 查找数据
     *
     * @param t entity
     * @return 记录
     */
    List<T> find(T t);

    /**
     * 更新数据
     *
     * @param t 数据
     * @return 操作影响的行数
     */
    int update(T t);

    /**
     * 根据id删除数据
     *
     * @param id id
     * @return 操作影响的行数
     */
    int delete(Integer id);

    /**
     * 新增数据
     *
     * @param t 数据
     * @return 操作影响的行数
     */
    int insert(T t);

}
