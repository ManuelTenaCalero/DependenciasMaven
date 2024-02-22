package org.babel;
import com.google.gson.Gson;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Crear un objeto Java
        Persona persona = new Persona("Juan", 25);

        // Convertir objeto Java a JSON
        Gson gson = new Gson();
        String json = gson.toJson(persona);
        System.out.println("Objeto Java convertido a JSON:");
        System.out.println(json);

        // Convertir JSON a objeto Java
        String jsonPersona = "{\"nombre\":\"María\",\"edad\":30}";
        Persona personaDesdeJson = gson.fromJson(jsonPersona, Persona.class);
        System.out.println("\nJSON convertido a objeto Java:");
        System.out.println("Nombre: " + personaDesdeJson.getNombre());
        System.out.println("Edad: " + personaDesdeJson.getEdad());


    }
}