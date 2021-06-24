/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionweb1;

import java.util.Scanner;

/**
 *
 * @author dahia
 */
public class EvaluacionWEB1 {

    public static void main(String[] args) {

//PUNTO 1 =  En una finca entre gallinas y conejos, se cuentan
//50 cabezas y 140 patas ¿Cuántas gallinas y conejos hay en la
//granja?,
        
        Scanner leer = new Scanner(System.in);

        int cabezas, patas;
        
        System.out.println("Digita el numero de cabezas que puedes contar");
        cabezas = leer.nextInt();
        System.out.println("Digita el numero de patas que puedes contar");
        patas = leer.nextInt();
        
        //Total conejos = x 
        //Total Gallinas = numero cabezas - x
        //Total patas = numero de patas
        //Total patas conejos = 4x
        //Total patas gallinas = 2(numero cabezas-x) 
        //4x + 2( numero cabezas - x) = 140

        int y2 = 2 * cabezas;
        int x2 = patas - y2;
        int x = x2 / 2;
        int y = cabezas - x;

        System.out.println("El total de conejos es " + x);
        System.out.println("El total de gallinas es " + y);
        
         
//------------------------------------------------------------------------------------------------------
//Punto 2 = Pedir 20 números y contar cuantos de los 
//          ingresados fueron negativos
/*
        Scanner leer = new Scanner(System.in);

        int numeros[] = new int[20];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite el numero " + (i + 1));
            numeros[i] = leer.nextInt();
            if (numeros[i] < 0) {
                contador = contador + 1;
            }
        }

        System.out.println("El total de numeros negativos ingresados es " + contador);
         */
//------------------------------------------------------------------------------------------------------    
//PUNTO 3 =  Crear una matriz de enteros (tamaño a elección
//           del usuario) y obtener en un nuevo arreglo unidimensional la
//           suma de cada columna
        

/*
        Scanner leer = new Scanner(System.in);

        int i, j;

        System.out.println("digite cantida de filas de la matriz");
        i = leer.nextInt();
        System.out.println("digite cantida de columnas de la matriz");
        j = leer.nextInt();

        int[][] matriz = new int[i][j];
        int[] vector = new int[j];

        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.println("Digite el valor de la posicion de la matriz" + k + "," + l);
                matriz[k][l] = leer.nextInt();
            }
        }
        System.out.println();
        System.out.println();

        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print(matriz[k][l] + " ");
            }
            System.out.println("");
        }
        System.out.println("-------");

        for (int l = 0; l < matriz[0].length; l++) {
            int suma = 0;
            for (int k = 0; k < matriz.length; k++) {
                suma += matriz[k][l];

            }

            vector[l] = suma;
            // System.out.print(vector[l]+" ");

        }
        System.out.println("");

        for (int k = 0; k < vector.length; k++) {
            if (k == 0) {
                System.out.print("[ " + vector[k]);
            } else {
                System.out.print(", " + vector[k] + " ");
            }

        }
        System.out.print(" ]");
          */
                //---------------------------------------------------------------------------------
                //Punto 4 = Reinaldo Rueda técnico de la selección Colombia
                //          de futbol, lo contrata para elaborar un programa en JAVA que
                //          cumpla las siguientes condiciones:
                //          Codificar Menú de 5 opciones
                //              - op1 Agregar un jugador (solo nombre) a un arreglo
                //              - op2 Buscar un jugador por nombre y si no existe
                //                notificarlo
                //              - op3 Editar un jugador por nombre y si no existe
                //                notificarlo
                //              - op4 Mostrar toda la convocatoria de jugadores
                //              - op5 Salir

                /*
        Scanner leer = new Scanner(System.in);
        int i = 0;
        String[] convocatoria = new String[23];
        String jugadorBuscado;
        boolean bandera;
        System.out.println("Bienvenido Sr. Reinaldo Rueda");
        int opcion;

        do {
            System.out.println("Que deseas realizar");

            System.out.println("1. Agregar un jugador");
            System.out.println("2. Buscar un jugador por nombre");
            System.out.println("3. Editar un jugador por nombre");
            System.out.println("4. Mostrar toda la convocatoria");
            System.out.println("5. Salir");

            System.out.println("Escoja una opcion\n");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    if (i < convocatoria.length) {
                        System.out.println("Digita el nombre del jugador ");
                        convocatoria[i] = leer.next();
                        i++;
                    } else {
                        System.out.println("Ya no puedes agregar mas jugadores, "
                                + "prueba a cambiar uno de los comvocados");
                    }
                    break;
                case 2:
                    System.out.println("Digite un jugador a buscar");
                    jugadorBuscado = leer.next();
                    bandera = false;
                    for (int j = 0; j < convocatoria.length; j++) {
                        if (convocatoria[j].equals(jugadorBuscado)) {
                            bandera = true;
                            break;
                        } else {
                            bandera = false;
                        }
                    }
                    if (bandera) {
                        System.out.println("El jugador se encuentra en la "
                                + "convocatoria  ");
                    } else {
                        System.out.println("El jugador no esta en la convocatoria");
                    }
                    break;
                case 3:
                    System.out.println("Digite un producto a buscar");
                    jugadorBuscado = leer.next();
                    bandera = false;
                    int posicion = 0;
                    for (int j = 0; j < convocatoria.length; j++) {
                        if (convocatoria[j].equals(jugadorBuscado)) {
                            bandera = true;
                            posicion = j;
                            break;
                        } else {
                            bandera = false;
                        }
                    }
                    if (bandera) {
                        System.out.println("Digite el nuevo jugador a convocar");
                        convocatoria[posicion] = leer.next();
                    } else {
                        System.out.println("El jugador no esta en la convocatoria");
                    }
                    break;
                case 4:
                    for (int j = 0; j < convocatoria.length; j++) {
                        if (convocatoria[j] == null) {
                            System.out.print("");
                        } else {
                            System.out.print(convocatoria[j] + " - ");
                        }

                    }
                    break;
                case 5:

            }
            System.out.println("\n");
        } while (opcion == 1 || opcion == 2 || opcion == 3 || opcion
                == 4);

        System.out.println("Hasta luego Sr. Reinaldo Rueda");
                 */
    }
}
