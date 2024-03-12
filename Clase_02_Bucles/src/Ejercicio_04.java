public class Ejercicio_04 {
    public static void main(String[] args){
        int suma =0;

        for (int i =0;i<=100;i++){
            if (i % 2 == 0){
                suma +=i;
            }
        }
        System.out.println(suma);
    }
}
