package com.facebook.jni;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class IteratorHelper {
    private Object mElement;
    private final Iterator mIterator;

    public IteratorHelper(Iterator it) {
        this.mIterator = it;
    }

    boolean hasNext() {
        if (this.mIterator.hasNext()) {
            this.mElement = this.mIterator.next();
            return true;
        }
        this.mElement = null;
        return false;
    }

    public IteratorHelper(Iterable iterable) {
        this.mIterator = iterable.iterator();
    }
}
