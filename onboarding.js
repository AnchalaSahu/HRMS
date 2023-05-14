function editbutton() {
  let user = document.getElementById("user1").innerText;
  document.getElementById("user1").style.display = "none";
  let a = document.getElementById("user@1");
  a.setAttribute("type", "text");
  a.type = "text";
  a.setAttribute("value", user);

  let employeeid = document.getElementById("Emp-1").innerText;
  document.getElementById("Emp-1").style.display = "none";
  let b = document.getElementById("emp@1");
  b.setAttribute("type", "text");
  b.type = "text";
  b.setAttribute("value", employeeid);

  let designation = document.getElementById("Sde-1").innerText;
  document.getElementById("Sde-1").style.display = "none";
  let c = document.getElementById("sde-1");
  c.setAttribute("type", "text");
  c.type = "text";
  c.setAttribute("value", designation);

  let contact = document.getElementById("primarycontact-1").innerText;
  document.getElementById("primarycontact-1").style.display = "none";
  let d = document.getElementById("primarycontact");
  d.setAttribute("type", "text");
  d.type = "text";
  d.setAttribute("value", contact);

  let email = document.getElementById("Email-1").innerText;
  document.getElementById("Email-1").style.display = "none";
  let e = document.getElementById("email-1");
  e.setAttribute("type", "text");
  e.type = "text";
  e.setAttribute("value", email);
}

// bulk sample

function post({ url, params = {}, payload = {} }) {
  return new Promise(function (resolve, reject) {
    let queryParams = new URLSearchParams(params);
    const requestUrl =
      url + `${Object.keys(params).length ? `?${queryParams}` : ""}`;
    const formData = new FormData();
    Object.keys(payload).forEach((key) => {
      formData.append(key, payload?.[key]);
    });
    const xhr = new XMLHttpRequest();
    xhr.open("POST", requestUrl, true);
    xhr.onload = function () {
      if (xhr.status === 200) {
        resolve(xhr.response);
      } else {
        reject(xhr.response);
      }
    };
    xhr.onerror = () => {
      reject({
        status: ShadowRoot.status,
        statusText: xhr.statusText,
      });
    };
    xhr.send(formData);
  });
}

const init = () => {
  var uploadLink = document.getElementById("uploadLink");
  var uploadModal = document.getElementById("uploadModal");
  var uploadForm = document.getElementById("uploadForm");
  var closeBtn = document.getElementsByClassName("close")[0];
  var enlistNewTeam = document.getElementById("enlistNewTeam");

  if (enlistNewTeam) {
    enlistNewTeam.addEventListener("click", function (e) {
      window.location.href = "./desktop-3.html";
    });
  }
  uploadLink.onclick = function () {
    uploadModal.classList.add("show-modal");
    document.getElementById('uploadModal').classList.add("show-modal");
  };

  closeBtn.onclick = function () {
    uploadModal.classList.remove("show-modal");
  };

  window.addEventListener("click", function (event) {
    if (event.target == uploadModal) {
      uploadModal.classList.remove("show-modal");
    }
  });

  let uploadBtnHandle = document.getElementById("bulk-upload-btn");
  uploadBtnHandle.onclick = async (event) => 
  {
    try {
      const fileInputHandle = document.getElementById("file");
      const file = fileInputHandle?.files?.[0];
      if (!file) throw new Error("File not available");
      await post({
        url: "/upload",
        params: {
          uploadType: "bulk",
        },
        payload: file,
      });
    } catch (error) {
      alert(error);
    }
  };
};

window.addEventListener("load", init, false);