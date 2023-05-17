package sort

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestQuickSort(t *testing.T) {
	nums := []int{4, 2, 7, 1, 3}
	QuickSort(nums, 0, len(nums)-1)
	assert.Equal(t, []int{1, 2, 3, 4, 7}, nums)
}

func TestQuickSelect(t *testing.T) {
	nums := []int{4, 2, 7, 1, 3}
	index := quickSelect(nums, 0, len(nums)-1, 3)
	assert.Equal(t, 4, nums[index])
}

func TestQuickSelect02(t *testing.T) {
	nums := []int{0, 5, 2, 1, 6, 3}
	index := quickSelect(nums, 0, len(nums)-1, 3)
	assert.Equal(t, 3, nums[index])
}

func TestQuickSelect03(t *testing.T) {
	nums := []int{0}
	index := quickSelect(nums, 0, len(nums)-1, 3)
	assert.Equal(t, -1, index)
}
