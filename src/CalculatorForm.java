
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vmhatre
 */
public class CalculatorForm extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorForm
     */
    public CalculatorForm() {
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

        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        firstNumber = new javax.swing.JTextField();
        secondNumber = new javax.swing.JTextField();
        addition = new javax.swing.JButton();
        subtraction = new javax.swing.JButton();
        answerText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Text1.setText("Number1:");

        Text2.setText("Number2:");

        firstNumber.setToolTipText("Enter First Number");

        secondNumber.setToolTipText("Enter Second Number");

        addition.setText("+");
        addition.setToolTipText("Add");
        addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionActionPerformed(evt);
            }
        });

        subtraction.setText("-");
        subtraction.setToolTipText("Subtract");
        subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionActionPerformed(evt);
            }
        });

        answerText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        answerText.setText("Answer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Text2)
                    .addComponent(Text1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addition)
                        .addGap(18, 18, 18)
                        .addComponent(subtraction))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(firstNumber)
                        .addComponent(secondNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
                    .addComponent(answerText, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text1)
                    .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text2)
                    .addComponent(secondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addition)
                    .addComponent(subtraction))
                .addGap(90, 90, 90)
                .addComponent(answerText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void additionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionActionPerformed
        int num1=0 ,num2=0;
        try{
             num1 = Integer.parseInt( this.firstNumber.getText() );   
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Invalid Input for first Number" , "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
        try{
             num2 = Integer.parseInt( this.secondNumber.getText() );   
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Invalid Input for second Number" , "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
        int ans = num1+num2;
        this.answerText.setText("Answer is" + ans);
        
        
        
        
        
    }//GEN-LAST:event_additionActionPerformed

    private void subtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionActionPerformed
        int num1=0, num2=0;
        try{
            num1 = Integer.parseInt(this.firstNumber.getText());
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Invalid input for first number", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            num2 =Integer.parseInt(this.secondNumber.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Invalid Input for second", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int answer = num1-num2 ;
        this.answerText.setText("Answer: "+ answer);
    }//GEN-LAST:event_subtractionActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JButton addition;
    private javax.swing.JLabel answerText;
    private javax.swing.JTextField firstNumber;
    private javax.swing.JTextField secondNumber;
    private javax.swing.JButton subtraction;
    // End of variables declaration//GEN-END:variables
}
