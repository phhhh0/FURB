import pandas as pd
import matplotlib.pyplot as plt
from matplotlib_venn import venn3

# Passo 1: Criando a tabela com os dados fornecidos
dados = {
    'Estado': ['São Paulo', 'Minas Gerais', 'Rio de Janeiro', 'Rio Grande do Sul', 
               'Paraná', 'Santa Catarina', 'Bahia', 'Pernambuco', 'Ceará', 'Amazonas'],
    'Automobilística': ['Sim', 'Sim', 'Não', 'Sim', 'Sim', 'Não', 'Sim', 'Sim', 'Não', 'Não'],
    'Têxtil': ['Sim', 'Sim', 'Sim', 'Sim', 'Sim', 'Sim', 'Sim', 'Sim', 'Sim', 'Sim'],
    'Petroquímica': ['Sim', 'Não', 'Sim', 'Sim', 'Não', 'Não', 'Sim', 'Não', 'Não', 'Sim']
}

# Convertendo o dicionário para um DataFrame
df = pd.DataFrame(dados)

# Passo 2: Definindo os conjuntos A, B e C
A = set(df[df['Automobilística'] == 'Sim']['Estado'])
B = set(df[df['Têxtil'] == 'Sim']['Estado'])
C = set(df[df['Petroquímica'] == 'Sim']['Estado'])

# Imprimindo os conjuntos A, B e C
print("Conjunto A (Automobilística):", A)
print("Conjunto B (Têxtil):", B)
print("Conjunto C (Petroquímica):", C)

# Passo 3: Operações com Conjuntos
# União de A, B e C
uniao_ABC = A.union(B).union(C)

# Interseção de A e B
intersecao_AB = A.intersection(B)

# Diferença entre A e C
diferenca_AC = A.difference(C)

# Imprimindo os resultados das operações
print("União de A, B e C:", uniao_ABC)
print("Interseção de A e B:", intersecao_AB)
print("Diferença entre A e C:", diferenca_AC)

# Passo 4: Complementar, Subconjuntos e Relação de Pertinência
# Complementar de A (estados sem indústria automobilística)
todos_estados = set(df['Estado'])
complementar_A = todos_estados.difference(A)

# Verificando se B é subconjunto de A
subconjunto_AB = B.issubset(A)

# Verificando relação de pertinência
pertinencia_sao_paulo = "São Paulo" in A

# Imprimindo os resultados das perguntas
print("Complementar de A (estados sem indústria automobilística):", complementar_A)
print("B é subconjunto de A:", subconjunto_AB)
print("São Paulo pertence ao conjunto A?", pertinencia_sao_paulo)

# Passo 5: Diagrama de Venn
# Criando o diagrama de Venn para A, B e C
venn3([A, B, C], set_labels=('Automobilística', 'Têxtil', 'Petroquímica'))
plt.title("Diagrama de Venn: Indústrias nos Estados")
plt.show()
