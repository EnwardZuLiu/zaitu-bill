/*    */ package com.zaitu.service;
/*    */ 
/*    */ import com.zaitu.dao.BillDao;
/*    */ import com.zaitu.entity.Bill;
/*    */ import java.util.Calendar;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ import org.springframework.transaction.annotation.Transactional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ @Transactional
/*    */ public class BillService
/*    */ {
/*    */   @Autowired
/*    */   private BillDao billDao;
/*    */   
/*    */   public List<Bill> list(Integer first, Integer max)
/*    */   {
/* 23 */     return this.billDao.findAllBill(first, max);
/*    */   }
/*    */   
/*    */   public Long getCountAll() {
/* 27 */     return this.billDao.findAllBill();
/*    */   }
/*    */   
/*    */   public List<Bill> findBillByUserId(String userId, Integer first, Integer max) {
/* 31 */     return this.billDao.findByUserId(userId, first, max);
/*    */   }
/*    */   
/*    */   public Long getCountByUserId(String userId) {
/* 35 */     return this.billDao.findBillByUserId(userId);
/*    */   }
/*    */   
/*    */   public void save(Bill bill) {
/* 39 */     this.billDao.save(bill);
/*    */   }
/*    */   
/*    */   public void checkReceivables(String billId) {
/* 43 */     Bill bill = (Bill)this.billDao.get(Bill.class, billId);
/* 44 */     bill.setReceivablesTime(Calendar.getInstance());
/* 45 */     save(bill);
/*    */   }
/*    */   
/*    */   public void checkPayment(String billId) {
/* 49 */     Bill bill = (Bill)this.billDao.get(Bill.class, billId);
/* 50 */     bill.setPaymentTime(Calendar.getInstance());
/* 51 */     save(bill);
/*    */   }
/*    */   
/*    */   public void update(Bill bill) {
/* 55 */     this.billDao.update(bill);
/*    */   }
/*    */   
/*    */   public void delete(String billId) {
/* 59 */     Bill bill = (Bill)this.billDao.get(Bill.class, billId);
/* 60 */     this.billDao.delete(bill);
/*    */   }
/*    */ }


/* Location:              D:\szzaituWorkFolder\IdeaProjects\zaitu-bill\WEB-INF\classes\!\com\zaitu\service\BillService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */