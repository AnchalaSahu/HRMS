<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.demo.zcienta.FamilyDAO" %>
	<%@ page import="com.demo.zcienta.Family" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="./global.css" />
    <link rel="stylesheet" href="./Family.css" />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800&display=swap"
    />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Inter:ital,wght@0,400;0,700;1,500&display=swap"
    />


<title>Employee Family</title>
</head>
<body>
<%
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
%>


<%
	 		FamilyDAO familyDAO = new FamilyDAO();
	      	
	        HttpSession sess = request.getSession(false);
	        String email = sess.getAttribute("email").toString();
	        
	        System.out.println("Email in JSP Page: " + email);
	        
	      	Family family = familyDAO.getEmployee(email);
	      	
      	
      %>
    <form method="post" action="family">
    <div class="familyemployeeinfo">
      <div class="familyemployeeinfo-child"></div>
      <div class="familyemployeeinfo-item"></div>
      <div class="employee-information2">Employee Information</div>
      <a class="logout-12" href="./logoutServlet"></a>
      <div class="familyemployeeinfo-inner"></div>
      <a class="personal2" href="./Personal.jsp">Personal</a
      ><a class="accounts2" href="./account.jsp">Accounts</a
      ><b class="family2">Family</b
      ><a class="employment-job2" href="./employement job.html">Employment & Job</a
      ><a class="assets2" href="./Assets.html">Assets</a>
      <div class="familyemployeeinfo-child1"></div>
      <div class="familyemployeeinfo-child2"></div>
      <b class="parent-details">PARENT DETAILS</b
      ><b class="spouse-details">SPOUSE DETAILS</b>
      <div class="mothers-name-parent">
        <b class="mothers-name">Mother&apos;s Name</b>
        <div class="xxxxxx">
          <label id="mother-name"><%=family.getMothername() %></label>
          <input type="hidden" id="m-name" name="mother-name">
        </div>
      </div>
      
      <div class="date-of-birth-parent">
        <b class="mothers-name">Date Of Birth</b>
        <div class="xxxxxx">
          <label id="date-of-brth"><%=family.getMotherdob() %></label>
          <input type="hidden" id="dob" name="dob-1" class="input-z-index">
        </div>
      </div>
      
      <div class="name-parent">
        <b class="mothers-name">Name</b>
        <div class="xxxxxx">
          <label id="spouse-name"><%=family.getMothername() %></label>
          <input type="hidden" id="spouse@name"name="spouse-name">
          </div>
      </div>
      
      <div class="xxxxxxxxxx-wrapper">
        <div class="xxxxxxxxxx">
          <label id="palce=birth"><%=family.getPlacrbirth() %></label>
          <input type="hidden" id="birth@place" name="birth">
        </div>
      </div>
      
      <div class="occupation-parent">
        <b class="mothers-name">Occupation</b>
        <div class="xxxxxx">
          <label id="occupation-1"><%=family.getOccupation()%></label>
          <input type="hidden" id="occupation@1"name="occup">
        </div>
      </div>
      <div class="fathers-dob-parent">
        <b class="mothers-name">Father&apos;s DOB</b>
        <div class="xxxxxx">
          <label id="father-dob"><%=family.getFatherdob() %></label>
          <input type="hidden" id="f-dob" name="fathersdob">
        </div>
      </div>
      
      <div class="mothers-dob-parent">
        <b class="mothers-name">Mother&apos;s DOB</b>
        <div class="xxxxxx">
          <label id="mother-dob"><%=family.getMotherdob() %></label>
          <input type="hidden" id="m-dob" name="mothersdob">
        </div>
      </div>
      
      <div class="mothers-contact-no-parent">
        <b class="mothers-name">Mother&apos;s Contact No.</b>
        <div class="xxxxxx">
          <label id="mother-contact"><%=family.getMothercontactnumber() %></label>
          <input type="hidden" id="m-contact" name="mother-con">
        </div>
      </div>
      
      <div class="fathers-contact-no-parent">
        <b class="mothers-name">Father&apos;s Contact No.</b>
        <div class="xxxxxx">
          <label id="father-contact"><%=family.getFathercontactnumber() %></label>
          <input type="hidden" id="f-contact"name="f-conatacts">
        </div>
      </div>
      
      <div class="contact-no-parent">
        <b class="contact-no">Contact No.</b
        ><b class="place-of-birth">Place Of Birth</b>
        <div class="xxxxxxxxxx2">
          <label id="place-birth"><%=family.getContactnumber() %></label>
          <input type="hidden" id="birth-place" name="contact">
        </div>
      </div>
      
      <div class="contact-email-parent">
        <b class="mothers-name">Contact Email</b>
        <div class="xxxxxx">
          <label id="email-1"><%=family.getEmail()%></label>
          <input type="hidden" id="email@1" name="email-">
        </div>
      </div>
      
      <div class="fathers-name-parent">
        <b class="mothers-name">Father&apos;s Name</b>
        <div class="xxxxxx">
          <label id="father-name"><%=family.getFathername() %></label>
          <input type="hidden" id="f-name" name="fathersname">
        </div>
      </div>
      
      
      <div class="rectangle-parent3">
        <div class="group-child16"></div>
        <img class="group-child17" alt="" src="./public/rectangle-9.svg" />
      </div>
      <div class="logout10"><div class="logout11">Logout</div></div>
      <div class="footer24">
        <div class="frame-parent2">
          <div class="sub-menu-wrapper3">
            <div class="sub-menu5">
              Terms & Conditions | Privacy Policy | Accessibility | Legal |
            </div>
          </div>
          <div class="copyright-wrapper3">
            <div class="sub-menu5">
              Copyright © 2023 Zcientia Labs - All Rights Reserved.
            </div>
          </div>
        </div>
      </div>

       <!-- Save Button -->
       <button class="save-button" id="save1" style="display: none;" ><div class="save">SAVE</div></button>
       <!-- End of Save button -->
       
      <nav class="left-nav-bar3" id="nab-bar">
        <img class="qtq-95-1-icon5" alt="" src="./public/qtq-95-12@2x.png" />
        <div class="hi-user-button3">
          <button class="rectangle-button"></button
          ><a class="view-my-info4" href="./personal.html">View my info</a>
          <div class="hi-user4">Hi User</div>
          <img
            class="setting-1-icon4"
            alt=""
            src="./public/setting-11@2x.png"
          /><img class="user-1-14" alt="" src="./public/user-1-11@2x.png" />
        </div>
        <a class="home-button3" href="./Userdashboard.html"
          ><img class="home-icon4" alt="" src="./public/home1@2x.png" />
          <div class="home6">Home</div></a
        >
        <div class="salary-and-payroll-button3">
          <img class="home-icon4" alt="" src="./public/salary2@2x.png" />
          <div class="salary-payroll4">Salary & Payroll</div>
        </div>
        <div class="recruitment-button3">
          <img class="home-icon4" alt="" src="./public/research1@2x.png" />
          <div class="recruitment4"><a href="/Recruitment module11/index.html">Recruitment</a></div>
        </div>
        <div class="recruitment-button3">
          <img class="home-icon4" alt="" src="./public/performance1@2x.png" />
          <div class="performance4">Performance</div>
        </div>
        <div class="recruitment-button3">
          <img class="home-icon4" alt="" src="./public/incentive1@2x.png" />
          <div class="benefits4">Benefits</div>
        </div>
        <div class="recruitment-button3">
          <img class="home-icon4" alt="" src="./public/calendar1@2x.png" />
          <div class="attendance4"><a href="/Attendance Module/listofemployee.html">Attendance</a> </div>
        </div>
        <div class="recruitment-button3">
          <img class="home-icon4" alt="" src="./public/learning1@2x.png" />
          <div class="learning4">Onboarding</div>
        </div>
        <div class="recruitment-button3">
          <img class="home-icon4" alt="" src="./public/healthcare1@2x.png" />
          <div class="wellness4">Wellness</div>
        </div>
        <div class="recruitment-button3">
          <img class="home-icon4" alt="" src="./public/rules1@2x.png" />
          <div class="rules4">Rules</div>
        </div>
      </nav>
    </div>
    <script src="./family.js"></script>
  </form>
  <button class="editing-1" onclick="editbutton1()">
    <img
      class="editing-1-icon"
      alt=""
      src="./public/editing-1@2x.png"/>
    </button>
    <button class="editing-2" onclick="editbutton2()">
      <img class="editing-1-icon" alt="" src="./public/editing-1@2x.png" />
    </button>
  </body>
</html>