package compactador;

import java.awt.Component;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import static java.time.Instant.now;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.jar.Pack200.Packer.PASS;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Luiz
 */
public class Main extends javax.swing.JFrame {
    
    private Component center;
    private File arqTxt;
    private File arqDic;
    private File arqComp;

    /**
     * Creates new form Main
     */
    public Main() {
        try {
            initComponents();
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jbCompactar = new javax.swing.JButton();
        jbDescompactar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaArqTxt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaDic = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlNomeArq = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbCompactar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compactador/imagens/compactar.png"))); // NOI18N
        jbCompactar.setEnabled(false);
        jbCompactar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCompactarActionPerformed(evt);
            }
        });

        jbDescompactar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compactador/imagens/descompactar.png"))); // NOI18N
        jbDescompactar.setEnabled(false);
        jbDescompactar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDescompactarActionPerformed(evt);
            }
        });

        jtaArqTxt.setColumns(20);
        jtaArqTxt.setRows(5);
        jScrollPane1.setViewportView(jtaArqTxt);

        jtaDic.setEditable(false);
        jtaDic.setColumns(20);
        jtaDic.setRows(5);
        jScrollPane2.setViewportView(jtaDic);

        jLabel1.setFont(new java.awt.Font("Vijaya", 0, 18)); // NOI18N
        jLabel1.setText("Dicionário do arquívo:");

        jLabel3.setFont(new java.awt.Font("Vijaya", 0, 18)); // NOI18N
        jLabel3.setText("Arquivo selecionado:");

        jlNomeArq.setText("Nenhum arquivo selecionado");

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Descompactar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Compactar este arquivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Abrir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jbCompactar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbDescompactar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jlNomeArq)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbCompactar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbDescompactar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jlNomeArq)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JFileChooser chooser = new javax.swing.JFileChooser();
        chooser.showOpenDialog(center);
        
        File file = chooser.getSelectedFile();
        
        if (file.toString().substring(file.toString().length() - 4,
                file.toString().length()).equals(".txt")) {// se o arquivo for .txt
            this.jbCompactar.setEnabled(true);
            this.jbDescompactar.setEnabled(false);
            this.jlNomeArq.setText(file.getName());
            this.arqTxt = file;
            this.jtaArqTxt.setText(this.lerArq(file, "\n"));
        } else if (file.toString().substring(file.toString().length() - 5, file.toString().length()).equals(".comp")) {
            // se o arquivo for .comp
            //ligo os botoes
            this.jbCompactar.setEnabled(false);
            this.jbDescompactar.setEnabled(true);

            //Muda o Label
            this.jlNomeArq.setText(file.getName());

            //Atribui valor aos atributos
            this.arqComp = file;
            this.arqDic = new File(file.getPath().replaceAll(".comp", ".dic"));
            System.out.println(arqDic);
            //Exibe os valores nos txt area 
            this.jtaArqTxt.setText(lerArq(file, ""));
            jtaDic.setText(this.setFormatDic(this.lerArq(this.arqDic, "\n")));
            
        } else if (file.toString().substring(file.toString().length() - 4, file.toString().length()).equals(".dic")) {
            //Se o arquivo for .dic
            //Ligo os botoes
            this.jbCompactar.setEnabled(false);
            this.jbDescompactar.setEnabled(true);

            //Muda o Label
            this.jlNomeArq.setText(file.getName());

            //Atribui valor aos atributos
            this.arqDic = file;
            this.arqComp = new File(file.getPath().replaceAll(".dic", ".comp"));

            //Exibe os valores nos txt area 
            this.jtaArqTxt.setText(lerArq(this.arqComp, ""));
            this.jtaDic.setText(this.setFormatDic(this.lerArq(this.arqDic, "\n")));
        } else {
            JOptionPane.showMessageDialog(center, "O arquivo " + file.getName() + " não é um arquivo TXT ou um arquivo compactado, por favor selecione um arquivo correto!", "Arquivo selecionado incorreto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jbCompactarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCompactarActionPerformed
        //Cria os arquivos de dicionário e comp no diretório que o usuário queira.
        FileWriter fw = null;
        FileWriter fwDic = null;
        String nomeAntigo = this.arqTxt.getName();
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showSaveDialog(center);
            this.arqComp = new File(chooser.getSelectedFile().toString() + ".comp");
            fw = new FileWriter(this.arqComp);
            this.arqDic = new File(chooser.getSelectedFile().toString() + ".dic");
            fwDic = new FileWriter(this.arqDic);

            //coloca em um arraylist todos os padroes do texto que o usuário escolheu (em ordem por quantidade que se repete)
            String texto = lerArq(arqTxt, "\n");
            int tamanhoTextoAntigo = texto.length();
            ArrayList<Padrao> padroes = new ArrayList<>();
            padroes.add(new Padrao(texto.substring(0, 2)));
            for (int i = 1; i < texto.length() - 1; i++) {
                String padrao = texto.substring(i, i + 2);
                int index = this.temEssePadrao(padrao, padroes);
                if (index == C.NAO_TEM_PADRAO) {
                    padroes.add(new Padrao(padrao));
                } else {
                    padroes.get(index).addQtd();
                }
            }
            Collections.sort(padroes);

            //verifica se tem  tamanho suficiente pra fazer 10 trocas
            int tam;
            if (padroes.size() > 10) {
                tam = 10;
            } else {
                tam = padroes.size();
            }

            //compactando o texto na variavel texto e coloco o dicionário na variavel dicionáriop
            int caracterASCII = 213;
            String dicionario = "";
            for (int i = 0; i < tam; i++) {
                String padraoASerTrocado = padroes.get(i).getPadrao();
                String padraoParaColocarNoLugar = new Character((char) (caracterASCII + i)).toString();
                texto = texto.replaceAll(padraoASerTrocado, padraoParaColocarNoLugar);
                dicionario += padraoASerTrocado + padraoParaColocarNoLugar;
            }

            //pergunta se deseja mesmo fazer a alteração
            int showConfirmDialog = JOptionPane.showConfirmDialog(center, "A compactação dará certo e haverá um ganho de " + (tamanhoTextoAntigo - (dicionario.length() + texto.length())) + "letras, tem certeza que deseja prosseguir?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
            if (showConfirmDialog == JOptionPane.YES_OPTION) {//se for sim

                //bd
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/EMP", "root", "root");
                Statement stmt = conn.createStatement();
                stmt.execute("INSERT INTO compactado (nome, data)  VALUES ("+nomeAntigo+", "+ now() + ");");
                stmt.cancel();
                conn.close();
                
                //preparamento pós compactação
                this.jbCompactar.setEnabled(false);
                this.jbDescompactar.setEnabled(true);
                this.jlNomeArq.setText(this.jlNomeArq.getText().replaceAll(".comp", ".dic"));
                
                texto = texto.replace("\n", new Character((char) (210)).toString());
                jtaArqTxt.setText(texto);
                jtaDic.append(this.setFormatDic(dicionario));

                //salvando arquivos
                try {
                    
                    fw.write(texto);
                    fwDic.write(dicionario);
                } catch (IOException ex) {
                    System.err.println("Não conseguiu escrever nos arquivos");
                } finally {
                    try {
                        fw.close();
                        fwDic.close();
                    } catch (IOException ex) {
                        System.err.println("Não conseguiu fechar os writers'");
                    }
                }
            } else {
                this.jtaArqTxt.setText(this.lerArq(arqTxt, ""));
                this.jtaDic.setText("");
            }
            
        } catch (HeadlessException | IOException | NullPointerException e) {
            JOptionPane.showMessageDialog(center, "Por favor selecione um diretorio e escolha um nome para o arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            System.out.println("erro ao conectar");
        }

    }//GEN-LAST:event_jbCompactarActionPerformed

    private void jbDescompactarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDescompactarActionPerformed
        //pegando o valor do texto codificado e do dicionário
        String dicionario = this.lerArq(arqDic, "");
        String texto = this.jtaArqTxt.getText();

        //descompactando
        for (int i = 0; i < dicionario.length() - 1; i += 3) {
            texto = texto.replace(dicionario.substring(i + 2, i + 3), dicionario.substring(i, i + 2));
        }
        texto = texto.replaceAll(new Character((char) (210)).toString(), "\n");

        //salvando 
        FileWriter fw = null;
        JFileChooser chooser = new JFileChooser();
        try {
            chooser.showSaveDialog(center);
            this.arqTxt = new File(chooser.getSelectedFile().toString() + ".txt");
            fw = new FileWriter(this.arqTxt);
            fw.write(texto);
        } catch (HeadlessException | IOException e) {
            System.err.println("erro: " + e.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        //preparamento pós compactação
        this.jtaArqTxt.setText(texto);
        this.jtaDic.setText("");
        this.jlNomeArq.setText(chooser.getName());
        this.jbCompactar.setEnabled(true);
        this.jbDescompactar.setEnabled(false);
    }//GEN-LAST:event_jbDescompactarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (jbDescompactar.isEnabled()) {
            jbDescompactarActionPerformed(evt);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (jbCompactar.isEnabled()) {
            jbCompactarActionPerformed(evt);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /*
     public String replaceLast(String str, String oldValue, String newValue) {
     str = StringUtils.reverse(str);
     str = str.replaceFirst(StringUtils.reverse(oldValue), StringUtils.reverse(newValue));
     str = StringUtils.reverse(str);
     return str;
     }*/
    /**
     * Lê um arraylist verificando se esse arraylist tem o padrão passado por
     * parametro
     *
     * @param padrao a ser verificado
     * @param arraylist a ser lido
     * @return se tiver parametro retorna o index dele, se não retorna -1
     *
     */
    private int temEssePadrao(String padrao, ArrayList<Padrao> arrayList) {
        for (int indexDoPadrao = 0; indexDoPadrao < arrayList.size(); indexDoPadrao++) {
            if (arrayList.get(indexDoPadrao).getPadrao().equals(padrao)) {
                return indexDoPadrao;
            }
        }
        return C.NAO_TEM_PADRAO;
    }

    /**
     * transforma um arquivo em uma string
     *
     * @param separador no final de cada linha incrementa o que passar
     * @param arquivo à ser lido
     * @return arquivo em string
     */
    private String lerArq(File arquivo, String separador) {
        BufferedReader br = null;
        String retorno = "";
        try {
            br = new BufferedReader(new FileReader(arquivo));
            String aux;
            while ((aux = br.readLine()) != null) {
                retorno += aux + separador;
            }
            System.out.println(br.toString());
        } catch (FileNotFoundException ex) {
            retorno = "File not found.";
        } catch (IOException ex) {
            retorno = ex.getMessage();
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                retorno = ex.getMessage();
            }
        }
        return retorno;
    }

    /**
     * Formata um dicionário para a possível compreensão do usuário
     *
     * @param valores do dicionário sem formatação
     * @return valor formatado
     */
    private String setFormatDic(String valores) {
        String retorno = "";
        for (int i = 0; i < valores.length() - 1; i += 3) {
            retorno += valores.substring(i, i + 2) + "_-_" + valores.substring(i + 2, i + 3) + "\n";
        }
        return retorno;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new Main().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbCompactar;
    private javax.swing.JButton jbDescompactar;
    private javax.swing.JLabel jlNomeArq;
    private javax.swing.JTextArea jtaArqTxt;
    private javax.swing.JTextArea jtaDic;
    // End of variables declaration//GEN-END:variables
}
