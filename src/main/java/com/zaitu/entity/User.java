/*    */ package com.zaitu.entity;
/*    */ 
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.Id;
/*    */ import org.hibernate.annotations.Cache;
/*    */ import org.hibernate.annotations.CacheConcurrencyStrategy;
/*    */ import org.hibernate.annotations.GenericGenerator;
/*    */ 
/*    */ @Entity
/*    */ @javax.persistence.Table(name="user")
/*    */ @Cache(usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
/*    */ public class User
/*    */ {
/*    */   @Id
/*    */   @Column(name="id")
/*    */   @GenericGenerator(name="systemUUID", strategy="uuid")
/*    */   @GeneratedValue(generator="systemUUID")
/*    */   private String id;
/*    */   @Column(name="user_name")
/*    */   private String userName;
/*    */   @Column(name="password")
/*    */   private String password;
/*    */   @Column(name="email")
/*    */   private String email;
/*    */   @Column(name="phone")
/*    */   private String phone;
/*    */   @Column(name="real_name")
/*    */   private String realName;
/*    */   @Column(name="role_name")
/*    */   private String roleName;
/*    */   
/*    */   public String getId()
/*    */   {
/* 36 */     return this.id;
/*    */   }
/*    */   
/*    */   public void setId(String id) {
/* 40 */     this.id = id;
/*    */   }
/*    */   
/*    */   public String getUserName() {
/* 44 */     return this.userName;
/*    */   }
/*    */   
/*    */   public void setUserName(String userName) {
/* 48 */     this.userName = userName;
/*    */   }
/*    */   
/*    */   public String getPassword() {
/* 52 */     return this.password;
/*    */   }
/*    */   
/*    */   public void setPassword(String password) {
/* 56 */     this.password = password;
/*    */   }
/*    */   
/*    */   public String getEmail() {
/* 60 */     return this.email;
/*    */   }
/*    */   
/*    */   public void setEmail(String email) {
/* 64 */     this.email = email;
/*    */   }
/*    */   
/*    */   public String getPhone() {
/* 68 */     return this.phone;
/*    */   }
/*    */   
/*    */   public void setPhone(String phone) {
/* 72 */     this.phone = phone;
/*    */   }
/*    */   
/*    */   public String getRealName() {
/* 76 */     return this.realName;
/*    */   }
/*    */   
/*    */   public void setRealName(String realName) {
/* 80 */     this.realName = realName;
/*    */   }
/*    */   
/*    */   public String getRoleName() {
/* 84 */     return this.roleName;
/*    */   }
/*    */   
/*    */   public void setRoleName(String roleName) {
/* 88 */     this.roleName = roleName;
/*    */   }
/*    */ }


/* Location:              D:\szzaituWorkFolder\IdeaProjects\zaitu-bill\WEB-INF\classes\!\com\zaitu\entity\User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */