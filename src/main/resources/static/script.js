const pendingTasks = document.getElementById('pending-tasks')
const finishedTasks = document.getElementById('finished-tasks')
var taches = [];
var tachesId = [];
// dataTransfer
// setData: Establece la información que queremos compartir
// getData: Establece la información que queremos obtener
pendingTasks.addEventListener('dragstart', (e) => {
    e.dataTransfer.setData('text/plain', e.target.id)
})

pendingTasks.addEventListener('drag', (e) => {
    e.target.classList.add('active')
})

pendingTasks.addEventListener('dragend', (e) => {
    e.target.classList.remove('active')
})

// OBLIGATORIO, SI NO, NO FUNCIONA
finishedTasks.addEventListener('dragover', (e) => {
    e.preventDefault()
})

finishedTasks.addEventListener('drop', (e) => {
    e.preventDefault()
    const element = document.getElementById(e.dataTransfer.getData('text'))
    element.classList.remove('active')
    finishedTasks.appendChild(pendingTasks.removeChild(element))
})

function valider(){
	
		alert('Vous avez valider!')
		
		var elem = document.getElementById('finished-tasks');
		var elint = elem.getElementsByClassName('task')
		
		for(i=0;i<elint.length;i++){
			
			taches.push(elint[i].innerHTML);
			tachesId.push(elint[i].id);
			
		}
		
		alert('longueur taches:' + tachesId[0])
		envoyer()
		
}

function envoyer(){
	
	alert('Envoi!')
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	//alert('Envoi!')
	    }
	  };
	  xhttp.open("GET", "http://localhost:8081/taches", true);
	  xhttp.send();
	  window.location.assign("http://localhost:8081/taches")
	
}

function envoyer2(){
	
	alert('Envoi!')
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	//alert('Envoi!')
	    }
	  };
	  http.open("POST", "http://localhost:8081/taches2", true);
	  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	  xhttp.send(tachesId); 
	
}