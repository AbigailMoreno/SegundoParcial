package quicksort3;

public class QuickSort3 {

   public void sort(Comparable[] a) {  
        sort(a, 0, a.length - 1);  
    } 
  
    private void sort(Comparable[] a, int lo, int hi) {
        imprimir(a);
        
        if(hi <= lo) return;  
        int lt = lo; 
        int gt = hi;
        
        Comparable v = a[lo];
        imprimir(a);
        int i = lo+1;  
        while(i <= gt) {  
            int cmp = a[i].compareTo(v);   
            if(cmp < 0){  
                swap(a, lt++, i++);
                imprimir(a);
            }else if(cmp > 0) {  
                swap(a, i, gt--);
                imprimir(a);
            }else{  
                i++;
                imprimir(a);
            }  
        }  
          //particion 
        // a[lo..lt-1] < v = a[lt..gt] < a[gt + 1..hi].
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
        
    }  
      
    private void swap(Object[] a, int i, int j) {  
        // TODO Auto-generated method stub  
        Object aux = a[i];  
        a[i] = a[j];  
        a[j] = aux;  
    }  
      
    public void imprimir(Comparable[] a) {  
        for(int i = 0; i < a.length; i++) {  
            System.out.print(a[i] + " ");  
        }  
        System.out.println();  
    }  
    
   
    public static void main(String[] args) {

        //Integer[] a = {4,9,1,9,1,4,4,9,1,1};
        Integer[] a = {1, 5, 4, 9, 5, 3, 6,7,2,4}; 
        QuickSort3 q3w = new QuickSort3();  
        q3w.sort(a);  
        q3w.imprimir(a);
    }
}

   
