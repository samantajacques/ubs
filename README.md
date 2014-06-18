## Projeto UBS+

O Projeto UBS é um projeto de Flávia Arrais, Francisco Jardel, Samanta Jacques e Fellipe Soares como Trabalho de Conclusão de Curso do curso de Análise de Sistemas da Universidade Salgado de Oliveira - Campus São Gonçalo, orientado pelo Professor Sérgio Paiva Rodas

### Contribuindo com código

Tutorial instalar Git + GitHub no Windows: [Clique aqui] (http://blog.dmatoso.com/2011/09/git-no-windows-github/)

Faça as correções, alterações e mudanças que desejar e as coloque nessa pasta (nosso repositório local). Usuários do windows devem atentar para alguns cuidados:

* Não usar TABULAÇÃO no código (substitua por 4 espaços)
* Usar a quebra de linha no padrão Unix (apenas um LF)
* Os arquivos devem estar com charset UTF-8 SEM BOM 

Para fazer uma submissão use os seguintes comando no git (após as correções terem sido feitas é claro)

`git add .`

Esse comando carrega todas as alterações feitas. No lugar do ponto você pode indicar um arquivo em especifico.

`git commit -m "[UPD] seu comentário, seja o mais claro possível sobre o que mudou."`

Esse comando "commita" essas alterações e anexa o seu comentário.

SOCORRO ! Cometi um erro !!!

`git reset --hard HEAD~1`

Se você tiver cometido um erro e queira remover seu "commit" e as alterações efetuadas mas ainda não enviadas para o GitHub, pode usar o comando acima.

`git push origin master`

Esse comando envia a alteração para o seu repositório no GitHub

### Solicitando um "PULL REQUEST"

Agora que as alterações já foram enviadas para o seu repositório no GitHub é necessário solicitar que sejam inclusas no repositório do mantendor, para isso enviamos um "pull request" ao mantenedor.

Para isso vá a sua página no GitHub e clique em "Pull Request", será aberta uma página para que você descreva algum comentário para o mantenedor, preencha os campos e clique em "send Pull Request".

Pronto sua contribuição foi feita, agora depende no mantenedor aceita-la ou não.

### Mantendo seu repositório sincronizado com o do mantenedor

`git checkout -b upstream/master`

Este comando cria um novo branch, onde será colocado o pacote original do mantenedor

`git remote add upstream git://github.com/projetoUBS/ubs.git`

Este comando indica qual é a fonte de dados do repositório do mantenedor

`git pull upstream master`

Este comando baixa os arquivos do repositório do mantenedor. ATENÇÃO Este comando, e os indicados abaixo, deverão ser repetidos, digamos, diariamente, ou minimamente antes de fazer qualquer alteração em seu repositório, para manter seu repositório local sincronizado com o do mantenedor.

`git checkout master`

Este comando retorna o git para o branch "master"

`git merge upstream/master`

Este comando "funde" o repositório do mantenedor com o seu repositório master local
