package src;

import java.util.Scanner;

public class Validador_Senhas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a senha: ");
		String senha = sc.nextLine();

		boolean temMaiuscula = false, temPrimo = false, temEspecial = false, vogalDuplicada = false;

		String especiais = "! @#$%^&*( )-_+={ }[ ]: ; \" ' < > ,.? / \\|~`" + "", vogais = "aeiouAEIOU";

		for (int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);
			if (Character.isUpperCase(c))
				temMaiuscula = true;
			if (Character.isDigit(c)) {
				int n = c - '0';
				if (n == 2 || n == 3 || n == 5 || n == 7)
					temPrimo = true;
			}

			if (especiais.contains(c + ""))
				temEspecial = true;
			if (i > 0 && vogais.indexOf(c) != -1 && senha.charAt(i - 1) == c)
				vogalDuplicada = true;
		}

		if (temMaiuscula && temPrimo && temEspecial && !vogalDuplicada)
			System.out.println("\nSenha informada é válida!");
		else
			System.out.println("Senha informada está inválida.");
	}
}
