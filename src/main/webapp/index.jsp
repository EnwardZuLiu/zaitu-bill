<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device,initial-scale=1">
    <meta name="renderer" content="webkit">
    <title>在途-做单系统</title>
    <meta name="keywords" content="在途,深圳在途,深圳在途电子商务有限公司,机票代理,在线旅游,人人都是机票代理,国际机票预订,预订国内机票,
    出游信息咨询,保险业务">
    <meta name="description" content="深圳在途电子商务有限公司成立于2014-12-31日，公司主营产品为国际机票预订，国际酒店预订和保险业务，
    同时可以提供预订国内机票，出游信息咨询、合作伙伴网站建设、推广及维护等服务，公 司坚持“服务为主，客户至上，互助互利”的理念，秉承“最优
    惠的价格、最好的服务”的品牌观念， 立志于打造旅游行业最具有竞争力的出游解决方案 服务商。">

    <link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.css">
    <link rel="stylesheet" href="../css/ticket.css">
    <!--[if lt IE 9]>
    <script src="http://apps.bdimg.com/libs/html5shiv/r29/html5.min.js"></script>
    <script src="http://apps.bdimg.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container-fluid">
    <div class="row" style="margin: 100px auto">
        <div class="col-md-4 col-md-offset-4">
            <form action="<%=request.getContextPath()%>/ex/login/login" class="form-horizontal" method="post">
                <div class="form-group">
                    <label class="col-sm-2 control-label">用户名:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="userName" placeholder="用户名">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">密码:</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" name="password">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">登录</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>






</body>
</html>