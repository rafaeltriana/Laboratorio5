/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;

public class Interfaz extends javax.swing.JFrame {

    DefaultTableModel tabla1 = new DefaultTableModel();//Tabla 1 arriba
    DefaultTableModel tabla2 = new DefaultTableModel();//Tabla 2 abajo
    double totalA = 0.0, totalR = 0.0;

    public void LimpiarTabla() {
        tabla2.removeTableModelListener(TablaP);
        tabla1.removeTableModelListener(TablaN);
        TablaP.setModel(tabla2);
        TablaN.setModel(tabla1);

    }

    public void Limpiar() {
        Nnot.setText("");
        Nest.setText("");
        estudianted.setText("");

    }

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        tabla2.addColumn("Nombres");
        tabla2.addColumn("Definitiva");
        tabla2.addColumn("Resultado");
        TablaN.setModel(tabla1);
        TablaP.setModel(tabla2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaN = new javax.swing.JTable();
        Nest = new javax.swing.JTextField();
        Nnot = new javax.swing.JTextField();
        Historial = new javax.swing.JButton();
        CrearTabla = new javax.swing.JButton();
        estudianted = new javax.swing.JTextField();
        Porcentaje = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaP = new javax.swing.JTable();
        Definitivas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        definitivascsv = new javax.swing.JTextField();
        Exportar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        notascsv2 = new javax.swing.JTextField();
        Grafica = new javax.swing.JButton();
        Importar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Ingrese Numero de Estudiantes");

        jLabel2.setText("Ingrese Numero de Notas");

        TablaN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaNMouseClicked(evt);
            }
        });
        TablaN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablaNKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(TablaN);

        Nest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NestActionPerformed(evt);
            }
        });
        Nest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NestKeyReleased(evt);
            }
        });

        Nnot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NnotActionPerformed(evt);
            }
        });
        Nnot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NnotKeyReleased(evt);
            }
        });

        Historial.setBackground(new java.awt.Color(204, 255, 204));
        Historial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Historial.setText("Historial");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });

        CrearTabla.setBackground(new java.awt.Color(204, 255, 204));
        CrearTabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CrearTabla.setText("Crear T");
        CrearTabla.setPreferredSize(new java.awt.Dimension(197, 25));
        CrearTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearTablaActionPerformed(evt);
            }
        });

        estudianted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudiantedActionPerformed(evt);
            }
        });

        Porcentaje.setBackground(new java.awt.Color(255, 255, 255));
        Porcentaje.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Porcentaje.setText(" ");
        Porcentaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaP);

        Definitivas.setBackground(new java.awt.Color(204, 255, 204));
        Definitivas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Definitivas.setText("Definitivas");
        Definitivas.setPreferredSize(new java.awt.Dimension(197, 25));
        Definitivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefinitivasActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese Nombre del archivo ");
        jLabel3.setPreferredSize(new java.awt.Dimension(115, 14));

        definitivascsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                definitivascsvActionPerformed(evt);
            }
        });

        Exportar.setBackground(new java.awt.Color(204, 255, 204));
        Exportar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exportar.setText("exportar");
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese Nombre Definitivas");
        jLabel4.setPreferredSize(new java.awt.Dimension(115, 14));

        Grafica.setBackground(new java.awt.Color(204, 255, 204));
        Grafica.setText("Grafica");
        Grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficaActionPerformed(evt);
            }
        });

        Importar.setBackground(new java.awt.Color(204, 255, 204));
        Importar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Importar.setText("importar");
        Importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CrearTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(Definitivas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nest, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(Nnot))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Porcentaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estudianted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(Historial, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(Grafica, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notascsv2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(Importar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(definitivascsv, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Nest, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Nnot, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Definitivas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrearTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Historial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estudianted, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(Grafica, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notascsv2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(definitivascsv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Importar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearTablaActionPerformed
       tabla1 = new DefaultTableModel();
        tabla1.addColumn("Nombres");
        int columnas = Integer.parseInt(Nnot.getText());
        for (int i = 0; i < columnas; i++) {
            tabla1.addColumn("Nota " + (i + 1));
        }
        int filas = Integer.parseInt(Nest.getText());
        for (int i = 0; i < filas; i++) {
            tabla1.addRow(new Object[columnas]);
        }
        TablaN.setModel(tabla1);
    }//GEN-LAST:event_CrearTablaActionPerformed

    private void estudiantedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudiantedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estudiantedActionPerformed

    private void TablaNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaNMouseClicked

    }//GEN-LAST:event_TablaNMouseClicked

    private void TablaNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaNKeyPressed

    }//GEN-LAST:event_TablaNKeyPressed

    private void NestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NestKeyReleased

    }//GEN-LAST:event_NestKeyReleased

    private void NnotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NnotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NnotActionPerformed

    private void NnotKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NnotKeyReleased

    }//GEN-LAST:event_NnotKeyReleased

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        int j = 0;
        boolean esta = false;
        for (int i = 0; i < TablaN.getRowCount(); i++) {
            String t = TablaN.getValueAt(i, 0).toString();
            String tf = estudianted.getText();
            if (t.equals(tf)) {
                j = i;
                esta = true;
            }
        }
        if (esta) {
            DefaultCategoryDataset dts = new DefaultCategoryDataset();
            String s;
            for (int i = 1; i < TablaN.getColumnCount(); i++) {
                s = "Nota #" + Integer.toString(i);
                dts.addValue(Double.parseDouble(TablaN.getValueAt(j, i).toString()), "NOTAS", s);
            }
            JFreeChart ch = ChartFactory.createLineChart(TablaN.getValueAt(j, 0).toString(), "N° NOTA", "NOTA OBTENIDA", dts, PlotOrientation.VERTICAL, true, true, false);
            ChartPanel panel = new ChartPanel(ch);
            JFrame ventana = new JFrame("");
            ventana.setVisible(true);
            ventana.setSize(800, 600);
            ventana.add(panel);
        } else {
            JOptionPane.showMessageDialog(null, "El nombre ingresado no se encuentra."
                    + "\nIngrese un nombre diferente.");
        }

    }//GEN-LAST:event_HistorialActionPerformed

    private void DefinitivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefinitivasActionPerformed
        double Aprobo, Reprobo;
        totalA = 0;
        totalR = 0;
        double suma, NumeroN = TablaN.getColumnCount() - 1;
        String resultado, n;
        double[] promedio = new double[TablaN.getRowCount()];
        DefaultTableModel md;
        String data[][] = {};
        String cab[] = {"Nombre", "Definitiva", "Resultado"};
        md = new DefaultTableModel(data, cab);
        for (int j = 0; j < TablaN.getRowCount(); j++) {
            suma = 0;
            for (int i = 1; i < TablaN.getColumnCount(); i++) {
                suma += Double.parseDouble(TablaN.getValueAt(j, i).toString());
            }
            promedio[j] = suma / NumeroN;
            if (promedio[j] < 3) {
                resultado = "Reprobado";
                totalR++;
            } else {
                resultado = "Aprobado";
                totalA++;
            }
            n = TablaN.getValueAt(j, 0).toString();
            String datos[] = {n, Double.toString(promedio[j]), resultado};
            md.addRow(datos);
        }
        Aprobo = (totalA / TablaN.getRowCount()) * 100;
        Reprobo = (totalR / TablaN.getRowCount()) * 100;
        DecimalFormat df= new DecimalFormat("#.00");
        
        Porcentaje.setText( "Porcentaje de Aprobacion "+"  Aprobo: " + df.format(Aprobo) + "%.     Reprobo: " + df.format(Reprobo) + "%. ");
        TablaP.setModel(md);


    }//GEN-LAST:event_DefinitivasActionPerformed

    private void NestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NestActionPerformed

    private void definitivascsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_definitivascsvActionPerformed

    }//GEN-LAST:event_definitivascsvActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
        ArrayList<String[]> lista = new ArrayList<String[]>();
        for (int i = 0; i < TablaN.getRowCount(); i++) {
            String[] aux = new String[TablaN.getColumnCount()];
            for (int j = 0; j < TablaN.getColumnCount(); j++) {
                aux[j] = (String) TablaN.getValueAt(i, j);
            }
            lista.add(aux);
        }
        String nombre = definitivascsv.getText();
        Exportar(lista, ";", nombre + ".csv");
        ArrayList<String[]> lista2 = new ArrayList<String[]>();
        for (int i = 0; i < TablaP.getRowCount(); i++) {
            String[] aux = new String[TablaP.getColumnCount()];
            for (int j = 0; j < TablaP.getColumnCount(); j++) {
                aux[j] = (String) TablaP.getValueAt(i, j);
            }
            lista2.add(aux);
        }
        String nombre2 = notascsv2.getText();
        Exportar2(lista2, ";", nombre2 + ".csv");
    }//GEN-LAST:event_ExportarActionPerformed

    private void ImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportarActionPerformed
        Extraer(definitivascsv.getText());
        Extraer2(notascsv2.getText());
    }//GEN-LAST:event_ImportarActionPerformed

    private void GraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficaActionPerformed

    }//GEN-LAST:event_GraficaActionPerformed
    public void Extraer(String a) {

        File currentDirFile = new File(".");
        String path = System.getProperty("user.dir");
        Extraccion archivo = new Extraccion(path + "\\" + a + ".csv");
        try {
            List<Forma> lista = archivo.crearListado();
           tabla1 = new DefaultTableModel();
            tabla1.addColumn("Nombres");
            for (int i = 1; i < lista.get(0).Nota.size(); i++) {
               tabla1.addColumn("Nota " + i);
            }
            for (int i = 0; i < lista.size(); i++) {
                tabla1.addRow(lista.get(i).Nota.toArray());
            }

            TablaN.setModel(tabla1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Extraer2(String a) {

        File currentDirFile = new File(".");
        String path = System.getProperty("user.dir");
        Extraccion archivo = new Extraccion(path + "\\" + a + ".csv");
        try {
            List<Forma> lista = archivo.crearListado();
            tabla1 = new DefaultTableModel();
            tabla1.addColumn("Nombres");
            for (int i = 1; i < lista.get(0).Nota.size(); i++) {
                tabla1.addColumn("Nota " + i);
            }
            for (int i = 0; i < lista.size(); i++) {
                tabla1.addRow(lista.get(i).Nota.toArray());
            }

            TablaP.setModel(tabla1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Exportar(ArrayList<String[]> thingsToWrite, String separator, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String[] strings : thingsToWrite) {
                for (int i = 0; i < strings.length; i++) {
                    writer.append(strings[i]);
                    if (i < (strings.length - 1)) {
                        writer.append(separator);
                    }
                }
                writer.append(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Exportar2(ArrayList<String[]> thingsToWrite, String separator, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String[] strings : thingsToWrite) {
                for (int i = 0; i < strings.length; i++) {
                    writer.append(strings[i]);
                    if (i < (strings.length - 1)) {
                        writer.append(separator);
                    }
                }
                writer.append(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearTabla;
    private javax.swing.JButton Definitivas;
    private javax.swing.JButton Exportar;
    private javax.swing.JButton Grafica;
    private javax.swing.JButton Historial;
    private javax.swing.JButton Importar;
    private javax.swing.JTextField Nest;
    private javax.swing.JTextField Nnot;
    private javax.swing.JLabel Porcentaje;
    public javax.swing.JTable TablaN;
    private javax.swing.JTable TablaP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField definitivascsv;
    private javax.swing.JTextField estudianted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField notascsv2;
    // End of variables declaration//GEN-END:variables
}
