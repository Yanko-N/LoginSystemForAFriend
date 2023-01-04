/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package um.projeto.BackEnd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Produtor extends Utilizador {
    public List<Sessao> sessoes;

    public Produtor() {
    }

    public Produtor(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
    
}
