public class No6 {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder("");
        }
        int incre = 1;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            sb[index].append(s.charAt(i));
            index += incre;
            if (index == numRows - 1) {
                incre = -1;
            }
            if (index == 0) {
                incre = 1;
            }
        }
        StringBuilder re = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            re.append(sb[i].toString());
        }
        return re.toString();
    }
}
