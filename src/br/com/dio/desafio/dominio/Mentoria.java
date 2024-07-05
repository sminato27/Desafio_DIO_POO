package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
    }

    // Quando criar uma Mentoria e chamar o método calcularXp, o xP_Padrao será incrementado em +20.
    @Override
    public double calcularXp() {
        return xP_Padrao + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria= " +
                "titulo: " + getTitulo() +
                ", descricao: " + getDescricao() +
                ", data: " + data;
    }
}
