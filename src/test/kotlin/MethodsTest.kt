
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test


class MethodsTest {

    @Test
    fun `basic variables`() {
        val a = 10
        val b = 0 // ???

        assertThat(a+b, equalTo(13))
    }

    @Test
    fun `string concatenation`() {
        val name = ""
        val age = 0
        val phrase = "Mi nombre es $name y tengo $age años"

        assertThat(phrase, equalTo("Mi nombre es Pepe y tengo 86 años"))
    }

    @Test
    fun `change fruits for emojis (1)`() {
        val phrase = "Batido de fresa y plátano"

        val result = emojis(phrase)

        assertThat(result, equalTo("Batido de 🍓 y 🍌"))
    }


    @Test
    fun `change fruits for emojis (2)`() {
        val phrase = "La naranja tiene vitamina C, el kiwi también"

        val result = emojis(phrase)

        assertThat(result, equalTo("La 🍊 tiene vitamina C, el 🥝 también"))
    }
}