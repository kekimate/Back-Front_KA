document.addEventListener('DOMContentLoaded', () => {
    let tabla = document.getElementById('tabla');
    let eredmeny = document.getElementById('eredmeny');
    let Sajat = 'X';
    let Vege = false;

    for (let i = 0; i < 3; i++)
    {
        for (let j = 0; j < 3; j++)
        {
            let mezo = document.createElement('div');
            mezo.classList.add('mezo');
            mezo.dataset.row = i;
            mezo.dataset.col = j;
            mezo.addEventListener('click', Click);
            tabla.appendChild(mezo);
        }
    }

    function Click()
    {
        if (Vege || this.textContent !== '') return;

        this.textContent = Sajat;
        if (NyertesE())
        {
            eredmeny.textContent = `${Sajat} nyert!`;
            Vege = true;
        } else if (DontetlenE())
        {
            eredmeny.textContent = 'Döntetlen!';
            Vege = true;
        } else
        {
            Sajat = Sajat === 'X' ? 'O' : 'X';
            if (Sajat === 'O')
            {
                setTimeout(Gep, 500);
            }
        }
    }

    function Gep() {
        let UresMezok = Array.from(document.querySelectorAll('.mezo')).filter(mezo => mezo.textContent === '');
        if (UresMezok.length > 0 && !Vege)
        {
            let RandomMezo = UresMezok[Math.floor(Math.random() * UresMezok.length)];
            RandomMezo.textContent = Sajat;
            if (NyertesE())
            {
                eredmeny.textContent = `${Sajat} nyert!`;
                Vege = true;
            } else if (DontetlenE())
            {
                eredmeny.textContent = 'Döntetlen';
                Vege = true;
            } else
            {
                Sajat = Sajat === 'X' ? 'O' : 'X';
            }
        }
    }

    function NyertesE()
    {
        let mezok = document.querySelectorAll('.mezo');
        let NyeroMezok = [[0, 1, 2], [3, 4, 5], [6, 7, 8], [0, 3, 6], [1, 4, 7], [2, 5, 8], [0, 4, 8], [2, 4, 6]];

        for (let combo of NyeroMezok)
        {
            let [a, b, c] = combo;
            if (mezok[a].textContent && mezok[a].textContent === mezok[b].textContent && mezok[a].textContent === mezok[c].textContent)
            {
                mezok[a].style.backgroundColor = mezok[b].style.backgroundColor = mezok[c].style.backgroundColor = 'green';
                return true;
            }
        }
        return false;
    }

    function DontetlenE()
    {
        let mezok = document.querySelectorAll('.mezo');
        for (let mezo of mezok)
        {
            if (mezo.textContent === '')
            {
                return false;
            }
        }
        return true;
    }
});
