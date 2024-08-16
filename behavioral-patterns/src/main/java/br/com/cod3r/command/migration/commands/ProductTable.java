package br.com.cod3r.command.migration.commands;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductTable extends MigrationCommand {

    public ProductTable(Map<String, List<String>> database) {
        super(database, LocalDateTime
                .of(2024, 8, 16, 10, 30));
    }

    @Override
    public void execute() {
        database.put("products", Stream.of("id", "name", "price", "description").collect(Collectors.toList()));
    }

    @Override
    public void undo() {
        database.remove("products");
    }
}
