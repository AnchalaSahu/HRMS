<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.demo.zcienta.PersonalDAO" %>
<%@ page import="com.demo.zcienta.Personal" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="initial-scale=1, width=device-width" />
    <link rel="stylesheet" href="./global.css" />
    <link rel="stylesheet" href="./personal.css" />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800&display=swap"
    />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Inter:ital,wght@0,400;0,700;1,500&display=swap"
    />
    <title>Personal Information</title>
  </head>
  <body>
  <%
  response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
  %>
    <form method="post" action="personal">
    <div class="personalemployeeinfo">
      <div class="personalemployeeinfo-child"></div>
      <div class="personalemployeeinfo-item"></div>
      <div class="employee-information5">Employee Information</div>
      <a class="logout-15" href="./logoutServlet"></a>
      <div class="personalemployeeinfo-inner"></div>
      <b class="personal4">Personal</b
      ><a class="accounts4" href="./account.jsp" id="accounts">Accounts</a
      ><a class="family4" href="./family.jsp">Family</a
      ><a class="employment-job4" href="./employement job.html">Employment & Job</a
      ><a class="assets5" href="./Assets.html">Assets</a>
      <div class="personalemployeeinfo-child1"></div>
      <div class="personalemployeeinfo-child2"></div>
      <b class="profile">PROFILE</b
      ><img class="user-2-11" alt="" src="./public/user-2-11@2x.png" />
      <div class="name-container">
      <%
      	PersonalDAO personalDAO = new PersonalDAO();
      	
        HttpSession sess = request.getSession(false);
        String email = sess.getAttribute("email").toString();
        
        System.out.println("Email in JSP Page: " + email);
        
      	Personal personal = personalDAO.getEmployee(email);
      	
      	
      %>
        <b class="employee-id">Name</b>
        <div class="xxx">
          <label id="name"><%=personal.getName() %></label>
          <input type="hidden" id="name-1" name="name">
        </div>
      </div>
      <div class="employee-id-parent">
        <b class="employee-id">Employee ID</b>
        <div class="xxx">
        
          <label id="employe-id"><%= personal.getEmployeeid() %></label>
          
          <input type="hidden" id="employ-id" name="employeeid">
        </div>
      </div>
      
      <div class="phone-2-parent">
        <b class="employee-id">Phone 2</b>
        <div class="xxx">
          <label id="phone-2"><%=personal.getPhone2() %></label>
          <input type="hidden" id="phon-2"name="phone2">
        </div>
      </div>
      
      <div class="primary-contact-no-group">
        <b class="employee-id">Primary Contact No.</b>
        <div class="xxx">
          <label id="primary-contact"><%=personal.getPrimarycontac1()%>x</label>
          <input type="hidden" id="contact"name="contact1">
        </div>
      </div>
      
      <div class="primary-contact-no-container">
        <b class="employee-id">Primary Contact No.</b>
        <div class="xxx">
          <label id="primary-contact1"><%=personal.getPrimarycontact2() %></label>
          <input type="hidden" id="contact1" name="contact2">
        </div>
      </div>
      
      <div class="contact-email-container">
        <b class="employee-id">Contact Email</b>
        <div class="xxx">
          <label id="email-1"><%=personal.getEmail1()%></label>
          <input type="hidden" id="email@1" name="email1">
        </div>
      </div>
      
      <div class="designation-group">
        <b class="employee-id">Designation</b>
        <div class="xxx">
          <label id="desg-1"><%= personal.getDesignation() %></label>
          <input type="hidden" id="desg@1" name="designation">
        </div>
      </div>
      
      <div class="contact-email-parent1">
        <b class="employee-id">Contact Email</b>
        <div class="xxx">
          <label id="email-2"><%=personal.getEmail2() %></label>
          <input type="hidden" id="email@2" name="email2">
        </div>
      </div>
      
      <div class="extension-group">
        <b class="employee-id">Extension</b>
        <div class="xxx">
          <label id="extension-1"><%=personal.getExtension1() %></label>
          <input type="hidden" id="extension@1" name="extension1">
        </div>
      </div>
      
      <div class="extension-container">
        <b class="employee-id">Extension</b>
        <div class="xxx">
          <label id="extension-2"><%=personal.getExtension2() %></label>
          <input type="hidden" id="extension@2" name="extension2">
        </div>
      </div>
      <div class="location-group">
        <b class="employee-id">Location</b>
        <div class="xxx">
          <label id="location-1"><%=personal.getLocation() %></label>
          <input type="hidden" id="location@1" name="location">
        </div>
      </div>
      
      
      <div class="logout16"><div class="logout17">Logout</div></div>
      
  
      <img class="group-icon5" alt="" src="./public/group1.svg" />
      <div class="listbox-component6">
        <div class="listbox-title36">
          <b class="contact-address35">ADDRESS</b>
        </div>
        <div class="listbox-main35">
          <div class="listboxbg30"></div>
          <img class="chevron-icon35" alt="" src="./public/chevron2.svg" />
          <div class="placeholder-text36">
            <div class="contact-address35">Contact Address</div>
            
          </div>
        </div>
        <div class="clip-list35">
          <div class="dropdown-list41">
            <div class="item-135">
              <div class="div151">Emergency Contact</div>
            </div>
            <div class="item-135">
              <div class="div151">Permanent Address</div>
            </div>
            <div class="item-135">
              <div class="div151">Present Address</div>
            </div>
            <div class="item-135"><div class="div151">Spouse Address</div></div>
          </div>
        </div>
      </div>
      <div class="personalemployeeinfo-child4"></div>
      <b class="more-details2">MORE DETAILS</b
      ><b class="more-details3">MORE DETAILS</b>
      <div class="date-of-birth-group">
        <b class="employee-id">Date Of Birth</b>
        <div class="xxx">
          <label id="date-of-birth"><%=personal.getDatebirth() %></label>
          <input type="hidden" id="dob-1" name="dob">
        </div>
      </div>
      
      <div class="blood-group-parent">
        <b class="employee-id">Blood Group</b>
        <div class="xxx">
          <label id="blood-group"><%=personal.getBloodgroup() %></label>
          <input type="hidden" id="blood" name="bloodgroup">
        </div>
      </div>
      
      <div class="residential-status-parent">
        <b class="employee-id">Residential Status</b>
        <div class="xxx">
          <label id="residential-status"><%=personal.getResidentialstatus() %></label>
          <input type="hidden" id="resid"name="residential">
        </div>
      </div>
      
      <div class="marital-status-parent">
        <b class="employee-id">Marital Status</b>
        <div class="xxx">
          <label id="marital-status"><%=personal.getMaritialstatus() %></label>
          <input type="hidden" id="married" name="maritialstatus">
        </div>
      </div>
      
      <div class="driving-license-number-parent">
        <b class="employee-id">Driving License Number</b>
        <div class="xxx">
          <label id="driving-license"><%=personal.getDrivinglicense() %></label>
          <input type="hidden" id="driving-1"name="drivinglicense">
        </div>
      </div>
      
      <div class="mother-tongue-parent">
        <b class="employee-id">Mother Tongue</b>
        <div class="xxx">
          <label id="mother-tongue"><%=personal.getMothertongue() %></label>
          <input type="hidden" id="tongue"name="mothertongue">
        </div>
      </div>
      
      <div class="place-of-birth-parent">
        <b class="employee-id">Place Of Birth</b>
        <div class="xxx">
          <label id="place-birth"><%=personal.getPlacebirth() %></label>
          <input type="hidden" id="birth-place"name="placebirth">
        </div>
      </div>
      
      <div class="physically-challenged-parent">
        <b class="employee-id">Physically Challenged</b>
        <div class="xxx">
          <label id="physically-challenged"><%=personal.getPhysicallychallenged() %></label>
          <input type="hidden" id="physically"name="physically">
        </div>
      </div>
      
      <div class="aadhar-number-parent">
        <b class="employee-id">AADHAR Number</b>
        <div class="xxx">
          <label id="aadhar-number"><%=personal.getAadharnumber() %></label>
          <input type="hidden" id="aadhar1"name="aadhar"> 
        </div>
      </div>
     
      <div class="footer27">
        <div class="frame-parent7">
          <div class="sub-menu-wrapper6">
            <div class="sub-menu8">
              Terms & Conditions | Privacy Policy | Accessibility | Legal |
            </div>
          </div>
          <div class="copyright-wrapper6">
            <div class="sub-menu8">
              Copyright © 2023 Zcientia Labs - All Rights Reserved.
            </div>
          </div>
        </div>
      </div>


      <!-- Save Button -->
      <button class="save-button"id="save1" ><div class="save"  >SAVE</div>
      </button>
      <!-- End of Save button -->

      </div>
      <nav class="left-nav-bar6" id="nab-bar">
        <img class="qtq-95-1-icon8" alt="" src="./public/qtq-95-12@2x.png" />
        <div class="hi-user-button6">
          <button class="hi-user-button-child3"></button
          ><a class="view-my-info7" href="./personal.html">View my info</a>
          <div class="hi-user7">Hi User</div>
          <img
            class="setting-1-icon7"
            alt=""
            src="./public/setting-11@2x.png"
          /><img class="user-1-17" alt="" src="./public/user-1-11@2x.png" />
        </div>
        <a class="home-button6" href="./Userdashboard.html"
          ><img class="home-icon7" alt="" src="./public/home1@2x.png" />
          <div class="home9">Home</div></a
        >
        <div class="salary-and-payroll-button6">
          <img class="home-icon7" alt="" src="./public/salary2@2x.png" />
          <div class="salary-payroll7">Salary & Payroll</div>
        </div>
        <button class="recruitment-button6">
          <img class="home-icon7" alt="" src="./public/research1@2x.png" />
          <div class="recruitment7"><a href="../Recruitment module11/index.html">Recruitment</a> </div></button
        ><button class="recruitment-button6">
          <img class="home-icon7" alt="" src="./public/performance1@2x.png" />
          <div class="performance7">Performance</div></button
        ><button class="recruitment-button6">
          <img class="home-icon7" alt="" src="./public/incentive1@2x.png" />
          <div class="benefits7">Benefits</div></button
        ><button class="recruitment-button6">
          <img class="home-icon7" alt="" src="./public/calendar1@2x.png" />
          <div class="attendance7"><a href="../Attendance Module/listofemployee.html">Attendance</a> </div></button
        ><button class="recruitment-button6">
          <img class="home-icon7" alt="" src="./public/learning1@2x.png" />
          <div class="learning7">Learning</div></button
        ><button class="recruitment-button6">
          <img class="home-icon7" alt="" src="./public/healthcare1@2x.png" />
          <div class="wellness7">Wellness</div></button
        ><button class="recruitment-button6">
          <img class="home-icon7" alt="" src="./public/rules1@2x.png" />
          <div class="rules7">Rules</div>
        </button>
      </nav>
    </div>
    </form>
    <button class="editing-13" onclick="editbutton1()">
        <img
          class="editing-1-icon6"
          alt=""
          src="./public/editing-1@2x.png"
        /></button>
      
        <button class="editing-22" onclick="editbutton2()">
        <img class="editing-1-icon6" alt="" src="./public/editing-1@2x.png" />
      </button>
      
       <button class="editing-31" onclick="editbutton3()">
        <img class="editing-1-icon6" alt="" src="./public/editing-1@2x.png" />
      </button>
     
    <script>
      var accounts = document.getElementById("accounts");
      if (accounts) {
        accounts.addEventListener("click", function (e) {
          window.location.href = "./personal.html";
        });
        
      }
      
      
      </script>
      <script src="./personal.js"></script>
  </body>
</html>
