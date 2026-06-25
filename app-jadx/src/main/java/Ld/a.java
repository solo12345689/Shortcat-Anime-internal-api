package Ld;

import android.graphics.Rect;
import android.util.Rational;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f11396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rational f11397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f11398f;

    public a(boolean z10, boolean z11, boolean z12, boolean z13, Rational rational, Rect rectHint) {
        AbstractC5504s.h(rectHint, "rectHint");
        this.f11393a = z10;
        this.f11394b = z11;
        this.f11395c = z12;
        this.f11396d = z13;
        this.f11397e = rational;
        this.f11398f = rectHint;
    }

    public static /* synthetic */ a b(a aVar, boolean z10, boolean z11, boolean z12, boolean z13, Rational rational, Rect rect, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f11393a;
        }
        if ((i10 & 2) != 0) {
            z11 = aVar.f11394b;
        }
        if ((i10 & 4) != 0) {
            z12 = aVar.f11395c;
        }
        if ((i10 & 8) != 0) {
            z13 = aVar.f11396d;
        }
        if ((i10 & 16) != 0) {
            rational = aVar.f11397e;
        }
        if ((i10 & 32) != 0) {
            rect = aVar.f11398f;
        }
        Rational rational2 = rational;
        Rect rect2 = rect;
        return aVar.a(z10, z11, z12, z13, rational2, rect2);
    }

    public final a a(boolean z10, boolean z11, boolean z12, boolean z13, Rational rational, Rect rectHint) {
        AbstractC5504s.h(rectHint, "rectHint");
        return new a(z10, z11, z12, z13, rational, rectHint);
    }

    public final Rational c() {
        return this.f11397e;
    }

    public final boolean d() {
        return this.f11393a;
    }

    public final boolean e() {
        return this.f11396d;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11394b == aVar.f11394b && this.f11395c == aVar.f11395c && this.f11393a == aVar.f11393a && this.f11396d == aVar.f11396d && AbstractC5504s.c(this.f11397e, aVar.f11397e) && AbstractC5504s.c(this.f11398f, aVar.f11398f);
    }

    public final boolean f() {
        return this.f11394b;
    }

    public final Rect g() {
        return this.f11398f;
    }

    public final boolean h() {
        return this.f11395c;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f11393a) * 31) + Boolean.hashCode(this.f11394b)) * 31) + Boolean.hashCode(this.f11396d)) * 31;
        Rational rational = this.f11397e;
        return iHashCode + (rational != null ? rational.hashCode() : 0);
    }

    public String toString() {
        return "PiPParams(autoEnter=" + this.f11393a + ", canEnter=" + this.f11394b + ", willEnter=" + this.f11395c + ", blocksAppFromEntering=" + this.f11396d + ", aspectRatio=" + this.f11397e + ", rectHint=" + this.f11398f + ")";
    }

    public /* synthetic */ a(boolean z10, boolean z11, boolean z12, boolean z13, Rational rational, Rect rect, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? new Rational(16, 9) : rational, (i10 & 32) != 0 ? new Rect(0, 0, 0, 0) : rect);
    }
}
