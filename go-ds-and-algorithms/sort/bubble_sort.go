package sort

func bubbleSort(nums []int) {
	l := len(nums)
	if l <= 1 {
		return
	}

	flag := false
	for i := 0; i < l-1; i++ {
		for j := 0; j < l-1-i; j++ {
			if nums[j] > nums[j+1] {
				flag = true
				nums[j], nums[j+1] = nums[j+1], nums[j]
			}
		}
		if !flag {
			break
		}
		flag = false
	}
}
