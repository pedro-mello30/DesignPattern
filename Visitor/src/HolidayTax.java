import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class HolidayTax implements Visitor {

    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    DecimalFormatSymbols dfs = new DecimalFormatSymbols();

    HolidayTax(){
        dfs.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(dfs);
    }


    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity Item: Price with Tax:");
        return Double.parseDouble(decimalFormat.format((necessity.getPrice() * .5) +
                necessity.getPrice()));

    }

    @Override
    public double visit(Wine wine) {
        System.out.println("Wine Item: Price with Tax:");
        return Double.parseDouble(decimalFormat.format((wine.getPrice() * .2) +
                wine.getPrice()));
    }

}
