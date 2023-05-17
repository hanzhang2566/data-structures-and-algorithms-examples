package sort

func quickSort(nums []int, head, tail int) {
	if head >= tail {
		return
	}

	left := head
	right := tail
	for left < right {
		for left < right && nums[left] < nums[head] {
			left++
		}
		for left < right && nums[right] > nums[head] {
			right--
		}
		nums[left], nums[right] = nums[right], nums[left]
	}
	nums[left], nums[head] = nums[head], nums[left]
	quickSort(nums, head, left-1)
	quickSort(nums, left+1, tail)
}
