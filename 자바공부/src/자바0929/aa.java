package 자바0929;

public class aa {
    public int[] solution(int[] array, int[][] commands) {
    	int cnt = 0;
        int idx = 0;
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int[] tmp = new int[(commands[i][1]-commands[i][0])+1];
            cnt = 0;
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                tmp[cnt] = array[j];
                cnt++;
            }
            answer[idx] = tmp[commands[i][2]-1];
            idx++;
        }
        return answer;
    }
}
