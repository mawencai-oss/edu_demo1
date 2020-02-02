/*可试听*/

$(".course-hot .row .broadcast .thumbnail .item-status .item-status-audition>p").html("正在直播");
$(".course-hot .row .broadcast .thumbnail .item-status .item-status-audition>img").attr("src","./images/icon2.gif");
/*可试听     end */


/*课程切换*/
var swiper = new Swiper('.course-tab', {
    speed: 1000,
    loop: true,
    slidesPerView: 4,
    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
    },

});
/*课程切换     end */



/*课程切换*/ /*判断手机显示*/
if( /Android|webOS|iPhone|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent) ) {

    /*课程切换*/
    var swiper = new Swiper('.course-tab', {
        speed: 1000,
        loop: true,
        slidesPerView: 1,
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
        },

    });

    /*  右侧课程目录 手机端展开效果*/
    $(".course-catalogue .course-catalogue-wrapper .course-details-item>h2").click(function(){

        $(this).parent().siblings().find("h2").removeClass("hover");

        $(this).addClass("hover");

        var $this=$(this).parent();

        $this.stop().siblings().find("ul").slideUp();
        $this.stop().find("ul").slideToggle();
    });

}
/*课程切换*/ /*判断手机显示   end */




/*会员信息   全部课程*/
$(".all-course .current-progress-list>h2").click(function(){
    var $this=$(this).parent();
    $this.stop().siblings().find("ul").slideUp();
    $this.stop().find("ul").slideToggle();
})
/*会员信息   全部课程   end */

    //返回顶部
	if($(this).scrollTop()==0){
		$(".toTop").hide();
	}
	$(window).scroll(function(event) {
		/* Act on the event */
		if($(this).scrollTop()==0){
			$(".toTop").hide();
		}
		if($(this).scrollTop()!=0){
			$(".toTop").show();
		}
	});	
	$(".toTop").click(function(event) {
		$("html,body").animate({
			scrollTop:"0px"},666)
	});
	
	$(".online-code").hover(function(){
		$(".online-code-img").stop().animate({
			"right":"60px"
		},500);
	},function(){
		$(".online-code-img").stop().animate({
			"right":"-150px"
		},0);
		
	})
	

	$(function(){

	$('#switch_qlogin').click(function(){
		$('#switch_login').removeClass("switch_btn_focus").addClass('switch_btn');
		$('#switch_qlogin').removeClass("switch_btn").addClass('switch_btn_focus');
		$('#switch_bottom').animate({left:'0px',width:'70px'});
		$('#qlogin').css('display','none');
		$('#web_qr_login').css('display','block');
		
		});
	$('#switch_login').click(function(){
		
		$('#switch_login').removeClass("switch_btn").addClass('switch_btn_focus');
		$('#switch_qlogin').removeClass("switch_btn_focus").addClass('switch_btn');
		$('#switch_bottom').animate({left:'154px',width:'70px'});
		
		$('#qlogin').css('display','block');
		$('#web_qr_login').css('display','none');
		});
		if(getParam("a")=='0')
		{
			$('#switch_login').trigger('click');
		}

		});
			
		function logintab(){
			scrollTo(0);
			$('#switch_qlogin').removeClass("switch_btn_focus").addClass('switch_btn');
			$('#switch_login').removeClass("switch_btn").addClass('switch_btn_focus');
			$('#switch_bottom').animate({left:'154px',width:'96px'});
			$('#qlogin').css('display','none');
			$('#web_qr_login').css('display','block');
			
		}
		
		
		//根据参数名获得该参数 pname等于想要的参数名 
		function getParam(pname) { 
		    var params = location.search.substr(1); // 获取参数 平且去掉？ 
		    var ArrParam = params.split('&'); 
		    if (ArrParam.length == 1) { 
		        //只有一个参数的情况 
		        return params.split('=')[1]; 
		    } 
		    else { 
		         //多个参数参数的情况 
		        for (var i = 0; i < ArrParam.length; i++) { 
		            if (ArrParam[i].split('=')[0] == pname) { 
		                return ArrParam[i].split('=')[1]; 
		            } 
		        } 
		    } 
		}  
		
		
		var reMethod = "post",
			pwdmin = 6;
		
		$(document).ready(function() {
			$('#reg').click(function() {
			if ($('#user').val() == "") {
				$('#user').focus().css({
					border: "1px solid red",
					boxShadow: "0 0 2px red"
				});
				$('#userCue').html("<font color='red'><b>×用户名不能为空</b></font>");
				return false;
			}
			if ($('#user').val().length < 2 || $('#user').val().length > 16) {
	
				$('#user').focus().css({
					border: "1px solid red",
					boxShadow: "0 0 2px red"
				});
				$('#userCue').html("<font color='red'><b>×用户名位4-16字符</b></font>");
				return false;
	
			}
			$.ajax({
				type: reMethod,
				url: "/register2",
				data: {"nickname":$("#user").val(),"password":$("#passwd").val(),"emailAddr":$("#qq").val(),},
				dataType: 'json',
				success: function(result) {
                    if (result.code == 1) {
                        $('#user').focus().css({
                            border: "1px solid red",
                            boxShadow: "0 0 2px red"
                        });
                        $("#userCue").html("<font color='red'><b>"+result.msg+"</b></font>");
                    }
                    if (result.code == 200) {
                        $("#userCue").html("<font color='green'><b>注册成功,3s后跳转登录</b></font>");
                        setTimeout(function () {
                            $('#switch_login').removeClass("switch_btn_focus").addClass('switch_btn');
                            $('#switch_qlogin').removeClass("switch_btn").addClass('switch_btn_focus');
                            $('#switch_bottom').animate({left:'0px',width:'70px'});
                            $('#qlogin').css('display','none');
                            $('#web_qr_login').css('display','block');
                        },3000)
					}
                },
				error:function () {

                }
			});
	
			if ($('#passwd').val().length < pwdmin) {
				$('#passwd').focus();
				$('#userCue').html("<font color='red'><b>×密码不能小于" + pwdmin + "位</b></font>");
				return false;
			}
			if ($('#passwd2').val() != $('#passwd').val()) {
				$('#passwd2').focus();
				$('#userCue').html("<font color='red'><b>×两次密码不一致！</b></font>");
				return false;
			}
	
			var sqq = /^[1-9]{1}[0-9]{4,9}$/;
			if (!sqq.test($('#qq').val()) || $('#qq').val().length < 5 || $('#qq').val().length > 12) {
				$('#qq').focus().css({
					border: "1px solid red",
					boxShadow: "0 0 2px red"
				});
				$('#userCue').html("<font color='red'><b>×QQ号码格式不正确</b></font>");return false;
			} else {
				$('#qq').css({
					border: "1px solid #D7D7D7",
					boxShadow: "none"
				});
				
			}
			// $('#regUser').submit();
		});
		
	
	});
		function loginmsg(){
            $.post("/login2",{"nickname":$("#u").val(),"password":$("#p").val()},function (res) {
                if(res.code==1)
                    alert(res.msg)
                else{
                    location.href="/index"
                }
            })
		}
		function vidoelist(x) {
			var id=$(x).find("#mycouseid").text()
			location.href="/static/html/6video.html/#/id="+id
			console.log($(x).find("#mycouseid").text())
		}
		$(function () {
			/*热门课程*/
			$.get("/findhotcourse",function (res) {
                $.each(res.data,function (index,value) {
                    var per = value.coursePermission
                    if (per == "on")
                        per = "免费"
                    else
                        per = "会员可以观看"
                    $(".mb15:eq(0)").parent().next().children().append("<div  onclick='vidoelist(this)' class=\"col-xs-6 col-sm-6 col-md-3\">\n" +
                        "\t\t\t\t\t    <div class=\"thumbnail\">\n" +
                        "\t\t\t\t\t      <a><img  src=\"" + value.courseImg + "\" alt=\"\" style=' width: 245px; height: 137.64px'></a>\n" +
                        "\t\t\t\t\t      <div class=\"caption\"> <span style='display: none' id='mycouseid'>"+value.id+"</span>\n" +
                        "\t\t\t\t\t        <h3 class=\"over-hide-more mb10\"><a>" + value.courseName + "</a></h3>\n" +
                        "\t\t\t\t\t        <div class=\"item-line mb5\">\n" +
                        "\t\t\t\t\t        \t<h5>共" + value.courseList + "节</h5>\n" +
                        "\t\t\t\t\t        \t<span>进度：" + value.info2 + "/" + value.courseList + "节</span>\n" +
                        "\t\t\t\t\t        </div>\n" +
                        "\t\t\t\t\t        <p><i class='item-line01'>" + per + "</i><i class='item-line02'>" + value.courseMan + "人最近报名 </i></p>\n" +
                        "\t\t\t\t\t      </div>\n" +
                        "\t\t\t\t\t    </div>\n" +
                        "\t\t\t\t\t  </div>")
					if(index<3){
                        $("#hot").append("<div onclick='vidoelist(this)' class=\"col-xs-6 col-md-12\">\n" +
                            "\t\t\t\t\t\t\t\t\t    <div class=\"thumbnail\">\n" +
                            "\t\t\t\t\t\t\t\t\t      <a>\n" +
                            "\t\t\t\t\t\t\t\t\t      \t<img src=\""+value.courseImg+"\" alt=\"\">\n" +
                            "\t\t\t\t\t\t\t\t\t      \t<div class=\"item-status\"> <span style='display: none' id='mycouseid'>"+value.id+"</span> \n" +
                            "\t\t\t\t\t\t\t\t\t      \t\t<span class=\"item-status-audition\">\n" +
                            "\t\t\t\t\t\t\t\t\t      \t\t\t<img src=\"/static/images/icon1.png\"/><p>可试听</p>\n" +
                            "\t\t\t\t\t\t\t\t\t      \t\t</span>\n" +
                            "\t\t\t\t\t\t\t\t\t      \t</div>\n" +
                            "\t\t\t\t\t\t\t\t\t      </a>\n" +
                            "\t\t\t\t\t\t\t\t\t      <div class=\"caption\">\n" +
                            "\t\t\t\t\t\t\t\t\t        <h3 class=\"over-hide-more mb10\"><a>"+value.courseName+"</a></h3>\n" +
                            "\n" +
                            "\t\t\t\t\t\t\t\t\t        <p><i class=\"item-line01\">"+per+"</i><i class=\"item-line02\">"+value.courseMan+"人最近报名</i> </p>\n" +
                            "\t\t\t\t\t\t\t\t\t      </div>\n" +
                            "\t\t\t\t\t\t\t\t\t    </div>\n" +
                            "\t\t\t\t\t\t\t\t\t  </div>")
					}
                    if(index<4){
						$("#like").append("  <div onclick='vidoelist(this)' class=\"col-xs-6 col-md-3\">\n" +
                            "\t\t\t\t\t\t    <div class=\"thumbnail\"> <span style='display: none' id='mycouseid'>"+value.id+"</span>\n" +
                            "\t\t\t\t\t\t      <a>\n" +
                            "\t\t\t\t\t\t      \t<img src=\""+value.courseImg+"\" alt=\"\">\n" +
                            "\t\t\t\t\t\t      \t<div class=\"item-status\">\n" +
                            "\t\t\t\t\t\t      \t\t<span class=\"item-status-audition\">\n" +
                            "\t\t\t\t\t\t      \t\t\t<img src=\"/static/images/icon1.png\"/><p>可试听</p>\n" +
                            "\t\t\t\t\t\t      \t\t</span>\t\t\t\t\t\t\t\t      \t\t\n" +
                            "\t\t\t\t\t\t      \t</div>\n" +
                            "\t\t\t\t\t\t      </a>\n" +
                            "\t\t\t\t\t\t      <div class=\"caption\">\n" +
                            "\t\t\t\t\t\t        <h3 class=\"over-hide-more mb10\"><a>"+value.courseName+"</a></h3>\n" +
                            "\t\t\t\t\t\t       \n" +
                            "\t\t\t\t\t\t        <p><i class=\"item-line01\">"+per+"</i><i class=\"item-line02\">"+value.courseMan+"人最近报名</i> </p>\n" +
                            "\t\t\t\t\t\t      </div>\n" +
                            "\t\t\t\t\t\t    </div>\n" +
                            "\t\t\t\t\t\t  </div>")
					}

                })
            })
            /*课程分类*///245*137.64
            $.get("/admin/coursetypeall",function (res) {
            	$.each(res.data,function (value,index) {
					$(".curr").after("<a href='#"+res.data[value].typeName+"'>"+res.data[value].typeName+"</a>")
                })
                $(".course-recommend .container .typecourse").each(
                	function(index) {
						i=index
                       $(this).text(res.data[i].typeName)
                        $("#shouyeli").append("<li><a href=\"#\">"+res.data[i].typeName+"</a></li>")
                        var b=parseInt(i+1)
                        $(".mb15:eq(1)").text(res.data[0].typeName)
                        $(".mb15:eq(b)").text(res.data[i].typeName)
                        $.get("/findcoursebytype?type="+res.data[i].typeName,function (res) {
                        	$.each(res.data,function (index,value) {
                        		var per=value.coursePermission
								if(per=="on")
									per="免费"
								else
									per="会员可以观看"
                                $(".mb15:eq("+b+")").parent().next().children().append("<div onclick='vidoelist(this)' class=\"col-xs-6 col-sm-6 col-md-3\">\n" +
                                    "\t\t\t\t\t    <div class=\"thumbnail\">\n" +
                                    "\t\t\t\t\t      <a><img  src=\""+value.courseImg+"\" alt=\"\" style=' width: 245px; height: 137.64px'></a>\n" +
                                    "\t\t\t\t\t      <div class=\"caption\"> <span style='display: none' id='mycouseid'>"+value.id+"</span>\n" +
                                    "\t\t\t\t\t        <h3 class=\"over-hide-more mb10\"><a>"+value.courseName+"</a></h3>\n" +
                                    "\t\t\t\t\t        <div class=\"item-line mb5\">\n" +
                                    "\t\t\t\t\t        \t<h5>共"+value.courseList+"节</h5>\n" +
                                    "\t\t\t\t\t        \t<span>进度："+value.info2+"/"+value.courseList+"节</span>\n" +
                                    "\t\t\t\t\t        </div>\n" +
                                    "\t\t\t\t\t        <p><i class='item-line01'>"+per+"</i><i class=\"item-line02\">"+value.courseMan+"人最近报名</i> </p>\n" +
                                    "\t\t\t\t\t      </div>\n" +
                                    "\t\t\t\t\t    </div>\n" +
                                    "\t\t\t\t\t  </div>")
                            })
                        })
						i++;
                    }
				)

                $(".mb15:eq(2)").text(res.data[1].typeName)
                $(".mb15:eq(3)").text(res.data[2].typeName)
            })
			/*轮播图*/
            // $.get("/findallrollimg",function (res) {
            //     for (var i = 0; i < res.data.length; i++) {
            //     	if(i===0)
            //             $(".carousel-inner").append("<div class=\"item active\" style=\"background: #1F4E78;\">\n" +
            //                 "\t\t      <img src='"+res.data[i].srcimg+"'  id=\"lbt\" alt=\"...\">\n" +
            //                 "\t\t    </div>")
				// 	else
				// 		$(".carousel-inner").append("<div class=\"item \" style=\"background: #1F4E78;width: 710px;height: 300px\">\n" +
            //             "\t\t      <img src='"+res.data[i].srcimg+"' width='710' height='300' id=\"lbt\" alt=\"...\">\n" +
            //             "\t\t    </div>")
            //     }
            // })
			/*首页课程分类*/
			/*视频显示*/
        })