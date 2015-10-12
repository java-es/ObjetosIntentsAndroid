package javaes.wordpress.com.modelo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by javaes.wordpress.com on 12/10/2015.
 */
public class ProdutoParcelable implements Parcelable {
    private long id;
    private String codigo;
    private String nome;
    private String descricao;

    public ProdutoParcelable(){}

    private ProdutoParcelable(Parcel parcel){
        this.id = parcel.readLong();
        this.codigo = parcel.readString();
        this.nome = parcel.readString();
        this.descricao = parcel.readString();
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static final Parcelable.Creator<ProdutoParcelable> CREATOR = new Parcelable.Creator<ProdutoParcelable>(){
        public ProdutoParcelable createFromParcel(Parcel parcel){
            return new ProdutoParcelable(parcel);
        }
        public ProdutoParcelable[] newArray(int size){
            return new ProdutoParcelable[size];
        }
    };

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest,int flags){
        dest.writeLong(this.id);
        dest.writeString(this.codigo);
        dest.writeString(this.nome);
        dest.writeString(this.descricao);
    }
}
