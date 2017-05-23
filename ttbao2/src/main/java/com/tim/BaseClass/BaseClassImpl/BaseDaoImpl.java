package com.tim.BaseClass.BaseClassImpl;

import com.tim.BaseClass.BaseDao;
import com.tim.page.Page;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

/**
 * Created by timhuo on 2017/5/18.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    private Class<T> classz;

    public BaseDaoImpl() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        this.classz = (Class<T>) pt.getActualTypeArguments()[0];
    }

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Resource
    private SessionFactory sessionFactory;

    public Boolean insert(T obj) {
        try {
            getSession().save(obj);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
        return true;
    }

    public Boolean delete(T obj) {
        try {
            getSession().delete(obj);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
        return true;
    }

    public Boolean update(T obj) {
        try {
            getSession().update(obj);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
        return true;
    }

    public T findById(Serializable id) {
        T t = getSession().get(classz, id);
        if (null == t) {
            return null;
        } else {
            return t;

        }
    }

    public List getByIds(Long[] ids) {
        if (ids == null || ids.length == 0) {
            return Collections.EMPTY_LIST;
        }

        String hql = " FROM " + classz.getSimpleName() + " WHERE id IN(:ids)";
        return getSession().createQuery(hql).setParameterList("ids", ids).list();
    }

    public List findAll() {
        String hql = " FROM " + classz.getSimpleName();
        return getSession().createQuery(hql).list();
    }

    public int getTotalCount() {
        Session session=getSession();
        String hqlcount="select count(*) from "+classz.getSimpleName();
        Query querycount=session.createQuery(hqlcount);
        Integer totalCount=Integer.parseInt(querycount.uniqueResult().toString());
        return totalCount;
    }

    public List<T> findPage(Page page) {
        Session session=getSession();
        String hql="from "+classz.getSimpleName();
        Query querypage=session.createQuery(hql);
        querypage.setMaxResults(page.getPagesize());
        querypage.setFirstResult(page.getStartrow());
        List<T> list=querypage.list();
        return list;
    }
}
