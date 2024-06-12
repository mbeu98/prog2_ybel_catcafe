package tree;

public class InOrderVisitor implements TreeVisitor{
    String output = "";

    @Override
    public String visit(Empty node) {
        return "";
    }

    @Override
    public String visit(Node node) {
        node.leftChild().accept(this);
        output = output + node.data().toString();
        node.rightChild().accept(this);
        return output;
    }
}
