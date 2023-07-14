package Memento;


import java.util.ArrayList;

public class BaseDeDatos {

    private ArrayList<Registro> listado;
    private Caretaker caretaker;

    public BaseDeDatos() {
        listado = new ArrayList<Registro>();
        caretaker = new Caretaker();
    }
    public void agregarRegistro(String n, int e, boolean a){
        Registro temp = new Registro(n,e,a);
        listado.add(temp);
    }
    public void limpiarBD(){

        listado=null;
    }
    public void mostrarListado(){
        if (listado!=null){
            for (Registro temp: listado){
                temp.getRegistro();
            }
        }else {
            System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
            System.out.println("La base de datos se encuentra vacía");
        }
    }
    public void generarBackup(){
        caretaker.setBackup(listado);
    }
     public void getBackup(int i){
        listado = new ArrayList<>();
        for(Registro temp: caretaker.getBackup(i)){
            listado.add(temp);
        }
     }
     public int getTamanioBackup(){
        return caretaker.getSize();
     }
}
