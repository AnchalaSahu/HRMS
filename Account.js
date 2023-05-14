function editbutton() 
{
    
    let bankname=document.getElementById("bank-name").innerText;
    document.getElementById("bank-name").style.display="none";
    let y=document.getElementById("bnk-name");
    y.setAttribute('type','text');
    y.type='text';
    y.setAttribute("value",bankname); 

    let bankaccount=document.getElementById("bank-account").innerText;
    document.getElementById("bank-account").style.display="none";
    let a=document.getElementById("account");
    a.setAttribute('type','text');
    a.type='text';
    a.setAttribute("value",bankaccount);

    let bankbranch=document.getElementById("bank-branch1").innerText;
    document.getElementById("bank-branch1").style.display="none";
    let e=document.getElementById("bnk-branch");
    e.setAttribute('type','text');
    e.type='text';
    e.setAttribute("value",bankbranch);

    var sa=document.getElementById("save1").style.display="flex";

 
}
function editbutton2()
{
    
    
    let eligibility=document.getElementById("eligible").innerText;
    document.getElementById("eligible").style.display="none";
    let z=document.getElementById("eligibility");
    z.setAttribute('type','text');
    z.type='text';
    z.setAttribute("value",eligibility);

   

    let pfaccount=document.getElementById("pf-number").innerText;
    document.getElementById("pf-number").style.display="none";
    let b=document.getElementById("pf");
    b.setAttribute('type','text');
    b.type='text';
    b.setAttribute("value",pfaccount);

    let kycdocument=document.getElementById("kycdocument-2").innerText;
    document.getElementById("kycdocument-2").style.display="none";
    let c=document.getElementById("kyc-doc");
    c.setAttribute('type','text');
    c.type='text';
    c.setAttribute("value",kycdocument);

    let kycstatus=document.getElementById("kyc-status").innerText;
    document.getElementById("kyc-status").style.display="none";
    let d=document.getElementById("kyc-status1");
    d.setAttribute('type','text');
    d.type='text';
    d.setAttribute("value",kycstatus);

   

    let UAN=document.getElementById("uan-1").innerText;
    document.getElementById("uan-1").style.display="none";
    let f=document.getElementById("uan");
    f.setAttribute('type','text');
    f.type='text';
    f.setAttribute("value",UAN);

    var sa=document.getElementById("save1").style.display="flex";

}