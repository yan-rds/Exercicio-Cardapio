package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {



    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    // Criar prato
    // Este método pega as informações do prato: Nome, Preço e LISTA DE INGREDIENTES
    public static Prato criarPrato(){
        String nomeDoPrato = capturarDados("Qual é o nome do prato?").nextLine();
        double precoDoPrato = capturarDados("Qual é o valor do prato?").nextDouble();

        Prato pratoAdicionado = new Prato();
        List listaDeIngredientes = listaDeIngredientes();
        pratoAdicionado.setIngredientes(listaDeIngredientes);
        pratoAdicionado.setNomeDoPrato(nomeDoPrato);
        pratoAdicionado.setPreco(precoDoPrato);
        return pratoAdicionado;
    }
    // Este método cria e retorna uma LISTA DE INGREDIENTES, essa lista que entrou como parâmetro no método de cima.
    public static List listaDeIngredientes(){
        List<Ingrediente> listaIngredientes = new ArrayList<>();
        int contador = capturarDados("Quantos ingredientes o prato possui?").nextInt();
        while (contador > 0) {
            listaIngredientes.add(instanciarIngrediente());
            contador --;
        }
        return listaIngredientes;
    }
    // Este método cria o OBJETO INGREDIENTE, cria de forma individual, o loop para criar vários está no método LIST acima.
    public static Ingrediente instanciarIngrediente(){
        String nomeDoIngrediente = capturarDados("Digite o nome do ingrediente").nextLine();
        Ingrediente ingredienteAdicionado = new Ingrediente();
        ingredienteAdicionado.setNomeDoIngrediente(nomeDoIngrediente);
        return ingredienteAdicionado;
    }


    public static void menu (){
        System.out.println("1 - Adicionar um prato");
        System.out.println("2 - Exibir cardápio");
        System.out.println("3 - Sair");
    }

    public static void executarMenu (){
        Cardapio cardapio = new Cardapio();
        boolean loopMenu = true;
        while (loopMenu) {
            menu();
            int escolhaMenu = capturarDados("Digite a opção desejada").nextInt();
            if (escolhaMenu == 1) {
                cardapio.adicionarPrato(criarPrato());
            } else if (escolhaMenu == 2) {
                System.out.println(cardapio);
            } else if (escolhaMenu == 3) {
                loopMenu = false;
            }
            else {
                System.out.println("Opção inválida");
            }
        }
    }
}
