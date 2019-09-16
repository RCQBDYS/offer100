package cn.itsource.basic.service.imp;

import cn.itsource.basic.query.BaseQuery;
import cn.itsource.basic.service.IBaseService;
import cn.itsource.basic.mapper.BaseMapper;
import cn.itsource.util.PageList;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {
    //由于core层没有集成spring，所以无法实现依赖注入
    //添加方法
    protected abstract BaseMapper<T> getMapper();
    public void add(T t) {
        getMapper().insert(t);
    }
    //修改方法
    public void update(T t) {
        getMapper().updateByPrimaryKey(t);
    }
    //删除方法
    public void delete(Serializable id) {
        getMapper().deleteByPrimaryKey(id);
    }
    //查询一个
    public T getOne(Serializable id) {
        return getMapper().selectByPrimaryKey(id);
    }
    //查询所有
    public List<T> getAll() {
        return getMapper().selectAll();
    }
    //分页
    public PageList<T> getByQuery(BaseQuery query) {
        //创建封装数据的PageList对象
        PageList<T> pageList = new PageList<T>();
        //设置分页条件
       /* *//*Page page = PageHelper.startPage(query.getPage(),query.getRows());
        //查询当前页的数据
        List<T> rows = getMapper().selectByQuery(query);
        //获取总条目数
        long total = page.getTotal();*//*
        //将数据封装到PageList对象中返回
        pageList.setRows(rows);
        pageList.setTotal(total);*/
        return pageList;
    }

}
