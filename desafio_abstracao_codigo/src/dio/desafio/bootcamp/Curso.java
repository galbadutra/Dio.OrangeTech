package dio.desafio.bootcamp;

public class Curso extends Conteudo {
    private int carga_horario;

    public int getCarga_horario() {
        return carga_horario;
    }

    public void setCarga_horario(int carga_horario) {
        this.carga_horario = carga_horario;
    }

    @Override
    public String toString() {
        return  "Mentoria [titulo=" + getTitulo()+"]"+
                "Descricao [data=" + getDescricao()+"]"+
                "Carga Horaria [carga_horaria=" + carga_horario +"]";
    }

    @Override
    public double calcularXP(){
        return XP_padrao * carga_horario;
    }
}