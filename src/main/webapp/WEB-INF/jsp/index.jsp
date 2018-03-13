<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/2
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> 标题党</title>
</head>

<body>
单个文件上传：<br/>
<form action="/cose/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" name="提交上传">
</form>


<form id="fileInfo" enctype="multipart/form-data" target="screct_frame" method="POST" action="/cose/uploads">

    <p class="pdt_p">机构封面图：
        <input type="file" name="file2"  />
    </p>
    <p class="pdt_p">机构封面图：
        <input type="file" name="file21"  />
    </p>
    <p class="pdt_p">机构封面图：
        <input type="file" name="file22"  />
    </p>
    <input type="submit" name="提交上传">
</form>




</body>
</html>
