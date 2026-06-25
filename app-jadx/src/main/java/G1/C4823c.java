package g1;

import kotlin.jvm.internal.AbstractC5504s;
import s0.A1;
import s0.AbstractC6358h0;
import s0.C6385r0;

/* JADX INFO: renamed from: g1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C4823c implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A1 f47224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f47225c;

    public C4823c(A1 a12, float f10) {
        this.f47224b = a12;
        this.f47225c = f10;
    }

    @Override // g1.p
    public float a() {
        return this.f47225c;
    }

    @Override // g1.p
    public long b() {
        return C6385r0.f58985b.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4823c)) {
            return false;
        }
        C4823c c4823c = (C4823c) obj;
        return AbstractC5504s.c(this.f47224b, c4823c.f47224b) && Float.compare(this.f47225c, c4823c.f47225c) == 0;
    }

    public int hashCode() {
        return (this.f47224b.hashCode() * 31) + Float.hashCode(this.f47225c);
    }

    @Override // g1.p
    public AbstractC6358h0 i() {
        return this.f47224b;
    }

    public final A1 j() {
        return this.f47224b;
    }

    public String toString() {
        return "BrushStyle(value=" + this.f47224b + ", alpha=" + this.f47225c + ')';
    }
}
