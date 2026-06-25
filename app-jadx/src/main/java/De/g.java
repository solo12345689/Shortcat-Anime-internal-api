package De;

import Qe.v;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5504s;
import nf.C5786a;
import nf.C5789d;
import ve.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements v {

    /* JADX INFO: renamed from: a */
    private final ClassLoader f3702a;

    /* JADX INFO: renamed from: b */
    private final C5789d f3703b;

    public g(ClassLoader classLoader) {
        AbstractC5504s.h(classLoader, "classLoader");
        this.f3702a = classLoader;
        this.f3703b = new C5789d();
    }

    private final v.a d(String str) {
        f fVarA;
        Class clsA = e.a(this.f3702a, str);
        if (clsA == null || (fVarA = f.f3699c.a(clsA)) == null) {
            return null;
        }
        return new v.a.C0253a(fVarA, null, 2, null);
    }

    @Override // Qe.v
    public v.a a(Oe.g javaClass, Ue.c metadataVersion) {
        String strA;
        AbstractC5504s.h(javaClass, "javaClass");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        Xe.c cVarF = javaClass.f();
        if (cVarF == null || (strA = cVarF.a()) == null) {
            return null;
        }
        return d(strA);
    }

    @Override // mf.InterfaceC5668A
    public InputStream b(Xe.c packageFqName) {
        AbstractC5504s.h(packageFqName, "packageFqName");
        if (packageFqName.h(o.f62182z)) {
            return this.f3703b.a(C5786a.f54129r.r(packageFqName));
        }
        return null;
    }

    @Override // Qe.v
    public v.a c(Xe.b classId, Ue.c metadataVersion) {
        AbstractC5504s.h(classId, "classId");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        return d(h.b(classId));
    }
}
