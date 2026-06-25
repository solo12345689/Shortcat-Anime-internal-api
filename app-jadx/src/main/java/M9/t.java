package M9;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import n9.InterfaceC5760d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: o */
    private static final Map f12296o = new HashMap();

    /* JADX INFO: renamed from: a */
    private final Context f12297a;

    /* JADX INFO: renamed from: b */
    private final i f12298b;

    /* JADX INFO: renamed from: g */
    private boolean f12303g;

    /* JADX INFO: renamed from: h */
    private final Intent f12304h;

    /* JADX INFO: renamed from: l */
    private ServiceConnection f12308l;

    /* JADX INFO: renamed from: m */
    private IInterface f12309m;

    /* JADX INFO: renamed from: n */
    private final L9.i f12310n;

    /* JADX INFO: renamed from: d */
    private final List f12300d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final Set f12301e = new HashSet();

    /* JADX INFO: renamed from: f */
    private final Object f12302f = new Object();

    /* JADX INFO: renamed from: j */
    private final IBinder.DeathRecipient f12306j = new IBinder.DeathRecipient() { // from class: M9.l
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.h(this.f12288a);
        }
    };

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f12307k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    private final String f12299c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i */
    private final WeakReference f12305i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, L9.i iVar2, o oVar, byte[] bArr) {
        this.f12297a = context;
        this.f12298b = iVar;
        this.f12304h = intent;
        this.f12310n = iVar2;
    }

    public static /* synthetic */ void h(t tVar) {
        tVar.f12298b.d("reportBinderDeath", new Object[0]);
        android.support.v4.media.session.b.a(tVar.f12305i.get());
        tVar.f12298b.d("%s : Binder has died.", tVar.f12299c);
        Iterator it = tVar.f12300d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(tVar.s());
        }
        tVar.f12300d.clear();
        tVar.t();
    }

    static /* bridge */ /* synthetic */ void m(t tVar, j jVar) {
        if (tVar.f12309m != null || tVar.f12303g) {
            if (!tVar.f12303g) {
                jVar.run();
                return;
            } else {
                tVar.f12298b.d("Waiting to bind to the service.", new Object[0]);
                tVar.f12300d.add(jVar);
                return;
            }
        }
        tVar.f12298b.d("Initiate binding to the service.", new Object[0]);
        tVar.f12300d.add(jVar);
        s sVar = new s(tVar, null);
        tVar.f12308l = sVar;
        tVar.f12303g = true;
        if (tVar.f12297a.bindService(tVar.f12304h, sVar, 1)) {
            return;
        }
        tVar.f12298b.d("Failed to bind to the service.", new Object[0]);
        tVar.f12303g = false;
        Iterator it = tVar.f12300d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new u());
        }
        tVar.f12300d.clear();
    }

    static /* bridge */ /* synthetic */ void n(t tVar) {
        tVar.f12298b.d("linkToDeath", new Object[0]);
        try {
            tVar.f12309m.asBinder().linkToDeath(tVar.f12306j, 0);
        } catch (RemoteException e10) {
            tVar.f12298b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void o(t tVar) {
        tVar.f12298b.d("unlinkToDeath", new Object[0]);
        tVar.f12309m.asBinder().unlinkToDeath(tVar.f12306j, 0);
    }

    private final RemoteException s() {
        return new RemoteException(String.valueOf(this.f12299c).concat(" : Binder has died."));
    }

    public final void t() {
        synchronized (this.f12302f) {
            try {
                Iterator it = this.f12301e.iterator();
                while (it.hasNext()) {
                    ((n9.j) it.next()).d(s());
                }
                this.f12301e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f12296o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f12299c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f12299c, 10);
                    handlerThread.start();
                    map.put(this.f12299c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f12299c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f12309m;
    }

    public final void p(j jVar, final n9.j jVar2) {
        synchronized (this.f12302f) {
            this.f12301e.add(jVar2);
            jVar2.a().c(new InterfaceC5760d() { // from class: M9.k
                @Override // n9.InterfaceC5760d
                public final void a(n9.i iVar) {
                    this.f12286a.q(jVar2, iVar);
                }
            });
        }
        synchronized (this.f12302f) {
            try {
                if (this.f12307k.getAndIncrement() > 0) {
                    this.f12298b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c().post(new m(this, jVar.b(), jVar));
    }

    final /* synthetic */ void q(n9.j jVar, n9.i iVar) {
        synchronized (this.f12302f) {
            this.f12301e.remove(jVar);
        }
    }

    public final void r(n9.j jVar) {
        synchronized (this.f12302f) {
            this.f12301e.remove(jVar);
        }
        synchronized (this.f12302f) {
            try {
                if (this.f12307k.get() > 0 && this.f12307k.decrementAndGet() > 0) {
                    this.f12298b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new n(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
