/*    */ package com.zaitu.dao;
/*    */ 
/*    */ import com.zaitu.entity.Bill;
/*    */ import java.util.List;
/*    */ import org.hibernate.Query;
/*    */ import org.hibernate.Session;
/*    */ import org.springframework.stereotype.Repository;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Repository
/*    */ public class BillDao
/*    */   extends BaseDao
/*    */ {
/*    */   public Long findBillByUserId(String userId)
/*    */   {
/* 17 */     String hql = "select count(*) from Bill where userId = ?";
/* 18 */     Query query = getSession().createQuery(hql);
/* 19 */     query.setParameter(0, userId);
/* 20 */     return (Long)query.uniqueResult();
/*    */   }
/*    */   
/*    */   public Long findAllBill()
/*    */   {
/* 25 */     String hql = "select count(*) from Bill";
/* 26 */     Query query = getSession().createQuery(hql);
/* 27 */     return (Long)query.uniqueResult();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public List<Bill> findByUserId(String userId, Integer first, Integer max)
/*    */   {
/* 38 */     String hql = "from Bill where userId = ? order by createTime desc";
/* 39 */     Query query = getSession().createQuery(hql);
/* 40 */     query.setParameter(0, userId);
/* 41 */     query.setFirstResult(first.intValue());
/* 42 */     query.setMaxResults(max.intValue());
/* 43 */     return query.list();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public List<Bill> findAllBill(Integer first, Integer max)
/*    */   {
/* 54 */     String hql = "from Bill order by createTime desc";
/* 55 */     Query query = getSession().createQuery(hql);
/* 56 */     query.setFirstResult(first.intValue());
/* 57 */     query.setMaxResults(max.intValue());
/* 58 */     return query.list();
/*    */   }
/*    */ }


/* Location:              D:\szzaituWorkFolder\IdeaProjects\zaitu-bill\WEB-INF\classes\!\com\zaitu\dao\BillDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */