package qd;

import Dd.a;
import Ud.AbstractC2279u;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;
import rd.C6306a;

/* JADX INFO: renamed from: qd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6170a {
    public boolean a(rd.d update, C6306a asset, boolean z10) {
        AbstractC5504s.h(update, "update");
        AbstractC5504s.h(asset, "asset");
        C6306a c6306aG = g(asset.j());
        if (c6306aG == null) {
            return false;
        }
        long jI = c6306aG.i();
        f(new rd.c(update.d(), jI));
        if (!z10) {
            return true;
        }
        m(jI, update.d());
        return true;
    }

    protected abstract void b();

    public List c() {
        k();
        o();
        p();
        n();
        List listJ = j();
        b();
        return listJ;
    }

    protected abstract long d(C6306a c6306a);

    public void e(List assets, rd.d update) {
        AbstractC5504s.h(assets, "assets");
        AbstractC5504s.h(update, "update");
        Iterator it = assets.iterator();
        while (it.hasNext()) {
            C6306a c6306a = (C6306a) it.next();
            long jD = d(c6306a);
            f(new rd.c(update.d(), jD));
            if (c6306a.t()) {
                m(jD, update.d());
            }
        }
    }

    protected abstract void f(rd.c cVar);

    public final C6306a g(String str) {
        C6306a c6306a = (C6306a) AbstractC2279u.o0(h(str));
        if (c6306a == null) {
            return null;
        }
        String strM = c6306a.m();
        if (strM != null) {
            a.C0043a c0043aG = Dd.a.f3689a.g(strM);
            String strA = c0043aG.a();
            String strB = c0043aG.b();
            String strC = c0043aG.c();
            c6306a.v(strA);
            c6306a.H(strB);
            c6306a.G(strC);
        }
        return c6306a;
    }

    protected abstract List h(String str);

    public abstract List i(UUID uuid);

    protected abstract List j();

    protected abstract void k();

    public final void l(C6306a existingEntity, C6306a newEntity) {
        boolean z10;
        AbstractC5504s.h(existingEntity, "existingEntity");
        AbstractC5504s.h(newEntity, "newEntity");
        boolean z11 = true;
        if (newEntity.s() == null || (existingEntity.s() != null && AbstractC5504s.c(newEntity.s(), existingEntity.s()))) {
            z10 = false;
        } else {
            existingEntity.K(newEntity.s());
            z10 = true;
        }
        JSONObject jSONObjectD = newEntity.d();
        if (jSONObjectD == null || (existingEntity.d() != null && AbstractC5504s.c(jSONObjectD, existingEntity.d()))) {
            z11 = z10;
        } else {
            existingEntity.x(newEntity.d());
        }
        if (z11) {
            q(existingEntity);
        }
        existingEntity.C(newEntity.t());
        String strB = newEntity.b();
        if (strB != null) {
            existingEntity.v(strB);
        }
        String strN = newEntity.n();
        if (strN != null) {
            existingEntity.G(strN);
        }
        String strO = newEntity.o();
        if (strO != null) {
            existingEntity.H(strO);
        }
        Float fP = newEntity.p();
        if (fP != null) {
            existingEntity.I(Float.valueOf(fP.floatValue()));
        }
        Float[] fArrQ = newEntity.q();
        if (fArrQ != null) {
            existingEntity.J(fArrQ);
        }
    }

    protected abstract void m(long j10, UUID uuid);

    protected abstract void n();

    protected abstract void o();

    protected abstract void p();

    public abstract void q(C6306a c6306a);
}
