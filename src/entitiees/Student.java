package entitiees;

public class Student {
    public String name;

    public Double nota1;
    public Double nota2;
    public Double nota3;

    public Double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public Double pontosFaltantes() {
        if (notaFinal() < 60) {
            return 60 - notaFinal();
        }
        else {
            return 0.0;
        }
    }


}
