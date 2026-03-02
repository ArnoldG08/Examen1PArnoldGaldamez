/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenp1_arnoldgaldamez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ExamenP1_ArnoldGaldamez {

    static ArrayList<ProduccionesMultimedia> lista = new ArrayList<ProduccionesMultimedia>();
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        Serie Suits = new Serie(9, 80, 01234567, "Suits", 60, 15000.00);
        Serie TheRookie = new Serie(7, 20, 123456, "TheRookie", 55, 500000.00);

        Documental Epstein = new Documental("Abusos", 30, 037467, "Epstein Files", 120, 200000.00);
        Documental Hitler = new Documental("Guerra", 150, 6633929, "Hitler", 180, 100000.00);

        Podcast SomosUnitec = new Podcast(20, 100, 743463, "En Unitec", 50, 10000.00);
        Podcast HateTherians = new Podcast(50, 300, 746547, "Fuera Therians", 70, 100000.00);

        lista.add(Suits);
        lista.add(TheRookie);
        lista.add(Hitler);
        lista.add(Epstein);
        lista.add(SomosUnitec);
        lista.add(HateTherians);

        do {
            System.out.println("===========================");
            System.out.println("Sistema de Gestiones de Producciones Multimedia");
            System.out.println("0) Salir");
            System.out.println("1) Gestion de Producciones Multimedia");
            opcion = leer.nextInt();

            if (opcion == 0) {
                System.out.println("Tenga Un Buen Dia!");
                break;
            } else if (opcion == 1) {

                System.out.println("=========================");
                System.out.println("1) Registrar distintas Producciones");
                System.out.println("2) Mostrar Informacion");
                System.out.println("3) Calculo final de una Produccion");
                System.out.println("4) Se puede destacar?");
                int eleccion = leer.nextInt();

                if (eleccion == 1) {

                } else if (eleccion == 2) {
                    System.out.println("IMPRIMIENDO PRODUCCIONES");
                    Imprimirlista(lista);
                }else if (eleccion == 3) {
                    System.out.println("Costos de las Producciones");
                    
                }else if (eleccion == 4) {
                    System.out.println("Ingrese la posicion de la serie");
                    int pos = leer.nextInt();
                    
                    if (lista.get(pos)>= 3) {
                        System.out.println("Se puede Destacar");
                    }else{
                    
                        System.out.println("No se Puede Destacar");}
                }

                System.out.println("Ingrese el codigo de Verificacion");
                int codigoID = leer.nextInt();

                System.out.println("Ingrese el Titulo");
                String titulo = leer.next();

                System.out.println("Ingrese la Duracion en minutos");
                int duracion = leer.nextInt();

                System.out.println("Ingrese el Presupuesto");
                double Presupuesto = leer.nextDouble();

            } else {
                System.out.println("Error Ingrese una opcion valida");
            }

        } while (opcion != 3);
    }

    public static void Imprimirlista(ArrayList<ProduccionesMultimedia> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println();
    }
}
