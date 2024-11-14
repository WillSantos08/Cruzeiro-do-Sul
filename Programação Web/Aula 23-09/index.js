function calcularParcelas() {
    let resultElement = document.getElementById('resultCalculo');
    let valorCompra = parseFloat(document.getElementById('valorCompra').value);
    let numeroParcelas = parseInt(document.getElementById('numeroParcelas').value);

    let resultCalculo;

    switch (numeroParcelas) {
        case 0:
            resultCalculo = valorCompra;
            break;
        case 1:
            resultCalculo = (valorCompra / 2);
            break;
        case 2:
            resultCalculo = (valorCompra / 3);
            break;
        case 3:
            resultCalculo = (valorCompra / 4);
            break;
        case 4:
            resultCalculo = (valorCompra / 5);
            break;
        case 5:
            resultCalculo = (valorCompra / 6);
            break;
        case 6:
            resultCalculo = (valorCompra / 7);
            break;
        case 7:
            resultCalculo = (valorCompra / 8);
            break;
        case 8:
            resultCalculo = (valorCompra / 9);
            break;
        case 9:
            resultCalculo = (valorCompra / 10);
            break;
        case 10:
            resultCalculo = (valorCompra / 11);
            break;
        case 11:
            resultCalculo = (valorCompra / 12);
            break;
        default:
            alert('Erro Detectado!');
            return;
    }
    resultElement.innerText = resultCalculo.toFixed(2);
}