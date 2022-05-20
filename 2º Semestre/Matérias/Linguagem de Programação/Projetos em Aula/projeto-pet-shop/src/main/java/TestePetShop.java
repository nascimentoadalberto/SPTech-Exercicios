public class TestePetShop {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Nina", "Siamês");
        Pet pet2 = new Pet("Leo", "Pelo Curto Brasileiro");
        Pet pet3 = new Pet("Rex", "Rotweiller");

        PetShop petShop = new PetShop("El Gato");

        petShop.darBanho(pet1, 75.00);
        petShop.darBanho(pet2, 60.00);
        petShop.darBanhoDesconto(pet2, 60.00, 10);
        petShop.darBanho(pet2, 60.00);
        petShop.darBanhoDesconto(pet2, 60.00, 15);
        petShop.darBanho(pet3, 150.00);
        petShop.darBanhoDesconto(pet3, 150.00,10);
        petShop.darBanho(pet3, 150.00);
        petShop.darBanhoDesconto(pet3, 150.00,15);
        petShop.darBanho(pet3, 150.00);
        petShop.darBanhoDesconto(pet3, 150.00,20);


        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);

    }
}
