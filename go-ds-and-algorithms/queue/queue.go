package queue

import "fmt"

var queue = []string{}

func print(user, text string) {
	queue = append(queue, fmt.Sprintf("%s=> %s", user, text))
}

func handle() {
	for len(queue) > 0 {
		fmt.Printf("打印: %s。剩余：%d", queue[len(queue)-1], len(queue))
		queue = queue[:len(queue)-1]
	}
}
