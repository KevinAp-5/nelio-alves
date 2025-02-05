package secao_10.list;

import java.util.ArrayList;
import java.util.List;

public class ListTestes {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Keven");
        lista.add("Ana");
        lista.add("Bob");
        lista.add("George");
        lista.add(3, "juremas");
        System.out.println("Tamanho da lista: " + lista.size());

        lista.remove(3);
        for (String numero : lista) {
            System.out.println(numero);
        }

        lista.remove("Bob");
        lista.removeIf(x -> x.charAt(0) == 'K');

        System.out.println("---------------------");
        for (String numero : lista) {
            System.out.println(numero);
        }

        System.out.println("Index de ana: " + lista.indexOf("Ana"));

        List<String> lista2 = lista.stream().filter(x -> x.charAt(0) == 'A').toList();
        String nome = lista.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(nome);
        System.out.println(lista2);
    }
}
