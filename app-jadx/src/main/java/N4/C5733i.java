package n4;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: n4.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5733i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53918c;

    public C5733i(String workSpecId, int i10, int i11) {
        AbstractC5504s.h(workSpecId, "workSpecId");
        this.f53916a = workSpecId;
        this.f53917b = i10;
        this.f53918c = i11;
    }

    public final int a() {
        return this.f53917b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5733i)) {
            return false;
        }
        C5733i c5733i = (C5733i) obj;
        return AbstractC5504s.c(this.f53916a, c5733i.f53916a) && this.f53917b == c5733i.f53917b && this.f53918c == c5733i.f53918c;
    }

    public int hashCode() {
        return (((this.f53916a.hashCode() * 31) + Integer.hashCode(this.f53917b)) * 31) + Integer.hashCode(this.f53918c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f53916a + ", generation=" + this.f53917b + ", systemId=" + this.f53918c + ')';
    }
}
