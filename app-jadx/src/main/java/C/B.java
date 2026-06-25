package C;

import i1.C5015h;
import i1.EnumC5027t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f2013d;

    public /* synthetic */ B(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    @Override // C.A
    public float a(EnumC5027t enumC5027t) {
        return enumC5027t == EnumC5027t.f48573a ? this.f2012c : this.f2010a;
    }

    @Override // C.A
    public float b(EnumC5027t enumC5027t) {
        return enumC5027t == EnumC5027t.f48573a ? this.f2010a : this.f2012c;
    }

    @Override // C.A
    public float c() {
        return this.f2013d;
    }

    @Override // C.A
    public float d() {
        return this.f2011b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return C5015h.q(this.f2010a, b10.f2010a) && C5015h.q(this.f2011b, b10.f2011b) && C5015h.q(this.f2012c, b10.f2012c) && C5015h.q(this.f2013d, b10.f2013d);
    }

    public int hashCode() {
        return (((((C5015h.r(this.f2010a) * 31) + C5015h.r(this.f2011b)) * 31) + C5015h.r(this.f2012c)) * 31) + C5015h.r(this.f2013d);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) C5015h.s(this.f2010a)) + ", top=" + ((Object) C5015h.s(this.f2011b)) + ", end=" + ((Object) C5015h.s(this.f2012c)) + ", bottom=" + ((Object) C5015h.s(this.f2013d)) + ')';
    }

    private B(float f10, float f11, float f12, float f13) {
        this.f2010a = f10;
        this.f2011b = f11;
        this.f2012c = f12;
        this.f2013d = f13;
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }
}
