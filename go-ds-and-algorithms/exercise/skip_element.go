package exercise

func SkipElementWrong(nums []int) []int {
	l := len(nums)
	var ret []int
	if l <= 1 {
		return append(ret, nums...)
	}

	for i, num := range nums {
		if i%2 == 0 {
			ret = append(ret, num)
		}
	}
	return ret
}

func SkipElementRight(nums []int) []int {
	l := len(nums)
	var ret []int
	if l <= 1 {
		return append(ret, nums...)
	}

	for i := 0; i < l; i = i + 2 {
		ret = append(ret, nums[i])
	}
	return ret
}
