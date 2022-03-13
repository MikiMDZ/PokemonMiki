module com.example.pokemonmiki {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires javafx.graphics;


    opens com.example.pokemonmiki to javafx.fxml;
    exports com.example.pokemonmiki;
}