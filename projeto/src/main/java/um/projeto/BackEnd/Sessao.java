/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package um.projeto.BackEnd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sessao {
    public int id;
    public String Data;
    public List<Musico> musicos;
    public List<Instrumento> intrumentos;
    public boolean terminada;

    public Sessao() {
    }

    public Sessao(int id, String Data, List<Musico> musicos, List<Instrumento> intrumentos,boolean terminada) {
        this.id = id;
        this.Data = Data;
        this.musicos = musicos;
        this.intrumentos = intrumentos;
        this.terminada=terminada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public List<Musico> getMusicos() {
        return musicos;
    }

    public void setMusicos(List<Musico> musicos) {
        this.musicos = musicos;
    }

    public List<Instrumento> getIntrumentos() {
        return intrumentos;
    }

    public void setIntrumentos(List<Instrumento> intrumentos) {
        this.intrumentos = intrumentos;
    }
    
    
}
