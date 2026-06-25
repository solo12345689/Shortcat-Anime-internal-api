package ze;

import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import df.C4592a;
import df.C4593b;
import df.C4602k;
import df.C4615x;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.N0;
import ve.o;
import ye.H;

/* JADX INFO: renamed from: ze.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7373g {

    /* JADX INFO: renamed from: a */
    private static final Xe.f f66218a;

    /* JADX INFO: renamed from: b */
    private static final Xe.f f66219b;

    /* JADX INFO: renamed from: c */
    private static final Xe.f f66220c;

    /* JADX INFO: renamed from: d */
    private static final Xe.f f66221d;

    /* JADX INFO: renamed from: e */
    private static final Xe.f f66222e;

    static {
        Xe.f fVarM = Xe.f.m("message");
        AbstractC5504s.g(fVarM, "identifier(...)");
        f66218a = fVarM;
        Xe.f fVarM2 = Xe.f.m("replaceWith");
        AbstractC5504s.g(fVarM2, "identifier(...)");
        f66219b = fVarM2;
        Xe.f fVarM3 = Xe.f.m("level");
        AbstractC5504s.g(fVarM3, "identifier(...)");
        f66220c = fVarM3;
        Xe.f fVarM4 = Xe.f.m("expression");
        AbstractC5504s.g(fVarM4, "identifier(...)");
        f66221d = fVarM4;
        Xe.f fVarM5 = Xe.f.m("imports");
        AbstractC5504s.g(fVarM5, "identifier(...)");
        f66222e = fVarM5;
    }

    public static final InterfaceC7369c b(ve.i iVar, String message, String replaceWith, String level, boolean z10) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(replaceWith, "replaceWith");
        AbstractC5504s.h(level, "level");
        C7378l c7378l = new C7378l(iVar, o.a.f62185B, S.l(z.a(f66221d, new C4615x(replaceWith)), z.a(f66222e, new C4593b(AbstractC2279u.m(), new C7372f(iVar)))), false, 8, null);
        Xe.c cVar = o.a.f62279y;
        Pair pairA = z.a(f66218a, new C4615x(message));
        Pair pairA2 = z.a(f66219b, new C4592a(c7378l));
        Xe.f fVar = f66220c;
        Xe.b bVarC = Xe.b.f21759d.c(o.a.f62183A);
        Xe.f fVarM = Xe.f.m(level);
        AbstractC5504s.g(fVarM, "identifier(...)");
        return new C7378l(iVar, cVar, S.l(pairA, pairA2, z.a(fVar, new C4602k(bVarC, fVarM))), z10);
    }

    public static /* synthetic */ InterfaceC7369c c(ve.i iVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return b(iVar, str, str2, str3, z10);
    }

    public static final qf.S d(ve.i iVar, H module) {
        AbstractC5504s.h(module, "module");
        AbstractC6183d0 abstractC6183d0M = module.n().m(N0.f57999e, iVar.X());
        AbstractC5504s.g(abstractC6183d0M, "getArrayType(...)");
        return abstractC6183d0M;
    }
}
