import java.util.Locale;
import java.util.Scanner;

import entitiees.Student;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();

        student.name = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("Nota Final: %.2f%n", student.notaFinal());

        if(student.notaFinal() < 60) {
            System.out.println("Reprovado");
            System.out.printf("Faltaram %.2f Pontos%n", student.pontosFaltantes());
        }
        else {
            System.out.println("Aprovado!");
        }


        sc.close();
    }
    
}
