package H4;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f7916b;

    public f(h hVar) {
        this.f7916b = hVar;
    }

    @Override // H4.i
    public Object c(Zd.e eVar) {
        return this.f7916b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && AbstractC5504s.c(this.f7916b, ((f) obj).f7916b);
    }

    public int hashCode() {
        return this.f7916b.hashCode();
    }
}
