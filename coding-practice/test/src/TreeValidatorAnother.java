import java.util.*;

    public class TreeValidatorAnother {
        public static String ArrayChallenge(String[] strArr) {
            Map<String, List<String>> tree = new HashMap<>();
            Map<String, String> childToParent = new HashMap<>();
            Set<String> allNodes = new HashSet<>();

            for (String pair : strArr) {
                String[] nodes = pair.replaceAll("[()]", "").split(",");
                String parent = nodes[0];
                String child = nodes[1];

                allNodes.add(parent);
                allNodes.add(child);

                if (childToParent.containsKey(child)) {
                    System.out.println("Child " + child + " has multiple parents.");
                    return "false";
                }

                childToParent.put(child, parent);
                tree.computeIfAbsent(parent, k -> new ArrayList<>()).add(child);

                if (tree.get(parent).size() > 2) {
                    System.out.println("Parent " + parent + " has more than 2 children.");
                    return "false";
                }
            }

            Set<String> roots = new HashSet<>(allNodes);
            roots.removeAll(childToParent.keySet());
            System.out.println("Roots found: " + roots);

            if (roots.size() != 1) {
                System.out.println("There should be exactly one root.");
                return "false";
            }

            String root = roots.iterator().next();
            System.out.println("Starting DFS from root: " + root);

            Set<String> visited = new HashSet<>();
            if (!dfs(root, tree, visited)) {
                System.out.println("Cycle detected.");
                return "false";
            }

            if (visited.size() != allNodes.size()) {
                System.out.println("Disconnected tree. Visited " + visited.size() + " of " + allNodes.size());
                return "false";
            }

            return "true";
        }

        private static boolean dfs(String node, Map<String, List<String>> tree, Set<String> visited) {
            if (visited.contains(node)) return false;
            visited.add(node);
            for (String child : tree.getOrDefault(node, new ArrayList<>())) {
                if (!dfs(child, tree, visited)) return false;
            }
            return true;
        }

        public static void main(String[] args) {
            String[] input = {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
            System.out.println("Result: " + ArrayChallenge(input));
        }
    }