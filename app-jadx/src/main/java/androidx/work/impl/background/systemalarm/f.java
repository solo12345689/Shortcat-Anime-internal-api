package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.v;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import i4.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import k4.InterfaceC5447c;
import m4.n;
import n4.AbstractC5748x;
import n4.C5737m;
import n4.C5745u;
import o4.C5819D;
import o4.x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements InterfaceC5447c, C5819D.a {

    /* JADX INFO: renamed from: m */
    private static final String f32803m = i.i("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a */
    private final Context f32804a;

    /* JADX INFO: renamed from: b */
    private final int f32805b;

    /* JADX INFO: renamed from: c */
    private final C5737m f32806c;

    /* JADX INFO: renamed from: d */
    private final g f32807d;

    /* JADX INFO: renamed from: e */
    private final k4.e f32808e;

    /* JADX INFO: renamed from: f */
    private final Object f32809f;

    /* JADX INFO: renamed from: g */
    private int f32810g;

    /* JADX INFO: renamed from: h */
    private final Executor f32811h;

    /* JADX INFO: renamed from: i */
    private final Executor f32812i;

    /* JADX INFO: renamed from: j */
    private PowerManager.WakeLock f32813j;

    /* JADX INFO: renamed from: k */
    private boolean f32814k;

    /* JADX INFO: renamed from: l */
    private final v f32815l;

    f(Context context, int i10, g gVar, v vVar) {
        this.f32804a = context;
        this.f32805b = i10;
        this.f32807d = gVar;
        this.f32806c = vVar.a();
        this.f32815l = vVar;
        n nVarU = gVar.g().u();
        this.f32811h = gVar.e().b();
        this.f32812i = gVar.e().a();
        this.f32808e = new k4.e(nVarU, this);
        this.f32814k = false;
        this.f32810g = 0;
        this.f32809f = new Object();
    }

    private void f() {
        synchronized (this.f32809f) {
            try {
                this.f32808e.reset();
                this.f32807d.h().b(this.f32806c);
                PowerManager.WakeLock wakeLock = this.f32813j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    i.e().a(f32803m, "Releasing wakelock " + this.f32813j + "for WorkSpec " + this.f32806c);
                    this.f32813j.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i() {
        if (this.f32810g != 0) {
            i.e().a(f32803m, "Already started work for " + this.f32806c);
            return;
        }
        this.f32810g = 1;
        i.e().a(f32803m, "onAllConstraintsMet for " + this.f32806c);
        if (this.f32807d.d().n(this.f32815l)) {
            this.f32807d.h().a(this.f32806c, HTTPTimeoutManager.TIMEOUT_RESET_INTERVAL_MS, this);
        } else {
            f();
        }
    }

    public void j() {
        String strB = this.f32806c.b();
        if (this.f32810g >= 2) {
            i.e().a(f32803m, "Already stopped work for " + strB);
            return;
        }
        this.f32810g = 2;
        i iVarE = i.e();
        String str = f32803m;
        iVarE.a(str, "Stopping work for WorkSpec " + strB);
        this.f32812i.execute(new g.b(this.f32807d, b.e(this.f32804a, this.f32806c), this.f32805b));
        if (!this.f32807d.d().k(this.f32806c.b())) {
            i.e().a(str, "Processor does not have WorkSpec " + strB + ". No need to reschedule");
            return;
        }
        i.e().a(str, "WorkSpec " + strB + " needs to be rescheduled");
        this.f32812i.execute(new g.b(this.f32807d, b.d(this.f32804a, this.f32806c), this.f32805b));
    }

    @Override // o4.C5819D.a
    public void a(C5737m c5737m) {
        i.e().a(f32803m, "Exceeded time limits on execution for " + c5737m);
        this.f32811h.execute(new d(this));
    }

    @Override // k4.InterfaceC5447c
    public void b(List list) {
        this.f32811h.execute(new d(this));
    }

    @Override // k4.InterfaceC5447c
    public void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC5748x.a((C5745u) it.next()).equals(this.f32806c)) {
                this.f32811h.execute(new Runnable() { // from class: androidx.work.impl.background.systemalarm.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32802a.i();
                    }
                });
                return;
            }
        }
    }

    void g() {
        String strB = this.f32806c.b();
        this.f32813j = x.b(this.f32804a, strB + " (" + this.f32805b + ")");
        i iVarE = i.e();
        String str = f32803m;
        iVarE.a(str, "Acquiring wakelock " + this.f32813j + "for WorkSpec " + strB);
        this.f32813j.acquire();
        C5745u c5745uH = this.f32807d.g().v().J().h(strB);
        if (c5745uH == null) {
            this.f32811h.execute(new d(this));
            return;
        }
        boolean zH = c5745uH.h();
        this.f32814k = zH;
        if (zH) {
            this.f32808e.a(Collections.singletonList(c5745uH));
            return;
        }
        i.e().a(str, "No constraints for " + strB);
        e(Collections.singletonList(c5745uH));
    }

    void h(boolean z10) {
        i.e().a(f32803m, "onExecuted " + this.f32806c + ", " + z10);
        f();
        if (z10) {
            this.f32812i.execute(new g.b(this.f32807d, b.d(this.f32804a, this.f32806c), this.f32805b));
        }
        if (this.f32814k) {
            this.f32812i.execute(new g.b(this.f32807d, b.a(this.f32804a), this.f32805b));
        }
    }
}
