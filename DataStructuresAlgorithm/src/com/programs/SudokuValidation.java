package com.programs;
import java.util.Scanner;

public class SudokuValidation {
    public static Boolean rowValidation(int[][] inputRowGrid){
        int[] totalNoGrid = {1,2,3,4,5,6,7,8,9};
        int rowCount = 0;
        for(int gridRow =0;gridRow<9;gridRow++){
        for(int iRow = 0; iRow<9; iRow++){
            rowCount = 0;
            
            for(int iColumn =0;iColumn<9;iColumn++){
                if(totalNoGrid[iRow] == inputRowGrid[gridRow][iColumn]){
                        rowCount++;
                }
            }
            if(rowCount>1 || rowCount ==0){
                    return false;
                }
                else if(rowCount == 1){
                    continue;
                }
        }
    }
        return true;
    }
    public static Boolean columnValidation(int[][] inputColumnGrid){
        int[] totalNoGrid = {1,2,3,4,5,6,7,8,9};
        int rowCount = 0;
        for(int gridRow =0;gridRow<9;gridRow++){
        for(int iRow = 0; iRow<9; iRow++){
            rowCount = 0;
            
            for(int iColumn =0;iColumn<9;iColumn++){
                if(totalNoGrid[iRow] == inputColumnGrid[iColumn][gridRow]){
                        rowCount++;
                }
            }
            if(rowCount>1 || rowCount ==0){
                    return false;
                }
                else if(rowCount == 1){
                    continue;
                }
        }
    }
        return true;
    }
    public static Boolean threeCrossThreeValidation(int[][] inputGrid){
        int[] totalNoGrid = {1,2,3,4,5,6,7,8,9};
        int flag =0;
        for(int m=0;m<9;m+=3){
            for(int iRow=0;iRow<9;iRow++){
                flag =0;
                for(int x=0;x<3;x++){
                    for(int y=0+m;y<3+m;y++){
                
                        if(totalNoGrid[iRow] == inputGrid[x][y]){
                            flag++;

                    }
                }
                

            }
            if(flag>1 || flag==0){
                    return false;
                }
                else if(flag ==1){
                    continue;
                }
        }
         for(int iRow=0;iRow<9;iRow++){
                flag =0;
        for(int xx=3;xx<6;xx++){
            for(int yy=0+m;yy<3+m;yy++){
                if(totalNoGrid[iRow] == inputGrid[xx][yy]){
                            flag++;

                    }
            }
        }
        if(flag>1 || flag==0){
                    return false;
                }
                else if(flag ==1){
                    continue;
                }
    }
     for(int iRow=0;iRow<9;iRow++){
                flag =0;
        for(int xxx=6;xxx<9;xxx++){
            for(int yyy=0+m;yyy<3+m;yyy++){
                if(totalNoGrid[iRow] == inputGrid[xxx][yyy]){
                            flag++;

                    }
            }
        }
        if(flag>1 || flag==0){
                    return false;
                }
                else if(flag ==1){
                    continue;
                }
    }
}
        return true;
    }
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        int[][] inputArray = new int[9][9];
        for(int i=0;i<9;i++)
        for(int j=0;j<9;j++)
        inputArray[i][j]=scanInput.nextInt();
        Boolean returnRowValidation = rowValidation(inputArray);
        System.out.println("Row Validation : " +returnRowValidation);
        Boolean returnColumnValidation = columnValidation(inputArray);
        System.out.println("Column Validation : "+returnColumnValidation);
        Boolean threeByValidation = threeCrossThreeValidation(inputArray);
        System.out.println("Three By Three Validation :" +threeByValidation);
        if(returnRowValidation && returnColumnValidation && threeByValidation){
            System.out.println("The given Sudoku numbers are valid.");
        }
        else{
            System.out.println("The given Sudoku is not valid.");
        }
    }
}