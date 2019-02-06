/*
 *
 */
package fitnesstrackertest;


public class FitnessTrackerTest {

  
    public static void main(String[] args)
    {
        
        FitnessTracker fitness1 = new FitnessTracker("Running", 1, 2019, 1, 1);
        FitnessTracker fitness2 = new FitnessTracker("Bicycling", 35, 2015, 8, 20);
        System.out.println(fitness1.toString());
        System.out.println(fitness2.toString());
        
    }
    
    
}

