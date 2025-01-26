/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compactador;

/**
 *
 * @author Luiz
 */
public class Padrao implements Comparable<Padrao>{
    private String padrao;
    private int qnt;

    public Padrao(String padrao) {
        this.padrao = padrao;
        this.qnt = 1;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

    public int getQnt() {
        return qnt;
    }

    public void addQtd() {
        this.qnt++;
    }
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    @Override
    public int compareTo(Padrao t) {
        return t.qnt - this.qnt;
    }
}
