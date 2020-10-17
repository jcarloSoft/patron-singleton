package com.bolsadeideas.springboot.webflux.model;

public class Conexion {
  // Declaración
  private static Conexion instancia;

  // private static Conexion instancia = new Conexion();

  // Para evitar instancia mediante operador "new"
  private Conexion() {

  }


  // Para obtener la instancia unicamente por es método
  // Notese la palabra reservada "static" hace posible el acceso mediante Clase.metodo

  public static Conexion getInstancia() {
    if (instancia == null) {      // en caso se realice la primera instancia
      instancia = new Conexion();
    }
    return instancia;              // si ya se instanció no se volvería a crear otra instancia solo retornaria la quye ya existe.
  }

  // Método de prueba:
  public void conectar() {
    System.out.println("Me conecté a la BD");
  }

  // Método de prueba:
  public void desconectar() {
    System.out.println("Me desconecté de la BD");
  }

}
