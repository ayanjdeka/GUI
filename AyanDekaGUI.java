import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.swing.border.LineBorder;
import java.awt.Dimension;

public class AyanDekaGUI extends JPanel implements ActionListener {

    JFrame frame;

    JPanel panel;
    JScrollPane secondPanel;

    JPanel buttonPanel;
    JMenuBar menuBar;

    JTextArea textArea;

	JButton north;
	JButton south;
	JButton east;
	JButton west;
	JButton reset;

	JMenu font;
	JMenu textColor;
	JMenu backGroundColor;
	JMenu fontSize;
	JMenu outlineColor;

	JMenuItem algerian;
	JMenuItem segoeScript;
	JMenuItem courierNew;

	JMenuItem sizeTwelve;
	JMenuItem sizeThirteen;
	JMenuItem sizeFourteen;

	JMenuItem textRed;
	JMenuItem textWhite;
	JMenuItem textRandom;


	JMenuItem backGroundRed;
	JMenuItem backGroundBlue;
	JMenuItem backGroundRandom;
	JMenuItem backGroundNone;


	JMenuItem outLineRed;
	JMenuItem outLineBlue;
	JMenuItem outLineRandom;
	JMenuItem outLineNone;


	Font defaultFont = new Font("Dialog", Font.BOLD, 12);

