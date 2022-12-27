class Iterator {
    constructor(arr) {
        this.arr = arr;
        this.index = 0;
    }

    hasNext() {
        return this.index < this.arr.length;
    }

    next() {
        return this.arr[this.index++];
    }
};

class PeekingIterator {
    constructor(iterator) {
        this.iterator = iterator;
        this.peeked = null;
    }

    peek() {
        if (this.peeked === null) {
            this.peeked = this.iterator.next();
        }
        return this.peeked;
    }

    hasNext() {
        return this.peeked !== null || this.iterator.hasNext();
    }

    next() {
        if (this.peeked !== null) {
            let res = this.peeked;
            this.peeked = null;
            return res;
        }
        return this.iterator.next();
    }
};
