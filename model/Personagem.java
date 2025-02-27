package model;
import java.util.HashMap;
import java.util.Map;

import decorator.Componente;

public class Personagem implements Componente {
    private String nome;
    private String classe;
    private String raca;
    private int nivel;
    private Map<String, Double> itens;
    
    @Override
    public String toString() {
        return "Personagem [nome=" + nome + ", classe=" + classe + ", raca=" + raca + ", nivel=" + nivel + ", itens="
                + itens + "]";
    }

    public Personagem(String nome) {
        this.nome = nome;
        itens = new HashMap<>();
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setItens(Map<String, Double> itens) {
        this.itens = itens;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getRaca() {
        return raca;
    }

    public int getNivel() {
        return nivel;
    }
    
    public Map<String, Double> getItens() {
        return itens;
    }

    @Override
    public void definirItem(String nome, double valor) {
        itens.put(nome, valor);
    }


}