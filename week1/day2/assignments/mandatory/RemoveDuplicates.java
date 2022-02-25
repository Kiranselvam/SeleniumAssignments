package week1.day2.assignments.mandatory;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
        ArrayList<String> pets = new ArrayList<>();

        pets.add("cat");
        pets.add("dog");
        pets.add("cat");
        pets.add("hamster");

        System.out.println(pets);

        Set<String> hashSet = new LinkedHashSet(pets);
        ArrayList<String> removedDuplicates = new ArrayList(hashSet);

        System.out.println(removedDuplicates);
    }
}
