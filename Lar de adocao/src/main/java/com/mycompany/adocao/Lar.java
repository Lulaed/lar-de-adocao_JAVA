package com.mycompany.adocao;


import com.mongodb.DBCursor;
import com.mongodb.MongoWriteException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;

public final class Lar extends javax.swing.JFrame {
    private Connection conexao;
    private MongoCollection colecao;
    
   
    
    
    /**
     * Creates new form Livros
     */
    public Lar() {
        initComponents();
        this.conexao = new Connection();        
        //this.colecao = conexao.getBanco().getCollection("Animais");
      
        
        

// adicionar o JScrollPane ao painel existente
      
        
        
    }
    
   
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1Addbook = new javax.swing.JLabel();
        jLabel1Titulo = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabelAutor = new javax.swing.JLabel();
        jtitulo = new javax.swing.JTextField();
        jLabelgGenero = new javax.swing.JLabel();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldGenero = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEXTO2 = new javax.swing.JTextArea();
        btnShow = new javax.swing.JButton();
        jLabel1Addbook2 = new javax.swing.JLabel();
        jLabel1Titulo1 = new javax.swing.JLabel();
        excluir = new javax.swing.JTextField();
        jLabel1Addbook3 = new javax.swing.JLabel();
        jLabel1Titulo2 = new javax.swing.JLabel();
        jLabel1Addbook4 = new javax.swing.JLabel();
        Alterar = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jLabel1Titulo3 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        btnShow1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1Addbook.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1Addbook.setText("Lista de Lares cadastrados");

        jLabel1Titulo.setFont(new java.awt.Font("Vrinda", 0, 17)); // NOI18N
        jLabel1Titulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1Titulo.setText("Nome do tutor:");

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Encerrar seção");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabelAutor.setFont(new java.awt.Font("Vrinda", 0, 17)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(102, 102, 102));
        jLabelAutor.setText("CPF:");

        jtitulo.setBackground(new java.awt.Color(204, 204, 204));
        jtitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtituloActionPerformed(evt);
            }
        });

        jLabelgGenero.setFont(new java.awt.Font("Vrinda", 0, 17)); // NOI18N
        jLabelgGenero.setForeground(new java.awt.Color(102, 102, 102));
        jLabelgGenero.setText("Endereço:");

        jTextFieldAutor.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAutorActionPerformed(evt);
            }
        });

        jTextFieldGenero.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Adicionar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TEXTO2.setColumns(20);
        TEXTO2.setRows(5);
        jScrollPane1.setViewportView(TEXTO2);

        btnShow.setBackground(new java.awt.Color(0, 153, 153));
        btnShow.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("Mostrar");
        btnShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        jLabel1Addbook2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1Addbook2.setText("Adicionar Lar");

        jLabel1Titulo1.setFont(new java.awt.Font("Vrinda", 0, 17)); // NOI18N
        jLabel1Titulo1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1Titulo1.setText("ID");

        excluir.setBackground(new java.awt.Color(204, 204, 204));
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        jLabel1Addbook3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1Addbook3.setText("Excluir Lar");

        jLabel1Titulo2.setFont(new java.awt.Font("Vrinda", 0, 17)); // NOI18N
        jLabel1Titulo2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1Titulo2.setText("ID");

        jLabel1Addbook4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1Addbook4.setText("Alterar Lar");

        Alterar.setBackground(new java.awt.Color(204, 204, 204));
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(0, 153, 153));
        btnAlterar.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jLabel1Titulo3.setFont(new java.awt.Font("Vrinda", 0, 17)); // NOI18N
        jLabel1Titulo3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1Titulo3.setText("Novo nome");

        nome.setBackground(new java.awt.Color(204, 204, 204));
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        btnShow1.setBackground(new java.awt.Color(0, 153, 153));
        btnShow1.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        btnShow1.setForeground(new java.awt.Color(255, 255, 255));
        btnShow1.setText("Gerenciar Animais");
        btnShow1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShow1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldGenero, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1Titulo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAutor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1Addbook2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(75, 75, 75))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1Addbook3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1Titulo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnExcluir)
                            .addComponent(jLabel1Addbook4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1Titulo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelgGenero)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1Addbook)
                        .addGap(34, 34, 34)
                        .addComponent(btnShow1)))
                .addGap(463, 463, 463))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addGap(322, 322, 322)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1Titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1Addbook2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1Addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnShow1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelgGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShow)))
                .addGap(35, 35, 35)
                .addComponent(jLabel1Addbook3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(60, 60, 60)
                .addComponent(jLabel1Addbook4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1Titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(jButton4))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        
    private void jtituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtituloActionPerformed
                 
    }//GEN-LAST:event_jtituloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        colecao = conexao.getBanco().getCollection("Lares");
         Document a1 = new Document();

        a1
            .append("Nome", jtitulo.getText())
            .append("CPF", jTextFieldAutor.getText())
            .append("Endereço", jTextFieldGenero.getText());
                  

        try {
            colecao.insertOne(a1);
            
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!!");
        } catch (MongoWriteException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        conexao=new Connection(); 
        colecao= conexao.getBanco().getCollection("Lares");
         MongoCursor cursor = colecao.find().iterator();
         try {
             TEXTO2.append("---------Lista de Lares--------\n\n");
            while (cursor.hasNext()) {
                Document livro = (Document)cursor.next();
               //TEXTO.append(livro.toString() + "\n\n");
               //TEXTO.append("--------- --------");
        TEXTO2.append("ID:" + livro.get("_id").toString() + "\n");
        TEXTO2.append("Nome:" + livro.get("Nome").toString() + "\n");
        TEXTO2.append("CPF:" + livro.get("CPF").toString() + "\n");
        TEXTO2.append("Endereço:" +livro.get("Endereço").toString() + "\n");
        TEXTO2.append("----------------- \n");
       // TEXTO.append(livro.get("endereco").toString() + "\n");
        
            }

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            cursor.close();
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        conexao = new Connection();
        colecao= conexao.getBanco().getCollection("Lares");  
       String id = excluir.getText();
      // Document filtro = new Document("_id",id);
      
       colecao.deleteOne(Filters.eq("_id", new ObjectId(id)));
       JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!!");
    
       
       
        
       
               
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        conexao = new Connection();
        colecao= conexao.getBanco().getCollection("Lares");  
        String id = Alterar.getText();
        String name =nome.getText();
      
        Document animal = (Document) colecao.find(Filters.eq("_id", new ObjectId(id))).first();
        if(animal == null){
        JOptionPane.showMessageDialog(null, "ID não encontrado");
        } else {
            colecao.updateOne(animal,
            new Document("$set", new Document("Nome",name)));
            JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso!!");
        }
            
            
            
       
            
        
                        
                       
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void jTextFieldAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAutorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     Login telaLogin = new Login();
     telaLogin.setVisible (true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnShow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShow1ActionPerformed
        Adotar telaAdotar = new Adotar();
        telaAdotar.setVisible (true);
    }//GEN-LAST:event_btnShow1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lar().setVisible(true);
            }
        });
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alterar;
    private javax.swing.JTextArea TEXTO2;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnShow1;
    private javax.swing.JTextField excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1Addbook;
    private javax.swing.JLabel jLabel1Addbook2;
    private javax.swing.JLabel jLabel1Addbook3;
    private javax.swing.JLabel jLabel1Addbook4;
    private javax.swing.JLabel jLabel1Titulo;
    private javax.swing.JLabel jLabel1Titulo1;
    private javax.swing.JLabel jLabel1Titulo2;
    private javax.swing.JLabel jLabel1Titulo3;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelgGenero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jtitulo;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables

    }


