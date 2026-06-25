package Y0;

import oe.AbstractC5874j;

/* JADX INFO: renamed from: Y0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2472g implements Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22665b;

    public C2472g(int i10) {
        this.f22665b = i10;
    }

    @Override // Y0.Z
    public L c(L l10) {
        int i10 = this.f22665b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? l10 : new L(AbstractC5874j.m(l10.v() + this.f22665b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2472g) && this.f22665b == ((C2472g) obj).f22665b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f22665b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f22665b + ')';
    }
}
