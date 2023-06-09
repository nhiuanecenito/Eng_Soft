package Modelos;
// Generated 29/mai/2023 11:29:42 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Produtos generated by hbm2java
 */
public class Produtos  implements java.io.Serializable {


     private int id;
     private String nome;
     private String descriccao;
     private String marca;
     private String modelo;
     private String categoria;
     private int preco;
     private Set pedidoses = new HashSet(0);

    public Produtos() {
    }

	
    public Produtos(int id, String nome, String descriccao, String marca, String modelo, String categoria, int preco) {
        this.id = id;
        this.nome = nome;
        this.descriccao = descriccao;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.preco = preco;
    }
    public Produtos(int id, String nome, String descriccao, String marca, String modelo, String categoria, int preco, Set pedidoses) {
       this.id = id;
       this.nome = nome;
       this.descriccao = descriccao;
       this.marca = marca;
       this.modelo = modelo;
       this.categoria = categoria;
       this.preco = preco;
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
    public String getDescriccao() {
        return this.descriccao;
    }
    
    public void setDescriccao(String descriccao) {
        this.descriccao = descriccao;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getPreco() {
        return this.preco;
    }
    
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public Set getPedidoses() {
        return this.pedidoses;
    }
    
    public void setPedidoses(Set pedidoses) {
        this.pedidoses = pedidoses;
    }




}


