package x0;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6358h0;
import s0.AbstractC6380o1;
import s0.G1;
import s0.H1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends p {

    /* JADX INFO: renamed from: a */
    private final String f63588a;

    /* JADX INFO: renamed from: b */
    private final List f63589b;

    /* JADX INFO: renamed from: c */
    private final int f63590c;

    /* JADX INFO: renamed from: d */
    private final AbstractC6358h0 f63591d;

    /* JADX INFO: renamed from: e */
    private final float f63592e;

    /* JADX INFO: renamed from: f */
    private final AbstractC6358h0 f63593f;

    /* JADX INFO: renamed from: g */
    private final float f63594g;

    /* JADX INFO: renamed from: h */
    private final float f63595h;

    /* JADX INFO: renamed from: i */
    private final int f63596i;

    /* JADX INFO: renamed from: j */
    private final int f63597j;

    /* JADX INFO: renamed from: k */
    private final float f63598k;

    /* JADX INFO: renamed from: l */
    private final float f63599l;

    /* JADX INFO: renamed from: m */
    private final float f63600m;

    /* JADX INFO: renamed from: n */
    private final float f63601n;

    public /* synthetic */ r(String str, List list, int i10, AbstractC6358h0 abstractC6358h0, float f10, AbstractC6358h0 abstractC6358h02, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i10, abstractC6358h0, f10, abstractC6358h02, f11, f12, i11, i12, f13, f14, f15, f16);
    }

    public final AbstractC6358h0 b() {
        return this.f63591d;
    }

    public final float d() {
        return this.f63592e;
    }

    public final String e() {
        return this.f63588a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            return AbstractC5504s.c(this.f63588a, rVar.f63588a) && AbstractC5504s.c(this.f63591d, rVar.f63591d) && this.f63592e == rVar.f63592e && AbstractC5504s.c(this.f63593f, rVar.f63593f) && this.f63594g == rVar.f63594g && this.f63595h == rVar.f63595h && G1.e(this.f63596i, rVar.f63596i) && H1.e(this.f63597j, rVar.f63597j) && this.f63598k == rVar.f63598k && this.f63599l == rVar.f63599l && this.f63600m == rVar.f63600m && this.f63601n == rVar.f63601n && AbstractC6380o1.d(this.f63590c, rVar.f63590c) && AbstractC5504s.c(this.f63589b, rVar.f63589b);
        }
        return false;
    }

    public final List f() {
        return this.f63589b;
    }

    public int hashCode() {
        int iHashCode = ((this.f63588a.hashCode() * 31) + this.f63589b.hashCode()) * 31;
        AbstractC6358h0 abstractC6358h0 = this.f63591d;
        int iHashCode2 = (((iHashCode + (abstractC6358h0 != null ? abstractC6358h0.hashCode() : 0)) * 31) + Float.hashCode(this.f63592e)) * 31;
        AbstractC6358h0 abstractC6358h02 = this.f63593f;
        return ((((((((((((((((((iHashCode2 + (abstractC6358h02 != null ? abstractC6358h02.hashCode() : 0)) * 31) + Float.hashCode(this.f63594g)) * 31) + Float.hashCode(this.f63595h)) * 31) + G1.f(this.f63596i)) * 31) + H1.f(this.f63597j)) * 31) + Float.hashCode(this.f63598k)) * 31) + Float.hashCode(this.f63599l)) * 31) + Float.hashCode(this.f63600m)) * 31) + Float.hashCode(this.f63601n)) * 31) + AbstractC6380o1.e(this.f63590c);
    }

    public final int i() {
        return this.f63590c;
    }

    public final AbstractC6358h0 l() {
        return this.f63593f;
    }

    public final float n() {
        return this.f63594g;
    }

    public final int p() {
        return this.f63596i;
    }

    public final int r() {
        return this.f63597j;
    }

    public final float t() {
        return this.f63598k;
    }

    public final float u() {
        return this.f63595h;
    }

    public final float v() {
        return this.f63600m;
    }

    public final float w() {
        return this.f63601n;
    }

    public final float y() {
        return this.f63599l;
    }

    private r(String str, List list, int i10, AbstractC6358h0 abstractC6358h0, float f10, AbstractC6358h0 abstractC6358h02, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        super(null);
        this.f63588a = str;
        this.f63589b = list;
        this.f63590c = i10;
        this.f63591d = abstractC6358h0;
        this.f63592e = f10;
        this.f63593f = abstractC6358h02;
        this.f63594g = f11;
        this.f63595h = f12;
        this.f63596i = i11;
        this.f63597j = i12;
        this.f63598k = f13;
        this.f63599l = f14;
        this.f63600m = f15;
        this.f63601n = f16;
    }
}
