package BusManagementSystem;

/*this shit isn't letting me write some code after 
button created so i am gonna change it in Constructor after calling the function. LOL
C++ shit Dude- Fucking Always Works :-D
*/
/*
Shauar javay pointer nai. nullpointer error e 1 hour nosto hoilo
*/
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class TicketPanel extends javax.swing.JFrame 
{
     String m;
    public TicketPanel()  
    {
         initComponents();
         try { 
             change();
         } catch (Exception ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }

           
    }
    
    private void change( ) throws Exception
    {
        btn1.setBackground(Color.cyan);
        btn2.setBackground(Color.cyan);
        btn3.setBackground(Color.cyan);
        btn4.setBackground(Color.cyan);
        btn5.setBackground(Color.cyan);
        btn6.setBackground(Color.cyan);
        btn7.setBackground(Color.cyan);
        btn8.setBackground(Color.cyan);
        btn9.setBackground(Color.cyan);
        btn10.setBackground(Color.cyan);
        btn11.setBackground(Color.cyan);
        btn12.setBackground(Color.cyan);
        btn13.setBackground(Color.cyan); 
        btn14.setBackground(Color.cyan);
        btn15.setBackground(Color.cyan);
        btn16.setBackground(Color.cyan);
        btn17.setBackground(Color.cyan);
        btn18.setBackground(Color.cyan);
        btn19.setBackground(Color.cyan);
        btn20.setBackground(Color.cyan);
        btn21.setBackground(Color.cyan);
        btn22.setBackground(Color.cyan);
        btn23.setBackground(Color.cyan);
        btn24.setBackground(Color.cyan);
        btn25.setBackground(Color.cyan);
        btn26.setBackground(Color.cyan);
        btn27.setBackground(Color.cyan);
        btn28.setBackground(Color.cyan);
        btn29.setBackground(Color.cyan);
        btn30.setBackground(Color.cyan);
        btn31.setBackground(Color.cyan);
        btn32.setBackground(Color.cyan);
        btn33.setBackground(Color.cyan); 
        btn34.setBackground(Color.cyan);
        btn35.setBackground(Color.cyan);
        btn36.setBackground(Color.cyan);
        btn37.setBackground(Color.cyan);
        btn38.setBackground(Color.cyan);
        btn39.setBackground(Color.cyan);
        btn40.setBackground(Color.cyan);
       
        
        try
       {
           String m=new ManageTicket().Busno();
           m=m+".txt";
           Scanner sc=new Scanner(new File(m));
           while(sc.hasNext())
           {               
               int i=1,b;
               i=sc.nextInt();
               b=sc.nextInt();
               
             if(i==1&&b!=0)
                    btn1.setBackground(Color.red);
             
            if(i==2&&b!=0)
                    btn2.setBackground(Color.red);
             
            if(i==3&&b!=0)
                    btn3.setBackground(Color.red);
             
            if(i==4&&b!=0)
                    btn4.setBackground(Color.red);
             
            if(i==5&&b!=0)
                    btn5.setBackground(Color.red);
             
            if(i==6&&b!=0)
                    btn6.setBackground(Color.red);
            if(i==7&&b!=0)
                    btn7.setBackground(Color.red);
             
            if(i==8&&b!=0)
                    btn8.setBackground(Color.red);
              
            if(i==9&&b!=0)
                    btn9.setBackground(Color.red);
               
            if(i==10&&b!=0)
                    btn10.setBackground(Color.red);
                
            if(i==11&&b!=0)
                    btn11.setBackground(Color.red);
                 
            if(i==12&&b!=0)
                    btn12.setBackground(Color.red);
                  
            if(i==13&&b!=0)
                    btn13.setBackground(Color.red);
            if(i==14&&b!=0)
                    btn14.setBackground(Color.red);
                    
            if(i==15&&b!=0)
                    btn15.setBackground(Color.red);
                
            if(i==16&&b!=0)
                    btn16.setBackground(Color.red);
                      
            if(i==17&&b!=0)
                    btn17.setBackground(Color.red);
                 
            if(i==18&&b!=0)
                    btn18.setBackground(Color.red);
                  
            if(i==18&&b!=0)
                    btn18.setBackground(Color.red);
                
            if(i==19&&b!=0)
                    btn19.setBackground(Color.red);
            
            if(i==20&&b!=0)
                    btn20.setBackground(Color.red);
            
            if(i==21&&b!=0)
                    btn21.setBackground(Color.red);
                
            if(i==22&&b!=0)
                    btn22.setBackground(Color.red);
                 
             if(i==23&&b!=0)
                    btn23.setBackground(Color.red);
               
            if(i==24&&b!=0)
                    btn24.setBackground(Color.red);
                 
            if(i==25&&b!=0)
                    btn25.setBackground(Color.red);
                
            if(i==26&&b!=0)
                    btn26.setBackground(Color.red);
                
            if(i==27&&b!=0)
                    btn27.setBackground(Color.red);
                
            if(i==28&&b!=0)
                    btn28.setBackground(Color.red);
                 
            if(i==29&&b!=0)
                    btn29.setBackground(Color.red);
                  
            if(i==30&&b!=0)
                    btn30.setBackground(Color.red);
                   
            if(i==31&&b!=0)
                    btn31.setBackground(Color.red);
            if(i==32&&b!=0)
                    btn32.setBackground(Color.red);
            
            if(i==33&&b!=0)
                    btn33.setBackground(Color.red);
            if(i==34&&b!=0)
                    btn34.setBackground(Color.red);
                       
            if(i==35&&b!=0)
                    btn35.setBackground(Color.red);
                        
            if(i==36&&b!=0)
                    btn36.setBackground(Color.red);
            
            if(i==37&&b!=0)
                    btn37.setBackground(Color.red);
            if(i==38&&b!=0)
                    btn38.setBackground(Color.red);
                           
            if(i==39&&b!=0)
                    btn39.setBackground(Color.red);
            if(i==40&&b!=0)
                    btn40.setBackground(Color.red);               
           }
           sc.close();
       }
       catch(java.io.FileNotFoundException e)
       {
           JOptionPane.showMessageDialog(null, "Error Occured. Please fill all required data !","File Not Found!...",JOptionPane.ERROR_MESSAGE);
           new ManageTicket().setVisible(true);
       }
    }
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        driver = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("             Gate");

        driver.setBackground(new java.awt.Color(5, 117, 5));
        driver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        driver.setForeground(new java.awt.Color(204, 0, 0));
        driver.setText("           Driver");

        btn1.setText("A1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn5.setText("B1");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn9.setText("C1");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn13.setText("D1");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn17.setText("E1");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn21.setText("F1");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn25.setText("G1");
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        btn29.setText("H1");
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });

        btn33.setText("I1");
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn37.setText("J1");
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });

        btn2.setText("A2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn6.setText("B2");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn10.setText("C2");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn14.setText("D2");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn18.setText("E2");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn22.setText("F2");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn26.setText("G2");
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });

        btn30.setText("H2");
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });

        btn34.setText("I2");
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });

        btn38.setText("J2");
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });

        btn16.setText("D4");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn20.setText("E4");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn24.setText("F4");
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn28.setText("G4");
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        btn32.setText("H4");
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn36.setText("I4");
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });

        btn40.setText("J4");
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });

        btn3.setText("A3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn7.setText("B3");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn11.setText("C3");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn15.setText("D3");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn19.setText("E3");
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn23.setText("F3");
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn27.setText("G3");
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        btn31.setText("H3");
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn35.setText("I3");
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });

        btn39.setText("J3");
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn39ActionPerformed(evt);
            }
        });

        btn4.setText("A4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn8.setText("B4");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn12.setText("C4");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(0, 153, 153));
        exit.setForeground(new java.awt.Color(0, 153, 153));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1)
                    .addComponent(btn13)
                    .addComponent(btn17)
                    .addComponent(btn21)
                    .addComponent(btn25)
                    .addComponent(btn29)
                    .addComponent(btn33)
                    .addComponent(btn37)
                    .addComponent(btn5)
                    .addComponent(btn9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn38)
                    .addComponent(btn2)
                    .addComponent(btn6)
                    .addComponent(btn10)
                    .addComponent(btn30)
                    .addComponent(btn34)
                    .addComponent(btn26)
                    .addComponent(btn14)
                    .addComponent(btn18)
                    .addComponent(btn22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3)
                    .addComponent(btn7)
                    .addComponent(btn11)
                    .addComponent(btn15)
                    .addComponent(btn19)
                    .addComponent(btn23)
                    .addComponent(btn27)
                    .addComponent(btn31)
                    .addComponent(btn35)
                    .addComponent(btn39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4)
                    .addComponent(btn8)
                    .addComponent(btn12)
                    .addComponent(btn16)
                    .addComponent(btn20)
                    .addComponent(btn24)
                    .addComponent(btn28)
                    .addComponent(btn32)
                    .addComponent(btn36)
                    .addComponent(btn40))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(driver, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(exit)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addGap(18, 18, 18)
                                .addComponent(btn5)
                                .addGap(18, 18, 18)
                                .addComponent(btn9)
                                .addGap(28, 28, 28)
                                .addComponent(btn13)
                                .addGap(18, 18, 18)
                                .addComponent(btn17)
                                .addGap(18, 18, 18)
                                .addComponent(btn21)
                                .addGap(18, 18, 18)
                                .addComponent(btn25)
                                .addGap(18, 18, 18)
                                .addComponent(btn29)
                                .addGap(18, 18, 18)
                                .addComponent(btn33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn2)
                                .addGap(18, 18, 18)
                                .addComponent(btn6)
                                .addGap(18, 18, 18)
                                .addComponent(btn10)
                                .addGap(28, 28, 28)
                                .addComponent(btn14)
                                .addGap(18, 18, 18)
                                .addComponent(btn18)
                                .addGap(18, 18, 18)
                                .addComponent(btn22)
                                .addGap(18, 18, 18)
                                .addComponent(btn26)
                                .addGap(18, 18, 18)
                                .addComponent(btn30)
                                .addGap(18, 18, 18)
                                .addComponent(btn34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn38))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(driver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn4)
                                    .addComponent(btn3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn8)
                                    .addComponent(btn7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn12)
                                    .addComponent(btn11))
                                .addGap(28, 28, 28)
                                .addComponent(btn16)
                                .addGap(18, 18, 18)
                                .addComponent(btn20)
                                .addGap(18, 18, 18)
                                .addComponent(btn24)
                                .addGap(18, 18, 18)
                                .addComponent(btn28)
                                .addGap(18, 18, 18)
                                .addComponent(btn32)
                                .addGap(18, 18, 18)
                                .addComponent(btn36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn15)
                                .addGap(18, 18, 18)
                                .addComponent(btn19)
                                .addGap(18, 18, 18)
                                .addComponent(btn23)
                                .addGap(18, 18, 18)
                                .addComponent(btn27)
                                .addGap(18, 18, 18)
                                .addComponent(btn31)
                                .addGap(18, 18, 18)
                                .addComponent(btn35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn39)))))
                .addGap(6, 6, 6)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
  void seatmanage(int n) throws IOException
    { 
      String filename=new ManageTicket().Busno();
      filename=filename+".txt";
      Scanner sc=new Scanner(new File(filename));
      
      Formatter fr=new Formatter("temp.txt");
      
      while(sc.hasNext())
      {
          int i=sc.nextInt();
          int b=sc.nextInt();
          if(i==n)
          {
              if(b==0)
              {
                  JOptionPane.showMessageDialog(null,"Done!");
                  b=1;
                 fr.format("%d %d\n",i,b);
              }
              else
              {
                  fr.format("%d %d\n",i,b);
                  JOptionPane.showMessageDialog(null,"Seat Reserved!","Seat Booked",JOptionPane.ERROR_MESSAGE);
              }
          }
          else
          {
              fr.format("%d %d\n",i,b); 
          }
      }
      fr.close();
      sc.close();
      File f=new File(filename);
      File f1=new File("temp.txt");
      
      f.delete();    
      f1.renameTo(f);
      
      
    }
    
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         try {
             // TODO add your handling code here:
             seatmanage(1);
             dispose();
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
                
         
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(4);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         try {
             // TODO add your handling code here:
             seatmanage(2);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         try {
             // TODO add your handling code here:
             seatmanage(3);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(5);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(6);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(7);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(8);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(9);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(10);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(11);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(12);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(13);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(14);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(15);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(16);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(17);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(18);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(19);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(20);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(21);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(22);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(23);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(24);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(25);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(26);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(27);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(28);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(29);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(30);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(31);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(32);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(33);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(34);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(35);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(36);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(37);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(38);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn39ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(39);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn39ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             seatmanage(40);
             this.setVisible(false);
             new TicketPanel().setVisible(true);
         } catch (IOException ex) {
             Logger.getLogger(TicketPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btn40ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
     dispose();
     new ManageTicket().setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(TicketPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new TicketPanel().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel driver;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
