public boolean firstLast6(int[] nums) {
    if (nums[0] == 6 || nums[nums.length-1] == 6 ) {
      return true;
    } else {
      return false;
    }
}


// 2nd

public boolean sameFirstLast(int[] nums) {
    if ( nums.length >= 1 && nums[0] == nums[nums.length-1] ) {
      return true;
    } else {
      return false;
    }
  }

  
  //3rd

/*
 * 
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.


makePi() → [3, 1, 4]
 */

 public int[] makePi() {
    return new int []{3,1,4};
  }

//4th
  
/*
 * 
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
 */

 public boolean commonEnd(int[] a, int[] b) {
    return a.length >=1 && b.length >=1 && a[0] == b[0] || a[a.length-1] == b[b.length-1];
  }

  
//5th

/*
 * 
Given an array of ints length 3, return the sum of all the elements.


sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
 */

 public int sum3(int[] nums) {
    return nums[0] + nums[1] + nums[2];
  }

//6th

/*
 * 
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */

 public int[] rotateLeft3(int[] nums) {
    int[] nums2 = new int[3];
    nums2[0] = nums[1];
    nums2[1] = nums[2];
    nums2[2] = nums[0];
    return nums2;
  }

//7th

/*
 * 
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 */

 public int[] reverse3(int[] nums) {
    return new int[]{nums[2],nums[1],nums[0]};
  }

//8th

/* 
 * 
Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.


sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
*/

public int sum2(int[] nums) {
    return nums.length > 0 ? nums.length == 1 ? nums[0] : nums[0] + nums[1] : 0;
  }


//9th

/*
 * 
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */

 public int[] middleWay(int[] a, int[] b) {
    return new int[] {a[1],b[1]};
  }

//10th

/*
 * 
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.


makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
 */

 public int[] makeEnds(int[] nums) {
    return new int[] {nums[0],nums[nums.length-1]};
  }


//11th

/*
 * 
Given an int array length 2, return true if it contains a 2 or a 3.


has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
 */

 public boolean has23(int[] nums) {
    if ( nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
      return true;
    } else {
      return false;
    }
  }


//12th

/*
 * 
Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */

 public boolean no23(int[] nums) {
    if ( nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) {
      return true;
    } else {
      return false;
    }
  }

//13th

/*
 * 
Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.


makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
 */

 public int[] makeLast(int[] nums) {
    int[] newNums = new int[nums.length*2];
    newNums[newNums.length-1] = nums[nums.length-1];
    return newNums;
  }
  

//14th

/*
 * 
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.


double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
 */

 public boolean double23(int[] nums) {
    if ( nums.length < 2) {
      return false;
    } else {
      if (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3) {
        return true;
      }else {
        return false;
      }
    }
  }
  

//15th 

/*
 * 
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.


fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
 */

 public int[] fix23(int[] nums) {
    if (nums[1] == 3 && nums[0] == 2) {
      nums[1] = 0;
    } else if (nums[2] == 3 && nums[1] == 2) {
      nums[2] = 0;
    }
    return nums;
  }  


// 16th

/*
 * 
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
 */

 public int start1(int[] a, int[] b) {
    return a.length >=1 && b.length >=1 && a[0] == 1 && b[0] == 1 ? 2 : a.length >=1 && a[0] == 1 || b.length >=1 && b[0] == 1 ? 1 : 0;
  }

//17th

/*
 *
 Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.


biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
*/

public int[] biggerTwo(int[] a, int[] b) {
    return b[0] + b[1] > a[0] + a[1] ? b : a;
  }


//18th

/*
 * 

Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 */


public int[] makeMiddle(int[] nums) {
    int n = nums.length / 2;
    return nums.length > 2 ? new int[]{nums[n-1],nums[n]} : nums;
}