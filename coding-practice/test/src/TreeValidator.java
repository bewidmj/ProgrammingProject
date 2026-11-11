import java.util.*;

class TreeValidator {


    public static String ArrayChallenge(String[] strArr) {
        // code goes here

        Map<String, String> childToParent = new HashMap<>();
        Map<String, Integer> parentChildCount = new HashMap<>();
        Set<String> allNodes = new HashSet<>();
        Set<String> children = new HashSet<>();

        for (String pair : strArr) {
            String[] nodes = pair.trim().replaceAll("[()]", "").split(",");
            String parent = nodes[0];
            String child = nodes[1];

            allNodes.add(parent);
            allNodes.add(child);
            children.add(child);

            if (childToParent.containsKey(child)) {
                return "false";
            }
            childToParent.put(child, parent);
            parentChildCount.put(parent, parentChildCount.getOrDefault(parent, 0) + 1);

            if (parentChildCount.get(parent) > 2) {
                return "false";
            }

        }

        Set<String> rootCandidates = new HashSet<>(allNodes);
        rootCandidates.removeAll(children);

        if (rootCandidates.size() != 1) {
            return "false";
        }

        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ArrayChallenge(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));

    }

}
