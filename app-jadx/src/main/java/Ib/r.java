package Ib;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9005a;

    public r(String data) {
        AbstractC5504s.h(data, "data");
        this.f9005a = data;
    }

    @Override // Ib.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        return this.f9005a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && AbstractC5504s.c(this.f9005a, ((r) obj).f9005a);
    }

    public int hashCode() {
        return this.f9005a.hashCode();
    }

    public String toString() {
        return "RawModelProvider(data=" + this.f9005a + ")";
    }
}
