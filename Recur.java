import java.util.*;
class Recur{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
recur(n);
}
public static void recur(int n){
if(n>0){
System.out.println(n);
recur(n-1);
}
}
}
