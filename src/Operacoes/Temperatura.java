package Operacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		ArrayList<Double> temp = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.print("Digite a temperatura: ");
            double temperatura = scan.nextDouble();
            temp.add(temperatura);
            count++;
        }
        
        System.out.println("------------------------");
        System.out.println("Janeiro - " + temp.get(0) + "°C");
        System.out.println("Fevereiro - " + temp.get(1) + "°C");
        System.out.println("Março - " + temp.get(2) + "°C");
        System.out.println("Abril - " + temp.get(3) + "°C");
        System.out.println("Maio - " + temp.get(4) + "°C");
        System.out.println("Julho - " + temp.get(5) + "°C");
        
        double media = (temp.get(0) + temp.get(1) + temp.get(2) + temp.get(3) + temp.get(4) + temp.get(5))/6;
        
        System.out.println("-----------------------");
        System.out.println("Temperatura Média: " + media + "°C");
        
        System.out.println("A media  foi superada em:");
        if (temp.get(0) > media) {
        	System.out.println("Janeiro - " + temp.get(0) + "°C");
        }
        if (temp.get(1) > media) {
        	System.out.println("Fevereiro - " + temp.get(1) + "°C");
        }
        if (temp.get(2) > media) {
        	System.out.println("Março - " + temp.get(2) + "°C");
        }
        if (temp.get(3) > media) {
        	System.out.println("Abril - " + temp.get(3) + "°C");
        }
        if (temp.get(4) > media) {
        	System.out.println("Maio - " + temp.get(4) + "°C");
        }
        if (temp.get(5) > media) {
        	System.out.println("Julho - " + temp.get(5) + "°C");
        }
	}
}
