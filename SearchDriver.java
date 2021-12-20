// Peanut Butter and Nutella - Prattay Dey + Winnie, Brian Li + Robert, Nafiz Labib + Martha
// APCS pd6
// Lab03
// 2021-12-21

public class SearchDriver{
    public static long recordTime_B(Comparable[] iArr){
      long startTime = System.currentTimeMillis();
      for (int i = 0; i < iArr.length; i++){
        BinSearch.binSearch(iArr, iArr[i]); // runs binary search on each element of iArr
      }
      long elapsedTime = System.currentTimeMillis() - startTime;
      // return elapsedTime / iArr.length; // returns avg time for each search
      return elapsedTime; // returns total time for search of all items
    }

    public static long recordTime_I(Comparable[] iArr){
      long startTime = System.currentTimeMillis();
      for (int i = 0; i < iArr.length; i++){
        LinSearch.linSearch(iArr, iArr[i]); // runs linear search on each element of iArr
      }
      long elapsedTime = System.currentTimeMillis() - startTime;
      // return elapsedTime / iArr.length; // returns avg time for each search
      return elapsedTime; // returns total time for search of all items
    }

    public static void main(String[] args){
      long[] binTimes = new long[3];
      long[] linTimes = new long[3];

      Comparable[] test0 = new Integer[200000];
      for (int i = 0; i < test0.length; i++){ // populates test
        test0[i] = i*2;
      }

      Comparable[] test1 = new Integer[400000];
      for (int i = 0; i < test1.length; i++){ // populates test
        test1[i] = i*2;
      }

      Comparable[] test2 = new Integer[600000];
      for (int i = 0; i < test2.length; i++){ // populates test
        test2[i] = i*2;
      }

      // populates time arrays
      binTimes[0] = recordTime_B(test0);
      binTimes[1] = recordTime_B(test1);
      binTimes[2] = recordTime_B(test2);
      linTimes[0] = recordTime_I(test0);
      linTimes[1] = recordTime_I(test1);
      linTimes[2] = recordTime_I(test2);


      System.out.println("total time for linear search within test0 (ms): \t" + linTimes[0]);
      System.out.println("total time for binary search within test0 (ms): \t" + binTimes[0]);
      System.out.println("total time for linear search within test1 (ms): \t" + linTimes[1]);
      System.out.println("total time for binary search within test1 (ms): \t" + binTimes[1]);
      System.out.println("total time for linear search within test2 (ms): \t" + linTimes[2]);
      System.out.println("total time for binary search within test2 (ms): \t" + binTimes[2]);


      System.out.println("avg time for linear search within test0 (ms): \t\t" + (linTimes[0] / (double)test0.length));
      System.out.println("avg time for binary search within test0 (ms): \t\t" + (binTimes[0] / (double)test0.length));
      System.out.println("avg time for linear search within test1 (ms): \t\t" + (linTimes[1] / (double)test1.length));
      System.out.println("avg time for binary search within test1 (ms): \t\t" + (binTimes[1] / (double)test1.length));
      System.out.println("avg time for linear search within test2 (ms): \t\t" + (linTimes[2] / (double)test2.length));
      System.out.println("avg time for binary search within test2 (ms): \t\t" + (binTimes[2] / (double)test2.length));

    }

}