    public AyanDekaGUI() {
        frame = new JFrame("GUI Task");




        panel = new JPanel();
        //secondPanel = new JPanel();
        buttonPanel = new JPanel();
        menuBar = new JMenuBar();
        north = new JButton("North");
        north.addActionListener(this);
        south = new JButton("South");
        south.addActionListener(this);
        east = new JButton("East");
        east.addActionListener(this);
        west = new JButton("West");
        west.addActionListener(this);
        reset = new JButton("Reset");
        reset.addActionListener(this);
        font = new JMenu("Font");
        textColor = new JMenu("Text Color");
        backGroundColor = new JMenu("BG Color");
        fontSize = new JMenu("Font Size");
        outlineColor = new JMenu("Outline Color");



        algerian = new JMenuItem("Algerian");
        algerian.addActionListener(this);
        algerian.setFont(new Font ("Algerian", Font.BOLD, 12));

        segoeScript = new JMenuItem("Segoe Script");
        segoeScript.addActionListener(this);
        segoeScript.setFont(new Font("Segoe Script",Font.BOLD,12));

        courierNew = new JMenuItem("Courier New");
        courierNew.addActionListener(this);
        courierNew.setFont(new Font ("Courier New", Font.BOLD, 12));

        textRed = new JMenuItem("Red");
        textRed.addActionListener(this);
        textWhite = new JMenuItem("White");
        textWhite.addActionListener(this);
        textRandom = new JMenuItem("Random");
        textRandom.addActionListener(this);

        sizeTwelve = new JMenuItem("Size 12");
        sizeTwelve.addActionListener(this);
        sizeThirteen = new JMenuItem("Size 13");
        sizeThirteen.addActionListener(this);
        sizeFourteen = new JMenuItem("Size 14");
        sizeFourteen.addActionListener(this);

        backGroundRed = new JMenuItem("Red");
        backGroundRed.addActionListener(this);
        backGroundBlue = new JMenuItem("Blue");
        backGroundBlue.addActionListener(this);
        backGroundRandom = new JMenuItem("Random");
        backGroundRandom.addActionListener(this);
        backGroundNone = new JMenuItem("None");
        backGroundNone.addActionListener(this);


        outLineRed = new JMenuItem("Red");
        outLineRed.addActionListener(this);
        outLineBlue = new JMenuItem("Blue");
        outLineBlue.addActionListener(this);
        outLineRandom = new JMenuItem("Random");
        outLineRandom.addActionListener(this);

        outLineNone = new JMenuItem("None");
        outLineNone.addActionListener(this);




        font.add(algerian);
        font.add(segoeScript);
        font.add(courierNew);

        textColor.add(textRed);
        textColor.add(textWhite);
        textColor.add(textRandom);


        backGroundColor.add(backGroundRed);
        backGroundColor.add(backGroundBlue);
        backGroundColor.add(backGroundRandom);
        backGroundColor.add(backGroundNone);




        outlineColor.add(outLineRed);
        outlineColor.add(outLineBlue);
        outlineColor.add(outLineRandom);
        outlineColor.add(outLineNone);


        fontSize.add(sizeTwelve);
        fontSize.add(sizeThirteen);
        fontSize.add(sizeFourteen);


        textArea = new JTextArea(40,70);
        secondPanel = new JScrollPane(textArea);

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        panel.setLayout(new GridLayout(1, 2));
        buttonPanel.setLayout(new GridLayout(1, 4));

        buttonPanel.add(north);
        buttonPanel.add(south);
        buttonPanel.add(east);
        buttonPanel.add(west);

        menuBar.add(font);
        menuBar.add(fontSize);
        menuBar.add(textColor);
        menuBar.add(backGroundColor);
       	menuBar.add(outlineColor);
       	menuBar.add(reset);

        panel.add(buttonPanel);
        panel.add(menuBar);

        Dimension scrollerSize = new Dimension(880, 730);
		secondPanel.setPreferredSize(scrollerSize);
		secondPanel.setMinimumSize(scrollerSize);
		secondPanel.setMaximumSize(scrollerSize);




        frame.add(panel, BorderLayout.NORTH);
        frame.add(secondPanel,BorderLayout.SOUTH);
        frame.setVisible(true);






        frame.setSize(1000, 800);
		frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        new AyanDekaGUI();
    }

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == south){
        	panel.setLayout(new GridLayout(1, 2));
        	buttonPanel.setLayout(new GridLayout(1, 2));
        	menuBar.setLayout(new GridLayout(1, 6));
        	frame.add(panel, BorderLayout.SOUTH);
        	frame.add(secondPanel,BorderLayout.NORTH);
        	frame.revalidate();
		}
		if(e.getSource()==north){
        	panel.setLayout(new GridLayout(1, 2));
        	buttonPanel.setLayout(new GridLayout(1, 2));
        	menuBar.setLayout(new GridLayout(1, 6));
        	frame.add(panel, BorderLayout.NORTH);
        	frame.add(secondPanel,BorderLayout.SOUTH);
        	frame.revalidate();
		}
		if(e.getSource() == east){
        	panel.setLayout(new GridLayout(2, 1));
        	buttonPanel.setLayout(new GridLayout(4, 1));
        	menuBar.setLayout(new GridLayout(6, 1));
        	frame.add(panel, BorderLayout.EAST);
        	frame.add(secondPanel,BorderLayout.WEST);
        	frame.revalidate();

		}

		if(e.getSource() == west){
        	panel.setLayout(new GridLayout(2, 1));
        	buttonPanel.setLayout(new GridLayout(4, 1));
        	menuBar.setLayout(new GridLayout(6, 1));
        	frame.add(panel, BorderLayout.WEST);
        	frame.add(secondPanel,BorderLayout.EAST);

        	frame.revalidate();

		}

		if(e.getSource() == outLineRed){
			north.setBorder(new LineBorder(Color.RED));
			south.setBorder(new LineBorder(Color.RED));
			west.setBorder(new LineBorder(Color.RED));
			east.setBorder(new LineBorder(Color.RED));
			reset.setBorder(new LineBorder(Color.RED));
		}

		if(e.getSource() == outLineBlue){
			north.setBorder(new LineBorder(Color.BLUE));
			south.setBorder(new LineBorder(Color.BLUE));
			west.setBorder(new LineBorder(Color.BLUE));
			east.setBorder(new LineBorder(Color.BLUE));
			reset.setBorder(new LineBorder(Color.BLUE));
		}

		if(e.getSource() == outLineRandom){
			int r = (int)(Math.random() * 255);
			int g = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);

			Color col = new Color(r, g, b);

			north.setBorder(new LineBorder(col));
			south.setBorder(new LineBorder(col));
			west.setBorder(new LineBorder(col));
			east.setBorder(new LineBorder(col));
			reset.setBorder(new LineBorder(col));
		}

		if(e.getSource() == outLineNone){
			north.setBorder(new LineBorder(null));
			south.setBorder(new LineBorder(null));
			west.setBorder(new LineBorder(null));
			east.setBorder(new LineBorder(null));
			reset.setBorder(new LineBorder(null));
		}

		if(e.getSource() == backGroundRed){
			textArea.setBackground(Color.RED);
		}

		if(e.getSource() == backGroundBlue){
			textArea.setBackground(Color.BLUE);
		}

		if(e.getSource() == backGroundNone){
			textArea.setBackground(null);
		}

		if(e.getSource() == backGroundRandom){

			int r = (int)(Math.random() * 255);
			int g = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);

			Color col = new Color(r, g, b);
			textArea.setBackground(col);
		}

		if(e.getSource() == textRed){
			textArea.setForeground(Color.RED);
		}

		if(e.getSource() == textWhite){
			textArea.setForeground(Color.WHITE);
		}

		if(e.getSource() == textRandom){

			int r = (int)(Math.random() * 255);
			int g = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);

			Color col = new Color(r, g, b);
			textArea.setForeground(col);
		}

		if(e.getSource() == segoeScript){


			textArea.setFont(new Font("Segoe Script",Font.PLAIN,textArea.getFont().getSize()));

			textArea.setLineWrap (true);
			textArea.setWrapStyleWord (true);

			north.setFont(new Font("Segoe Script",Font.BOLD,12));
			south.setFont(new Font("Segoe Script",Font.BOLD,12));
			east.setFont(new Font("Segoe Script",Font.BOLD,12));
			west.setFont(new Font("Segoe Script",Font.BOLD,12));
			reset.setFont(new Font("Segoe Script",Font.BOLD,12));

			textWhite.setFont(new Font("Segoe Script",Font.BOLD,12));
			textRed.setFont(new Font("Segoe Script",Font.BOLD,12));
			textRandom.setFont(new Font("Segoe Script",Font.BOLD,12));
			textColor.setFont(new Font("Segoe Script",Font.BOLD,12));

			outlineColor.setFont(new Font("Segoe Script",Font.BOLD,12));
			outLineRed.setFont(new Font("Segoe Script",Font.BOLD,12));
			outLineBlue.setFont(new Font("Segoe Script",Font.BOLD,12));
			outLineRandom.setFont(new Font("Segoe Script",Font.BOLD,12));
			outLineNone.setFont(new Font("Segoe Script",Font.BOLD,12));

			backGroundColor.setFont(new Font("Segoe Script",Font.BOLD,12));
			backGroundRed.setFont(new Font("Segoe Script",Font.BOLD,12));
			backGroundBlue.setFont(new Font("Segoe Script",Font.BOLD,12));
			backGroundRandom.setFont(new Font("Segoe Script",Font.BOLD,12));
			backGroundNone.setFont(new Font("Segoe Script",Font.BOLD,12));

			fontSize.setFont(new Font("Segoe Script",Font.BOLD,12));
			sizeTwelve.setFont(new Font("Segoe Script",Font.BOLD,12));
			sizeThirteen.setFont(new Font("Segoe Script",Font.BOLD,12));
			sizeFourteen.setFont(new Font("Segoe Script",Font.BOLD,12));

			font.setFont(new Font("Segoe Script",Font.BOLD,12));

		}

		if(e.getSource() == algerian){


			textArea.setFont(new Font("Algerian",Font.PLAIN,textArea.getFont().getSize()));
			textArea.setLineWrap (true);
			textArea.setWrapStyleWord (true);

			north.setFont(new Font("Algerian",Font.BOLD,12));
			south.setFont(new Font("Algerian",Font.BOLD,12));
			east.setFont(new Font("Algerian",Font.BOLD,12));
			west.setFont(new Font("Algerian",Font.BOLD,12));
			reset.setFont(new Font("Algerian",Font.BOLD,12));

			textWhite.setFont(new Font("Algerian",Font.BOLD,12));
			textRed.setFont(new Font("Algerian",Font.BOLD,12));
			textRandom.setFont(new Font("Algerian",Font.BOLD,12));
			textColor.setFont(new Font("Algerian",Font.BOLD,12));

			outlineColor.setFont(new Font("Algerian",Font.BOLD,12));
			outLineRed.setFont(new Font("Algerian",Font.BOLD,12));
			outLineBlue.setFont(new Font("Algerian",Font.BOLD,12));
			outLineRandom.setFont(new Font("Algerian",Font.BOLD,12));
			outLineNone.setFont(new Font("Algerian",Font.BOLD,12));

			backGroundColor.setFont(new Font("Algerian",Font.BOLD,12));
			backGroundRed.setFont(new Font("Algerian",Font.BOLD,12));
			backGroundBlue.setFont(new Font("Algerian",Font.BOLD,12));
			backGroundRandom.setFont(new Font("Algerian",Font.BOLD,12));
			backGroundNone.setFont(new Font("Algerian",Font.BOLD,12));


			fontSize.setFont(new Font("Algerian",Font.BOLD,12));
			sizeTwelve.setFont(new Font("Algerian",Font.BOLD,12));
			sizeThirteen.setFont(new Font("Algerian",Font.BOLD,12));
			sizeFourteen.setFont(new Font("Algerian",Font.BOLD,12));

			font.setFont(new Font("Algerian",Font.BOLD,12));

		}

		if(e.getSource() == courierNew){


			textArea.setFont(new Font("Courier New",Font.PLAIN,textArea.getFont().getSize()));

			north.setFont(new Font("Courier New",Font.BOLD,12));
			south.setFont(new Font("Courier New",Font.BOLD,12));
			east.setFont(new Font("Courier New",Font.BOLD,12));
			west.setFont(new Font("Courier New",Font.BOLD,12));
			reset.setFont(new Font("Courier New",Font.BOLD,12));

			textWhite.setFont(new Font("Courier New",Font.BOLD,12));
			textRed.setFont(new Font("Courier New",Font.BOLD,12));
			textRandom.setFont(new Font("Courier New",Font.BOLD,12));
			textColor.setFont(new Font("Courier New",Font.BOLD,12));

			outlineColor.setFont(new Font("Courier New",Font.BOLD,12));
			outLineRed.setFont(new Font("Courier New",Font.BOLD,12));
			outLineBlue.setFont(new Font("Courier New",Font.BOLD,12));
			outLineRandom.setFont(new Font("Courier New",Font.BOLD,12));
			outLineNone.setFont(new Font("Courier New",Font.BOLD,12));

			backGroundColor.setFont(new Font("Courier New",Font.BOLD,12));
			backGroundRed.setFont(new Font("Courier New",Font.BOLD,12));
			backGroundBlue.setFont(new Font("Courier New",Font.BOLD,12));
			backGroundRandom.setFont(new Font("Courier New",Font.BOLD,12));
			backGroundNone.setFont(new Font("Courier New",Font.BOLD,12));

			fontSize.setFont(new Font("Courier New",Font.BOLD,12));
			sizeTwelve.setFont(new Font("Courier New",Font.BOLD,12));
			sizeThirteen.setFont(new Font("Courier New",Font.BOLD,12));
			sizeFourteen.setFont(new Font("Courier New",Font.BOLD,12));

			font.setFont(new Font("Courier New",Font.BOLD,12));

		}

		if(e.getSource() == sizeThirteen){

			textArea.setFont(new Font(textArea.getFont().getFontName(),textArea.getFont().getStyle(),13));

		}

		if(e.getSource() == sizeTwelve){

			textArea.setFont(new Font(textArea.getFont().getFontName(),textArea.getFont().getStyle(),12));

		}

		if(e.getSource() == sizeFourteen){

			textArea.setFont(new Font(textArea.getFont().getFontName(),textArea.getFont().getStyle(),14));

		}

		if(e.getSource() == reset){

        	panel.setLayout(new GridLayout(1, 2));
        	buttonPanel.setLayout(new GridLayout(1, 2));
        	menuBar.setLayout(new GridLayout(1, 6));
        	frame.add(panel, BorderLayout.NORTH);
        	frame.add(secondPanel,BorderLayout.SOUTH);
        	frame.revalidate();

			textArea.setFont(new Font("Dialog",Font.PLAIN,12));

			north.setFont(new Font("Dialog",Font.BOLD,12));
			south.setFont(new Font("Dialog",Font.BOLD,12));
			east.setFont(new Font("Dialog",Font.BOLD,12));
			west.setFont(new Font("Dialog",Font.BOLD,12));
			reset.setFont(new Font("Dialog",Font.BOLD,12));

			textWhite.setFont(new Font("Dialog",Font.BOLD,12));
			textRed.setFont(new Font("Dialog",Font.BOLD,12));
			textRandom.setFont(new Font("Dialog",Font.BOLD,12));
			textColor.setFont(new Font("Dialog",Font.BOLD,12));

			outlineColor.setFont(new Font("Dialog",Font.BOLD,12));
			outLineRed.setFont(new Font("Dialog",Font.BOLD,12));
			outLineBlue.setFont(new Font("Dialog",Font.BOLD,12));
			outLineRandom.setFont(new Font("Dialog",Font.BOLD,12));
			outLineNone.setFont(new Font("Dialog",Font.BOLD,12));

			backGroundColor.setFont(new Font("Dialog",Font.BOLD,12));
			backGroundRed.setFont(new Font("Dialog",Font.BOLD,12));
			backGroundBlue.setFont(new Font("Dialog",Font.BOLD,12));
			backGroundRandom.setFont(new Font("Dialog",Font.BOLD,12));
			backGroundNone.setFont(new Font("Dialog",Font.BOLD,12));

			fontSize.setFont(new Font("Dialog",Font.BOLD,12));
			sizeTwelve.setFont(new Font("Dialog",Font.BOLD,12));
			sizeThirteen.setFont(new Font("Dialog",Font.BOLD,12));
			sizeFourteen.setFont(new Font("Dialog",Font.BOLD,12));

			font.setFont(new Font("Dialog",Font.BOLD,12));

			textArea.setForeground(Color.BLACK);
			textArea.setBackground(null);

			north.setBorder(new LineBorder(null));
			south.setBorder(new LineBorder(null));
			west.setBorder(new LineBorder(null));
			east.setBorder(new LineBorder(null));
			reset.setBorder(new LineBorder(null));


		}



	}



}