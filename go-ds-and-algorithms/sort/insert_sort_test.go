package sort

import (
	"fmt"
	"testing"
)

func TestInsertSort(t *testing.T) {
	nums := []int{4, 2, 7, 1, 3}
	insertSort(nums)
	fmt.Println(nums)
}
