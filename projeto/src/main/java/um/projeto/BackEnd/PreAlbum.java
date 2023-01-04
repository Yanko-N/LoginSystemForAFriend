/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package um.projeto.BackEnd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreAlbum {
    public int id;
    public List<Sessao> sessoesFalta;
    public Album album;

    public PreAlbum() {
    }

    public PreAlbum(int id, List<Sessao> sessoesFalta, Album album) {
        this.id = id;
        this.sessoesFalta = sessoesFalta;
        this.album = album;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Sessao> getSessoesFalta() {
        return sessoesFalta;
    }

    public void setSessoesFalta(List<Sessao> sessoesFalta) {
        this.sessoesFalta = sessoesFalta;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
    
    
}
