class ProductOfNumbers {

    public ProductOfNumbers() {
        
    }
    ArrayList<Integer> list=new ArrayList<>();
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int product=1;
        for(int i=list.size()-k;i<list.size();i++){
            if(list.get(i)==0){
                return 0;
            }
            product*=list.get(i);
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */