package com.db1.db1start;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import static java.util.Collections.*;



public class ExEstruturaJava {
    //Método que retorne os nomes das cores que você mais gosta
    public static void main(String[] args) {

        //Método que retorne os nomes das cores que você mais gosta

//        List<String> cores = new ArrayList<>();
//        cores.add("Verde");
//        cores.add("Amarelo");
//        cores.add("Branco");
//        imprimir(cores);
//    }
//    private static void imprimir( List<String> cores) {
//        System.out.println(cores);
//    }

        //Método que dado uma lista retorne a quantidade de itens

//        List<String> qtddDados = new ArrayList<>();
//        qtddDados.add("Felipe");
//        qtddDados.add("Flavia");
//        qtddDados.add("Lidia");
//        qtddDados.add("Arthur");
//        for(Integer i = 0; qtddDados != null ; i++){
//            i++;
//            System.out.println(qtddDados);
//            break;
//        }
//        System.out.println("Número de itens: " + qtddDados.size());

        //Método que receba 3 String, adicione todos em uma lista e remova a segunda posição

//        List<String> tresString = new ArrayList<>();
//        tresString.add("Mouse");
//        tresString.add("Teclado");
//        tresString.add("Monitor");
//        System.out.println("Minha lista: " + tresString);
//
//        tresString.remove(1); // ou tresStringremove("Teclado");
//        System.out.println("Removendo a segunda posição: " + tresString);

        //Método que imprima a lista de cores do primeiro método

//        private static void imprimir( List<String> cores) {
//        System.out.println(cores);
//
//        //Método que imprima as cores do primeiro método em ordem alfabética
//
//        private static void imprimir( List<String> cores) {
//            System.out.println("Lista Original: " + cores);
//            separar();
//            Collections.sort(cores);
//            System.out.println("Lista em Ordem Alfabética: " + cores);

        //Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida

//        private static void imprimir(List<String> cores){
//            String corRemovida = cores.remove(1);
//            System.out.println("Removendo cor: " + corRemovida + " da lista: " + cores);
//        }

        //Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)
//            private static void imprimir( List<String> cores) {
//                System.out.println("Lista Original: " + cores);
//                separar();
//                cores.sort(Collections.reverseOrder());
//                System.out.println("Lista Descrecente: " + cores);

        //Método que receba uma lista de números e retorne um mapa com listas de números pares e impares


        Map<String, List<Integer>> mapParesImpares = mapParesImpares(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println("Impressao dos Numeros Pares");
        List<Integer> listaPares = mapParesImpares.get("pares");
        listaPares.forEach(System.out::println);

        System.out.println("\n");

        System.out.println("Impressao dos Numeros Impares");
        List<Integer> listaImpares = mapParesImpares.get("impares");
        listaImpares.forEach(System.out::println);

    }//Fim método principal
    public static Map<String, List<Integer>> mapParesImpares(List<Integer> numeros) {

        // Instancia uma lista para numeros pares e uma para os impares
        List<Integer> listaPares = new ArrayList<>();
        List<Integer> listaImpares = new ArrayList<>();

        // Para cadas numero na lista de numeros passados no parametro faça
        numeros.forEach(numero -> {
            // Se o numero for divisivel por 2 adicione-o a lista de pares
            if (numero % 2 == 0) listaPares.add(numero);
                // Senao adicione-o a lista de impares
            else listaImpares.add(numero);
        });

        // Criasse o Map
        Map<String, List<Integer>> resultado = new HashMap<>();

        // Adicionasse a lista de numeros pares
        resultado.put("pares", listaPares);

        // Adicionasse a lista de numeros impares
        resultado.put("impares", listaImpares);

        // O resultado sera uma map onde para a chave "pares"
        // tera uma lista contendo os numeros pares e para a chave "impares"
        // uma lista dos numeros impares
        return resultado;
    }

    private static void separar() {
        System.out.println("------------------");
    }
};
