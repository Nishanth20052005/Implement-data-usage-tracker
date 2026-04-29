class DataPlan {
    private double totalData;  
    private double usedData;


    public DataPlan(double totalData) {
        this.totalData = totalData;
        this.usedData = 0;
    }


    public void useData(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid data amount!");
            return;
        }
        usedData += amount;
        System.out.println(amount + " MB data used.");
    }

    
    public double getRemainingData() {
        return totalData - usedData;
    }

    
    public void displayStatus() {
        System.out.println("\n--- Data Usage Status ---");
        System.out.println("Total Data   : " + totalData + " MB");
        System.out.println("Used Data    : " + usedData + " MB");
        System.out.println("Remaining    : " + getRemainingData() + " MB");

        if (usedData > totalData) {
            System.out.println("⚠️ Data limit exceeded!");
        } else if (getRemainingData() < totalData * 0.2) {
            System.out.println("⚠️ Warning: Less than 20% data remaining!");
        } else {
            System.out.println("✅ Data usage is normal.");
        }
    }
}
