package g1;

import b1.AbstractC2968a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6358h0;
import s0.C6385r0;

/* JADX INFO: renamed from: g1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C4824d implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f47226b;

    public /* synthetic */ C4824d(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // g1.p
    public float a() {
        return C6385r0.t(b());
    }

    @Override // g1.p
    public long b() {
        return this.f47226b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4824d) && C6385r0.s(this.f47226b, ((C4824d) obj).f47226b);
    }

    public int hashCode() {
        return C6385r0.y(this.f47226b);
    }

    @Override // g1.p
    public AbstractC6358h0 i() {
        return null;
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) C6385r0.z(this.f47226b)) + ')';
    }

    private C4824d(long j10) {
        this.f47226b = j10;
        if (j10 != 16) {
            return;
        }
        AbstractC2968a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }
}
