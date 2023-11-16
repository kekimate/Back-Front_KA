abstract class Noveny
{
    private String szin;
    private double vizmennyiseg;

    public Noveny(String szin)
    {
        this.szin = szin;
        this.vizmennyiseg = 0;
    }

    public boolean vanVizszukseg()
    {
        return vizmennyiseg < szuksegesvizmennyiseg();
    }

    public void ontoz(int mennyiseg)
    {
        double felvehetomennyiseg = mennyiseg * vizfelvehetoseg();
        vizmennyiseg += felvehetomennyiseg;
    }

    protected abstract double vizfelvehetoseg();

    protected abstract double szuksegesvizmennyiseg();

    @Override
    public String toString()
    {
        return "A " + szin + " növénynek vízre van szüksége";
    }
}

class Virag extends Noveny
{
    public Virag(String szin) {
        super(szin);
    }

    @Override
    protected double vizfelvehetoseg()
    {
        return 0.75;
    }

    @Override
    protected double szuksegesvizmennyiseg()
    {
        return 5;
    }
}

class Fa extends Noveny
{
    public Fa(String szin)
    {
        super(szin);
    }

    @Override
    protected double vizfelvehetoseg()
    {
        return 0.4;
    }

    @Override
    protected double szuksegesvizmennyiseg()
    {
        return 10;
    }
}

class Kert
{
    private Noveny[] novenyek;

    public Kert(Noveny... novenyek)
    {
        this.novenyek = novenyek;
    }

    public void ontoz(int mennyiseg)
    {
        System.out.println("öntozés " + mennyiseg);

        for (Noveny noveny : novenyek)
        {
            if (noveny.vanVizszukseg())
            {
                noveny.ontoz(mennyiseg / novenyek.length);
            }
        }
    }

    public void render()
    {
        System.out.println("A kert:");

        for (Noveny noveny : novenyek)
        {
            System.out.println("    " + noveny);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Virag sarga = new Virag("sárga");
        Virag kek = new Virag("kék");

        Fa lonc = new Fa("lonc");
        Fa narancs = new Fa ("narancs");

        Kert kert = new Kert(sarga, kek, lonc, narancs);

        kert.render();
        System.out.println();

        kert.ontoz(40);
        kert.render();
        System.out.println();

        kert.ontoz(70);
        kert.render();
    }
}
