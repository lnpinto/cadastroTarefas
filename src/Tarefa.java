import java.time.LocalDateTime;

public abstract class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataLimite;
    private Enum status;

    public Tarefa(Enum status, LocalDateTime dataLimite, LocalDateTime dataCriacao, String descricao, String titulo) {
        this.status = status;
        this.dataLimite = dataLimite;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
        this.titulo = titulo;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public LocalDateTime getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDateTime dataLimite) {
        this.dataLimite = dataLimite;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
