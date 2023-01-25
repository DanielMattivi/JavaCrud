package persist;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * 08050440
 */ 
public class Conexao {

    public static Connection getConexao(){

        Connection conexao = null;
        try {
            Class.forName("org.postgresql.Driver");
            String username = "postgres";
            String password = "postgres";
            String url = "jdbc:postgresql://localhost:5432/loja";
            conexao = DriverManager.getConnection(url, username, password);
                    System.out.println("-------------- CONEXÃO CRIADA ! -------------------");
            
        } catch (ClassNotFoundException e) {
           System.out.println("Driver não encontrado!" + e);
        } catch (SQLException e2) {
            System.out.println("Não foi possível conectar ao BD");
        }

        
        return conexao;

    }
}
