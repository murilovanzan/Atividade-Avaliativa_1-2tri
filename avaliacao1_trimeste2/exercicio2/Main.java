package avaliacao1_trimeste2.exercicio2;

import avaliacao1_trimeste2.Estudante;

public class Main {

    public static void main(String[] args) {
        Estudante murilo = new Estudante("murilo",5);

        murilo.insereNotas();

        for (double x : murilo.getNotas()){
            System.out.println(x);
        }

        System.out.println(murilo.calculaMedia());
        System.out.println(murilo.menorNota());
    }

}
