import java.util.ArrayList;

public class PracticeProblem{
public static void main(String args[]) {
 System.out.println(perms("ELO"));

	}

	public static ArrayList<String> perms(String str){
		ArrayList <String> perm = new ArrayList<String>();

	permHelper("", str, perm);
		return perm;
	}

public static void permHelper(String used, String unused, ArrayList<String> list){
if (unused.length() == 0){
	list.add(used);
	return;
}

String temp = unused;
String tempused = used;
for (int i = 0; i<unused.length(); i++){
	tempused = used+ unused.charAt(i);
	if (unused.length()-1>i){
		temp = unused.substring(0, i) + unused.substring(i+1);
			}
	else{
		temp = unused.substring(0, i);
			}
	permHelper(tempused, temp, list);

}
}







public static ArrayList<String> permsUnique(String str){
	ArrayList <String> perm = new ArrayList<String>();

permHelper1("", str, perm);
	return perm;
}

public static void permHelper1(String used, String unused, ArrayList<String> list){
if (unused.length() == 0){
	if (!list.contains(used)){
		list.add(used);
	}
return;
}
String temp = unused;
String tempused = used;
for (int i = 0; i<unused.length(); i++){
tempused = used+ unused.charAt(i);
if (unused.length()-1>i){
	temp = unused.substring(0, i) + unused.substring(i+1);
		}
else{
	temp = unused.substring(0, i);
		}
permHelper1(tempused, temp, list);

}
}
}