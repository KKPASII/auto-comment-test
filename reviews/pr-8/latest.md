# PR Review Log

- Repository: KKPASII/auto-comment-test
- PR Number: #8
- Title: refactor: 반복 함수 로직 수정
- Action: labeled
- Review At: 2026-09-20 18:57:43
- Diff File URL: https://github.com/KKPASII/auto-comment-test/pull/8/changes

## GPT Review

코드 리뷰 코멘트:

1. **문제점**: 현재 이중 루프를 사용하여 문자열 내 중복 문자를 확인하는 방식은 비효율적입니다. 시간 복잡도가 O(n^2)로, 문자열 길이가 길어질수록 성능이 저하됩니다.

2. **개선 방향**: 중복 문자를 확인할 때, `Set`을 사용하여 O(n) 시간 복잡도로 구현할 수 있습니다. `Set`에 문자를 추가하면서 중복 여부를 체크하면 더 효율적입니다.

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

4. **좋은 점**: 코드가 간결해졌고, `str.length()`를 여러 번 호출하지 않고 한 번만 호출하는 점은 좋습니다. 

5. **개선 포인트**: 위의 개선된 방법을 적용하면 성능이 크게 향상될 것입니다. `Set`을 활용하여 중복 체크를 효율적으로 처리해보세요.
