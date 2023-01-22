package org.example;

public class Calculadora {

    private String nombre;
    private Integer edad;
    private Double altura;
    private Double peso;

    public Calculadora() {
    }

    public Calculadora(String nombre, Integer edad, Double altura, Double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
