package V;

import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19598b;

    public d(boolean z10, List list) {
        this.f19597a = z10;
        this.f19598b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19597a == dVar.f19597a && AbstractC5504s.c(this.f19598b, dVar.f19598b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f19597a) * 31) + this.f19598b.hashCode();
    }

    public String toString() {
        return "Posture(isTabletop=" + this.f19597a + ", hinges=[" + AbstractC2279u.w0(this.f19598b, ", ", null, null, 0, null, null, 62, null) + "])";
    }
}
