package fangen;

import fangen.enums.FanDirection;

public class WingedFanPrinterQuadrupleSymmetry implements WingedFanPrinter {

    private CharMap wingMap;
    private char[][] tab;

    public WingedFanPrinterQuadrupleSymmetry(CharMap wingMap) {
        this.wingMap = wingMap;
    }

    @Override
    public void printFan(int count, FanDirection fanDirection) {
        count = count * 2;
        tab = new char[count][count];
        if (fanDirection.equals(FanDirection.RightFan)){
            createRightFangen(count);
        }
        else if (fanDirection.equals(FanDirection.LeftFan)){
            leftFangen(count);
        }
    }

    private void createRightFangen(int count) {


        for (int i = 0; i < count; ++i) {
            for (int j = 0; j < count; ++j) {

                if (i < count / 2) {

                    if (j < count / 2) {
                        if (j < i + 1)
                            tab[i][j] = wingMap.getStar();
                        else
                            tab[i][j] = wingMap.getDot();
                    } else {
                        if (j < count - i)
                            tab[i][j] = wingMap.getStar();
                        else
                            tab[i][j] = wingMap.getDot();
                    }
                } else {

                    if (j < count / 2) {
                        if (j >= count - i - 1)
                            tab[i][j] = wingMap.getStar();
                        else
                            tab[i][j] = wingMap.getDot();
                    } else {
                        if (j >= i)
                            tab[i][j] = wingMap.getStar();
                        else
                            tab[i][j] = wingMap.getDot();
                    }
                }


            }

        }

        print(count,tab);

    }

    private void print(int count, char tab[][]){
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j == count - 1)
                    System.out.println(tab[i][j]);
                else
                    System.out.print(tab[i][j]);
            }
        }
    }

    private void leftFangen(int count) {
        for (int i = 0; i < count; ++i) {
            for (int j = 0; j < count; ++j) {
                if (i < count / 2) {
                    // Lewy gorny
                    if (j < count / 2) {
                        if (j >= i)
                            tab[i][j] = wingMap.getStar();
                        else
                            tab[i][j] = wingMap.getDot();

                    }
                    // Prawy gorny
                    else {
                        if (j >= count - i - 1)
                            tab[i][j] = wingMap.getStar();
                        else
                            tab[i][j] = wingMap.getDot();

                    }
                } else {
                    // Lewy dolny
                    if (j < count / 2) {
                        if (j < count - i)
                            tab[i][j] = wingMap.getStar();
                        else
                            tab[i][j] = wingMap.getDot();

                    }
                    // Prawy dolny
                    else {
                        if (j <= i)
                            tab[i][j] = wingMap.getStar();
                        else
                            tab[i][j] = wingMap.getDot();
                    }
                }
            }
        }

        print(count,tab);
    }
}
