/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import poo.Cliente;

//Implementando Interface IDAO do TIPO Cliente

public class ClienteDAO {
    
    //@Override: Sobrescrever o método PAI(Interface)
    @Override
    public void inserir(Cliente cliente) throws Exception{
        //instancia da classe conexao
        Conexao c = new Conexao();
        //Define a query que será enviada para o banco de dados
        String sql="INSERT INTO TBCLIENTE (NOME, CPF, DATANASCIMENTO) VALUES (?, ?, ?)";
        //Preparando o comando a ser enviado ao banco passando como parametro a query e a instância da classe conexao
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        //Definindo parametro 1 da query sql (?)
        ps.setString(1, cliente.getNome());
        //Definindo parametro 2 da query sql (?)
        ps.setString(2, cliente.getCpf());
        //Definindo parametro 3 da query sql (?)
        ps.setDate(3, new Date(cliente.getDataNascimento().getTime()));
        //Executando o comando no banco de dados
        ps.execute();
        //Confirmação da classe conexao (Verificando se tudo funcionou na execução da query
        c.confirmar();        
    }
    
    @Override
    public void alterar(Cliente cliente) throws Exception{
        Conexao c = new Conexao();
        String sql="UPDATE TBCLIENTE SET NOME=?, CPF=?, DATANASCIMENTO=? WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, cliente.getNome());        
        ps.setString(2, cliente.getCpf());        
        ps.setDate(3, new Date(cliente.getDataNascimento().getTime()));
        ps.setInt(4, cliente.getCodigo());
        ps.execute();
        c.confirmar();
    }
    
    @Override
    public void excluir(Cliente cliente) throws Exception{
        Conexao c = new Conexao();
        String sql = "DELETE FROM TBCLIENTE WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, cliente.getCodigo());
        ps.execute();
        c.confirmar();
    }
    
    @Override
    public ArrayList<Cliente> listarTodos() throws Exception{
        Conexao c = new Conexao();
        String sql = "SELECT * FROM TBCLIENTE ORDER BY NOME";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        ArrayList listarClientes = new ArrayList();
        while(rs.next()){
            Cliente cliente = new Cliente();
            cliente.setCodigo(rs.getInt("CODIGO"));
            cliente.setNome(rs.getString("NOME"));
            cliente.setCpf(rs.getString("CPF"));
            cliente.setDataNascimento(rs.getDate("DATANASCIMENTO"));
            listarClientes.add(cliente);
        }
        return listarClientes;
    }
    
    @Override
    public Cliente recuperar(int codigo) throws Exception{
        Conexao c = new Conexao();
        String sql = "SELECT * FROM TBCLIENTE WHERE CODIGO=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        
        Cliente cliente = new Cliente();
        if(rs.next()){
            cliente.setCodigo(rs.getInt("CODIGO"));
            cliente.setNome(rs.getString("NOME"));
            cliente.setCpf(rs.getString("CPF"));
            cliente.setDataNascimento(rs.getDate("DATANASCIMENTO"));
        }
        return cliente;
    }
        
}
