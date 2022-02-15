public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalPunten;
    private int aantalGespeeld;

    public Voetbalclub(String naam) {
        setNaam(naam);
    }

    public int getAantalGewonnen(){
        return aantalGewonnen;
    }

    public int getAantalGelijk(){
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int aantalPunten(){
        aantalPunten = (aantalGewonnen*3) + (aantalGelijk);
        return aantalPunten;
    }
    
    public int aantalGespeeld(){
        return (getAantalGelijk()+getAantalGewonnen()+getAantalVerloren());
    }

    public String toString() {
        return naam + '\'' + " Gewonnen: " + aantalGewonnen + ", Gelijk: " + aantalGelijk + ", Verloren=" + aantalVerloren +
                ", Punten=" + aantalPunten +
                ", Gespeeld=" + aantalGespeeld();
    }
}