import java.util.*;
public class currencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("           **** CURRENCY CONVERTER INTO INDIAN RUPEE ****       ");
        System.out.println();
        System.out.println(" Enter an Ammount in INR : ");
        float ammount  = sc.nextFloat();
        System.out.println( "1.USD  2.EUR  3.GBP  4.KWD  5.AUD  6.JPY  7.PKR  8.SGD  9.CNY");

        System.out.println( "  please select an option name not number");
        String curr = sc.next().toUpperCase();

        if( curr.equals("USD")){
            float usd = ammount/83.96f;
            System.out.println( ammount + "INR = " +usd + "USD");
        }
         else if( curr.equals("EUR")){
            float eur = ammount/92.78f;
            System.out.println( ammount + "INR = " +eur + "EUR");
        } 
        else if( curr.equals("GBP"))
        {
            float gbp = ammount/110.117f;
            System.out.println( ammount + "INR = " +gbp + "GBP");
        }
        else if( curr.equals("KWD"))
        {
            float kwd = ammount/274.70f;
            System.out.println( ammount + "INR = " +kwd + "KWD");
        }
        else if( curr.equals("AUD "))
        {
            float aud = ammount/56.4070f;
            System.out.println( ammount + "INR = " +aud + "AUD ");
        }
        else if( curr.equals("JPY"))
        {
            float jpy = ammount/0.579f;
            System.out.println( ammount + "INR = " +jpy + "JPY");
        }
        else if( curr.equals("PKR"))
        {
            float pkr = ammount/0.30170f;
            System.out.println( ammount + "INR = " +pkr + "PKR");
        }
        else if( curr.equals("SGD"))
        {
            float sgd = ammount/64.2551f;
            System.out.println( ammount + "INR = " +sgd + "SGD");
        }
        else if( curr.equals("CNY"))
        {
            float cny = ammount/11.8002f;
            System.out.println( ammount + "INR = " +cny + "CNY");
        }
        else{
            System.out.println( " Wrong Currency Entered");
        }
    }
}
