package br.com.cod3r.singleton.connectionPool.monostate;

import br.com.cod3r.singleton.connectionPool.monostate.conn.Connection;
import br.com.cod3r.singleton.connectionPool.monostate.conn.ConnectionPool;
import br.com.cod3r.singleton.connectionPool.monostate.conn.IConnectionPool;

public class Client {
    public static void doQuery1() {
        IConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A1");
    }

    public static void doQuery2() {
        IConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if (conn != null) {
            conn.query("SELECT * FROM A2");
            // pool.leaveConnection(conn);
        }
    }

    public static void doQuery3() {
        IConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A3");
    }

    public static void main(String[] args) {
        doQuery1();
        doQuery2();
        // Should not get connection since the two available connections were requested
        // by doQuery1 and doQuery2 methods but weren't closed
        doQuery3();
    }
}
