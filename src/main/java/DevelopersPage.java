
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mtshez
 */
public class DevelopersPage extends javax.swing.JFrame {
     private int maxTasks;
     private int tasksEntered = 0;
     private int taskCounter = 1;
    /**
     * Creates new form DevelopersPage
     */
    public DevelopersPage() {
        initComponents();
        promptForNumberOfTasks();
        getMax2();
    }
    public void getMax(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < jTable1.getRowCount(); i++){
            list.add(Integer.parseInt(jTable1.getValueAt(i, 3).toString()));
        }
        int max = Collections.max(list);
        jTextField7.setText(Integer.toString(max));
    }
    
    public void getMax2(){
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < jTable1.getRowCount(); i++){
            int val = Integer.parseInt(jTable1.getValueAt(i, 3).toString());
            if(val > max2){
                max2 = val;
            }
        }
        jTextField7.setText(Integer.toString(max2));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskId = new javax.swing.JLabel();
        developer = new javax.swing.JLabel();
        taskDuration = new javax.swing.JLabel();
        taskName = new javax.swing.JLabel();
        taskStatus = new javax.swing.JLabel();
        addTasks = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        welcome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        showReport = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taskId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        taskId.setText("Task ID:");

        developer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        developer.setText("Developer:");

        taskDuration.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        taskDuration.setText("Task Duration:");

        taskName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        taskName.setText("Task name:");

        taskStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        taskStatus.setText("Task status:");

        addTasks.setBackground(new java.awt.Color(51, 153, 0));
        addTasks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addTasks.setForeground(new java.awt.Color(255, 255, 255));
        addTasks.setText("Add Tasks");
        addTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTasksActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 0, 51));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome.setText("Welcome To EasyKanban");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ID", "Developer", "Task Duration", "Task name", "Task status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "To Do", "Done", "Doing" }));

        showReport.setBackground(new java.awt.Color(0, 0, 0));
        showReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showReport.setForeground(new java.awt.Color(255, 255, 255));
        showReport.setText("Show Report");
        showReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showReportActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 102, 153));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Max:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Search Data:");

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showReport)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addTasks)
                                .addGap(18, 18, 18)
                                .addComponent(exit))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(developer)
                            .addComponent(taskDuration)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(taskName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(taskStatus, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(taskId, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(275, 275, 275))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(welcome)
                .addGap(73, 73, 73)
                .addComponent(taskId)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(developer)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskDuration)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskName)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskStatus)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addTasks)
                        .addComponent(exit))
                    .addComponent(showReport, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(2, 2, 2)
                .addComponent(delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void promptForNumberOfTasks() {
        String input = JOptionPane.showInputDialog(this, "Enter the number of tasks you wish to enter:");
        try {
            maxTasks = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number. Please enter a valid integer.");
            promptForNumberOfTasks();
        }
    }
    private void addTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTasksActionPerformed
        // TODO add your handling code here:
        //String taskId = jTextField1.getText();
         //22String taskNumb = jTextField2.getText();
          //String taskDescription = jTextField3.getText();
           String developer = jTextField4.getText();
            String taskDuration = jTextField5.getText();
             String taskName = jTextField6.getText();
              //String taskStatus = jTextField7.getText();
        if (/*taskDescription.isEmpty() || */developer.isEmpty() || 
                taskDuration.isEmpty() || taskName.isEmpty()) {
                //|| taskStatus.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required to be filled!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
        // Check if task description exceeds 50 characters
        /*if (taskDescription.length() > 50) {
        // Display an error message
        JOptionPane.showMessageDialog(this, "Task description cannot exceed 50 characters", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }*/
    
    // Generate the expected Task ID based on the format
    String taskNumb = String.valueOf(taskCounter);
    String generatedTaskId = (taskName.length() >= 2 ? taskName.substring(0, 2).toUpperCase() : taskName.toUpperCase())
                            + ":" + taskNumb + ":"
                            + (developer.length() >= 3 ? developer.substring(developer.length() - 3).toUpperCase() : developer.toUpperCase());

    /*// Check if the Task ID matches the expected format
    if (!taskId.equals(expectedtaskId)) {
        // Display an error message
        JOptionPane.showMessageDialog(this, "Task ID must be in the format: First 2 letters of task name, colon, task number, colon, last 3 letters of developer name, all in uppercase", "Error", JOptionPane.ERROR_MESSAGE);
        return;
      } else {
            JOptionPane.showMessageDialog(null, "Task successfully captured!");
         }*/
        // Check for duplicate entries
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            boolean duplicate = true;
            for (int j = 0; j < model.getColumnCount(); j++) {
                if (!model.getValueAt(i, j).toString() .equals
                     (new String[]{generatedTaskId /*,jTextField2.getText(),
                        jTextField3.getText()*/, jTextField4.getText(),
                        jTextField5.getText(), jTextField6.getText(),
                        jComboBox1.getSelectedItem().toString()}[j])) {
                    duplicate = false;
                    break;
                }
            }
            if (duplicate) {
                JOptionPane.showMessageDialog(this, "Duplicate entry detected. Please enter unique information.");
                return;
            }
        }
        // Add task to table if the limit is not exceeded
        if (tasksEntered < maxTasks) {
        //DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{generatedTaskId,/*jTextField2.getText(),
                                  jTextField3.getText(),*/jTextField4.getText(),
                                  jTextField5.getText(),jTextField6.getText(),
                                  jComboBox1.getSelectedItem().toString()});
            tasksEntered++;
            taskCounter++;
            JOptionPane.showMessageDialog(null, "Task successfully captured!");
        } else {
            JOptionPane.showMessageDialog(this, "Maximum number of tasks entered.");
        }
        // Clear text fields
        //jTextField1.setText("");
        //jTextField2.setText("");
        //jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_addTasksActionPerformed
      
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        //get jtable model first
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String taskNameToDelete = jTextField6.getText(); // Get task name from input field

        if (!taskNameToDelete.isEmpty()) {
            boolean found = false;
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 3).toString().equals(taskNameToDelete)) {
                    model.removeRow(i);
                    tasksEntered--;
                    taskCounter--;
                    JOptionPane.showMessageDialog(this, "Task '" + taskNameToDelete + "' deleted successfully.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "Task '" + taskNameToDelete + "' not found in the list.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a task name to delete.");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
        DefaultTableModel ob=(DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
        jTable1.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(jTextField8.getText()));
    }//GEN-LAST:event_jTextField8KeyReleased

    private void showReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showReportActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        StringBuilder report = new StringBuilder();
        report.append("Task Report:\n\n");

        for (int i = 0; i < model.getRowCount(); i++) {
            report.append("Task ID: ").append(model.getValueAt(i, 0)).append("\n");
            report.append("Developer: ").append(model.getValueAt(i, 1)).append("\n");
            report.append("Task Duration: ").append(model.getValueAt(i, 2)).append("\n");
            report.append("Task Name: ").append(model.getValueAt(i, 3)).append("\n");
            report.append("Task Status: ").append(model.getValueAt(i, 4)).append("\n");
            report.append("-----------------------------------\n");
        }

        JOptionPane.showMessageDialog(this, report.toString(), "Task Report", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_showReportActionPerformed

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
            java.util.logging.Logger.getLogger(DevelopersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DevelopersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DevelopersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DevelopersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DevelopersPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTasks;
    private javax.swing.JButton delete;
    private javax.swing.JLabel developer;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton showReport;
    private javax.swing.JLabel taskDuration;
    private javax.swing.JLabel taskId;
    private javax.swing.JLabel taskName;
    private javax.swing.JLabel taskStatus;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
