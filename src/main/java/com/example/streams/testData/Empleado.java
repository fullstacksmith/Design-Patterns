package com.example.streams.testData;

public class Empleado {
    private int id;
    private String nombre;
    private String departamento;
    private double salario;

    public Empleado(int id, String nombre, String departamento, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', departamento='" + departamento + "', salario=" + salario + "}";
    }
}
