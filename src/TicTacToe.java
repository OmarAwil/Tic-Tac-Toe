import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class TicTacToe implements ActionListener
{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textField.setBackground(Color.BLACK); // Set background to black
        textField.setForeground(new Color(0, 255, 0)); // Set text color to green
        textField.setFont(new Font("ink Free", Font.BOLD, 75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Tic-Tac-Toe");
        textField.setOpaque(true);
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(150,150,150));
        frame.add(button_panel);

        for (int i =0; i<9; i++ ){
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
        }

        title_panel.add(textField);
        frame.add(title_panel, BorderLayout.NORTH);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        for (int i =0; i<9; i++ ){
            if (e.getSource() == buttons[i]){
                if (player1_turn){
                    if(buttons[i].getText().equals("")) {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textField.setText("O turn");
                        check();
                    }
                }
                else{
                    if(buttons[i].getText().equals("")) {
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText("O");
                        player1_turn = true;
                        textField.setText("X turn");
                        check();
                    }
                }
            }
        }
    }

    public void firstTurn(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        if (random.nextInt(2) == 0){
            player1_turn = true;
            textField.setText("X turn");
        }else{
            player1_turn = false;
            textField.setText("O turn");
        }
    }

    public void check(){
        if((buttons[0].getText().equals("X")) &&
                (buttons[1].getText().equals("X")) &&
                (buttons[2].getText().equals("X")))
        {
            xWins(0,1,2);
        }
        if((buttons[3].getText().equals("X")) &&
                (buttons[4].getText().equals("X")) &&
                (buttons[5].getText().equals("X")))
        {
            xWins(3,4,5);
        }
        if((buttons[6].getText().equals("X")) &&
                (buttons[7].getText().equals("X")) &&
                (buttons[8].getText().equals("X")))
        {
            xWins(6,7,8);
        }
        if((buttons[0].getText().equals("X")) &&
                (buttons[3].getText().equals("X")) &&
                (buttons[6].getText().equals("X")))
        {
            xWins(0,3,6);
        }
        if((buttons[1].getText().equals("X")) &&
                (buttons[4].getText().equals("X")) &&
                (buttons[7].getText().equals("X")))
        {
            xWins(1,4,7);
        }
        if((buttons[2].getText().equals("X")) &&
                (buttons[5].getText().equals("X")) &&
                (buttons[8].getText().equals("X")))
        {
            xWins(2,5,8); // Corrected index from 62 to 2
        }
        if((buttons[0].getText().equals("X")) &&
                (buttons[4].getText().equals("X")) &&
                (buttons[8].getText().equals("X")))
        {
            xWins(0,4,8);
        }
        if((buttons[2].getText().equals("X")) &&
                (buttons[4].getText().equals("X")) &&
                (buttons[6].getText().equals("X")))
        {
            xWins(2,4,6);
        }
        if((buttons[0].getText().equals("O")) &&
                (buttons[1].getText().equals("O")) &&
                (buttons[2].getText().equals("O")))
        {
            oWins(0,1,2);
        }
        if((buttons[3].getText().equals("O")) &&
                (buttons[4].getText().equals("O")) &&
                (buttons[5].getText().equals("O")))
        {
            oWins(3,4,5);
        }
        if((buttons[6].getText().equals("O")) &&
                (buttons[7].getText().equals("O")) &&
                (buttons[8].getText().equals("O")))
        {
            oWins(6,7,8);
        }
        if((buttons[0].getText().equals("O")) &&
                (buttons[3].getText().equals("O")) &&
                (buttons[6].getText().equals("O")))
        {
            oWins(0,3,6);
        }
        if((buttons[1].getText().equals("O")) &&
                (buttons[4].getText().equals("O")) &&
                (buttons[7].getText().equals("O")))
        {
            oWins(1,4,7);
        }
        if((buttons[2].getText().equals("O")) &&
                (buttons[5].getText().equals("O")) &&
                (buttons[8].getText().equals("O")))
        {
            oWins(2,5,8);
        }
        if((buttons[0].getText().equals("O")) &&
                (buttons[4].getText().equals("O")) &&
                (buttons[8].getText().equals("O")))
        {
            oWins(0,4,8);
        }
        if((buttons[2].getText().equals("O")) &&
                (buttons[4].getText().equals("O")) &&
                (buttons[6].getText().equals("O")))
        {
            oWins(2,4,6);
        }
    }

    public void xWins (int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for (int i =0; i<9; i++ ){
            buttons[i].setEnabled(false);
        }
        textField.setText("X wins");
    }

    public void oWins (int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for (int i = 0; i < 9; i++ ){
            buttons[i].setEnabled(false); // Disable buttons for O wins
        }
        textField.setText("O wins");
    }

}
