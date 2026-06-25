package n4;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: n4.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5737m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53927b;

    public C5737m(String workSpecId, int i10) {
        AbstractC5504s.h(workSpecId, "workSpecId");
        this.f53926a = workSpecId;
        this.f53927b = i10;
    }

    public final int a() {
        return this.f53927b;
    }

    public final String b() {
        return this.f53926a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5737m)) {
            return false;
        }
        C5737m c5737m = (C5737m) obj;
        return AbstractC5504s.c(this.f53926a, c5737m.f53926a) && this.f53927b == c5737m.f53927b;
    }

    public int hashCode() {
        return (this.f53926a.hashCode() * 31) + Integer.hashCode(this.f53927b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f53926a + ", generation=" + this.f53927b + ')';
    }
}
