/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Bubbling
 * Author:   nineclient
 * Date:     2019/7/3 10:12
 * Description: 冒泡排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈冒泡排序〉
 *
 * @author nineclient
 * @create 2019/7/3
 * @since 1.0.0
 */
public class Bubbling {
    public static void main(String[] args) {
        int initArray[] = {1,5,8,7,5,3,2,4,6,9,0,5};
        int arraySize = initArray.length;
        int temp ;
        int n =0 ;
        for(int i=0 ;i<arraySize - 1 ; i++){
            for(int j = i+1 ; j < arraySize ; j++){
               if(initArray[i]<initArray[j]){
                   temp = initArray[i];
                   initArray[i] = initArray[j];
                   initArray[j] = temp;
               }
            }
        }
        for (int i =0 ;i<arraySize ;i++){
            System.out.print(initArray[i]+" ");
        }
    }
}