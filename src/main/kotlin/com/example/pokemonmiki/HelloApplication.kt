package com.example.pokemonmiki

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage


var misPokemon = ArrayList<Pokemon>()
var badPokemon = ArrayList<PokemonEnemigo>()
val listaestados = listOf("Quemado","Envenenado","Congelado")

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val pokeMio1= Pokemon("Rayquaza",81,193,"./images/Rayquaza.png", 'm', 1, listaestados.random())
        val pokeMio2= Pokemon("Roselia",93,164,"./images/Roselia.png", 'h',2, listaestados.random())
        val pokeMio3= Pokemon("Pikachu",66,120,"./images/Pikachu.png", 'm',3, listaestados.random())
        val pokeMio4= Pokemon("Squirtle",69,116,"./images/Squirtle.png", 'h',4, listaestados.random())
        val pokeMio5= Pokemon("snorlax",100,220,"./images/Snorlax.png", 'm',5, listaestados.random())
        val pokeMio6= Pokemon("Celebi",79,215,"./images/Celebi.png", 'h',6, listaestados.random())

        misPokemon.add(pokeMio1)
        misPokemon.add(pokeMio2)
        misPokemon.add(pokeMio3)
        misPokemon.add(pokeMio4)
        misPokemon.add(pokeMio5)
        misPokemon.add(pokeMio6)

        val pokeEne1= PokemonEnemigo("Thwackey",77,184,"./images/Thwackey.png", 'h', listaestados.random())
        val pokeEne2= PokemonEnemigo("Carbink",64,178,"./images/Carbink.png", 'm', listaestados.random())
        val pokeEne3= PokemonEnemigo("Abomasnow",62,154,"./images/Abomasnow.png", 'h', listaestados.random())
        val pokeEne4= PokemonEnemigo("Centiskorch",88,161,"./images/Centiskorch.png", 'm', listaestados.random())
        val pokeEne5= PokemonEnemigo("Regidrago",89,128,"./images/Regidrago.png", 'h', listaestados.random())
        val pokeEne6= PokemonEnemigo("Mew",99,224,"./images/Mew.png", 'm', listaestados.random())

        badPokemon.add(pokeEne1)
        badPokemon.add(pokeEne2)
        badPokemon.add(pokeEne3)
        badPokemon.add(pokeEne4)
        badPokemon.add(pokeEne5)
        badPokemon.add(pokeEne6)

        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("hello-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 600.0, 400.0)
        stage.title = "POKEMON"
        stage.scene = scene
        stage.isResizable = false
        stage.show()
    }
}


fun main() {
    Application.launch(HelloApplication::class.java)
}