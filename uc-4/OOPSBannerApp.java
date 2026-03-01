public class OOPSBannerApp {

    public static void main(String[] args) {

        // 1. Create a String array of size 7
        String[] lines = new String[7];

        // 2. Populate each line using String.join()

        lines[0] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " ********",
                "  ****** "
        );

        lines[1] = String.join(" ",
                " **   ** ",
                " **   ** ",
                " **    **",
                " **    **"
        );

        lines[2] = String.join(" ",
                " **   ** ",
                " **   ** ",
                " **    **",
                " **      "
        );

        lines[3] = String.join(" ",
                " **   ** ",
                " **   ** ",
                " ********",
                "  *****  "
        );

        lines[4] = String.join(" ",
                " **   ** ",
                " **   ** ",
                " **      ",
                "       **"
        );

        lines[5] = String.join(" ",
                " **   ** ",
                " **   ** ",
                " **      ",
                " **    **"
        );

        lines[6] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " **      ",
                "  ****** "
        );

        // 3. Use enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}