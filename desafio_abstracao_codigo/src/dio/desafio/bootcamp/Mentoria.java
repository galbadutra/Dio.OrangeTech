package dio.desafio.bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo()+"]"+
            "Descricao [data=" + getDescricao()+"]"+
            "Data [data=" + data + "]";
    }

    @Override
    public double calcularXP(){
        return XP_padrao + 20d;
    }
}
