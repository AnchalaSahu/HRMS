<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     
    <%@ page import="com.demo.zcienta.HRaccountDAO" %>
<%@ page import="com.demo.zcienta.HRaccounts" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./global.css" />
    <link rel="stylesheet" href="./HRaccount.css" />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800&display=swap"
    />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Inter:ital,wght@0,400;0,700;1,500&display=swap"
    />
<title>HR Account</title>
</head>
<body>

<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
response.setHeader("Pragma", "no-cache"); 
response.setDateHeader("Expires", 0); // Proxies.

 //if(session.getAttribute("")==null)
   // response.sendRedirect("HRlogin.jsp");
%>

  <form method="post" action="hraccount">
  
 
    <%
   

        HRaccountDAO hraccountsDAO = new HRaccountDAO();
      	
        HttpSession sess = request.getSession(false);
        String email = sess.getAttribute("email").toString();
        
        System.out.println("Email in JSP Page: " + email);
        
        HRaccounts accounts = hraccountsDAO.getEmployee(email);
    	
   
      	
      %>
    <div class="accountsemployeeinfo">
      <div class="accountsemployeeinfo-child"></div>
      <div class="accountsemployeeinfo-item"></div>
      <div class="employee-information3">Employee Information</div>
      
      <button class="hr-controls1">
        <a  href="./HRsearch.html">HR Controls</a>
      </button>

      <a class="logout-13" href="./HRLogoutServlet"></a>
      <div class="accountsemployeeinfo-inner"></div>
      <a class="personal3" href=".hrpersonal.jsp">Personal</a
      ><b class="accounts3">Accounts</b
      ><a class="family3" href="./hrfamily.jsp">Family</a
      ><a class="employment-job3" href="./hremployment.jsp">Employment & Job</a
      ><a class="assets3" href="./hrassets.jsp">Assets</a>
      <div class="accountsemployeeinfo-child1"></div>
      <div class="accountsemployeeinfo-child2"></div>
      <div class="accountsemployeeinfo-child3"></div>
      <b class="bank-account">BANK ACCOUNT</b
      ><b class="pf-account">PF ACCOUNT</b><b class="other-ids">OTHER ID&apos;s</b>
      <div class="bank-account-number-parent">
        <b class="bank-account-number" >Bank Account Number</b>
       
        <div class="xxxxxxxxxxxxxxxxx"> 
          <label id="bank-account-number">
            <label id="bank-account"><%=accounts.getAccountnumber() %></label>
          <input type="hidden" id="account" name="accountnumber">
          </div>
      </div>
      
      <div class="eligibility-parent">
        <b class="bank-account-number">Eligibility</b>
        <div class="xxxxxxxxxxxxxxxxx">
          <label id="eligible"><%=accounts.getEligibility() %></label>
          <input type="hidden" id="eligibility" name="eligibility">
        </div> 
      </div>
      <div class="pf-number-parent">
        <b class="bank-account-number">PF Number</b>
        <div class="xxxxxxxxxxxxxxxxx" >
          <label id="pf-number"><%=accounts.getPfnumber() %></label>
          <input type="hidden" id="pf" name="pfnumber">
        </div>
      </div>
      <div class="kyc-document-parent">
        <b class="bank-account-number">KYC Document</b>
        <div class="xxxxxxxxxxxxxxxxx">
          <label id="kycdocument-2"><%=accounts.getKycdocument() %></label>
          <input type="hidden" id="kyc-doc" name="kycdocument">
        </div>
      </div>

      <div class="kyc-status-parent">
        <b class="bank-account-number">KYC Status</b>
        <div class="xxxxxxxxxxxxxxxxx">
          <label id="kyc-status"><%=accounts.getKycstatus() %></label>
          <input type="hidden" id="kyc-status1" name="kycstatus">
        </div>
      </div>
      <div class="aadhar-parent">
        <b class="bank-account-number">AADHAR</b>
        <div class="xxxxxxxxxxxxxxxxx">xxxxxxxxxx</div>
      </div>
      <div class="bank-xxxxx-for-identification-parent">
        <b class="bank-xxxxx-for">Bank XXXXX for Identification</b>
        <div class="xxxxxxxxxxxxxxxxx">xxxxxxxxxx</div>
      </div>
      <div class="panpermanant-account-number-parent">
        <b class="panpermanant-account-number">PAN(Permanant Account Number)</b>
        <div class="xxxxxxxxxxxxxxxxx">xxxxxxxxxx</div>
      </div>
      <div class="bank-branch-parent">
        <b class="bank-account-number">Bank Branch</b>
        <div class="xxxxxxxxxxxxxxxxx">
          <label id="bank-branch">
            <label id="bank-branch1"><%=accounts.getBankbranch() %></label>
          <input type="hidden" id="bnk-branch" name="bankbranch">
          </label>
        </div>
      </div>
     
        <div class="uan-parent">
        <b class="bank-account-number">UAN</b>
        <div class="xxxxxxxxxxxxxxxxx">
          <label id="uan-1"><%=accounts.getUan() %></label>
          <input type="hidden" id="uan" name="uan">
        </div>
      </div>
      <div class="verifiedunverified-wrapper">
        <div class="verifiedunverified">verified/unverified</div>
      </div>
      <div class="verifiedunverified-container">
        <div class="verifiedunverified">verified/unverified</div>
      </div>
      <div class="verifiedunverified-frame">
        <div class="verifiedunverified">verified/unverified</div>
      </div>
      <div class="more-wrapper"><button class="more">More</button></div>
      <button class="more-container"><b class="more1">More</b></button>
      <div class="bank-name-parent" >
        <b class="bank-account-number">Bank Name</b>
        <div class="xxxxxxxxxxxxxxxxx">
          <label id="bank-name"><%=accounts.getBankname() %></label>
          <input type="hidden" id="bnk-name" name="bankname">
        </div>
        
      </div>
     
      <div class="edit-button" >

        <button class="editing-3" >
        <img
          class="editing-1-icon2 "
          alt=""
          src="./public/editing-1@2x.png"
        /></button>
      </div>
        
      <div class="rectangle-parent4">
        <div class="group-child18"></div>
        <img class="group-child19" alt="" src="./public/rectangle-9.svg" />
      </div>
      <div class="logout12"><div class="logout13">Logout</div></div>
      <div class="footer25">
        <div class="frame-parent3">
          <div class="sub-menu-wrapper4">
            <div class="sub-menu6">
              Terms & Conditions | Privacy Policy | Accessibility | Legal |
            </div>
          </div>
          <div class="copyright-wrapper4">
            <div class="sub-menu6">
              Copyright © 2023 Zcientia Labs - All Rights Reserved.
            </div>
          </div>
        </div>
      </div>

       <!-- Save Button -->
      <!--<button class="save-button" id="save1"><div class="save">SAVE</div></button>   --> 
      <input type="submit" value="save" class="save-button" id="save1">  
       <!-- End of Save button -->
       
      <nav class="left-nav-bar4" id="nab-bar">
        <img class="qtq-95-1-icon6" alt="" src="./public/qtq-95-12@2x.png" />
        <div class="hi-user-button4">
          <button class="hi-user-button-child1"></button
          ><a class="view-my-info5" href="./HRpersonal.html">View my info</a>
          <div class="hi-user5">Hi User</div>
          <img
            class="setting-1-icon5"
            alt=""
            src="./public/setting-11@2x.png"
          /><img class="user-1-15" alt="" src="./public/user-1-11@2x.png" />
        </div>
        <a class="home-button4" href="./HRdashboard.html"
          ><img class="home-icon5" alt="" src="./public/home1@2x.png" />
          <div class="home7">Home</div></a
        >
        <div class="salary-and-payroll-button4">
          <img class="home-icon5" alt="" src="./public/salary2@2x.png" />
          <div class="salary-payroll5">Salary & Payroll</div>
        </div>
        <div class="recruitment-button4">
          <img class="home-icon5" alt="" src="./public/research1@2x.png" />
          <div class="recruitment5"><a href="/Recruitment module11/index.html">Recruitment</a> </div>
        </div>
        <div class="recruitment-button4">
          <img class="home-icon5" alt="" src="./public/performance1@2x.png" />
          <div class="performance5">Performance</div>
        </div>
        <div class="recruitment-button4">
          <img class="home-icon5" alt="" src="./public/incentive1@2x.png" />
          <div class="benefits5">Benefits</div>
        </div>
        <div class="recruitment-button4">
          <img class="home-icon5" alt="" src="./public/calendar1@2x.png" />
          <div class="attendance5"><a href="/Attendance Module/listofemployee.html">Attendance</a> </div>
        </div>
        <div class="recruitment-button4">
          <img class="home-icon5" alt="" src="./public/onboarding.png" />
          <div class="learning5"> <a href="./Onboarding.html">Onboarding</a></div>
        </div>
        <div class="recruitment-button4">
          <img class="home-icon5" alt="" src="./public/healthcare1@2x.png" />
          <div class="wellness5">Wellness</div>
        </div>
        <div class="recruitment-button4">
          <img class="home-icon5" alt="" src="./public/rules1@2x.png" />
          <div class="rules5">Rules</div>
        </div>
      </nav>
    </div>
    <script src="./HRaccount.js"></script>
    
    </form>
    
     <div class="edit-button" onclick="editbutton()">
      <button class="editing-11">
        <img
          class="editing-1-icon2"
          alt=""
          src="./public/editing-1@2x.png"
        /></button>
      </div>
      
      <button class="editing-21" onclick="editbutton2()">
        <img class="editing-1-icon2" alt="" src="./public/editing-1@2x.png" />
      </button>
  </body>
</html>