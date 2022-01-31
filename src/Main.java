import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] data = new String[num+1];

        boolean igual = false;


        for(int i=0; i <= num; i++)

        {

            data[i]= sc.nextLine();

            for(int j=1; j < num; j++)

            {

                if(data[i].equals(data[j]))

                {

                    igual= false;

                }else {

                    igual=true;



                }

            }

        }

        if (igual != true) {

            System.out.println("Si");

        } else {

            System.out.println("No");

        }

    }

}