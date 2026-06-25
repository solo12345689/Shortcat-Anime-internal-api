package Y0;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC2485u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0 f22638h;

    public Q(h0 h0Var) {
        super(true, null);
        this.f22638h = h0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Q) && AbstractC5504s.c(this.f22638h, ((Q) obj).f22638h);
    }

    public int hashCode() {
        return this.f22638h.hashCode();
    }

    public final h0 l() {
        return this.f22638h;
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f22638h + ')';
    }
}
