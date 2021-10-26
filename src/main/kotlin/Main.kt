fun main(args: Array<String>) {


    var valor = 0

    /*
   2 - O App deve calcular a comissão dos representantes de vendas com
   base neste gráfico usado pela loja de varejo:

Faixa de Vendas        Comissão
acima de R$10000    30%
R$5001 - R$9999        20%
R$1001 - R$4999        10%
abaixo de R$1000     N / D
     */


    println("Informe quanto vendeu")
    valor = readLine()!!.toInt()
    println(valor)

    if (valor > 10000) {

        println("comissao de ${valor*0.3}")
    }else if (valor >= 5001 && valor <= 9999) {
        println("comissao de ${valor*0.2}")

    }else if (valor >= 1001 && valor <= 4999) {
        println("comissao de ${valor * 0.1}")
    } else {
        print("Sem comissão")
    }




}