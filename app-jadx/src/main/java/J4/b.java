package j4;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.E;
import androidx.work.impl.InterfaceC2955e;
import androidx.work.impl.t;
import androidx.work.impl.v;
import androidx.work.impl.w;
import com.amazon.a.a.o.b.f;
import i4.i;
import i4.s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k4.InterfaceC5447c;
import k4.InterfaceC5448d;
import k4.e;
import m4.n;
import n4.AbstractC5748x;
import n4.C5737m;
import n4.C5745u;
import o4.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements t, InterfaceC5447c, InterfaceC2955e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f51632j = i.i("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f51633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f51634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5448d f51635c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C5334a f51637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f51638f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Boolean f51641i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f51636d = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f51640h = new w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f51639g = new Object();

    public b(Context context, androidx.work.a aVar, n nVar, E e10) {
        this.f51633a = context;
        this.f51634b = e10;
        this.f51635c = new e(nVar, this);
        this.f51637e = new C5334a(this, aVar.k());
    }

    private void g() {
        this.f51641i = Boolean.valueOf(r.b(this.f51633a, this.f51634b.o()));
    }

    private void h() {
        if (this.f51638f) {
            return;
        }
        this.f51634b.s().g(this);
        this.f51638f = true;
    }

    private void i(C5737m c5737m) {
        synchronized (this.f51639g) {
            try {
                Iterator it = this.f51636d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5745u c5745u = (C5745u) it.next();
                    if (AbstractC5748x.a(c5745u).equals(c5737m)) {
                        i.e().a(f51632j, "Stopping tracking for " + c5737m);
                        this.f51636d.remove(c5745u);
                        this.f51635c.a(this.f51636d);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.t
    public void a(C5745u... c5745uArr) {
        if (this.f51641i == null) {
            g();
        }
        if (!this.f51641i.booleanValue()) {
            i.e().f(f51632j, "Ignoring schedule request in a secondary process");
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C5745u c5745u : c5745uArr) {
            if (!this.f51640h.a(AbstractC5748x.a(c5745u))) {
                long jC = c5745u.c();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c5745u.f53944b == s.ENQUEUED) {
                    if (jCurrentTimeMillis < jC) {
                        C5334a c5334a = this.f51637e;
                        if (c5334a != null) {
                            c5334a.a(c5745u);
                        }
                    } else if (c5745u.h()) {
                        if (c5745u.f53952j.h()) {
                            i.e().a(f51632j, "Ignoring " + c5745u + ". Requires device idle.");
                        } else if (c5745u.f53952j.e()) {
                            i.e().a(f51632j, "Ignoring " + c5745u + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(c5745u);
                            hashSet2.add(c5745u.f53943a);
                        }
                    } else if (!this.f51640h.a(AbstractC5748x.a(c5745u))) {
                        i.e().a(f51632j, "Starting work for " + c5745u.f53943a);
                        this.f51634b.B(this.f51640h.e(c5745u));
                    }
                }
            }
        }
        synchronized (this.f51639g) {
            try {
                if (!hashSet.isEmpty()) {
                    i.e().a(f51632j, "Starting tracking for " + TextUtils.join(f.f34694a, hashSet2));
                    this.f51636d.addAll(hashSet);
                    this.f51635c.a(this.f51636d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k4.InterfaceC5447c
    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5737m c5737mA = AbstractC5748x.a((C5745u) it.next());
            i.e().a(f51632j, "Constraints not met: Cancelling work ID " + c5737mA);
            v vVarB = this.f51640h.b(c5737mA);
            if (vVarB != null) {
                this.f51634b.E(vVarB);
            }
        }
    }

    @Override // androidx.work.impl.t
    public void c(String str) {
        if (this.f51641i == null) {
            g();
        }
        if (!this.f51641i.booleanValue()) {
            i.e().f(f51632j, "Ignoring schedule request in non-main process");
            return;
        }
        h();
        i.e().a(f51632j, "Cancelling work ID " + str);
        C5334a c5334a = this.f51637e;
        if (c5334a != null) {
            c5334a.b(str);
        }
        Iterator it = this.f51640h.c(str).iterator();
        while (it.hasNext()) {
            this.f51634b.E((v) it.next());
        }
    }

    @Override // androidx.work.impl.t
    public boolean d() {
        return false;
    }

    @Override // k4.InterfaceC5447c
    public void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5737m c5737mA = AbstractC5748x.a((C5745u) it.next());
            if (!this.f51640h.a(c5737mA)) {
                i.e().a(f51632j, "Constraints met: Scheduling work ID " + c5737mA);
                this.f51634b.B(this.f51640h.d(c5737mA));
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC2955e
    public void f(C5737m c5737m, boolean z10) {
        this.f51640h.b(c5737m);
        i(c5737m);
    }
}
