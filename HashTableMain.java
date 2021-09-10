package HashMap;


public class HashTableMain {
	public static void findFrequency() {
		String sentence="To be or not to be";
		String[] words = sentence.toLowerCase().split(" ");
		
		HashTable <String,Integer> hashTable = new HashTable<>();
		for(String word:words) {
			Integer value = hashTable.get(word);
			if(value == null) 
				value = 1;
			else 
				value = value + 1;
			hashTable.add(word,value);
		}
		System.out.println(hashTable);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findFrequency();
	}

}