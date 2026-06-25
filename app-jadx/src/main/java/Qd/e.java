package qd;

import Ud.AbstractC2279u;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC5504s;
import rd.C6306a;
import sd.EnumC6452b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public abstract void a(UUID uuid, String str);

    public abstract void b(List list);

    public final void c(rd.d update) {
        AbstractC5504s.h(update, "update");
        update.q(update.c() + 1);
        d(update.d());
    }

    public abstract void d(UUID uuid);

    public final void e(rd.d update) {
        AbstractC5504s.h(update, "update");
        update.w(update.n() + 1);
        f(update.d());
    }

    protected abstract void f(UUID uuid);

    public abstract void g(rd.d dVar);

    protected abstract void h(UUID uuid);

    public abstract List i();

    public final C6306a j(UUID updateId) {
        AbstractC5504s.h(updateId, "updateId");
        C6306a c6306aK = k(updateId);
        if (c6306aK == null) {
            return null;
        }
        c6306aK.C(true);
        return c6306aK;
    }

    protected abstract C6306a k(UUID uuid);

    protected abstract List l(String str, List list);

    public final List m(String scopeKey) {
        AbstractC5504s.h(scopeKey, "scopeKey");
        return l(scopeKey, AbstractC2279u.p(EnumC6452b.f59348a, EnumC6452b.f59350c, EnumC6452b.f59351d));
    }

    public abstract List n();

    public final rd.d o(UUID id2) {
        AbstractC5504s.h(id2, "id");
        List listP = p(id2);
        if (listP.isEmpty()) {
            return null;
        }
        return (rd.d) listP.get(0);
    }

    protected abstract List p(UUID uuid);

    public final void q(rd.d update) {
        AbstractC5504s.h(update, "update");
        Date date = new Date();
        update.s(date);
        r(update.d(), date);
    }

    protected abstract void r(UUID uuid, Date date);

    public final void s(rd.d update) {
        AbstractC5504s.h(update, "update");
        t(update, false);
    }

    public void t(rd.d update, boolean z10) {
        AbstractC5504s.h(update, "update");
        EnumC6452b enumC6452b = EnumC6452b.f59348a;
        EnumC6452b enumC6452bM = update.m();
        EnumC6452b enumC6452b2 = EnumC6452b.f59351d;
        if (enumC6452bM == enumC6452b2) {
            enumC6452b = enumC6452b2;
        } else if (z10) {
            enumC6452b = EnumC6452b.f59350c;
        }
        u(enumC6452b, update.d());
        h(update.d());
    }

    protected abstract void u(EnumC6452b enumC6452b, UUID uuid);

    public final void v(rd.d update, Date commitTime) {
        AbstractC5504s.h(update, "update");
        AbstractC5504s.h(commitTime, "commitTime");
        update.p(commitTime);
        w(update.d(), commitTime);
    }

    public abstract void w(UUID uuid, Date date);

    public final void x(rd.d update, String newScopeKey) {
        AbstractC5504s.h(update, "update");
        AbstractC5504s.h(newScopeKey, "newScopeKey");
        update.u(newScopeKey);
        a(update.d(), newScopeKey);
    }
}
