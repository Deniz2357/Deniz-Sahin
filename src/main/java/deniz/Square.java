package deniz;

public class Square implements Shape{

    @Override
    public int getNumberOfVertices() {
        return 4;
    }

    @Override
    public int getNumberofEdges() {
        return 4;
    }
}
