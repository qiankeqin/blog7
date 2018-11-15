<#include "header.ftl">

<article>
  <aside class="l_box">
      <div class="about_me">
        <h2>关于我</h2>
        <ul>
          <i><img src="images/4.jpg"></i>
          <p><b>os7blue</b><a href="http://tale.os7blue.com" target="_blank">，当前站点正在开发中，点此访问旧版博客http://tale.os7blue.com</a></p>
        </ul>
      </div>
      <div class="wdxc">
        <h2>我的相册</h2>
        <ul>
          <li><a href="/"><img src="images/7.jpg"></a></li>
          <li><a href="/"><img src="images/8.jpg"></a></li>
          <li><a href="/"><img src="images/9.jpg"></a></li>
          <li><a href="/"><img src="images/10.jpg"></a></li>
          <li><a href="/"><img src="images/11.jpg"></a></li>
          <li><a href="/"><img src="images/12.jpg"></a></li>
        </ul>
      </div>
      <div class="search">
        <form action="/e/search/index.php" method="post" name="searchform" id="searchform">
          <input name="keyboard" id="keyboard" class="input_text" value="请输入关键字词" style="color: rgb(153, 153, 153);" onfocus="if(value=='请输入关键字词'){this.style.color='#000';value=''}" onblur="if(value==''){this.style.color='#999';value='请输入关键字词'}" type="text">
          <input name="show" value="title" type="hidden">
          <input name="tempid" value="1" type="hidden">
          <input name="tbname" value="news" type="hidden">
          <input name="Submit" class="input_submit" value="搜索" type="submit">
        </form>
      </div>
      <div class="fenlei">
        <h2>文章分类</h2>
        <ul>
          <li><a href="/">学无止境（33）</a></li>
          <li><a href="/">日记（19）</a></li>
          <li><a href="/">慢生活（520）</a></li>
          <li><a href="/">美文欣赏（40）</a></li>
        </ul>
      </div>
      <div class="tuijian">
        <h2>站长推荐</h2>
        <ul>
          <li><a href="/">你是什么人便会遇上什么人</a></li>
          <li><a href="/">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>
          <li><a href="/">第二届 优秀个人博客模板比赛参选活动</a></li>
          <li><a href="/">个人博客模板《绅士》后台管理</a></li>
          <li><a href="/">你是什么人便会遇上什么人</a></li>
          <li><a href="/">帝国cms 列表页调用子栏目，没有则不显示栏目名称</a></li>
          <li><a href="/">第二届 优秀个人博客模板比赛参选活动</a></li>
          <li><a href="/">个人博客模板《绅士》后台管理</a></li>
        </ul>
      </div>
      <div class="links">
        <h2>友情链接</h2>
        <ul>
          <a href="http://www.yangqq.com">os7blue个人博客</a> <a href="http://www.yangqq.com">os7blue博客</a>
        </ul>
      </div>
      <div class="guanzhu">
        <h2>关注我 么么哒</h2>
        <ul>
          <img src="images/wx.jpg">
        </ul>
      </div>
  </aside>
  <main class="r_box">
      <#list postList>
          <#items as post>
    <li><i><a href="/article/${post.timeId}"><img src="${post.titleImgUrl}"></a></i>
        <h3><a href="/article/${post.timeId}">${post.title}</a></h3>
        <p>${post.content}</p>
    </li>
          </#items>
  </#list>
  </main>
</article>
<#include "footer.ftl">