package br.com.cod3r.command.migration;

import br.com.cod3r.command.migration.commands.ProductTable;
import br.com.cod3r.command.migration.commands.UserTable;
import br.com.cod3r.command.migration.commands.UserTableRoleColumn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        Map<String, List<String>> database = new HashMap<>();
        MigrationTool tool = new MigrationTool();

        // Add the migrations out of order because they will be sorted
        // by the MigrationTool since MigrationCommand implements the Comparable interface
        tool.addMigration(new UserTableRoleColumn(database));
        tool.addMigration(new ProductTable(database));
        tool.addMigration(new UserTable(database));

        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.latest();
        System.out.println(database);

        tool.rollback();
        System.out.println(database);
    }
}
