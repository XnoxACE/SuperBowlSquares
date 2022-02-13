package superbowlnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SuperBowlNumbers {

    static String board[][] = {{" ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"},
    {"0", "", "", "", "", "", "", "", "", "", ""},
    {"1", "", "", "", "", "", "", "", "", "", ""},
    {"2", "", "", "", "", "", "", "", "", "", ""},
    {"3", "", "", "", "", "", "", "", "", "", ""},
    {"4", "", "", "", "", "", "", "", "", "", ""},
    {"5", "", "", "", "", "", "", "", "", "", ""},
    {"6", "", "", "", "", "", "", "", "", "", ""},
    {"7", "", "", "", "", "", "", "", "", "", ""},
    {"8", "", "", "", "", "", "", "", "", "", ""},
    {"9", "", "", "", "", "", "", "", "", "", ""}};

    static String name1;
    static String name2;
    static String name3;
    static String name4;
    static String name5;
    static String name6;
    static String name7;
    static String name8;
    static String name9;
    static String name10;

    static String name11;
    static String name12;
    static String name13;
    static String name14;
    static String name15;
    static String name16;
    static String name17;
    static String name18;
    static String name19;
    static String name20;

    static String name21;
    static String name22;
    static String name23;
    static String name24;
    static String name25;
    static String name26;
    static String name27;
    static String name28;
    static String name29;
    static String name30;

    static String name31;
    static String name32;
    static String name33;
    static String name34;
    static String name35;
    static String name36;
    static String name37;
    static String name38;
    static String name39;
    static String name40;

    static String name41;
    static String name42;
    static String name43;
    static String name44;
    static String name45;
    static String name46;
    static String name47;
    static String name48;
    static String name49;
    static String name50;

    static String name51;
    static String name52;
    static String name53;
    static String name55;
    static String name54;
    static String name56;
    static String name57;
    static String name58;
    static String name59;
    static String name60;

    static String name61;
    static String name62;
    static String name63;
    static String name64;
    static String name65;
    static String name66;
    static String name67;
    static String name68;
    static String name69;
    static String name70;

    static String name71;
    static String name72;
    static String name73;
    static String name74;
    static String name75;
    static String name76;
    static String name77;
    static String name78;
    static String name79;
    static String name80;

    static String name81;
    static String name82;
    static String name83;
    static String name84;
    static String name85;
    static String name86;
    static String name87;
    static String name88;
    static String name89;
    static String name90;

    static String name91;
    static String name92;
    static String name93;
    static String name94;
    static String name95;
    static String name96;
    static String name97;
    static String name98;
    static String name99;
    static String name100;

    static int numRow = 11;
    static int numColumn = 11;

    static int array[] = new int[10];
    static int array2[] = new int[10];
    static int Quarter = 1;

    public static void main(String[] args) {

        setArray1();
        setArray2();
        setNumbers();
        printBoard();
        nameInput();
        printBoard();
        int t1f = getTeam1Scores();
        int t2f = getTeam2Scores();
        getBigWinner(t1f%10, t2f%10);
        getSmallWinner(t1f%10, t2f%10);
        Quarter++;

        int t1s = getTeam1Scores();
        int t2s = getTeam2Scores();
        getBigWinner(t1s%10, t2s%10);
        getSmallWinner(t1s%10, t2s%10);
        Quarter++;

        int t1t = getTeam1Scores();
        int t2t = getTeam2Scores();
        getBigWinner(t1t%10, t2t%10);
        getSmallWinner(t1t%10, t2t%10);
        Quarter++;

        int t1four = getTeam1Scores();
        int t2four = getTeam2Scores();
        getBigWinner(t1four%10, t2four%10);
        getSmallWinner(t1four%10, t2four%10);
        Quarter++;

        if(Quarter == 5){
            boolean isOvertime;
            Scanner scan = new Scanner(System.in);
            System.out.println("Is there OverTime: Type YES if there is NO if there is not Overtime");
            String input = scan.nextLine();
            if(input == "YES"){
                int t1OT = getTeam1Scores();
                int t2OT = getTeam2Scores();
                System.out.println("Winners are:");
                getBigWinner(t1f%10, t2f%10);
                getSmallWinner(t1f%10, t2f%10);
                getBigWinner(t1s%10, t2s%10);
                getSmallWinner(t1s%10, t2s%10);
                getBigWinner(t1t%10, t2t%10);
                getSmallWinner(t1t%10, t2t%10);
                getBigWinner(t1four%10, t2four%10);
                getSmallWinner(t1four%10, t2four%10);
                getBigWinner(t1OT%10, t2OT%10);
                getSmallWinner(t1OT%10, t2OT%10);
                
            }
            else{
                System.out.println("Winners are:");
                getBigWinner(t1f%10, t2f%10);
                getSmallWinner(t1f%10, t2f%10);
                getBigWinner(t1s%10, t2s%10);
                getSmallWinner(t1s%10, t2s%10);
                getBigWinner(t1t%10, t2t%10);
                getSmallWinner(t1t%10, t2t%10);
                getBigWinner(t1four%10, t2four%10);
                getSmallWinner(t1four%10, t2four%10);
            }

        }

    }

    static void nameInput() {
        System.out.println("Enter names: ");
        Scanner name = new Scanner(System.in);

        board[1][1] = name1 = name.nextLine();
        board[1][2] = name2 = name.nextLine();
        board[1][3] = name3 = name.nextLine();
        board[1][4] = name4 = name.nextLine();
        board[1][5] = name5 = name.nextLine();
        board[1][6] = name6 = name.nextLine();
        board[1][7] = name7 = name.nextLine();
        board[1][8] = name8 = name.nextLine();
        board[1][9] = name9 = name.nextLine();
        board[1][10] = name10 = name.nextLine();

        board[2][1] = name11 = name.nextLine();
        board[2][2] = name12 = name.nextLine();
        board[2][3] = name13 = name.nextLine();
        board[2][4] = name14 = name.nextLine();
        board[2][5] = name15 = name.nextLine();
        board[2][6] = name16 = name.nextLine();
        board[2][7] = name17 = name.nextLine();
        board[2][8] = name18 = name.nextLine();
        board[2][9] = name19 = name.nextLine();
        board[2][10] = name20 = name.nextLine();

        board[3][1] = name21 = name.nextLine();
        board[3][2] = name22 = name.nextLine();
        board[3][3] = name23 = name.nextLine();
        board[3][4] = name24 = name.nextLine();
        board[3][5] = name25 = name.nextLine();
        board[3][6] = name26 = name.nextLine();
        board[3][7] = name27 = name.nextLine();
        board[3][8] = name28 = name.nextLine();
        board[3][9] = name29 = name.nextLine();
        board[3][10] = name30 = name.nextLine();

        board[4][1] = name31 = name.nextLine();
        board[4][2] = name32 = name.nextLine();
        board[4][3] = name33 = name.nextLine();
        board[4][4] = name34 = name.nextLine();
        board[4][5] = name35 = name.nextLine();
        board[4][6] = name36 = name.nextLine();
        board[4][7] = name37 = name.nextLine();
        board[4][8] = name38 = name.nextLine();
        board[4][9] = name39 = name.nextLine();
        board[4][10] = name40 = name.nextLine();

        board[5][1] = name41 = name.nextLine();
        board[5][2] = name42 = name.nextLine();
        board[5][3] = name43 = name.nextLine();
        board[5][4] = name44 = name.nextLine();
        board[5][5] = name45 = name.nextLine();
        board[5][6] = name46 = name.nextLine();
        board[5][7] = name47 = name.nextLine();
        board[5][8] = name48 = name.nextLine();
        board[5][9] = name49 = name.nextLine();
        board[5][10] = name50 = name.nextLine();

        board[6][1] = name51 = name.nextLine();
        board[6][2] = name52 = name.nextLine();
        board[6][3] = name53 = name.nextLine();
        board[6][4] = name54 = name.nextLine();
        board[6][5] = name55 = name.nextLine();
        board[6][6] = name56 = name.nextLine();
        board[6][7] = name57 = name.nextLine();
        board[6][8] = name58 = name.nextLine();
        board[6][9] = name59 = name.nextLine();
        board[6][10] = name60 = name.nextLine();

        board[7][1] = name61 = name.nextLine();
        board[7][2] = name62 = name.nextLine();
        board[7][3] = name63 = name.nextLine();
        board[7][4] = name64 = name.nextLine();
        board[7][5] = name65 = name.nextLine();
        board[7][6] = name66 = name.nextLine();
        board[7][7] = name67 = name.nextLine();
        board[7][8] = name68 = name.nextLine();
        board[7][9] = name69 = name.nextLine();
        board[7][10] = name70 = name.nextLine();

        board[8][1] = name71 = name.nextLine();
        board[8][2] = name72 = name.nextLine();
        board[8][3] = name73 = name.nextLine();
        board[8][4] = name74 = name.nextLine();
        board[8][5] = name75 = name.nextLine();
        board[8][6] = name76 = name.nextLine();
        board[8][7] = name77 = name.nextLine();
        board[8][8] = name78 = name.nextLine();
        board[8][9] = name79 = name.nextLine();
        board[8][10] = name80 = name.nextLine();

        board[9][1] = name81 = name.nextLine();
        board[9][2] = name82 = name.nextLine();
        board[9][3] = name83 = name.nextLine();
        board[9][4] = name84 = name.nextLine();
        board[9][5] = name85 = name.nextLine();
        board[9][6] = name86 = name.nextLine();
        board[9][7] = name87 = name.nextLine();
        board[9][8] = name88 = name.nextLine();
        board[9][9] = name89 = name.nextLine();
        board[9][10] = name90 = name.nextLine();

        board[10][1] = name91 = name.nextLine();
        board[10][2] = name92 = name.nextLine();
        board[10][3] = name93 = name.nextLine();
        board[10][4] = name94 = name.nextLine();
        board[10][5] = name95 = name.nextLine();
        board[10][6] = name96 = name.nextLine();
        board[10][7] = name97 = name.nextLine();
        board[10][8] = name98 = name.nextLine();
        board[10][9] = name99 = name.nextLine();
        board[10][10] = name100 = name.nextLine();
    }

    static void getBigWinner(int t1s, int t2s) {
        int row1 = 0;
        int column1 = 0;
        boolean cf = false;
        boolean rf = false;

        while (cf == false && rf == false) {
            for (int j = 1; j < numColumn; j++) {
                String boardIndex2 = board[j][0];
                int boardNum2 = Integer.parseInt(boardIndex2);

                if (boardNum2 == t2s) {
                    row1 = j;

                    cf = true;
                }
            }
            for (int j = 1; j < numColumn; j++) {
                String boardIndex = board[0][j];
                int boardNum = Integer.parseInt(boardIndex);

                if (boardNum == t1s) {
                    column1 = j;

                    cf = true;
                }
                //rf=true;
            }
        }
        System.out.println(" ");
        System.out.println("winner is " + board[row1][column1]);
    }

    static void getSmallWinner(int t1s, int t2s) {
        int row1 = 0;
        int column1 = 0;
        boolean cf = false;
        boolean rf = false;

        while (cf == false && rf == false) {
            for (int j = 1; j < numColumn; j++) {
                String boardIndex2 = board[0][j];
                int boardNum2 = Integer.parseInt(boardIndex2);

                if (boardNum2 == t2s) {
                    row1 = j;

                    cf = true;
                }
            }
            for (int j = 1; j < numColumn; j++) {
                String boardIndex = board[j][0];
                int boardNum = Integer.parseInt(boardIndex);

                if (boardNum == t1s) {
                    column1 = j;

                    cf = true;
                }
                //rf=true;
            }
        }
        
        System.out.println("small winner is " + board[column1][row1]);
    }

    static void setArray1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0; i < 10; i++) {

            array[i] = list.get(i);
        }
    }

    static void setArray2() {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }
        Collections.shuffle(list2);
        for (int i = 0; i < 10; i++) {

            array2[i] = list2.get(i);
        }
    }

    static void printBoard() {
        for (int i = 0; i < numRow; i++) {
            System.out.println(" ");
            for (int j = 0; j < numColumn; j++) {
                System.out.print(board[i][j] + " ");
            }
        }
    }

    static int getTeam1Scores() {
        Scanner teamScores = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Enter Team 1 score after Quarter " + Quarter);
        int t1f = teamScores.nextInt();
        return (t1f);

    }

    static int getTeam2Scores() {
        Scanner teamScores = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter Team 2 score after Quarter " + Quarter);
        int t2f = teamScores.nextInt();
        return (t2f);
    }

    static void setNumbers() {
        int num0 = array[0];
        int num1 = array[1];
        int num2 = array[2];
        int num3 = array[3];
        int num4 = array[4];
        int num5 = array[5];
        int num6 = array[6];
        int num7 = array[7];
        int num8 = array[8];
        int num9 = array[9];

        int num10 = array2[0];
        int num11 = array2[1];
        int num12 = array2[2];
        int num13 = array2[3];
        int num14 = array2[4];
        int num15 = array2[5];
        int num16 = array2[6];
        int num17 = array2[7];
        int num18 = array2[8];
        int num19 = array2[9];
        String num1s = Integer.toString(num0);
        String num2s = Integer.toString(num1);
        String num3s = Integer.toString(num2);
        String num4s = Integer.toString(num3);
        String num5s = Integer.toString(num4);
        String num6s = Integer.toString(num5);
        String num7s = Integer.toString(num6);
        String num8s = Integer.toString(num7);
        String num9s = Integer.toString(num8);
        String num10s = Integer.toString(num9);

        String num11s = Integer.toString(num10);
        String num12s = Integer.toString(num11);
        String num13s = Integer.toString(num12);
        String num14s = Integer.toString(num13);
        String num15s = Integer.toString(num14);
        String num16s = Integer.toString(num15);
        String num17s = Integer.toString(num16);
        String num18s = Integer.toString(num17);
        String num19s = Integer.toString(num18);
        String num20s = Integer.toString(num19);

        board[0][1] = num1s;
        board[0][2] = num2s;
        board[0][3] = num3s;
        board[0][4] = num4s;
        board[0][5] = num5s;
        board[0][6] = num6s;
        board[0][7] = num7s;
        board[0][8] = num8s;
        board[0][9] = num9s;
        board[0][10] = num10s;

        board[1][0] = num11s;
        board[2][0] = num12s;
        board[3][0] = num13s;
        board[4][0] = num14s;
        board[5][0] = num15s;
        board[6][0] = num16s;
        board[7][0] = num17s;
        board[8][0] = num18s;
        board[9][0] = num19s;
        board[10][0] = num20s;
    }

}
