package gt.edu.miumg.sistemas.ingesoftware.p2.RecursiveBubbleSort;

import com.sun.xml.internal.fastinfoset.algorithm.BuiltInEncodingAlgorithm;
import gt.edu.miumg.sistemas.ingesoftware.p2.RecursiveBubbleSort.Services.IRecursiveBubbleSort;
import gt.edu.miumg.sistemas.ingesoftware.p2.RecursiveBubbleSort.Services.IWordManager;
import gt.edu.miumg.sistemas.ingesoftware.p2.RecursiveBubbleSort.Services.RecursiveBubbleSort;
import gt.edu.miumg.sistemas.ingesoftware.p2.RecursiveBubbleSort.Services.WordManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecursiveBubbleSortApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RecursiveBubbleSortApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
        IWordManager d = new WordManager();
        
        d.ShowManager();
        
    
    }

}
