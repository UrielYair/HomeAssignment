import com.uriel.entity.Entity;
import com.uriel.entity.HeapCollection;
import com.uriel.entity.LinkedListCollection;
import com.uriel.entity.OrderedArrayCollection;
import java.util.Scanner;

public class Driver
{

    public static void printCollections(OrderedArrayCollection oc, HeapCollection hc, LinkedListCollection llc) {
        System.out.println("printing current status of my collections:\n");

        System.out.println("Ordered Array:");
        oc.printCollection();
        System.out.println();

        System.out.println("Heap:");
        hc.printCollection();
        System.out.println();

        System.out.println("Linked List:");
        llc.printCollection();
        System.out.println();
    }
    public static void add (OrderedArrayCollection oc, HeapCollection hc, LinkedListCollection llc, int value){
            Entity entity = new Entity(value);
            oc.add(entity);
            hc.add(entity);
            llc.add(entity);

    }
    public static void removeMaxValue (OrderedArrayCollection oc, HeapCollection hc, LinkedListCollection llc){
        oc.removeMaxValue();
        hc.removeMaxValue();
        llc.removeMaxValue();
    }

    public static void printMenu(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("please choose from the following options: \n");
        stringBuilder.append("1. Add entity to entity collection.\n");
        stringBuilder.append("2. Remove maximal value from entity collection.\n");
        stringBuilder.append("3. Print collections. \n");
        stringBuilder.append("0. Exit. \n");

        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args)
    {

        //Declaring objects of implementations:

        OrderedArrayCollection  oc  = new OrderedArrayCollection();
        HeapCollection          hc  = new HeapCollection();
        LinkedListCollection    llc = new LinkedListCollection();

        Scanner scanner = new Scanner(System.in);
        int choose= -1;
        int valueOfEntity;

        while(choose != 0 )
        {
            printMenu();
            choose = scanner.nextInt();

            switch (choose)
            {
                case 1:
                {
                    System.out.println("Please enter number for entity value.");
                    valueOfEntity = scanner.nextInt();
                    add(oc, hc, llc, valueOfEntity);
                    break;
                }
                case 2:
                {
                    removeMaxValue(oc, hc, llc);
                    break;
                }
                case 3:
                {
                    System.out.println("Printing the heap implemented by using poll() method. \n" +
                            "which means that if you still want to print the current status of the " +
                            "heap, the heap will be cleared. \nDo you want to continue and print? Y/N ");
                    scanner.nextLine();
                    String answer = scanner.nextLine();
                    if (answer.equalsIgnoreCase("y"))
                        printCollections(oc, hc, llc);
                    break;
                }

                default:
                {
                    System.out.println("Not a valid option.");
                    break;
                }
            }

        }
    }


}
