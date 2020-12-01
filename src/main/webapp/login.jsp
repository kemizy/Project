<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="static/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<div id="" style="position: relative; top: 280px; left: 630px;">
    <form class="layui-form layui-row" action="/LoginServlet" method="post" lay-filter="example">
        <div class="layui-form-item  layui-col-md3">
            <label class="layui-form-label ">输入框</label>
            <div class="layui-input-block">
                <input type="text" name="username" lay-verify="username" autocomplete="off" placeholder="请输入用户名"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item layui-col-md3">
            <label class="layui-form-label">密码框</label>
            <div class="layui-input-block">
                <input type="password" name="password" lay-verify="password" placeholder="请输入密码" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">单选框</label>
            <div class="layui-input-block">
                <input type="radio" name="sex" value="1" title="男" checked="checked">
                <input type="radio" name="sex" value="0" title="女">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
            </div>
        </div>
    </form>
</div>
<script src="./static/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['form', 'layedit', 'laydate'], function () {
        var form = layui.form
            , layer = layui.layer
            , layedit = layui.layedit
            , laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date'
        });
        laydate.render({
            elem: '#date1'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            username: function (value) {
                if (value.length < 2) {
                    return '用户名至少得2个字符啊';
                }
            }
            , password: [
                /^[\S]{3,12}$/
                , '密码必须3到12位，且不能出现空格'
            ]
            , content: function (value) {
                layedit.sync(editIndex);
            }
        });
    });
</script>

<script>document.write('<script src="//' + (location.host || 'localhost').split(':')[0] + ':35929/livereload.js?snipver=1"></' + 'script>')</script>
<script>document.addEventListener('LiveReloadDisconnect', function () {
    setTimeout(function () {
        window.location.reload();
    }, 500);
})</script>
</body>
</html>