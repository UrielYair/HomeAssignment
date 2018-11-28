import com.uriel.entity.Entity;
import com.uriel.entity.HeapCollection;
import com.uriel.entity.LinkedListCollection;
import com.uriel.entity.OrderedArrayCollection;

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

    public static void main(String[] args)
    {

        OrderedArrayCollection  oc  = new OrderedArrayCollection();
        HeapCollection          hc  = new HeapCollection();
        LinkedListCollection    llc = new LinkedListCollection();

        add(oc,hc,llc,17);
        add(oc,hc,llc,6);
        add(oc,hc,llc,12);
        add(oc,hc,llc,0);

        removeMaxValue(oc,hc,llc);
        removeMaxValue(oc,hc,llc);
        removeMaxValue(oc,hc,llc);
        removeMaxValue(oc,hc,llc);
        removeMaxValue(oc,hc,llc);

        printCollections(oc,hc,llc);
    }
}
