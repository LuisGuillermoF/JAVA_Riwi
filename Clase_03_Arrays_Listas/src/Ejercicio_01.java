import java.util.Scanner;

public class Ejercicio_01 {

    public static void main(String[] args){
        double[] arrNotas = new double[10];
        double sumatotal =0;
        double promedio =0;
        Scanner scanner = new Scanner(System.in);

        for (int i =0; i<10;i++){
            System.out.println("Ingrese la nota del estudiante #")+(i+1);
            try {
                double nota = scanner.nextDouble();
                arrNotas[i]=nota;
                sumatotal += arrNotas[i];
            }catch (Exception e){
                System.out.println("Notas no valida"+i);
                break;
            }
        }

        promedio = sumatotal/10;

        System.out.println("El promedio de las notas es:"+ promedio);
    }
}
