class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> list = new ArrayList<Integer>(arr.length);
        
        for (int i : arr) {
            list.add(i);
        }
            
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                int count1 = 0;
                int count2 = 0;

                int temp1 = n1;
                int temp2 = n2;

                while (temp1 > 0) {
                    if ((temp1 & 1) == 1) {
                        count1 += 1;
                    }

                    temp1 = temp1 >> 1;
                }

                while (temp2 > 0) {
                    if ((temp2 & 1) == 1) {
                        count2 += 1;
                    }

                    temp2 = temp2 >> 1;
                }

                if (count1 < count2) {
                    return -1;
                } else if (count1 > count2) {
                    return 1;
                }

                return n1 - n2;
            }
        });
        
        return list.stream().mapToInt(i->i).toArray();
    }
}
