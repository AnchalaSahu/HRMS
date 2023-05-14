let stopwatchTime = 0;
  let stopwatchInterval;

  function startStopwatch() {
    if (stopwatchInterval) {
      // If stopwatch is already running, stop it
      clearInterval(stopwatchInterval);
      stopwatchInterval = null;
    } else {
      // If stopwatch is not running, start it
      stopwatchInterval = setInterval(() => {
        stopwatchTime++;
        let hours = Math.floor(stopwatchTime / 3600);
        let minutes = Math.floor((stopwatchTime - hours * 3600) / 60);
        let seconds = stopwatchTime - hours * 3600 - minutes * 60;
        document.getElementById("stopwatch").textContent = `${hours.toString().padStart(2, '0')}:${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}`;
      }, 1000);
    }
  }


function clockin() {
  const inButton = document.querySelector('.in-button');
  const loginTime = document.querySelector('.login-time');
  const dateTime = getFormattedDateTime();
  loginTime.textContent = `Login Time: ${dateTime.time}`;
  document.querySelector('.ddmmyyyy').textContent = dateTime.date;
  inButton.disabled = true;
}

function clockout() {
  const outButton = document.querySelector('.out-button');
  const logoutTime = document.querySelector('.logout-time');
  const dateTime = getFormattedDateTime();
  logoutTime.textContent = `Logout Time: ${dateTime.time}`;
  document.querySelector('.ddmmyyyy').textContent = dateTime.date;
  outButton.disabled = true;
}

function getFormattedDateTime() {
  const date = new Date();
  const hour = date.getHours();
  const minute = date.getMinutes();
  const ampm = hour >= 12 ? 'pm' : 'am';
  const formattedHour = hour % 12 === 0 ? 12 : hour % 12;
  const formattedMinute = minute.toString().padStart(2, '0');
  const time = `${formattedHour}:${formattedMinute} ${ampm}`;
  const day = date.getDate();
  const month = date.getMonth() + 1;
  const year = date.getFullYear();
  const formattedDate = `${day}/${month}/${year}`;
  return { time, date: formattedDate };
}

var a=document.getElementById("good-morning")
var today = new Date()
var curHr = today.getHours()
if (curHr < 12 ) {
    a.innerHTML="Good Morning User";
} else if (curHr >= 12 && curHr < 16) {
    a.innerHTML="Good Afternoon User";
} 
else if (curHr >= 16 && curHr < 20) {
    a.innerHTML="Good Evening User";
} 
else {
    a.innerHTML="Good Night User";
}