package tech.feily.nCoV;

import java.util.Scanner;

import tech.feily.nCoV.utils.CmdUtils;

/**
 * @author Feily Zhang
 * @version v0.01
 * @since
 *
 */
public class App  {
    
    static Scanner scan = new Scanner(System.in);
    static String cmdline = "";
    
    public static void main( String[] args ) throws InterruptedException {
        CmdUtils.welcome();
        while (true) {
            System.out.print("2019nCoV > ");
            cmdline = scan.nextLine();
            if (cmdline.equalsIgnoreCase("exit") || cmdline.equalsIgnoreCase("e")) {
                break;
            } else if (cmdline.equalsIgnoreCase("help") || cmdline.equalsIgnoreCase("h")) {
                CmdUtils.help();
            } else {
                CmdUtils.execute(cmdline);
            }
        }
        System.out.println("Thanks for your using. Bye~");
    }
}
