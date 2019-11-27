public class Main {

    public static void main(String[] args) {
	    if(args.length == 3){

	        Context context = new Context();
	            if(args[0].equals("add")){
                    context.setStrategy(new StrategyAdd());
                } else if (args[0].equals("sub")){
                    context.setStrategy(new StrategySubtract());
                } else if (args[0].equals("mult")){
                    context.setStrategy(new StrategyMultiply());
                }

            context.executeStrategy(Double.parseDouble(args[1]) , Double.parseDouble(args[2]));

        }
    }
}
