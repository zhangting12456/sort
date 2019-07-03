/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Insert
 * Author:   nineclient
 * Date:     2019/7/3 11:26
 * Description: 插入排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈插入排序〉
 *
 * @author nineclient
 * @create 2019/7/3
 * @since 1.0.0
 */
public class Insert {
    public static void main(String[] args) {
        int initArray[] = {1,5,8,7,5,3,2,4,6,9,0,5};
    }
    public static void insertSort(int [] initArray){
        int size = initArray.length;
        int temp ;
        for(int i =0 ;i< size ; i++){
            temp = initArray[i];
            for(int j = i ; j>0&&temp<initArray[j-1];j--){
                initArray[j] = initArray[j-1];
                initArray[j] = temp;
            }
        }
        for (int i =0 ;i<size ;i++){
            System.out.print(initArray[i]+" ");
        }
    }
}