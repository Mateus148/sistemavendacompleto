/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import java.util.Date;
/**
 *
 * @author Mateus Moura
 */

public class Cliente {

    //Definindo os atributos do meu objeto cliente
    private int codigo;
    private String nome;
    private String cpf;
    private Date dataNascimento;

    //Construtor (iniciar o valor dos atributos)
    public Cliente(){
        this.codigo = 0;
        this.nome = "";
        this.cpf = "";
        this.dataNascimento = new Date();
    }

    //Construtor (obrigação de passar o codigo para trabalhar com o objeto)
    public Cliente(int codigo){
        this.codigo = 0;
        this.nome = "";
        this.cpf = "";
        this.dataNascimento = new Date();
    }
    
    // getters & setters

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Cliente){
            Cliente c = (Cliente) o;
            if(c.getCodigo() == this.getCodigo()){
                return true;
            }
        }
        return false;
    }
    
}
