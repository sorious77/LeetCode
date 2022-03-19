class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> list = new ArrayList<Integer>(arr.length);
        for(int n : arr) {
            list.add(n);
        }
        
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                int c1 = Integer.bitCount(n1);
                int c2 = Integer.bitCount(n2);
                
                return c1 == c2 ? n1 - n2 : c1 - c2;
            }
        });
        
        return list.stream().mapToInt(i->i).toArray();
    }
}
