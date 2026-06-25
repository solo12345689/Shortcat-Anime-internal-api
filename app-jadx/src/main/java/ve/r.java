package ve;

import Xe.b;
import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f62292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f62293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f62294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f62295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ r[] f62296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f62297i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xe.b f62298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Xe.f f62299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Xe.b f62300c;

    static {
        b.a aVar = Xe.b.f21759d;
        f62292d = new r("UBYTE", 0, b.a.b(aVar, "kotlin/UByte", false, 2, null));
        f62293e = new r("USHORT", 1, b.a.b(aVar, "kotlin/UShort", false, 2, null));
        f62294f = new r("UINT", 2, b.a.b(aVar, "kotlin/UInt", false, 2, null));
        f62295g = new r("ULONG", 3, b.a.b(aVar, "kotlin/ULong", false, 2, null));
        r[] rVarArrA = a();
        f62296h = rVarArrA;
        f62297i = AbstractC3048a.a(rVarArrA);
    }

    private r(String str, int i10, Xe.b bVar) {
        this.f62298a = bVar;
        Xe.f fVarH = bVar.h();
        this.f62299b = fVarH;
        Xe.c cVarF = bVar.f();
        Xe.f fVarM = Xe.f.m(fVarH.b() + "Array");
        AbstractC5504s.g(fVarM, "identifier(...)");
        this.f62300c = new Xe.b(cVarF, fVarM);
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{f62292d, f62293e, f62294f, f62295g};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f62296h.clone();
    }

    public final Xe.b b() {
        return this.f62300c;
    }

    public final Xe.b c() {
        return this.f62298a;
    }

    public final Xe.f h() {
        return this.f62299b;
    }
}
