 package com.zaitu.dao;

 import java.io.Serializable;
 import java.util.List;
 import org.hibernate.Query;
 import org.hibernate.Session;
 import org.hibernate.SessionFactory;
 import org.springframework.beans.factory.annotation.Autowired;






 public class BaseDao
 {
   private SessionFactory sessionFactory;

   @Autowired(required=true)
   public void setSessionFactory(SessionFactory sessionFactory)
   {
/*  22 */     this.sessionFactory = sessionFactory;
   }

   public Session getSession() {
/*  26 */     return this.sessionFactory.getCurrentSession();
   }








   public <T> T get(Class<T> entityClass, Serializable id)
   {
/*  38 */     return (T)getSession().get(entityClass, id);
   }







   public <T> List<T> getAll(Class<T> entityClass)
   {
/*  49 */     String hql = "from " + entityClass.getSimpleName();
/*  50 */     Query query = getSession().createQuery(hql);
/*  51 */     return query.list();
   }

   public <T> void save(T entity) {
/*  55 */     getSession().save(entity);
   }

   public <T> void delete(T entity) {
/*  59 */     getSession().delete(entity);
   }

   public <T> void update(T entity) {
/*  63 */     getSession().update(entity);
   }

   public <T> void saveOrUpdate(T entity) {
/*  67 */     getSession().saveOrUpdate(entity);
   }







   public <T> void merge(T entity)
   {
/*  78 */     getSession().merge(entity);
   }









   public <T> void batchSaveOrUpdate(List<T> list, int max)
   {
/*  91 */     max = max <= 0 ? 100 : max;
/*  92 */     Session session = this.sessionFactory.getCurrentSession();
/*  93 */     for (int i = 0; i < list.size(); i++) {
/*  94 */       session.saveOrUpdate(list.get(i));
/*  95 */       if (i % max == 0) {
/*  96 */         session.flush();
/*  97 */         session.clear();
       }
     }
   }








   public <T> void batchDelete(List<T> list, int max)
   {
/* 111 */     max = max <= 0 ? 100 : max;
/* 112 */     Session session = this.sessionFactory.getCurrentSession();
/* 113 */     for (int i = 0; i < list.size(); i++) {
/* 114 */       session.delete(list.get(i));
/* 115 */       if (i % max == 0) {
/* 116 */         session.flush();
/* 117 */         session.clear();
       }
     }
   }







   public <T> void batchUpdate(List<T> list, int max)
   {
/* 130 */     max = max <= 0 ? 100 : max;
/* 131 */     Session session = this.sessionFactory.getCurrentSession();
/* 132 */     for (int i = 0; i < list.size(); i++) {
/* 133 */       session.update(list.get(i));
/* 134 */       if (i % max == 0) {
/* 135 */         session.flush();
/* 136 */         session.clear();
       }
     }
   }
 }


/* Location:              D:\szzaituWorkFolder\IdeaProjects\zaitu-bill\WEB-INF\classes\!\com\zaitu\dao\BaseDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */