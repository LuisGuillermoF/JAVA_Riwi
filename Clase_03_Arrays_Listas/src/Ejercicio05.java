import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio05 {

    /*Lista de Reproducción Musical: Imagina que estás creando una aplicación para
    gestionar listas de reproducción musicales. Cada canción es representada
    simplemente por su nombre. El programa debe permitir:
             Añadir y remover canciones de la lista de reproducción.
             Mostrar la canción actual y las siguientes en la lista.
             Saltar a la siguiente canción.*/

    public static void main(String[] args){
        ArrayList<String> playList = new ArrayList<String>();
        String option = "";
        int cancionActual = 0;

        do {

            option = JOptionPane.showInputDialog("PLAYLIST\n"+
                    "1. Añadir una cancion a la playlist\n"+
                    "2. Eliminar una cacion de la playlist\n"+
                    "3. Mostrar cancion actual y siguientes en lista\n" +
                    "4. Saltar a la siguiente cancion\n" +
                    "5. Salir\n" +
                    "Ingrese una opcion");

            switch (option){
                case "1":
                    addSoundToPlaylist(playList);
                    break;
                case "2":
                    DeletePlayList(playList);
                    break;
                case "3":
                    showSounds(playList,cancionActual);
                    break;
                case "4":
                    nextSound(playList);
                    break;
            }

        }while (!option.equals("5"));
    }


    public static void addSoundToPlaylist(ArrayList<String> listSound){
        int repet = 0;

        while(repet ==0){
            String cancionAgg = JOptionPane.showInputDialog("Digite el nombre de la cancion que quiere agregar");
            listSound.add(cancionAgg);

            JOptionPane.showMessageDialog(null,"Se agrego correctamente la cancion\n" +
                    cancionAgg);
            repet = JOptionPane.showConfirmDialog(null,"Quisiera seguir agregando canciones?");
        }

    }

    public  static void DeletePlayList(ArrayList<String> deleteListSound){
        String totalSound = "PLATLIST \n";
        int index = 1;
        for (String temp : deleteListSound){
            totalSound += index + " " + temp + "\n";
            index ++;
        }
        int indexDelete = 0;
        boolean valido = true;
        String input = "";
        do {
            try{
                valido =true;
                input = (JOptionPane.showInputDialog(totalSound+"\n"+"ingrese el numero de la cancion que deseas eliminar"));

                if (input == null){
                    break;
                }else {
                    indexDelete = Integer.parseInt(input);
                    if (indexDelete<=0 || indexDelete > deleteListSound.size()){
                        JOptionPane.showMessageDialog(null, "Indice no valido");
                    }else {
                        JOptionPane.showMessageDialog(null,"Cancion eliminada correctamen");
                    }

                }
            }catch (Exception e){
                valido=false;
            }
        }while (!valido);
    }

    public static void showSounds(ArrayList<String> showPlayList,int cancionActual){

        String mensaje = "Cancion Actual:\n" + showPlayList.get(cancionActual)+"\n Lista de reproduccion: \n";




        //Este siclo itera desde una posicion mas d ela cancanion actual hasta el final de la lista
        for (int i = cancionActual;i<showPlayList.size()-1;i++){
            mensaje += showPlayList.get(i+1)+"\n";
        }
        JOptionPane.showMessageDialog(null,mensaje);
    }

    public static void nextSound(ArrayList<String> nextSound){

    }
}


/*class playlist{
    String cancion;

    public class(ArrayList<playlist> a){

    }
}*/


