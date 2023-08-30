package Exercicio21;

public class Cofrinho{
    private final int capacidade = 30;
    private Moeda [] base;
    private int aux;

    public Cofrinho(){
        base = new Moeda[capacidade];
        aux = 0;
    }

    public int tamanho(){
        return aux;
    }

    public int capacidade(){
        return capacidade;
    }


    public boolean insere(Moeda moeda){
        if(aux == capacidade){
            return false;
        }else{
            base [aux] = moeda;
            aux++;
            return true;

        }

    }

    public boolean retira(int indice){
        if(indice<0 || indice>=aux ){
            return false;
        }else{
            for(int i = indice; i<aux -1; i++){
                base[i] = base[i +1];
            }
            aux--;
            return true;
        }
        
    }
    
}