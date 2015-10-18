 package com.zaitu.entity;

 import java.util.Calendar;
 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.Id;
 import org.hibernate.annotations.Cache;
 import org.hibernate.annotations.CacheConcurrencyStrategy;
 import org.hibernate.annotations.GenericGenerator;

 @Entity
 @javax.persistence.Table(name="bill")
 @Cache(usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
 public class Bill
 {
   @Id
   @Column(name="id")
   @GenericGenerator(name="systemUUID", strategy="uuid")
   @GeneratedValue(generator="systemUUID")
   private String id;
   @Column(name="bill_id")
   private String billId;
   @Column(name="user_id")
   private String userId;
   @Column(name="buy_price")
   private Double buyPrice;
   @Column(name="selling_price")
   private Double sellingPrice;
   @Column(name="customer")
   private String customer;
   @Column(name="supplier")
   private String supplier;
   @Column(name="create_time")
   private Calendar createTime;
   @Column(name="receivables_time")
   private Calendar receivablesTime;
   @Column(name="payment_time")
   private Calendar paymentTime;
   @Column(name="audit_time")
   private Calendar auditTime;
   @Column(name="auditor")
   private String auditor;
   @Column(name="remarks")
   private String remarks;

   public String getId()
   {
/*  49 */     return this.id;
   }

   public void setId(String id) {
/*  53 */     this.id = id;
   }

   public String getBillId() {
/*  57 */     return this.billId;
   }

   public void setBillId(String billId) {
/*  61 */     this.billId = billId;
   }

   public String getUserId() {
/*  65 */     return this.userId;
   }

   public void setUserId(String userId) {
/*  69 */     this.userId = userId;
   }

   public Double getBuyPrice() {
/*  73 */     return this.buyPrice;
   }

   public void setBuyPrice(Double buyPrice) {
/*  77 */     this.buyPrice = buyPrice;
   }

   public Double getSellingPrice() {
/*  81 */     return this.sellingPrice;
   }

   public void setSellingPrice(Double sellingPrice) {
/*  85 */     this.sellingPrice = sellingPrice;
   }

   public String getCustomer() {
/*  89 */     return this.customer;
   }

   public void setCustomer(String customer) {
/*  93 */     this.customer = customer;
   }

   public String getSupplier() {
/*  97 */     return this.supplier;
   }

   public void setSupplier(String supplier) {
/* 101 */     this.supplier = supplier;
   }

   public Calendar getCreateTime() {
/* 105 */     return this.createTime;
   }

   public void setCreateTime(Calendar createTime) {
/* 109 */     this.createTime = createTime;
   }

   public Calendar getReceivablesTime() {
/* 113 */     return this.receivablesTime;
   }

   public void setReceivablesTime(Calendar receivablesTime) {
/* 117 */     this.receivablesTime = receivablesTime;
   }

   public Calendar getPaymentTime() {
/* 121 */     return this.paymentTime;
   }

   public void setPaymentTime(Calendar paymentTime) {
/* 125 */     this.paymentTime = paymentTime;
   }

   public Calendar getAuditTime() {
/* 129 */     return this.auditTime;
   }

   public void setAuditTime(Calendar auditTime) {
/* 133 */     this.auditTime = auditTime;
   }

   public String getAuditor() {
/* 137 */     return this.auditor;
   }

   public void setAuditor(String auditor) {
/* 141 */     this.auditor = auditor;
   }

   public String getRemarks() {
/* 145 */     return this.remarks;
   }

   public void setRemarks(String remarks) {
/* 149 */     this.remarks = remarks;
   }
 }


/* Location:              D:\szzaituWorkFolder\IdeaProjects\zaitu-bill\WEB-INF\classes\!\com\zaitu\entity\Bill.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */