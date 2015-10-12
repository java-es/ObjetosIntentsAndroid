package javaes.wordpress.com.modelo;

import java.io.Serializable;

/**
 * Created by javaes.wordpress.com on 12/10/2015.
 */
public class ProdutoSerializable implements Serializable{
    private long id;
    private String codigo;
    private String nome;
    private String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
