class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        
        int arr[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        
        int i = arr.length - 1;
        StringBuilder res = new StringBuilder();
        while(num > 0) {
            if (arr[i] > num) {
                i--;
            } else {
                res.append(map.get(arr[i]));
                num = num - arr[i];
            }
            
        }
        return res.toString();
    }
}