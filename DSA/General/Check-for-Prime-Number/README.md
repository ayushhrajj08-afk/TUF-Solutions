# 779. Check for Prime Number

Solution in **Java** for takeUforward problem **#779: Check for Prime Number**.

Problem link: <!-- paste the takeUforward problem URL here -->

## Problem

You are given an integer `n`. Check if the number is prime or not. Return `true` if it is a prime number, otherwise return `false`.

A **prime** number is a number which has no divisors except 1 and itself.

## Examples

**Example 1**

```
Input:  n = 5
Output: true
Explanation: The only divisors of 5 are 1 and 5, so 5 is prime.
```

**Example 2**

```
Input:  n = 8
Output: false
Explanation: The divisors of 8 are 1, 2, 4, 8, so it is not prime.
```

## Approach

Brute force divisor check:

1. Loop `i` from `2` to `n - 1`.
2. If `n % i == 0`, then `i` is a divisor other than 1 and `n`, so return `false`.
3. If no divisor is found, return `true`.

## Solution

```java
class Solution {
    public boolean isPrime(int n) {
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
```

## Complexity

| | Complexity |
|---|---|
| Time | O(n), the loop runs up to `n - 2` times |
| Space | O(1) |

## Notes

- For `n = 1` (and `0` or negative values) this code returns `true`, because the loop never runs. This only matters if the problem's constraints allow `n < 2`.
- The loop can be shortened to run only while `i * i <= n`, which makes it O(√n) and avoids slow runs for large `n`.

## Files

- `Solution.java`: the solution
- `README.md`: this file
