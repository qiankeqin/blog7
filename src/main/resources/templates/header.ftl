<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>os7blue</title>
    <meta http-equiv="Content-Security-Policy" content="upgrade-insecure-requests">
    <meta name="keywords" content="blog" />
    <meta name="description" content="blog" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/base.css" rel="stylesheet">
    <link href="/css/m.css" rel="stylesheet">
    <script src="/js/jquery-1.8.3.min.js" ></script>
    <script src="/js/comm.js"></script>
    <!--[if lt IE 9]>
    <script src="/js/modernizr.js"></script>
    <![endif]-->
</head>
<body>
<!--top begin-->
<header id="header">
    <div class="navbox">
        <h2 id="mnavh"><span class="navicon"></span></h2>
        <div class="logo"><a href="http://os7blue.com">os7blue个人博客</font></a></div>
        <nav>
            <ul id="starlist">
                <li><a href="/index">首页</a></li>
                <li><a href="/list">个人博客日记</a></li>
                <li class="menu"><a href="/list2">博客网站制作</a>
                    <ul class="sub">
                        <li><a href="/6">推荐工具</a></li>
                        <li><a href="/7">JS经典实例</a></li>
                        <li><a href="/8">网站建设</a></li>
                        <li><a href="/7">CSS3|Html5</a></li>
                        <li><a href="/8">心得笔记</a></li>
                    </ul>
                    <span></span></li>
                <li><a href="/list3">网页设计心得</a></li>
                <li><a href="/daohang">优秀个人博客</a></li>
                <li><a href="/about">关于我</a></li>
            </ul>
        </nav>
        <div class="searchico"></div>
    </div>
</header>
<script type="text/javascript">
    /*鼠标特效 */
    function co(){
        var colorElements = "0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f";
        var colorArray = colorElements.split(",");
        var color ="#";
        for(var i =0;i<6;i++){
            color+=colorArray[Math.floor(Math.random()*16)];
        }
        return color;
    };
    var a_idx = 0;
    jQuery(document).ready(function($) {
        $("body").click(function(e) {
            var a = new Array("Hello基佬","你再点", "你继续点", "你有本事接着点", "有种你还点", "快别他妈点了", "好好看文章不行吗");
            var $i = $("<span/>").text(a[a_idx]);
            a_idx = (a_idx + 1) % a.length;
            var x = e.pageX,
                    y = e.pageY;
            $i.css({
                "z-index": 999999999999999999999999999999999999999999999999999999999999999999999,
                "top": y - 20,
                "left": x,
                "position": "absolute",
                "font-weight": "bold",
                "color": co()
            });
            $("body").append($i);
            $i.animate({
                        "top": y - 180,
                        "opacity": 0
                    },
                    1500,
                    function() {
                        $i.remove();
                    });
        });
    });
</script>