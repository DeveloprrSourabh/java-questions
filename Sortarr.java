class Sortarr{
    public static void divide(int arr[], int si, int ei){
if (si>=ei) {
    return;
}
       int mid = si +(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1 , ei);
    } 
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
    }
}