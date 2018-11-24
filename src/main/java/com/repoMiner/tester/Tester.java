package com.repoMiner.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Tester extends RootDependency {

    public static Integer getMagic() {

        MediatorDependency mediatorDependendcy = new MediatorDependency();
        return mediatorDependendcy.getSquaredMagicNumber();
    }

    public static void main(String[] args) {

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "4069043");

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/repo_miner_store",
                    connectionProps);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connected to database");

    }

}
