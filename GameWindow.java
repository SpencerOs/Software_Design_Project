/**
 * @author Kim Buckner
 * Date: Feb 01, 2017
 *
 * $Author$
 * $Date$
 * $Revision$
 *
 * This is the actual "game". May/will have to make some major changes.
 * This is just a "hollow" shell.
 *
 * When you get done, I should see the buttons at the top in the "play" area
 * (not a pull-down menu). The only one that should do anything is Quit.
 *
 * Should also see something that shows where the 4x4 board and the "spare"
 * tiles will be when we get them stuffed in.
 */
package game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame implements ActionListener
  {
    /**
     * because it is a serializable object, need this or javac
     * complains a lot
     */
    public static final long serialVersionUID=1;
    private JButton newGameButton = game.Main.lbutton;
    private JButton resetButton = game.Main.mbutton;
    private JButton quitButton = game.Main.rbutton;
    /*
     * Here I declare some buttons and declare an array to hold the grid elements. 
     * But, you can do what you want.
     */
    private int startAt=1;
    
    /**
     * Constructor sets the window name using super(), changes the layout,
     * which you really need to read up on, and maybe you can see why I chose
     * this one.
     *
     * @param s
     */

    public GameWindow(String s)
    {
      super(s);
      GridBagLayout gbl=new GridBagLayout();
      setLayout(gbl);
    }

    /**
     * For the buttons
     * @param e is the ActionEvent
     * 
     * BTW can ask the event for the name of the object generating event.
     * The odd syntax for non-java people is that "exit" for instance is
     * converted to a String object, then that object's equals() method is
     * called.
     */

    public void actionPerformed(ActionEvent e) {
      if("exit".equals(e.getActionCommand()))
        System.exit(0);
      if("reset".equals(e.getActionCommand()))
        System.out.println("reset pressed\n");
      if("new".equals(e.getActionCommand()))
        System.out.println("new pressed\n");
      }

    /**
     *  Establishes the initial board
     */

    public void setUp()
    {
      //actually create the array for elements, make sure it is big enough
      
      // Need to play around with the dimensions and the gridx/y values
      // These constraints are going to be added to the pieces/parts I 
      // stuff into the "GridBag".
      GridBagConstraints basic = new GridBagConstraints();
      basic.gridx=startAt;
      basic.gridy=0;
      basic.gridwidth=1;
      basic.gridheight=1;
      basic.fill=GridBagConstraints.BOTH;

      //Here I create 16 elements to put into my gameBoard
      Tiles tile00 = new Tiles(0,1,1,1,Color.lightGray, "00");
      Tiles tile01 = new Tiles(0,2,1,1,Color.lightGray, "01");
      Tiles tile02 = new Tiles(0,3,1,1,Color.lightGray, "02");
      Tiles tile03 = new Tiles(0,4,1,1,Color.lightGray, "03");
      Tiles tile04 = new Tiles(0,5,1,1,Color.lightGray, "04");
      Tiles tile05 = new Tiles(0,6,1,1,Color.lightGray, "05");
      Tiles tile06 = new Tiles(0,7,1,1,Color.lightGray, "06");
      Tiles tile07 = new Tiles(0,8,1,1,Color.lightGray, "07");
      
      Tiles tile08 = new Tiles(2,1,1,1,Color.lightGray, "08");
      Tiles tile09 = new Tiles(2,2,1,1,Color.lightGray, "09");
      Tiles tile10 = new Tiles(2,3,1,1,Color.lightGray, "10");
      Tiles tile11 = new Tiles(2,4,1,1,Color.lightGray, "11");
      Tiles tile12 = new Tiles(2,5,1,1,Color.lightGray, "12");
      Tiles tile13 = new Tiles(2,6,1,1,Color.lightGray, "13");
      Tiles tile14 = new Tiles(2,7,1,1,Color.lightGray, "14");
      Tiles tile15 = new Tiles(2,8,1,1,Color.lightGray, "15");
      

      // Now I add each one, modifying the default gridx/y and add
      // it along with the modified constraint
      
      // Top bar
      
      JButton button;
      /*
      button = new JButton("Button 1");
      basic.fill = GridBagConstraints.BOTH;
      basic.weightx = 1;
      basic.gridwidth = 3;
      basic.gridx = 0;
      basic.gridy = 0;
      basic.ipady = 10;
      this.add(button, basic);
      */
      // Left sidebar Tiles
      this.add(tile00, tile00.getConstraints());
      this.add(tile01, tile01.getConstraints());
      this.add(tile02, tile02.getConstraints());
      this.add(tile03, tile03.getConstraints());
      this.add(tile04, tile04.getConstraints());
      this.add(tile05, tile05.getConstraints());
      this.add(tile06, tile06.getConstraints());
      this.add(tile07, tile07.getConstraints());

      // Game board should go here
      /*
      button = new JButton("Button 3");
      basic.fill = GridBagConstraints.BOTH;
      basic.weightx = 2;
      basic.gridwidth = 1;
      basic.gridheight = 8;
      basic.gridx = 1;
      basic.gridy = 1;
      this.add(button, basic);
      */

      // Right sidebar Tiles
      this.add(tile08, tile08.getConstraints());
      this.add(tile09, tile09.getConstraints());
      this.add(tile10, tile10.getConstraints());
      this.add(tile11, tile11.getConstraints());
      this.add(tile12, tile12.getConstraints());
      this.add(tile13, tile13.getConstraints());
      this.add(tile14, tile14.getConstraints());
      this.add(tile15, tile15.getConstraints());
      

      this.addButtons();
      return;
      
      
    }
    /**
     * Used by setUp() to configure the buttons on a button bar and
     * add it to the gameBoard
     */

    public void addButtons(){
      newGameButton= new JButton("New Game");
      this.add(newGameButton);
      resetButton = new JButton("Reset");
      this.add(resetButton);
      quitButton = new JButton("Quit");
      this.add(quitButton);
      quitButton.setActionCommand("exit");
      quitButton.addActionListener(this);
      return;
    }
    
    
  };
