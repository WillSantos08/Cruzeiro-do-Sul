pilha = []
def inserir(x):
    pilha.append(x)

def remover():
    pilha.pop(0)

inserir('Prato A')
inserir('Prato B')
inserir('Prato C')
inserir('Prato D')

remover()

print(pilha)