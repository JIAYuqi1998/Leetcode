public class No12 {
    public String intToRoman(int num) {
        int m=0;
        int cm = 0;
        int d= 0;
        int cd = 0;
        int c = 0;
        int xc = 0;
        int l = 0;
        int xl = 0;
        int x = 0;
        int ix = 0;
        int v = 0;
        int iv = 0;
        int i = 0;
        m = num / 1000;
        num = num % 1000;
        if (num >= 900) {
            cm = 1;
            num = num - 900;
        } else {
            d = num / 500;
            num = num % 500;
        }

        if (num >= 400) {
            cd = 1;
            num = num - 400;
        } else {
            c= num / 100;
            num = num % 100;
        }
        if (num >= 90) {
            xc = 1;
            num = num - 90;
        } else {
            l = num / 50;
            num = num % 50;
        }
        if (num >= 40) {
            xl = 1;
            num = num - 40;
        } else {
            x = num / 10;
            num = num % 10;
        }
        if (num >= 9) {
            ix = 1;
            num = num - 9;
        } else {
            v = num / 5;
            num = num % 5;
        }
        if (num >= 4) {
            iv = 1;
            num = num - 4;
        } else {
            i = num / 1;
            num = num % 1;
        }
        return "M".repeat(m) + "CM".repeat(cm) +
                "D".repeat(d) + "CD".repeat(cd) + "C".repeat(c)
                + "XC".repeat(xc) + "L".repeat(l)+ "XL".repeat(xl) +
                "X".repeat(x) + "IX".repeat(ix) + "V".repeat(v) +
                "IV".repeat(iv) + "I".repeat(i);
    }
}
