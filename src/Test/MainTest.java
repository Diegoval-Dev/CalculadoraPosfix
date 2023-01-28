package Test;

import Model.PostfixCalculator;
import Model.ReadFile;
import Model.StackUsingArrayList;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        String line = "5 6 7 + *";
        PostfixCalculator calculadora = new PostfixCalculator();
        StackUsingArrayList<Integer> stack = new StackUsingArrayList();
        ArrayList<String> calculo = new ArrayList<>();
        String caracter;
        int resultado = 0;

        calculo = calculadora.getItems(line);
        int cantElementos = calculo.size();

        for (int i = 0; i < cantElementos; i++) {
            String elemento = calculo.get(i);
            if(calculadora.isOperator(elemento)){
                int var1,var2;
                var2 = stack.pull();
                var1 = stack.pull();
                switch (elemento){
                    case "+":
                        resultado = calculadora.suma(var1,var2);
                        stack.push(resultado);
                        break;
                    case "-":
                        resultado = calculadora.resta(var1,var2);
                        stack.push(resultado);
                        break;
                    case "*":
                        resultado = calculadora.multiplicacion(var1,var2);
                        stack.push(resultado);
                        break;
                    case "/":
                        resultado = calculadora.division(var1,var2);
                        stack.push(resultado);
                        break;
                }
            }else {
                stack.push(Integer.parseInt(elemento));
            }
        }
    }

}