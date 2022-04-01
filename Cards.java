import java.util.Random;

public class Cards {
    private String Kolor;
    private String Value;

    private enum Kolor {kier, karo, pik, trefl;}

    private static enum Value {as,jeden,dwa,trzy,cztery,piec,szesc,siedem,osiem,dziewiec,jopek,dama,krol;}

    public Cards(String Kolor, String Value){
        this.Kolor=Kolor;
        this.Value=Value;
    }

    public String getValue() {
        Random
        return Value;
    }
    public void setValue(String value) {

        Value = Value;
    }

    public void setKolor(String kolor) {

        Kolor = kolor;
    }
    public String getKolor() {

        return Kolor;
    }
    public void pickCard(){
        System.out.println(getKolor()+" : "+getValue());
    }

    public static void main(String[] args) {
        Cards C1=new Cards();
        Cards C2=new Cards();

        C1.pickCard();
        System.out.println("\n \n");
        C2.pickCard();
    }

}


