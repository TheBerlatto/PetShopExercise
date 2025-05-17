public class PetMachine {

    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está cheirosinho!");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de água da máquina está no nível máximo.");
            return;
        }

        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no nível máximo.");
            return;
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja! Para colocar o pet é necessário limpá-la.");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina neste momento.");
            return;
        }

        this.pet = pet;
    }

    public void removePet(){
        this.clean = !this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " está limpo!");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina está limpa!");
    }
}
