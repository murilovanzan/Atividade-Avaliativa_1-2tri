package avaliacao1_trimeste2.exercicio3;

import avaliacao1_trimeste2.Estudante;

public class Main {
    public static void main() {

        Estudante e1 = new Estudante("a",3);
        Estudante e2 = new Estudante("b",3);
        Estudante e3 = new Estudante("c",3);

        e1.insereNotas();
        e2.insereNotas();
        e3.insereNotas();

        Estudante[] estudantes = {e1,e2,e3};
        Estudante[] aprovados = calculoAprovados(estudantes);
        if(aprovados != null) {
            for (Estudante e : aprovados) {
                System.out.println(e.getNome());
            }
        }
    }

    public static Estudante[] calculoAprovados(Estudante[] estudantes){

        int qtdAprovados=0,i=0;
        for (Estudante estudante : estudantes){
            if(estudante.calculaMedia()>=6){
                qtdAprovados++;
            }
        }

        if (qtdAprovados == 0 ) return null;

        Estudante[] aprovados = new Estudante[qtdAprovados];

        for (Estudante estudante : estudantes){
            if(estudante.calculaMedia()>=6) {
                aprovados[i] = estudante;
                i+=1;
            }
        }
        return aprovados;
    }
}

