package sort

func insertSort(nums []int) {
	l := len(nums)
	if l <= 1 {
		return
	}

	for i, num := range nums {
		pos := i
		value := num
		for pos > 0 && nums[pos-1] > value {
			nums[pos] = nums[pos-1]
			pos--
		}
		nums[pos] = value
	}
}
