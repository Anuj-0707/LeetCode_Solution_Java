class ProductOfNumbers {
    int[]list;
    int i =0;
    public ProductOfNumbers() {
        list=new int[40001];
    }
    
    public void add(int num) {
        list[i++]=num;
    }
    
    public int getProduct(int k) {
        int prod=1;
        for(int j=i-k;j<i;j++){
            prod=prod*list[j];
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */