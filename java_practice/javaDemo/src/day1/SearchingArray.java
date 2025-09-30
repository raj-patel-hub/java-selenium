package day1;

public class SearchingArray {

	public static void main(String[] args) {

		
		int a[] = {10,20,30,40,50};
		int search_element=20;
		boolean status=false;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==search_element) {
				System.out.println("element found");
				status=true;
				break;
			}
		}
		if(status==false) {
		System.out.println("element no found");
		}
	}

}
