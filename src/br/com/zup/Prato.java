package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nomeDoPrato;
    private double preco;
    List <Ingrediente> ingredientes = new ArrayList<>();

    public Prato() {
    }

    public Prato(String nomeDoPrato, double preco, List<Ingrediente> ingredientes) {
        this.nomeDoPrato = nomeDoPrato;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }

    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public void setNomeDoPrato(String nomeDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        StringBuilder concatedor = new StringBuilder();
        concatedor.append("Prato: " + nomeDoPrato);
        concatedor.append("\nPreço: " + preco);
        concatedor.append("\nIngredientes: " + ingredientes);
        return concatedor.toString();
    }

}
