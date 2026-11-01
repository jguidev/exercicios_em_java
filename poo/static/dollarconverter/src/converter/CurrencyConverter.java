package converter;

public class CurrencyConverter {
    public static double dollarprice;
    public static double bought;
    public static double iof=0.06;

    public static double pay(double price, double buy){
        return bought*dollarprice *(1+iof);
    }

}
