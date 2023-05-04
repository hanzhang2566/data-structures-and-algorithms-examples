package exercise

func DupArrayWrong(nums1, nums2 []int) []int {
	var result []int
	for _, n1 := range nums1 {
		for _, n2 := range nums2 {
			if n1 == n2 {
				result = append(result, n1)
			}
		}
	}
	return result
}

func DupArrayRight(nums1, nums2 []int) []int {
	var result []int
	for _, n1 := range nums1 {
		for _, n2 := range nums2 {
			if n1 == n2 {
				result = append(result, n1)
				break
			}
		}
	}
	return result
}
