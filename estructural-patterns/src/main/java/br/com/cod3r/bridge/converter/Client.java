package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.ITGuy;
import br.com.cod3r.bridge.converter.employees.ProjectManager;

public class Client {

    public static void main(String[] args) {
        Converter csvConverter = new CSVConverter();
        Converter jsonConverter = new JsonConverter();

        ITGuy itGuy = new ITGuy("Jack", 31, 3000.0);
        ProjectManager projectManager = new ProjectManager("Mark", 45, 5500.0);

        System.out.println(csvConverter.getEmployeeFormatted(itGuy));
        System.out.println(csvConverter.getEmployeeFormatted(projectManager));
        System.out.println(jsonConverter.getEmployeeFormatted(itGuy));
        System.out.println(jsonConverter.getEmployeeFormatted(projectManager));
    }
}
