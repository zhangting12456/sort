/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Select
 * Author:   nineclient
 * Date:     2019/7/3 11:10
 * Description: 选择排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈选择排序〉
 *
 * @author nineclient
 * @create 2019/7/3
 * @since 1.0.0
 */
public class Select  {
    public static void main(String[] args) {
        int initArray[] = {1,5,8,7,5,3,2,4,6,9,0,5};
        selectSort(initArray);
    }
    public static void selectSort(int initArray[]){
        int temp ;
        for(int i = 0 ;i< initArray.length-1 ;i++){
            int k =i;
            for(int j=i+1 ; j<initArray.length;j++){
                if(initArray[j]<initArray[k]){
                    k = j;
                }
            }
            temp = initArray[i];
            initArray[i] =initArray[k] ;
            initArray[k] = temp;
        }
        for (int i =0 ;i<initArray.length ;i++){
            System.out.print(initArray[i]+" ");
        }
    }
}