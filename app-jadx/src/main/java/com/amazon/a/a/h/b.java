package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Serializable, Iterable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f34350a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f34351b = new ArrayList();

    public boolean a() {
        return this.f34351b.isEmpty();
    }

    public Collection<a> b() {
        return this.f34351b;
    }

    public int c() {
        return this.f34351b.size();
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f34351b.iterator();
    }

    public String toString() {
        return "MetricBatch: [" + this.f34351b + "]";
    }

    public void a(a aVar) {
        this.f34351b.add(aVar);
    }
}
