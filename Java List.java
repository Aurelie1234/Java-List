public class Solution {


public static void main(String[] args) {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
Scanner scan = new Scanner(System.in);
int N = scan.nextInt();
List<Integer> L = new ArrayList<Integer>();
for(int i = 0; i < N; i++){
L.add(scan.nextInt());
}
int Q = scan.nextInt();


for ( int i = 0 ; i < Q; i++){
scan.nextLine();
String s = scan.nextLine();
if ( s.equals("Insert")) {
int x = scan.nextInt();
int y = scan.nextInt();
L.add(x,y);
}
else {
int x = scan.nextInt();
L.remove(x);
}
}
for(int i : L){
System.out.print(i + " ");
}
}


}
