import javax.swing.*;
import java.lang.reflect.*;

public class MeasurementConversion {


    MeasurementConversion() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String questionAsked = JOptionPane.showInputDialog(frame, "What is your question?");

        ContextConversion question = new ContextConversion(questionAsked);

        String fromConversion = question.getFromConversion();
        String toConversion = question.getToConversion();
        double quantity = question.getQuantity();

        try {
            Class tempClass = Class.forName(fromConversion);

            Constructor con = tempClass.getConstructor();

            Object convertFrom = (Expression) con.newInstance();

            Class[] methodsParams = new Class[]{Double.TYPE};

            Method conversionMethod = tempClass.getMethod(toConversion, methodsParams);

            Object[] params = new Object[]{new Double(quantity)};

            String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

            String answer = question.getResponse() + toQuantity + " " + toConversion;

            JOptionPane.showMessageDialog(null, answer);

            frame.dispose();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
