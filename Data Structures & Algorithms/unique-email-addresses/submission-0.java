class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> ss=new HashSet<>();
        for(String s:emails){
            String[] parts=s.split("@");
            String local=parts[0];
            String domain=parts[1];

            local=local.split("\\+")[0];
            local=local.replace(".","");
            String a=local+"@"+domain;
            ss.add(a);
        }
        return ss.size();
    }
}