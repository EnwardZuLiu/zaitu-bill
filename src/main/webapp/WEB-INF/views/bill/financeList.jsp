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
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <tr>
                        <td>订单号</td>
                        <td>销售员</td>
                        <td>买价</td>
                        <td>卖价</td>
                        <td>供应商</td>
                        <td>客户</td>
                        <%--<td>创建时间</td>--%>
                        <td>收款时间</td>
                        <td>付款时间</td>
                        <%--<td>审核人</td>--%>
                        <td>备注</td>
                        <td>操作</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="b" items="${list}" varStatus="i">
                        <tr>
                            <td>${ b.billId } </td>
                            <c:forEach var="u" items="${users}">
                                <c:if test="${b.userId eq u.id}">
                                    <td>${ u.userName } </td>
                                </c:if>
                            </c:forEach>
                            <td>${ b.buyPrice }</td>
                            <td>${ b.sellingPrice }</td>
                            <td>${b.supplier }</td>
                            <td>${b.customer}</td>
                            <%--<td><fmt:formatDate value="${b.createTime.getTime() }" pattern="yyyy-MM-dd HH:mm:ss"/></td>--%>
                            <c:if test="${b.receivablesTime eq null}">
                                <td> <button onclick="if(confirm('您确认已经收款?')){window.location.href='<%=request.getContextPath()%>/bill/bill/checkReceivables/${b.id}'}" class="btn btn-info">确认收款</button> </td>
                            </c:if>
                            <c:if test="${b.receivablesTime ne null}">
                                <td><fmt:formatDate value="${b.receivablesTime.getTime() }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                            </c:if>

                            <c:if test="${b.paymentTime eq null}">
                                <td> <button onclick="if(confirm('您确认已经付款?')){window.location.href='<%=request.getContextPath()%>/bill/bill/checkPayment/${b.id}'}" class="btn btn-info">确认付款</button> </td>
                            </c:if>
                            <c:if test="${b.paymentTime ne null}">
                                <td><fmt:formatDate value="${b.paymentTime.getTime() }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                            </c:if>

                           <%-- <td>${b.auditor }</td>--%>
                            <td>${b.remarks }</td>
                            <td><button onclick="if(confirm('您确认要删除该数据吗?')){window.location.href='<%=request.getContextPath()%>/bill/bill/delete/${b.id}'}" class="btn btn-info">删除</button></td>
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


</body>
</html>
