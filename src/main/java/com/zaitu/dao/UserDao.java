/*    */ package com.zaitu.dao;
/*    */ 
/*    */ import com.zaitu.entity.User;
/*    */ import org.hibernate.Query;
/*    */ import org.hibernate.Session;
/*    */ import org.springframework.stereotype.Repository;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Repository
/*    */ public class UserDao
/*    */   extends BaseDao
/*    */ {
/*    */   public User login(String userName, String password)
/*    */   {
/* 20 */     String hql = "from User where userName = ? and password = ?";
/* 21 */     Query query = getSession().createQuery(hql);
/* 22 */     query.setParameter(0, userName);
/* 23 */     query.setParameter(1, password);
/* 24 */     return (User)query.uniqueResult();
/*    */   }
/*    */ }


/* Location:              D:\szzaituWorkFolder\IdeaProjects\zaitu-bill\WEB-INF\classes\!\com\zaitu\dao\UserDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */