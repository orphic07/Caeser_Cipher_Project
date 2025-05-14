public class Cypher {

    public static String encrypt (StringBuilder fileContent, int key, char[] alphabet){

        StringBuilder alphabetSB = new StringBuilder(String.valueOf(alphabet));
        String line = fileContent.toString();

        StringBuilder encryptedText = new StringBuilder();

        for (char x : line.toCharArray()){

            int position = alphabetSB.indexOf(String.valueOf(x));

            if (position != -1) {

                int newPosition = (position + key) % Alphabet.ENGLISH_ALPHABET.length;
                char encryptedChar = alphabetSB.charAt(newPosition);
                encryptedText.append(encryptedChar);

            } else {
                encryptedText.append(x);
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(StringBuilder fileContent, int key, char[] alphabet){

        StringBuilder alphabetSB = new StringBuilder(String.valueOf(alphabet));
        String line = fileContent.toString();

        StringBuilder decryptedText = new StringBuilder();

        for (char x : line.toCharArray()){

            int position = alphabetSB.indexOf(String.valueOf(x));

            if (position != -1) {

                int newPosition = (position - key + Alphabet.ENGLISH_ALPHABET.length) % Alphabet.ENGLISH_ALPHABET.length;
                char decryptedChar = alphabetSB.charAt(newPosition);
                decryptedText.append(decryptedChar);

            } else {
                decryptedText.append(x);
            }
        }

        return decryptedText.toString();
    }
}
