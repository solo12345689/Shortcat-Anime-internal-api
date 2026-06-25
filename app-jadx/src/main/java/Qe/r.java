package Qe;

import Ze.i;
import gf.C4881d;
import kotlin.jvm.internal.AbstractC5504s;
import mf.C5693y;
import of.InterfaceC5895s;
import ye.i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r implements InterfaceC5895s {

    /* JADX INFO: renamed from: b */
    private final C4881d f14893b;

    /* JADX INFO: renamed from: c */
    private final C4881d f14894c;

    /* JADX INFO: renamed from: d */
    private final C5693y f14895d;

    /* JADX INFO: renamed from: e */
    private final boolean f14896e;

    /* JADX INFO: renamed from: f */
    private final of.r f14897f;

    /* JADX INFO: renamed from: g */
    private final x f14898g;

    /* JADX INFO: renamed from: h */
    private final String f14899h;

    public r(C4881d className, C4881d c4881d, Se.m packageProto, Ue.d nameResolver, C5693y c5693y, boolean z10, of.r abiStability, x xVar) {
        String string;
        AbstractC5504s.h(className, "className");
        AbstractC5504s.h(packageProto, "packageProto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(abiStability, "abiStability");
        this.f14893b = className;
        this.f14894c = c4881d;
        this.f14895d = c5693y;
        this.f14896e = z10;
        this.f14897f = abiStability;
        this.f14898g = xVar;
        i.f packageModuleName = Ve.a.f20040m;
        AbstractC5504s.g(packageModuleName, "packageModuleName");
        Integer num = (Integer) Ue.f.a(packageProto, packageModuleName);
        this.f14899h = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // of.InterfaceC5895s
    public String a() {
        return "Class '" + d().a().a() + '\'';
    }

    @Override // ye.h0
    public i0 b() {
        i0 NO_SOURCE_FILE = i0.f65113a;
        AbstractC5504s.g(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final Xe.b d() {
        Xe.c cVarG = e().g();
        AbstractC5504s.g(cVarG, "getPackageFqName(...)");
        return new Xe.b(cVarG, h());
    }

    public C4881d e() {
        return this.f14893b;
    }

    public C4881d f() {
        return this.f14894c;
    }

    public final x g() {
        return this.f14898g;
    }

    public final Xe.f h() {
        String strF = e().f();
        AbstractC5504s.g(strF, "getInternalName(...)");
        Xe.f fVarM = Xe.f.m(Df.r.Z0(strF, '/', null, 2, null));
        AbstractC5504s.g(fVarM, "identifier(...)");
        return fVarM;
    }

    public String toString() {
        return r.class.getSimpleName() + ": " + e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(x kotlinClass, Se.m packageProto, Ue.d nameResolver, C5693y c5693y, boolean z10, of.r abiStability) {
        AbstractC5504s.h(kotlinClass, "kotlinClass");
        AbstractC5504s.h(packageProto, "packageProto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(abiStability, "abiStability");
        C4881d c4881dB = C4881d.b(kotlinClass.g());
        AbstractC5504s.g(c4881dB, "byClassId(...)");
        String strE = kotlinClass.d().e();
        C4881d c4881dD = null;
        if (strE != null && strE.length() > 0) {
            c4881dD = C4881d.d(strE);
        }
        this(c4881dB, c4881dD, packageProto, nameResolver, c5693y, z10, abiStability, kotlinClass);
    }
}
