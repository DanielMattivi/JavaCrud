package DAO;

import java.util.List;
import java.util.ArrayList;
import model.Cliente;
import java.sql.*;
import persist.*;

public class ClienteDAO implements OperacoesDAO{
    
    private static final Connection con = Conexao.getConexao();

    @Override
    public boolean inserir(Object obj) {
        if (obj instanceof Cliente) {
            Cliente cl = (Cliente) obj;
            String nome = cl.getNome();
            String cpf = cl.getCPF();
            String email = cl.getEmail();
            
            String sql = "INSERT INTO cliente (nome, cpf, email) VALUES (?, ?, ?)";
            try {
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, nome);
                pstmt.setString(2, cpf);
                pstmt.setString(3, email);
                int res = pstmt.executeUpdate();
                if (res == 1) {
                    return true;
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    return false;
    }
    

    @Override
    public boolean excluir(Object obj) {
        if (obj instanceof Integer) {
            int codCliente = (int) obj;
            String sql = "DELETE FROM cliente WHERE codCliente =" + codCliente;
            System.out.println("sql = " + sql);
            try {
                Statement stmt = con.createStatement();
                stmt.executeUpdate(sql);
                return true;
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return false;
    }

    @Override
    public boolean editar(Object obj) {
        if (obj instanceof Cliente) {
            Cliente cl = (Cliente) obj;
            String nome = cl.getNome();
            int codCliente = cl.getCodCliente();
            String email = cl.getEmail();

            try {
                String sql = "UPDATE cliente SET nome=?, email=? WHERE codCliente = ? ";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, nome);
                pstmt.setInt(3, codCliente);
                pstmt.setString(2, email);
                int res = pstmt.executeUpdate(); // retorna a quantidade de registros inseridos
                if (res == 1) {
                    return true;
                }
            } catch (SQLException sqe) {
                sqe.printStackTrace();
            }

        }
        return false;

    }
    

    public Object pesquisar(int obj) {
        
        int codCliente = (int) obj;
        try {
            String sql = "SELECT * FROM CLIENTE WHERE codCliente =" + codCliente;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String cpf = rs.getString("cpf");
                                
                Cliente cl = new Cliente(nome, cpf, email, codCliente);
                return cl;
            }
        } catch (SQLException sqe) {
            System.out.println(sqe);
        }
        return null;
    }
    
    public List pesquisarTudo() {
        ArrayList lista = new ArrayList();
        String sql = "SELECT * FROM cliente";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                int codCliente = rs.getInt("codCliente");
                
                lista.add(new Cliente(nome, cpf, email, codCliente));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return lista;
    }

    @Override
    public Object pesquisar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}