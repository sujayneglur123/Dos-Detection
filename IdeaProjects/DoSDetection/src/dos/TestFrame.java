/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import weka.attributeSelection.GeneticSearch;
import weka.classifiers.meta.FilteredClassifier;
import weka.classifiers.rules.DecisionTable;
import weka.core.Instances;

/**
 *
 * @author seabirds
 */
public class TestFrame extends javax.swing.JFrame {

    /**
     * Creates new form TestFrame
     */
    DataFrame df;
    String cls;
    public TestFrame(DataFrame de,String cs) 
    {
        initComponents();
        df=de;
        cls=cs;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("Test Connection");

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jLabel2.setText("Choose Test Data");

        jButton1.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        jButton2.setText("Test");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(262, 262, 262))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            JFileChooser fc=new JFileChooser();
            int ch=fc.showOpenDialog(this);
            if(ch==JFileChooser.APPROVE_OPTION)
            {
                String path=fc.getSelectedFile().getAbsolutePath();
                
                jTextField1.setText(path);
                File fe=new File(path);
                FileInputStream fis=new FileInputStream(fe);
                byte data[]=new byte[fis.available()];
                fis.read(data);
                fis.close();
                
                
                String txt=new String(data).trim();
                jTextArea1.setText(txt);
                        
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            String data=jTextArea1.getText().trim();
            String s1[]=data.split("\n");
            String s2[]=s1[0].split("\t");
            
            DefaultTableModel dm=(DefaultTableModel)df.jTable1.getModel();
            int col=dm.getColumnCount();
            System.out.println("col count"+col);
            
            String colName[]=new String[col];
            int h=0;
            for(int i=0;i<col;i++)
            {
                String a1=dm.getColumnName(i);
                System.out.println("=== "+a1);
                colName[h++]=a1;
            }
            
            String dat1[][]=new String[s1.length][col];
            for(int i=0;i<colName.length;i++)
            {
                String c1=colName[i];
                for(int j=0;j<s2.length;j++)
                {
                    if(c1.equals(s2[j].trim()))
                    {
                        for(int k=0;k<s1.length;k++)
                        {
                            String g1[]=s1[k].split("\t");
                            dat1[k][i]=g1[j];
                        }
                    }
                }
            }
            System.out.println("data ");
            String ct1="";
            for(int i=0;i<dat1.length;i++)
            {
                String c2="";
                for(int j=0;j<dat1[0].length;j++)
                {
                    //System.out.print(" "+dat1[i][j]);
                    c2=c2+dat1[i][j]+"\t";
                }
                c2=c2.trim();
                ct1=ct1+c2+"\n";
                //System.out.println();
            }
            ct1=ct1.trim();
            
            
            String as1[]=ct1.split("\n");
            String acol[]=as1[0].split("\t");
            String as2[]=as1[1].split("\t");
            
            String dd="@relation dd\n";
            for(int i=0;i<as2.length-1;i++)
            {
                if(as2[i].equals("sym"))
                {
                    
                    ArrayList at=new ArrayList();
                    for(int j=2;j<as1.length;j++)
                    {
                        String a1[]=as1[j].split("\t");
                        String g1=a1[i];
                        if(!at.contains(g1))
                            at.add(g1);
                    }
                    String ga=at.toString().replace("[", "");
                    ga=ga.replace("]","");
                    dd=dd+"@attribute "+acol[i]+" {"+ga+"}\n";
                }
                else
                    dd=dd+"@attribute "+acol[i]+" numeric\n";
            }
             dd=dd+"@attribute "+acol[acol.length-1]+" {"+cls+"}\n";
            dd=dd+"@data\n";
            for(int j=2;j<s1.length;j++)
            {
                dd=dd+as1[j].replace("\t", ",")+"\n";
            }
            dd=dd.trim();
            File fe=new File("dos2.arff");
            FileOutputStream fos=new FileOutputStream(fe);
            fos.write(dd.getBytes());
            fos.close();
            
            Instances train = new Instances(new BufferedReader(new FileReader("dos.arff")));
            Instances test = new Instances(new BufferedReader(new FileReader("dos2.arff")));
            
            int cIdx=train.numAttributes()-1;
            train.setClassIndex(cIdx);
		
            int cIdx1=test.numAttributes()-1;
            test.setClassIndex(cIdx1);
            FilteredClassifier model = new FilteredClassifier();
        
            
            GeneticSearch gs=new GeneticSearch();  
	
            gs.setStartSet("1");
            String[] options = new String[3];
            options[0]="- X 1";
            options[1]="- E mae";
            options[2]="-S weka.attributeSelection.GeneticSearch -Z 20 -G 20 -C 0.3 -M 0.033 -R 20 -S 1";
            
            DecisionTable dt=new DecisionTable();
            dt.setOptions(options);
            dt.setSearch(gs);
            
            model.setClassifier(dt);
            model.buildClassifier(train);

            String res="";
            String res2="";
            for (int i = 0; i < test.numInstances(); i++) 
            {
                test.instance(i).setClassMissing();
                double cls = model.classifyInstance(test.instance(i));
                test.instance(i).setClassValue(cls);
                String ga=test.instance(i).classAttribute().value((int) cls);
                //System.out.println(ga);
                if(ga.equalsIgnoreCase("normal"))
                    res2=res2+i+"  ->  "+test.instance(i).classAttribute().value((int) cls)+"\n";           
                else
                    res=res+i+"  ->  "+test.instance(i).classAttribute().value((int) cls)+"\n";           
                
                
            }
            System.out.println(res);
            
             ResultFrame rf=new ResultFrame();
            rf.setVisible(true);
            rf.setTitle("Test Result");
            rf.setResizable(false);
            rf.jTextArea1.setText(res);
            rf.jTextArea2.setText(res2);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new TestFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
