package U0;

import U0.C2197e;
import b1.AbstractC2968a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g1.C4825e;
import g1.C4826f;
import g1.C4828h;
import g1.C4830j;
import g1.C4832l;
import i1.C5029v;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B implements C2197e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g1.s f18714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E f18715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C4828h f18716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f18717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f18718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g1.u f18719i;

    public /* synthetic */ B(int i10, int i11, long j10, g1.s sVar, E e10, C4828h c4828h, int i12, int i13, g1.u uVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, j10, sVar, e10, c4828h, i12, i13, uVar);
    }

    public static /* synthetic */ B b(B b10, int i10, int i11, long j10, g1.s sVar, E e10, C4828h c4828h, int i12, int i13, g1.u uVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = b10.f18711a;
        }
        if ((i14 & 2) != 0) {
            i11 = b10.f18712b;
        }
        if ((i14 & 4) != 0) {
            j10 = b10.f18713c;
        }
        if ((i14 & 8) != 0) {
            sVar = b10.f18714d;
        }
        if ((i14 & 16) != 0) {
            e10 = b10.f18715e;
        }
        if ((i14 & 32) != 0) {
            c4828h = b10.f18716f;
        }
        if ((i14 & 64) != 0) {
            i12 = b10.f18717g;
        }
        if ((i14 & 128) != 0) {
            i13 = b10.f18718h;
        }
        if ((i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            uVar = b10.f18719i;
        }
        int i15 = i13;
        g1.u uVar2 = uVar;
        long j11 = j10;
        return b10.a(i10, i11, j11, sVar, e10, c4828h, i12, i15, uVar2);
    }

    public final B a(int i10, int i11, long j10, g1.s sVar, E e10, C4828h c4828h, int i12, int i13, g1.u uVar) {
        return new B(i10, i11, j10, sVar, e10, c4828h, i12, i13, uVar, null);
    }

    public final int c() {
        return this.f18718h;
    }

    public final int d() {
        return this.f18717g;
    }

    public final long e() {
        return this.f18713c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return C4830j.k(this.f18711a, b10.f18711a) && C4832l.j(this.f18712b, b10.f18712b) && C5029v.e(this.f18713c, b10.f18713c) && AbstractC5504s.c(this.f18714d, b10.f18714d) && AbstractC5504s.c(this.f18715e, b10.f18715e) && AbstractC5504s.c(this.f18716f, b10.f18716f) && C4826f.f(this.f18717g, b10.f18717g) && C4825e.g(this.f18718h, b10.f18718h) && AbstractC5504s.c(this.f18719i, b10.f18719i);
    }

    public final C4828h f() {
        return this.f18716f;
    }

    public final E g() {
        return this.f18715e;
    }

    public final int h() {
        return this.f18711a;
    }

    public int hashCode() {
        int iL = ((((C4830j.l(this.f18711a) * 31) + C4832l.k(this.f18712b)) * 31) + C5029v.i(this.f18713c)) * 31;
        g1.s sVar = this.f18714d;
        int iHashCode = (iL + (sVar != null ? sVar.hashCode() : 0)) * 31;
        E e10 = this.f18715e;
        int iHashCode2 = (iHashCode + (e10 != null ? e10.hashCode() : 0)) * 31;
        C4828h c4828h = this.f18716f;
        int iHashCode3 = (((((iHashCode2 + (c4828h != null ? c4828h.hashCode() : 0)) * 31) + C4826f.j(this.f18717g)) * 31) + C4825e.h(this.f18718h)) * 31;
        g1.u uVar = this.f18719i;
        return iHashCode3 + (uVar != null ? uVar.hashCode() : 0);
    }

    public final int i() {
        return this.f18712b;
    }

    public final g1.s j() {
        return this.f18714d;
    }

    public final g1.u k() {
        return this.f18719i;
    }

    public final B l(B b10) {
        return b10 == null ? this : C.a(this, b10.f18711a, b10.f18712b, b10.f18713c, b10.f18714d, b10.f18715e, b10.f18716f, b10.f18717g, b10.f18718h, b10.f18719i);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C4830j.m(this.f18711a)) + ", textDirection=" + ((Object) C4832l.l(this.f18712b)) + ", lineHeight=" + ((Object) C5029v.j(this.f18713c)) + ", textIndent=" + this.f18714d + ", platformStyle=" + this.f18715e + ", lineHeightStyle=" + this.f18716f + ", lineBreak=" + ((Object) C4826f.k(this.f18717g)) + ", hyphens=" + ((Object) C4825e.i(this.f18718h)) + ", textMotion=" + this.f18719i + ')';
    }

    private B(int i10, int i11, long j10, g1.s sVar, E e10, C4828h c4828h, int i12, int i13, g1.u uVar) {
        this.f18711a = i10;
        this.f18712b = i11;
        this.f18713c = j10;
        this.f18714d = sVar;
        this.f18715e = e10;
        this.f18716f = c4828h;
        this.f18717g = i12;
        this.f18718h = i13;
        this.f18719i = uVar;
        if (C5029v.e(j10, C5029v.f48578b.a())) {
            return;
        }
        if (C5029v.h(j10) >= 0.0f) {
            return;
        }
        AbstractC2968a.c("lineHeight can't be negative (" + C5029v.h(j10) + ')');
    }
}
