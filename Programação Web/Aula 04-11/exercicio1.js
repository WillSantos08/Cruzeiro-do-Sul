function soma() {
    // Pegando os valores dos inputs e convertendo para números
    let bread = parseFloat(document.getElementById('bread').value) || 0;
    let broas = parseFloat(document.getElementById('broas').value) || 0;

    // Calculando os valores
    let totalBread = bread * 0.12;
    let totalBroas = broas * 1.50;
    let totalGeral = totalBread + totalBroas;
    let totalPoupanca = totalGeral * 0.10;

    alert("Total de Pães - R$ " + totalBread.toFixed(2) + "\nTotal de Broas - R$ " + totalBroas.toFixed(2) + "\nTotal - R$ " + totalGeral.toFixed(2) + "\nValor da Poupança - R$ " + totalPoupanca.toFixed(2));
}
