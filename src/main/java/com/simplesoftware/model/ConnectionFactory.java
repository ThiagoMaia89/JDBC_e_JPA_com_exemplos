/*
package com.simplesoftware.model;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    public static Connection getConnection() {
        Connection connection = null;

        //Carregar arquivo de propriedade para pegar parametros necessarios para se comunicar com o banco de dados
        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("connection.properties")){

            //Definir parametros para se conectar ao banco de dados MySQL
            Properties prop = new Properties();
            prop.load(input);

            String driver = prop.getProperty("jdbc.driver");
            String dataBaseAddress = prop.getProperty("db.address");
            String dataBaseName = prop.getProperty("db.name");
            String user = prop.getProperty("db.user.login");
            String password = prop.getProperty("db.user.password");

            //Construcao da string de conexao
            StringBuilder sb = new StringBuilder("jdbc:")
                    .append(driver).append("://")
                    .append(dataBaseAddress).append("/")
                    .append(dataBaseName);

            String connectionUrl = sb.toString();

            try{
                connection = DriverManager.getConnection(connectionUrl, user, password);
            }
            catch (SQLException e){
                System.out.println("Falha ao tentar criar conexão");
            }
        } catch (IOException e){
            System.out.printf("Falha ao carregar arquivos de propriedades");
            e.printStackTrace();
        }
        return connection;
    }
}*/
