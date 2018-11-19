package pack;

import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Ingresa 2 numeros y una operatoria tipo 1+1");
		Systemtem.out.println("Esta calculadora puede usar los siguientes operatorias +-/*%");
		int N1=0;
		String op;
		int N2=0;
		double res=0;                             
		Scanner S = new Scanner (System.in);
		N1=S.nextInt();                         //ingreso de parameros 
		N2=S.nextInt();
		System.out.println("Ingresa operatoria");
		op=S.next();
	    switch (op){                        //operar segun el caso 
	    case "+": res=N1+N2;
	    case"-": res=N1-N2;
	    case "*": res=N1*N2;
	    case "/": res=N1*N2;
	    case "%": res=N1%N2;
	    
			System.out.println("El resultado que buscas es: ");        //mostrando el resultado  
			System.out.println(res);	
		}
	

	}

}
