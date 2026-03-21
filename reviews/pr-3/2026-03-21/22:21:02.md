# PR Review Log

- Repository: KKPASII/auto-comment-test
- PR Number: 3
- Title: refactor: 반복 함수 로직 수정
- Action: reopened
- Review At: 2026-03-21 22:21:02
- Diff URL: https://github.com/KKPASII/auto-comment-test/pull/3.diff

## GPT Review

코드 리뷰 코멘트:

1. **문제점**: 현재 이중 루프를 사용하여 문자열의 중복 문자를 확인하는 방식은 비효율적입니다. 시간 복잡도가 O(n^2)로, 문자열의 길이가 길어질수록 성능이 저하됩니다.

2. **개선 방향**: 중복 문자를 확인하는 더 효율적인 방법으로 `Set`을 사용할 수 있습니다. `Set`은 중복을 허용하지 않기 때문에, 문자열을 순회하면서 문자를 추가하고, 이미 존재하는 문자가 발견되면 중복이 있다는 것을 쉽게 확인할 수 있습니다.

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

4. **좋은 점**: 코드의 가독성이 좋고, 문자열 길이에 관계없이 중복 여부를 빠르게 확인할 수 있는 방법으로 개선할 수 있습니다. 

이러한 개선을 통해 성능을 크게 향상시킬 수 있습니다.
