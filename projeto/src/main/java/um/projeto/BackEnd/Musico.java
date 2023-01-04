/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package um.projeto.BackEnd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Musico extends Utilizador {
    
    List<Album> albuns;
    List<Sessao> sessoes;
    List<Instrumento> instrumento;
    String dataNascimento;
    String morada;
    String cc;

    public Musico() {
    }

    public Musico(String nome,String password,List<Album> albuns, List<Sessao> sessoes, List<Instrumento> instrumento, String dataNascimento, String morada, String cc, int id, String Name, String Password) {
        
        this.name=nome;
        this.password=password;
        this.albuns = albuns;
        this.sessoes = sessoes;
        this.instrumento = instrumento;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.cc = cc;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = albuns;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public List<Instrumento> getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(List<Instrumento> instrumento) {
        this.instrumento = instrumento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
    
    
    
}
