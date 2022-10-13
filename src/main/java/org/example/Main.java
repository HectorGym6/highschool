package org.example;


import org.example.components.StudentReader;
import org.example.configuration.HighschoolConfiguration;
import org.example.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
Crea un proyecto que use Spring Framework que nos permita pedir los datos de un instituto:

        a. Un bean de tipo Scanner

        b. Un bean StudentReader. Este bean tendrá un método que al ser invocado pide al usuario los datos de un estudiante y lo devuelve. Un estudiante tiene los siguientes campos: nif, nombre y apellidos

        c. Un bean GroupReader. Este bean tendrá un método que al ser invocado pide los datos de un grupo y lo devuelve. Un grupo tiene: letra, curso y una lista de estudiantes.

        d. Un bean InstitutoReader. Este bean tendrá un método que al ser invocado pide los datos de un instituto y lo devuelve. Un instituto tiene: nombre y una lista de grupos.

        e. Otro bean (InstitutoWriter) que guarda los datos de un instituto en un fichero json.

        i. ObjectMapper

        ii. El path al fichero (configurable)

        f. El bean programa que pide un insittuto y lo guarda en un archivo json

        i. InstitutoReader

        ii. InstitutoWriter

        En el main hay que crear el application context, recupera el bean principal y lo ejecuta  */
public class Main {
    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                HighschoolConfiguration.class
        );

        StudentReader studentReader = context.getBean(StudentReader.class);
        Student student = studentReader.readStudent();
        log.info(student.toString());
    }
}