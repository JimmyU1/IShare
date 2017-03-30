package com.ljn.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Jimmy on 2017/3/3.
 */
public interface BaseDao<T> {
    /**
     * 将对象存储到数据库中
     * @param o 存储对象
     * @return 主键ID
     */
    public Serializable save(T o);

    /**
     * 从数据库中删除对象
     * @param o 要删除的对象
     */
    public void delete(T o);

    /**
     * 从数据库中更新对象
     * @param o 要更新的对象
     */
    public void update(T o);

    /**
     * 更新或存储对象
     * @param o 将被更新或存储的对象
     */
    public void saveOrUpdate(T o);

    /**
     * 获取对象
     * @param hql HQL查询语句
     * @return 查询到的对象实例
     */
    public T get(String hql);

    /**
     * 根据条件参数获取对象
     * @param hql HQL查询语句
     * @param params 参数列表
     * @return 查询到的对象实例
     */
    public T get(String hql, Map<String, Object> params);

    /**
     * 查找对象
     * @param hql HQL查询语句
     * @return 对象列表
     */
    public List<T> find(String hql);

    /**
     * 通过条件参数查找对象
     * @param hql HQL查询语句
     * @param params 参数列表
     * @return 对象列表
     */
    public List<T> find(String hql, Map<String, Object> params);

    /**
     * 分页查找
     * @param hql HQL查询语句
     * @param page 页数
     * @param rows 行数
     * @return 对象列表
     */
    public List<T> find(String hql, int page, int rows);

    /**
     * 通过条件参数进行分页查找
     * @param hql HQL查询语句
     * @param params 参数列表
     * @param page 页数
     * @param rows 行数
     * @return 对象列表
     */
    public List<T> find(String hql, Map<String, Object> params, int page, int rows);

    /**
     * 计数查询
     * @param hql HQL查询语句
     * @return 查询到的结果数
     */
    public Long count(String hql);

    /**
     * 根据参数进行计数查询
     * @param hql HQL查询语句
     * @param params 参数列表
     * @return 查询到的结果数
     */
    public Long count(String hql, Map<String, Object> params);

    /**
     * 通过ID获取对象实例
     * @param c 实例对象类型
     * @param id 对象实例ID
     * @return 实例对象
     */
    public T get(Class<T> c, Serializable id);

    /**
     * 执行HQL查询语句
     * @param hql HQL查询语句
     * @return 受影响的行号
     */
    public int executeHql(String hql);
}
