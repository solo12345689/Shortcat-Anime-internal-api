package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class U5 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    private final Comparable f39589a;

    /* JADX INFO: renamed from: b */
    private Object f39590b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ X5 f39591c;

    U5(X5 x52, Comparable comparable, Object obj) {
        Objects.requireNonNull(x52);
        this.f39591c = x52;
        this.f39589a = comparable;
        this.f39590b = obj;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f39589a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f39589a.compareTo(((U5) obj).f39589a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b(this.f39589a, entry.getKey()) && b(this.f39590b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f39589a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f39590b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f39589a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f39590b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f39591c.i();
        Object obj2 = this.f39590b;
        this.f39590b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f39589a);
        String strValueOf2 = String.valueOf(this.f39590b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(com.amazon.a.a.o.b.f.f34695b);
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
