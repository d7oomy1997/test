
public class ArrayRotation {
public void Rot(int[]nums,int k) {
	if (k>nums.length)k=k%nums.length;
	int[] Res =new int [nums.length];
	for (int i=0;i<k;i++) {
		Res [i] = nums[nums.length-k+i];
	}
	int j=0;
	for (int i=k;i<nums.length;i++) {
		Res[i]=nums[j]; j++;
	}
	System.arraycopy(Res,0,nums,0,nums.length);
}
}
