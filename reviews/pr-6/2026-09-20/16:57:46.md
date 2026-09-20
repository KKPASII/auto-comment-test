# PR Review Log

- Repository: KKPASII/auto-comment-test
- PR Number: #6
- Title: refactor: 반복 함수 로직 수정
- Action: labeled
- Review At: 2026-09-20 16:57:46
- Diff File URL: https://github.com/KKPASII/auto-comment-test/pull/6/changes

## GPT Review

코드 리뷰 코멘트:

1. **문제점**: 현재 이중 루프를 사용하여 문자열 내의 중복 문자를 확인하는 방식은 비효율적입니다. 문자열의 길이에 따라 O(n^2)의 시간 복잡도를 가지므로, 입력 문자열이 길어질 경우 성능 저하가 발생할 수 있습니다.

2. **개선 방향**: 중복 문자를 확인하는 더 효율적인 방법으로 `Set`을 사용할 수 있습니다. `Set`은 중복된 값을 허용하지 않기 때문에, 문자열을 순회하면서 각 문자를 `Set`에 추가하고, 이미 존재하는 경우 중복이 발생했다고 판단할 수 있습니다.

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

4. **좋은 점**: 코드가 간결해지고, 가독성이 향상되었습니다. `Set`을 사용함으로써 중복 체크가 더 효율적으로 이루어집니다. 

5. **개선 포인트**: `str.length()`를 여러 번 호출하는 대신, `toCharArray()`를 사용하여 문자열을 한 번만 순회하는 방식으로 개선할 수 있습니다. 

이러한 변경을 통해 성능과 가독성을 모두 향상시킬 수 있습니다.
