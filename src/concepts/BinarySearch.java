/**
 * Program name: BinarySearch.java
 * Program description: This program will accept an integer value from user and search it from
 * a pre-defined integer array whose structure is [34, 56, 67, 78, 89, 99]. If it finds a match it will
 * show the array position where the match is found and else it will say 'Not found'.
 * The algorithm used for searching is binary search.
 * Developer: Gautam Chatterjee
 * version: 1.0
 * Date: June 16th, 2020
 */

package concepts;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int iStart = 0, iLast = 0, iMid = 0, iSearch = 0;
        int[] iMyArray = {34, 56, 67, 78, 89, 91, 99};
        boolean bFlag = false;

        iLast = iMyArray.length - 1;

        System.out.println("Select a value from 34, 56, 67, 78, 89, 91, 99 to search!");
        Scanner s = new Scanner(System.in);
        iSearch = s.nextInt();
        System.out.println("You are searching: " + iSearch);
        while (iStart <= iLast) {
            iMid = (iStart + iLast) / 2;

            if (iMyArray[iMid] == iSearch) {
                bFlag = true;
                break;
            }
            if (iMyArray[iMid] > iSearch) {
                iLast = iMid - 1;
            } else {
                iStart = iMid + 1;
            }
        }

        if (bFlag == true) {
            System.out.println("Match found at position: " + iMid);
        } else {
            System.out.println("Match not found!!");
        }
    }

}
