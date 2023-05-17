package sort

func QuickSort(nums []int, head, tail int) {
	if head >= tail {
		return
	}
	pivotPos := partition(nums, head, tail)
	QuickSort(nums, head, pivotPos-1)
	QuickSort(nums, pivotPos+1, tail)
}

// 将切片进行一次快速排序，返回分隔索引
func partition(nums []int, head, tail int) int {
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
	return left
}

// 二分查找和快排的结合
func quickSelect(nums []int, head, tail, targetIndex int) int {
	if head >= tail {
		return -1
	}

	index := partition(nums, head, tail)
	if targetIndex < index {
		return quickSelect(nums, head, index-1, targetIndex)
	} else if targetIndex > index {
		return quickSelect(nums, index+1, tail, targetIndex)
	} else {
		return index
	}
}
