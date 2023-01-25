/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestaTudo;

import java.sql.*;
import persist.*;

/**
 *
 * @author 08050440
 */
public class TestaConexao {
    
    public static void main(String[] args) {
        Connection con = Conexao.getConexao();
        System.out.println("Conexão = " + con);
    }
    
}

