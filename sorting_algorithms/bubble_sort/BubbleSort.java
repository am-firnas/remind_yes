

public int[] bubbleSort(int[] list){
	
	
	int i,j,temp = 0;
	for (int i=0; i<list.length-1; i++){
		for (int j=0; j<list.length-1-i; j++){
			if(list[j] > list[j+1]){
				temp = list[j+1];
				list[j+1] = list[j];
				list[j] = temp;
			}
		}
	}
	return list;
}