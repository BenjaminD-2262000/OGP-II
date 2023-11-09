import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TreeNode {
    private String mName;
    private List<TreeNode> mChildren = new ArrayList<>();
    private TreeNode mParent = null;

    public TreeNode(String name){
        mName = name;
    }

    public String getName(){
        return mName;
    }

    public void addChild(TreeNode child){
        child.setParent(this);
        mChildren.add(child);
    }

    public void addChild(String name){
        TreeNode child = new TreeNode(name);
        addChild(child);
    }

    public List<TreeNode> getChildren(){
        return mChildren;
    }

    public void setParent(TreeNode parent){
        mParent = parent;
    }

    public TreeNode getParent(){
        return mParent;
    }



    public void printTreeDepth(){
        TreeNode node = this;
        while(node.getParent() != null){
            node = node.getParent();
        }
        System.out.println(node.getName());
        node.printAllChildrenDepth();
    }

    public void printAllChildrenDepth(){
        if (mChildren == null){
            return;
        } 
        for (TreeNode child : mChildren){
            System.out.println(child.getName());
            child.printAllChildrenDepth();
        }

    }

    public void printTreeBreadth(){
        TreeNode node = this;
        while(node.getParent() != null){
            node = node.getParent();
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            System.out.println(currentNode.getName());

            if (!currentNode.getChildren().isEmpty()){
                for (TreeNode child : currentNode.getChildren()){
                    queue.add(child);
                }
            }
        }

    }

}
