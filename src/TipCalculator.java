public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int people, int tipPercent){
        numPeople = people;
        tipPercentage = tipPercent;
        totalBillBeforeTip = 0.00;
    }
    public double getTotalBillBeforeTip (){
        return totalBillBeforeTip;
    }
    public int getTipPercentage(){
        return tipPercentage;
    }
    public void addMeal (double cost){
        totalBillBeforeTip += cost;
    }
    public double tipAmount(){
        return totalBillBeforeTip*tipPercentage/100;
    }
    public double totalBill (){
        return totalBillBeforeTip + tipAmount();
    }
    public double perPersonCostBeforeTip (){
        return totalBillBeforeTip/numPeople;
    }
    public double perPersonTipAmount(){
        return tipAmount()/numPeople;
    }
    public double perPersonTotalCost(){
        return totalBill()/numPeople;
    }
}
