public class Pet {
    private String nome;
    private String raca;
    private Integer quantVisitas;
    private Double totalGastos;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.quantVisitas = 0;
        this.totalGastos = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQuantVisitas() {
        return quantVisitas;
    }

    public void setQuantVisitas(Integer quantVisitas) {
        this.quantVisitas = quantVisitas;
    }

    public Double getTotalGastos() {
        return totalGastos;
    }

    public void setTotalGastos(Double totalGastos) {
        this.totalGastos = totalGastos;
    }

    @Override
    public String toString() {
        return "Pet {\n" +
                "   Nome do pet: " + nome +
                ",\n   Raça do pet: " + raca +
                ",\n   Quantidade de visitas: " + quantVisitas +
                ",\n   Total de gastos: " + totalGastos + "\n" +
                '}';
    }
}
