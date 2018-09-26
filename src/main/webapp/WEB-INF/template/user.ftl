<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title></head>
<body>
<center>
    <h2>用户管理</h2>
    <table>
        <tr>
            <th>姓名</th>
            <th>年龄</th>
            <th>电话</th>
            <th>邮箱</th>
        </tr>
        <#list users as u>
            <tr style="border: 1 solid red">
                <td>${u.name}</td>
                <td>${u.age}</td>
                <td>${u.phone}</td>
                <td>${u.email}</td>
            </tr>
        </#list>
    </table>
</center>
</body>
</html>
