package br.com.cod3r.command.migration.commands;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserTable extends MigrationCommand {

    public UserTable(Map<String, List<String>> database) {
        super(database, LocalDateTime
                .of(2024, 8, 16, 11, 0));
    }

    @Override
    public void execute() {
        database.put("users", Stream.of("id", "name", "cpf", "password").collect(Collectors.toList()));
    }

    @Override
    public void undo() {
        database.remove("users");
    }
}
