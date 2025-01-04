/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int getHeight(TreeNode* root){
        if(root==NULL){
            return 0;
        }
        int lh = getHeight(root->left);
        int rh = getHeight(root->right);
        return 1+max(lh,rh);
    }
    int getWidth(TreeNode* root){
        if(root==nullptr){
            return 0;
        }
        int lh = getHeight(root->left);
        int rh = getHeight(root->right);
        int lw = getWidth(root->left);
        int rw = getWidth(root->right);
        return max(lh+rh, max(lw,rw));
    }
    int diameterOfBinaryTree(TreeNode* root) {
        return getWidth(root);
    }
};