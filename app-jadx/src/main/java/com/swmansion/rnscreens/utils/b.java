package com.swmansion.rnscreens.utils;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f44747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f44748b;

    public b(int i10, boolean z10) {
        this.f44747a = i10;
        this.f44748b = z10;
    }

    public final int a() {
        return this.f44747a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f44747a == bVar.f44747a && this.f44748b == bVar.f44748b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f44747a) * 31) + Boolean.hashCode(this.f44748b);
    }

    public String toString() {
        return "CacheKey(fontSize=" + this.f44747a + ", isTitleEmpty=" + this.f44748b + ")";
    }
}
