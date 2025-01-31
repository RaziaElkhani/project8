package demo2;

public class TestDemo2 {
public static void main(String[] args) {
	int arr[]= {2,3,4,4,4,4,5,5,6,6,9,9,9};
	for (int i =0 ;i<arr.length;i++) {
		System.out.println(arr[i]);
		if (arr[i]==4){
			i++;
		}
	}
}
}
