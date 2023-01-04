
package um.projeto.BackEnd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Album {
    public int id;
    public boolean terminado;
    public String titulo;
    public String estilo;
    public String dataLancamento;
    public List<Musica> musicas;
    public Produtor produtor;

    public Album() {
    }
    
    
    public Album(int id, boolean terminado, String titulo, String estilo, String dataLancamento, List<Musica> musicas,Produtor produtor) {
        this.id = id;
        this.terminado = terminado;
        this.titulo = titulo;
        this.estilo = estilo;
        this.dataLancamento = dataLancamento;
        this.musicas = musicas;
        this.produtor = produtor;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
    
    
    
    
    
    
    
    
}
