package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3436d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f39732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f39733b;

    C3436d(C3454f c3454f, Iterator it, Iterator it2) {
        this.f39732a = it;
        this.f39733b = it2;
        Objects.requireNonNull(c3454f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f39732a.hasNext()) {
            return true;
        }
        return this.f39733b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f39732a;
        if (it.hasNext()) {
            return new C3588u(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f39733b;
        if (it2.hasNext()) {
            return new C3588u((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
