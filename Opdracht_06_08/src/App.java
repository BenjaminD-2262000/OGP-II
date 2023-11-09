public class App {
    public static void main(String[] args) throws Exception {
        TreeNode vertebrate = new TreeNode("Vertebrate Animals");
        vertebrate.addChild("Mammalia");
        vertebrate.addChild("Reptilia");
        vertebrate.addChild("Amphibia");
        vertebrate.addChild("Aves");

        TreeNode mammalia = vertebrate.getChildren().get(0);
        mammalia.addChild("Bat");
        mammalia.addChild("Lion");
        mammalia.addChild("Dolphin");

        TreeNode reptilia = vertebrate.getChildren().get(1);
        reptilia.addChild("Snake");
        reptilia.addChild("Crocodile");
        reptilia.addChild("Turtle");

        TreeNode amphibia = vertebrate.getChildren().get(2);
        amphibia.addChild("Frog");
        amphibia.addChild("Salamander");

        TreeNode aves = vertebrate.getChildren().get(3);
        aves.addChild("Andean Condor");
        aves.addChild("Snowy Owl");

        System.out.println("Breadth-First Traversal:");
        vertebrate.printTreeDepth();
    }        
}

