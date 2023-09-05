package test_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//input example README 참조
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        String[][] lake = new String[row][col];
        for (int i = 0; i < row; i++) {
            lake[i] = br.readLine().split(" ");
        }

        ArrayList<int[]> resultList;
        do {
            resultList = lakeLogic(lake);
            for (int[] xy : resultList) {
                String target = lake[xy[0]][xy[1]];
                lake[xy[0]][xy[1]] = String.valueOf(Integer.parseInt(target) + 1);
            }
//            System.out.println(Arrays.deepToString(lake));
        } while (!resultList.isEmpty());

        StringBuilder sb = new StringBuilder();
        for (String[] r : lake) {
            for (String e : r) {
                sb.append(e).append(" ");
            }
            sb.delete(sb.length()-1, sb.length());
            sb.append("\n");
        }
        sb.delete(sb.length()-1, sb.length());
        System.out.println(sb);
    }

    // return count 올릴 위치 ex) ArrayList[[1,2], [2,4] ...]
    static ArrayList<int[]> lakeLogic(String[][] lake) {
        ArrayList<int[]> resultList = new ArrayList<>();
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int row = lake.length;
        int col = lake[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int now = Integer.parseInt(lake[i][j]);
                if (now == 0) continue;
                for (int k = 0; k < 4; k++) {
                    int _i = i + dx[k];
                    int _j = j + dy[k];
                    if (_i < 0 || _i >= row || _j < 0 || _j >= col) continue;
                    if (now > Integer.parseInt(lake[_i][_j])) {
                        break;
                    }
                    if (k == 3) resultList.add(new int[]{i, j});
                }
            }
        }
        return resultList;
    }
}
