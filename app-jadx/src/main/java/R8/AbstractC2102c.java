package R8;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: R8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2102c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f15239A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private volatile l0 f15240B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected AtomicInteger f15241C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f15243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f15244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f15246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile String f15247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    u0 f15248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f15249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Looper f15250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC2107h f15251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.b f15252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Handler f15253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f15254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f15255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC2111l f15256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected InterfaceC0263c f15257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private IInterface f15258q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f15259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i0 f15260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f15261t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final a f15262u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final b f15263v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f15264w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f15265x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile String f15266y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ConnectionResult f15267z;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final O8.c[] f15238E = new O8.c[0];

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f15237D = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: R8.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void c(Bundle bundle);

        void e(int i10);
    }

    /* JADX INFO: renamed from: R8.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void h(ConnectionResult connectionResult);
    }

    /* JADX INFO: renamed from: R8.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0263c {
        void a(ConnectionResult connectionResult);
    }

    /* JADX INFO: renamed from: R8.c$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected class d implements InterfaceC0263c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2102c f15268a;

        public d(AbstractC2102c abstractC2102c) {
            Objects.requireNonNull(abstractC2102c);
            this.f15268a = abstractC2102c;
        }

        @Override // R8.AbstractC2102c.InterfaceC0263c
        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.l()) {
                AbstractC2102c abstractC2102c = this.f15268a;
                abstractC2102c.n(null, abstractC2102c.B());
            } else {
                AbstractC2102c abstractC2102c2 = this.f15268a;
                if (abstractC2102c2.d0() != null) {
                    abstractC2102c2.d0().h(connectionResult);
                }
            }
        }
    }

    /* JADX INFO: renamed from: R8.c$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractC2102c(Context context, Looper looper, int i10, a aVar, b bVar, String str) {
        AbstractC2107h abstractC2107hB = AbstractC2107h.b(context);
        com.google.android.gms.common.b bVarF = com.google.android.gms.common.b.f();
        AbstractC2115p.l(aVar);
        AbstractC2115p.l(bVar);
        this(context, looper, abstractC2107hB, bVarF, i10, aVar, bVar, str);
    }

    private final void h0(int i10, IInterface iInterface) {
        u0 u0Var;
        AbstractC2115p.a((i10 == 4) == (iInterface != null));
        synchronized (this.f15254m) {
            try {
                this.f15261t = i10;
                this.f15258q = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    i0 i0Var = this.f15260s;
                    if (i0Var != null) {
                        AbstractC2107h abstractC2107h = this.f15251j;
                        String strA = this.f15248g.a();
                        AbstractC2115p.l(strA);
                        abstractC2107h.f(strA, this.f15248g.b(), 4225, i0Var, S(), this.f15248g.c());
                        this.f15260s = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    i0 i0Var2 = this.f15260s;
                    if (i0Var2 != null && (u0Var = this.f15248g) != null) {
                        String strA2 = u0Var.a();
                        String strB = u0Var.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strA2).length() + 70 + String.valueOf(strB).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(strA2);
                        sb2.append(" on ");
                        sb2.append(strB);
                        Log.e("GmsClient", sb2.toString());
                        AbstractC2107h abstractC2107h2 = this.f15251j;
                        String strA3 = this.f15248g.a();
                        AbstractC2115p.l(strA3);
                        abstractC2107h2.f(strA3, this.f15248g.b(), 4225, i0Var2, S(), this.f15248g.c());
                        this.f15241C.incrementAndGet();
                    }
                    i0 i0Var3 = new i0(this, this.f15241C.get());
                    this.f15260s = i0Var3;
                    u0 u0Var2 = (this.f15261t != 3 || z() == null) ? new u0(F(), E(), false, 4225, H()) : new u0(w().getPackageName(), z(), true, 4225, false);
                    this.f15248g = u0Var2;
                    if (u0Var2.c() && k() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f15248g.a())));
                    }
                    AbstractC2107h abstractC2107h3 = this.f15251j;
                    String strA4 = this.f15248g.a();
                    AbstractC2115p.l(strA4);
                    ConnectionResult connectionResultE = abstractC2107h3.e(new p0(strA4, this.f15248g.b(), 4225, this.f15248g.c()), i0Var3, S(), u());
                    if (!connectionResultE.l()) {
                        String strA5 = this.f15248g.a();
                        String strB2 = this.f15248g.b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(strA5).length() + 34 + String.valueOf(strB2).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(strA5);
                        sb3.append(" on ");
                        sb3.append(strB2);
                        Log.w("GmsClient", sb3.toString());
                        int iD = connectionResultE.d() == -1 ? 16 : connectionResultE.d();
                        if (connectionResultE.f() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", connectionResultE.f());
                        }
                        T(iD, bundle, this.f15241C.get());
                    }
                } else if (i10 == 4) {
                    AbstractC2115p.l(iInterface);
                    J(iInterface);
                }
            } finally {
            }
        }
    }

    public boolean A() {
        boolean z10;
        synchronized (this.f15254m) {
            z10 = this.f15261t == 4;
        }
        return z10;
    }

    protected Set B() {
        return Collections.EMPTY_SET;
    }

    public final IInterface C() {
        IInterface iInterface;
        synchronized (this.f15254m) {
            try {
                if (this.f15261t == 5) {
                    throw new DeadObjectException();
                }
                p();
                IInterface iInterface2 = this.f15258q;
                AbstractC2115p.m(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    protected abstract String D();

    protected abstract String E();

    protected String F() {
        return "com.google.android.gms";
    }

    public C2104e G() {
        l0 l0Var = this.f15240B;
        if (l0Var == null) {
            return null;
        }
        return l0Var.f15333d;
    }

    protected boolean H() {
        return k() >= 211700000;
    }

    public boolean I() {
        return this.f15240B != null;
    }

    protected void J(IInterface iInterface) {
        this.f15244c = System.currentTimeMillis();
    }

    protected void K(ConnectionResult connectionResult) {
        this.f15245d = connectionResult.d();
        this.f15246e = System.currentTimeMillis();
    }

    protected void L(int i10) {
        this.f15242a = i10;
        this.f15243b = System.currentTimeMillis();
    }

    protected void M(int i10, IBinder iBinder, Bundle bundle, int i11) {
        j0 j0Var = new j0(this, i10, iBinder, bundle);
        Handler handler = this.f15253l;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, j0Var));
    }

    public boolean N() {
        return false;
    }

    public void O(String str) {
        this.f15266y = str;
    }

    public void P(int i10) {
        int i11 = this.f15241C.get();
        Handler handler = this.f15253l;
        handler.sendMessage(handler.obtainMessage(6, i11, i10));
    }

    protected void Q(InterfaceC0263c interfaceC0263c, int i10, PendingIntent pendingIntent) {
        AbstractC2115p.m(interfaceC0263c, "Connection progress callbacks cannot be null.");
        this.f15257p = interfaceC0263c;
        int i11 = this.f15241C.get();
        Handler handler = this.f15253l;
        handler.sendMessage(handler.obtainMessage(3, i11, i10, pendingIntent));
    }

    public boolean R() {
        return false;
    }

    protected final String S() {
        String str = this.f15265x;
        return str == null ? this.f15249h.getClass().getName() : str;
    }

    protected final void T(int i10, Bundle bundle, int i11) {
        k0 k0Var = new k0(this, i10, bundle);
        Handler handler = this.f15253l;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, k0Var));
    }

    final /* synthetic */ void U(l0 l0Var) {
        this.f15240B = l0Var;
        if (R()) {
            C2104e c2104e = l0Var.f15333d;
            C2116q.b().c(c2104e == null ? null : c2104e.l());
        }
    }

    final /* synthetic */ void V(int i10, IInterface iInterface) {
        h0(i10, null);
    }

    final /* synthetic */ boolean W(int i10, int i11, IInterface iInterface) {
        synchronized (this.f15254m) {
            try {
                if (this.f15261t != i10) {
                    return false;
                }
                h0(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void X(int i10) {
        int i11;
        int i12;
        synchronized (this.f15254m) {
            i11 = this.f15261t;
        }
        if (i11 == 3) {
            this.f15239A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = this.f15253l;
        handler.sendMessage(handler.obtainMessage(i12, this.f15241C.get(), 16));
    }

    final /* synthetic */ boolean Y() {
        if (this.f15239A || TextUtils.isEmpty(D()) || TextUtils.isEmpty(z())) {
            return false;
        }
        try {
            Class.forName(D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    final /* synthetic */ Object Z() {
        return this.f15255n;
    }

    final /* synthetic */ void a0(InterfaceC2111l interfaceC2111l) {
        this.f15256o = interfaceC2111l;
    }

    public void b(String str) {
        this.f15247f = str;
        disconnect();
    }

    final /* synthetic */ ArrayList b0() {
        return this.f15259r;
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f15254m) {
            int i10 = this.f15261t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    final /* synthetic */ a c0() {
        return this.f15262u;
    }

    public String d() {
        u0 u0Var;
        if (!A() || (u0Var = this.f15248g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return u0Var.b();
    }

    final /* synthetic */ b d0() {
        return this.f15263v;
    }

    public void disconnect() {
        this.f15241C.incrementAndGet();
        ArrayList arrayList = this.f15259r;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((g0) arrayList.get(i10)).d();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f15255n) {
            this.f15256o = null;
        }
        h0(1, null);
    }

    public boolean e() {
        return true;
    }

    final /* synthetic */ ConnectionResult e0() {
        return this.f15267z;
    }

    public boolean f() {
        return false;
    }

    final /* synthetic */ void f0(ConnectionResult connectionResult) {
        this.f15267z = connectionResult;
    }

    final /* synthetic */ boolean g0() {
        return this.f15239A;
    }

    public void i(e eVar) {
        eVar.a();
    }

    public void j(InterfaceC0263c interfaceC0263c) {
        AbstractC2115p.m(interfaceC0263c, "Connection progress callbacks cannot be null.");
        this.f15257p = interfaceC0263c;
        h0(2, null);
    }

    public abstract int k();

    public final O8.c[] l() {
        l0 l0Var = this.f15240B;
        if (l0Var == null) {
            return null;
        }
        return l0Var.f15331b;
    }

    public String m() {
        return this.f15247f;
    }

    public void n(InterfaceC2109j interfaceC2109j, Set set) {
        Bundle bundleY = y();
        String str = Build.VERSION.SDK_INT < 31 ? this.f15266y : this.f15266y;
        int i10 = this.f15264w;
        int i11 = com.google.android.gms.common.b.f38946a;
        Scope[] scopeArr = C2105f.f15292o;
        Bundle bundle = new Bundle();
        O8.c[] cVarArr = C2105f.f15293p;
        C2105f c2105f = new C2105f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        c2105f.f15297d = this.f15249h.getPackageName();
        c2105f.f15300g = bundleY;
        if (set != null) {
            c2105f.f15299f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (f()) {
            Account accountS = s();
            if (accountS == null) {
                accountS = new Account("<<default account>>", "com.google");
            }
            c2105f.f15301h = accountS;
            if (interfaceC2109j != null) {
                c2105f.f15298e = interfaceC2109j.asBinder();
            }
        } else if (N()) {
            c2105f.f15301h = s();
        }
        c2105f.f15302i = f15238E;
        c2105f.f15303j = t();
        if (R()) {
            c2105f.f15306m = true;
        }
        try {
            synchronized (this.f15255n) {
                try {
                    InterfaceC2111l interfaceC2111l = this.f15256o;
                    if (interfaceC2111l != null) {
                        interfaceC2111l.S0(new h0(this, this.f15241C.get()), c2105f);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            P(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.f15241C.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.f15241C.get());
        }
    }

    public void o() {
        int iH = this.f15252k.h(this.f15249h, k());
        if (iH == 0) {
            j(new d(this));
        } else {
            h0(1, null);
            Q(new d(this), iH, null);
        }
    }

    protected final void p() {
        if (!A()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract IInterface q(IBinder iBinder);

    protected boolean r() {
        return false;
    }

    public Account s() {
        return null;
    }

    public O8.c[] t() {
        return f15238E;
    }

    protected Executor u() {
        return null;
    }

    public Bundle v() {
        return null;
    }

    public final Context w() {
        return this.f15249h;
    }

    public int x() {
        return this.f15264w;
    }

    protected Bundle y() {
        return new Bundle();
    }

    protected String z() {
        return null;
    }

    protected AbstractC2102c(Context context, Looper looper, AbstractC2107h abstractC2107h, com.google.android.gms.common.b bVar, int i10, a aVar, b bVar2, String str) {
        this.f15247f = null;
        this.f15254m = new Object();
        this.f15255n = new Object();
        this.f15259r = new ArrayList();
        this.f15261t = 1;
        this.f15267z = null;
        this.f15239A = false;
        this.f15240B = null;
        this.f15241C = new AtomicInteger(0);
        AbstractC2115p.m(context, "Context must not be null");
        this.f15249h = context;
        AbstractC2115p.m(looper, "Looper must not be null");
        this.f15250i = looper;
        AbstractC2115p.m(abstractC2107h, "Supervisor must not be null");
        this.f15251j = abstractC2107h;
        AbstractC2115p.m(bVar, "API availability must not be null");
        this.f15252k = bVar;
        this.f15253l = new f0(this, looper);
        this.f15264w = i10;
        this.f15262u = aVar;
        this.f15263v = bVar2;
        this.f15265x = str;
    }
}
