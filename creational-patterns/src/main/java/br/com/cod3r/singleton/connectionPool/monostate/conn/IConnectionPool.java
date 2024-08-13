package br.com.cod3r.singleton.connectionPool.monostate.conn;

public interface IConnectionPool {

    Connection getConnection();

    void leaveConnection(Connection conn);
}
