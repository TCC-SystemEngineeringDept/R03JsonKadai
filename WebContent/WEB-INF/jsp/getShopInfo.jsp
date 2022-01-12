<%@ page language="java" contentType="application/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String TENPO_ID = (String)request.getAttribute("TENPO_ID");
    switch (TENPO_ID){
	    case "0222246501":
    %>
{"ID":0222246501,"ShopName":"東北電子専門学校 売店"}
<%
			break;
	    case "0227225445":
	        %>
{"ID":0227225445,"ShopName":"洋風酒場ぐりるぼんてん"}
<%
			break;
	     default:
		        %>
{"ID":0000000000,"ShopName":"未契約の店舗"}
<%
    }
    %>


