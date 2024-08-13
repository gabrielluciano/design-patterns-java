package br.com.cod3r.singleton.connectionPool.monostate.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool implements IConnectionPool {
    private static final int POOL_SIZE = 2;
    private static final List<Connection> connectionsPool;

    static {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<>();
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public ConnectionPool() {
        System.out.println("New instance of Connection Pool created");
    }

    @Override
    public Connection getConnection() {
        Connection avaiable = null;
        for (Connection conn : connectionsPool) {
            if (!conn.isInUse()) {
                avaiable = conn;
                break;
            }
        }
        if (avaiable == null) {
            System.out.println("No Connections avaiable");
            return null;
        }
        avaiable.setInUse(true);
        return avaiable;
    }

    @Override
    public void leaveConnection(Connection conn) {
        conn.setInUse(false);
    }
}
