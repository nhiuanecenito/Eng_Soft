package Modelos;
// Generated 29/mai/2023 11:29:42 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int id;
     private String nome;
     private String email;
     private String contacto;
     private String proivincia;
     private String bairro;
     private Set pedidoses = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(int id, String nome, String email, String contacto, String proivincia, String bairro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.contacto = contacto;
        this.proivincia = proivincia;
        this.bairro = bairro;
    }
    public Cliente(int id, String nome, String email, String contacto, String proivincia, String bairro, Set pedidoses) {
       this.id = id;
       this.nome = nome;
       this.email = email;
       this.contacto = contacto;
       this.proivincia = proivincia;
       this.bairro = bairro;
       this.pedidoses = pedidoses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public String getProivincia() {
        return this.proivincia;
    }
    
    public void setProivincia(String proivincia) {
        this.proivincia = proivincia;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public Set getPedidoses() {
        return this.pedidoses;
    }
    
    public void setPedidoses(Set pedidoses) {
        this.pedidoses = pedidoses;
    }




}


