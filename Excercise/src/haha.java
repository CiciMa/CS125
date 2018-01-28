
public class haha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 3, 5};
		int arr2[] = {2, 3, 3};
		int a[] = merge(arr1, arr2);
		for (int i = 0; i )
		System.out.println();
	}
	
	public static int[] merge (int arr1[], int arr2[]){
		int result[] = new int[arr1.length + arr2.length];
		int idex_arr1 = 0;
		int idex_arr2 = 0;
		int idex_result = 0;
		//index arr1 < index arr2, result [0] = arr1[0]
		while (idex_arr1 < arr1.length || idex_arr2 < arr2.length)
		{
			if (idex_arr2 >= arr2.length)
			{
				result[idex_result++] = arr1[idex_arr1++];
			}
			else if (idex_arr1 < arr1.length)
			{
				if (arr1[idex_arr1] < arr2[idex_arr2])
					result[idex_result++] = arr1[idex_arr1++];
				else
					result[idex_result++] = arr2[idex_arr2++];
			} else {
				result[idex_result++] = arr2[idex_arr2++];
			}
		}
		return result;
	}
}
