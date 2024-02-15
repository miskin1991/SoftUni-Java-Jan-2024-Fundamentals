package Exercises.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pokemons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (!pokemons.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            int capturedPokemon = 0;
            if (index < 0) {
                capturedPokemon = pokemons.get(0);
                sum += capturedPokemon;
                pokemons.set(0, pokemons.get(pokemons.size() - 1));
            } else if (index >= pokemons.size()) {
                capturedPokemon = pokemons.get(pokemons.size() - 1);
                sum += pokemons.get(pokemons.size() - 1);
                pokemons.set(pokemons.size() - 1, pokemons.get(0));
            } else {
                capturedPokemon = pokemons.get(index);
                pokemons.remove(index);
                sum += capturedPokemon;
            }
            updatePokemons(pokemons, capturedPokemon);
        }
        System.out.println(sum);
    }

    private static void updatePokemons(List<Integer> pokemons, int capturedPokemon) {
        for (int i = 0; i < pokemons.size(); i++) {
            int pokemon = pokemons.get(i);
            if (pokemon <= capturedPokemon) {
                pokemon += capturedPokemon;
            } else {
                pokemon -= capturedPokemon;
            }
            pokemons.set(i, pokemon);
        }
    }
}
