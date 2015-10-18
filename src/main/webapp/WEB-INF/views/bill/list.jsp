<%--
  Created by IntelliJ IDEA.
  User: enward
  Date: 2015/7/19
  Time: 0:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device,initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Access-Control-Allow-Origin" content="*">
    <title>在途-做单系统</title>
    <meta name="keywords" content="在途,深圳在途,深圳在途电子商务有限公司,机票代理,在线旅游,人人都是机票代理,国际机票预订,预订国内机票,
    出游信息咨询,保险业务">
    <meta name="description" content="深圳在途电子商务有限公司成立于2014-12-31日，公司主营产品为国际机票预订，国际酒店预订和保险业务，
    同时可以提供预订国内机票，出游信息咨询、合作伙伴网站建设、推广及维护等服务，公 司坚持“服务为主，客户至上，互助互利”的理念，秉承“最优
    惠的价格、最好的服务”的品牌观念， 立志于打造旅游行业最具有竞争力的出游解决方案 服务商。">

    <!--[if lt IE 9]>
    <script src="http://apps.bdimg.com/libs/html5shiv/r29/html5.min.js"></script>
    <script src="http://apps.bdimg.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>



<%@ include file="../common/top.jsp"%>

<div class="container">
    <div class="row">

        <ul class="nav nav-pills">
            <li role="presentation"><a type="button" data-toggle="modal" data-target="#myModal">增加</a></li>
            <%--<li role="presentation"><a href="#">Profile</a></li>
            <li role="presentation"><a href="#">Messages</a></li>--%>
        </ul>
        <p></p>
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <tr>
                        <td>订单号</td>
                        <td>买价</td>
                        <td>卖价</td>
                        <td>供应商</td>
                        <td>客户</td>
                        <%--<td>创建时间</td>--%>
                        <td>收款时间</td>
                        <td>付款时间</td>
                        <%--<td>审核人</td>--%>
                        <td>备注</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="b" items="${list}" varStatus="i">
                        <tr>
                            <td>${ b.billId } </td>
                            <td>${ b.buyPrice }</td>
                            <td>${ b.sellingPrice }</td>
                            <td>${b.supplier }</td>
                            <td>${b.customer}</td>
                            <%--<td><fmt:formatDate value="${b.createTime.getTime() }" pattern="yyyy-MM-dd HH:mm:ss"/></td>--%>
                            <c:if test="${b.receivablesTime eq null}">
                                <td>未收款 </td>
                            </c:if>
                            <c:if test="${b.receivablesTime ne null}">
                                <td><fmt:formatDate value="${b.receivablesTime.getTime() }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                            </c:if>
                            <c:if test="${b.paymentTime eq null}">
                                <td>未付款</td>
                            </c:if>
                            <c:if test="${b.paymentTime ne null}">
                                <td><fmt:formatDate value="${b.receivablesTime.getTime() }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                            </c:if>
                            <%--<td>${b.auditor }</td>--%>
                            <td>${b.remarks }</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <nav>
            <ul class="pagination">
                <c:if test="${page.pagenow > 1}">
                    <li>
                        <a href="<%=request.getContextPath()%>/bill/bill/finance/list/${page.pagenow - 1 }" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                </c:if>
                <c:if test="${page.pagenow > 2}">
                    <li>
                        <a href="<%=request.getContextPath()%>/bill/bill/finance/list/${page.pagenow - 2 }">
                            <span aria-hidden="true">${page.pagenow - 2 }</span>
                        </a>
                    </li>
                </c:if>
                <c:if test="${page.pagenow > 1}">
                    <li>
                        <a href="<%=request.getContextPath()%>/bill/bill/finance/list/${page.pagenow - 1 }">
                            <span aria-hidden="true">${page.pagenow - 1 }</span>
                        </a>
                    </li>
                </c:if>

                <li><a class="active" href="javascript:void(0);">${page.pagenow}</a></li>

                <c:if test="${page.totalpage - page.pagenow >= 1 }">
                    <li>
                        <a href="<%=request.getContextPath()%>/bill/bill/finance/list/${page.pagenow + 1 }">
                            <span aria-hidden="true">${page.pagenow + 1 }</span>
                        </a>
                    </li>
                </c:if>
                <c:if test="${page.totalpage - page.pagenow >= 2 }">
                    <li>
                        <a href="<%=request.getContextPath()%>/bill/bill/finance/list/${page.pagenow + 2 }">
                            <span aria-hidden="true">${page.pagenow + 2 }</span>
                        </a>
                    </li>
                </c:if>
                <c:if test="${page.pagenow != page.totalpage}">
                    <li>
                        <a href="<%=request.getContextPath()%>/bill/bill/finance/list/${page.pagenow + 1 }" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </c:if>
            </ul>
        </nav>
    </div>
</div>


<%@ include file="../common/footer.jsp"%>



<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">添加</h4>
            </div>
            <div class="modal-body">
                <div class="row">
                    <form action="<%=request.getContextPath()%>/bill/bill/save" name="f1" class="form-horizontal" method="post">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">订单号</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="billId" name="billId" placeholder="2015-0906-102629">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">买价</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="buyPrice" name="buyPrice" placeholder="买价">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">卖价</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="sellingPrice" id="sellingPrice" placeholder="卖价">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">供应商</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="supplier" id="supplier" placeholder="供应商">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">客户</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="customer" name="customer" placeholder="客户">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">备注</label>
                            <div class="col-sm-10">
                                <textarea name="remarks" id="remarks" style="width: 490px; height: 75px;"  placeholder="请输入备注信息"></textarea>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" onclick="billPage.addBill()" class="btn btn-primary">提交</button>
            </div>
        </div>
    </div>
</div>
</body>
<script src="http://apps.bdimg.com/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="application/javascript">
    (function(){
        // 金额的正则表达式  /^([1-9][0-9]*)?[0-9]\.[0-9]{2}$/
        var billPage = window.billPage = window.billPage || {};

        billPage.addBill = function(){
            var money = /^([1-9][0-9]*)?[0-9]\.[0-9]{2}$/;
            var buyPrice = $("#buyPrice").val();
            var sellingPrice = $("#sellingPrice").val();
            if(!money.test(buyPrice)){
                alert("请按如下格式输入金额：100.00");
                $("#buyPrice").val("");
                return;
            }
            if(!money.test(sellingPrice)){
                alert("请按如下格式输入金额：100.00");
                $("#sellingPrice").val("");
                return;
            }
            if($("#supplier").val().trim() == ""){
                alert("供应商不准许为空！");
                $("#supplier").val("");
                return;
            }
            if($("#customer").val().trim() == ""){
                alert("客户不准许为空！");
                $("#customer").val("");
                return;
            }

            document.f1.submit();
        };

    })();
</script>
</html>
