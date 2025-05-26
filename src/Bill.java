import utils.BillConstants;

import java.text.DecimalFormat;

public class Bill {

    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public Bill(char gender, int beer, int barbecue, int softDrink){
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public double cover(){
        if (feeding() > 30){
            return 0;
        }
        return BillConstants.COVER_COST;
    }

    public double feeding(){
        return (BillConstants.BARBECUE_COST * barbecue) + (BillConstants.BEER_COST * beer) + (BillConstants.SOFT_DRINK_COST * softDrink);
    }

    public double ticket(){
        if (gender == 'F'){
            return BillConstants.FEMALE_TICKET_COST;
        }

        return BillConstants.MALE_TICKET_COST;

    }

    public double total(){
        return cover() + ticket() + feeding();
    }

    public String toString(){
        if (cover() == 0){
            return "\nRELATÓRIO:\n" +
                    "Consumo = R$ " + decimalFormat.format(feeding()) + "\n" +
                    "Isento de Couvert" + "\n" +
                    "Ingresso = R$ " + decimalFormat.format(ticket()) + "\n" +
                    "\n" +
                    "Valor a pagar = R$ " + decimalFormat.format(total());

        }

        return "\nRELATÓRIO:\n" +
                "Consumo = R$ " + decimalFormat.format(feeding()) + "\n" +
                "Couvert = R$ " + decimalFormat.format(cover()) + "\n" +
                "Ingresso = R$ " + decimalFormat.format(ticket()) + "\n" +
                "\n" +
                "Valor a pagar = R$ " + decimalFormat.format(total());


    }

}
