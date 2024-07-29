
import java.awt.Image;
import java.io.File;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Admin_Home extends javax.swing.JFrame {

    File ph,ph1,movie;
    JFileChooser jfc;
    
    public Admin_Home(String name) {
        initComponents();
        setSize(900,700);
        lb.setText("Welcome: "+name);
        loadCategories();
           
        ImageIcon ic = new ImageIcon("src/imageee.jpg");
        Image im = ic.getImage().getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH);
        background.setIcon(new ImageIcon(im));
    }
    
 void loadCategories()
 {
     String ans = myClient.fetchcategories();
     
     StringTokenizer st = new StringTokenizer(ans,";;");
     while(st.hasMoreTokens())
     {
        String name = st.nextToken();
        
        cb.addItem(name);
     }
 }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        catname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        director = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cast = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        youtube_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        moviename = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        photo1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb.setText("Welcome");
        getContentPane().add(lb);
        lb.setBounds(0, 0, 800, 80);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Category");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 90, 150, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Category name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 150, 100, 16);
        getContentPane().add(catname);
        catname.setBounds(140, 150, 170, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Photo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 220, 90, 40);
        getContentPane().add(photo);
        photo.setBounds(140, 220, 150, 140);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Choose Photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 390, 160, 40);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 510, 150, 50);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Movies");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(550, 100, 150, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Select Category");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 150, 120, 16);

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select category" }));
        getContentPane().add(cb);
        cb.setBounds(590, 140, 170, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("cast");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 310, 110, 30);
        getContentPane().add(director);
        director.setBounds(590, 260, 170, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Movie Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 210, 110, 30);
        getContentPane().add(cast);
        cast.setBounds(590, 310, 170, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Director");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(470, 260, 110, 30);
        getContentPane().add(youtube_id);
        youtube_id.setBounds(470, 390, 170, 30);

        jLabel9.setText("photo");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(470, 460, 110, 16);
        getContentPane().add(moviename);
        moviename.setBounds(590, 210, 170, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Trailer");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(470, 360, 110, 16);
        getContentPane().add(photo1);
        photo1.setBounds(560, 430, 110, 120);

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setText("choose");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(740, 490, 130, 40);

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(610, 583, 130, 50);

        jLabel11.setText("Choose Movie");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(660, 360, 110, 16);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Choose Movie");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(670, 390, 170, 30);
        getContentPane().add(background);
        background.setBounds(3, 6, 900, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jfc = new JFileChooser();
        int ans = jfc.showOpenDialog(this);
        if(ans==JFileChooser.APPROVE_OPTION)
        {
            ph = jfc.getSelectedFile();
            
            ImageIcon ic = new ImageIcon(ph.getPath());
            Image img = ic.getImage().getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic1 = new ImageIcon(img);
            
            photo.setIcon(ic1);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String category = catname.getText();
        
        if(catname.equals("")||ph==null)
        {
            JOptionPane.showMessageDialog(rootPane, "All Fields are Mandatory");
        }
        else
        {
            String ans = myClient.addcat(category,ph);
            
            if(ans.equals("success"))
            {
                JOptionPane.showMessageDialog(rootPane, "Added Successfully");
            }
            else if(ans.equals("exist"))
            {
                JOptionPane.showMessageDialog(rootPane, "Category Already Exist");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Failed");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           jfc = new JFileChooser();
           
           int ans = jfc.showOpenDialog(this);
           
           if(ans==JFileChooser.APPROVE_OPTION)
           {
               ph1 = jfc.getSelectedFile();
               
               ImageIcon ic = new ImageIcon(ph1.getPath());
               
               Image img  = ic.getImage().getScaledInstance(photo1.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
          
               ImageIcon ic1 = new ImageIcon(img);
               
               photo1.setIcon(ic1);
           }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       String category = (String) cb.getSelectedItem();
       String movie_name = moviename.getText();
       String direct = director.getText();
       String starcast = cast.getText();
       String youtube = youtube_id.getText();
       
       
       if(category.equals("")|| movie_name.equals("")|| direct.equals("")|| starcast.equals("")|| youtube.equals("")||ph1==null||movie==null)
       {
           JOptionPane.showMessageDialog(rootPane, "All Fields are mandatory");
       }
       else
       {
           String ans  = myClient.addmovie(category,movie_name,direct,starcast,youtube,ph1,movie);
           if(ans.equals("success"))
           {
               JOptionPane.showMessageDialog(rootPane, "Added Successfully");
           }
           else
           {
               JOptionPane.showMessageDialog(rootPane, "Failed");
           }
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       jfc = new JFileChooser();
       
       int ans = jfc.showOpenDialog(this);
       
       if(ans == JFileChooser.APPROVE_OPTION)
       {
           movie = jfc.getSelectedFile();
       }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Home("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField cast;
    private javax.swing.JTextField catname;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JTextField director;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb;
    private javax.swing.JTextField moviename;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel photo1;
    private javax.swing.JTextField youtube_id;
    // End of variables declaration//GEN-END:variables
}
