function editbutton1()
{
    let experience=document.getElementById("experience-1").innerText;
    document.getElementById("experience-1").style.display="none";
    let a=document.getElementById("experience@1");
    a.setAttribute('type','text');
    a.type='text';
    a.setAttribute("value",experience); 

    
    let DOJ=document.getElementById("DOJ-1").innerText;
    document.getElementById("DOJ-1").style.display="none";
    let b=document.getElementById("DOJ@1");
    b.setAttribute('type','text');
    b.type='text';
    b.setAttribute("value",DOJ); 

    let Desgination=document.getElementById("Desginatin-1").innerText;
    document.getElementById("Desginatin-1").style.display="none";
    let c=document.getElementById("Desginatin@1");
    c.setAttribute('type','text');
    c.type='text';
    c.setAttribute("value",Desgination); 
}

function editbutton2(){
    let reporting=document.getElementById("reporting-1").innerText;
    document.getElementById("reporting-1").style.display="none";
    let a=document.getElementById("reporting@1");
    a.setAttribute('type','text');
    a.type='text';
    a.setAttribute("value",reporting); 

    let team=document.getElementById("teamcapacity-1").innerText;
    document.getElementById("teamcapacity-1").style.display="none";
    let b=document.getElementById("teamcapacity@1");
    b.setAttribute('type','text');
    b.type='text';
    b.setAttribute("value",team); 

    let shift=document.getElementById("shift-1").innerText;
    document.getElementById("shift-1").style.display="none";
    let c=document.getElementById("shift@1");
    c.setAttribute('type','text');
    c.type='text';
    c.setAttribute("value",shift); 

    let timing=document.getElementById("timing-1").innerText;
    document.getElementById("timing-1").style.display="none";
    let d=document.getElementById("timing@1");
    d.setAttribute('type','text');
    d.type='text';
    d.setAttribute("value",timing); 

    let breakings=document.getElementById("break-1").innerText;
    document.getElementById("break-1").style.display="none";
    let e=document.getElementById("break@1");
    e.setAttribute('type','text');
    e.type='text';
    e.setAttribute("value",breakings); 

    let working=document.getElementById("working-1").innerText;
    document.getElementById("working-1").style.display="none";
    let f=document.getElementById("working@1");
    f.setAttribute('type','text');
    f.type='text';
    f.setAttribute("value",working); 

}