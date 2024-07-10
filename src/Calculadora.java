import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "sim";
        
        while (continuar.equalsIgnoreCase("sim")) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            
            int escolha = scanner.nextInt();
            
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            double resultado = 0;
            boolean operaçãoValida = true;
            
            switch (escolha) {
                case 1:
                    resultado = adicionar(num1, num2);
                    break;
                case 2:
                    resultado = subtrair(num1, num2);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = dividir(num1, num2);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        operaçãoValida = false;
                    }
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    operaçãoValida = false;
                    break;
            }
            
            if (operaçãoValida) {
                System.out.println("Resultado: " + resultado);
            }
            
            System.out.print("Deseja fazer outra operação? (sim/não): ");
            continuar = scanner.next();
        }
        
        scanner.close();
        System.out.println("Calculadora encerrada.");
    }
    
    private static double adicionar(double a, double b) {
        return a + b;
    }
    
    private static double subtrair(double a, double b) {
        return a - b;
    }
    
    private static double multiplicar(double a, double b) {
        return a * b;
    }
    
    private static double dividir(double a, double b) {
        return a / b;
    }
}

