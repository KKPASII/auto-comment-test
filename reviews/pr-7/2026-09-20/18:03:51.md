# PR Review Log

- Repository: KKPASII/auto-comment-test
- PR Number: #7
- Title: refactor: 반복 함수 로직 수정
- Action: labeled
- Review At: 2026-09-20 18:03:51
- Diff File URL: https://github.com/KKPASII/auto-comment-test/pull/7/changes

## GPT Review

코드 리뷰 코멘트:

1. **문제점**: 현재 이중 루프를 사용하여 문자열의 중복 문자를 확인하는 방식은 비효율적입니다. 문자열의 길이가 n일 경우, 시간 복잡도가 O(n^2)로 증가하여 성능에 문제가 발생할 수 있습니다.

2. **개선 방향**: 중복 문자를 확인하기 위해 Set을 사용하여 시간 복잡도를 O(n)으로 줄이는 것이 좋습니다. Set에 문자를 추가하면서 중복 여부를 확인하면 더 효율적으로 처리할 수 있습니다.

3. **개선된 코드 예시**:
   ```java
   import java.util.HashSet;

   public class ContainsDuplicateChar {
       public static boolean hasDuplicate(String str) {
           HashSet<Character> charSet = new HashSet<>();
           for (char c : str.toCharArray()) {
               if (!charSet.add(c)) {
                   return true; // 중복 발견
               }
           }
           return false; // 중복 없음
       }
   }
   ```

4. **결론**: 코드가 간결해졌고 성능이 개선되었습니다. 현재 코드의 구조는 이해하기 쉽지만, 효율성을 고려하여 Set을 사용하는 방법으로 개선할 수 있습니다.
