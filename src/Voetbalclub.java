public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalPunten;
    private int aantalGespeeld;

    public Voetbalclub(String naam) {
        if (naam == null || naam == "") {
            this.naam = "FC";
        }
        else {
            this.naam = naam;
        }
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
        else
            System.out.println("Foutieve ingave");
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int aantalGewonnen(int i){
        return aantalGewonnen;
    }

    public int aantalPunten(){
        aantalPunten = (aantalGewonnen*3) + (aantalGelijk);
        return aantalPunten;
    }

    public void setAantalVerloren(int aantalVerloren) {
        this.aantalVerloren = aantalVerloren;
    }

    public int setAantalPunten(int aantalPunten) {
        this.aantalPunten = aantalPunten;
        return aantalPunten;
    }

    public void setAantalGespeeld(int aantalGespeeld) {
        this.aantalGespeeld = aantalGespeeld;
    }

    public int setAantalGelijk(int aantalGelijk) {
        this.aantalGelijk = aantalGelijk;
        return aantalGelijk;
    }

    public int setAantalGewonnen(int aantalGewonnen) {
        this.aantalGewonnen = aantalGewonnen;
        return aantalGewonnen;
    }

    public int getAantalGespeeld() {
        return aantalGespeeld;
    }

    public int aantalGespeeld(){
        return (getAantalGelijk()+getAantalGewonnen()+getAantalVerloren());
    }

    public int getAantalPunten() {
        return aantalPunten;
    }

    public String toString() {
        return naam + '\'' + " Gewonnen: " + aantalGewonnen + ", Gelijk: " + aantalGelijk + ", Verloren=" + aantalVerloren +
                ", Punten=" + aantalPunten +
                ", Gespeeld=" + aantalGespeeld();
    }
}