/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Quick
 * Author:   nineclient
 * Date:     2019/7/3 10:41
 * Description: 快速排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈快速排序〉
 *
 * @author nineclient
 * @create 2019/7/3
 * @since 1.0.0
 */
public class Quick {
    public static void main(String[] args) {
        int initArray[] = {1,5,8,7,5,3,2,4,6,9,0,5};
        int numbers [] = quickSort(initArray,0,initArray.length-1);
        for (int i =0 ;i<numbers.length ;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static int [] quickSort(int [] numbers,int start,int end){
        if (start < end) {
            int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）
            int temp; // 记录临时中间值
            int i = start, j = end;
            while (i <= j) {
                while ((numbers[i] < base) && (i < end)) {
                    i++;
                }
                while ((numbers[j] > base) && (j > start)) {
                    j--;
                }
                if (i <= j) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                    j--;
                }
            }
            if (start < j) {
                quickSort(numbers, start, j);
            }
            if (end > i) {
                quickSort(numbers, i, end);
            }
        }
        return numbers;
    }
}