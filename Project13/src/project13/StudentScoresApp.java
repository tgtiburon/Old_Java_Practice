package project13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.lang.Math;

public class StudentScoresApp
{
    public static void main(String[] args)
    {
        JFrame frame = new StudentScoresFrame();
        frame.setVisible(true);
    }
}

class StudentScoresFrame extends JFrame
{
    public StudentScoresFrame()
    {
        setTitle("Test Scores");
        centerWindow(this);
        setSize(250, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new StudentScoresPanel();
        this.add(panel);
    }

    private void centerWindow(Window w)
    {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width-w.getWidth())/2, (d.height-w.getHeight())/2);
    }
}

class StudentScoresPanel extends JPanel implements ActionListener
{
    private JTextField  scoreTextField,
                        countTextField,
                        averageTextField,
                        bestTextField;
    private JLabel      scoreLabel,
                        countLabel,
                        averageLabel,
                        bestLabel;
    private JButton     enterScoreButton,
    					clearButton; //,
                       // exitButton;

	private int count = 0;					// the number of scores entered

	private double total = 0;		 		// the total of all scores (not displayed)

											// total is a double to prevent truncation when
											// calculating the average
	private double average = 0;				// the average score
	private int best = 0;					// the highest score entered

    public StudentScoresPanel()
    {
        // display panel
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // score label
        scoreLabel = new JLabel("Test score:");
        displayPanel.add(scoreLabel);

        // score text field
        scoreTextField = new JTextField(10);
        displayPanel.add(scoreTextField);

        // count label
        countLabel = new JLabel("Number of scores:");
        displayPanel.add(countLabel);

        // count text field
        countTextField = new JTextField(10);
        countTextField.setEditable(false);
        countTextField.setFocusable(false);
        displayPanel.add(countTextField);

        // average label
        averageLabel = new JLabel("Average score:");
        displayPanel.add(averageLabel);

        // average text field
        averageTextField = new JTextField(10);
        averageTextField.setEditable(false);
        averageTextField.setFocusable(false);
        displayPanel.add(averageTextField);

        // best label
        bestLabel = new JLabel("Best score:");
        displayPanel.add(bestLabel);

        // best text field
        bestTextField = new JTextField(10);
        bestTextField.setEditable(false);
        bestTextField.setFocusable(false);
        displayPanel.add(bestTextField);

        // button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // enter score button
        enterScoreButton = new JButton("Enter Score");
        enterScoreButton.addActionListener(this);
        buttonPanel.add(enterScoreButton);

        // clear button
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);



        // add panels to main panel
        this.setLayout(new BorderLayout());
        this.add(displayPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();									// EXIT BUTTON
    
       
           if (source == enterScoreButton)
            // ENTER SCORE BUTTON
        {
            int score = Integer.parseInt(scoreTextField.getText());		// parse the score

            total += score;												// calculate the results
            count++;
            average = total / count;
            if (score > best)
            	best = score;

            NumberFormat nf = NumberFormat.getNumberInstance();
            countTextField.setText(nf.format(count));					// display the results
            averageTextField.setText(nf.format(average));
            bestTextField.setText(nf.format(best));
        }
        else if (source == clearButton)									// CLEAR BUTTON
        {
			count = 0;
			total = 0;
			average = 0;

            scoreTextField.setText("");									// clear the text fields
			countTextField.setText("");
            averageTextField.setText("");
            bestTextField.setText("");
		}



    }
}
