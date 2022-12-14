package com.mycompany.paint;

import java.awt.Graphics;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Paint_window extends javax.swing.JFrame {

    Graphics g;
    private CircleProp c = new CircleProp(this);
    private RectangleProp r = new RectangleProp(this);
    private LineProp l = new LineProp(this);
    private TriangleProp t = new TriangleProp(this);
    private Colorize cr;
    private int x1, x2, y1, y2;
    private Moveable selected;
    DrawingEngine de;
    protected Shape selectedShape;
    protected Implementation copyShape;
    Point resize;

    public Paint_window() {
        initComponents();
        myDrawingPanel1.addMouseListener(new Click());
        myDrawingPanel1.addMouseMotionListener(new Drag());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        myDrawingPanel1 = new com.mycompany.paint.myDrawingPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vector drawing application");

        jButton1.setText("Oval");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Rectangle");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Line Segment");
        jButton4.setActionCommand("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select shape");

        jButton5.setText("Colorize");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton7.setText("Triangle");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton3.setText("Copy");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        myDrawingPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout myDrawingPanel1Layout = new javax.swing.GroupLayout(myDrawingPanel1);
        myDrawingPanel1.setLayout(myDrawingPanel1Layout);
        myDrawingPanel1Layout.setHorizontalGroup(
            myDrawingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        myDrawingPanel1Layout.setVerticalGroup(
            myDrawingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Save as");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Load");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(27, 27, 27)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(myDrawingPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton7)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addContainerGap(117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myDrawingPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        r.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Shape[] shapes = myDrawingPanel1.getShapes();
        try {
            int index = jComboBox2.getSelectedIndex();
            Shape s = shapes[index];
            cr = new Colorize(this, s);
            this.setVisible(false);
            cr.setVisible(true);
            myDrawingPanel1.refresh();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No shapes are drawn!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Shape[] shapes = myDrawingPanel1.getShapes();
        try {
            int key = jComboBox2.getSelectedIndex();
            Shape selectedShape = shapes[key];
            String s = jComboBox2.getItemAt(key);
            String[] arr = s.split(" ");

            if ("Oval".equals(arr[0])) {
                CircleProp.CN = Integer.parseInt(arr[1]) - 1;
            } else if ("Line".equals(arr[0])) {
                LineProp.LN = Integer.parseInt(arr[1]) - 1;
            } else if ("Rectangle".equals(arr[0])) {
                RectangleProp.RN = Integer.parseInt(arr[1]) - 1;
            } else {
                TriangleProp.TN = Integer.parseInt(arr[1]) - 1;
            }

            jComboBox2.removeItemAt(key);

            myDrawingPanel1.removeShape(selectedShape);
            myDrawingPanel1.refresh();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No shapes are drawn!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
        t.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Shape[] shapes = myDrawingPanel1.getShapes();
        if (selectedShape != null && jComboBox2.getItemCount() != 0) {
            try {
                int key = jComboBox2.getSelectedIndex();
                Shape selectedShape = shapes[key];
                String s = jComboBox2.getItemAt(key);
                String[] arr = s.split(" ");

                if ("Oval".equals(arr[0])) {
                    CircleProp.CN++;
                } else if ("Line Segment".equals(arr[0])) {
                    LineProp.LN++;
                } else if ("Rectangle".equals(arr[0])) {
                    RectangleProp.RN++;
                } else {
                    TriangleProp.TN ++;
                }
                copyShape = (Implementation) ((Implementation) selectedShape).clone();

                copyShape.toString();
                myDrawingPanel1.addShape(copyShape);
                updateCombo(copyShape);
                myDrawingPanel1.refresh();

            } catch (CloneNotSupportedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(this);
        File f = fc.getSelectedFile();
        saveJSONFile(f);
        myDrawingPanel1.refresh();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (myDrawingPanel1.getShapes() != null) {
            for (Shape shape : myDrawingPanel1.getShapes()) {
                myDrawingPanel1.removeShape(shape);
            }
            jComboBox2.removeAllItems();
            myDrawingPanel1.refresh();
        }
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(this);
        File f = fc.getSelectedFile();
        loadJSONFile(f);
        myDrawingPanel1.refresh();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Paint_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paint_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paint_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paint_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paint_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private com.mycompany.paint.myDrawingPanel myDrawingPanel1;
    // End of variables declaration//GEN-END:variables

    public void addToCombo(String s) {
        jComboBox2.addItem(s);
    }

    public JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    public void setjComboBox2(JComboBox<String> jComboBox2) {
        this.jComboBox2 = jComboBox2;
    }

    public myDrawingPanel getPanel1() {
        return myDrawingPanel1;
    }

    public void setMyPanel1(myDrawingPanel myPanel1) {
        this.myDrawingPanel1 = myPanel1;
    }

    private void updateCombo(Shape shape) {
        jComboBox2.addItem(shape.toString());
    }

    private void saveJSONFile(File file) {
        JSONArray jsonShapes = new JSONArray();

        for (Shape shape : myDrawingPanel1.getShapes()) {
            JSONObject jsonObject = ((Implementation) shape).shapeToJson();
            jsonShapes.add(jsonObject);
        }
        try ( FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(jsonShapes.toJSONString());
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadJSONFile(File file) {
        System.out.println(file);
        JSONParser jsonShape = new JSONParser();
        try ( FileReader reader = new FileReader(file)) {
            //Read JSONFile
            Object object = jsonShape.parse(reader);
            JSONArray shapeList = (JSONArray) object;
            CircleProp.CN++;
            LineProp.LN++;
            TriangleProp.TN++;
            RectangleProp.RN++;

            shapeList.forEach(Shape -> {
                Shape shapeObject2 = Implementation.parseShapeObject2((JSONObject) Shape);
                myDrawingPanel1.addShape(shapeObject2);
                this.updateCombo(shapeObject2);
            });
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    private Shape searchShape(String Key) {
        Shape[] shapes = myDrawingPanel1.getShapes();
        for (Shape shap : shapes) {
            if (Key.equals(shap.toString())) {
                return shap;
            }

        }
        return null;
    }

    private class Click extends MouseAdapter {

        @Override
        public void mouseReleased(MouseEvent e) {
            resize = null;
        }

        @Override
        public void mousePressed(MouseEvent e) {
            selectedShape = null;
            myDrawingPanel1.setShape(null);
            for (Shape shape : myDrawingPanel1.getShapes()) {
                if (shape.contains(e.getPoint())) {
                    jComboBox2.setSelectedItem(shape.toString());
                    selectedShape = shape;
                    myDrawingPanel1.setShape(selectedShape);
                    selectedShape.setDraggingPoint(e.getPoint());
                }
            }
            myDrawingPanel1.refresh();
        }
    }

    private class Drag extends MouseMotionAdapter {

        @Override
        public void mouseDragged(MouseEvent e) {
            if (selectedShape == null) {
                return;
            }
            if (resize == null) {
                selectedShape.moveTo(e.getPoint());
                selectedShape.setDraggingPoint(e.getPoint());
                myDrawingPanel1.refresh();
            }
            for (Point point1 : selectedShape.getPoint()) {
                if (point1.distance(e.getPoint()) <= 10) {
                    resize = point1;
                }
            }
            Point selectedPoint = selectedShape.resize(resize, e.getPoint());
            if (selectedPoint != null) {
                resize = selectedPoint;
            }
            myDrawingPanel1.refresh();
        }
    }

}
