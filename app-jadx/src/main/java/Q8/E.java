package Q8;

import P8.a;
import P8.f;
import R8.AbstractC2113n;
import R8.AbstractC2115p;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class E implements f.a, f.b {

    /* JADX INFO: renamed from: b */
    private final a.f f14397b;

    /* JADX INFO: renamed from: c */
    private final C2054b f14398c;

    /* JADX INFO: renamed from: d */
    private final C2073v f14399d;

    /* JADX INFO: renamed from: g */
    private final int f14402g;

    /* JADX INFO: renamed from: h */
    private final V f14403h;

    /* JADX INFO: renamed from: i */
    private boolean f14404i;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ C2057e f14408s;

    /* JADX INFO: renamed from: a */
    private final Queue f14396a = new LinkedList();

    /* JADX INFO: renamed from: e */
    private final Set f14400e = new HashSet();

    /* JADX INFO: renamed from: f */
    private final Map f14401f = new HashMap();

    /* JADX INFO: renamed from: j */
    private final List f14405j = new ArrayList();

    /* JADX INFO: renamed from: q */
    private ConnectionResult f14406q = null;

    /* JADX INFO: renamed from: r */
    private int f14407r = 0;

    public E(C2057e c2057e, P8.e eVar) {
        this.f14408s = c2057e;
        a.f fVarU = eVar.u(c2057e.f14481n.getLooper(), this);
        this.f14397b = fVarU;
        this.f14398c = eVar.o();
        this.f14399d = new C2073v();
        this.f14402g = eVar.t();
        if (fVarU.f()) {
            this.f14403h = eVar.v(c2057e.f14472e, c2057e.f14481n);
        } else {
            this.f14403h = null;
        }
    }

    static /* bridge */ /* synthetic */ void B(E e10, G g10) {
        if (e10.f14405j.contains(g10) && !e10.f14404i) {
            if (e10.f14397b.A()) {
                e10.j();
            } else {
                e10.E();
            }
        }
    }

    static /* bridge */ /* synthetic */ void C(E e10, G g10) {
        O8.c[] cVarArrG;
        if (e10.f14405j.remove(g10)) {
            e10.f14408s.f14481n.removeMessages(15, g10);
            e10.f14408s.f14481n.removeMessages(16, g10);
            O8.c cVar = g10.f14410b;
            ArrayList arrayList = new ArrayList(e10.f14396a.size());
            for (c0 c0Var : e10.f14396a) {
                if ((c0Var instanceof M) && (cVarArrG = ((M) c0Var).g(e10)) != null && com.google.android.gms.common.util.b.b(cVarArrG, cVar)) {
                    arrayList.add(c0Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var2 = (c0) arrayList.get(i10);
                e10.f14396a.remove(c0Var2);
                c0Var2.b(new P8.l(cVar));
            }
        }
    }

    private final O8.c d(O8.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            O8.c[] cVarArrL = this.f14397b.l();
            if (cVarArrL == null) {
                cVarArrL = new O8.c[0];
            }
            C6551a c6551a = new C6551a(cVarArrL.length);
            for (O8.c cVar : cVarArrL) {
                c6551a.put(cVar.getName(), Long.valueOf(cVar.d()));
            }
            for (O8.c cVar2 : cVarArr) {
                Long l10 = (Long) c6551a.get(cVar2.getName());
                if (l10 == null || l10.longValue() < cVar2.d()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final void f(ConnectionResult connectionResult) {
        Iterator it = this.f14400e.iterator();
        if (!it.hasNext()) {
            this.f14400e.clear();
            return;
        }
        android.support.v4.media.session.b.a(it.next());
        if (AbstractC2113n.a(connectionResult, ConnectionResult.f38918f)) {
            this.f14397b.d();
        }
        throw null;
    }

    public final void g(Status status) {
        AbstractC2115p.d(this.f14408s.f14481n);
        i(status, null, false);
    }

    private final void i(Status status, Exception exc, boolean z10) {
        AbstractC2115p.d(this.f14408s.f14481n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f14396a.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (!z10 || c0Var.f14461a == 2) {
                if (status != null) {
                    c0Var.a(status);
                } else {
                    c0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void j() {
        ArrayList arrayList = new ArrayList(this.f14396a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) arrayList.get(i10);
            if (!this.f14397b.A()) {
                return;
            }
            if (p(c0Var)) {
                this.f14396a.remove(c0Var);
            }
        }
    }

    public final void k() {
        D();
        f(ConnectionResult.f38918f);
        o();
        Iterator it = this.f14401f.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        j();
        m();
    }

    public final void l(int i10) {
        D();
        this.f14404i = true;
        this.f14399d.e(i10, this.f14397b.m());
        C2054b c2054b = this.f14398c;
        C2057e c2057e = this.f14408s;
        c2057e.f14481n.sendMessageDelayed(Message.obtain(c2057e.f14481n, 9, c2054b), HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS);
        C2054b c2054b2 = this.f14398c;
        C2057e c2057e2 = this.f14408s;
        c2057e2.f14481n.sendMessageDelayed(Message.obtain(c2057e2.f14481n, 11, c2054b2), 120000L);
        this.f14408s.f14474g.c();
        Iterator it = this.f14401f.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private final void m() {
        this.f14408s.f14481n.removeMessages(12, this.f14398c);
        C2054b c2054b = this.f14398c;
        C2057e c2057e = this.f14408s;
        c2057e.f14481n.sendMessageDelayed(c2057e.f14481n.obtainMessage(12, c2054b), this.f14408s.f14468a);
    }

    private final void n(c0 c0Var) {
        c0Var.d(this.f14399d, a());
        try {
            c0Var.c(this);
        } catch (DeadObjectException unused) {
            e(1);
            this.f14397b.b("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void o() {
        if (this.f14404i) {
            C2057e c2057e = this.f14408s;
            c2057e.f14481n.removeMessages(11, this.f14398c);
            C2057e c2057e2 = this.f14408s;
            c2057e2.f14481n.removeMessages(9, this.f14398c);
            this.f14404i = false;
        }
    }

    private final boolean p(c0 c0Var) {
        if (!(c0Var instanceof M)) {
            n(c0Var);
            return true;
        }
        M m10 = (M) c0Var;
        O8.c cVarD = d(m10.g(this));
        if (cVarD == null) {
            n(c0Var);
            return true;
        }
        Log.w("GoogleApiManager", this.f14397b.getClass().getName() + " could not execute call because it requires feature (" + cVarD.getName() + ", " + cVarD.d() + ").");
        if (!this.f14408s.f14482o || !m10.f(this)) {
            m10.b(new P8.l(cVarD));
            return true;
        }
        G g10 = new G(this.f14398c, cVarD, null);
        int iIndexOf = this.f14405j.indexOf(g10);
        if (iIndexOf >= 0) {
            G g11 = (G) this.f14405j.get(iIndexOf);
            this.f14408s.f14481n.removeMessages(15, g11);
            C2057e c2057e = this.f14408s;
            c2057e.f14481n.sendMessageDelayed(Message.obtain(c2057e.f14481n, 15, g11), HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS);
            return false;
        }
        this.f14405j.add(g10);
        C2057e c2057e2 = this.f14408s;
        c2057e2.f14481n.sendMessageDelayed(Message.obtain(c2057e2.f14481n, 15, g10), HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS);
        C2057e c2057e3 = this.f14408s;
        c2057e3.f14481n.sendMessageDelayed(Message.obtain(c2057e3.f14481n, 16, g10), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (q(connectionResult)) {
            return false;
        }
        this.f14408s.f(connectionResult, this.f14402g);
        return false;
    }

    private final boolean q(ConnectionResult connectionResult) {
        synchronized (C2057e.f14466r) {
            try {
                C2057e c2057e = this.f14408s;
                if (c2057e.f14478k == null || !c2057e.f14479l.contains(this.f14398c)) {
                    return false;
                }
                this.f14408s.f14478k.s(connectionResult, this.f14402g);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean r(boolean z10) {
        AbstractC2115p.d(this.f14408s.f14481n);
        if (!this.f14397b.A() || !this.f14401f.isEmpty()) {
            return false;
        }
        if (!this.f14399d.g()) {
            this.f14397b.b("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        m();
        return false;
    }

    public final void D() {
        AbstractC2115p.d(this.f14408s.f14481n);
        this.f14406q = null;
    }

    public final void E() {
        AbstractC2115p.d(this.f14408s.f14481n);
        if (this.f14397b.A() || this.f14397b.c()) {
            return;
        }
        try {
            C2057e c2057e = this.f14408s;
            int iB = c2057e.f14474g.b(c2057e.f14472e, this.f14397b);
            if (iB == 0) {
                C2057e c2057e2 = this.f14408s;
                a.f fVar = this.f14397b;
                I i10 = new I(c2057e2, fVar, this.f14398c);
                if (fVar.f()) {
                    ((V) AbstractC2115p.l(this.f14403h)).J3(i10);
                }
                try {
                    this.f14397b.j(i10);
                    return;
                } catch (SecurityException e10) {
                    H(new ConnectionResult(10), e10);
                    return;
                }
            }
            ConnectionResult connectionResult = new ConnectionResult(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.f14397b.getClass().getName() + " is not available: " + connectionResult.toString());
            H(connectionResult, null);
        } catch (IllegalStateException e11) {
            H(new ConnectionResult(10), e11);
        }
    }

    public final void F(c0 c0Var) {
        AbstractC2115p.d(this.f14408s.f14481n);
        if (this.f14397b.A()) {
            if (p(c0Var)) {
                m();
                return;
            } else {
                this.f14396a.add(c0Var);
                return;
            }
        }
        this.f14396a.add(c0Var);
        ConnectionResult connectionResult = this.f14406q;
        if (connectionResult == null || !connectionResult.i()) {
            E();
        } else {
            H(this.f14406q, null);
        }
    }

    final void G() {
        this.f14407r++;
    }

    public final void H(ConnectionResult connectionResult, Exception exc) {
        AbstractC2115p.d(this.f14408s.f14481n);
        V v10 = this.f14403h;
        if (v10 != null) {
            v10.K3();
        }
        D();
        this.f14408s.f14474g.c();
        f(connectionResult);
        if ((this.f14397b instanceof T8.e) && connectionResult.d() != 24) {
            this.f14408s.f14469b = true;
            C2057e c2057e = this.f14408s;
            c2057e.f14481n.sendMessageDelayed(c2057e.f14481n.obtainMessage(19), 300000L);
        }
        if (connectionResult.d() == 4) {
            g(C2057e.f14465q);
            return;
        }
        if (this.f14396a.isEmpty()) {
            this.f14406q = connectionResult;
            return;
        }
        if (exc != null) {
            AbstractC2115p.d(this.f14408s.f14481n);
            i(null, exc, false);
            return;
        }
        if (!this.f14408s.f14482o) {
            g(C2057e.g(this.f14398c, connectionResult));
            return;
        }
        i(C2057e.g(this.f14398c, connectionResult), null, true);
        if (this.f14396a.isEmpty() || q(connectionResult) || this.f14408s.f(connectionResult, this.f14402g)) {
            return;
        }
        if (connectionResult.d() == 18) {
            this.f14404i = true;
        }
        if (!this.f14404i) {
            g(C2057e.g(this.f14398c, connectionResult));
            return;
        }
        C2057e c2057e2 = this.f14408s;
        c2057e2.f14481n.sendMessageDelayed(Message.obtain(c2057e2.f14481n, 9, this.f14398c), HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS);
    }

    public final void I(ConnectionResult connectionResult) {
        AbstractC2115p.d(this.f14408s.f14481n);
        a.f fVar = this.f14397b;
        fVar.b("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        H(connectionResult, null);
    }

    public final void J() {
        AbstractC2115p.d(this.f14408s.f14481n);
        if (this.f14404i) {
            E();
        }
    }

    public final void K() {
        AbstractC2115p.d(this.f14408s.f14481n);
        g(C2057e.f14464p);
        this.f14399d.f();
        for (AbstractC2062j abstractC2062j : (AbstractC2062j[]) this.f14401f.keySet().toArray(new AbstractC2062j[0])) {
            F(new b0(null, new n9.j()));
        }
        f(new ConnectionResult(4));
        if (this.f14397b.A()) {
            this.f14397b.i(new D(this));
        }
    }

    public final void L() {
        AbstractC2115p.d(this.f14408s.f14481n);
        if (this.f14404i) {
            o();
            C2057e c2057e = this.f14408s;
            g(c2057e.f14473f.g(c2057e.f14472e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f14397b.b("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.f14397b.f();
    }

    public final boolean b() {
        return r(true);
    }

    @Override // Q8.InterfaceC2056d
    public final void c(Bundle bundle) {
        if (Looper.myLooper() == this.f14408s.f14481n.getLooper()) {
            k();
        } else {
            this.f14408s.f14481n.post(new A(this));
        }
    }

    @Override // Q8.InterfaceC2056d
    public final void e(int i10) {
        if (Looper.myLooper() == this.f14408s.f14481n.getLooper()) {
            l(i10);
        } else {
            this.f14408s.f14481n.post(new B(this, i10));
        }
    }

    @Override // Q8.InterfaceC2064l
    public final void h(ConnectionResult connectionResult) {
        H(connectionResult, null);
    }

    public final int s() {
        return this.f14402g;
    }

    final int t() {
        return this.f14407r;
    }

    public final a.f v() {
        return this.f14397b;
    }

    public final Map x() {
        return this.f14401f;
    }
}
