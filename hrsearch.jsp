<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       
    <%@ page import="com.demo.zcienta.PersonalDAO" %>
	<%@ page import="com.demo.zcienta.Personal" %>
	<%@ page import="java.util.List" %>
	
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="./global.css" />
    <link rel="stylesheet" href="./HRsearch.css" />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800&display=swap"
    />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Inter:ital,wght@0,400;0,700;1,500&display=swap"
    />
<meta charset="ISO-8859-1">
<title>HRSearch</title>
</head>
<body>
		<%
       	PersonalDAO personalDAO = new PersonalDAO();
       	String search = request.getParameter("search");
       	List<Personal> employees = personalDAO.getEmployees(search);
       	
       		
       	
       	System.out.println("hrsearch: "+search);
       	
       	
       	
       %>


   
    <div class="employeeinfo-hrview">
      <div class="employeeinfo-hrview-child"></div>
      <button class="hr-controls"><a href="./hrsearch.jsp">HR Controls</a></button>

      <!-- View More Button -->
      <button class="view-more-button">
        <a href="./hrpersonal.jsp">View More Details</a>
      </button>
      <!-- End of view more Button -->
      <div class="employeeinfo-hrview-item"></div>
      <div class="employee-information4">Employee Information</div>
      <a class="logout-14" href="./HRLogoutServlet"></a>
      <div class="employeeinfo-hrview-inner"></div>
      <b class="basic-information">Basic Information</b
      ><a class="work-information" href="./HRemployement.html" id="workInformation">Work Information</a
      ><a class="emergency-contact" href="./HRpersonal.html">Emergency Contact</a
      ><a class="assets4" href="./hrassets.html">Assets</a>
      <div class="logout14"><div class="logout15">Logout</div></div>
      <div class="footer26">
        <div class="frame-parent4">
          <div class="sub-menu-wrapper5">
            <div class="sub-menu7">
              Terms & Conditions | Privacy Policy | Accessibility | Legal |
            </div>
          </div>
          <div class="copyright-wrapper5">
            <div class="sub-menu7">
              Copyright © 2023 Zcientia Labs - All Rights Reserved.
            </div>
          </div>
        </div>
      </div>
      <form method="post" action="search">
	      
	       <!--<input
	       name="search"> class="rectangle-input"
	        type="search"
	        placeholder="Search Employee"
	      /> --> 
	      <!--  <img class="search-1-icon" alt="" src="./public/search-1@2x.png" /> -->
	      <input type="text" placeholder="Search Employee" class="rectangle-input" name="search" >
	      <input type="submit"  value="Search " class="close-1-icon" >
	      
	  <!-- <label name="search" class="rectangle-input">
	      
	      </label> -->  
      </form>
     <!-- <div class="employeeinfo-hrview-inner1">
        <div class="frame-child6"></div>
      </div> -->
      
       
     <!-- <img class="close-1-icon" alt="" src="./public/close-1@2x.png" />  -->
      <div class="employeeinfo-hrview-child2"></div>
      <div class="basic-information1">Basic Information</div>
      <img class="user-2-1" alt="" src="./public/user-2-1@2x.png" />
       <%
          if(employees!=null)
         	{
         	
          for(Personal personal: employees){
        	  
          
          
          	
          %>
           <%
      }
         	}
      %>
          
          
      <div class="frame-parent5">
        <div class="frame-parent6">
          <div class="name-group">
         
       
            <b class="name1">Name</b>
            <div class="user">user</div>
          </div>
          
          
          <div class="name-group">
            <b class="primary-contact-no">Contact Email</b>
            <div class="user">xxx.com</div>
          </div>
          
          
          
          <div class="primary-contact-no-parent">
            <b class="primary-contact-no">Primary Contact No.</b>
            <div class="xxxxxxxxxx8">xxxxxxxx</div>
          </div>
          
          
          
          <div class="extension-parent">
            <b class="primary-contact-no">Extension</b>
            <div class="div148">---</div>
          </div>
        </div>
        
        
        <div class="location-parent">
          <b class="location">Location</b>
          <div class="user">XXXXXX</div>
        </div>
      </div>
       
      
      <nav class="left-nav-bar5" id="nab-bar">
        <img class="qtq-95-1-icon7" alt="" src="./public/qtq-95-12@2x.png" />
        <div class="hi-user-button5">
          <button class="hi-user-button-child2"></button
          ><a class="view-my-info6" href="./HRpersonal.html">View my info</a>
          <div class="hi-user6">Hi User</div>
          <img
            class="setting-1-icon6"
            alt=""
            src="./public/setting-11@2x.png"
          /><img class="user-1-16" alt="" src="./public/user-1-11@2x.png" />
        </div>
        <a class="home-button5" href="./HRdashboard.html"
          ><img class="home-icon6" alt="" src="./public/home1@2x.png" />
          <div class="home8">Home</div></a
        >
        <div class="salary-and-payroll-button5">
          <img class="home-icon6" alt="" src="./public/salary2@2x.png" />
          <div class="salary-payroll6">Salary & Payroll</div>
        </div>
        <div class="recruitment-button5">
          <img class="home-icon6" alt="" src="./public/research1@2x.png" />
          <div class="recruitment6"><a href="../Recruitment module11/">Recruitment</a></div>
        </div>
        <div class="recruitment-button5">
          <img class="home-icon6" alt="" src="./public/performance1@2x.png" />
          <div class="performance6">Performance</div>
        </div>
        <div class="recruitment-button5">
          <img class="home-icon6" alt="" src="./public/incentive1@2x.png" />
          <div class="benefits6">Benefits</div>
        </div>
        <div class="recruitment-button5">
          <img class="home-icon6" alt="" src="./public/calendar1@2x.png" />
          <div class="attendance6"><a href="../Attendance Module/listofemployee.html">Attendance</a></div>
        </div>
        <div class="recruitment-button5">
          <img class="home-icon6" alt="" src="./public/onboarding.png" />
          <div class="learning6"><a href="./Onboarding.html">Onboarding</a></div>
        </div>
        <div class="recruitment-button5">
          <img class="home-icon6" alt="" src="./public/healthcare1@2x.png" />
          <div class="wellness6">Wellness</div>
        </div>
        <div class="recruitment-button5">
          <img class="home-icon6" alt="" src="./public/rules1@2x.png" />
          <div class="rules6">Rules</div>
        </div>
      </nav>
      
    </div>
    <script>
      var workInformation = document.getElementById("workInformation");
      if (workInformation) {
        workInformation.addEventListener("click", function (e) {
          window.location.href = "";
        });
      }
      </script>
  </body>
</html>