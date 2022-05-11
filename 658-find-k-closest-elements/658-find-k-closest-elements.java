class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (arr[mid]<x) start = mid+1;
            else end = mid-1;
        }
        if (end<0) end = 0;
        else if (end>arr.length-1) end = arr.length-1;
        else {
            if (end !=0 && Math.abs(arr[end-1]-x)<(Math.abs(arr[end]-x))) end = end-1;
            else if (end!=arr.length-1 && Math.abs(arr[end+1]-x)<(Math.abs(arr[end]-x))) end = end+1;
        }
        System.out.println(end);
        minHeap.add(arr[end]);
        int temp = k;
        k--;
        int left = end-1;
        int right = end+1;
        while (k>0) {
            int val;
            if (left>=0 && right<arr.length) {
                if (Math.abs(arr[left]-x)<Math.abs(arr[right]-x)) minHeap.add(arr[left--]);
                else if (Math.abs(arr[left]-x)==Math.abs(arr[right]-x)) {
                    if (arr[left]<arr[right]) minHeap.add(arr[left--]);
                    else minHeap.add(arr[right++]);
                } else minHeap.add(arr[right++]);
            } else if (left>=0) minHeap.add(arr[left--]);
            else if (right<arr.length) minHeap.add(arr[right++]);
            k--;
        }
        while (temp>0) {
            list.add(minHeap.poll());
            temp--;
        }
        return list;
    }
}