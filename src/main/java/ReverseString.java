class ReverseString {

    String reverse(String inputString) {
        String revString = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            revString = revString + inputString.charAt(i);
        }

        return revString;
    }
}