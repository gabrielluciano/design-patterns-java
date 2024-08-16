package br.com.cod3r.command.migration.commands;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class MigrationCommand implements Comparable<MigrationCommand> {
    protected final LocalDateTime dateTime;
    protected final Map<String, List<String>> database;

    protected MigrationCommand(Map<String, List<String>> database, LocalDateTime dateTime) {
        this.database = database;
        this.dateTime = dateTime;
    }

    public abstract void execute();

    public abstract void undo();

    @Override
    public int compareTo(MigrationCommand other) {
        return dateTime.compareTo(other.dateTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MigrationCommand that = (MigrationCommand) o;
        return Objects.equals(dateTime, that.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime);
    }
}
