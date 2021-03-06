/*
Isaac Collier
March 03. 2020
This program uses If statements and scores to keep track of a value after several operations and display the result to the user.
 */
import java.util.Scanner;
/**
 *
 * @author iscol4541
 * This class is teaching me about scores to use as points or values the program can change and keep track of.
 */
public class frmMultipleChoiceQuiz extends javax.swing.JFrame {

    /**
     * Creates new form frmMultipleChoiceQuiz
     */
    public frmMultipleChoiceQuiz() {
        initComponents();
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
        lblHeader = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblquestion1 = new javax.swing.JLabel();
        lblaQuestion1 = new javax.swing.JLabel();
        lblbQuestion1 = new javax.swing.JLabel();
        lblcQuestion1 = new javax.swing.JLabel();
        lbldQuestion1 = new javax.swing.JLabel();
        txtAns1 = new javax.swing.JTextField();
        lblInst1 = new javax.swing.JLabel();
        lblquestion2 = new javax.swing.JLabel();
        lblaQuestion2 = new javax.swing.JLabel();
        lblbQuestion2 = new javax.swing.JLabel();
        lblcQuestion2 = new javax.swing.JLabel();
        lbldQuestion2 = new javax.swing.JLabel();
        lblInst2 = new javax.swing.JLabel();
        txtAns2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lblquestion3 = new javax.swing.JLabel();
        lblaQuestion3 = new javax.swing.JLabel();
        lblbQuestion3 = new javax.swing.JLabel();
        lblcQuestion3 = new javax.swing.JLabel();
        lbldQuestion3 = new javax.swing.JLabel();
        txtAns3 = new javax.swing.JTextField();
        lblInst3 = new javax.swing.JLabel();
        lblquestion4 = new javax.swing.JLabel();
        lblaQuestion4 = new javax.swing.JLabel();
        lblbQuestion4 = new javax.swing.JLabel();
        lblcQuestion4 = new javax.swing.JLabel();
        lbldQuestion4 = new javax.swing.JLabel();
        txtAns4 = new javax.swing.JTextField();
        lblInst4 = new javax.swing.JLabel();
        lblquestion5 = new javax.swing.JLabel();
        lblaQuestion5 = new javax.swing.JLabel();
        lblbQuestion5 = new javax.swing.JLabel();
        lblcQuestion5 = new javax.swing.JLabel();
        lbldQuestion5 = new javax.swing.JLabel();
        lblInst5 = new javax.swing.JLabel();
        txtAns5 = new javax.swing.JTextField();
        lblresults = new javax.swing.JLabel();
        btnfinished = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        lblHeader.setText("Computer Programming Quiz");

        lblquestion1.setText("What is a compiler?");

        lblaQuestion1.setText("A) Machine language code");

        lblbQuestion1.setText("B)A scanner that translates code all at once");

        lblcQuestion1.setText("C) A scanner that translates code line by line");

        lbldQuestion1.setText("D) A variable type in java");

        lblInst1.setText("Answer here:");

        lblquestion2.setText("What does this do in computer programming: *");

        lblaQuestion2.setText("A)Multiply");

        lblbQuestion2.setText("B)Round");

        lblcQuestion2.setText("C)Or symbol in If statement");

        lbldQuestion2.setText("D)Displays a random number to user");

        lblInst2.setText("Answer here:");

        lblquestion3.setText("What does \"double\" do?");

        lblaQuestion3.setText("A)Declare a value that is a whole number");

        lblbQuestion3.setText("B)Declares multiple letters or numbers");

        lblcQuestion3.setText("C)Declares a decimal number");

        lbldQuestion3.setText("D)Declares a true or false statement");

        txtAns3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAns3ActionPerformed(evt);
            }
        });

        lblInst3.setText("Answer here:");

        lblquestion4.setText("What does GUI stand for?");

        lblaQuestion4.setText("A)Graphics User Input");

        lblbQuestion4.setText("B)Graphic User Interface");

        lblcQuestion4.setText("C)Given-Unknown Information");

        lbldQuestion4.setText("D)Game Under Improvement");

        txtAns4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAns4ActionPerformed(evt);
            }
        });

        lblInst4.setText("Answer here:");

        lblquestion5.setText("What is the correct symbol for \"does not equal\"?");

        lblaQuestion5.setText("A)>=");

        lblbQuestion5.setText("B)<=");

        lblcQuestion5.setText("C)==");

        lbldQuestion5.setText("D)!=");

        lblInst5.setText("Answer here:");

        txtAns5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAns5ActionPerformed(evt);
            }
        });

        btnfinished.setText("Finished!");
        btnfinished.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinishedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblaQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblquestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblaQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(lblresults, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInst3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblquestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblbQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtAns3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblaQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblbQuestion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblcQuestion1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                            .addComponent(lbldQuestion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblInst1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblbQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbldQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblInst2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAns2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblquestion5)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblcQuestion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblbQuestion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblaQuestion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbldQuestion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtAns4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblaQuestion5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblbQuestion5)
                                            .addComponent(lblcQuestion5)
                                            .addComponent(lbldQuestion5)
                                            .addComponent(lblInst5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAns5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnfinished)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblquestion4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblInst4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblquestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(132, 132, 132)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblcQuestion2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblcQuestion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(85, 85, 85)))
                            .addComponent(lbldQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblquestion4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHeader)
                        .addGap(29, 29, 29)
                        .addComponent(lblquestion1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaQuestion1)
                    .addComponent(lblaQuestion4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbQuestion1)
                    .addComponent(lblbQuestion4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcQuestion1)
                    .addComponent(lblcQuestion4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldQuestion1)
                    .addComponent(lbldQuestion4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInst1)
                    .addComponent(lblInst4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAns1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAns4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblquestion2)
                    .addComponent(lblquestion5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaQuestion2)
                    .addComponent(lblaQuestion5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbQuestion5)
                    .addComponent(lblbQuestion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcQuestion5)
                    .addComponent(lblcQuestion2))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldQuestion5)
                    .addComponent(lbldQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInst5)
                    .addComponent(lblInst2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAns5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAns2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblquestion3)
                    .addComponent(btnfinished))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblaQuestion3)
                    .addComponent(lblresults))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblbQuestion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcQuestion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldQuestion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInst3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAns3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jLabel15)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAns3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAns3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAns3ActionPerformed

    private void txtAns4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAns4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAns4ActionPerformed

    private void txtAns5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAns5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAns5ActionPerformed

    private void btnfinishedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinishedActionPerformed
   
        Scanner keyedInput = new Scanner (System.in);
     
        
