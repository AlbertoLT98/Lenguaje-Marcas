import java.util.Scanner;

public class Tarea13 {
	public static void main(String[] args) {
	int numero;
	
	Scanner entradaTeclado = new Scanner(System.in); //Se hace una instancia del escaner
	System.out.println("Escribe un numero");
	do { //Se hace el bucle do while mientras el numero sea negativo, es decir, menor que 0
	numero = entradaTeclado.nextInt(); //El usuario escribe el numero, en caso de ser negativo, se repite hasta que sea positivo
	if (numero < 0) {
	System.out.println("Es un numero negativo, es necesario un numero positivo");
	}else {
		System.out.println("Es positivo, se suman los 20 numeros sucesivos:");
		for (int i = numero; i < numero+21; i++) { //Si el numero es pòsitivo, se hace un bucle for que se repite desde el numero elegido 21 veces mas incrementando 1 cada iteracion
			System.out.print(i + " "); //Se imprimen todos los numero en la misma linea con un espacio entre ellos
			}
	}
	
	
	}
	
	
	while (numero < 0);
	
	entradaTeclado.close(); //Se cierra la entrada del teclado.
	
	
	}

}
		
	
	
	
	
	
	
	
	
	
