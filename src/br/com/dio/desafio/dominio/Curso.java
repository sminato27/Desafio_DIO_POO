package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
    }

    // Ao concluir um Curso e chamar o método calcularXp, o xP_Padrao será multiplicado com a cargaHoraria.
    @Override
    public double calcularXp() {
        return xP_Padrao * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso= " +
                "titulo: " + getTitulo() +
                ", descricao: " + getDescricao() +
                ", cargaHoraria: " + cargaHoraria;
    }


}
