void main() {
    class Worker {
        private String name;
        private int baseSalary;
        private int salaryComplement;

        //Constructor con el mismo nombre de la clase
        public Worker(String name, int baseSalary, int salaryComplement) {
            setName(name);
            setBaseSalary(baseSalary);
            setSalaryComplement(salaryComplement);
        }

        public int getBaseSalary() {
            return baseSalary;
        }

        public void setBaseSalary(int baseSalary) {
            if (baseSalary <= 0)
                throw new IllegalArgumentException("Salary must be greater than zero");
            this.baseSalary = baseSalary;
        }

        public int getSalaryComplement() {
            return salaryComplement;
        }

        public void setSalaryComplement(int salaryComplement) {
            if (salaryComplement <= 0)
                throw new IllegalArgumentException("salary complement must be greater than zero");
            this.salaryComplement = salaryComplement;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name.trim().isEmpty())
                throw new IllegalArgumentException("name is empty");
            this.name = name;
        }

        // methods
        public int getGlobalTotalSalary() {
            return baseSalary + salaryComplement;
        }
    }

    // SI no se usan 100, sino 20, simplemente se cambia esta variable
    int totalWorkers = 100;

    Worker worker1 = new Worker("Juan Pérez", 2500, 400);
    Worker worker2 = new Worker("Ana Gómez", 3100, 550);

    // Aquí está una de las respuestas, una lista dinámica puede crecer, y le ponemos el 100 para que tenga mejor rendimiento
    List<Worker> workersList = new ArrayList<>(100);

    workersList.add(worker1);
    workersList.add(worker2);

    for (Worker worker : workersList) {
        System.out.println("Trabajador: " + worker.getName() + " - Salario total: " + worker.getGlobalTotalSalary() + " - Complemento: " + worker.getSalaryComplement());
    }
}