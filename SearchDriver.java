public class SearchDriver{
  static Comparable[] iArr = new Integer[10000];

    public static long recordTime_B(){
      long startTime = System.currentTimeMillis();
      for (int i = 0; i < iArr.length; i++){
        BinSearch.binSearch(iArr, iArr[i]); // runs binary search on each element of iArr
      }
      long elapsedTime = System.currentTimeMillis() - startTime;
      return elapsedTime / iArr.length;
    }

    public static long recordTime_I(){
      long startTime = System.currentTimeMillis();
      for (int i = 0; i < iArr.length; i++){
        LinSearch.linSearch(iArr, iArr[i]); // runs linear search on each element of iArr
      }
      long elapsedTime = System.currentTimeMillis() - startTime;
      return elapsedTime / iArr.length;
    }

    public static void main(String[] args){
      for (int i = 0; i < iArr.length; i++){
        iArr[i] = i*2;
      }

    }

}