//variables are declared here:
    int score = 0;    
    int pointValue = 1;
   String question1, question2, question3, question4,question5;    
   
   
   //Gets values for answers to questions from user:
    question1 = (txtAns1.getText());     
   question2 = (txtAns2.getText());     
   question3 = (txtAns3.getText());
   question4 = (txtAns4.getText());
   question5 = (txtAns5.getText());
   
   
   //creates possible outcomes where if the question is right, the total points is increased by 1:
   if (question1.equals("B") ||question1.equals("b"))
   {
       score = score + pointValue;
   }
   //If the answer is wrong, as shown here, no points are earned:
   else
   {
    
           }
   if (question2.equals("A")||question2.equals("a"))
   {
       score = score + pointValue;
   }
   else
   {
 
   }
   if (question3.equals("C")||question3.equals("c"))
   {
       score = score + pointValue;
   }
   else
   {
    
           }
   if (question4.equals("B")||question4.equals("b"))
   {
     score = score + pointValue;  
   }
   else
   {

   }
   if (question5.equals("D")||question5.equals("d"))
   {
       score = score + pointValue;
 
           }
   else
   {

   }
   
   //if the users points are three or more, they get a pass:
   if (score >= 3)
   {
      lblresults.setText ("You passed! Your score was "+ score +"/5."); 
   }
   //If they did not earn at least three points, they fail:
   else
   {
       lblresults.setText ("Sorry, you failed, your score was "+ score +"/5.");
   }
   
   
   
   
   
    }//GEN-LAST:event_btnfinishedActionPerformed

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
            java.util.logging.Logger.getLogger(frmMultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMultipleChoiceQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfinished;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblInst1;
    private javax.swing.JLabel lblInst2;
    private javax.swing.JLabel lblInst3;
    private javax.swing.JLabel lblInst4;
    private javax.swing.JLabel lblInst5;
    private javax.swing.JLabel lblaQuestion1;
    private javax.swing.JLabel lblaQuestion2;
    private javax.swing.JLabel lblaQuestion3;
    private javax.swing.JLabel lblaQuestion4;
    private javax.swing.JLabel lblaQuestion5;
    private javax.swing.JLabel lblbQuestion1;
    private javax.swing.JLabel lblbQuestion2;
    private javax.swing.JLabel lblbQuestion3;
    private javax.swing.JLabel lblbQuestion4;
    private javax.swing.JLabel lblbQuestion5;
    private javax.swing.JLabel lblcQuestion1;
    private javax.swing.JLabel lblcQuestion2;
    private javax.swing.JLabel lblcQuestion3;
    private javax.swing.JLabel lblcQuestion4;
    private javax.swing.JLabel lblcQuestion5;
    private javax.swing.JLabel lbldQuestion1;
    private javax.swing.JLabel lbldQuestion2;
    private javax.swing.JLabel lbldQuestion3;
    private javax.swing.JLabel lbldQuestion4;
    private javax.swing.JLabel lbldQuestion5;
    private javax.swing.JLabel lblquestion1;
    private javax.swing.JLabel lblquestion2;
    private javax.swing.JLabel lblquestion3;
    private javax.swing.JLabel lblquestion4;
    private javax.swing.JLabel lblquestion5;
    private javax.swing.JLabel lblresults;
    private javax.swing.JTextField txtAns1;
    private javax.swing.JTextField txtAns2;
    private javax.swing.JTextField txtAns3;
    private javax.swing.JTextField txtAns4;
    private javax.swing.JTextField txtAns5;
    // End of variables declaration//GEN-END:variables
}
