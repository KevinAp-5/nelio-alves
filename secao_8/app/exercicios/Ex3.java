package secao_8.app.exercicios;

public class Ex3 {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public void finalGrade() {
        double notaFinal = nota1 + nota2 + nota3;
        System.out.printf("FINAL GRADE = %.2f%n", notaFinal);
        if (notaFinal < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", 60 - notaFinal);
        }
        else {
            System.out.println("PASS");
        }
    }
}
