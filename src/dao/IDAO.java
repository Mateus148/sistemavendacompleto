
package dao;
import java.util.ArrayList;

//Interface: define as regras ou padrão de classe.

//<Tipo>: Define o objeto que a classe que está implementando a 
//interface deve utilizar
public interface IDAO<Tipo> {
    
    //Método: Deve ser implementado na classe que implementa esta interface
    //throws Exception: Setar este método como inico código
    public void inserir(Tipo objeto) throws Exception;
    
    public void alterar(Tipo objeto) throws Exception;
    
    public void excluir(Tipo objeto) throws Exception;
    
    public ArrayList<Tipo> listarTodos() throws Exception;
    
    public Tipo recuperar(int codigo) throws Exception;
    
}
