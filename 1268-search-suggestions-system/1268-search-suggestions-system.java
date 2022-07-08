class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        Arrays.sort(products);
        int start = 0;
        int end = products.length-1;
        // System.out.println(Arrays.toString(products));
        for (int i = 0; i<searchWord.length(); i++) {
            char cur = searchWord.charAt(i);
            // System.out.println(start<products.length && (products[start].length()<=i || products[start].charAt(i)!=searchWord.charAt(i)));
            while (start<products.length && (products[start].length()<=i || products[start].charAt(i)!=searchWord.charAt(i))) {
                start++;
            }
            while (end>=0 && (products[end].length()<=i || products[end].charAt(i)!=searchWord.charAt(i))) {
                // System.out.println("hi");
                end--;
            }
            if (start>end) {
                for (int j = i; j<searchWord.length(); j++) {
                    res.add(new ArrayList<String>());
                }
                return res;
            }
            List<String> list = new ArrayList<>();
            // System.out.println(start+" "+end);
            for (int k = start; k<Math.min(end+1, start+3); k++) {
                list.add(products[k]);
            }
            // System.out.println(list);
            res.add(list);
        }
        return res;
    }
}