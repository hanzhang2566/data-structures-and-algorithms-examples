package sort

import (
	"fmt"
	"testing"
)

func TestBubbleSort01(t *testing.T) {
	nums := []int{4, 2, 7, 1, 3}
	bubbleSort(nums)
	fmt.Println(nums)
}
