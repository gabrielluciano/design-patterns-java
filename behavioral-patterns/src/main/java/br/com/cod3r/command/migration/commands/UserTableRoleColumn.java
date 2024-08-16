package br.com.cod3r.command.migration.commands;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class UserTableRoleColumn extends MigrationCommand {

    public UserTableRoleColumn(Map<String, List<String>> database) {
        super(database, LocalDateTime
                .of(2024, 8, 16, 11, 30));
    }

    @Override
    public void execute() {
        database.get("users").add("role");
    }

    @Override
    public void undo() {
        database.get("users").remove("role");
    }
}
