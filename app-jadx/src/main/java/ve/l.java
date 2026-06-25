package ve;

import Td.AbstractC2163n;
import Ud.a0;
import be.AbstractC3048a;
import java.util.Set;
import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f62117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f62118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f62119g = new l("BOOLEAN", 0, "Boolean");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f62120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f62121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f62122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f62123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l f62124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l f62125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l f62126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ l[] f62127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f62128p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xe.f f62129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Xe.f f62130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f62131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f62132d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        l lVar = new l("CHAR", 1, "Char");
        f62120h = lVar;
        l lVar2 = new l("BYTE", 2, "Byte");
        f62121i = lVar2;
        l lVar3 = new l("SHORT", 3, "Short");
        f62122j = lVar3;
        l lVar4 = new l("INT", 4, "Int");
        f62123k = lVar4;
        l lVar5 = new l("FLOAT", 5, "Float");
        f62124l = lVar5;
        l lVar6 = new l("LONG", 6, "Long");
        f62125m = lVar6;
        l lVar7 = new l("DOUBLE", 7, "Double");
        f62126n = lVar7;
        l[] lVarArrA = a();
        f62127o = lVarArrA;
        f62128p = AbstractC3048a.a(lVarArrA);
        f62117e = new a(null);
        f62118f = a0.h(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7);
    }

    private l(String str, int i10, String str2) {
        Xe.f fVarM = Xe.f.m(str2);
        AbstractC5504s.g(fVarM, "identifier(...)");
        this.f62129a = fVarM;
        Xe.f fVarM2 = Xe.f.m(str2 + "Array");
        AbstractC5504s.g(fVarM2, "identifier(...)");
        this.f62130b = fVarM2;
        Td.q qVar = Td.q.f17462b;
        this.f62131c = AbstractC2163n.a(qVar, new j(this));
        this.f62132d = AbstractC2163n.a(qVar, new k(this));
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f62119g, f62120h, f62121i, f62122j, f62123k, f62124l, f62125m, f62126n};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xe.c h(l lVar) {
        return o.f62147A.b(lVar.f62130b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xe.c s(l lVar) {
        return o.f62147A.b(lVar.f62129a);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f62127o.clone();
    }

    public final Xe.c k() {
        return (Xe.c) this.f62132d.getValue();
    }

    public final Xe.f m() {
        return this.f62130b;
    }

    public final Xe.c p() {
        return (Xe.c) this.f62131c.getValue();
    }

    public final Xe.f q() {
        return this.f62129a;
    }
}
