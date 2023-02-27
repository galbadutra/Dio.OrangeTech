package dio.desafio.bootcamp;


public abstract class Conteudo  {
        String  titulo;
        String descricao;
        public static final double XP_padrao = 10d;

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public abstract double calcularXP();
}
