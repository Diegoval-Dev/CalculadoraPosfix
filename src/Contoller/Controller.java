package Contoller;

import Model.PostfixCalculator;
import Model.ReadFile;
import Model.StackUsingArrayList;

import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {
        evaluar();
    }
    public static void evaluar(){
        ArrayList<String> arrayDatos = new ArrayList<>();
        ReadFile rd = new ReadFile();
        int cantLineas = arrayDatos.size();
        arrayDatos = rd.returnPostFix();
        int resultado = 0;
        for (int i = 0; i < cantLineas; i++) {
            resultado = reultOF(arrayDatos.get(i));
        }
        System.out.println(resultado);

    }
    public static int reultOF(String line){
        PostfixCalculator calculadora = new PostfixCalculator();
        StackUsingArrayList stack = new StackUsingArrayList();
        ArrayList<String> calculo = new ArrayList<>();
        String caracter;
        int resultado = 0;

        calculo = calculadora.getItems(line);
        int cantElementos = calculo.size();

        for (int i = 0; i < cantElementos; i++) {
            String elemento = calculo.get(i);
            if(calculadora.isOperator(elemento)){
                int var1,var2;
                var2 = Integer.parseInt((String) stack.pull());
                var1 = Integer.parseInt((String) stack.pull());
                switch (elemento){
                    case "+":
                        resultado = calculadora.suma(var1,var2);
                        break;
                    case "-":
                        resultado = calculadora.resta(var1,var2);
                        break;
                    case "*":
                        resultado = calculadora.multiplicacion(var1,var2);
                        break;
                    case "/":
                        resultado = calculadora.division(var1,var2);
                        break;
                }
            }else {
                stack.push(elemento);
            }
        }
        return resultado;
    }
}
