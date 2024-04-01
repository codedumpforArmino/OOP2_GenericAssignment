public class main {
    public static void main(String[] args) {
        MyMap newMap = new MyMap();

        newMap.put(12,12);
        newMap.put("kevin", 21);
        newMap.put(4.5, 42);

        System.out.println(newMap.get("kevin"));
        System.out.println(newMap.get(12));

        Arithmetic myNums = new Arithmetic(12, 5.6);
        System.out.println(myNums.add());
        System.out.println(myNums.subtract());
        System.out.println(myNums.divide());
        System.out.println(myNums.multiply());
        System.out.println(myNums.getMin());
        System.out.println(myNums.getMax());
    }
}
