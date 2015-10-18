/*    */ package com.zaitu.entity;
/*    */ 
/*    */ 
/*    */ public class Page
/*    */ {
/*    */   private Long totalrecords;
/*    */   
/*    */   private int pagenow;
/*    */   
/*    */   private int row;
/*    */   
/*    */ 
/*    */   public int getPagenow()
/*    */   {
/* 15 */     return this.pagenow;
/*    */   }
/*    */   
/*    */   public void setPagenow(int pagenow) {
/* 19 */     this.pagenow = pagenow;
/*    */   }
/*    */   
/*    */   public int getTotalpage() {
/* 23 */     if (this.totalrecords.longValue() == 0L) {
/* 24 */       return 1;
/*    */     }
/* 26 */     return (int)((this.totalrecords.longValue() + this.row - 1L) / this.row);
/*    */   }
/*    */   
/*    */   public int getRow() {
/* 30 */     return this.row;
/*    */   }
/*    */   
/*    */   public void setRow(int row) {
/* 34 */     this.row = row;
/*    */   }
/*    */   
/*    */   public Long getTotalrecords() {
/* 38 */     return this.totalrecords;
/*    */   }
/*    */   
/*    */   public void setTotalrecords(Long long1) {
/* 42 */     this.totalrecords = long1;
/*    */   }
/*    */ }


/* Location:              D:\szzaituWorkFolder\IdeaProjects\zaitu-bill\WEB-INF\classes\!\com\zaitu\entity\Page.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */