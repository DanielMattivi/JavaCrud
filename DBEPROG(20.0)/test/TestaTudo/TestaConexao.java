
package TestaTudo;

import java.sql.*;
import persist.*;


public class TestaConexao {
    
    public static void main(String[] args) {
        Connection con = Conexao.getConexao();
        System.out.println("Conexão = " + con);
    }
    
}

