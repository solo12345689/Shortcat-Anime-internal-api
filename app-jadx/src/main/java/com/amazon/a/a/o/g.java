package com.amazon.a.a.o;

import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<T, Object> f34729a = new WeakHashMap<>();

    public void a(T t10) {
        this.f34729a.put(t10, null);
    }

    public void b(T t10) {
        this.f34729a.remove(t10);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f34729a.keySet().iterator();
    }

    public String toString() {
        return this.f34729a.keySet().toString();
    }

    public boolean a() {
        return this.f34729a.isEmpty();
    }

    public int b() {
        return this.f34729a.size();
    }
}
