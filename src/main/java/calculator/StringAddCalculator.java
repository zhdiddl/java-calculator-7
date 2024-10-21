package calculator;

public class StringAddCalculator {

    public static int add(String input) {
        InputValidator.validateNullInput(input);

        if (InputValidator.isEmptyString(input)) {
            return 0;
        }

        // 구분자 포맷 확인 후 추출
        String delimiter = DelimiterProcessor.extractDelimiter(input);

        // 커스텀 구분자 사용 시 길이 검증
        if (input.startsWith("//")) {
            InputValidator.validateCustomDelimiterInputLength(input);
        }
        // 기본 구분자 사용 시 길이 검증
        InputValidator.validateInputLength(input);

        // 음수 입력 검증
        InputValidator.validateNoNegativeNumbers(input);

        // 소수 입력 검증
        InputValidator.validateNoDecimalNumbers(input);

        return -1; // 추후 로직 추가 예정
    }
}
