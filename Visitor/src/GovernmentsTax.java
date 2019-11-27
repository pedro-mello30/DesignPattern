import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class GovernmentsTax implements Visitor {

    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    DecimalFormatSymbols dfs = new DecimalFormatSymbols();

    GovernmentsTax(){
        dfs.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(dfs);
    }


    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity Item: Price with Tax:");
        return Double.parseDouble(decimalFormat.format((necessity.getPrice() * .10) +
                necessity.getPrice()));
    }

    @Override
    public double visit(Wine wine) {
        System.out.println("Wine Item: Price with Tax:");
        return Double.parseDouble(decimalFormat.format((wine.getPrice() * .3) +
                wine.getPrice()));
    }

}
