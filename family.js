function editbutton1()
{
    let fathername=document.getElementById("father-name").innerText;
    document.getElementById("father-name").style.display="none";
    let a=document.getElementById("f-name");
    a.setAttribute('type','text');
    a.type='text';
    a.setAttribute("value",fathername);

    let fathercontact=document.getElementById("father-contact").innerText;
    document.getElementById("father-contact").style.display="none";
    let b=document.getElementById("f-contact");
    b.setAttribute('type','text');
    b.type='text';
    b.setAttribute("value",fathercontact);

    let mothercontact=document.getElementById("mother-contact").innerText;
    document.getElementById("mother-contact").style.display="none";
    let c=document.getElementById("m-contact");
    c.setAttribute('type','text');
    c.type='text';
    c.setAttribute("value",mothercontact);

    let motherdob=document.getElementById("mother-dob").innerText;
    document.getElementById("mother-dob").style.display="none";
    let d=document.getElementById("m-dob");
    d.setAttribute('type','text');
    d.type='text';
    d.setAttribute("value",motherdob);

    let fatherdob=document.getElementById("father-dob").innerText;
    document.getElementById("father-dob").style.display="none";
    let e=document.getElementById("f-dob");
    e.setAttribute('type','text');
    e.type='text';
    e.setAttribute("value",fatherdob);

    let mothername=document.getElementById("mother-name").innerText;
    document.getElementById("mother-name").style.display="none";
    let f=document.getElementById("m-name");
    f.setAttribute('type','text');
    f.type='text';
    f.setAttribute("value",mothername);

    let save=document.getElementById("save1").style.display="flex";


}
function editbutton2()
{
    
    let email=document.getElementById("email-1").innerText;
    document.getElementById("email-1").style.display="none";
    let a=document.getElementById("email@1");
    a.setAttribute('type','text');
    a.type='text';
    a.setAttribute("value",email);

    let birth=document.getElementById("place-birth").innerText;
    document.getElementById("place-birth").style.display="none";
    let b=document.getElementById("birth-place");
    b.setAttribute('type','text');
    b.type='text';
    b.setAttribute("value",birth);

    let date=document.getElementById("date-of-brth").innerText;
    document.getElementById("date-of-brth").style.display="none";
    let c=document.getElementById("dob");
    c.setAttribute('type','text');
    c.type='text';
    c.setAttribute("value",date);

    let spouse=document.getElementById("spouse-name").innerText;
    document.getElementById("spouse-name").style.display="none";
    let d=document.getElementById("spouse@name");
    d.setAttribute('type','text');
    d.type='text';
    d.setAttribute("value",spouse);

    let place=document.getElementById("palce=birth").innerText;
    document.getElementById("palce=birth").style.display="none";
    let e=document.getElementById("birth@place");
    e.setAttribute('type','text');
    e.type='text';
    e.setAttribute("value",place);

    let occupation=document.getElementById("occupation-1").innerText;
    document.getElementById("occupation-1").style.display="none";
    let f=document.getElementById("occupation@1");
    f.setAttribute('type','text');
    f.type='text';
    f.setAttribute("value",occupation);

    let save=document.getElementById("save1").style.display="flex";


}