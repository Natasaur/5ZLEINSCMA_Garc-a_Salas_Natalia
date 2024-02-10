/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jakeg
 */
import java.awt.Desktop;
import java.io.File;
import javax.swing.*;
import java.util.*;
import javax.swing.table.*;

public class DatosPruebaFrame extends JFrame {
    int numReporte,numMuestras;
    String modelo;
    double total;
    
    List<Fila> listaResultados;
    DefaultTableModel TablaMuestreo;
    DatosEncabezadoFrame NewDatosEncabezadoFrame = new DatosEncabezadoFrame();
    
    public DatosPruebaFrame() {
        setTitle("Registro de Datos");
        setLocationRelativeTo(null);
        initComponents();
        
        TablaMuestreo = (DefaultTableModel) TablaResultados.getModel();
        listaResultados = new ArrayList<>();
        
        //this.numReporte = numReporte;
        //this.numMuestras = numMuestras;
        //this.modelo = modelo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datosPanel = new javax.swing.JPanel();
        registroDatosLabel = new javax.swing.JLabel();
        puntosamedirLabel = new javax.swing.JLabel();
        stdLabel = new javax.swing.JLabel();
        tolLabel = new javax.swing.JLabel();
        valoresLabel = new javax.swing.JLabel();
        puntosamedirField = new javax.swing.JTextField();
        stdField = new javax.swing.JTextField();
        tolField = new javax.swing.JTextField();
        v1Field = new javax.swing.JTextField();
        v2Field = new javax.swing.JTextField();
        v3Field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultados = new javax.swing.JTable();
        v4Field = new javax.swing.JTextField();
        v5Field = new javax.swing.JTextField();
        v6Field = new javax.swing.JTextField();
        v7Field = new javax.swing.JTextField();
        v10Field = new javax.swing.JTextField();
        v9Field = new javax.swing.JTextField();
        v8Field = new javax.swing.JTextField();
        agregarfilaButton = new javax.swing.JButton();
        borrarButton = new javax.swing.JButton();
        regresarButton = new javax.swing.JButton();
        guardarTablaButton = new javax.swing.JButton();
        newModeloLabel = new javax.swing.JLabel();
        newReporteLabel = new javax.swing.JLabel();
        newMuestrasLabel = new javax.swing.JLabel();
        abrirPDF2Button = new javax.swing.JButton();
        modeloLabel = new javax.swing.JLabel();
        numReporteLabel = new javax.swing.JLabel();
        muestreoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registroDatosLabel.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        registroDatosLabel.setText("Registro de Datos");
        datosPanel.add(registroDatosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 240, 40));

