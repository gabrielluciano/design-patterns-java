package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.OracleFactory;

public class Client {

    public static void main(String[] args) {
        DB db = new OracleFactory().getDatabase();
        db.query("SELECT * FROM users");
        db.update("UPDATE users SET name = 'John' WHERE id = 2");
    }
}
