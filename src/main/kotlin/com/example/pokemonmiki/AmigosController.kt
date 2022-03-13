package com.example.pokemonmiki


import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.text.Text

class AmigosController {

    @FXML
    private lateinit var friend: Text


    fun initialize(){
        pasarAmigos()
    }

    fun pasarAmigos(){
       badPokemon.forEach{
           if(it.probabilidad == true)
               friend.text+=it.nombre+"\t \t \t \tHa sido necesario un total de "+it.contador+" intentos para que sea mi amigo \r"
       }
    }

}