        puntosamedirLabel.setText("Puntos a medir:");
        datosPanel.add(puntosamedirLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        stdLabel.setText("std:");
        datosPanel.add(stdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        tolLabel.setText("tol:");
        datosPanel.add(tolLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        valoresLabel.setText("Valores:");
        datosPanel.add(valoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));
        datosPanel.add(puntosamedirField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 150, -1));
        datosPanel.add(stdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 60, -1));
        datosPanel.add(tolField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 60, -1));
        datosPanel.add(v1Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 30, -1));
        datosPanel.add(v2Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 30, -1));
        datosPanel.add(v3Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 30, -1));

        TablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Puntos a Medir", "std", "tol", "", "", "", "", "", "", "", "", "", "", "Total"
            }
        ));
        jScrollPane1.setViewportView(TablaResultados);
        if (TablaResultados.getColumnModel().getColumnCount() > 0) {
            TablaResultados.getColumnModel().getColumn(0).setPreferredWidth(250);
            TablaResultados.getColumnModel().getColumn(13).setPreferredWidth(100);
        }

        datosPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 770, 310));
        datosPanel.add(v4Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 30, -1));
        datosPanel.add(v5Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 30, -1));
        datosPanel.add(v6Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 30, -1));
        datosPanel.add(v7Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 30, -1));
        datosPanel.add(v10Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 30, -1));
        datosPanel.add(v9Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 30, -1));
        datosPanel.add(v8Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 30, -1));

        agregarfilaButton.setText("Agregar Fila");
        agregarfilaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarfilaButtonActionPerformed(evt);
            }
        });
        datosPanel.add(agregarfilaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 120, 30));

        borrarButton.setText("Borrar");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });
        datosPanel.add(borrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 120, 30));

        regresarButton.setText("Regresar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        datosPanel.add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 120, 30));

        guardarTablaButton.setText("Guardar Tabla");
        guardarTablaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarTablaButtonActionPerformed(evt);
            }
        });
        datosPanel.add(guardarTablaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 120, 30));

        newModeloLabel.setText("jLabel1");
        datosPanel.add(newModeloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 180, -1));

        newReporteLabel.setText("jLabel1");
        datosPanel.add(newReporteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 90, -1));

        newMuestrasLabel.setText("jLabel1");
        datosPanel.add(newMuestrasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 80, -1));

        abrirPDF2Button.setText("Abrir PDF");
        abrirPDF2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirPDF2ButtonActionPerformed(evt);
            }
        });
        datosPanel.add(abrirPDF2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 120, 30));

        modeloLabel.setText("Modelo:");
        datosPanel.add(modeloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        numReporteLabel.setText("No. de Reporte:");
        datosPanel.add(numReporteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        muestreoLabel.setText("Muestreo de Prendas:");
        datosPanel.add(muestreoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(datosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(datosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarfilaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarfilaButtonActionPerformed
        Fila newFila = new Fila();
        newFila.setPuntoAMedir(puntosamedirField.getText());
        newFila.setStd(stdField.getText());
        newFila.setTol(tolField.getText());
        newFila.setV1(Double.parseDouble(v1Field.getText()));
        newFila.setV2(Double.parseDouble(v2Field.getText()));
        newFila.setV3(Double.parseDouble(v3Field.getText()));
        newFila.setV4(Double.parseDouble(v4Field.getText()));
        newFila.setV5(Double.parseDouble(v5Field.getText()));
        newFila.setV6(Double.parseDouble(v6Field.getText()));
        newFila.setV7(Double.parseDouble(v7Field.getText()));
        newFila.setV8(Double.parseDouble(v8Field.getText()));
        newFila.setV9(Double.parseDouble(v9Field.getText()));
        newFila.setV10(Double.parseDouble(v10Field.getText()));
        total = newFila.getV1()+newFila.getV2()+newFila.getV3()+newFila.getV4()
                +newFila.getV5()+newFila.getV6()+newFila.getV7()+newFila.getV8()
                +newFila.getV9()+newFila.getV10();
        newFila.setTotal(total);
        
        listaResultados.add(newFila);
        TablaMuestreo.addRow(new Object[] {newFila.getPuntoAMedir(),
            newFila.getStd(),newFila.getStd(),newFila.getV1(),newFila.getV2(),
            newFila.getV3(),newFila.getV4(),newFila.getV5(),newFila.getV6(),
            newFila.getV7(),newFila.getV8(),newFila.getV9(),newFila.getV10(),
            newFila.getTotal()});
        borrar();
    }//GEN-LAST:event_agregarfilaButtonActionPerformed

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
        borrar();
    }//GEN-LAST:event_borrarButtonActionPerformed

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        //Regresar
        NewDatosEncabezadoFrame.setVisible(true);
        NewDatosEncabezadoFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void guardarTablaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarTablaButtonActionPerformed
        //Genera un pdf con la tabla
        PlantillaPDF newPlantilla = new PlantillaPDF(
                modelo,
                new Date().toString(),
                numReporte,
                numMuestras,
                this.listaResultados);
        newPlantilla.crearPlantilla();
    }//GEN-LAST:event_guardarTablaButtonActionPerformed

    private void abrirPDF2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirPDF2ButtonActionPerformed
        abrir(modelo);
    }//GEN-LAST:event_abrirPDF2ButtonActionPerformed

    public void borrar(){
        puntosamedirField.setText("");
        stdField.setText("");
        tolField.setText("");
        v1Field.setText("");
        v2Field.setText("");
        v3Field.setText("");
        v4Field.setText("");
        v5Field.setText("");
        v6Field.setText("");
        v7Field.setText("");
        v8Field.setText("");
        v9Field.setText("");
        v10Field.setText("");
    }
    
    public void abrir(String modelo){
        try{
            File path = new File(modelo + ".pdf");
            Desktop.getDesktop().open(path);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex,"Error: ",2);
        }
    }
    
    public DatosPruebaFrame(int numReporte,int numMuestras,String modelo){
        this.numReporte = numReporte;
        this.numMuestras = numMuestras;
        this.modelo = modelo;
    }
    
    public int getNumReporte(){
        return numReporte;
    }
    public void setNumReporte(int numReporte){
        this.numReporte = numReporte;
        newReporteLabel.setText(numReporte+"");
    }
    
    public int getNumMuestras(){
        return numMuestras;
    }
    public void setNumMuestras(int numMuestras){
        this.numMuestras = numMuestras;
        newMuestrasLabel.setText(numMuestras+"");
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
        newModeloLabel.setText(modelo);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaResultados;
    private javax.swing.JButton abrirPDF2Button;
    private javax.swing.JButton agregarfilaButton;
    private javax.swing.JButton borrarButton;
    private javax.swing.JPanel datosPanel;
    private javax.swing.JButton guardarTablaButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel modeloLabel;
    private javax.swing.JLabel muestreoLabel;
    private javax.swing.JLabel newModeloLabel;
    private javax.swing.JLabel newMuestrasLabel;
    private javax.swing.JLabel newReporteLabel;
    private javax.swing.JLabel numReporteLabel;
    private javax.swing.JTextField puntosamedirField;
    private javax.swing.JLabel puntosamedirLabel;
    private javax.swing.JLabel registroDatosLabel;
    private javax.swing.JButton regresarButton;
    private javax.swing.JTextField stdField;
    private javax.swing.JLabel stdLabel;
    private javax.swing.JTextField tolField;
    private javax.swing.JLabel tolLabel;
    private javax.swing.JTextField v10Field;
    private javax.swing.JTextField v1Field;
    private javax.swing.JTextField v2Field;
    private javax.swing.JTextField v3Field;
    private javax.swing.JTextField v4Field;
    private javax.swing.JTextField v5Field;
    private javax.swing.JTextField v6Field;
    private javax.swing.JTextField v7Field;
    private javax.swing.JTextField v8Field;
    private javax.swing.JTextField v9Field;
    private javax.swing.JLabel valoresLabel;
    // End of variables declaration//GEN-END:variables
}
