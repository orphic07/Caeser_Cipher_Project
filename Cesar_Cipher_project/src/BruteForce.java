public class BruteForce {

    public static String crack(StringBuilder fileContent, char[] alphabet){

        StringBuilder possibleDecryptedText = new StringBuilder();

        for (int key = 0; key < Alphabet.ENGLISH_ALPHABET.length; key++) {

            String result = Cypher.decrypt(fileContent, key, alphabet);
            possibleDecryptedText.append("Key: ").append(key).append("\n");
            possibleDecryptedText.append(result).append("\n\n");

            }

        return possibleDecryptedText.toString();
    }
}
