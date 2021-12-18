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
      Comparable[] test = new Integer[1000000];
      for (int i = 0; i < test.length; i++){ // populates test
        test[i] = i*2;
      }

      System.out.println("total time for linear search within test (ms): \t" + recordTime_I(test));
      System.out.println("total time for binary search within test (ms): \t" + recordTime_B(test));
    }

}
