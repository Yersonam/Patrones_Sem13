package Memento;

import java.util.ArrayList;

public class Caretaker {
    private ArrayList<ArrayList<Registro>> backup;

    public Caretaker() {
        this.backup = new ArrayList<ArrayList<Registro>>();
    }
    public void setBackup(ArrayList<Registro> bd){
        ArrayList<Registro> lista = new ArrayList<Registro>();
        for (Registro registro: bd){
            lista.add(registro);
        }
        backup.add(lista);
    }
    public ArrayList<Registro> getBackup(int i){

        return backup.get(i);
    }
    public int getSize(){

        return backup.size();
    }
}
