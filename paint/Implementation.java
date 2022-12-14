
package com.mycompany.paint;

import org.json.simple.JSONObject;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


abstract public class Implementation implements Shape,resize{
    private Point position;
    private Color color;
    private Color fillColor;

    private Point draggingPoint;
    
   public Implementation(Point position){
    setPosition(position);
    }
    @Override
    public void setPosition(Point position) {this.position = position;}

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setColor(Color color) {
        this.color=color;
    }
    @Override
    public Color getColor() {
        if (color==null)
            return Color.black;
        return color;
    }
    @Override
    public void setFillColor(Color color) {this.fillColor=color;}

    @Override
    public Color getFillColor() {
        return fillColor;

    }

    @Override
    public void setDraggingPoint(Point point) {
        draggingPoint=point;
    }

    @Override
    public Point getDraggingPoint() {
        return draggingPoint;
    }

    @Override
   public Object clone() throws CloneNotSupportedException {
       
        Implementation clone= (Implementation) super.clone();
        
        return clone;
    }

    @Override
    public abstract Point[] getPoint();
    public void parseShapeObject(JSONObject jsonObject)
    {
        Point position  = new Point();
        position.x = ((Long) jsonObject.get("positionx")).intValue();
        position.y = ((Long) jsonObject.get("positiony")).intValue();
        this.position = position;
        if(jsonObject.get("colorR") != null && jsonObject.get("colorG") != null && jsonObject.get("colorB")!= null) {

            this.color = new Color(((Long) jsonObject.get("colorR")).intValue(), ((Long) jsonObject.get("colorG")).intValue(), ((Long) jsonObject.get("colorB")).intValue());
        }
        if(jsonObject.get("fillColorR") != null && jsonObject.get("fillColorG") != null && jsonObject.get("fillColorB")!= null) {
    
            this.fillColor = new Color(((Long) jsonObject.get("fillColorR")).intValue(), ((Long) jsonObject.get("fillColorG")).intValue(), ((Long) jsonObject.get("fillColorB")).intValue());
        }

    }
        public static Shape parseShapeObject2(JSONObject shapeJson)
    {

        String type = (String) shapeJson.get("type");
        try {
            Class shapeClass =  Class.forName(type);

            Constructor<Shape> constructor = shapeClass.getConstructor();
            Shape shape =  constructor.newInstance();

            ((Implementation) shape).parseShapeObject(shapeJson);

            return shape;
        } catch (ClassNotFoundException | InvocationTargetException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

        public  JSONObject shapeToJson()
        {
            JSONObject shape = new JSONObject();
            shape.put("positionx",this.position.x);
            shape.put("positiony",this.position.y);
            shape.put("type",this.getClass().getName());
            if(this.color != null) {
                shape.put("colorR", this.color.getRed());
                shape.put("colorG", this.color.getGreen());
                shape.put("colorB", this.color.getBlue());
            }
            if(this.fillColor != null) {
                shape.put("fillColorR", this.fillColor.getRed());
                shape.put("fillColorG", this.fillColor.getGreen());
                shape.put("fillColorB", this.fillColor.getBlue());
            }
            return shape;
        }
}
     
     
 
