package Memento;

import java.util.Scanner;

public class MainMemento {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        BaseDeDatos bd = new BaseDeDatos();

        bd.agregarRegistro("Alex",30,true);
        bd.agregarRegistro("Ronald",32,true);
        bd.generarBackup(); //Primer backup

        bd.agregarRegistro("Carol",18,true);
        bd.agregarRegistro("Laura",20,true);
        bd.generarBackup();//Segundo backup

        bd.agregarRegistro("Yadir",30,false);
        bd.agregarRegistro("Jennie",27,false);
        bd.generarBackup();//Tercer backup

        do{
            mostrarMenu();
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    bd.mostrarListado();
                    break;
                case 2:
                    bd.limpiarBD();
                    System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
                    System.out.println("\tSe elimino la base de datos");
                    break;
                case 3:
                    muestraBackup(bd.getTamanioBackup());
                    bd.getBackup(sc.nextInt()-1);
                    break;
                default:
                    System.out.println("Digite una opción valida");
            }
        } while (opcion!=0);
    }

    public static void mostrarMenu(){
        System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
        System.out.println("               SELECCIONE UNA OPCIÓN              ");
        System.out.println(" 1) Listar Datos   2) Limpiar BD   3) Restaurar BD");
        System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
    }

    public static void muestraBackup(int t){
        System.out.format("- Existen %s Backups.", t);
        System.out.print("\n- Digite el número de backup que desea restaurar: ");
    }
}
