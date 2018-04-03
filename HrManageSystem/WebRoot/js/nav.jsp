<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

// 导航栏配置文件
var outlookbar=new outlook();
var t;
t=outlookbar.addtitle('组织管理','组织管理',1);
outlookbar.additem('部门操作',t,'${pageContext.request.contextPath}/dept/findAllDeptByPage/1');
outlookbar.additem('岗位操作',t,'${pageContext.request.contextPath}/job/findAllJobByPage/1');
/*t=outlookbar.addtitle('设置关系','组织管理',1);
outlookbar.additem('设置关系',t,'addjobdept_r.html');*/


t=outlookbar.addtitle('入职管理','人员管理',1);
outlookbar.additem('输入员工',t,'people/writeinfo.jsp')

t=outlookbar.addtitle('试用期管理','人员管理',1)
outlookbar.additem('试用期审查',t,'people/showselect.jsp')
outlookbar.additem('已转正员工查询',t,'people/showselectzs.jsp')

t=outlookbar.addtitle('离职管理','人员管理',1)
outlookbar.additem('员工离职办理',t,'people/leavingselect.jsp')
outlookbar.additem('已离职员工查询',t,'people/leavingse.jsp')


t=outlookbar.addtitle('调动管理','调动管理',1);
outlookbar.additem('调动操作',t,'${pageContext.request.contextPath}/tablejsp/moveempselect.jsp')


t=outlookbar.addtitle('员工信息中心','信息管理',1);
outlookbar.additem('人才库查询',t,'infor/DBselect.jsp')
outlookbar.additem('更新人员基本信息',t,'infor/updateE.jsp')


t=outlookbar.addtitle('报表管理','报表管理',1);
outlookbar.additem('新聘员工报表',t,'${pageContext.request.contextPath}/report/findAllDept2');
outlookbar.additem('离职员工报表',t,'${pageContext.request.contextPath}/report/findAllDept1');
outlookbar.additem('部门调动员工报表',t,'${pageContext.request.contextPath}/report/selmodeptemp.jsp');
outlookbar.additem('岗位调动员工报表',t,'${pageContext.request.contextPath}/report/selmojobemp.jsp');
outlookbar.additem('人事月报',t,'${pageContext.request.contextPath}/report/selmothlist.jsp');


t=outlookbar.addtitle('系统管理','系统管理',1);
outlookbar.additem('查找用户',t,'${pageContext.request.contextPath}/system/selectmanager.jsp')
outlookbar.additem('新增用户',t,'${pageContext.request.contextPath}/system/addmanager.jsp')
outlookbar.additem('修改密码',t,'${pageContext.request.contextPath}/system/updatepassword.jsp')
outlookbar.additem('退出登录',t,'${pageContext.request.contextPath}/system/out.jsp')
