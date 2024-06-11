package catcafe;

import static java.util.Objects.requireNonNull;

import tree.Empty;
import tree.Tree;
import tree.TreeVisitor;

import java.util.Optional;
/** Uses a binary tree to obtain FelineOverLord objects */
public class CatCafe {
    private Tree<FelineOverLord> clowder = new Empty<>();

    /**
     * add cat object to Tree
     * @param cat object
     */
    public void addCat(FelineOverLord cat) {
        clowder = clowder.addData(requireNonNull(cat));
    }

    /**
     *
     * @return number of cats inside the tree
     */
    public long getCatCount() {
        return clowder.size();
    }

    /**
     * call method with cat name and get the related cat object
     * @param name of cat
     * @return Optional of cat object
     */
    public Optional<FelineOverLord> getCatByName(String name) {
        if (name == null) return Optional.empty();

        for (FelineOverLord c : clowder) {
            if (c.name().equals(name)) return Optional.of(c);
        }



        return Optional.empty();
    }

    /**
     * method searches cat objects with weight value between given parameters
     * @param minWeight
     * @param maxWeight
     * @return Optional of cat object
     */
    public Optional<FelineOverLord> getCatByWeight(int minWeight, int maxWeight) {
        if (minWeight < 0) return Optional.empty();
        if (maxWeight < minWeight) return Optional.empty();

        for (FelineOverLord c : clowder) {
            if (c.weight() >= minWeight && c.weight() < maxWeight) return Optional.of(c);
        }

        return Optional.empty();
    }

    String accept(TreeVisitor<FelineOverLord> visitor) {
        return clowder.accept(visitor);
    }
}
