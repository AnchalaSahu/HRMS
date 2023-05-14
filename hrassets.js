function editbutton1()
{
    let desktop=document.getElementById("desktop-1").innerText;
    document.getElementById("desktop-1").style.display="none";
    let a=document.getElementById("desktop@1");
    a.setAttribute('type','text');
    a.type='text';
    a.setAttribute("value",desktop); 

    let access=document.getElementById("access-1").innerText;
    document.getElementById("access-1").style.display="none";
    let b=document.getElementById("access@1");
    b.setAttribute('type','text');
    b.type='text';
    b.setAttribute("value",access); 

    let accessory=document.getElementById("accessory-1").innerText;
    document.getElementById("accessory-1").style.display="none";
    let c=document.getElementById("accessory@1");
    c.setAttribute('type','text');
    c.type='text';
    c.setAttribute("value",accessory); 
    
    
     var sa=document.getElementById("save1").style.display="flex";
    
    
   

}


