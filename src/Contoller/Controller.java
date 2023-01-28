package Contoller;

import Model.PostfixCalculator;
import Model.ReadFile;
import Model.StackUsingArrayList;
import UI.UI;

import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {
        evaluar();
    }
    public static void evaluar(){
        UI ui = new UI();
        ArrayList<String> arrayDatos;
        ReadFile rd = new ReadFile();
        arrayDatos = rd.returnPostFix();
        int cantLineas = arrayDatos.size();
        int resultado = 0;
        for (int i = 0; i < cantLineas; i++) {
            resultado = reultOF(arrayDatos.get(i));
            ui.show("Linea: "+arrayDatos.get(i) + " Resultado: " + resultado);
        }


    }
    public static int reultOF(String line){
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
        return stack.pull();
    }
}
