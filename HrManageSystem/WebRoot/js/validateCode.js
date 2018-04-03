$(function(){
	$("#changeCode").mousedown(function(){
		$("#validateCode").attr("src","Number.jsp?"+Math.random());
		return false;
	});
});

/*
<dd>
   <label class="" for="passwords">验证码：</label>
   <input type="text" name="inputCode" class="" value="" id="passwords"/>
   <span class="">
         <img id="validateCode" src="${pageContext.request.contextPath }/Number.jsp" width="96" height="27" alt="" />
   </span>
   <span class=""><a id="changeCode" title="">看不清</a></span>
</dd>
*/