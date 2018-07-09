/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asoftwareengineeringtask;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class ASoftwareEngineeringTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        sc.nextLine();
        char[][] grid=new char[rows][cols];
        for (int i=0;i<rows;i++) {
            String line=sc.nextLine();
            for (int j=0;j<cols;j++) {
                grid[i][j]=line.charAt(j);
            }
        }
        
        for (int i=0;i<100;i++) {
            swapGrid(grid,rows,cols);
        }
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    private static void swapGrid(char[][] grid,int rows,int cols) {
        for (int i=0;i<rows-1;i++) {
            for (int j=0;j<cols;j++) {
                if (grid[i][j]=='o' && grid[i+1][j]=='.') {
                    grid[i][j]='.';
                    grid[i+1][j]='o';
                }
            }
        }
    }
    
}
