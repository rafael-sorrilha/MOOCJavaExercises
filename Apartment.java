
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        boolean larger = false;
        if (this.squares > compared.squares){
            larger = true;
        }
        return larger;
    }
    
    public int priceDifference(Apartment compared){
        int finalPrice = this.squares * this.pricePerSquare;
        int finalPriceCompared = compared.squares * compared.pricePerSquare;
        int difference = finalPrice - finalPriceCompared;
        
        return Math.abs(difference);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int finalPrice = this.squares * this.pricePerSquare;
        int finalPriceCompared = compared.squares * compared.pricePerSquare;
        
        if (finalPrice>finalPriceCompared){
            return true;
        }
        return false;
    }

}
