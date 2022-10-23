public class ControleFluxo {
    public static void main(String[] args) {
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchDiaSemana();
        switchNumero();
        switchFerias();
    }
    
    private static void ifFlecha() {
        //Não é indicado usar essa metodologia porque o código fica confuso. Sempre se atentar as boas práticas.
        int mes = 9;
        
        if (mes == 1) {
            System.out.println("O mês é Janeiro");
        } else {
            if (mes == 2 ) {
                System.out.println("O mês é Fevereiro");
            } else {
                if (mes ==3) {
                    System.out.println("O mês é Março");
                } else {
                    if (mes == 4) {
                        System.out.println("O mês é Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("O mês é Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("O mês é Junho");
                            } else {
                            if (mes == 7) {
                                System.out.println("O mês é Julho");
                            } else {
                                if (mes == 8) {
                                    System.out.println("O mês é Agosto");
                                } else {
                                    if (mes == 9) {
                                        System.out.println("O mês é Setembro");
                                    } else {
                                        if (mes == 10) {
                                            System.out.println("O mês é Outubro");
                                        } else {
                                            if (mes == 11) {
                                                System.out.println("O mês é Novembro");
                                            } else {
                                                if (mes == 12) {
                                                    System.out.println("O mês é Dezembro");
                                                } else {
                                                    System.out.println("O mês informado é inválido");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }    
    }
   
    private static void ifSemFlecha() {
        //Método mais adequado para usar o if na mesma situação acima. Usando else if
        //o código fica mais limpo e evita o efeito flecha.
        int mes = 4;
        if (mes < 1 || mes > 12) {
            System.out.println("Mês informado é inválido");
        } else if (mes == 1) {
            System.out.println("O mês é Janeiro");
        } else if (mes == 2) {
            System.out.println("O mês é Fevereiro");
        } else if (mes == 3) {
            System.out.println("O mês é Março");
        } else if (mes == 4) {
            System.out.println("O mês é Abril");
        } else if (mes == 5) {
            System.out.println ("O mês é Maio");
        } else if (mes == 6) {
            System.out.println("O mês é Junho");
        } else if (mes == 7) {
            System.out.println("O mês é Julho");
        } else if (mes == 8) {
            System.out.println("O mês é  Agosto");
        } else if (mes == 9) {
            System.out.println("O mês é Setembro");
        } else if (mes == 10) {
            System.out.println("O mês é Outubro");
        } else if (mes == 11) {
            System.out.println("O mês é Novembro");
        } else if (mes == 12) {
            System.out.println("O mês é Dezembro");
        }
    }

    private static void ifFerias() {
        String mes = "julho";
        if (mes == "julho" || mes == "janeiro" || mes == "dezembro") {
            System.out.println("Férias!");
        }
    }

    private static void ifMenor() {
        double salarioMensal = 9500.5;
        double salarioMedio = 10500;
        
        int quantidadeDependentes = 4;
        int mediaDependentes = 2;
    
        if (salarioMensal < salarioMedio && quantidadeDependentes >= mediaDependentes) {
            System.out.println("Deve receber auxílio");
        }

        boolean salarioBaixo = salarioMensal < salarioMedio;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        if (salarioBaixo && muitosDependentes) {
            System.out.println("Deve receber auxílio");
        }
            
    }

    private static void switchDiaSemana() {
        String dia = "Terça";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça" :
                System.out.println(3);
                break;
            case "Quarta" :
                System.out.println(4);
                break;
            case "Quinta" :
                System.out.println(5);
                break;
            case "Sexta" :
                System.out.println(6);
                break;
            case "Sábado" :
                System.out.println(7);
                break;
            case "Domingo" :
                System.out.println(1);
                break;
            default :
                System.out.println("Dia inválido!");
                break;
        }
        }

    private static void switchNumero () {
        int numero = 4;

        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("O número está correto!");
                break;
            case 4:
                System.out.println("O número está errado!");
                break;
            case 5:
                System.out.println("Talvez seja esse número.");
                break;
            default:
                System.out.println("O número digitado é inválido. Tenta novamente!");
                break;
        }

    }

    private static void switchFerias() {
        String ferias = "Janeiro";
        switch (ferias) {
            case "Janeiro":
            case "Julho":
            case "Dezembro" :
                System.out.println("Férias!");
                break;
            default:
                System.out.println("Ainda não chegaram as férias :(");
                break;
        }
    }
}
