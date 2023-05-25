/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

/**
 *
 * @author CAMARGO
 */
public class FestaBean {
    
    private int idPessoa;
    private String nome;
    private String sobrenome;
    private int idade;
    private String rg;
    private String cpf;
    private String email;
    private String telefone;
    private Boolean bebida;
    private String tipoIngresso;
    private String valorIngresso;

   
    //GETTERS
    
      public int getIdPessoa() {
        return idPessoa;
    }
        
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Boolean getBebida() {
        return bebida;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public String getValorIngresso() {
        return valorIngresso;
    }

    
    //SETTERS
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setBebida(Boolean bebida) {
        this.bebida = bebida;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public void setValorIngresso(String valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    
    
    
    
    
}
