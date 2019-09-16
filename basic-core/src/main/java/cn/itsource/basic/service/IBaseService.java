package cn.itsource.basic.service;

import cn.itsource.basic.query.BaseQuery;
import cn.itsource.util.PageList;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangshen
 * @date 2019/9/16 21:21
 * 主要功能说明：
 */
public interface IBaseService<T> {

    public void add(T t);
    public void update(T t);
    public void delete(Serializable id);
    public T getOne(Serializable id);
    public List<T> getAll();
    public PageList<T> getByQuery(BaseQuery query);

}
