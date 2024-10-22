class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> indxQueue = new LinkedList();
        for(int i = 0;i<deck.length;i++){
            indxQueue.add(i);
        }
        int[] result = new int[deck.length];
        for(int num : deck){
            result[indxQueue.poll()] = num;
            if(!indxQueue.isEmpty()){
                indxQueue.add(indxQueue.poll());
            }
        }
        return result;
    }
}