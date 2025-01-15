package com.example.streams;

import com.example.streams.testData.DatosPrueba;
import com.example.streams.testData.Empleado;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        /**
         *         System.out.println("Empleados by Departamento IT: " + getEmployByDepartamento());
         *         System.out.println("Listado de Empleados: " + getEmployNames());
         *         OptionalDouble averageSalary = getAverageSalary();
         *         averageSalary.ifPresent(average -> System.out.println("Salario Promedio: " + average));
         *         Optional<Empleado> mejorPagado = getHiestSalary();
         *         mejorPagado.ifPresent(maxSalary -> System.out.println("Maximo Salario: " + maxSalary));
         *         System.out.println("Empleados por departamento: " + getGrouptByDepartamento());
         *         System.out.println("Suma salarios HR: " + getSumSalaryHR());
         *
         */


    }

    private static Double getSumSalaryHR(){
        return DatosPrueba.getEmpleados()
                .stream()
                .mapToDouble(Empleado::getSalario)
                .sum();
    }

    private static Map<String, List<Empleado>> getGrouptByDepartamento(){
        return  DatosPrueba.getEmpleados()
                .stream()
                .collect(Collectors.groupingBy(Empleado::getDepartamento));
    }

    private static Optional<Empleado> getHiestSalary(){
        return DatosPrueba.getEmpleados()
                .stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));

    }

    private static OptionalDouble getAverageSalary(){
        return DatosPrueba.getEmpleados()
                .stream()
                .mapToDouble(Empleado::getSalario)
                .average();
    }
    private static List<Empleado> getEmployByDepartamento(){
        return DatosPrueba.getEmpleados()
                .stream()
                .filter(empleado -> empleado.getDepartamento().equals("IT"))
                .collect(Collectors.toList());
    }

    private static List<String> getEmployNames(){
        return DatosPrueba.getEmpleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toList());
    }
}
