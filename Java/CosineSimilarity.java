/**
 * Cosine Similarity
 * 
 * Return 2.0000 if cosine similarity is invalid (for example A = [0] and B = [0]).
*/

class Solution {
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    public double cosineSimilarity(int[] A, int[] B) {
        if (down(A, B) == 0) return 2.0000;
        return up(A, B) / down(A, B);
    }
    public double up(int[] A, int[] B) {
        double up = 0;
        for (int i = 0; i < A.length; i++) {
            up += A[i] * B[i];
        }
        return up;
    }
    public double down(int[] A, int[] B) {
        double sumA = 0, sumB = 0;
        for (int item : A) {
            sumA += item * item;
        }
        for (int item : B) {
            sumB += item * item;
        }
        return Math.sqrt(sumA) * Math.sqrt(sumB);
    }
}
