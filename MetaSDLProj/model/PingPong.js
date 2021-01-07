function inputidlestart() {
if (document.getElementById('currentStatepPing').innerHTML == 'idle') {
document.getElementById('currentStatepPing').innerHTML = 'running';
document.getElementById('idle-running').classList.remove('active');
document.getElementById('running-running').classList.add('active');
document.getElementById('output-idle-running').style['display'] = 'initial';
setTimeout(function() {document.getElementById('output-idle-running').style['display'] = 'none'}, 2000);
}
}

function inputrunningpong() {
if (document.getElementById('currentStatepPing').innerHTML == 'running') {
document.getElementById('currentStatepPing').innerHTML = 'running';
document.getElementById('running-running').classList.remove('active');
document.getElementById('running-running').classList.add('active');
document.getElementById('output-running-running').style['display'] = 'initial';
setTimeout(function() {document.getElementById('output-running-running').style['display'] = 'none'}, 2000);
}
}

function inputidleping() {
if (document.getElementById('currentStatepPong').innerHTML == 'idle') {
document.getElementById('currentStatepPong').innerHTML = 'idle';
document.getElementById('idle-idle').classList.remove('active');
document.getElementById('idle-idle').classList.add('active');
document.getElementById('output-idle-idle').style['display'] = 'initial';
setTimeout(function() {document.getElementById('output-idle-idle').style['display'] = 'none'}, 2000);
}
}

