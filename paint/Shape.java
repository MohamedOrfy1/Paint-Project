
package com.mycompany.paint;


import java.awt.*;

public interface Shape extends Moveable,resize,Cloneable {
     void setPosition(Point position);
     Point getPosition();
     void setColor(Color color);
     Color getColor();
     void setFillColor(Color color);
     Color getFillColor();
     void draw(Graphics canvas);
}