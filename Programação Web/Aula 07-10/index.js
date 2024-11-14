function escolha() {
    var numero = prompt("Insira um número: ");
        if (numero == null || numero == 0) {
            alert("Digite um valor válido!");
            return(escolha);
        }

    document.write("<select multiple style='height: 200px; width: 100px;'>")
        for (var n1 = 0; n1 <= numero; n1++) {
            if (n1 % 2 == 0) {
                document.write("<option>" + n1 + "</option>");
            }
        }
    document.write("</select>");

    document.write("<select multiple style='height: 200px; width: 100px; margin-left: 10px;'>")
        for (var n1 = 0; n1 <= numero; n1++) {
            if (n1 % 2 != 0) {
                document.write("<option>" + n1 + "</option>");
            }
        }
    document.write("</select>");

    document.write("<br><br><input type='button' value='Voltar' onclick='voltar()'>");
}

function voltar() {
    window.location.reload(true);
}