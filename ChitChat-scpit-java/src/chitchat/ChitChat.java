/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitchat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author CTTC
 */
public class ChitChat {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String ultima = readFile("C:\\Users\\CTTC\\Desktop\\Sergi\\DateParser\\ultima.txt"); //Documento de donde se imporftan las frases de cada tópico para el chitchat
        System.out.print(ultima);
    }
    
    
    
    public static String readFile(String archivo) throws FileNotFoundException, IOException { //Adaptación del texto para una introducción directa en chatScript
        String cadena;
        String out="";
        FileReader f = new FileReader(archivo);
        try (BufferedReader b = new BufferedReader(f)) {
            while((cadena = b.readLine())!=null) {
                out = out + "\n" + "u: (" + cadena + ") ^keep()" + "\n" + "CHIT_me_llamo" + "\n";    
            }
        }
        return out;
    }
    
    public static void writteFile(String out){
        //No necesario
    }
    
}
