package exercise

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestInsertArrayWrong01(t *testing.T) {
	nums1 := []int{1, 2, 3}
	nums2 := []int{4, 5, 6, 7, 8}
	result := InsertArrayWrong(nums1, nums2)
	assert.Equal(t, 0, len(result))
}

func TestInsertArrayWrong02(t *testing.T) {
	nums1 := []int{1, 2, 3, 4}
	nums2 := []int{4, 5, 6, 7, 8}
	result := InsertArrayWrong(nums1, nums2)
	assert.Equal(t, 1, len(result))
}

func TestInsertArrayRight01(t *testing.T) {
	nums1 := []int{1, 2, 3}
	nums2 := []int{4, 5, 6, 7, 8}
	result := InsertArrayRight(nums1, nums2)
	assert.Equal(t, 0, len(result))
}

func TestInsertArrayRight02(t *testing.T) {
	nums1 := []int{1, 2, 3, 4}
	nums2 := []int{4, 5, 6, 7, 8}
	result := InsertArrayRight(nums1, nums2)
	assert.Equal(t, 1, len(result))
}
