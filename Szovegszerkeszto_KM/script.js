let isModified = false;

document.getElementById('filePicker').addEventListener('change', handleFileSelect);
document.getElementById('textEditor').addEventListener('input', markAsModified);
document.getElementById('saveButton').addEventListener('click', saveText);

window.addEventListener('beforeunload', function (e) {
  if (isModified) {
    const confirmationMessage = 'Nem mentett változások lehetnek. Biztosan elhagyja az oldalt?';
    (e || window.event).returnValue = confirmationMessage;
    return confirmationMessage;
  }
});

function handleFileSelect(event) {
  const file = event.target.files[0];
  if (file) {
    const reader = new FileReader();
    reader.onload = function (e) {
      document.getElementById('textEditor').value = e.target.result;
      isModified = false;
      updateFeedback('Fájl betöltve.');
    };
    reader.readAsText(file);
  }
}

function markAsModified() {
  isModified = true;
}

function saveText() {
  const textToSave = document.getElementById('textEditor').value;

  const blob = new Blob([textToSave], { type: 'text/plain' });

  const url = URL.createObjectURL(blob);
  const a = document.createElement('a');
  a.href = url;
  a.download = 'szerkesztett_fajl.txt';
  document.body.appendChild(a);
  a.click();

  document.body.removeChild(a);
  URL.revokeObjectURL(url);

  isModified = false;
  updateFeedback('Fájl mentve!');
}

function updateFeedback(message) {
  document.getElementById('feedbackMessage').textContent = message;
}