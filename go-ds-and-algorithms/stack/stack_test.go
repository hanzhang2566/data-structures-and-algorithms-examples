package stack

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestBarcketMatch01(t *testing.T) {
	text := "hello"
	match, err := BarcketMatch(text)
	assert.Nil(t, err)
	assert.True(t, match)
}

func TestBarcketMatch02(t *testing.T) {
	text := "(hello]"
	match, err := BarcketMatch(text)
	assert.Equal(t, NotMatch, err)
	assert.False(t, match)
}

func TestBarcketMatch03(t *testing.T) {
	text := "(hello"
	match, err := BarcketMatch(text)
	assert.Equal(t, HasLeftNotRight, err)
	assert.False(t, match)
}

func TestBarcketMatch04(t *testing.T) {
	text := "[(hello"
	match, err := BarcketMatch(text)
	assert.Equal(t, HasLeftNotRight, err)
	assert.False(t, match)
}

func TestBarcketMatch05(t *testing.T) {
	text := "hello)"
	match, err := BarcketMatch(text)
	assert.Equal(t, HasRightNotLeft, err)
	assert.False(t, match)
}

func TestBarcketMatch06(t *testing.T) {
	text := "(hello)]"
	match, err := BarcketMatch(text)
	assert.Equal(t, HasRightNotLeft, err)
	assert.False(t, match)
}

func TestBarcketMatch07(t *testing.T) {
	text := "{[(hello)]}"
	match, err := BarcketMatch(text)
	assert.Nil(t, err)
	assert.True(t, match)
}

func TestBarcketMatch08(t *testing.T) {
	text := "{[(hello)]"
	match, err := BarcketMatch(text)
	assert.Equal(t, HasLeftNotRight, err)
	assert.False(t, match)
}

func TestBarcketMatch09(t *testing.T) {
	text := "[(hello)]}"
	match, err := BarcketMatch(text)
	assert.Equal(t, HasRightNotLeft, err)
	assert.False(t, match)
}
