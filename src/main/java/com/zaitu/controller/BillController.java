package com.zaitu.controller;

import com.zaitu.entity.Bill;
 import com.zaitu.entity.Page;
 import com.zaitu.entity.User;
 import com.zaitu.service.BillService;
 import java.text.SimpleDateFormat;
 import java.util.Calendar;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;

import com.zaitu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.RequestMapping;






@Controller

@RequestMapping({"/bill/bill"})
 public class BillController
 {

    @Autowired
 private BillService billService;
     @Autowired
     private UserService userService;



    @RequestMapping(value = {"/finance/list/{curPage}"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
 public String list(@PathVariable Integer curPage, Model model)
 {
        Integer first = Integer.valueOf((curPage.intValue() - 1) * 40);
        Integer max = Integer.valueOf(40);
        Page page = new Page();
        page.setRow(40);
        page.setPagenow(curPage.intValue());
        page.setTotalrecords(this.billService.getCountAll());
        List<Bill> list = this.billService.list(first, max);
        List<User> users = userService.findAll();
        model.addAttribute("users",users);
        model.addAttribute("list", list);
        model.addAttribute("page", page);
        return "/bill/financeList";
    }



    @RequestMapping(value = {"/ceo/list/{curPage}"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
 public String ceolist(@PathVariable Integer curPage, Model model)
 {
        Integer first = Integer.valueOf((curPage.intValue() - 1) * 40);
        Integer max = Integer.valueOf(40);
        Page page = new Page();
        page.setRow(40);
        page.setPagenow(curPage.intValue());

        page.setTotalrecords(this.billService.getCountAll());

        List<Bill> list = this.billService.list(first, max);

     List<User> users = userService.findAll();
     model.addAttribute("users",users);

        model.addAttribute("list", list);
        model.addAttribute("page", page);
        return "/bill/ceoList";
    }







    @RequestMapping(value = {"/list/{curPage}"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
 public String findByUserId(@PathVariable Integer curPage, Model model, HttpServletRequest request)
 {
        String userId = ((User) request.getSession().getAttribute("user")).getId();
        Integer first = Integer.valueOf((curPage.intValue() - 1) * 20);
        Integer max = Integer.valueOf(20);
        Page page = new Page();
        page.setRow(20);
        page.setPagenow(curPage.intValue());
        page.setTotalrecords(this.billService.getCountByUserId(userId));
        List<Bill> list = this.billService.findBillByUserId(userId, first, max);
        model.addAttribute("list", list);
        model.addAttribute("page", page);
        return "/bill/list";
    }








    @RequestMapping({"/save"})
 public String saveBill(Bill bill, HttpServletRequest request)
 {
        if (bill.getBillId() == null || bill.getBillId().equals("") || bill.getBillId().trim().equals("")) {
            Calendar cale = Calendar.getInstance();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MMdd-HHmmss");
            bill.setBillId(df.format(cale.getTime()));
        }
        bill.setCreateTime(Calendar.getInstance());
        bill.setUserId(((User) request.getSession().getAttribute("user")).getId());
        this.billService.save(bill);
        return "redirect:/bill/bill/list/1";
    }



    @RequestMapping({"/checkReceivables/{billId}"})
 public String checkReceivables(@PathVariable String billId) {
        this.billService.checkReceivables(billId);
        return "redirect:/bill/bill/finance/list/1";
    }



    @RequestMapping({"/checkPayment/{billId}"})
 public String checkPayment(@PathVariable String billId) {
        this.billService.checkPayment(billId);
        return "redirect:/bill/bill/finance/list/1";

    }



    @RequestMapping({"/update"})
 public String update(Bill bill) {
        this.billService.update(bill);
        return "redirect:/bill/bill/finance/list/1";

    }



    @RequestMapping({"/delete/{billId}"})
 public String delete(@PathVariable String billId) {
        this.billService.delete(billId);
        return "redirect:/bill/bill/finance/list/1";
    }
}
