package exercise

func InsertArrayWrong(nums1, nums2 []int) []int {
	l1 := len(nums1)
	l2 := len(nums2)
	if l1 == 0 || l2 == 0 {
		return nil
	}

	var ret []int
	for _, n1 := range nums1 {
		for _, n2 := range nums2 {
			if n1 == n2 {
				ret = append(ret, n2)
			}
		}
	}
	return ret
}

func InsertArrayRight(nums1, nums2 []int) []int {
	l1 := len(nums1)
	l2 := len(nums2)
	if l1 == 0 || l2 == 0 {
		return nil
	}

	var ret []int
	for _, n1 := range nums1 {
		for _, n2 := range nums2 {
			if n1 == n2 {
				ret = append(ret, n2)
				break
			}
		}
	}
	return ret
}
