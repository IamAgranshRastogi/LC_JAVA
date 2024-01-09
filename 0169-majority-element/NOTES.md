## Various Approaches Used::::
### 1) Brute Force using Nested Loops:

* Iterate through each element in the array.
* For each element, count its occurrences in the entire array.
* If any element has occurrences greater than n/2, return it as the majority element.

### 2) Sorting:
* Sort the array in non-decreasing order.
* As the majority element always exists, it will be at the middle index.
* Return the element at the middle index as the majority element.

### 3) Divide and Conquer:
* Divide the array into two halves.
* Recursively find the majority element in both halves.
* Combine the results by checking the count of each candidate in the entire array.
* Return the majority element if found, else return -1.
### 4) HashTable:
* Use a hash table to store the frequency of each element.
* Traverse the array, incrementing the count in the hash table for each element.
* If any element has a count greater than n/2, return it as the majority element.

### 5) Bit Manipulation:
* Iterate through each bit position (from 0 to 31).
* Count the set bits (1's) at each position for all elements.
* Construct the majority element bitwise based on the count.
* Return the constructed majority element.

### 6) Randomized:
* Randomly choose an element from the array.
* Check if the chosen element is the majority element.
* Repeat the process until the majority element is found.
* The probability of success increases with more trials.

### 7) Efficient Single loop solution using Boyer-Moore Voting Algo:
* Initialize majorityCandidate and count to 0.
* Iterate through the array.
* If count is zero, update majorityCandidate to the current element.
* Increment or decrement count based on whether the current element matches majorityCandidate.
* By the end of the loop, majorityCandidate is the majority element.

## ﻿Comparisons of time and space complexities :
**\
• Two nested loops: Time = O(n^2), Space = O(1).
• Using sorting: Time = O(nlogn), Space = O(1).
• Divide and conquer: Time = O(nlogn), Space = O(1).
• Hash table: Time = O(n), Space = O(n).
• Bit manipulation: Time = O(n), Space= O(1).
• Randomized algorithm: Time = O(nlogn), with a probability of failure 1/n if n is very large, Space = O(1).
• Boyer-Moore voting algorithm: Time = O(n), Space = O(1).\**
