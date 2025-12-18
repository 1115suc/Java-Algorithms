package course.day01;

public class BinarySearchBasic {
    public static int binarySearch(int[] a, int target) {
        int l = 0 , r = a.length - 1;
        while (l <= r) {
            int temp = l + r >>> 1;
            if (a[temp] < target) {
                l = temp + 1;
            } else if (a[temp] > target) {
                r = temp -1;
            } else {
                return temp;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,11,13};

        int target = 5;

        int result = binarySearch(a,target);
        System.out.println(result);
    }
}
