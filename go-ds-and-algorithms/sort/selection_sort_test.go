package sort

import (
	"fmt"
	"testing"
)

func TestSelectionSort01(t *testing.T) {
	nums := []int{4, 2, 7, 1, 3}
	selectionSort(nums)
	fmt.Println(nums)
}
