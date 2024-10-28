public class Cart{
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
    new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == 19){
            System.out.println("The cart is almost full");
        }else{
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered+=1;
            System.out.println("The disc has been added");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
            for(int i = 0; i < qtyOrdered; i++){
                if(itemsOrdered[i].equals(disc)){
                    itemsOrdered[i] = new DigitalVideoDisc();
                    qtyOrdered -= 1;
                }
            }
    }
    public int getQty(){
        return qtyOrdered;
    }
    private float sum = 0;
    public float totalCost(){
        for(int i = 0; i < qtyOrdered; i++){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
}