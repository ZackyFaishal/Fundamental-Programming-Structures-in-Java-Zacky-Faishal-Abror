/**
 *
 * @author Zacky Faishal Abror
 */
abstract class Sortable{
 public abstract int compare(Sortable b);
 public static void shell_sort(Sortable[] a){
 //Shell sort body
    
    for(int gaps = a.length/2 ; gaps>0 ; gaps/=2){
        
        for(int i = gaps ; i<a.length; i++){
            int j =1;
            
            while(j>= gaps && a[j].compare(a[j-gaps])<0){
                Sortable temp = a[j];
                a[j] = a[j-gaps];
                a[j-gaps] = temp;
                j = j-gaps;
            }
        }
    }
 }
}

