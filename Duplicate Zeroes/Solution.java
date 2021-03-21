class Solution {
    public void duplicateZeros(int[] arr) {
        int zero_cnt=0;
        for(int i : arr){
            if(i==0){
                zero_cnt++;                
            }

        }
        
        int i=arr.length-1;
        int j=arr.length + zero_cnt -1; //increased array length
        
        while(i!=j){
            insert(arr,i,j--);
            if(arr[i]==0){
                insert(arr,i,j--);
            }
            i--;
        }
    }
    private void insert (int[] arr,int i,int j) {
        if(j < arr.length){
            arr[j]=arr[i];            
        }

    }
}