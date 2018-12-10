<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        div{
            font-size: 30px;
        }
        .ch{
            width: 400px;
            text-align: right;
            float: left;
        }
        input{
            width: 40%;
            height: 30px;
            line-height: 30px;
            font-size: 20px;
            font-family: 楷体;
            border-radius: 6px
        }
        .ip{
            width: 80%;
            margin-left: 0px;
            padding-left: 0px;
        }
        button{
            border-radius: 6px;
            font-size: 30px;
            font-family: 仿宋;
            margin-top: 20px;
        }
    </style>
</head>
<body>
<div>
    <h1 style="text-align: center">注册页面</h1>
</div>
<div style="width: 60%;height: 800px;margin: 0 auto;text-align: center">
    <form action="/JavaWebTest/reg" method="post">
    <div class="ch">姓名：</div>
    <div class="ip">
        <input type="text" name="name" placeholder="请输入用户名 " />

    </div>
    <div class="ch">密码：</div>
    <div class="ip">
        <input type="text" name="password" placeholder="请输入密码 "/>
    </div>
    <div class="ch">确认密码：</div>
    <div class="ip">
        <input type="text" name="password2" placeholder="请再次输入密码 "/>
    </div>
        <div class="ch">电话：</div>
        <div class="ip">
            <input type="text" name="phone"  placeholder="手机号" />
        </div>
    <div class="ch">邮箱：</div>
    <div class="ip">
        <input type="text" name="email" placeholder="邮箱 " />
    </div>
    <div class="ch">性别：</div>
    <div class="ip">
        <input type="text" name="sex" placeholder="性别 " />
    </div>
       <button type="submit">提交</button>
    </form>
</div>
</body>
</html>