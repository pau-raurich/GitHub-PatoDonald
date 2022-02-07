import java.util.Scanner;


public class Main
{
    /**
     * Programa que verifica si hi ha alguna data que coincideix
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Variables
        int numDates = sc.nextInt();
        String[] dates;
        int[] cumples;
        boolean cumpleRepe;

        //bucle per quan no hi ha cap cumple repetit
        while(numDates != 0)
        {
            sc.nextLine();

            cumpleRepe = false;
            dates = sc.nextLine().split(" ");
            cumples = new int[numDates * 2];


            for(int i = 0; i < numDates; i++)
            {
                cumples[2 * i] = Integer.parseInt(dates[i].split("/")[0]);
                cumples[2 * i + 1] = Integer.parseInt(dates[i].split("/")[1]);
            }

            for(int i = 0; i < numDates - 1; i++)
            {
                for(int j = i + 1; j < numDates; j++)
                {
                    if(cumples[2 * i] == cumples[2 * j] &&
                            cumples[2 * i + 1] == cumples[2 * j + 1])
                    {
                        cumpleRepe = true;
                        break;
                    }
                }
                //condició per dir si ha trobat una data repetida o no. En el cas que no hi hagi el programa acava.
                // Si no el programa segueix fins que no es trobin dates que coincideixin
                if(!cumpleRepe)
                {
                    System.out.println("No");
                    break;
                }
                else
                {
                    System.out.println("Si");
                    break;
                }
            }
            numDates = sc.nextInt();
        }
    }
}