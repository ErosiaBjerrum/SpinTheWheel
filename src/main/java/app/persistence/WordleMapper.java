package app.persistence;

public class WordleMapper {

    private final ConnectionPool connectionPool;

    public WordleMapper(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
