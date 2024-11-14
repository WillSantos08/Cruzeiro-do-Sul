function cc() {
    let azul = document.getElementById('az');
    let amarelo = document.getElementById('am');
    let vermelho = document.getElementById('vr');

    azul.checked?document.getElementById('azul').style.backgroundColor = 'blue':document.getElementById('azul').style.backgroundColor = 'white';

    amarelo.checked?document.getElementById('amarelo').style.backgroundColor = 'yellow':document.getElementById('amarelo').style.backgroundColor = 'white';

    vermelho.checked?document.getElementById('vermelho').style.backgroundColor= 'red':document.getElementById('vermelho').style.backgroundColor = 'white';
}