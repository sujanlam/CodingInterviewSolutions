package searchalgo.breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadththFirstSearch {
    int[][] matrix;

    BreadththFirstSearch(int size) {
        matrix = new int[size][size];
    }

    public void breadthFirstSearch(int src){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];
        queue.offer(src);
        visited[src] = true;
        while (queue.size() != 0){
            src = queue.poll();
            //System.out.println(nodes.get(src).data+ " = visited.");
        }
    }
}
