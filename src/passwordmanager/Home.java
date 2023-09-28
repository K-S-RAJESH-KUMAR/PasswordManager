/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package passwordmanager;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author RAJESH KUMAR
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public static int uid;
    public static int no;
    public static String email;
    public static String Passwd;
    public static String fname;
    public static String lname;
    public Home(int id) {
        uid=id;
        initComponents();
          Color col =new Color(27,163,163);
        getContentPane().setBackground(col);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        Image icon=new ImageIcon(this.getClass().getResource("/security.png")).getImage();
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PASSWORD MANAGER");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setName(""); // NOI18N

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME");

        jScrollPane2.setBackground(new java.awt.Color(242, 242, 242));

        jTable1.setBackground(new java.awt.Color(153, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setRowHeight(40);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SAVED PASSWORDS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HOME", jPanel1);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("ADD NEW PASSWORD");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("ACCOUNT NAME");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("USER ID / EMAIL");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("PASSWORD");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(27, 163, 163));
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel5)
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD NEW PASSWORD", jPanel2);

        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel3ComponentShown(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("PERSONAL INFORMATION");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("USER NAME: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("E-mail: ");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("CHANGE PASSWORD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("NUMBER OF PASSWORDS STORED : ");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("CHANGE EMAIL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel9)
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton3)))
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PERSONAL INFO", jPanel3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" PASSWORD MANAGER");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton1)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(42, 42, 42)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                       JFrame jf=new Login();
                       jf.setVisible(true);
                       dispose();    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
       
        jTable1.setModel(new DefaultTableModel());
        
        try
       {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/password","root","Rajesh@2002");
            if(con!=null){
                System.out.println("CONNECTED SUCCESSFULLY");
            Statement st=con.createStatement();
            String query="select * from user where uid='"+uid+"'";
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
            {
                fname=rs.getString(2);
                lname=rs.getString(3);
                email=rs.getString(4);
                Passwd=rs.getString(5);
                jLabel2.setText("WELCOME "+fname.toUpperCase()+"  "+lname.toUpperCase());
            }
            
            
            query="select * from useraccount where uid='"+uid+"' ORDER BY accName";
            Statement st1=con.createStatement();
            ResultSet rs1 = st1.executeQuery(query);
            ResultSetMetaData rsmd=(ResultSetMetaData) rs1.getMetaData();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String arr[]={"ACCOUNT NAME","USER ID / EMAIL","SEE/EDIT/DELETE PASSWORD"};
            model.setColumnIdentifiers(arr);
            
            
            
            String name,userID,pass;
            
            while(rs1.next())
            {
                name=rs1.getString(2);
                userID=rs1.getString(3);
                //pass=rs1.getString(4);
                String row[]={name,userID,"CLICK HERE"};
                model.addRow(row);
            }
            query="select count(*) from useraccount where uid='"+uid+"'";
            st1=con.createStatement();
            rs1 = st1.executeQuery(query);
            rs1.next();
            no=Integer.parseInt(rs1.getString(1));
            st.close();
            con.close();
       }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

       
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String accName=jTextField2.getText();
        String userID=jTextField3.getText();
        String pass=new String(jPasswordField1.getPassword());
        jTextField2.setText("");
        jTextField3.setText("");
        jPasswordField1.setText("");
        int val=0;

       if(!(accName.equals("")||userID.equals("")||pass.equals("")))
       {
            try
            {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/password","root","Rajesh@2002");
                 if(con!=null){
                     System.out.println("CONNECTED SUCCESSFULLY");
                     
                     
                       Statement st1=con.createStatement();
                        String query1="select * from useraccount where uid='"+uid+"' and accName='"+accName+"'";
                        ResultSet rs1= st1.executeQuery(query1);
                        if(rs1.next())
                        {
                            email=rs1.getString(3);
                            val=JOptionPane.showConfirmDialog(null,accName+" already exist with the email / user id "+email+"\nDo you still want to continue ? ","Confirmation",JOptionPane.YES_NO_OPTION);
                            
                        }
                        if(val==JOptionPane.YES_OPTION)
                        {
                            Statement st=con.createStatement();
                            String query="insert into useraccount values ('"+uid+"','"+accName+"','"+userID+"','"+pass+"')";
                            st.executeUpdate(query);
                            st.close();
                        }
            st1.close();
            con.close();
            }
           }
            catch(Exception e)
            {
                System.out.println(e);
            } 
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Box box=Box.createHorizontalBox();
       JLabel jl=new JLabel("PASSWORD :");
       JPasswordField jpf=new JPasswordField();
       box.add(jl);
       box.add(jpf);
       
       
       int btn=JOptionPane.showConfirmDialog(null,box,"Enter your password to continue",JOptionPane.OK_CANCEL_OPTION);
       if(btn==JOptionPane.OK_OPTION)
       {
           String pass=new String(jpf.getPassword());
        if(Passwd.equals(pass))
        {
            pass=JOptionPane.showInputDialog("Enter the new password");
            if(!pass.equals(""))
            {
            
                try
                {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/password","root","Rajesh@2002");
                     if(con!=null){
                         System.out.println("CONNECTED SUCCESSFULLY");
                     Statement st=con.createStatement();
                     String query="update user set pass='"+pass+"' where uid='"+uid+"'";
                     st.executeUpdate(query);
                     JOptionPane.showMessageDialog(null, "PASSWORD CHANGED SUCCESSFULLY");
                     st.close();
                     con.close();
                      JFrame jf=new Home(uid);
                           jf.setVisible(true);
                           dispose();
                }
               }
                catch(Exception e)
                {
                    System.out.println(e);
                }
          }
        }
        else
            JOptionPane.showMessageDialog(null, "WRONG PASSWORD \n TRY AGAIN");
    }//GEN-LAST:event_jButton3ActionPerformed
}
    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown
        jLabel10.setText("USER NAME:  "+fname.toUpperCase()+"  "+lname.toUpperCase());
        jLabel11.setText("E-mail: "+email);
        jLabel12.setText("NUMBER OF PASSWORDS STORED : "+no);
    }//GEN-LAST:event_jPanel3ComponentShown

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Box box=Box.createHorizontalBox();
       JLabel jl=new JLabel("PASSWORD :");
       JPasswordField jpf=new JPasswordField();
       box.add(jl);
       box.add(jpf);
       
       
       int btn=JOptionPane.showConfirmDialog(null,box,"Enter your password to continue",JOptionPane.OK_CANCEL_OPTION);
       if(btn==JOptionPane.OK_OPTION)
       {
           String pass=new String(jpf.getPassword());
        if(Passwd.equals(pass))
        {
            String em=JOptionPane.showInputDialog("Enter the new E-mail");
            
            String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(em);
            if(matcher.matches()){
                try
                {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/password","root","Rajesh@2002");
                     if(con!=null){
                         System.out.println("CONNECTED SUCCESSFULLY");
                     Statement st=con.createStatement();
                     String query="update user set email='"+em+"' where uid='"+uid+"'";
                     st.executeUpdate(query);
                     JOptionPane.showMessageDialog(null, "E-mail CHANGED SUCCESSFULLY");
                }
               }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "<html><h3 style='color=red'>*Enter a valid E-mail<h3></html>");

            }
       
        }
        else
            JOptionPane.showMessageDialog(null, "WRONG PASSWORD \n TRY AGAIN");
    }//GEN-LAST:event_jButton4ActionPerformed
}
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int index=jTable1.getSelectedRow();
       TableModel model=jTable1.getModel();
       
       String accountName= model.getValueAt(index,0).toString();
       String userID= model.getValueAt(index,1).toString();
       
       
       
       Box box=Box.createHorizontalBox();
       JLabel jl=new JLabel("PASSWORD :");
       JPasswordField jpf=new JPasswordField();
       box.add(jl);
       box.add(jpf);
       
       
       int btn=JOptionPane.showConfirmDialog(null,box,"Enter your password to continue",JOptionPane.OK_CANCEL_OPTION);
       if(btn==JOptionPane.OK_OPTION)
       {
           String pass=new String(jpf.getPassword());
       if(Passwd.equals(pass))
       {
            
            try
            {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/password","root","Rajesh@2002");
                 if(con!=null){
                 System.out.println("CONNECTED SUCCESSFULLY");
                 Statement st;
                 st=con.createStatement();
                 String query;
                 ResultSet rs;
                 String pwd="";
                 
                  String options[]={"SEE","EDIT","DELETE"};
                  int ch=JOptionPane.showOptionDialog(null, "SELECT YOUR CHOICE ","SELECT ONE;",0,JOptionPane.QUESTION_MESSAGE,null,options,"");
                  //System.out.println("CHOICE IS"+ch);
                 if(ch == 0)
                 {
                     query="select * from useraccount where uid='"+uid+"' and accName='"+accountName+"' and userId='"+userID+"'";
                     rs= st.executeQuery(query);
                      if(rs.next())
                      {
                           pwd =rs.getString(4);
                      }
                      
                      JOptionPane.showMessageDialog(null, "<html><h3 style='color:blue'>ACCOUNT NAME:  "+accountName+"<br>USER ID / EMAIL:  "+userID+"<br>PASSWORD:  "+pwd+"</h3></html>");    
                 }
                 else if(ch==1)
                 {
                     String newPass=JOptionPane.showInputDialog("Enter new password for "+accountName);
                     if(!newPass.equals("")){
                     query="update useraccount set passwd='"+newPass+"' where uid='"+uid+"' and accName='"+accountName+"' and userId='"+userID+"'";
                     st.executeUpdate(query);
                     JOptionPane.showMessageDialog(null, "PASSWORD OF "+accountName+" CHANGED SUCCESSFULLY");
                     }
                     else
                         JOptionPane.showMessageDialog(null, "PLEASE ENTER A VALID PASSWORD !!");
                 }
                 else if(ch==2)
                 {
                     int res= JOptionPane.showConfirmDialog(null, "DO YOU WANT TO DELETE DETAILS OF  "+accountName+" ?","Confirmation",JOptionPane.YES_NO_OPTION);
                     if(res==JOptionPane.YES_OPTION)
                     {
                         query="delete from useraccount where uid='"+uid+"' and accName='"+accountName+"' and userId='"+userID+"'";
                        st.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "PASSWORD OF "+accountName+" DELETED SUCCESSFULLY");
                       st.close();
                        con.close();
                        
                        JFrame jf=new Home(uid);
                       jf.setVisible(true);
                       dispose();
                     }
                 }
                     st.close();
                    con.close();
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
       }
       else
           JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD \n TRY AGAIN");    
       }    
       
       
       
       
       
       
       
       
    }//GEN-LAST:event_jTable1MouseClicked
    
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home(uid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
