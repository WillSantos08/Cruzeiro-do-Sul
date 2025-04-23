pilha = []
def inserir(x):
    pilha.insert(0,x)

def remover():
    pilha.pop()

inserir('Prato A')
inserir('Prato B')
inserir('Prato C')
inserir('Prato D')

remover()

print(pilha)