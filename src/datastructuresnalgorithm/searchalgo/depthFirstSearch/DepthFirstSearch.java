package searchalgo.depthFirstSearch;

public class DepthFirstSearch {
    int[][] matrix;

    DepthFirstSearch(int size) {
        matrix = new int[size][size];
    }

    public void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }

    private void dFSHelper(int src, boolean[] visited) {
        if(visited[src]){ //if visited already
            return;
        }else {
            visited[src] = true;
        }
        for (int i = 0; i < matrix[src].length; i++) {
            if(matrix[src][i] == 1){
                dFSHelper(i, visited);
            }
        }
        return;
    }
}
