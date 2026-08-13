package avaliacao1_trimeste2.exercicio4;

import java.util.Scanner;

public class Estudante {

    private String nome;
    private double[] notas;

    public int qtdNotas;

    public Estudante(String nome,int qtdNotas){
        this.nome = nome;
        this.notas = new double[qtdNotas];
        this.qtdNotas = qtdNotas;
    }

    public void insereNotas(){
        Scanner s = new Scanner(System.in);

        for (int i=0; i<qtdNotas; i++){
            System.out.print("Digite a " + i+1 + "ª nota: ");
            notas[i] = s.nextDouble();
        }
    }

    public double calculaMedia(){

        double mediaNotas = 0;
        
        for (double nota : this.getNotas()){
            mediaNotas+=nota;
        }
        mediaNotas/=qtdNotas;
        
        return mediaNotas;
    }

    public double calculaMedia(int[] pesos){

        double mediaNotas = 0;
        double[] notas = this.getNotas();
        int pesoTotal=0;
        for(int i=0;i<qtdNotas;i++){

            mediaNotas+=notas[i]*pesos[i];
            pesoTotal+=pesos[i];

        }

        mediaNotas/=pesoTotal;

        return mediaNotas;
    }

    public double menorNota(){

        double[] vetorNotas = this.getNotas();
        double menorNota = vetorNotas[0];

        for (double nota : vetorNotas){
            if(nota<menorNota){
                menorNota = nota;
            }
        }

        return menorNota;
    }

    public double[] getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdNotas() {
        return qtdNotas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdNotas(int qtdNotas) {
        this.qtdNotas = qtdNotas;
    }
}
