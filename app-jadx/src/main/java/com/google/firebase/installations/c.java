package com.google.firebase.installations;

import R8.AbstractC2115p;
import aa.w;
import android.text.TextUtils;
import com.google.firebase.installations.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import ma.InterfaceC5655b;
import n9.j;
import n9.l;
import na.C5771g;
import na.InterfaceC5769e;
import pa.AbstractC5953d;
import pa.AbstractC5955f;
import pa.C5952c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements InterfaceC5769e {

    /* JADX INFO: renamed from: m */
    private static final Object f43274m = new Object();

    /* JADX INFO: renamed from: n */
    private static final ThreadFactory f43275n = new a();

    /* JADX INFO: renamed from: a */
    private final X9.e f43276a;

    /* JADX INFO: renamed from: b */
    private final C5952c f43277b;

    /* JADX INFO: renamed from: c */
    private final oa.c f43278c;

    /* JADX INFO: renamed from: d */
    private final i f43279d;

    /* JADX INFO: renamed from: e */
    private final w f43280e;

    /* JADX INFO: renamed from: f */
    private final C5771g f43281f;

    /* JADX INFO: renamed from: g */
    private final Object f43282g;

    /* JADX INFO: renamed from: h */
    private final ExecutorService f43283h;

    /* JADX INFO: renamed from: i */
    private final Executor f43284i;

    /* JADX INFO: renamed from: j */
    private String f43285j;

    /* JADX INFO: renamed from: k */
    private Set f43286k;

    /* JADX INFO: renamed from: l */
    private final List f43287l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f43288a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f43288a.getAndIncrement())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f43289a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f43290b;

        static {
            int[] iArr = new int[AbstractC5955f.b.values().length];
            f43290b = iArr;
            try {
                iArr[AbstractC5955f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43290b[AbstractC5955f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43290b[AbstractC5955f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC5953d.b.values().length];
            f43289a = iArr2;
            try {
                iArr2[AbstractC5953d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43289a[AbstractC5953d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(final X9.e eVar, InterfaceC5655b interfaceC5655b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, eVar, new C5952c(eVar.l(), interfaceC5655b), new oa.c(eVar), i.c(), new w(new InterfaceC5655b() { // from class: na.a
            @Override // ma.InterfaceC5655b
            public final Object get() {
                return com.google.firebase.installations.c.e(eVar);
            }
        }), new C5771g());
    }

    private synchronized void A(String str) {
        this.f43285j = str;
    }

    private synchronized void B(oa.d dVar, oa.d dVar2) {
        if (this.f43286k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f43286k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    public static /* synthetic */ oa.b e(X9.e eVar) {
        return new oa.b(eVar);
    }

    private n9.i f() {
        j jVar = new j();
        h(new e(this.f43279d, jVar));
        return jVar.a();
    }

    private n9.i g() {
        j jVar = new j();
        h(new f(jVar));
        return jVar.a();
    }

    private void h(h hVar) {
        synchronized (this.f43282g) {
            this.f43287l.add(hVar);
        }
    }

    public void i(boolean z10) {
        oa.d dVarX;
        oa.d dVarR = r();
        try {
            if (dVarR.i() || dVarR.l()) {
                dVarX = x(dVarR);
            } else {
                if (!z10 && !this.f43279d.f(dVarR)) {
                    return;
                }
                dVarX = k(dVarR);
            }
            u(dVarX);
            B(dVarR, dVarX);
            if (dVarX.k()) {
                A(dVarX.d());
            }
            if (dVarX.i()) {
                y(new d(d.a.BAD_CONFIG));
            } else if (dVarX.j()) {
                y(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                z(dVarX);
            }
        } catch (d e10) {
            y(e10);
        }
    }

    public final void j(final boolean z10) {
        oa.d dVarS = s();
        if (z10) {
            dVarS = dVarS.p();
        }
        z(dVarS);
        this.f43284i.execute(new Runnable() { // from class: na.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f54052a.i(z10);
            }
        });
    }

    private oa.d k(oa.d dVar) throws d {
        AbstractC5955f abstractC5955fE = this.f43277b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f43290b[abstractC5955fE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(abstractC5955fE.c(), abstractC5955fE.d(), this.f43279d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        A(null);
        return dVar.r();
    }

    private synchronized String n() {
        return this.f43285j;
    }

    private oa.b o() {
        return (oa.b) this.f43280e.get();
    }

    public static c p() {
        return q(X9.e.n());
    }

    public static c q(X9.e eVar) {
        AbstractC2115p.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) eVar.j(InterfaceC5769e.class);
    }

    /* JADX WARN: Finally extract failed */
    private oa.d r() {
        oa.d dVarD;
        synchronized (f43274m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f43276a.l(), "generatefid.lock");
                try {
                    dVarD = this.f43278c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarD;
    }

    /* JADX WARN: Finally extract failed */
    private oa.d s() {
        oa.d dVarD;
        synchronized (f43274m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f43276a.l(), "generatefid.lock");
                try {
                    dVarD = this.f43278c.d();
                    if (dVarD.j()) {
                        dVarD = this.f43278c.b(dVarD.t(w(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarD;
    }

    /* JADX WARN: Finally extract failed */
    private void u(oa.d dVar) {
        synchronized (f43274m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f43276a.l(), "generatefid.lock");
                try {
                    this.f43278c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void v() {
        AbstractC2115p.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC2115p.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC2115p.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC2115p.b(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC2115p.b(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String w(oa.d dVar) {
        if ((!this.f43276a.p().equals("CHIME_ANDROID_SDK") && !this.f43276a.x()) || !dVar.m()) {
            return this.f43281f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f43281f.a() : strF;
    }

    private oa.d x(oa.d dVar) throws d {
        AbstractC5953d abstractC5953dD = this.f43277b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f43289a[abstractC5953dD.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(abstractC5953dD.c(), abstractC5953dD.d(), this.f43279d.b(), abstractC5953dD.b().c(), abstractC5953dD.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    private void y(Exception exc) {
        synchronized (this.f43282g) {
            try {
                Iterator it = this.f43287l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void z(oa.d dVar) {
        synchronized (this.f43282g) {
            try {
                Iterator it = this.f43287l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // na.InterfaceC5769e
    public n9.i a(final boolean z10) {
        v();
        n9.i iVarF = f();
        this.f43283h.execute(new Runnable() { // from class: na.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f54054a.j(z10);
            }
        });
        return iVarF;
    }

    @Override // na.InterfaceC5769e
    public n9.i getId() {
        v();
        String strN = n();
        if (strN != null) {
            return l.f(strN);
        }
        n9.i iVarG = g();
        this.f43283h.execute(new Runnable() { // from class: na.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f54051a.j(false);
            }
        });
        return iVarG;
    }

    String l() {
        return this.f43276a.q().b();
    }

    String m() {
        return this.f43276a.q().c();
    }

    String t() {
        return this.f43276a.q().g();
    }

    c(ExecutorService executorService, Executor executor, X9.e eVar, C5952c c5952c, oa.c cVar, i iVar, w wVar, C5771g c5771g) {
        this.f43282g = new Object();
        this.f43286k = new HashSet();
        this.f43287l = new ArrayList();
        this.f43276a = eVar;
        this.f43277b = c5952c;
        this.f43278c = cVar;
        this.f43279d = iVar;
        this.f43280e = wVar;
        this.f43281f = c5771g;
        this.f43283h = executorService;
        this.f43284i = executor;
    }
}
