package fangen;

import fangen.enums.FanDirection;
import fangen.enums.FanPrinterType;

import java.util.Scanner;

public class main {

    public static void main (String[] args) throws Exception
    {

            WingedFanPrinter fanPrinter = WingedFanPrinterFactory.getWingedFanPrinter(FanPrinterType.QuadrupleSymmetry);
            Scanner scanner = new Scanner(System.in);
            System.out.println("prowadz liczbe");
            int count = scanner.nextInt();
            if(count >=0 )
                fanPrinter.printFan(count, FanDirection.RightFan);
            else {
                count = Math.abs(count);
                fanPrinter.printFan(count, FanDirection.LeftFan);
            }

    }

}
