package exercise

import (
	"fmt"
	"testing"
)

func TestDupArrayWrong01(t *testing.T) {
	nums1 := []int{1, 2, 3}
	nums2 := []int{4, 5, 6, 7, 8}
	result := DupArrayWrong(nums1, nums2)
	fmt.Println(result)
}

func TestDupArrayWrong02(t *testing.T) {
	nums1 := []int{1, 2, 3, 4}
	nums2 := []int{4, 5, 6, 7, 8}
	result := DupArrayWrong(nums1, nums2)
	fmt.Println(result)
}

func TestDupArrayRight01(t *testing.T) {
	nums1 := []int{1, 2, 3}
	nums2 := []int{4, 5, 6, 7, 8}
	result := DupArrayRight(nums1, nums2)
	fmt.Println(result)
}

func TestDupArrayRight02(t *testing.T) {
	nums1 := []int{1, 2, 3, 4}
	nums2 := []int{4, 5, 6, 7, 8}
	result := DupArrayRight(nums1, nums2)
	fmt.Println(result)
}
