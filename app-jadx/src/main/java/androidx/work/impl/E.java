package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.ForceStopRunnable;
import i4.i;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import n4.C5737m;
import o4.AbstractRunnableC5821b;
import p4.C5932c;
import p4.InterfaceC5931b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class E extends i4.t {

    /* JADX INFO: renamed from: k */
    private static final String f32703k = i4.i.i("WorkManagerImpl");

    /* JADX INFO: renamed from: l */
    private static E f32704l = null;

    /* JADX INFO: renamed from: m */
    private static E f32705m = null;

    /* JADX INFO: renamed from: n */
    private static final Object f32706n = new Object();

    /* JADX INFO: renamed from: a */
    private Context f32707a;

    /* JADX INFO: renamed from: b */
    private androidx.work.a f32708b;

    /* JADX INFO: renamed from: c */
    private WorkDatabase f32709c;

    /* JADX INFO: renamed from: d */
    private InterfaceC5931b f32710d;

    /* JADX INFO: renamed from: e */
    private List f32711e;

    /* JADX INFO: renamed from: f */
    private r f32712f;

    /* JADX INFO: renamed from: g */
    private o4.q f32713g;

    /* JADX INFO: renamed from: h */
    private boolean f32714h;

    /* JADX INFO: renamed from: i */
    private BroadcastReceiver.PendingResult f32715i;

    /* JADX INFO: renamed from: j */
    private final m4.n f32716j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public E(Context context, androidx.work.a aVar, InterfaceC5931b interfaceC5931b) {
        this(context, aVar, interfaceC5931b, context.getResources().getBoolean(i4.p.f48685a));
    }

    public static void i(Context context, androidx.work.a aVar) {
        synchronized (f32706n) {
            try {
                E e10 = f32704l;
                if (e10 != null && f32705m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (e10 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f32705m == null) {
                        f32705m = new E(applicationContext, aVar, new C5932c(aVar.m()));
                    }
                    f32704l = f32705m;
                }
            } finally {
            }
        }
    }

    public static E p() {
        synchronized (f32706n) {
            try {
                E e10 = f32704l;
                if (e10 != null) {
                    return e10;
                }
                return f32705m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static E q(Context context) {
        E eP;
        synchronized (f32706n) {
            try {
                eP = p();
                if (eP == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eP;
    }

    private void x(Context context, androidx.work.a aVar, InterfaceC5931b interfaceC5931b, WorkDatabase workDatabase, List list, r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.f32707a = applicationContext;
        this.f32708b = aVar;
        this.f32710d = interfaceC5931b;
        this.f32709c = workDatabase;
        this.f32711e = list;
        this.f32712f = rVar;
        this.f32713g = new o4.q(workDatabase);
        this.f32714h = false;
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f32710d.c(new ForceStopRunnable(applicationContext, this));
    }

    public void A(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f32706n) {
            try {
                this.f32715i = pendingResult;
                if (this.f32714h) {
                    pendingResult.finish();
                    this.f32715i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void B(v vVar) {
        C(vVar, null);
    }

    public void C(v vVar, WorkerParameters.a aVar) {
        this.f32710d.c(new o4.u(this, vVar, aVar));
    }

    public void D(C5737m c5737m) {
        this.f32710d.c(new o4.v(this, new v(c5737m), true));
    }

    public void E(v vVar) {
        this.f32710d.c(new o4.v(this, vVar, false));
    }

    @Override // i4.t
    public i4.l a(String str) {
        AbstractRunnableC5821b abstractRunnableC5821bD = AbstractRunnableC5821b.d(str, this);
        this.f32710d.c(abstractRunnableC5821bD);
        return abstractRunnableC5821bD.e();
    }

    @Override // i4.t
    public i4.l b(String str) {
        AbstractRunnableC5821b abstractRunnableC5821bC = AbstractRunnableC5821b.c(str, this, true);
        this.f32710d.c(abstractRunnableC5821bC);
        return abstractRunnableC5821bC.e();
    }

    @Override // i4.t
    public i4.l d(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new x(this, list).a();
    }

    @Override // i4.t
    public i4.l e(String str, i4.c cVar, i4.n nVar) {
        return cVar == i4.c.UPDATE ? I.c(this, str, nVar) : m(str, cVar, nVar).a();
    }

    @Override // i4.t
    public i4.l g(String str, i4.d dVar, List list) {
        return new x(this, str, dVar, list).a();
    }

    @Override // i4.t
    public i4.l j() {
        o4.s sVar = new o4.s(this);
        this.f32710d.c(sVar);
        return sVar.a();
    }

    public i4.l k(UUID uuid) {
        AbstractRunnableC5821b abstractRunnableC5821bB = AbstractRunnableC5821b.b(uuid, this);
        this.f32710d.c(abstractRunnableC5821bB);
        return abstractRunnableC5821bB.e();
    }

    public List l(Context context, androidx.work.a aVar, m4.n nVar) {
        return Arrays.asList(u.a(context, this), new j4.b(context, aVar, nVar, this));
    }

    public x m(String str, i4.c cVar, i4.n nVar) {
        return new x(this, str, cVar == i4.c.KEEP ? i4.d.KEEP : i4.d.REPLACE, Collections.singletonList(nVar));
    }

    public Context n() {
        return this.f32707a;
    }

    public androidx.work.a o() {
        return this.f32708b;
    }

    public o4.q r() {
        return this.f32713g;
    }

    public r s() {
        return this.f32712f;
    }

    public List t() {
        return this.f32711e;
    }

    public m4.n u() {
        return this.f32716j;
    }

    public WorkDatabase v() {
        return this.f32709c;
    }

    public InterfaceC5931b w() {
        return this.f32710d;
    }

    public void y() {
        synchronized (f32706n) {
            try {
                this.f32714h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f32715i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f32715i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        androidx.work.impl.background.systemjob.g.b(n());
        v().J().m();
        u.b(o(), v(), t());
    }

    public E(Context context, androidx.work.a aVar, InterfaceC5931b interfaceC5931b, boolean z10) {
        this(context, aVar, interfaceC5931b, WorkDatabase.D(context.getApplicationContext(), interfaceC5931b.b(), z10));
    }

    public E(Context context, androidx.work.a aVar, InterfaceC5931b interfaceC5931b, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        i4.i.h(new i.a(aVar.j()));
        m4.n nVar = new m4.n(applicationContext, interfaceC5931b);
        this.f32716j = nVar;
        List listL = l(applicationContext, aVar, nVar);
        x(context, aVar, interfaceC5931b, workDatabase, listL, new r(context, aVar, interfaceC5931b, workDatabase, listL));
    }
}
