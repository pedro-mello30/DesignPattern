public class ContextConversion {
    private String conversionQuestion = "";
    private String conversionResponse = "";
    private String fromConversion = "";
    private String toConversion = "";
    private double quantity;
    private String[] partsOfQuestion;

    public ContextConversion(String input){

        this.conversionQuestion = input;

        partsOfQuestion = conversionQuestion.split(" ");
        fromConversion = getCapitalized(partsOfQuestion[1]);
        toConversion = getLowerCase(partsOfQuestion[3]);
        quantity = Double.valueOf(partsOfQuestion[0]);

        conversionResponse = partsOfQuestion[0] + " " + partsOfQuestion[1] + " equals ";

    }

    public String getResponse() {
        return conversionResponse;
    }

    public String getFromConversion() {
        return fromConversion;
    }

    public String getToConversion() {
        return toConversion;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getLowerCase(String toLowerCase){
        return toLowerCase.toLowerCase();
    }

    public String getCapitalized(String toCapitalized){
        toCapitalized = toCapitalized.toLowerCase();

        toCapitalized = Character.toUpperCase(toCapitalized.charAt(0)) + toCapitalized.substring(1);
        toCapitalized += (toCapitalized.charAt(toCapitalized.length() -1) != 's')? "s": "";

        return toCapitalized;
    }




}
