package exercise

import (
	"fmt"
	"testing"
)

func TestSkipWrong01(t *testing.T) {
	nums := []int{1, 2, 3, 4, 5, 6, 7, 8}
	result := SkipElementWrong(nums)
	fmt.Println(result)
}

func TestSkipWrong02(t *testing.T) {
	nums := []int{1, 2, 3, 4, 5, 6, 7, 8, 9}
	result := SkipElementWrong(nums)
	fmt.Println(result)
}

func TestSkipRight01(t *testing.T) {
	nums := []int{1, 2, 3, 4, 5, 6, 7, 8}
	result := SkipElementRight(nums)
	fmt.Println(result)
}

func TestSkipRight02(t *testing.T) {
	nums := []int{1, 2, 3, 4, 5, 6, 7, 8, 9}
	result := SkipElementRight(nums)
	fmt.Println(result)
}
