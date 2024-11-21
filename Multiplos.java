public class Tarea15 {
static int cuentaMultiplo2;
static int cuentaMultiplo3;
static int cuentaComunes;	
static int numerosMultiplo2;
static int numerosMultiplo3;
static int numerosComunes;
public static void main(String[] args) {
		
	
		System.out.println("Números multiplos de 2:"); 
		for (int mult2 = 1; mult2<101; mult2++) { //Se empieza a contar desde el 1 hasta que el numero obtenido sea menor de 101, que seria el 100, sumando 1 en cada iteracion del bucle
		numerosMultiplo2 = mult2 * 2; //A cada numero obtenido entre el 1 y el 100 se multiplica por 2 para solo tener multiplos de 2 y estos numeros llegarian hasta el 200
		if (numerosMultiplo2 <= 100){ //Si el numero es menor o igual a 100 se imprime junto a un espacio entre ellos.
		System.out.print(numerosMultiplo2 + " "); 
		cuentaMultiplo2++; //Se cuentan los numeros que se han impreso menores o iguales a 100
			}
		}	
					
		System.out.println(); //Salto de linea 
					
		System.out.print("El número total de multiplos de 2 es:"+" "+ cuentaMultiplo2); 
					
		System.out.println(); //Salto de linea 
		System.out.println(); //Salto de linea 		
					
					
		System.out.println("Números multiplos de 3:");
		for (int mult3 = 1; mult3<101; mult3++) { //Se empieza a contar desde el 1 hasta que el numero obtenido sea menor de 101, que seria el 100, sumando 1 en cada iteracion del bucle
		numerosMultiplo3 = mult3 * 3; //A cada numero obtenido entre el 1 y el 100 se multiplica por  para solo tener multiplos de 3 y estos numeros llegarian hasta el 300
		if (numerosMultiplo3 <= 100) { //Si el numero es menor o igual a 100 se imprime junto a un espacio entre ellos.
		System.out.print(numerosMultiplo3 + " "); 
		cuentaMultiplo3++; //Se cuentan los numeros que se han impreso menores o iguales a 100
			}
		}
					
		System.out.println(); //Salto de linea 
					
		System.out.print("El número total de multiplos de 3 es:" +" "+ cuentaMultiplo3);
					
		System.out.println(); //Salto de linea 
		System.out.println(); //Salto de linea 
				
					
			//Lo siguiente es el mismo sistema que para los multiplos de 2 y de 3 solo que multiplicandolo por 6 para sacar los comunes a ambos	
					
		System.out.println("Numeros comunes en multiplos de 2 y de 3:");
		for (int comunes = 1; comunes<101; comunes++) {
		numerosComunes = comunes * 6; //Se multiplica por 6 ya que es el minimo comun multiplo de 2 y de 3, asi se sacan los comunes a multiplos de 2 y de 3.
		if (numerosComunes <= 100) {
		System.out.print(numerosComunes + " "); 
		cuentaComunes++;
			}
		}
		System.out.println(); //Salto de linea 	
		System.out.print("El número total de los comunes en multiplos de 2 y 3 es:" +" " + cuentaComunes);
	}
}		
				
				

