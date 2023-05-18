/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
public class Usuario {
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String cep;
    private String email;
    private String telefone;
    private String idade;
    private String sexo;
    
    public String getCpf(){
        return cpf;
    }

public void setCpf(String cpf){
    this.cpf = cpf;
}
public String getCep(){
        return cep;
    }
public void setCep(String cep){
    this.cep = cep;
}
public String getEmail(){
        return email; 
}

public void setEmail(String email){
    this.email = email;
}
public Long getId(){
    return id;
}

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome= nome;
}

public String getSobrenome(){
    return sobrenome;
}
public void setSobrenome(String sobrenome){
    this.sobrenome= sobrenome;
}

public String getTelefone(){
    return telefone;
}
public void setTelefone(String telefone){
    this.telefone = telefone;
}
public String getIdade(){
    return idade;
}
public void setIdade(String idade){
    this.idade = idade;
}
public String getSexo(){
    return sexo;
}
public void setSexo(String sexo){
    this.sexo = sexo;
}


    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
}


