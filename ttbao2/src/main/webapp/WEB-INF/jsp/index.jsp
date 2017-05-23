<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <meta name="copyright" content="All Rights Reserved, Copyright (C) 2013, Wuyeguo, Ltd."/>
  <title>EasyUI Web Admin Power by Wuyeguo</title>
  <link rel="stylesheet" type="text/css" href="../easyui/1.5.2/themes/default/easyui.css"/>
  <link rel="stylesheet" type="text/css" href="../css/wu.css"/>
  <link rel="stylesheet" type="text/css" href="../css/icon.css"/>
  <script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
  <script type="text/javascript" src="../easyui/1.5.2/jquery.easyui.min.js"></script>
  <script type="text/javascript" src="../easyui/1.5.2/locale/easyui-lang-zh_CN.js"></script>
  <script type="text/javascript" src="../js/indexMeum.js"></script>
  <script type="text/javascript" src="../js/imageupload.js"></script>
</head>
<body class="easyui-layout">
<!-- begin of header -->
<div class="wu-header" data-options="region:'north',border:false,split:true">
  <div class="wu-header-left">
    <h1>EasyUI Web Admin</h1>
  </div>
  <div class="wu-header-right">
    <p><strong class="easyui-tooltip" title="2条未读消息">admin</strong>，欢迎您！</p>
    <p><a href="#">网站首页</a>|<a href="#">支持论坛</a>|<a href="#">帮助中心</a>|<a href="#">安全退出</a></p>
  </div>
</div>
<!-- end of header -->
<!-- begin of sidebar -->
<div class="wu-sidebar" data-options="region:'west',split:true,border:true,title:'导航菜单'">
  <div id="accordion" class="easyui-accordion" data-options="border:false,fit:true">
  </div>
</div>
<!-- end of sidebar -->
<!-- begin of main -->
<div class="wu-main" data-options="region:'center'">
  <div id="tabs" class="easyui-tabs" data-options="border:false,fit:true">
  </div>
</div>
<!-- end of main -->
<!-- begin of footer -->
<div class="wu-footer" data-options="region:'south',border:true,split:true">
  &copy; 2013 Wu All Rights Reserved
</div>
</body>
</html>
