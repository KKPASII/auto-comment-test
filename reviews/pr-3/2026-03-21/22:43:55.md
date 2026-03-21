# PR Review Log

- Repository: KKPASII/auto-comment-test
- PR Number: 3
- Title: refactor: 반복 함수 로직 수정
- Action: reopened
- Review At: 2026-03-21 22:43:55
- Diff File URL: https://github.comKKPASII/auto-comment-test/pull/3/changes

## GPT Review

코드 리뷰 코멘트:

1. **문제점**: 현재 이중 루프를 사용하여 문자열의 중복 문자를 확인하는 방식은 비효율적입니다. 문자열의 길이에 따라 O(n^2)의 시간 복잡도를 가지므로, 큰 문자열에 대해 성능 문제가 발생할 수 있습니다.

2. **개선 방향**: 중복 문자를 확인하는 더 효율적인 방법으로 `Set`을 사용할 수 있습니다. `Set`은 중복을 허용하지 않기 때문에, 문자열을 순회하면서 문자를 추가하고, 이미 존재하는 문자가 있을 경우 중복이 발생한 것으로 판단할 수 있습니다.

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

4. **좋은 점**: 코드가 간결해지고, 가독성이 향상되었습니다. 또한, `Set`을 사용하여 중복 확인 로직이 명확해졌습니다. 

5. **개선 포인트**: `str.length()`를 여러 번 호출하는 대신, `toCharArray()`를 사용하여 한 번에 배열로 변환하는 것이 좋습니다. 이로 인해 코드의 가독성이 더욱 향상됩니다.
