# PR Review Log

- Repository: KKPASII/auto-comment-test
- PR Number: 3
- Title: refactor: 반복 함수 로직 수정
- Action: reopened
- Review At: 2026-03-21 22:47:37
- Diff File URL: https://github.com/KKPASII/auto-comment-test/pull/3/changes

## GPT Review

코드 리뷰 코멘트:

1. **문제점**: 현재 이중 루프를 사용하여 문자열의 중복 문자를 확인하는 방식은 비효율적입니다. 시간 복잡도가 O(n^2)로, 문자열의 길이가 길어질수록 성능 저하가 심각해질 수 있습니다.

2. **개선 방향**: 중복 문자를 확인하기 위해 Set을 사용하여 중복 여부를 효율적으로 체크하는 방법을 고려해보세요. 이렇게 하면 시간 복잡도를 O(n)으로 줄일 수 있습니다.

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

4. **결론**: 코드가 간결해졌고, 성능이 개선될 것입니다. 추가로, `result` 변수를 사용하지 않고 바로 반환하는 방식으로 코드를 더 깔끔하게 만들 수 있습니다.
