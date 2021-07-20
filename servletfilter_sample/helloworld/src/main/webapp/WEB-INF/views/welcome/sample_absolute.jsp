<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>絶対パス指定のIncludeサンプル</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
<div>
    <h1>この下</h1>
    <%@ include file="/WEB-INF/views/common/message.jsp" %>
</div>
</body>
</html>
