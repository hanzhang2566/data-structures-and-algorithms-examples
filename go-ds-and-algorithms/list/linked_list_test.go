package list

import (
	"fmt"
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestLinkedList_New01(t *testing.T) {
	list := NewLinkedList()
	assert.Equal(t, 0, list.Length)
}

func TestLinkedList_Read01(t *testing.T) {
	one := Node{Val: 1}
	two := Node{Val: 2}
	three := Node{Val: 3}
	four := Node{Val: 4}
	one.Next = &two
	two.Next = &three
	three.Next = &four

	head := Node{Val: 0}
	head.Next = &one
	list := LinkedList{
		Head:   &head,
		Length: 0,
	}
	assert.Equal(t, 2, list.Read(1).Val)
}

func TestLinkedList_Read02(t *testing.T) {
	one := Node{Val: 1}
	two := Node{Val: 2}
	three := Node{Val: 3}
	four := Node{Val: 4}
	one.Next = &two
	two.Next = &three
	three.Next = &four

	head := Node{Val: 0}
	head.Next = &one
	list := LinkedList{
		Head:   &head,
		Length: 0,
	}
	assert.Nil(t, list.Read(4))
}

func TestLinkedList_Lookup01(t *testing.T) {
	one := Node{Val: 1}
	two := Node{Val: 2}
	three := Node{Val: 3}
	four := Node{Val: 4}
	one.Next = &two
	two.Next = &three
	three.Next = &four

	head := Node{Val: 0}
	head.Next = &one
	list := LinkedList{
		Head:   &head,
		Length: 0,
	}
	lookup := list.Lookup(1)
	assert.Equal(t, 1, lookup.Val)
}

func TestLinkedList_Lookup02(t *testing.T) {
	one := Node{Val: 1}
	two := Node{Val: 2}
	three := Node{Val: 3}
	four := Node{Val: 4}
	one.Next = &two
	two.Next = &three
	three.Next = &four

	head := Node{Val: 0}
	head.Next = &one
	list := LinkedList{
		Head:   &head,
		Length: 0,
	}
	lookup := list.Lookup(5)
	assert.Nil(t, lookup)
}

// 头插法
func TestLinkedList_Insert01(t *testing.T) {
	head := Node{Val: 0}
	list := LinkedList{
		Head:   &head,
		Length: 0,
	}
	list.Insert(0, -1)
	list.Insert(0, -2)
	assert.Equal(t, 2, list.Length)
	fmt.Printf("%v", list.Head.Next)
}

// 尾插法
func TestLinkedList_Insert02(t *testing.T) {
	head := Node{Val: 0}
	list := LinkedList{
		Head:   &head,
		Length: 0,
	}
	list.Insert(list.Length, 1)
	list.Insert(list.Length, 2)
	assert.Equal(t, 2, list.Length)
	fmt.Printf("%v", list.Head.Next)
}

// 越界插入
func TestLinkedList_Insert03(t *testing.T) {
	head := Node{Val: 0}
	list := LinkedList{
		Head:   &head,
		Length: 0,
	}
	assert.False(t, list.Insert(-1, -1))
	assert.False(t, list.Insert(2, 2))
}

func TestLinkedList_Insert04(t *testing.T) {
	head := Node{Val: 0}
	list := LinkedList{
		Head:   &head,
		Length: 0,
	}
	list.Insert(0, -999)
	list.Insert(list.Length, 999)
	list.Insert(1, 1000)
	fmt.Printf("%v", list.Head.Next)
}

func TestLinkedList_Remove01(t *testing.T) {
	head := Node{Val: 0}
	list := LinkedList{
		Head:   &head,
		Length: 0,
	}
	assert.False(t, list.Remove(-1))
	assert.False(t, list.Remove(0))
	assert.False(t, list.Remove(1))
	assert.False(t, list.Remove(2))
}

func TestLinkedList_Remove02(t *testing.T) {
	head := Node{Val: 0}
	list := LinkedList{
		Head:   &head,
		Length: 0,
	}
	list.Insert(0, 1)
	list.Insert(0, 2)
	list.Remove(0)
	assert.Equal(t, 2, list.Read(0).Val)
}
