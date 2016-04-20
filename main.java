import java.util.*;

public class ChariotArcher {
  public static void main (String args[])
  {
  int p1turn = 0;
            int p2turn = 0;
            int p1hits = 0;
            int p2hits = 0;
            char t1 [] [] = new char [12][12];
            char t2 [] [] = new char [12][12];
            char hb1 [] [] = new char [12][12];
            char hb2 [] [] = new char [12][12];
            for (int i = 1; i<=11; i++)
            {
                for (int j = 1; j<=11; j++)
                {
                    t1[i][j] = '*';
                }
            }
            for (int i = 1; i<=11; i++)
            {
                for (int j = 1; j<=11; j++)
                {
                    t2[i][j] = '*';
                }
            }
            for (int i = 1; i<=11; i++)
            {
                for (int j = 1; j<=11; j++)
                {
                    hb1[i][j] = t2[i][j];
                    hb2[i][j] = t1[i][j];
                }
            }
            
            int ships1 = 0;
            int ships2 = 0;
            
            while (ships1 <= 15)
            {
                System.out.println("ARCHERS OF ROME");
                System.out.println("Player 1 may place chariots!");
                System.out.println ("You have placed " + ships1 + " ships");
    
                int row;
                int column;
                System.out.println ("   1  2  3  4  5  6  7  8  9  10  11");
                for (int p = 1; p <= 11; p++)
                {
                    System.out.print (p);
                    for (int q = 1; q <= 11; q++)
                    {
                        if (p >= 10)
                        System.out.print (t1[p][q] + "  ");
                        else
                        System.out.print (" " + t1[p][q] + " ");
                    }
                    System.out.println();
                }
                
                if (ships1 >= 1 && ships1 <= 3)
                System.out.println ("Place a chariot adjacent to the previous.");
                else if (ships1 == 4||ships1 == 7||ships1 == 10||ships1 == 13)
                System.out.println ("Place a new chariot");
                System.out.print ("Row: ");
                row = in.nextInt();
                System.out.print ("Column: ");
                column = in.nextInt();
                
                if (row >= 1 && row <= 11 && column >= 1 && column <= 11)
                {
                    t1[row][column] = 'X';
                    ships1 = ships1 + 1;
                }
            
            
           
        }
            System.out.print('\u000C');
            System.out.println ("All the chariots have been placed successfully!");
            System.out.println ("The enemy will now place chariots!");
            int await;
            await = in.nextInt();
            System.out.println ('\u000C');
            p1turn = 1;
            p2turn = 1;
    
            while (ships2 <= 15)
            {
                System.out.println("ARCHERS OF ROME");
                System.out.println("Player 2 may place chariots!");
                System.out.println("You have placed " + ships2 + " chariots");
                int row;
                int column;
                System.out.println ("   1  2  3  4  5  6  7  8  9  10  11");
                for (int p = 1; p <= 11; p++)
                {
                    System.out.print(p);
                    for (int q = 1; q <= 11; q++)
                    {
                        if (p >= 10)
                        System.out.print (t2[p][q] + "  ");
                        else
                        System.out.print (" " + t2[p][q] + " ");
                    }
                    System.out.println();
                }
                if (ships2 >= 1 && ships2 <= 3)
                System.out.println ("Place a chariot adjacent to the previous.");
                else if (ships2 == 4||ships2 == 7||ships2 == 10||ships2 == 13)
                System.out.println ("Place a new chariot");
                System.out.print ("Row: ");
                row = in.nextInt();
                System.out.print ("Column: ");
                column = in.nextInt();
                if (row >= 1 && row <= 11 && column >= 1 && column <= 11)
                {
                    t2[row][column] = 'X';
                    ships2 = ships2 + 1;
                }
            }
            System.out.print('\u000C');
            System.out.println ("The chariots have been placed!");
            System.out.println ("Oh no! The enemy is attacking!");
            int await2;
            await2 = in.nextInt();
            System.out.println ('\u000C');
            
            boolean w1 = false;
            boolean w2 = false;
            do {
                
                
                do{
                int row, column;
                System.out.println ("Player 1's turn to play.");
                System.out.println ("Your board");
                System.out.println ("   1  2  3  4  5  6  7  8  9  10  11");
                for (int p = 1; p <= 11; p++)
                {
                    for (int q = 1; q <= 11; q++)
                    {
                        System.out.print (t1[p][q] + "  ");
                    }
                    System.out.println();
                }
                System.out.println ("Attack board");
                System.out.println ("You have hit " + p1hits + " chariots");
                for (int p = 1; p <= 11; p++)
                {
                    for (int q = 1; q <= 11; q++)
                    {
                        System.out.print (hb1[p][q] + "  ");
                    }
                    System.out.println();
                }
                   
                System.out.print ("Row: ");
                row = in.nextInt();
                System.out.print("Column: ");
                column = in.nextInt();
                p1turn = p1turn - 1;
                if (t2[row][column] == 'X')
                {
                    hb1[row][column] = 'X';
                    p1hits = p1hits + 1;
                    p1turn = p1turn + 2;
                }
                else
                hb1[row][column] = 'Y';
               
                if (p1hits >= 15)
                w1 = true;
                if (w1 == true) break;
            }
                while (p1turn >= 1);
            
            System.out.println ('\u000C');
            if (w1 == false) {
            System.out.println ("You missed!");
            System.out.println ("Other player's turn");
            int acknowledge;
            acknowledge = in.nextInt();
            System.out.println ('\u000C');
        
            do 
                 {
                    int row, column;
                    System.out.println ("Player 2's turn to play.");
                    System.out.println ("Your board");
                    main2:
                    System.out.println ("   1  2  3  4  5  6  7  8  9  10  11");
                    for (int p = 1; p <= 11; p++)
                    {
                        for (int q = 1; q <= 11; q++)
                        {
                            System.out.print (t2[p][q] + "  ");
                        }
                        System.out.println();
                    }
                    System.out.println ("Attack board");
                    System.out.println ("You have hit " + p2hits + " chariots");
                    for (int p = 1; p <= 11; p++)
                    {
                        for (int q = 1; q <= 11; q++)
                        {
                            System.out.print (hb2[p][q] + "  ");
                        }
                        System.out.println();
                    }
                       
                    System.out.print ("Row: ");
                    row = in.nextInt();
                    System.out.print("Column: ");
                    column = in.nextInt();
                    p2turn = p2turn - 1;
                    if (t1[row][column] == 'X')
                    {
                        hb2[row][column] = 'X';
                        p2hits = p2hits + 1;
                        p2turn = p2turn + 2;
                        continue;
                    }
                    else
                    hb2[row][column] = 'Y';
                    
                    if (p2hits >= 15)
                    w2 = true;
                }while (p2turn>=1);
                System.out.println ('\u000C');
                if (w2 == false) {
                System.out.println ("Other player's turn");
                int acknowledge2;
                acknowledge2 = in.nextInt();
                System.out.println ('\u000C');
            }
            }
            }while (w1 == false && w2 == false);
            if (w1 == true)
            System.out.println ("Player 1 wins!");
            else if (w2 == true)
            System.out.println ("Player 2 wins!");
  }
}
