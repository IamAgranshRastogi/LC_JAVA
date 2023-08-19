//Time Complexity: O(nlogn)
//Space Complexity:O(n)

// Brute Force Approach
class Solution 
{ public boolean isAnagram(String s, String t) 
  { s=s.toLowerCase();  // for comparison of both cases
    t=t.toLowerCase();
    if(s.length()!=t.length()) //if length not same Anagram not possible
    { return false;
    }
    char a[]=s.toCharArray(); // To compare elements
    char b[]=t.toCharArray();
    Arrays.sort(a);  // Both Arrays will have same ele if Anagram, so sorting
    Arrays.sort(b);
    return Arrays.equals(a,b);
  }
}