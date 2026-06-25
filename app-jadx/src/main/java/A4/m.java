package A4;

import kotlin.jvm.internal.AbstractC5504s;
import x4.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x4.f f308c;

    public m(p pVar, String str, x4.f fVar) {
        super(null);
        this.f306a = pVar;
        this.f307b = str;
        this.f308c = fVar;
    }

    public final x4.f a() {
        return this.f308c;
    }

    public final p b() {
        return this.f306a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC5504s.c(this.f306a, mVar.f306a) && AbstractC5504s.c(this.f307b, mVar.f307b) && this.f308c == mVar.f308c;
    }

    public int hashCode() {
        int iHashCode = this.f306a.hashCode() * 31;
        String str = this.f307b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f308c.hashCode();
    }
}
