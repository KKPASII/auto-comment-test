# PR Review Log

- Repository: KKPASII/auto-comment-test
- PR Number: 3
- Title: refactor: 반복 함수 로직 수정
- Action: reopened
- Review At: 2026-03-21 22:40:47
- Diff File URL: https://github.comKKPASII/auto-comment-test/pull/3/files

## GPT Review

코드 리뷰 코멘트:

1. **문제점**: 현재 이중 루프를 사용하여 문자열의 중복 문자를 확인하는 방식은 비효율적입니다. 시간 복잡도가 O(n^2)로, 문자열의 길이가 길어질수록 성능이 저하됩니다.

2. **개선 방향**: 중복 문자를 확인하기 위해 Set을 사용하여 O(n) 시간 복잡도로 개선할 수 있습니다. Set에 문자를 추가하면서 이미 존재하는 경우 중복이 발생한 것으로 판단할 수 있습니다.

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

4. **좋은 점**: 코드가 간결해졌고, 가독성이 향상되었습니다. 그러나 중복 체크 로직을 더 효율적으로 개선할 수 있는 여지가 있습니다.

5. **간단한 개선 포인트**: `str.length()`를 반복적으로 호출하는 대신, 문자열을 한 번만 순회하여 중복을 체크하는 방식으로 변경하면 성능이 크게 향상됩니다.
