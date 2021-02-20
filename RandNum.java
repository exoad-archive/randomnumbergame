import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class RandNum {
  public static void main(String[] args)
  {
      Random option1 = new Random();
      Scanner scan = new Scanner(System.in);
      int choice1, aftchoice;
      String choice;
      int again;
      Object[] difficulty = {"Easy", "Moderate", "Hard", "Impossible", "Custom"}; 
      int selectdiff = JOptionPane.showOptionDialog(null, "Choose your difficulty", "Select difficulty", 
          JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, difficulty, difficulty[0]);
      
  if(difficulty[selectdiff] == "Easy")
    {
      do {
      choice1 = option1.nextInt(11);
      choice = JOptionPane.showInputDialog("I am thinking of a number between 0 & 10: ");
      aftchoice = Integer.parseInt(choice);
      try {
      if(aftchoice == choice1)
      {
        JOptionPane.showMessageDialog(null, "Correct!\nThe number was: "+choice1);
      } else if(aftchoice != choice1)
      {
        JOptionPane.showMessageDialog(null, "Sorry you were wrong!\nI was thinking of: "+ choice1);
      }
    } catch(Exception err)
    {
      JOptionPane.showMessageDialog(null, "Something went wrong!\n" + err);
      System.out.print(err);
    } 
    again = JOptionPane.showConfirmDialog(null, "Do Another?");
    }while(again == JOptionPane.YES_OPTION);
  }else if(difficulty[selectdiff] == "Moderate")
    {
      do {
      choice1 = option1.nextInt(51);
      choice = JOptionPane.showInputDialog("I am thinking of a number between 0 & 50: ");
      aftchoice = Integer.parseInt(choice);
      try {
      if(aftchoice == choice1)
      {
        JOptionPane.showMessageDialog(null, "Correct!\nThe number was: "+choice1);
      } else if(aftchoice != choice1)
      {
        JOptionPane.showMessageDialog(null, "Sorry you were wrong!\nI was thinking of: "+ choice1);
      }
    } catch(Exception err)
    {
      JOptionPane.showMessageDialog(null, "Something went wrong!\n" + err);
      System.out.print(err);
    } 
    again = JOptionPane.showConfirmDialog(null, "Do Another?");
    }while(again == JOptionPane.YES_OPTION);
    } else if(difficulty[selectdiff] == "Hard")
    {
      do {
      choice1 = option1.nextInt(101);
      choice = JOptionPane.showInputDialog("I am thinking of a number between 0 & 100: ");
      aftchoice = Integer.parseInt(choice);
      try {
      if(aftchoice == choice1)
      {
        JOptionPane.showMessageDialog(null, "Correct!\nThe number was: "+choice1);
      } else if(aftchoice != choice1)
      {
        JOptionPane.showMessageDialog(null, "Sorry you were wrong!\nI was thinking of: "+ choice1);
      }
    } catch(Exception err)
    {
      JOptionPane.showMessageDialog(null, "Something went wrong!\n" + err);
      System.out.print(err);
    } 
    again = JOptionPane.showConfirmDialog(null, "Do Another?");
    }while(again == JOptionPane.YES_OPTION);
    } else if(difficulty[selectdiff] == "Impossible")
    {
      do {
      int rage1 = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm", JOptionPane.WARNING_MESSAGE);
      if(rage1 == JOptionPane.YES_OPTION)
      {
      choice1 = option1.nextInt(5001);
      choice = JOptionPane.showInputDialog("I am thinking of a number between 0 & 5000: ");
      aftchoice = Integer.parseInt(choice);
      try {
      if(aftchoice == choice1)
      {
        JOptionPane.showMessageDialog(null, "Correct!\nThe number was: "+choice1);
      } else if(aftchoice != choice1)
      {
        JOptionPane.showMessageDialog(null, "Sorry you were wrong!\nI was thinking of: "+ choice1);
      }
    } catch(Exception err)
    {
      JOptionPane.showMessageDialog(null, "Something went wrong!\n" + err, "Error!", JOptionPane.WARNING_MESSAGE);
      System.out.print(err);
    } 
    } else if(rage1 == JOptionPane.NO_OPTION)
    {
      System.out.println("Rage quit\nUser exit");
      System.exit(0);
    }
    again = JOptionPane.showConfirmDialog(null, "Do Another?", "!!!", JOptionPane.QUESTION_MESSAGE);
    }while(again == JOptionPane.YES_OPTION); 
    } else if(difficulty[selectdiff] == "Custom")
    {
      try {
      do {

        String customen = JOptionPane.showInputDialog("Enter custom ending value: ");
        int customend = Integer.parseInt(customen);

        Random customgen = new Random();
        int genfinal = customend + 1;
        int newgen = customgen.nextInt(genfinal);

        String customguess = JOptionPane.showInputDialog("I'm thinking of a number between 0 & " +customend);
        int customint = Integer.parseInt(customguess);

        if(customint == newgen)
        {
          JOptionPane.showMessageDialog(null, "You are correct!\nI was thinking of "+newgen);
        } else if(customint != newgen)
        {
          JOptionPane.showMessageDialog(null, "Incorrect!\nI was thinking of "+newgen);
        }

        again = JOptionPane.showConfirmDialog(null, "Do another?");
      } while(again == JOptionPane.YES_OPTION);
    }catch (Exception err)
    {
      JOptionPane.showMessageDialog(null, "Something went wrong!"+ err);
      System.exit(0);
    }
    }
      scan.close();
  } 
}