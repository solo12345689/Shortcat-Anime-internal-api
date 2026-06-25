package com.facebook.jni;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class MapIteratorHelper {
    private final Iterator<Map.Entry> mIterator;
    private Object mKey;
    private Object mValue;

    public MapIteratorHelper(Map map) {
        this.mIterator = map.entrySet().iterator();
    }

    boolean hasNext() {
        if (!this.mIterator.hasNext()) {
            this.mKey = null;
            this.mValue = null;
            return false;
        }
        Map.Entry next = this.mIterator.next();
        this.mKey = next.getKey();
        this.mValue = next.getValue();
        return true;
    }
}
