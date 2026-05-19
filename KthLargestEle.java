import java.util.*;
class KthSmallestEle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int k=3;
        System.out.println(kthSmallest(arr, k));

    }
    public static int kthSmallest(int[] arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        for(int ele : arr)
        {
            pq.add(ele);
            if(pq.size() > k)
                pq.remove();
        }
        return pq.peek();
    }
}