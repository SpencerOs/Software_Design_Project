package game;

import javax.swing.*;
import java.awt.*;

public class Tiles extends JButton {
    private static final long serialVersionUID=1;
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private Color color;
    private String label;
    private GridBagConstraints gridBagConstraints;
    public Tiles(int xPosi, int yPosi, int width2, int height2, Color color, String label)
    {
        this.height = height2;
        this.width = width2;
        this.xPosition = xPosi;
        this.yPosition = yPosi;
        this.color = color;
        this.setBackground(color);
        
        this.label = label;
        this.setText(label);
        
        this.setMargin(new Insets(10, 10, 10, 10));

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridwidth = width2;
        gridBagConstraints.gridheight = height2;
        gridBagConstraints.gridx = xPosi;
        gridBagConstraints.gridy = yPosi;
        gridBagConstraints.insets = new Insets(10,10,10,10);
    }
    
    public Color getColor()
    {
        return color;
    }

    public GridBagConstraints getConstraints()
    {
        return gridBagConstraints;
    }
    /*
    public void paint(Graphics g)
    {
        g.setColor(getColor());
        g.drawRect(xPosition, yPosition, height, width);
        //g.drawString("M",100,200);
    }
    */

};
