document.addEventListener("DOMContentLoaded", function() {
  let sotetHatter = false;
  let gomb = document.getElementById("hattervaltoztato");
  let body = document.body;
  let oraElemek = [
      {
        nap: "Hétfő",
        orak: [
          { id: "ora-1", ido: "8:00 - 9:30", tantargy: "Matematika" },
          { id: "ora-2", ido: "10:00 - 11:30", tantargy: "Irodalom" }
        ]
      },

      {
        nap: "Kedd",
        orak: [
          { id: "ora-1", ido: "8:00 - 9:30", tantargy: "Történelem" },
          { id: "ora-2", ido: "10:00 - 11:30", tantargy: "Fizika" }
        ]
      },

      {
        nap: "Szerda",
        orak: [
          { id: "ora-1", ido: "8:00 - 9:30", tantargy: "Kémia" },
          { id: "ora-2", ido: "10:00 - 11:30", tantargy: "Matematika" }
        ]
      },

      {
        nap: "Csütörtök",
        orak: [
          { id: "ora-1", ido: "8:00 - 9:30", tantargy: "Informatika" },
          { id: "ora-2", ido: "10:00 - 11:30", tantargy: "Etika" }
        ]
      },

      {
        nap: "Péntek",
        orak: [
          { id: "ora-1", ido: "8:00 - 9:30", tantargy: "Nyelvtan" },
          { id: "ora-2", ido: "10:00 - 11:30", tantargy: "Testnevelés" }
        ]
      }
  ];

  function renderOraElemek() {
      let orarendDiv = document.querySelector(".orarend");

      while (orarendDiv.firstChild) {
          orarendDiv.removeChild(orarendDiv.firstChild);
      }

      oraElemek.forEach(napElem => {
          let hetkoznapokDiv = document.createElement("div");
          hetkoznapokDiv.classList.add("hetkoznapok");

          let napDiv = document.createElement("div");
          napDiv.classList.add("nap");
          napDiv.textContent = napElem.nap;

          hetkoznapokDiv.appendChild(napDiv);

          napElem.orak.forEach(ora => {
              let oraDiv = document.createElement("div");
              oraDiv.classList.add("ora");
              oraDiv.classList.add(ora.id);

              oraDiv.textContent = `${ora.ido} ${ora.tantargy}`;
              hetkoznapokDiv.appendChild(oraDiv);
          });

          orarendDiv.appendChild(hetkoznapokDiv);
      });
  }

  gomb.addEventListener("click", function() {
      if (sotetHatter) {
          body.style.backgroundColor = "#f0f0f0";
      } else {
          body.style.backgroundColor = "#333";
      }
      sotetHatter = !sotetHatter;
  });

  renderOraElemek();
});
