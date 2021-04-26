package gt.edu.miumg.sistemas.ingesoftware.p2.RecursiveBubbleSort.Services;

public class WordManager implements IWordManager{
    
    
    
    public static String[] InsertLuffy(){
        
        IRecursiveBubbleSort sort = new RecursiveBubbleSort();
        
        String animal [] = {"oso","perro","elefante","leon"};
        
        sort.bubbleSort(animal, animal.length);
        
        return animal;
         
    }
    

        
    @Override
    public void ShowManager() {
        
        String  p[] = InsertLuffy ();
        
        for (int r = 0; r < p.length; r++){
            
            System.out.println(p[r]);
        }  
    
}
}
