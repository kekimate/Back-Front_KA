document.addEventListener("DOMContentLoaded", function() {
    let sotetHatter = false;
    const gomb = document.getElementById("hattervaltoztato");

    gomb.addEventListener("click", function() {
      if (sotetHatter)
      {
        document.body.style.backgroundColor = "#f0f0f0";
      }
      else
      {
        document.body.style.backgroundColor = "#333";
      }
      sotetHatter = !sotetHatter;
    });
  });