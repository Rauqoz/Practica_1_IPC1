package Acciones_Ac;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rau
 */
public class Acciones_IngresarMercaderia {

    /*permite ingresar mercadería a una bodega, siguiendo la
misma lógica que sacar mercadería, con la diferencia que se tiene que verificar
que la cantidad a ingresar no exceda el límite de la mercadería.*/
    Scanner sn = new Scanner(System.in);
    private int opcion;
    //variable para poder salir del ciclo ya inicializada
    private boolean salir;

    public Acciones_IngresarMercaderia() {

        do {
            //try para cuando el usuario ingresa algun caracter que no es numero entero
            try {
                //pedir el numero de opcion

                salir = true;
                System.out.println("\nProductos Existentes del 1 - 4");
                System.out.println("0 - Regresar");
                System.out.print("Ingresa el Numero de Producto: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("\n * Usaremos el Producto 1");
                        IngresarMercaderia_Producto_1 ingresarMercaderia_Producto_1 = new IngresarMercaderia_Producto_1();
                        salir = false;
                        break;
                    case 2:
                        System.out.println("\n * Usaremos el Producto 2");
                        IngresarMercaderia_Producto_2 ingresarMercaderia_Producto_2 = new IngresarMercaderia_Producto_2();
                        salir = false;
                        break;
                    case 3:
                        System.out.println("\n * Usaremos el Producto 3");
                        IngresarMercaderia_Producto_3 ingresarMercaderia_Producto_3 = new IngresarMercaderia_Producto_3();
                        salir = false;
                        break;
                    case 4:
                        System.out.println("\n * Usaremos el Producto 4");
                        IngresarMercaderia_Producto_4 ingresarMercaderia_Producto_4 = new IngresarMercaderia_Producto_4();
                        salir = false;
                        break;

                    case 0:
                        //si selecciona la opcion "0" el valor salir cambia para sellar el ciclo
                        System.out.println("\n - Regresamos ");
                        salir = false;
                        break;
                    default:
                        //default para cuando el usuario ingresa un numero que no esta dentro de las opciones
                        System.out.println("\n -- Debes Colocar un Numero del Menu --");
                        break;
                }
                //catch para cuando el usuario ingresa algun caracter que no es un numero, ejemplo "asd"
            } catch (InputMismatchException e) {
                //mensaje al ingresar algo que no es numero
                System.out.println("\n -- No se Admiten Letras --");
                //esto sirve para retomar el ingreso de datos y el flujo normal del ciclo do
                sn.next();
            }
        } while (salir != false); //si la variable es igual a true, la inicializada en false, se cierra el ciclo y finaliza el programa
    }

}
