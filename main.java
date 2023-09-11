public class main {
    public static void main(String[] args) {
        int[] a1 = { 14, 12, 14, 6, 16, 15, 16, 15, 0, 8, 11, 11, 19, 2, 5, 8, 16, 6, 10, 13, 5, 2, 5, 9, 12, 6, 6, 4,
                9, 15, 2, 7, 5, 9, 18, 12, 18, 3, 4, 2, 14, 7, 8, 18, 2, 14, 15, 0, 3, 0, 15, 13, 0, 12, 1, 16, 7, 17,
                3, 12, 6, 17, 12, 2, 6, 14, 10, 7, 10, 14, 3, 14, 15, 7, 17, 16, 2, 3, 16, 7, 5, 5, 4, 7, 11, 13, 1, 18,
                15, 19, 0, 6, 5, 1, 17, 10, 10, 4, 8, 2 };

        int numberToDelete = 14;

        int[] result = xoa(a1, numberToDelete);

        // In mảng sau khi xóa
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] xoa(int[] a, int number) {
        int count = 0; // Số lần xuất hiện của số cần xoá
        for (int i : a) {
            if (i == number) {
                count++;
            }
        }

        int newSize = a.length - count; // Kích thước mới của mảng sau khi xoá
        int[] result = new int[newSize]; // Mảng mới

        int currentIndex = 0;
        for (int i : a) {
            if (i != number) {
                result[currentIndex++] = i;
            }
        }

        return result;
    }
}
