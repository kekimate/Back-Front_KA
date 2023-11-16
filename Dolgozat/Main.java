class Noveny
{
    protected String nev;
    protected int vizMennyiseg;

    public Noveny(String nev, int vizMennyiseg)
    {
        this.nev = nev;
        this.vizMennyiseg = vizMennyiseg;
    }

    public boolean vizSzukseg()
    {
        return this.vizMennyiseg < getVizigeny();
    }

    public void ontoz(int vizMennyiseg)
    {
        if (vizSzukseg())
        {
            int felvehetoViz = (int) (vizMennyiseg * getontozesiArany());
            this.vizMennyiseg += felvehetoViz;
        }
    }

    protected int getVizigeny()
    {
        return 0;
    }

    protected double getontozesiArany()
    {
        return 0.0;
    }

    public String toString()
    {
        return "A " + this.nev + "nak vízre van szüksége";
    }
}

class Virag extends Noveny
{
    public Virag(String nev, int vizMennyiseg)
    {
        super(nev, vizMennyiseg);
    }

    @Override
    protected int getVizigeny()
    {
        return 5;
    }

    @Override
    protected double getontozesiArany()
    {
        return 0.75;
    }
}

class Fa extends Noveny
{
    public Fa(String nev, int vizMennyiseg)
    {
        super(nev, vizMennyiseg);
    }

    @Override
    protected int getVizigeny()
    {
        return 10;
    }

    @Override
    protected double getontozesiArany()
    {
        return 0.4;
    }
}

class Kert
{
    private Noveny[] novenyek;

    public Kert(Noveny[] novenyek)
    {
        this.novenyek = novenyek;
    }

    public void kertAllapot()
    {
        for (Noveny noveny : novenyek)
        {
            System.out.println(noveny.toString());
        }
    }

    public void ontoz(int vizMennyiseg)
    {
        System.out.println("\nÖntözés " + vizMennyiseg);
        for (Noveny noveny : novenyek)
        {
            noveny.ontoz(vizMennyiseg);
            if (noveny.vizSzukseg())
            {
                System.out.println(noveny.toString());
            } else
            {
                System.out.println("A " + noveny.nev + "nak nincs szüksége vízre");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Virag sargaVirag = new Virag("sárga virág", 3);
        Virag kekVirag = new Virag("kék virág", 7);
        Fa loncFa = new Fa("lonc fá", 8);
        Fa narancsFa = new Fa("narancs fá", 12);

        Noveny[] novenyek = {sargaVirag, kekVirag, loncFa, narancsFa};
        Kert kert = new Kert(novenyek);

        kert.kertAllapot();
        kert.ontoz(40);
        kert.kertAllapot();
        kert.ontoz(70);
        kert.kertAllapot();
    }
}
