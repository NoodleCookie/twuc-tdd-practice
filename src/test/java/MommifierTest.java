import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {

    @Test
    void create_vowels_method() {
        VowelsUtils vowelsUtils = new VowelsUtils();
    }


    @Test
    void should_return_origin_string_when_no_vowels() {
        // given
        String origin = "qqqqq";
        VowelsUtils vowelsUtils = new VowelsUtils();

        // when
        String result = vowelsUtils.replaceVowels(origin);

        // then
        Assertions.assertEquals(origin, result);
    }

    @Test
    void should_return_origin_string_when_all_vowels() {
        // given
        String origin = "aaa";
        VowelsUtils vowelsUtils = new VowelsUtils();

        // when
        String result = vowelsUtils.replaceVowels(origin);

        // then
        Assertions.assertEquals("mommy", result);
    }

    @Test
    void should_return_origin_string_when_have_vowels_and_more_than_30_percent_no_continues() {
        // given
        String origin = "aqa";
        VowelsUtils vowelsUtils = new VowelsUtils();

        // when
        String result = vowelsUtils.replaceVowels(origin);

        // then
        Assertions.assertEquals(origin, result);
    }



    @Test
    void should_return_origin_string_when_have_vowels_and_more_than_30_percent_continues() {
        // given
        String origin = "aaq";
        VowelsUtils vowelsUtils = new VowelsUtils();

        // when
        String result = vowelsUtils.replaceVowels(origin);

        // then
        Assertions.assertEquals("mommyq", result);
    }


//    @Test
//    void should_return_origin_string_when_have_vowels_less_than_30_percent() {
//        // given
//        String origin = "aqqq";
//        VowelsUtils vowelsUtils = new VowelsUtils();
//
//        // when
//        String result = vowelsUtils.replaceVowels(origin);
//
//        // then
//        Assertions.assertEquals(origin, result);
//    }


}
