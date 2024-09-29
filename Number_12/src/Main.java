public class Main {

        public static void main(String[] args) {
            int laptopPrice = 85000;
            int mousePrice = 2500;
            double totalCost = laptopPrice + mousePrice;
            double discount = totalCost * 0.15;
            double finalCost = totalCost - discount;

            System.out.println("Total cost after 15% discount: " + finalCost);
        }
    }
