package com.twoweekly.contest20;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-22
 * @time: 22:51
 */
public class Cashier {

    private int num;

    private int total;

    private int dis;

    private int[] products;

    private int[] prices;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.num = n;
        this.dis = discount;
        this.products = products;
        this.prices = prices;
    }

    public double getBill(int[] product, int[] amount) {
        total++;
        int sum = 0;
        int index = 0;
        for (int i = 0; i <product.length ; i++) {
            for (int j = 0; j <this.products.length ; j++) {
                if(this.products[j] == product[i]){
                    index = j;
                }
            }
//            System.out.println(this.prices[product[i]]);
//            System.out.println(amount[i]);
            sum += this.prices[index] * amount[i];
        }
        if(total % num == 0){
            sum = sum - (this.dis) * sum / 100;
        }
        return sum;
    }

    public static void main(String[] args) {
        Cashier cashier = new Cashier(3, 50, new int[]{1,2,3,4,5,6,7}, new int[]{100,200,300,400,300,200,100});
        System.out.println(cashier.getBill(new int[]{1,2}, new int[]{1,2}));
    }
}
