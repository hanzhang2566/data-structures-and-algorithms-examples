package stack

import (
	"errors"
)

var (
	allBrackets = []byte{'(', ')', '[', ']', '{', '}'}
	braces      = map[byte]byte{
		')': '(',
		']': '[',
		'}': '{',
	}

	stack []byte
)

var HasRightNotLeft = errors.New("只有右括号，没有左括号")
var NotMatch = errors.New("左右括号不匹配")
var HasLeftNotRight = errors.New("只有左括号，没有右括号")

func BarcketMatch(text string) (bool, error) {
	for i := 0; i < len(text); i++ {
		if !contains(text[i]) {
			continue
		}
		value, ok := braces[text[i]]
		if !ok {
			stack = append(stack, text[i])
			continue
		}
		if len(stack) == 0 {
			return false, HasRightNotLeft
		}
		poll := stack[len(stack)-1]
		stack = stack[:len(stack)-1]
		if poll != value {
			return false, NotMatch
		}
	}
	if len(stack) != 0 {
		return false, HasLeftNotRight
	}
	return true, nil
}

func contains(c byte) bool {
	for _, bracket := range allBrackets {
		if bracket == c {
			return true
		}
	}
	return false
}
