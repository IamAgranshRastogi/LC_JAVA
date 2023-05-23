### Brute Force Approach
* Declare a TreeSet.
* Run a for loop from starting to the end and put every element of the array in the set.
* Now put all elements of the set in the array from the starting of the array.
* Return K.
* TC: O(nlogn + n)
* SC: O(n)


### Two Pointer Approach
* Take a variable i=0;
* Use a for loop by using a variable ‘j’ from 1 to length of the array.
* If arr[j] != arr[i], increase ‘i’ and update arr[i] == arr[j].
* After completion of the loop return i+1, i.e size of the array of unique elements.
* TC: O(n)
* SC: O(1)
