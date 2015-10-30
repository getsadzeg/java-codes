
package list;


public class List {
    private int[] list = new int[100];
    private int element;
    
     public List() {
         
     }
    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }
    public void addLast(int element) {
        int p = 0;
        int k = 0;
        int t = 20;
        int clone = 0;
        int index = 0;
        //list[0] = 20;
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
        int p = 0;
        int clone = p;
        int index = 0;
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

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }
}
