package br.com.jove.streams;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class ExemploLambdaTeste {
    @Test

    public void deveFiltrarApenasMulheres() {
        List<Pessoa> pessoas = List.of(
                new Pessoa("Ana", "F"),
                new Pessoa("Bruno", "M"),
                new Pessoa("Carla", "F"),
                new Pessoa("Diego", "M"),
                new Pessoa("Fernanda", "F")
        );

        // Filtrar só as mulheres
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.sexo.equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        // Verifique se só tem mulheres na lista filtrada
        assertEquals(3, mulheres.size());
        for (Pessoa mulher : mulheres) {
            assertEquals("F", mulher.sexo);
        }
    }

}
