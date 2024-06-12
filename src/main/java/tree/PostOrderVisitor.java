package tree;

public class PostOrderVisitor implements TreeVisitor{

    String output = "";

    @Override
    public String visit(Empty node) {
        return "";
    }

    @Override
    public String visit(Node node) {
        node.leftChild().accept(this);
        node.rightChild().accept(this);
        output = output + node.data().toString();
        return output;
    }
}
