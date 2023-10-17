let heroes = [
  { firstName: "Ahsoka", lastName: "Tano", job: "padawan" },
  { firstName: "Boba", lastName: "Fett", job: "fejvadász" },
  { firstName: "Han", lastName: "Solo", job: "csempész" },
  { firstName: "Leia", lastName: "Organa", job: "szenátor" }
];

function renderHeroes(heroes) {
  let heroList = document.getElementById("hero-list");
  heroList.innerHTML = '';

  heroes.forEach(hero => {
    let heroCard = `
      <div class="hero-card">
        <h2>${hero.firstName} ${hero.lastName}</h2>
        <p>Job: ${hero.job}</p>
      </div>
    `;
    heroList.insertAdjacentHTML('beforeend', heroCard);
  });
}
renderHeroes(heroes);