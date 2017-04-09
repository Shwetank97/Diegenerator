
package die.generator;

import java.util.Random;


public class Die {
    private int sides;
    private int value;
    private Random generator;
    
    public Die(int sides)
    {
    this.sides = sides;
    this.generator = new Random();
    this.value = this.roll();
    }
    
      public Die(int sides, int seed)
    {
    this.sides = sides;
    this.generator = new Random(seed);
    this.value = this.roll();
    }
      
      public int roll()
      {
          this.value = this.generator.nextInt(this.sides) + 1;
          return this.value;
      }
      
      public int getValue()
      {
      return this.value;
      }
      
      public int getSides()
      {
      return this.sides;
      }
      
      public void setSides(int sides)
      {
          this.sides = sides;
          
      }
              
}
