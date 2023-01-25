/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.VIEW;

import java.sql.*;
import java.util.ArrayList;
import persist.Conexao;

/**
 *
 * @author LeKKi
 */
public class relatorioVendaDAO {

    public static ArrayList emitirRelatorio() {
        Connection con = Conexao.getConexao();

        ArrayList lista = new ArrayList();
        try {
            String sql = "SELECT * FROM relatorioVenda";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                relatorioVendaMODEL rvm = new relatorioVendaMODEL();
                rvm.setModelo(rs.getString("Modelo do Produto"));
                rvm.setNomec(rs.getString("Nome do Cliente"));
                rvm.setNomef(rs.getString("Nome do Vendedor"));
                rvm.setCodVenda(rs.getInt("Codigo da Venda"));
                lista.add(rvm);
            }
            return lista;
        } catch (SQLException sqe) {
            System.out.println(sqe);
        }
        return null;
    }

}
