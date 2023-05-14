<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        
    <%@ page import="com.demo.zcienta.HRemploymentDAO" %>
	<%@ page import="com.demo.zcienta.HRemployment" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <link rel="stylesheet" href="./global.css" />
    <link rel="stylesheet" href="./HRemployment.css" />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800&display=swap"
    />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Inter:ital,wght@0,400;0,700;1,500&display=swap"
    />
<title>HREmployment</title>
</head>
<body>



  
    <%
        HRemploymentDAO hremploymentDAO = new HRemploymentDAO();
      	
        HttpSession sess = request.getSession(false);
        String email = sess.getAttribute("email").toString();
        
        System.out.println("Email in JSP Page: " + email);
        
        HRemployment hremployment = hremploymentDAO.getEmployee(email);
      	
      	
      %>
  <form method="post" action="hremployment">

    <div class="jobemployeeinfo">
      <div class="jobemployeeinfo-child"></div>
      <div class="jobemployeeinfo-item"></div>
      <div class="employee-information1">Employee Information</div>

      <button class="hr-controls1">
        <a href="./hrsearch.jsp">HR Controls</a>
      </button>

      <a class="logout-11" href="./HRLogoutServlet"></a>
      <div class="jobemployeeinfo-inner"></div>
      <a class="personal1" href="./hrpersonal.jsp">Personal</a
      ><a class="accounts1" href="./hraccount.jsp">Accounts</a
      ><a class="family1" href="./hrfamily.jsp">Family</a
      >
      >
      <a class="employment-job1" href="./hremployment.jsp"><b>Employment & Job</b></a
      >
      <a class="assets1" href="./hrassets.jsp">Assets</a>
      
      
      <div class="jobemployeeinfo-child1"></div>
      <div class="jobemployeeinfo-child2"></div>
      <b class="employment-details">EMPLOYMENT DETAILS</b
      ><b class="team-details">TEAM DETAILS</b>
      <div class="reporting-to-parent">
      
        <b class="reporting-to">Reporting To</b>
        <div class="xxxxx">
          <label id="reporting-1" ><%=hremployment.getReporting() %></label>
          
          <input type="hidden"  id="reporting@1" name="reporting">
        </div>
      </div>
      
      <div class="shift-timings-parent">
        <b class="reporting-to">Shift Timings</b>
        <div class="xxxxx">
          <label id="timing-1" ><%=hremployment.getShiftTimings() %>
          </label>
          <input type="hidden"  id="timing@1" name="shifttiming">
        </div>
      </div>
      
      <div class="xx-wrapper">
      <div class="xx" style="z-index: 1">
        <label id="working-1" ><%=hremployment.getWorkingHours() %>
        </label>
        <input type="hidden"  id="working@1" name="worktime">
      </div></div>
      
      <div class="xx-container" style="z-index: 1"><div class="xx">
        <label id="break-1" ><%=hremployment.getBreakTime() %></label>
        
        <input type="hidden"  id="break@1" name="breaktime">
      </div>
    </div>
    
      <div class="team-capacity-parent">
        <b class="team-capacity">Team Capacity</b>
       <b class="reporting-to">Working Hours</b> -->
        <div class="xx2">
          <label id="teamcapacity-1" ><%=hremployment.getTeamCapacity() %>
          </label>
          <input type="hidden"  id="teamcapacity@1" name="teamcapacity">
        </div>
      </div>
      
      <div class="shift-type-parent">
        <b class="team-capacity">Shift Type</b
        ><b class="reporting-to">Break Time</b>
        <div class="xx2">
          <label id="shift-1" ><%=hremployment.getShiftType() %>
          </label>
          <input type="hidden"  id="shift@1" name="shifttype">
        </div>
      </div>
      
      <div class="group-parent1">
        <div class="designation-parent">
          <b class="reporting-to">Designation</b>
          <div class="xxxxx">
            <label id="Desginatin-1" ><%=hremployment.getDesignation() %>
            </label>
            <input type="hidden"  id="Desginatin@1" name="desgination">
          </div>
        </div>
        
        <div class="designation-parent">
          <b class="reporting-to">Date Of Joining</b>
          <div class="xxxxx">
            <label id="DOJ-1" ><%=hremployment.getDateOfJoining() %>
            </label>
            <input type="hidden"  id="DOJ@1" name="dateofjoin">
          </div>
        </div>
        
        <div class="designation-parent">
          <b class="reporting-to">Experience </b>
          <div class="xxxxx">
            <label id="experience-1" ><%=hremployment.getExperience() %>
            </label>
            <input type="hidden"  id="experience@1" name="experience">
          </div>
        </div>
      </div>
      
      <div class="rectangle-parent3">
        <div class="group-child16"></div>
        <img class="group-child17" alt="" src="./public/rectangle-9.svg" />
      </div>
      <div class="rectangle-parent2">
        <div class="group-child14"></div>
        <img class="group-child15" alt="" src="./public/rectangle-9.svg" />
      </div>
      <div class="logout8"><div class="logout9">Logout</div></div>
      <div class="footer23">
        <div class="frame-parent1">
          <div class="sub-menu-wrapper2">
            <div class="sub-menu4">
              Terms & Conditions | Privacy Policy | Accessibility | Legal |
            </div>
          </div>
          <div class="copyright-wrapper2">
            <div class="sub-menu4">
              Copyright © 2023 Zcientia Labs - All Rights Reserved.
            </div>
          </div>
        </div>
      </div>

       <!-- Save Button -->
       <button class="save-button"><div class="save">SAVE</div></button>
       <!-- End of Save button -->


      <nav class="left-nav-bar2" id="nab-bar">
        <img class="qtq-95-1-icon4" alt="" src="./public/qtq-95-12@2x.png" />
        <div class="hi-user-button2">
          <button class="hi-user-button-inner"></button
          ><a class="view-my-info3" href="./hrpersonal.jsp">View my info</a>
          <div class="hi-user3">Hi User</div>
          <img
            class="setting-1-icon3"
            alt=""
            src="./public/setting-11@2x.png"
          /><img class="user-1-13" alt="" src="./public/user-1-11@2x.png" />
        </div>
        <a class="home-button2" href="./HRdashboard.html"
          ><img class="home-icon3" alt="" src="./public/home1@2x.png" />
          <div class="home5">Home</div></a
        >
        <div class="salary-and-payroll-button2">
          <img class="home-icon3" alt="" src="./public/salary2@2x.png" />
          <div class="salary-payroll3">Salary & Payroll</div>
        </div>
        <div class="recruitment-button2">
          <img class="home-icon3" alt="" src="./public/research1@2x.png" />
          <div class="recruitment3"><a href="../Recruitment module11/index.html">Recruitment</a></div>
        </div>
        <div class="recruitment-button2">
          <img class="home-icon3" alt="" src="./public/performance1@2x.png" />
          <div class="performance3">Performance</div>
        </div>
        <div class="recruitment-button2">
          <img class="home-icon3" alt="" src="./public/incentive1@2x.png" />
          <div class="benefits3">Benefits</div>
        </div>
        <div class="recruitment-button2">
          <img class="home-icon3" alt="" src="./public/calendar1@2x.png" />
          <div class="attendance3"><a href="../Attendance Module/listofemployee.html">Attendance</a></div>
        </div>
        <div class="recruitment-button2">
          <img class="home-icon3" alt="" src="./public/onboarding.png" />
          <div class="learning3"><a href="./Onboarding.html">Onboarding</a></div>
        </div>
        <div class="recruitment-button2">
          <img class="home-icon3" alt="" src="./public/healthcare1@2x.png" />
          <div class="wellness3">Wellness</div>
        </div>
        <div class="recruitment-button2">
          <img class="home-icon3" alt="" src="./public/rules1@2x.png" />
          <div class="rules3">Rules</div>
        </div>
      </nav>
    </div>
    <script src="./HRemployment.js"></script>
      </form>
      
      
      <<button class="editing-1" onclick="editbutton1()">
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