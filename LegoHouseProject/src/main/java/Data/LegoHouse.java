
package Data;

import java.util.ArrayList;

/**
 *
 * @author Younes
 */
public class LegoHouse {
    
    
    public static ArrayList<Brick> pieceList;
    private int houseHeight;
    private final int houseLength;
    private final int houseWidth;

    public LegoHouse(ArrayList piecelist, int houseHeight, int houseLength, int houseWidth) {
        this.pieceList = new ArrayList<Brick>();
        this.houseHeight = houseHeight;
        this.houseLength = calculateLength();
        this.houseWidth = calculateWidth();
    }

    public static ArrayList<Brick> getPieceList() {
        return pieceList;
    }

    public int getHouseHeight() {
        return houseHeight;
    }

    public int getHouseLength() {
        return houseLength;
    }

    public int getHouseWidth() {
        return houseWidth;
    }
    
    
    
    

    
    public int calculateLength(){
    ArrayList<Brick> brickList = pieceList;
    int totalLength = 0;
    
    for(Brick bricks : brickList)
        totalLength += bricks.getLength();
    
    return totalLength;
    
    }
    
    
    
    public int calculateWidth(){
    ArrayList<Brick> brickList = pieceList;
    int totalWidth = 0;
    
    for(Brick bricks : brickList)
        totalWidth += bricks.getWidth();
    
    return totalWidth;
    
    }
    
    }
   

   class Brick {
    
   public int width;
   public int length;

    public Brick(int length, int width) {
        
        this.width = width;
        this.length = length;
        
        
    }
    
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    
    public void choose2x4(){
        LegoHouse.pieceList.add(new fourByTwoBrick(length, width));
    
    
    }
    
    public void choose2x2(){
        LegoHouse.pieceList.add(new twoByTwoBrick(length, width));
    
    
    }
    
     public void choose1x2(){
        LegoHouse.pieceList.add(new twoByOneBrick(length, width));
    
    
    }

   }

    class fourByTwoBrick extends Brick {
     
    public fourByTwoBrick(int length, int width) {
        super(length, width);
       
        
    }

    @Override
    public int getLength() {
        return length = 4; 
    }

    @Override
    public int getWidth() {
        return width = 2;
    }
    

    
  }
     
    class twoByTwoBrick extends Brick{
    
        public twoByTwoBrick(int length, int width) {
            super(length, width);
        }

        @Override
        public int getLength() {
            return length = 2;
        }

        @Override
        public int getWidth() {
            return width = 2;
        }
        
      
        
    }
        
    class twoByOneBrick extends Brick {
        
        public twoByOneBrick(int length, int width) {
             super(length, width);
             
            }

        @Override
        public int getLength() {
            return length = 2;
        }

        @Override
        public int getWidth() {
            return width = 1; 
        }
        
        
       
        
   }
    
    
   
      
    
  
    






