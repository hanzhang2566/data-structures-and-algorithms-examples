package sort

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestQuickSort(t *testing.T) {
	nums := []int{4, 2, 7, 1, 3}
	quickSort(nums, 0, len(nums)-1)
	assert.Equal(t, []int{1, 2, 3, 4, 7}, nums)
}
