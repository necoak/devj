<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>相対パス指定のIncludeサンプル</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
<div>
    <h1>この下がインクルードです</h1>
    <%@ include file="../common/message.jsp" %>
</div>
</body>
</html>
