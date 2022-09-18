class Solution {
    public boolean isValidSudoku(char[][] arr) {
        // int flag=0;
        //box type check;;
        for(int index=0;index<9;index+=3){
            for(int ctr=0;ctr<9;ctr+=3){
                Set<Integer> box=new  HashSet<Integer>();
                for(int i=index;i<index+3;i++){
                    for(int c=ctr;c<ctr+3;c++){
                        if(arr[i][c] == '.'){
                            continue;
                        }if(!box.contains(arr[i][c]-'0')){
                            box.add(arr[i][c]-'0');
                        }else{
                            return false;
                        }
                    }
                }
            }
        }
        //row check;
        for(int index=0;index<9;index++){
            Set<Integer> rows=new HashSet<Integer>();
            for(int ctr=0;ctr<9;ctr++){
                if(arr[index][ctr] == '.'){
                    continue;
                }if(!rows.contains(arr[index][ctr]-'0')){
                    rows.add(arr[index][ctr]-'0');
                }else{
                    return false;
                }
            }
        }
        //col check
        for(int index=0;index<9;index++){
             Set<Integer> cols=new HashSet<Integer>();
             for(int ctr=0;ctr<9;ctr++){
                 if(arr[ctr][index] == '.'){
                     continue;
                 }if(!cols.contains(arr[ctr][index]-'0')){
                     cols.add(arr[ctr][index]-'0');
                 }else{
                     return false;
                 }
             }
        }
        return true;
    }
}
