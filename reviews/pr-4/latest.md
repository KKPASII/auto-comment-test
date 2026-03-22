# PR Review Log

- Repository: KKPASII/auto-comment-test
- PR Number: #4
- Title: refactor: 반복 함수 로직 수정
- Action: opened
- Review At: 2026-03-23 01:10:21
- Diff File URL: https://github.com/KKPASII/auto-comment-test/pull/4/changes

## GPT Review

코드 리뷰 코멘트:

1. **문제점**: 현재 이중 루프를 사용하여 문자열 내 중복 문자를 확인하는 방식은 비효율적입니다. 문자열의 길이에 따라 O(n^2)의 시간 복잡도를 가지므로, 입력 문자열이 길어질 경우 성능 저하가 발생할 수 있습니다.

2. **개선 방향**: 중복 문자를 확인하기 위해 Set을 사용하여 시간 복잡도를 O(n)으로 줄이는 것이 좋습니다. Set은 중복된 값을 허용하지 않기 때문에, 문자열을 순회하면서 문자를 추가하고, 이미 존재하는 문자가 발견되면 중복이 있음을 즉시 반환할 수 있습니다.

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

4. **좋은 점**: 코드가 간결해지고, 가독성이 향상되었습니다. 그러나 위의 개선 방향을 통해 성능 또한 크게 향상될 수 있습니다. 

이와 같은 방식으로 코드를 수정하면 효율성과 가독성을 모두 개선할 수 있습니다.
