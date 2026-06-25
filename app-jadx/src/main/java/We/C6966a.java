package we;

import Df.r;
import Ud.AbstractC2279u;
import Ud.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import pf.n;
import we.C6972g;
import ye.H;
import ye.InterfaceC7227e;

/* JADX INFO: renamed from: we.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6966a implements Ae.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f63159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f63160b;

    public C6966a(n storageManager, H module) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(module, "module");
        this.f63159a = storageManager;
        this.f63160b = module;
    }

    @Override // Ae.b
    public InterfaceC7227e a(Xe.b classId) {
        Xe.c cVarF;
        C6972g.b bVarC;
        AbstractC5504s.h(classId, "classId");
        if (classId.i() || classId.j()) {
            return null;
        }
        String strA = classId.g().a();
        if (!r.W(strA, "Function", false, 2, null) || (bVarC = C6972g.f63191c.a().c((cVarF = classId.f()), strA)) == null) {
            return null;
        }
        AbstractC6971f abstractC6971fA = bVarC.a();
        int iB = bVarC.b();
        List listK0 = this.f63160b.S(cVarF).k0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK0) {
            if (obj instanceof ve.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        android.support.v4.media.session.b.a(AbstractC2279u.o0(arrayList2));
        return new C6967b(this.f63159a, (ve.c) AbstractC2279u.m0(arrayList), abstractC6971fA, iB);
    }

    @Override // Ae.b
    public boolean b(Xe.c packageFqName, Xe.f name) {
        AbstractC5504s.h(packageFqName, "packageFqName");
        AbstractC5504s.h(name, "name");
        String strB = name.b();
        AbstractC5504s.g(strB, "asString(...)");
        return (r.Q(strB, "Function", false, 2, null) || r.Q(strB, "KFunction", false, 2, null) || r.Q(strB, "SuspendFunction", false, 2, null) || r.Q(strB, "KSuspendFunction", false, 2, null)) && C6972g.f63191c.a().c(packageFqName, strB) != null;
    }

    @Override // Ae.b
    public Collection c(Xe.c packageFqName) {
        AbstractC5504s.h(packageFqName, "packageFqName");
        return a0.d();
    }
}
