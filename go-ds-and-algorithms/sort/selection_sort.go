package sort

func selectionSort(nums []int) {
	l := len(nums)
	if l <= 1 {
		return
	}

	for i := 0; i < l; i++ {
		min := i
		for j := i + 1; j < l; j++ {
			if nums[min] > nums[j] {
				min = j
			}
		}
		// 如果 min 就是最小元素，就不交换了
		if min != i {
			nums[i], nums[min] = nums[min], nums[i]
		}
	}
}
