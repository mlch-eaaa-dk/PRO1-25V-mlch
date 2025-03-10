package ex4;

public class NameTester {

	public static void main(String[] args) {
		Name piotr = new Name("Piotr", "Suski");
		Name mateusz = new Name("Margrethe", "Mosbæk", "Dybdal");

		System.out.println(piotr.getFullName());
		System.out.println(mateusz.getFullName());
		System.out.println();

		System.out.println(piotr.userName());
		System.out.println(mateusz.userName());
		System.out.println();

		System.out.println(piotr.getInitials());
		System.out.println(mateusz.getInitials());
		System.out.println();

		System.out.println(piotr.getCryptoInitials(2));
		System.out.println(mateusz.getCryptoInitials(2));
		System.out.println();

		Name mikael = new Name("Mikael", "Lynghøj", "Christensen");
		System.out.println(mikael.getFullName());
		System.out.println(mikael.getInitials());
		System.out.println(mikael.getCryptoInitials(2));
	}
}
