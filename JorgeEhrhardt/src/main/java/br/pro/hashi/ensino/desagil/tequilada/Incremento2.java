package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Incremento2 {
	
    public static void main(String[] args) {
    	
        try (BufferedReader br = new BufferedReader(new FileReader("labirinto.txt"))) {
        	int x,y;
            String line,line0;
            String[] coord;
            line0 = br.readLine();
            y = Integer.parseInt(line0.split(" ")[0]);
            x = Integer.parseInt(line0.split(" ")[1]);
            
            
            while ((line = br.readLine()) != null) {
                System.out.println(line.replace("#", "X"));
            }
            
        } catch (IOException e) {
        	
            e.printStackTrace();
        }
        
    }
}
