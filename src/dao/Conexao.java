package dao;
import java.sql.*;
/**
 *
 * @author Mateus Moura
 */

public class Conexao {
    
    //Variaveis com dados para conexao com o banco MySQL
    private final String SERVIDOR = "LOCALHOST";
    
    private final String PORTA = "3306";
    
    private final String BANCO_DE_DADOS = "bdsistemavendacompleto";
    
    private final String USUARIO = "root";
    
    private final String SENHA = "";
    
    //jdbc: Driver do windows para conexão com MySQL
    private final String URL = "jdbc:mysql://" + SERVIDOR + ":" + PORTA + "/" + BANCO_DE_DADOS;
    
    
    //Instancia da classe conexao
    private Connection conexao;
    
    public Conexao() throws ClassNotFoundException, SQLException{
        
        try{
            //nova instancia do driver jdbc
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            //iniciando o driver passando os parametros de URL, USUARIO e SENHA
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            
            //Desabilitando o auto envio de informação para banco
            conexao.setAutoCommit(false);
            
            //Erro de driver                       
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            
            throw new ClassNotFoundException("O driver de conexão não foi adicionado ao projeto.\n" + e.getMessage());
            
            //Erro de MySQL - Por exemplo, erro no query 
        } catch (SQLException e) {
            
            throw new SQLException("Problemas nos parâmetros de conexão.\n" + e.getMessage());
        }
    }
    
    //Retorna estado atual da conexão
    public Connection getConexao(){
        
        return conexao;
        
    }
    
    //Confirmar o envio de informação para o banco
    public void confirmar() throws SQLException{
        
        try {
            conexao.commit();
            //Erro de sintex SQL
        } catch (SQLException e) {
            
            throw new SQLException("Problema na instrução SQL.\n" + e.getMessage());
            
            //Encerrar a conexão
        } finally {
            
            conexao.close();
        }
        
    }
    
}
            
       
