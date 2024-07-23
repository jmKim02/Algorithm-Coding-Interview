# 풀이1: 문자 단위 비교
## 주요 메서드
- `public static boolean isLetterOrDigit(char ch)`
  - 영숫자인지 판별해주는 메서드
  - `isLetterOrDigit(s.charAt(index))` 형태로 활용 가능
- `public static char toLowerCase(char ch)`
  - 입력값을 소문자로 변경해주는 메서드
  - `toLowerCase(s.charAt(index))` 형태로 활용 가능
<br/>

# 풀이2: 문자열 직접 비교
## 주요 메서드
- `public String replaceAll(String regex, String replacement)`
  - 문자열에서 정규식 패턴에 일치하는 모든 부분을 지정한 대체 문자로 치환
  - **[^A-Za-z0-9] 정규식**을 사용하여 알파벳과 숫자가 아닌 모든 문자를 제거 가능
  - `string.replaceAll("[^A-Za-z0-9]", "")` 형태로 활용 가능
- `public StringBuilder reverse()`
  - StringBuilder 클래스는 문자열을 변경할 수 있는 버퍼 제공
  - StringBuilder 안에 문자열을 뒤집을 수 있는 `reverse() 메서드`가 포함
  - `StringBuilder.reverse().toString()` 형태로 활용 가능

# 풀이1과 풀이2의 성능 비교 및 차이
