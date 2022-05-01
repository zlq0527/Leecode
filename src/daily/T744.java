class Solution {
	public char nextGreatestLetter(char[] letters, char target) {
		int len = letters.length;
		if (target - letters[0] < 0) {
			return letters[0];
		}
		if (target - letters[len - 1] >= 0) {
			return letters[0];
		}
		int left = 0;
		int right = len;
		int mid = 0;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (target - letters[mid] > 0) {
				if (left == right) {
					return letters[mid + 1];
				}
				left = mid+1;
			} else if (target - letters[mid] < 0) {
				right = mid-1;
				if (left == right) {
					return letters[mid];
				}
			} else {
				if (letters[mid + 1] == letters[mid]) {
					while (letters[mid + 1] - letters[mid] == 0) {
						mid++;
					}
				}
				return letters[mid + 1];
			}
		}
		return letters[mid];
	}
}
