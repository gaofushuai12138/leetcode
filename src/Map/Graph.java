package Map;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    private ArrayList<String> vertexList;

    private int[][] edges;

    private int numOfEdges;

    //构造器
    public Graph(int n) {
        edges = new int[n][n];
        vertexList = new ArrayList<>();
        numOfEdges = 0;
//        this.edges = edges;
    }

    //插入结点
    public void insertVertex(String vertex){
        vertexList.add(vertex);
    }

    /***
     * 统计结点的数量
     * @return
     */
    public int getNumOfVertex(){
        return vertexList.size();
    }

    /***
     * 统计边的数量
     * @return
     */
    public int getNumOfEdges(){
        return numOfEdges;
    }

    /***
     * 返回v1和v2的权值
     * @param v1
     * @param v2
     * @return
     */
    public int getWeight(int v1,int v2){
        return edges[v1][v2];
    }

    /***
     * 返回第 i 个 结点
     * @param i
     * @return
     */
    public String getValueByIndex(int i){
        return vertexList.get(i);
    }

    /***
     * 添加边
     * @param v1      代表点的下标和第几个顶点
     * @param v2      代表第二个点的下标和顶点
     * @param weight  表示点与点的关联
     */
    public void insertEdge(int v1,int v2,int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

    /***
     * 显示图
     */
    public void showGraph(){
        for(int[] link : edges){
            System.out.println(Arrays.toString(link));
        }
    }

    public static void main(String[] args){
        int n = 5;
        String VertexValue[] = {"A","B","C","d","E"};
        Graph graph = new Graph(5);
        for(String Vertex : VertexValue){
            graph.insertVertex(Vertex);
        }

        //A-B A-C B-C B-D B-E
        graph.insertEdge(0,1,1);
        graph.insertEdge(0,2,1);
        graph.insertEdge(1,2,1);
        graph.insertEdge(1,3,1);
        graph.insertEdge(1,4,1);

        graph.showGraph();
    }
}
