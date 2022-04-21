package com.allorganize.notafiscal.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class NotaFiscalVO {
    private String uf;
    private LocalDate dataVenda;
    private LocalTime horaVenda;
    private float valorTotalBruto;
    private String tipoNotaFiscal;
    private float valorICMS;
    private float TotalLiquido;
    private int cnpj;
    private String identificadorNotaFiscal;
    private float vendaNotaFiscal;
    private String itemDevolvido;
    private String itemNotaFiscal;
    private int codigoProduto;
    private float valorUnitario;
    private int qtdItem;
    private float valorTotal;


    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }


    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public LocalTime getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(LocalTime horaVenda) {
        this.horaVenda = horaVenda;
    }

    public float getValorTotalBruto() {
        return valorTotalBruto;
    }

    public void setValorTotalBruto(float valorTotalBruto) {
        this.valorTotalBruto = valorTotalBruto;
    }

    public String getTipoNotaFiscal() {
        return tipoNotaFiscal;
    }

    public void setTipoNotaFiscal(String tipoNotaFiscal) {
        this.tipoNotaFiscal = tipoNotaFiscal;
    }

    public float getValorICMS() {
        return valorICMS;
    }

    public void setValorICMS(int valorICMS) {
        this.valorICMS = valorICMS;
    }

    public float getTotalLiquido() {
        return TotalLiquido;
    }

    public void setTotalLiquido(float totalLiquido) {
        TotalLiquido = totalLiquido;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getIdentificadorNotaFiscal() {
        return identificadorNotaFiscal;
    }

    public void setIdentificadorNotaFiscal(String identificadorNotaFiscal) {
        this.identificadorNotaFiscal = identificadorNotaFiscal;
    }

    public float getVendaNotaFiscal() {
        return vendaNotaFiscal;
    }

    public void setVendaNotaFiscal(float vendaNotaFiscal) {
        this.vendaNotaFiscal = vendaNotaFiscal;
    }

    public String getItemDevolvido() {
        return itemDevolvido;
    }

    public void setItemDevolvido(String itemDevolvido) {
        this.itemDevolvido = itemDevolvido;
    }

    public String getItemNotaFiscal() {
        return itemNotaFiscal;
    }

    public void setItemNotaFiscal(String itemNotaFiscal) {
        this.itemNotaFiscal = itemNotaFiscal;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
