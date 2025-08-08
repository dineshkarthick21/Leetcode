import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
                    Set<Integer> result = new HashSet<>();

                            // Store all numbers from nums1
                                    for (int num : nums1) {
                                                set1.add(num);
                                                        }

                                                                // Check nums2 against set1
                                                                        for (int num : nums2) {
                                                                                    if (set1.contains(num)) {
                                                                                                    result.add(num);
                                                                                                                }
                                                                                                                        }

                                                                                                                                // Convert set to array
                                                                                                                                        int[] arr = new int[result.size()];
                                                                                                                                                int index = 0;
                                                                                                                                                        for (int num : result) {
                                                                                                                                                                    arr[index++] = num;
                                                                                                                                                                            }

                                                                                                                                                                                    return arr;
                                                                                                                                                                                        }
                                                                                                                                                                                        }
                                                                                                                                                                                        