public String simplifyPath(String path) {
    String[] ctr=path.split("/");
     Stack<String> stack=new Stack<>();
     for(String str:ctr){
         if(str.equals("") || str.equals(".") || str.equals("//")) continue;
         else if(str.equals("..")){
             if(!stack.isEmpty()){
                 stack.pop();
             }
         }else{
             stack.push("/"+str);
         }
     }
     String res="";
     while(!stack.isEmpty()){
         res=stack.pop()+res;
     }
     if(res == "") return "/";
     return res;
  }