import java.util.*;
class Sum{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int p=sum(n);
System.out.println(p);
}
public static int sum(int n){
if(n>0){
return n+sum(n-1);
}
else{
return 0;
}
}
}


