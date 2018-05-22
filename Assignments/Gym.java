//import java.util.Scanner;
import java.io.*;

public class Gym {
  private String[] name = new String[4];
  private double[] difficultyLvl = new double[4];
  private int[] repetition = new int[4];

  public Gym () {
    for (int indx = 0; indx < name.length; indx++) {
      name[indx] = "";
      difficultyLvl[indx] = 0.0;
      repetition[indx] = 0;
      }
  }
  public void fillArr (int idx, String n, double lvl, int rep) {
    name[idx] = n;
    difficultyLvl[idx] = lvl;
    repetition[idx] = rep;
  }
  public void sortName () {
    for(int indx = 0; indx < name.length-1; indx++)
      for(int indx1 = indx+1; indx1 < name.length; indx1++)
        if (name[indx].compareTo(name[indx1]) > 0)
          swap(indx,indx1);
  }
  public void swap (int i1, int i2) {
    String tempName = "";
    double tempDiff = 0.0;
    int tempRep = 0;

    tempName = name[i1];
    tempDiff = difficultyLvl[i1];
    tempRep = repetition[i1];

    name[i1] = name[i2];
    difficultyLvl[i1]= difficultyLvl[i2];
    repetition[i1] = repetition[i2];

    name[i2] = tempName;
    difficultyLvl[i2] = tempDiff;
    repetition[i2] = tempRep;
  }
  public void gymReport (PrintWriter outputFile) {
    String fmt =  "%-10s           %-6.1f           %5d  ";
    String outstr = " ";

    outputFile.println("Name  " + "          Difficulty Level " + "     repetition  \n");

    for(int i = 0; i < name.length; i++) {
      outstr = String.format(fmt,name[i], difficultyLvl[i], repetition[i]);
      outputFile.println(outstr);
    }
  }
}