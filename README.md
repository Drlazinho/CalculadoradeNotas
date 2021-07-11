## Calculadora de Notas com Kotlin atualizada 📓
Aplicação simples baseada na Aula "Trabalhando com o Android Studio e Principais Ferramentas" da Digital Innovation One, o app calcula a média de 3 notas, na aula foi usado uma extensão que está sendo descontinuada durante o desenvolvimento do app o `Android.Kotlin.extensions`, substituir pelo recurso de  Vínculo de Visualizações `viewBinding` e também foi feita a depuração de falhas.

**Aprendizado**
- Objetivo de colocar em prática as novas práticas da linguagem, aprendido pela Lição 2 do Curso Android Studio.

**Dificuldades**
- Resolver que o app executasse com as notas nulas sem falhas.
- Fazer com o teclado desaparecesse depois de colocar a 3ª Nota
    
        private fun Calcular(){
        val stringNota1 = binding.Nota1.text.toString()
        var intNota1 = stringNota1.toDoubleOrNull()
        if (intNota1 == null){
            intNota1 = 0.0
        }
**Resultado**

<img src="https://media.giphy.com/media/4VQ7o56cMWHrZdkk7e/giphy.gif" width="209.7" height="512.6" >
