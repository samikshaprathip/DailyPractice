class Solution {
    public int numUniqueEmails(String[] emails) {
         Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (String s : emails) {
            boolean bitplus = false;
            boolean bitat = false;
            for (char c : s.toCharArray()) {
                if (bitat) {
                    sb.append(c);
                    continue;
                }
                if (c == '@') {
                    bitat = true;
                    sb.append(c);
                    continue;
                }
                if (bitplus) continue;
                if (c == '.')
                    continue;
                if (c == '+') {
                    bitplus = true;
                    continue;
                }
                sb.append(c);
            }
            if (!set.contains(sb.toString())) set.add(sb.toString());
            sb.setLength(0);
        }
        return set.size();
    }
}