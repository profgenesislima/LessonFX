
package br.lesson.database;

import java.sql.Connection;


public interface Database {
    
    public Connection connect();
    public void close(Connection conn);
}
