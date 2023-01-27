package Model;

import java.util.ArrayList;

public class PostfixCalculator implements IPostfixCalculator{
    @Override
    public boolean isOneItem(IStack operandos) {
        if(operandos.count() == 1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

    @Override
    public boolean isOperator(String item) {
        if(item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")){
            return true;
        }else{
            return false;
        }
    }


    @Override
    public ArrayList<String> getItems(String _expresion) {
        ArrayList<String> arrItems = new ArrayList();
        String lineWithoutSpaces = _expresion.replaceAll(" ","");
        int lineLength = lineWithoutSpaces.length();
        for (int i = 0; i < lineLength; i++) {
            String item = String.valueOf(lineWithoutSpaces.charAt(i));
            arrItems.add(item);
        }
        return arrItems;
    }
}
