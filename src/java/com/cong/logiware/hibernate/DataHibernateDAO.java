package com.cong.logiware.hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

/**
 *
 * @author Prakash S
 * @param <T>
 */
public class DataHibernateDAO<T extends Domain> extends IDataHibernateDAO implements Serializable {

    private static Logger log = Logger.getLogger(DataHibernateDAO.class);
    private Class<T> clazz;

    public DataHibernateDAO() {
    }

    public DataHibernateDAO(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Criteria createCriteria(Class clazz) {
        return getCurrentSession().createCriteria(clazz);
    }

    public List findAll() {
        log.debug("finding all " + clazz + " instance");
        try {
            Criteria criteria = getCurrentSession().createCriteria(clazz);
            return criteria.list();
        } catch (RuntimeException re) {
            log.error("findAll is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public T findById(Serializable id) {
        log.debug("finding " + clazz.getSimpleName() + " instance by id " + id);
        T t = null;
        try {
            Object o = getCurrentSession().get(clazz.getName(), id);
            if (o != null) {
                t = (T) o;
            }
            return t;
        } catch (RuntimeException re) {
            log.error("find by id failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public List executeQuery(String queryString) {
        log.debug("query : " + queryString);
        try {
            Query query = getCurrentSession().createQuery(queryString);
            return query.list();
        } catch (RuntimeException re) {
            log.error("query is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public List executeQueryWithParameter(String queryString, String parameterName, String parameterValue) {
        log.debug("query : " + queryString);
        try {
            Query query = getCurrentSession().createQuery(queryString);
            query.setParameter(parameterName, parameterValue);
            return query.list();
        } catch (RuntimeException re) {
            log.error("query is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public List executeQueryWithParameterList(String queryString, String parameterName, Collection parameterList) {
        log.debug("query : " + queryString);
        try {
            Query query = getCurrentSession().createQuery(queryString);
            query.setParameterList(parameterName, parameterList);
            return query.list();
        } catch (RuntimeException re) {
            log.error("query is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public List executeSQLQuery(String queryString) {
        log.debug("query : " + queryString);
        try {
            SQLQuery query = getCurrentSession().createSQLQuery(queryString);
            return query.list();
        } catch (RuntimeException re) {
            log.error("query is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public List executeSQLQueryWithTransform(String queryString, Class model) {
        log.debug("query : " + queryString);
        try {
            return getCurrentSession().createSQLQuery(queryString).setResultTransformer(Transformers.aliasToBean(model)).list();
        } catch (RuntimeException re) {
            log.error("query is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public List executeSQLQueryWithParameter(String queryString, String parameterName, String parameterValue) {
        log.debug("query : " + queryString);
        try {
            SQLQuery query = getCurrentSession().createSQLQuery(queryString);
            query.setParameter(parameterName, parameterValue);
            return query.list();
        } catch (RuntimeException re) {
            log.error("query is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public List executeSQLQueryWithParameterList(String queryString, String parameterName, Collection parameterList) {
        log.debug("query : " + queryString);
        try {
            SQLQuery query = getCurrentSession().createSQLQuery(queryString);
            query.setParameterList(parameterName, parameterList);
            return query.list();
        } catch (RuntimeException re) {
            log.error("query is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public SQLQuery createSQLQuery(String queryString) {
        return getCurrentSession().createSQLQuery(queryString);
    }

    public Query createQuery(String queryString) {
        return getCurrentSession().createQuery(queryString);
    }

    public T executeUniqueQuery(String queryString) {
        log.debug("query : " + queryString);
        try {
            Query query = getCurrentSession().createQuery(queryString);
            Object o = query.uniqueResult();
            if (o != null) {
                return (T) o;
            } else {
                return null;
            }
        } catch (RuntimeException re) {
            log.error("query is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public Object executeUniqueSQLQuery(String queryString) {
        log.debug("query : " + queryString);
        try {
            SQLQuery query = getCurrentSession().createSQLQuery(queryString);
            Object o = query.uniqueResult();
            if (o != null) {
                return o;
            } else {
                return null;
            }
        } catch (RuntimeException re) {
            log.error("query is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public Object executeUniqueSQLQueryWithParameter(String queryString, String parameterName, String parameterValue) {
        log.debug("query : " + queryString);
        try {
            SQLQuery query = getCurrentSession().createSQLQuery(queryString);
            query.setParameter(parameterName, parameterValue);
            Object o = query.uniqueResult();
            if (o != null) {
                return o;
            } else {
                return null;
            }
        } catch (RuntimeException re) {
            log.error("query is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    public List find(List<Property> Properties, LogicalOperator lo, String appendAtEnd) {
        try {
            StringBuilder buffer = new StringBuilder("FROM ");
            buffer.append(clazz.getSimpleName());
            //If the QueryOpertor is LIKE then prepand and append % to property
            buffer.append(generateCondition(Properties, lo));

            if (appendAtEnd != null) {
                buffer.append(appendAtEnd);
            }
//        System.out.println("HQL : " + buffer);
            Query queryObject = getCurrentSession().createQuery(buffer.toString());
            for (Property property : Properties) {
                String ext = (property.getQueryOperator() == QueryOperator.LIKE || property.getQueryOperator() == QueryOperator.NOT_LIKE) ? "%" : "";
                Object value = property.getValue();
                if (value instanceof Boolean) {
                    queryObject.setBoolean(property.getProxy(), (Boolean) value);
                } else if (value instanceof Date) {
                    queryObject.setTimestamp(property.getProxy(), (Date) value);
                } else if (value instanceof Integer) {
                    queryObject.setInteger(property.getProxy(), (Integer) value);
                } else if (value instanceof Double) {
                    queryObject.setDouble(property.getProxy(), (Double) value);
                } else if (value instanceof Long) {
                    queryObject.setLong(property.getProxy(), (Long) value);
                } else if (value instanceof Float) {
                    queryObject.setFloat(property.getProxy(), (Float) value);
                } else if (value instanceof String && value.equals("S,")) {
                    queryObject.setParameter(property.getProxy(), value + ext);
                } else if (value instanceof String) {
                    queryObject.setParameter(property.getProxy(), ext + value + ext);
                } else {
                    queryObject.setParameter(property.getProxy(), value);
                }
            }
//        System.out.println("queryObject : " + queryObject.getQueryString());
            List list = queryObject.list();
            return (List<T>) list;
        } catch (RuntimeException re) {
            log.error("query is failed", re);
            throw re;
        } finally {
            closeSession();
        }
    }

    private StringBuilder generateCondition(List<Property> Properties, LogicalOperator lo) {
        StringBuilder buffer = new StringBuilder();
        List<Property> removeList = new ArrayList<Property>();
        boolean isFirst = true;
        for (Property property : Properties) {
            Object value = property.getValue();
            String operatorOrWhere = null;
            if (isFirst) {
                operatorOrWhere = " WHERE ";
                isFirst = false;
            } else {
                operatorOrWhere = " " + lo.toString() + " ";
            }
            String stringProperty = property.getName();
            if (value == null) {
                buffer.append(operatorOrWhere).append(stringProperty).append(" is null ");
                removeList.add(property);
            } else {
                // for accepting integer, double and other type of fields.
                buffer.append(operatorOrWhere).append(" ").append(stringProperty).append(" ").append(property.getQueryOperator()).append(" :").append(property.getProxy());
            }
        }
        Properties.removeAll(removeList);
        return buffer;
    }

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Class<T> getClazz() {
        return clazz;
    }

}
