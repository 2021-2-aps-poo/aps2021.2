package br.ufpb.dcx.aps.aulas.bancocontatransacao;

import java.math.BigDecimal;
import java.util.Calendar;

public class Transacao {

    private int id;
    private Calendar data;
    private BigDecimal valor;

    public Transacao(int id, double valor){
        this(id,new BigDecimal(valor));
    }

    public Transacao(int id, BigDecimal valor){
        this.valor = valor;
        this.id = id;
    }

    public BigDecimal getValor(){
        return this.valor;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "id=" + id +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }
}
