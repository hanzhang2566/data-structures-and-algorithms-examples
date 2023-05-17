package list

type LinkedList struct {
	Head   *Node
	Length int
}

func NewLinkedList() LinkedList {
	return LinkedList{
		Head:   &Node{},
		Length: 0,
	}
}

func (list *LinkedList) Read(index int) *Node {
	curNode := list.Head.Next
	curIndex := 0
	for curNode != nil && curIndex < index {
		curNode = curNode.Next
		curIndex++
	}
	if curNode == nil {
		return nil
	}
	return curNode
}

func (list *LinkedList) Lookup(val int) *Node {
	curNode := list.Head.Next
	for curNode != nil {
		if val == curNode.Val {
			return curNode
		}
		curNode = curNode.Next
	}

	return nil
}

func (list *LinkedList) Insert(index int, val int) bool {
	if index < 0 || index > list.Length {
		return false
	}

	curIndex := 0
	curNode := list.Head
	for curIndex < index {
		curNode = curNode.Next
		curIndex++
	}
	node := Node{Val: val}
	node.Next = curNode.Next
	curNode.Next = &node
	list.Length++
	return true
}

func (list *LinkedList) Remove(index int) bool {
	if index < 0 || index > list.Length-1 {
		return false
	}

	curIndex := 0
	curNode := list.Head
	for curIndex < index {
		curNode = curNode.Next
		curIndex++
	}
	list.Length--
	return true
}
