package topInterviewQuestions.easy.trees;

public class ValidateBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(ValidateBST.isValid(root));


    }

    private static boolean isValid(TreeNode root) {
        return isValid(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private static boolean isValid(TreeNode root, long max, long min) {
        if (root == null) {
            return true;
        }
        if (root.val < min || root.val > max) {
            return false;
        }
        return isValid(root.left, root.val, min) && isValid(root.right, max, root.val);
    }

}
