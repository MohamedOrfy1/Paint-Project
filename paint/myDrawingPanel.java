
package com.mycompany.paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JPanel;


public class myDrawingPanel extends JPanel implements DrawingEngine{
    private  Shape selctedShape;
    private  ArrayList<Implementation> shapes=new ArrayList<>();
    @Override
    public void addShape(com.mycompany.paint.Shape shape) {
        shapes.add((Implementation) shape);
    }

    @Override
    public void removeShape(com.mycompany.paint.Shape shape) {
       
        shapes.remove(shape);
    }

    @Override
    public com.mycompany.paint.Shape[] getShapes() {
        return shapes.toArray(new Shape[0]);
    }
    public void setShape(Shape shape)
    {
        this.selctedShape=shape;
    }


        @Override
        public void paintComponent (Graphics graphics)
        {
            super.paintComponent(graphics);
            for(Shape s:shapes)
            {
                s.draw(graphics);
            }

            if (selctedShape!=null){
                for (Point point:selctedShape.getPoint()) {
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(point.x-5,point.y-5,10,10);
            }


            }
        }
    @Override
    public void refresh(Graphics canvas) {}

    public void refresh() {
            this.repaint();
        }

}  
    

