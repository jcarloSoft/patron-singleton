package com.bolsadeideas.springboot.webflux.model;

public class App {
  public static void main(String[] args) {
  // Instanciación por constructor prohibido por ser "private"  
  //Conexion c = new Conexion();
  Conexion c = Conexion.getInstancia();
  c.conectar();
  c.desconectar();
  
  boolean rpta = c instanceof Conexion;
  System.out.println(rpta);
  }

}
