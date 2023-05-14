<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ page import="com.demo.zcienta.HrassetsDAO" %>
	<%@ page import="com.demo.zcienta.Hrassets" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="./global.css" />
    <link rel="stylesheet" href="./hrassets.css" />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800&display=swap"
    />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Inter:ital,wght@0,400;0,700;1,500&display=swap"
    />
<title>HRAssets</title>
</head>
<body>


	<%
        HrassetsDAO hrassetsDAO = new HrassetsDAO();
      	
        HttpSession sess = request.getSession(false);
        String email = sess.getAttribute("email").toString();
        
        System.out.println("Email in JSP Page: " + email);
        
        Hrassets hrassets = hrassetsDAO.getEmployee(email);
      	
      	
      %>
    <form method="post" action="hrassets">
    <div class="assetsemployeeinfo">
      <div class="assetsemployeeinfo-child"></div>
      <div class="assetsemployeeinfo-item"></div>
      <div class="employee-information">Employee Information</div>

      <button class="hr-controls1">
        <a href="./HRsearch.html">HR Controls</a>
      </button>


      <a class="logout-1" href="./HRLogoutServlet"></a>
      
      <div class="assetsemployeeinfo-inner"></div>
      <a class="personal" href="./HRpersonal.html">Personal</a
      ><a class="accounts" href="./HRaccount.html">Accounts</a
      ><a class="family" href="./HRfamily.html">Family</a
      ><a class="employment-job" href="./HRemployement.html">Employment & Job</a
      ><b class="assets">Assets</b>
      <div class="assetsemployeeinfo-child1"></div>
      <b class="company-assets">COMPANY ASSETS</b>
      <div class="group-container">
        <div class="desktoplaptop-parent">
          <b class="desktoplaptop">Desktop/Laptop</b>
          <div class="yesno">
            <label id="desktop-1" ><%=hrassets.getDesktop() %>
            </label>
            <input type="hidden"  id="desktop@1" name="desktop" >
          </div>
        </div>
        <div class="desktoplaptop-parent">
          <b class="desktoplaptop">ID Card/Access Card</b>
          <div class="yesno">
            <label id="access-1" ><%=hrassets.getAccess() %>
            </label>
            <input type="hidden"  id="access@1" name="access"  >
          </div>
        </div>
        <div class="desktoplaptop-parent">
          <b class="desktoplaptop">Other Accessories </b>
          <div class="yesno"> 
            <label id="accessory-1" ><%=hrassets.getAccessory() %>
          </label>
          <input type="hidden"  id="accessory@1" name="accessory" >
        </div>
        </div>
      </div>
      
      <div class="rectangle-parent1">
        <div class="group-child12"></div>
        <img class="group-child13" alt="" src="./public/rectangle-9.svg" />
      </div>
      <div class="logout6"><div class="logout7">Logout</div></div>
      <div class="footer22">
        <div class="frame-container">
          <div class="sub-menu-wrapper1">
            <div class="sub-menu3">
              Terms & Conditions | Privacy Policy | Accessibility | Legal |
            </div>
          </div>
          <div class="copyright-wrapper1">
            <div class="sub-menu3">
              Copyright © 2023 Zcientia Labs - All Rights Reserved.
            </div>
          </div>
        </div>
      </div>

         <!-- Save Button -->
      <!--<button class="save-button"><div class="save">SAVE</div></button>    -->  
     <!-- <input type='submit' value='save' style="display: none;" class="save-button" id="save1">  --> 
     <input type="submit" value="save" class="save-button">
         <!-- End of Save button -->


      <nav class="left-nav-bar1" id="nab-bar">
        <img class="qtq-95-1-icon3" alt="" src="./public/qtq-95-12@2x.png" />
        <div class="hi-user-button1">
          <button class="hi-user-button-item"></button
          ><a class="view-my-info2" href="./HRpersonal.html">View my info</a>
          <div class="hi-user2">Hi User</div>
          <img
            class="setting-1-icon2"
            alt=""
            src="./public/setting-11@2x.png"
          /><img class="user-1-12" alt="" src="./public/user-1-11@2x.png" />
        </div>
        <div class="home-button1">
          <img class="home-icon2" alt="" src="./public/home1@2x.png" />
          <div class="home4"><a href="./HRdashboard.html">Home</a></div>
        </div>
        <div class="salary-and-payroll-button1">
          <img class="home-icon2" alt="" src="./public/salary2@2x.png" />
          <div class="salary-payroll2">Salary & Payroll</div>
        </div>
        <div class="home-button1">
          <img class="home-icon2" alt="" src="./public/research1@2x.png" />
          <div class="recruitment2"> <a href="/Recruitment module11/index.html">Recruitment</a></div>
        </div>
        <div class="home-button1">
          <img class="home-icon2" alt="" src="./public/performance1@2x.png" />
          <div class="performance2">Performance</div>
        </div>
        <div class="home-button1">
          <img class="home-icon2" alt="" src="./public/incentive1@2x.png" />
          <div class="benefits2">Benefits</div>
        </div>
        <div class="home-button1">
          <img class="home-icon2" alt="" src="./public/calendar1@2x.png" />
          <div class="attendance2"><a href="/Attendance Module/listofemployee.html">Attendance</a></div>
        </div>
        <div class="home-button1">
          <img class="home-icon2" alt="" src="./public/onboarding.png" />
          <div class="learning2"> <a href="./Onboarding.html">Onboarding</a></div>
        </div>
        <div class="home-button1">
          <img class="home-icon2" alt="" src="./public/healthcare1@2x.png" />
          <div class="wellness2">Wellness</div>
        </div>
        <div class="home-button1">
          <img class="home-icon2" alt="" src="./public/rules1@2x.png" />
          <div class="rules2">Rules</div>
        </div>
      </nav>
    </div>
    <script src="./hrassets.js"></script>
   // <input type="hidden" name="date">

  </form>
  <button class="editing-13" onclick="editbutton1()">
        <img
          class="editing-1-icon6"
          alt=""
          src="./public/editing-1@2x.png"
        /></button>
  </body>
</html>