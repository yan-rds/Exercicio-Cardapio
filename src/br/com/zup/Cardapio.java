package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    List <Prato> pratos = new ArrayList<>();

    public Cardapio(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public Cardapio() {
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }
}
