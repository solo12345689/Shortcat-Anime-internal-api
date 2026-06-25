package U0;

import Y0.AbstractC2485u;
import Y0.InterfaceC2484t;
import i1.C5009b;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class S0 {

    /* JADX INFO: renamed from: a */
    private final C2197e f18762a;

    /* JADX INFO: renamed from: b */
    private final Y0 f18763b;

    /* JADX INFO: renamed from: c */
    private final List f18764c;

    /* JADX INFO: renamed from: d */
    private final int f18765d;

    /* JADX INFO: renamed from: e */
    private final boolean f18766e;

    /* JADX INFO: renamed from: f */
    private final int f18767f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC5011d f18768g;

    /* JADX INFO: renamed from: h */
    private final EnumC5027t f18769h;

    /* JADX INFO: renamed from: i */
    private final AbstractC2485u.b f18770i;

    /* JADX INFO: renamed from: j */
    private final long f18771j;

    /* JADX INFO: renamed from: k */
    private InterfaceC2484t.a f18772k;

    public /* synthetic */ S0(C2197e c2197e, Y0 y02, List list, int i10, boolean z10, int i11, InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, AbstractC2485u.b bVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, y02, list, i10, z10, i11, interfaceC5011d, enumC5027t, bVar, j10);
    }

    public final long a() {
        return this.f18771j;
    }

    public final InterfaceC5011d b() {
        return this.f18768g;
    }

    public final AbstractC2485u.b c() {
        return this.f18770i;
    }

    public final EnumC5027t d() {
        return this.f18769h;
    }

    public final int e() {
        return this.f18765d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0)) {
            return false;
        }
        S0 s02 = (S0) obj;
        return AbstractC5504s.c(this.f18762a, s02.f18762a) && AbstractC5504s.c(this.f18763b, s02.f18763b) && AbstractC5504s.c(this.f18764c, s02.f18764c) && this.f18765d == s02.f18765d && this.f18766e == s02.f18766e && g1.v.g(this.f18767f, s02.f18767f) && AbstractC5504s.c(this.f18768g, s02.f18768g) && this.f18769h == s02.f18769h && AbstractC5504s.c(this.f18770i, s02.f18770i) && C5009b.f(this.f18771j, s02.f18771j);
    }

    public final int f() {
        return this.f18767f;
    }

    public final List g() {
        return this.f18764c;
    }

    public final boolean h() {
        return this.f18766e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f18762a.hashCode() * 31) + this.f18763b.hashCode()) * 31) + this.f18764c.hashCode()) * 31) + this.f18765d) * 31) + Boolean.hashCode(this.f18766e)) * 31) + g1.v.h(this.f18767f)) * 31) + this.f18768g.hashCode()) * 31) + this.f18769h.hashCode()) * 31) + this.f18770i.hashCode()) * 31) + C5009b.o(this.f18771j);
    }

    public final Y0 i() {
        return this.f18763b;
    }

    public final C2197e j() {
        return this.f18762a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f18762a) + ", style=" + this.f18763b + ", placeholders=" + this.f18764c + ", maxLines=" + this.f18765d + ", softWrap=" + this.f18766e + ", overflow=" + ((Object) g1.v.i(this.f18767f)) + ", density=" + this.f18768g + ", layoutDirection=" + this.f18769h + ", fontFamilyResolver=" + this.f18770i + ", constraints=" + ((Object) C5009b.q(this.f18771j)) + ')';
    }

    private S0(C2197e c2197e, Y0 y02, List list, int i10, boolean z10, int i11, InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, InterfaceC2484t.a aVar, AbstractC2485u.b bVar, long j10) {
        this.f18762a = c2197e;
        this.f18763b = y02;
        this.f18764c = list;
        this.f18765d = i10;
        this.f18766e = z10;
        this.f18767f = i11;
        this.f18768g = interfaceC5011d;
        this.f18769h = enumC5027t;
        this.f18770i = bVar;
        this.f18771j = j10;
        this.f18772k = aVar;
    }

    private S0(C2197e c2197e, Y0 y02, List list, int i10, boolean z10, int i11, InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, AbstractC2485u.b bVar, long j10) {
        this(c2197e, y02, list, i10, z10, i11, interfaceC5011d, enumC5027t, (InterfaceC2484t.a) null, bVar, j10);
    }
}
