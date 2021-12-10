class Solution {
    class Row {
        int soldier;
        int index;

        Row() {}
        Row(int soldier, int index) {
            this.soldier = soldier;
            this.index = index;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int []soldiers = new int[mat.length];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0;j < mat[i].length; j++){
                if(mat[i][j] == 0)
                    break;

                soldiers[i]++;
            }
        }

        List<Row> soldiersRow = new ArrayList<>();
        for(int i = 0; i < soldiers.length; i++) {
            soldiersRow.add(new Row(soldiers[i], i));
        }

        Collections.sort(soldiersRow, (r1, r2) -> {
            if(r1.soldier == r2.soldier) {
                return r1.index - r2.index;
            } else {
                return r1.soldier - r2.soldier;
            }
        });

        int[] answer = new int[k];
        for(int i = 0; i < k; i++){
            answer[i] = soldiersRow.get(i).index;
        }

        return answer;
    }
}