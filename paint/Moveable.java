
package com.mycompany.paint;


public interface Moveable {
    
     public void setDraggingPoint(java.awt.Point point);
     
     public java.awt.Point getDraggingPoint();
     
     public boolean contains(java.awt.Point point);
     
     public void moveTo(java.awt.Point point);

    
}
