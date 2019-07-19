package Map;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    private ArrayList<String> vertexList;

    private int[][] edges;

    private int numOfEdges;

    private boolean isVisited[];

    //构造器
    public Graph(int n) {
        edges = new int[n][n];
        isVisited = new boolean[n];    //判断是否被访问
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

    
    /***
     *
     * @param index
     * @return 如果存在就返回对应的下标,否则就返回-1
     */
    public int getFistNeighbor(int index){
        for(int j = 0; j < vertexList.size();j++){
            if(edges[index][j] > 0){
                return j;
            }
        }
        return -1;
    }

    //根据前一个邻接结点的下标来获取下一个邻接结点
    public int getNextNeighbor(int v1,int v2){
        for(int j = v2 + 1; j < vertexList.size();j++){
            if(edges[v1][j] > 0){
                return j;
            }
        }
        return -1;
    }


    public void dfs(boolean[] isVisited,int i){
        System.out.print(getValueByIndex(i) + "->");
        isVisited[i] = true;
        int w = getFistNeighbor(i);
        while (w != -1){
            if(!isVisited[w]){
                dfs(isVisited,w);
            }else {
                w = getNextNeighbor(i,w);
            }
        }
    }

    public void dfs(){
        //遍历所有的结点进行dfs
        for(int i = 0; i < getNumOfVertex();i++){
            if(!isVisited[i]){
                dfs(isVisited,i);
            }
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


        System.out.println();

        graph.dfs();
    }
}
