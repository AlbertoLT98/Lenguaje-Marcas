import java.util.Scanner;

public class Tarea11 {
static int numero1;
static int numero2;
static int numero3;
static int opcion;

	public static void main(String[] args) {
		System.out.println("Inserte tres numeros"); //Se imprime en consola Inserte tres numeros
		Scanner entradaTeclado = new Scanner(System.in); //Se hace una instancia del scanner
		System.out.println("Introduzca primer numero");
		numero1 = entradaTeclado.nextInt(); //El usuario escribe el primer numero entero
		System.out.println("Introduzca segundo numero");
		numero2 = entradaTeclado.nextInt(); //El usuario escribe el segundo numero entero
		System.out.println("Introduzca tercer numero");
		numero3 = entradaTeclado.nextInt(); //El usuario escribe el tercer numero entero
	
		System.out.println("1.Orden ascendente");
		System.out.println("2.Orden descendente");
		
		opcion = entradaTeclado.nextInt(); //Se elige el caso del switch, 1 para orden ascendente y 2 para descendente
		entradaTeclado.close();
		
		switch (opcion) { //Todos los posibles casos en el orden de numeros con su respectiva impresion, tanto para orden ascendente como para descendente
		
		case 1: 
			if ((numero1<numero2) && (numero1<numero3) && (numero2>numero1) && (numero2<numero3) && (numero3>numero1) && (numero3>numero2)) {
				
				System.out.println(numero1 + " " + numero2 + " " + numero3);
				}
			else if ((numero1<numero2) && (numero1<numero3) && (numero2>numero1) && (numero2>numero3) && (numero3>numero1) && (numero3<numero2)) {

	            System.out.println (numero1 + " " + numero3 + " " + numero2); 
	            }
			else if ((numero1>numero2) && (numero1<numero3) && (numero2<numero1) && (numero2<numero3) && (numero3>numero1) && (numero3>numero2)) {

	            System.out.println (numero2 + " " + numero1 + " " + numero3); 
	            }
			else if ((numero1<numero2) && (numero1>numero3) && (numero2>numero1) && (numero2>numero3) && (numero3<numero1) && (numero3<numero2)) {

	            System.out.println (numero3 + " " + numero1 + " " + numero2); 
	            }
			else if ((numero1>numero2) && (numero1>numero3) && (numero2<numero1) && (numero2<numero3) && (numero3<numero1) && (numero3>numero2)) {

	            System.out.println (numero2 + " " + numero3 + " " + numero1); 
	            }
			else if ((numero1>numero2) && (numero1>numero3) && (numero2<numero1) && (numero2>numero3) && (numero3<numero1) && (numero3<numero2)) {

	            System.out.println (numero3 + " " + numero2 + " " + numero1); 
	            }
			
			break;
			
		case 2:  
			if ((numero1<numero2) && (numero1<numero3) && (numero2>numero1) && (numero2<numero3) && (numero3>numero1) && (numero3>numero2)) {
				
				System.out.println(numero3 + " " + numero2 + " " + numero1);
				}
			else if ((numero1<numero2) && (numero1<numero3) && (numero2>numero1) && (numero2>numero3) && (numero3>numero1) && (numero3<numero2)) {

	            System.out.println (numero2 + " " + numero3 + " " + numero1); 
	            }
			else if ((numero1>numero2) && (numero1<numero3) && (numero2<numero1) && (numero2<numero3) && (numero3>numero1) && (numero3>numero2)) {

	            System.out.println (numero3 + " " + numero1 + " " + numero2); 
	            }
			else if ((numero1<numero2) && (numero1>numero3) && (numero2>numero1) && (numero2>numero3) && (numero3<numero1) && (numero3<numero2)) {

	            System.out.println (numero2 + " " + numero1 + " " + numero3); 
	            }
			else if ((numero1>numero2) && (numero1>numero3) && (numero2<numero1) && (numero2<numero3) && (numero3<numero1) && (numero3>numero2)) {

	            System.out.println (numero1 + " " + numero3 + " " + numero2); 
	            }
			else if ((numero1>numero2) && (numero1>numero3) && (numero2<numero1) && (numero2>numero3) && (numero3<numero1) && (numero3<numero2)) {

	            System.out.println (numero1 + " " + numero2 + " " + numero3); 
	            }
			break;
		
			
		}	

	}	
}
