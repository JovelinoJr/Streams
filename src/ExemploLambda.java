import java.util.*;
import java.util.stream.*;

class Pessoa {
    String nome;
    String sexo;

    Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome + " (" + sexo + ")";
    }
}

public class ExemploLambda {
    public static void main(String[] args) {

        List<Pessoa> pessoas = List.of(
                new Pessoa("Ana", "F"),
                new Pessoa("Bruno", "M"),
                new Pessoa("Carla", "F"),
                new Pessoa("Diego", "M"),
                new Pessoa("Fernanda", "F")
        );

        // Filtrar apenas sexo feminino usando lambda
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.sexo.equalsIgnoreCase("F"))
                .collect(Collectors.toList());


        System.out.println("Lista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}
