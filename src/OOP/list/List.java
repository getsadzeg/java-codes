
package list;


public class List {
    private int[] list = new int[100];
    private int element;
    private int p = 0;
    private int k = 0;
    private int clone = 0;
    private int index = 0;
     public List() {
         
     }
    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }
    public void addLast(int element) {
        for(int i=0; i<list.length; i++) {
            p = list[i];
            if(p != 0) {
                k++;
                clone = p;
                index = i;
            }
             
        }
       System.out.println("clone: " + clone);
       System.out.println("index: " + index);
        System.out.println(k);
        if(clone == 0) list[0] = element;
        else list[index+1] = element;
        /*for(int i=0; i<list.length; i++) {
            System.out.println("element is " + list[i]);
        }*/
    }
    
    public void getLast() {
        clone = p;
        for(int i=0; i<list.length; i++) {
            p = list[i];
            if(p!=0) {
                clone = p;
                index = i;
            }
            
        }
        if(clone == 0) System.out.println("No elements");
            else System.out.println("Last element: " + list[index]);
    }
    public void addFirst(int element) {
        int first = element;
            for(int i=0; i<list.length; i++) {
            if(p!=0) {
                index = i;
            }
            }
            for(int i = index+1; i > 0; i--) {
            list[i] = list[i-1];
            }
            list[0] = element;
            /*for(int i=0; i<list.length; i++) {
                System.out.println(list[i]);
            }*/
    }
    public void getFirst() {
        for(int i=0; i<list.length; i++) {
            p = list[i];
            if(p!=0) {
                clone = p;
            }
        }
        if(clone == 0) System.out.println("No elements");
            else System.out.println("First element: " + list[0]);
    }
    public void removeFirst() {
       /* System.out.println("First print:");
        for(int i=0; i<list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("Second print:");*/
        for(int i=0; i<list.length-1; i++) {
            list[i] = list[i+1];
            //System.out.println(list[i]);
        }
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }
}
