package Procedural;

public class TreeNodeUtils_1 {
    public static TreeNode generateFibTree(int number) {
        if (number < 2) {
            return new TreeNode(number, null, null);
        } else {
            return new TreeNode(number, generateFibTree(number - 1), generateFibTree(number - 2));
        }
    }

    public static int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int heightLeft = getHeight(node.left);
            int heightRight = getHeight(node.right);
            return 1 + (heightLeft > heightRight ? heightLeft : heightRight);
        }
    }

    public static int getSize(TreeNode node) {
        return node == null ? 0 : 1 + getSize(node.left) + getSize(node.right);
    }

    public static int getSum(TreeNode node) {
        if (node == null) {
            throw new IllegalArgumentException("can not calculate sum in null TreeNode");
        } else {
            int result = node.value;
            if (node.left != null) {
                result = result + getSum(node.left);
            }
            if (node.right != null) {
                result = result + getSum(node.right);
            }
            return result;
        }
    }

    public static int getMax(TreeNode node) {
        if (node == null) {
            throw new IllegalArgumentException("can not calculate max in null TreeNode");
        } else {
            int max = node.value;
            if (node.left != null) {
                int newMax = getMax(node.left);
                max = max > newMax ? max : newMax;
            }
            if (node.right != null) {
                int newMax = getMax(node.right);
                max = max > newMax ? max : newMax;
            }
            return max;
        }
    }

    public static int getMin(TreeNode node) {
        if (node == null) {
            throw new IllegalArgumentException("can not calculate min in null TreeNode");
        } else {
            int min = node.value;
            if (node.left != null) {
                int newMin = getMin(node.left);
                min = min < newMin ? min : newMin;
            }
            if (node.right != null) {
                int newMin = getMin(node.right);
                min = min < newMin ? min : newMin;
            }
            return min;
        }
    }
}
