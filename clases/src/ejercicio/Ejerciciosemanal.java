package ejercicio;
import java.util.Scanner;
import java.util.Arrays;
public class Ejerciciosemanal {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Scanner escaneo = new Scanner(System.in);
	    char caracter[] = new char[4];
	    char comprobar[] = new char[caracter.length];
	    boolean check = false;
	    int[] lista = new int[4];
	    int i;
	    int temp = 0;
	    boolean ordenado = true;
	    System.out.println("Introduzca un carácter, entre, P(picas), D(diamantes), T(Treboles), C(Corazones) ");
	    for (int k = 0; k < 4; k++) {
	        caracter[k] = escaneo.next().charAt(0);
	        comprobar[k] = caracter[k];
	    }
	    for(int k = 0; k < caracter.length; k++) {
	        for (int l = 0; l < comprobar.length; l++) {
	            if(caracter[k] == comprobar[l]) {
	                check = true;
	            }else {
	                check = false;
	                break;
	            }
	        }
	    }if(check) {
	    System.out.println("Introduce un numero entre el 1 y el 13:");
	    for (i = 0; i < 4; i++) {
	        System.out.print("Introduce el numero de la carta " + (i + 1) + ":" + " ");
	        lista[i] = sc.nextInt();
	    }

	    for (i = 0; i < lista.length; i++) {
	        if (i + 1 < lista.length) {
	            if (lista[i] > lista[i + 1]) {
	                ordenado = false;
	                break;
	            }
	        }
	    }
	    if (ordenado) {
	        System.out.println("La lista está ordenada");
	    } else {
	        System.out.println("La lista está desordenada");
	    }

	    for (int j = 0; j < lista.length; j++) {
	        for (int k = j + 1; k < lista.length; k++) {
	            if (lista[j] < lista[k]) {
	                    int aux = lista[j];
	                    lista[j] = lista[k];
	                    lista[k] = aux;
	            }
	        }

	        }
	    
	    System.out.println(Arrays.toString(lista));
	    int valor = lista[lista.length - 1];
	    System.out.println("Falta el " + (++valor)+ " para la escalera de color");
	}else {
        System.out.println("No puede ser, no son del mismo palo, no hay escalera de color");
	}
	}
	}