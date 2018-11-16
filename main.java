package pack;

import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Ingresa 2 numeros");
		int N1=0;
		int N2=0;
		double res=0;
		String op;
		Scanner S = new Scanner (System.in);
		N1=S.nextInt();
		N2=S.nextInt();
		System.out.println("Ingresa operatoria");
		op=S.next();
	    switch (op){
	    case "+": res=N1+N2;
	    case"-": res=N1-N2;
	    case "*": res=N1*N2;
	    case "/": res=N1*N2;
	    case "%": res=N1%N2;
	    
			System.out.println("El resultado que buscas es: ");
			System.out.println(res);	
		}
	

	}

}
