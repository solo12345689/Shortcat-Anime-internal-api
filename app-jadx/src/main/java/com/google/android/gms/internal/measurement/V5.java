package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class V5 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f39600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ X5 f39601d;

    /* synthetic */ V5(X5 x52, byte[] bArr) {
        Objects.requireNonNull(x52);
        this.f39601d = x52;
        this.f39598a = -1;
    }

    private final Iterator b() {
        if (this.f39600c == null) {
            this.f39600c = this.f39601d.l().entrySet().iterator();
        }
        return this.f39600c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f39598a + 1;
        X5 x52 = this.f39601d;
        if (i10 >= x52.k()) {
            return !x52.l().isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f39599b = true;
        int i10 = this.f39598a + 1;
        this.f39598a = i10;
        X5 x52 = this.f39601d;
        return i10 < x52.k() ? (U5) x52.j()[i10] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f39599b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f39599b = false;
        X5 x52 = this.f39601d;
        x52.i();
        int i10 = this.f39598a;
        if (i10 >= x52.k()) {
            b().remove();
        } else {
            this.f39598a = i10 - 1;
            x52.h(i10);
        }
    }
}
