package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    //URL DEL ARCHIVO A LEER, FAVOR DE MODIFICAR ANTES DE USAR.
    public String fileURL = "D:\\EstructuraDeDatosUVG\\CalculadoraPosfix\\src\\FileTXT\\example1.txt";
    public ArrayList<String> postFixExpresion = new ArrayList<>();
    public ArrayList<String> returnPostFix(){
        try {
            File myObj = new File(fileURL);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                postFixExpresion.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            //ERROR
        }
        return postFixExpresion;
    }
}
