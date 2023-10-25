package ExercicioLambida;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Aula25{
    public static void main(String [] aergs){

        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        //a) Iterar sobre uma lista de strings e imprimir o conteúdo no console.
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out :: println);

        //b) Criar uma string que consiste na concatenação das primeiras letras de cada string contida em
        //uma lista de strings.
        String result =list.stream().map(s -> s.substring(0,1)).collect(Collectors.joining(""));
        //Puxamos o "map", para consultar na Stream
        //s se torna cada "char" da lista
        //Com o substring é como um charAt, com ele estamos pegando a a primeira letra de cada "s" 
        //Começnado da posição 0 até 1
        //Com o collect, coletamos o que fizemos anteriormente
        System.out.println(result);

        //c) Transformar uma lista de strings em strings maiúsculas (ou seja, alterando a lista original).
        String list2 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(list2);

        list = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        list.forEach(System.out::println);

        //d) Transformar uma lista de strings em uma nova lista de strings em maiúsculas (ou seja, sem
        //alterar a original).
        List<String> list3 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list3);

        //e) Contar o número de elementos de uma lista de strings que possuem pelo menos seis
        //caracteres.
        long c = list.stream().filter(a -> a.length() >= 6).collect(Collectors.counting());
        System.out.println(c);

        List<String> c2 = list.stream().filter(a -> a.length() >= 6).collect(Collectors.toList());
        System.out.println(c2);
        
    }
    
}