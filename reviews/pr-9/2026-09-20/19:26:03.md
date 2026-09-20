# PR Review Log

- Repository: KKPASII/auto-comment-test
- PR Number: #9
- Title: refactor: 반복 함수 로직 수정
- Action: labeled
- Review At: 2026-09-20 19:26:03
- Diff File URL: https://github.com/KKPASII/auto-comment-test/pull/9/changes

## GPT Review

코드 리뷰 코멘트:

1. **문제점**: 현재 이중 루프를 사용하여 문자열 내 중복 문자를 확인하는 방식은 비효율적입니다. 시간 복잡도가 O(n^2)로, 문자열 길이가 길어질수록 성능 저하가 발생할 수 있습니다.

2. **개선 방향**: 중복 문자를 확인하기 위해 Set을 사용하면 시간 복잡도를 O(n)으로 줄일 수 있습니다. Set에 문자를 추가하면서 중복 여부를 체크하면 더 효율적으로 문제를 해결할 수 있습니다.

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

4. **결론**: 코드가 잘 작성되었지만, 성능 개선을 위해 Set을 활용하는 방법을 고려해보세요. 이로 인해 코드의 가독성도 향상될 것입니다.
