public class SearchDriver{
    public static void main(String[] args){
      Comparable[] iArr = new Integer[10000];
      for (int i = 0; i < iArr.length; i++){
        iArr[i] = i * 2;
      }

      long init = System.nanoTime();

      LinSearch.linSearch(iArr, 2834);

      System.out.println("elapsed time: " + (System.nanoTime() - init));
    }

}
