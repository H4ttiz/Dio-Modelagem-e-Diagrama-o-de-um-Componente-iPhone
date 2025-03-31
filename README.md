# Modelagem e Diagramação de um Componente iPhone

Desafio de POO (Programação Orientada a Objetos) - Digital Innovation One

**Professor:** Gleyson Sampaio

## 📱 Descrição do Projeto

Modelagem UML e implementação Java das funcionalidades básicas de um iPhone, baseado no lançamento de 2007, contemplando:

- Reprodutor Musical
- Aparelho Telefônico  
- Navegador na Internet

## 📊 Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +modelo: String
        +bateria: int
        +iPhone(modelo: String, bateria: int)
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
```
## Autor 
<table>
  <tr>
    <td>
      <img width="80px" align="center" src="https://avatars.githubusercontent.com/H4ttiz"/>
    </td>
    <td align="left">
      <a href="https://github.com/H4ttiz">
        <span><b>Leonardo Bezerra da Silva</b></span>
      </a>
      <br>
      <span>Desenvolvedor Back-end</span>
    </td>
  </tr>
</table>
