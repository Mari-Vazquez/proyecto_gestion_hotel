package Vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Menu extends javax.swing.JFrame {

    public Clip clip;
    public String Ruta = "/sonido/";

    public Menu() {
        initComponents();

    }

    public void Sonido(String archivo) {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(Ruta + archivo + ".wav")));
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/Hotel(1).png"));
        Image miImagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmCHabitacion1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmCargarth = new javax.swing.JMenuItem();
        jmCHabitacion = new javax.swing.JMenuItem();
        jmCHabitacion2 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jMenu10.setText("jMenu10");

        jMenu11.setText("File");
        jMenuBar4.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar4.add(jMenu12);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(51, 51, 51));
        escritorio.setForeground(new java.awt.Color(255, 255, 255));
        escritorio.setPreferredSize(new java.awt.Dimension(1107, 900));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1107, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/registro.png"))); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu1MouseExited(evt);
            }
        });

        jmCHabitacion1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jmCHabitacion1.setText("Reserva");
        jmCHabitacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCHabitacion1ActionPerformed(evt);
            }
        });
        jMenu1.add(jmCHabitacion1);

        jMenuItem2.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jMenuItem2.setText("Info Reservas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu2MouseExited(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jMenuItem1.setText("Cargar Huésped");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 23)); // NOI18N
        jMenuItem3.setText("Info Huésped");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/habitacion.png"))); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu4MouseExited(evt);
            }
        });

        jmCargarth.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jmCargarth.setText("Cargar Tipo de Habitación");
        jmCargarth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCargarthActionPerformed(evt);
            }
        });
        jMenu4.add(jmCargarth);

        jmCHabitacion.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jmCHabitacion.setText("Cargar Habitación");
        jmCHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCHabitacionActionPerformed(evt);
            }
        });
        jMenu4.add(jmCHabitacion);

        jmCHabitacion2.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 24)); // NOI18N
        jmCHabitacion2.setText("Informacion Habitaciones");
        jmCHabitacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCHabitacion2ActionPerformed(evt);
            }
        });
        jMenu4.add(jmCHabitacion2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CargarCliente formulario = new CargarCliente();
        formulario.setVisible(true);
        escritorio.add(formulario);
        escritorio.moveToFront(formulario);
        formulario.getContentPane().setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmCargarthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCargarthActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CargarTipoHabitacion fHabitacion = new CargarTipoHabitacion();
        fHabitacion.setVisible(true);
        escritorio.add(fHabitacion);
        escritorio.moveToFront(fHabitacion);
        fHabitacion.getContentPane().setBackground(new Color(102, 102, 102));


    }//GEN-LAST:event_jmCargarthActionPerformed

    private void jmCHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCHabitacionActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        CargarHabitacion fTipoHabitacion = new CargarHabitacion();
        fTipoHabitacion.setVisible(true);
        escritorio.add(fTipoHabitacion);
        escritorio.moveToFront(fTipoHabitacion);
        fTipoHabitacion.getContentPane().setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_jmCHabitacionActionPerformed

    private void jmCHabitacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCHabitacion1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CargarReservas fReservas = new CargarReservas();
        fReservas.setVisible(true);
        escritorio.add(fReservas);
        escritorio.moveToFront(fReservas);
        fReservas.getContentPane().setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_jmCHabitacion1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        InfoReservas IReservas = new InfoReservas();
        IReservas.setVisible(true);
        escritorio.add(IReservas);
        escritorio.moveToFront(IReservas);
        IReservas.getContentPane().setBackground(new Color(102, 102, 102));

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmCHabitacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCHabitacion2ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        InfoHabitaciones habi = new InfoHabitaciones();
        habi.setVisible(true);
        escritorio.add(habi);
        escritorio.moveToFront(habi);
        habi.getContentPane().setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_jmCHabitacion2ActionPerformed

    private void jMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseEntered
        // TODO add your handling code here:
        Sonido("Reserva");

    }//GEN-LAST:event_jMenu1MouseEntered

    private void jMenu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseEntered
        // TODO add your handling code here:
        Sonido("Huesped");
    }//GEN-LAST:event_jMenu2MouseEntered

    private void jMenu4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseEntered
        // TODO add your handling code here:
        Sonido("Habitacion");
    }//GEN-LAST:event_jMenu4MouseEntered

    private void jMenu4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseExited
        // TODO add your handling code here:
        clip.stop();
    }//GEN-LAST:event_jMenu4MouseExited

    private void jMenu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseExited
        // TODO add your handling code here:
        clip.stop();
    }//GEN-LAST:event_jMenu2MouseExited

    private void jMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseExited
        // TODO add your handling code here:
        clip.stop();
    }//GEN-LAST:event_jMenu1MouseExited

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        InfoHuesped huesped = new InfoHuesped();
        huesped.setVisible(true);
        escritorio.add(huesped);
        escritorio.moveToFront(huesped);
        huesped.getContentPane().setBackground(new Color(102, 102, 102));
        
    }//GEN-LAST:event_jMenu2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmCHabitacion;
    private javax.swing.JMenuItem jmCHabitacion1;
    private javax.swing.JMenuItem jmCHabitacion2;
    private javax.swing.JMenuItem jmCargarth;
    // End of variables declaration//GEN-END:variables
}
