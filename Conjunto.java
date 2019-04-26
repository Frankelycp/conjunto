package conjunto;

import java.util.Scanner;

public class Conjunto {
	static Scanner  input = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		boolean estaA;
		boolean estaB;
		boolean estaAmb;
		boolean estaNin;
		System.out.println("ingrese un numero ");
		num = Integer.parseInt(input.nextLine());
		
			estaA= (num>-10 && num<10);
			estaB = (num%2 !=0);
			estaAmb = (estaA && estaB);
			estaNin = !(estaA || estaB);
			
			System.out.println("Esta en A " + "			" + estaA);
			System.out.println("Esta en B " + "			" +estaB);
			System.out.println("Esta en ambos " +"			"+ estaAmb);
			System.out.println("No esta en ninguno "+"		"+ estaNin);
			
			}
		}
	


	
