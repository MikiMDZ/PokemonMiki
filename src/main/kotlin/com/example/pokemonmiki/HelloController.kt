package com.example.pokemonmiki

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.ProgressBar
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.HBox
import javafx.scene.paint.Color
import javafx.stage.Stage
import java.io.File


class HelloController {
    var interfaces = mutableListOf<Interfaz>()


    //Para cada pokemon
    @FXML
    private lateinit var p1img: ImageView

    @FXML
    private lateinit var p1pb: ProgressBar

    @FXML
    private lateinit var p1ps: Label

    @FXML
    private lateinit var p1n: Label

    @FXML
    private lateinit var p1g: ImageView

    @FXML
    private lateinit var p1l: Label
    @FXML
    private lateinit var estado1 : ImageView

    //Pokemon 2
    @FXML
    private lateinit var p2img: ImageView

    @FXML
    private lateinit var p2pb: ProgressBar

    @FXML
    private lateinit var p2ps: Label

    @FXML
    private lateinit var p2n: Label

    @FXML
    private lateinit var p2g: ImageView

    @FXML
    private lateinit var p2l: Label
    @FXML
    private lateinit var estado2 : ImageView

    //Pokemon 3
    @FXML
    private lateinit var p3img: ImageView

    @FXML
    private lateinit var p3pb: ProgressBar

    @FXML
    private lateinit var p3ps: Label

    @FXML
    private lateinit var p3n: Label

    @FXML
    private lateinit var p3g: ImageView

    @FXML
    private lateinit var p3l: Label
    @FXML
    private lateinit var estado3 : ImageView

    //Pokemon 4
    @FXML
    private lateinit var p4img: ImageView

    @FXML
    private lateinit var p4pb: ProgressBar

    @FXML
    private lateinit var p4ps: Label

    @FXML
    private lateinit var p4n: Label

    @FXML
    private lateinit var p4g: ImageView

    @FXML
    private lateinit var p4l: Label
    @FXML
    private lateinit var estado4 : ImageView

    //Pokemon 5
    @FXML
    private lateinit var p5img: ImageView

    @FXML
    private lateinit var p5pb: ProgressBar

    @FXML
    private lateinit var p5ps: Label

    @FXML
    private lateinit var p5n: Label

    @FXML
    private lateinit var p5g: ImageView

    @FXML
    private lateinit var p5l: Label
    @FXML
    private lateinit var estado5 : ImageView

    //Pokemon 6
    @FXML
    private lateinit var p6img: ImageView

    @FXML
    private lateinit var p6pb: ProgressBar

    @FXML
    private lateinit var p6ps: Label

    @FXML
    private lateinit var p6n: Label

    @FXML
    private lateinit var p6g: ImageView

    @FXML
    private lateinit var p6l: Label
    @FXML
    private lateinit var estado6 : ImageView

    @FXML
    private lateinit var continuar: Button

    @FXML
    private lateinit var hbox1: HBox

    @FXML
    private lateinit var hbox2: HBox

    @FXML
    private lateinit var hbox3: HBox

    @FXML
    private lateinit var hbox4: HBox

    @FXML
    private lateinit var hbox5: HBox

    @FXML
    private lateinit var hbox6: HBox

    @FXML
    private lateinit var estadisticas: Button

    @FXML
    private lateinit var friends: Button

    @FXML
    public lateinit var contadorFriends: Label


    var control1: Estadisticas? = null
    var control2: AmigosController? = null


    var stage: Stage? = null

    //Funciones
    fun onclick(gui: Interfaz) {
        gui.nombre.textFill = Color.web("white")
        gui.nivel.textFill = Color.web("white")
        gui.vida.textFill = Color.web("white")
    }

    fun reset(gui: Interfaz) {
        gui.nombre.textFill = Color.web("black")
        gui.nivel.textFill = Color.web("black")
        gui.vida.textFill = Color.web("black")
    }

