//Time Complexity: O(nlogn)
//Space Complexity:O(n)

// Brute Force Approach
class Solution 
{ public boolean isAnagram(String s, String t) 
  { s=s.replaceAll("\\s","").toLowerCase();  // for comparison all to lowercase and remove spaces
    t=t.replaceAll("\\s","").toLowerCase();
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