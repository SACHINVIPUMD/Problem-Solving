class Project{
    int profit;
    int capital;
    Project(int profit,int capital){
        this.profit = profit;
        this.capital = capital;
    }
}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capitals) {
        List<Project> projects = new ArrayList();
        int n = profits.length;
        for(int i=0;i<n;i++){
            projects.add(new Project(profits[i],capitals[i]));
        }
        projects.sort((a,b)->Integer.compare(a.capital,b.capital));
        PriorityQueue<Integer> maxheap = new PriorityQueue(Collections.reverseOrder());
        int cap = 0;
        int i = 0;
        while(k-->0){
            while(i<n && projects.get(i).capital<=w){
                maxheap.add(projects.get(i).profit);
                i++;
            }
            if(maxheap.isEmpty()){
                break;
            }
            w+=maxheap.poll();
            
        }
        return w;
    }
}