    fun inicializar(gui: Interfaz, index: Int) {
        continuar.disableProperty().set(true)
        gui.nombre.text = misPokemon[index].nombre
        gui.nivel.text = "NV" + misPokemon[index].nivel.toString()
        gui.vida.text = misPokemon[index].vidaRestante.toString() + '/' + misPokemon[index].vidaTotal.toString()
        val imagen = File(misPokemon[index].image)
        val masc = File("./images/macho.png")
        val fem = File("./images/hembra.png")
        gui.ip.image = Image(imagen.toURI().toString())
        if (misPokemon[index].genero == 'm')
            gui.genero.image = Image(masc.toURI().toString())
        else
            gui.genero.image = Image(fem.toURI().toString())

        if (misPokemon[index].estado == "Quemado")
            gui.estado.image=  Image(File("./images/fuego.png").toURI().toString())
        else
            if (misPokemon[index].estado == "Envenenado")
                gui.estado.image=  Image(File("./images/veneno.png").toURI().toString())
            else
                if (misPokemon[index].estado == "Congelado")
                    gui.estado.image=  Image(File("./images/frio.png").toURI().toString())
                else
                    gui.estado.image= Image(File("").toURI().toString())

    }

    class Interfaz(
        var nombre: Label,
        var genero: ImageView,
        var nivel: Label,
        var vida: Label,
        var ip: ImageView,
        var pokemon: Pokemon,
        var barra: ProgressBar,
        var estado: ImageView,
        var contador: Label
    )

    @FXML
    fun initialize() {

        interfaces = mutableListOf(
            Interfaz(p1n, p1g, p1l, p1ps, p1img, misPokemon[0], p1pb,estado1,contadorFriends),
            Interfaz(p2n, p2g, p2l, p2ps, p2img, misPokemon[1], p2pb,estado2,contadorFriends),
            Interfaz(p3n, p3g, p3l, p3ps, p3img, misPokemon[2], p3pb,estado3,contadorFriends),
            Interfaz(p4n, p4g, p4l, p4ps, p4img, misPokemon[3], p4pb,estado4,contadorFriends),
            Interfaz(p5n, p5g, p5l, p5ps, p5img, misPokemon[4], p5pb,estado5,contadorFriends),
            Interfaz(p6n, p6g, p6l, p6ps, p6img, misPokemon[5], p6pb,estado6,contadorFriends)
        )

        interfaces.forEachIndexed { index, interfaz ->
            inicializar(interfaz, index)
        }
    }


    fun vBoxCliked(posicion: Int) {
        interfaces.forEach {
            reset(it)
        }
        onclick(interfaces[posicion])

    }
    fun initial(){
        interfaces.forEach{reset(it)}
        continuar.disableProperty().set(true)
    }
    fun allfalse(){
        misPokemon.forEach {
            it.bol=false
        }
    }

    fun onp1clicked() {
        allfalse()
        misPokemon[0].bol = true
        continuar.disableProperty().set(false)
        if (misPokemon[0].vidaRestante <= 0) continuar.disableProperty().set(true)

        vBoxCliked(0)
    }

    fun onp2clicked() {
        allfalse()
        misPokemon[1].bol = true
        continuar.disableProperty().set(false)
        if (misPokemon[1].vidaRestante <= 0) continuar.disableProperty().set(true)

        vBoxCliked(1)
    }

    fun onp3clicked() {
        allfalse()
        misPokemon[2].bol = true
        continuar.disableProperty().set(false)
        if (misPokemon[2].vidaRestante <= 0) continuar.disableProperty().set(true)

        vBoxCliked(2)
    }

    fun onp4clicked() {
        allfalse()
        misPokemon[3].bol = true
        continuar.disableProperty().set(false)
        if (misPokemon[3].vidaRestante <= 0) continuar.disableProperty().set(true)

        vBoxCliked(3)
    }

    fun onp5clicked() {
        allfalse()
        misPokemon[4].bol = true
        continuar.disableProperty().set(false)
        if (misPokemon[4].vidaRestante <= 0) continuar.disableProperty().set(true)

        vBoxCliked(4)
    }

    fun onp6clicked() {
        allfalse()
        misPokemon[5].bol = true
        continuar.disableProperty().set(false)
        if (misPokemon[5].vidaRestante <= 0) continuar.disableProperty().set(true)

        vBoxCliked(5)
    }

    fun onContinuarClicked() {
        if (stage == null) {

            val stage = Stage()
            val loader = FXMLLoader(HelloApplication::class.java.getResource("combate-view.fxml"))
            val scene = Scene(loader.load())
            stage.title = "Pokemon"
            stage.scene = scene
            stage.isResizable = false

            val controlador = loader.getController<CombateController>()
            var seleccionado: Pokemon?=null
            misPokemon.forEachIndexed { index, pokemon ->
                if (pokemon.bol) {
                    seleccionado = misPokemon[index]
                    misPokemon[index].seleccionado += 1

                }
            }
            if (seleccionado!=null) {
                stage.show()
                seleccionado?.let { controlador.cargarPokemon(it) }
                seleccionado?.let { control1?.actualizarbar(it) }
                controlador.enviarDatosMenuSeleccion(this)
            }else continuar.disableProperty().set(true)
        }


    }

    fun onFriendsClicked() {
        if (stage == null) {

            val stage = Stage()
            val loader = FXMLLoader(AmigosController::class.java.getResource("amigos.fxml"))
            val scene = Scene(loader.load())
            stage.title = "Amigos"
            stage.scene = scene
            stage.isResizable = false
            stage.show()
            control2 = loader.getController<AmigosController>()

        }


    }



    fun onestadisticasClicked() {
        if (stage == null) {

            val stage = Stage()
            val loader = FXMLLoader(Estadisticas::class.java.getResource("estadisticas.fxml"))
            val scene = Scene(loader.load())
            stage.title = "Estadisticas"
            stage.scene = scene
            stage.isResizable = false
            stage.show()
            control1 = loader.getController<Estadisticas>()

        }


    }
    fun quedanvivos():Boolean {
        var alguienvivo = false
        misPokemon.forEach {
            if (it.pokemonMuerte())
                alguienvivo = true


        }
        return alguienvivo
    }

    fun seleccionadopokemon(pokemon: Pokemon) {

        interfaces.forEachIndexed { index, interfazPokemon ->
            if (pokemon.nombre.equals(interfazPokemon.pokemon.nombre)) {
                interfazPokemon.vida.text = pokemon.vidaRestante.toString() + "/" + pokemon.vidaTotal.toString()
                interfazPokemon.barra.progress = pokemon.vidaRestante.toDouble() / pokemon.vidaTotal.toDouble()
                if (interfazPokemon.barra.progress < 0.25) interfazPokemon.barra.style = "-fx-accent:red"
                else {
                    if (interfazPokemon.barra.progress < 0.5) interfazPokemon.vida.style = "-fx-accent:#ff8929"
                }
                if (pokemon.estado == "Quemado")
                    interfazPokemon.estado.image=  Image(File("./images/fuego.png").toURI().toString())
                else
                    if (pokemon.estado == "Envenenado")
                        interfazPokemon.estado.image=  Image(File("./images/veneno.png").toURI().toString())
                    else
                        if (pokemon.estado == "Congelado")
                            interfazPokemon.estado.image=  Image(File("./images/frio.png").toURI().toString())
                        else
                            interfazPokemon.estado.image= Image(File("").toURI().toString())
            }
        }
    }

    fun actpie() {
       control1?.actualizarpie()
    }
    @FXML
    fun mostrarAlertError() {
        val alert = Alert(Alert.AlertType.ERROR)
        alert.headerText = null
        alert.title = "Error"
        alert.contentText = "No tienes ningun Pokemon vivo"
        alert.showAndWait()
    }


}