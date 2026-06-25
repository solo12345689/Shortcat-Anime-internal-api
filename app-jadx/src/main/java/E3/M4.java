package E3;

import E3.C1375h3;
import E3.M4;
import E3.M4.a;
import F3.n;
import F3.q;
import F3.v;
import P9.AbstractC2011u;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.adjust.sdk.network.ErrorCodes;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C6071C;
import q2.C6077I;
import q2.C6082N;
import q2.C6083O;
import q2.C6088c;
import q2.C6101p;
import q2.InterfaceC6084P;
import q2.Y;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class M4 extends n.b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f4583z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1363g f4584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final I3 f4585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F3.q f4586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g f4587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e f4588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final F3.n f4589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final h f4590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ComponentName f4591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private F3.x f4592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f4593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile long f4594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.common.util.concurrent.i f4595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f4596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Bundle f4597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AbstractC2011u f4598t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AbstractC2011u f4599u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private U6 f4600v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private InterfaceC6084P.b f4601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private C6082N f4602x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InterfaceC6084P.b f4603y;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends F3.x {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Handler f4610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ N6 f4611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f4612h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11, int i12, String str, Handler handler, N6 n62, int i13) {
            super(i10, i11, i12, str);
            this.f4610f = handler;
            this.f4611g = n62;
            this.f4612h = i13;
        }

        public static /* synthetic */ void e(N6 n62, int i10, int i11) {
            if (n62.k(26) || n62.k(34)) {
                if (i10 == -100) {
                    if (n62.k(34)) {
                        n62.F(true, i11);
                        return;
                    } else {
                        n62.e0(true);
                        return;
                    }
                }
                if (i10 == -1) {
                    if (n62.k(34)) {
                        n62.X(i11);
                        return;
                    } else {
                        n62.M();
                        return;
                    }
                }
                if (i10 == 1) {
                    if (n62.k(34)) {
                        n62.N(i11);
                        return;
                    } else {
                        n62.i0();
                        return;
                    }
                }
                if (i10 == 100) {
                    if (n62.k(34)) {
                        n62.F(false, i11);
                        return;
                    } else {
                        n62.e0(false);
                        return;
                    }
                }
                if (i10 != 101) {
                    AbstractC6635w.i("VolumeProviderCompat", "onAdjustVolume: Ignoring unknown direction: " + i10);
                    return;
                }
                if (n62.k(34)) {
                    n62.F(!n62.o1(), i11);
                } else {
                    n62.e0(!n62.o1());
                }
            }
        }

        public static /* synthetic */ void f(N6 n62, int i10, int i11) {
            if (n62.k(25) || n62.k(33)) {
                if (n62.k(33)) {
                    n62.z0(i10, i11);
                } else {
                    n62.S0(i10);
                }
            }
        }

        @Override // F3.x
        public void b(final int i10) {
            Handler handler = this.f4610f;
            final N6 n62 = this.f4611g;
            final int i11 = this.f4612h;
            t2.a0.g1(handler, new Runnable() { // from class: E3.P4
                @Override // java.lang.Runnable
                public final void run() {
                    M4.c.e(n62, i10, i11);
                }
            });
        }

        @Override // F3.x
        public void c(final int i10) {
            Handler handler = this.f4610f;
            final N6 n62 = this.f4611g;
            final int i11 = this.f4612h;
            t2.a0.g1(handler, new Runnable() { // from class: E3.O4
                @Override // java.lang.Runnable
                public final void run() {
                    M4.c.f(n62, i10, i11);
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {
        public static void a(F3.n nVar, ComponentName componentName) {
            try {
                ((MediaSession) AbstractC6614a.e(nVar.d())).setMediaButtonBroadcastReceiver(componentName);
            } catch (IllegalArgumentException e10) {
                if (!Build.MANUFACTURER.equals("motorola")) {
                    throw e10;
                }
                AbstractC6635w.e("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1363g f4613a;

        public e(Looper looper, C1363g c1363g) {
            super(looper);
            this.f4613a = c1363g;
        }

        public void a(C1375h3.g gVar, long j10) {
            removeMessages(ErrorCodes.SERVER_RETRY_IN, gVar);
            sendMessageDelayed(obtainMessage(ErrorCodes.SERVER_RETRY_IN, gVar), j10);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1375h3.g gVar = (C1375h3.g) message.obj;
            if (this.f4613a.p(gVar)) {
                ((C1375h3.f) AbstractC6614a.i(gVar.c())).b(0);
                this.f4613a.t(gVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class f implements C1375h3.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q.b f4614a;

        public f(q.b bVar) {
            this.f4614a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != f.class) {
                return false;
            }
            return Objects.equals(this.f4614a, ((f) obj).f4614a);
        }

        public int hashCode() {
            return K1.b.b(this.f4614a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class h extends BroadcastReceiver {
        private h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            KeyEvent keyEvent;
            if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                M4.this.f4589k.b().c(keyEvent);
            }
        }

        /* synthetic */ h(M4 m42, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface i {
        void a(C1375h3.g gVar);
    }

    static {
        f4583z = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public M4(I3 i32, Uri uri, Handler handler, Bundle bundle, boolean z10, AbstractC2011u abstractC2011u, AbstractC2011u abstractC2011u2, U6 u62, InterfaceC6084P.b bVar, Bundle bundle2) {
        ComponentName componentNameJ0;
        boolean z11;
        PendingIntent foregroundService;
        this.f4585g = i32;
        this.f4593o = z10;
        this.f4598t = abstractC2011u;
        this.f4599u = abstractC2011u2;
        this.f4600v = u62;
        this.f4601w = bVar;
        this.f4597s = new Bundle(bundle2);
        Context contextA0 = i32.a0();
        this.f4586h = F3.q.a(contextA0);
        this.f4587i = new g();
        C1363g c1363g = new C1363g(i32);
        this.f4584f = c1363g;
        this.f4594p = 300000L;
        this.f4588j = new e(i32.X().getLooper(), c1363g);
        if (!abstractC2011u2.isEmpty()) {
            d1();
        }
        ComponentName componentNameR0 = R0(contextA0);
        this.f4591m = componentNameR0;
        if (componentNameR0 == null || Build.VERSION.SDK_INT < 31) {
            componentNameJ0 = J0(contextA0, "androidx.media3.session.MediaLibraryService");
            componentNameJ0 = componentNameJ0 == null ? J0(contextA0, "androidx.media3.session.MediaSessionService") : componentNameJ0;
            z11 = (componentNameJ0 == null || componentNameJ0.equals(componentNameR0)) ? false : true;
        } else {
            z11 = false;
            componentNameJ0 = componentNameR0;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        a aVar = null;
        if (componentNameJ0 == null) {
            h hVar = new h(this, aVar);
            this.f4590l = hVar;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            intentFilter.addDataScheme((String) t2.a0.l(uri.getScheme()));
            t2.a0.j1(contextA0, hVar, intentFilter);
            intent.setPackage(contextA0.getPackageName());
            foregroundService = PendingIntent.getBroadcast(contextA0, 0, intent, f4583z);
            componentNameJ0 = new ComponentName(contextA0, contextA0.getClass());
        } else {
            intent.setComponent(componentNameJ0);
            foregroundService = z11 ? Build.VERSION.SDK_INT >= 26 ? PendingIntent.getForegroundService(contextA0, 0, intent, f4583z) : PendingIntent.getService(contextA0, 0, intent, f4583z) : PendingIntent.getBroadcast(contextA0, 0, intent, f4583z);
            this.f4590l = null;
        }
        String strJoin = TextUtils.join(".", new String[]{"androidx.media3.session.id", i32.c0()});
        int i10 = Build.VERSION.SDK_INT;
        F3.n nVar = new F3.n(contextA0, strJoin, i10 >= 31 ? null : componentNameJ0, i10 < 31 ? foregroundService : null, bundle);
        this.f4589k = nVar;
        if (i10 >= 31 && componentNameR0 != null) {
            d.a(nVar, componentNameR0);
        }
        PendingIntent pendingIntentK0 = i32.k0();
        if (pendingIntentK0 != null) {
            nVar.w(pendingIntentK0);
        }
        nVar.k(this, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F3.x A0(N6 n62) {
        if (n62.getDeviceInfo().f56933a == 0) {
            return null;
        }
        InterfaceC6084P.b bVarP0 = n62.p0();
        int i10 = bVarP0.d(26, 34) ? bVarP0.d(25, 33) ? 2 : 1 : 0;
        Handler handler = new Handler(n62.m());
        int iI1 = n62.i1();
        C6101p deviceInfo = n62.getDeviceInfo();
        return new c(i10, deviceInfo.f56935c, iI1, deviceInfo.f56936d, handler, n62, 1);
    }

    private void B0(final int i10, final i iVar, final q.b bVar, final boolean z10) {
        if (this.f4585g.t0()) {
            return;
        }
        if (bVar != null) {
            t2.a0.g1(this.f4585g.X(), new Runnable() { // from class: E3.j4
                @Override // java.lang.Runnable
                public final void run() {
                    M4.f0(this.f5362a, i10, bVar, iVar, z10);
                }
            });
            return;
        }
        AbstractC6635w.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
    }

    private void C0(int i10, i iVar) {
        E0(null, i10, iVar, this.f4589k.c());
    }

    private void D0(T6 t62, i iVar) {
        E0(t62, 0, iVar, this.f4589k.c());
    }

    private void E0(final T6 t62, final int i10, final i iVar, final q.b bVar) {
        if (bVar != null) {
            t2.a0.g1(this.f4585g.X(), new Runnable() { // from class: E3.B4
                @Override // java.lang.Runnable
                public final void run() {
                    M4.a0(this.f4372a, t62, i10, bVar, iVar);
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("RemoteUserInfo is null, ignoring command=");
        Object objValueOf = t62;
        if (t62 == null) {
            objValueOf = Integer.valueOf(i10);
        }
        sb2.append(objValueOf);
        AbstractC6635w.b("MediaSessionLegacyStub", sb2.toString());
    }

    public static /* synthetic */ void F(M4 m42, N6 n62) {
        m42.f4589k.p(m42.z0(n62));
        m42.f4587i.M(n62.p0().c(17) ? n62.h0() : q2.Y.f56642a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String F0(Throwable th2) {
        return "Failed to load bitmap: " + th2.getMessage();
    }

    public static /* synthetic */ void G(i iVar, C1375h3.g gVar) {
        try {
            iVar.a(gVar);
        } catch (RemoteException e10) {
            AbstractC6635w.j("MediaSessionLegacyStub", "Exception in " + gVar, e10);
        }
    }

    public static /* synthetic */ void I(M4 m42, F3.l lVar, C1375h3.g gVar) {
        m42.getClass();
        String strG = lVar.g();
        if (TextUtils.isEmpty(strG)) {
            AbstractC6635w.i("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
            return;
        }
        N6 n6J0 = m42.f4585g.j0();
        if (!n6J0.k(17)) {
            AbstractC6635w.i("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
            return;
        }
        q2.Y yH0 = n6J0.h0();
        Y.d dVar = new Y.d();
        for (int i10 = 0; i10 < yH0.t(); i10++) {
            if (TextUtils.equals(yH0.r(i10, dVar).f56680c.f56327a, strG)) {
                n6J0.R(i10);
                return;
            }
        }
    }

    private static ComponentName J0(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    public static /* synthetic */ void L(M4 m42, T6 t62, Bundle bundle, C1375h3.g gVar) {
        I3 i32 = m42.f4585g;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        O0(i32.y0(gVar, t62, bundle));
    }

    private void M0(final C6071C c6071c, final boolean z10) {
        B0(31, new i() { // from class: E3.z4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                M4 m42 = this.f5619a;
                com.google.common.util.concurrent.j.a(m42.f4585g.H0(gVar, AbstractC2011u.B(c6071c), -1, -9223372036854775807L), m42.new a(gVar, z10), com.google.common.util.concurrent.s.a());
            }
        }, this.f4589k.c(), false);
    }

    private void N0(final F3.l lVar, final int i10) {
        if (lVar != null) {
            if (i10 == -1 || i10 >= 0) {
                B0(20, new i() { // from class: E3.q4
                    @Override // E3.M4.i
                    public final void a(C1375h3.g gVar) {
                        M4.P(this.f5496a, lVar, i10, gVar);
                    }
                }, this.f4589k.c(), false);
            }
        }
    }

    public static /* synthetic */ void O(M4 m42, T6 t62, Bundle bundle, ResultReceiver resultReceiver, C1375h3.g gVar) {
        I3 i32 = m42.f4585g;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        com.google.common.util.concurrent.p pVarY0 = i32.y0(gVar, t62, bundle);
        if (resultReceiver != null) {
            T0(resultReceiver, pVarY0);
        } else {
            O0(pVarY0);
        }
    }

    public static /* synthetic */ void P(M4 m42, F3.l lVar, int i10, C1375h3.g gVar) {
        m42.getClass();
        if (TextUtils.isEmpty(lVar.g())) {
            AbstractC6635w.i("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
        } else {
            com.google.common.util.concurrent.j.a(m42.f4585g.w0(gVar, AbstractC2011u.B(AbstractC1466t.u(lVar))), m42.new b(gVar, i10), com.google.common.util.concurrent.s.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P0() {
        return this.f4601w.c(17) && this.f4585g.j0().p0().c(17);
    }

    private static ComponentName R0(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + listQueryBroadcastReceivers.size());
    }

    private static void T0(final ResultReceiver resultReceiver, final com.google.common.util.concurrent.p pVar) {
        pVar.k(new Runnable() { // from class: E3.C4
            @Override // java.lang.Runnable
            public final void run() {
                M4.e0(pVar, resultReceiver);
            }
        }, com.google.common.util.concurrent.s.a());
    }

    public static /* synthetic */ void U(M4 m42, q2.S s10, C1375h3.g gVar) {
        C6071C c6071cF1 = m42.f4585g.j0().f1();
        if (c6071cF1 == null) {
            return;
        }
        O0(m42.f4585g.I0(gVar, c6071cF1.f56327a, s10));
    }

    private static void V0(F3.n nVar, PendingIntent pendingIntent) {
        nVar.n(pendingIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W0(F3.n nVar, F3.m mVar) {
        nVar.o(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(F3.n nVar, List list) {
        nVar.s(list);
    }

    public static /* synthetic */ void a0(M4 m42, T6 t62, int i10, q.b bVar, i iVar) {
        if (m42.f4585g.t0()) {
            return;
        }
        if (!m42.f4589k.g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignore incoming session command before initialization. command=");
            sb2.append(t62 == null ? Integer.valueOf(i10) : t62.f4975b);
            sb2.append(", pid=");
            sb2.append(bVar.b());
            AbstractC6635w.i("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        C1375h3.g gVarC1 = m42.c1(bVar);
        if (gVarC1 == null) {
            return;
        }
        if (t62 != null) {
            if (!m42.f4584f.s(gVarC1, t62)) {
                return;
            }
        } else if (!m42.f4584f.r(gVarC1, i10)) {
            return;
        }
        try {
            iVar.a(gVarC1);
        } catch (RemoteException e10) {
            AbstractC6635w.j("MediaSessionLegacyStub", "Exception in " + gVarC1, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(F3.n nVar, CharSequence charSequence) {
        if (!P0()) {
            charSequence = null;
        }
        nVar.t(charSequence);
    }

    private C1375h3.g c1(q.b bVar) {
        C1375h3.g gVarK = this.f4584f.k(bVar);
        if (gVarK == null) {
            f fVar = new f(bVar);
            C1375h3.g gVar = new C1375h3.g(bVar, 0, 0, this.f4586h.b(bVar), fVar, Bundle.EMPTY, 0);
            C1375h3.e eVarX0 = this.f4585g.x0(gVar);
            if (!eVarX0.f5318a) {
                fVar.b(0);
                return null;
            }
            this.f4584f.e(gVar.g(), gVar, eVarX0.f5319b, eVarX0.f5320c);
            this.f4585g.G0(gVar);
            gVarK = gVar;
        }
        this.f4588j.a(gVarK, this.f4594p);
        return gVarK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1() {
        AbstractC2011u abstractC2011u = this.f4599u;
        U6 u62 = this.f4600v;
        InterfaceC6084P.b bVar = this.f4603y;
        if (bVar == null) {
            bVar = this.f4601w;
        }
        this.f4598t = C1323b.f(C1323b.d(abstractC2011u, u62, bVar), true, true);
        this.f4597s.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !C1323b.a(r0, 2));
        this.f4597s.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true ^ C1323b.a(this.f4598t, 3));
    }

    public static /* synthetic */ void e0(com.google.common.util.concurrent.p pVar, ResultReceiver resultReceiver) {
        X6 x62;
        try {
            x62 = (X6) AbstractC6614a.f((X6) pVar.get(), "SessionResult must not be null");
        } catch (InterruptedException e10) {
            e = e10;
            AbstractC6635w.j("MediaSessionLegacyStub", "Custom command failed", e);
            x62 = new X6(-1);
        } catch (CancellationException e11) {
            AbstractC6635w.j("MediaSessionLegacyStub", "Custom command cancelled", e11);
            x62 = new X6(1);
        } catch (ExecutionException e12) {
            e = e12;
            AbstractC6635w.j("MediaSessionLegacyStub", "Custom command failed", e);
            x62 = new X6(-1);
        }
        resultReceiver.send(x62.f5063a, x62.f5064b);
    }

    public static /* synthetic */ void f0(M4 m42, int i10, q.b bVar, final i iVar, boolean z10) {
        if (m42.f4585g.t0()) {
            return;
        }
        if (!m42.f4589k.g()) {
            AbstractC6635w.i("MediaSessionLegacyStub", "Ignore incoming player command before initialization. command=" + i10 + ", pid=" + bVar.b());
            return;
        }
        final C1375h3.g gVarC1 = m42.c1(bVar);
        if (gVarC1 == null) {
            return;
        }
        if (!m42.f4584f.q(gVarC1, i10)) {
            if (i10 != 1 || m42.f4585g.j0().q0()) {
                return;
            }
            AbstractC6635w.i("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        if (m42.f4585g.E0(gVarC1, i10) != 0) {
            return;
        }
        m42.f4585g.L(gVarC1, new Runnable() { // from class: E3.A4
            @Override // java.lang.Runnable
            public final void run() {
                M4.G(iVar, gVarC1);
            }
        }).run();
        if (z10) {
            m42.f4585g.F0(gVarC1, new InterfaceC6084P.b.a().a(i10).f());
        }
    }

    private static long x0(int i10, boolean z10) {
        if (i10 == 1) {
            return z10 ? 516L : 514L;
        }
        if (i10 == 2) {
            return 16384L;
        }
        if (i10 == 3) {
            return 1L;
        }
        if (i10 == 31) {
            return 240640L;
        }
        switch (i10) {
            case 5:
                return 256L;
            case 6:
            case 7:
                return 16L;
            case 8:
            case 9:
                return 32L;
            case 10:
                return 4096L;
            case 11:
                return 8L;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return 64L;
            case 13:
                return 4194304L;
            case 14:
                return 2621440L;
            case 15:
                return 262144L;
            default:
                return 0L;
        }
    }

    private static C6071C y0(String str, Uri uri, String str2, Bundle bundle) {
        C6071C.c cVar = new C6071C.c();
        if (str == null) {
            str = "";
        }
        return cVar.d(str).g(new C6071C.i.a().f(uri).g(str2).e(bundle).d()).a();
    }

    private F3.v z0(N6 n62) {
        C6082N c6082nY = this.f4602x;
        if (c6082nY == null) {
            c6082nY = n62.y();
        }
        boolean z10 = n62.k(16) && !n62.Y0();
        boolean z11 = c6082nY != null || t2.a0.s1(n62, this.f4593o);
        int iN = c6082nY != null ? 7 : AbstractC1466t.N(n62, z11);
        InterfaceC6084P.b bVarP0 = n62.p0();
        InterfaceC6084P.b bVar = this.f4603y;
        InterfaceC6084P.b bVarF = bVar != null ? L6.f(bVar, bVarP0) : L6.f(this.f4601w, bVarP0);
        long jX0 = 128;
        for (int i10 = 0; i10 < bVarF.g(); i10++) {
            jX0 |= x0(bVarF.f(i10), z11);
        }
        if (!this.f4599u.isEmpty() && !this.f4597s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            jX0 &= -17;
        }
        if (!this.f4599u.isEmpty() && !this.f4597s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            jX0 &= -33;
        }
        if (!z10) {
            jX0 &= -257;
        }
        long jQ = n62.k(17) ? AbstractC1466t.Q(n62.K0()) : -1L;
        float f10 = n62.c().f56601a;
        float f11 = (n62.isPlaying() && z10) ? f10 : 0.0f;
        Bundle bundle = c6082nY != null ? new Bundle(c6082nY.f56597c) : new Bundle();
        bundle.putAll(this.f4597s);
        bundle.putFloat("EXO_SPEED", f10);
        C6071C c6071cF1 = n62.f1();
        if (c6071cF1 != null && !"".equals(c6071cF1.f56327a)) {
            bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", c6071cF1.f56327a);
        }
        long currentPosition = z10 ? n62.getCurrentPosition() : -1L;
        long jI0 = z10 ? n62.I0() : -1L;
        C6082N c6082n = c6082nY;
        v.c cVarG = new v.c().h(iN, currentPosition, f11, SystemClock.elapsedRealtime()).c(jX0).d(jQ).e(jI0).g(bundle);
        for (int i11 = 0; i11 < this.f4598t.size(); i11++) {
            C1323b c1323b = (C1323b) this.f4598t.get(i11);
            T6 t62 = c1323b.f5141a;
            if (t62 != null && c1323b.f5149i && t62.f4974a == 0 && C1323b.j(c1323b, this.f4600v, bVarF)) {
                boolean z12 = c1323b.f5143c != 0;
                boolean z13 = c1323b.f5145e != null;
                Bundle bundle2 = (z12 || z13) ? new Bundle(t62.f4976c) : t62.f4976c;
                if (z12) {
                    bundle2.putInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", c1323b.f5143c);
                }
                if (z13) {
                    bundle2.putString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT", ((Uri) AbstractC6614a.e(c1323b.f5145e)).toString());
                }
                cVarG.a(new v.d.b(t62.f4975b, c1323b.f5146f, c1323b.f5144d).b(bundle2).a());
            }
        }
        if (c6082n != null) {
            cVarG.f(AbstractC1466t.r(c6082n), c6082n.getMessage());
        }
        return cVarG.b();
    }

    @Override // F3.n.b
    public void A() {
        if (this.f4585g.j0().k(7)) {
            B0(7, new i() { // from class: E3.r4
                @Override // E3.M4.i
                public final void a(C1375h3.g gVar) {
                    this.f5512a.f4585g.j0().U();
                }
            }, this.f4589k.c(), true);
        } else {
            B0(6, new i() { // from class: E3.s4
                @Override // E3.M4.i
                public final void a(C1375h3.g gVar) {
                    this.f5523a.f4585g.j0().J();
                }
            }, this.f4589k.c(), true);
        }
    }

    @Override // F3.n.b
    public void B(final long j10) {
        if (j10 < 0) {
            return;
        }
        B0(10, new i() { // from class: E3.n4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                this.f5440a.f4585g.j0().E0((int) j10);
            }
        }, this.f4589k.c(), true);
    }

    @Override // F3.n.b
    public void C() {
        B0(3, new i() { // from class: E3.y4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                this.f5610a.f4585g.j0().stop();
            }
        }, this.f4589k.c(), true);
    }

    public C1363g G0() {
        return this.f4584f;
    }

    public C1375h3.f H0() {
        return this.f4587i;
    }

    public C1375h3.e I0(C1375h3 c1375h3) {
        return new C1375h3.e.a(c1375h3).c(this.f4600v).b(this.f4601w).d(this.f4598t).e(this.f4599u).a();
    }

    public F3.n K0() {
        return this.f4589k;
    }

    void L0(q.b bVar) {
        B0(1, new i() { // from class: E3.m4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                M4 m42 = this.f5428a;
                t2.a0.C0(m42.f4585g.j0(), m42.f4585g.S0());
            }
        }, bVar, true);
    }

    void Q0(N6 n62) {
        int i10 = n62.k(20) ? 4 : 0;
        if (this.f4596r != i10) {
            this.f4596r = i10;
            this.f4589k.m(i10);
        }
    }

    public void S0() {
        if (Build.VERSION.SDK_INT < 31) {
            if (this.f4591m == null) {
                V0(this.f4589k, null);
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", this.f4585g.n0());
                intent.setComponent(this.f4591m);
                V0(this.f4589k, PendingIntent.getBroadcast(this.f4585g.a0(), 0, intent, f4583z));
            }
        }
        if (this.f4590l != null) {
            this.f4585g.a0().unregisterReceiver(this.f4590l);
        }
        this.f4589k.h();
    }

    public void U0(U6 u62, InterfaceC6084P.b bVar) {
        if (this.f4602x != null) {
            return;
        }
        boolean z10 = this.f4601w.c(17) != bVar.c(17);
        this.f4600v = u62;
        this.f4601w = bVar;
        if (!this.f4599u.isEmpty()) {
            boolean z11 = this.f4597s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
            boolean z12 = this.f4597s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
            d1();
            if (this.f4597s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z11 || this.f4597s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z12) {
                K0().l(this.f4597s);
            }
        }
        if (z10) {
            f1(this.f4585g.j0());
        } else {
            e1(this.f4585g.j0());
        }
    }

    public void X0(AbstractC2011u abstractC2011u) {
        this.f4598t = abstractC2011u;
    }

    public void Y0(AbstractC2011u abstractC2011u) {
        this.f4599u = abstractC2011u;
        boolean z10 = this.f4597s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = this.f4597s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        d1();
        if (this.f4597s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z10 && this.f4597s.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z11) {
            return;
        }
        K0().l(this.f4597s);
    }

    @Override // F3.n.b
    public void b(F3.l lVar) {
        N0(lVar, -1);
    }

    public void b1() {
        this.f4589k.j(true);
    }

    @Override // F3.n.b
    public void c(F3.l lVar, int i10) {
        N0(lVar, i10);
    }

    @Override // F3.n.b
    public void d(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        AbstractC6614a.i(str);
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.f4585g.m0().k());
        } else {
            final T6 t62 = new T6(str, Bundle.EMPTY);
            D0(t62, new i() { // from class: E3.w4
                @Override // E3.M4.i
                public final void a(C1375h3.g gVar) {
                    M4.O(this.f5581a, t62, bundle, resultReceiver, gVar);
                }
            });
        }
    }

    @Override // F3.n.b
    public void e(String str, final Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        final T6 t62 = new T6(str, Bundle.EMPTY);
        D0(t62, new i() { // from class: E3.o4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                M4.L(this.f5470a, t62, bundle, gVar);
            }
        });
    }

    public void e1(final N6 n62) {
        t2.a0.g1(this.f4585g.X(), new Runnable() { // from class: E3.t4
            @Override // java.lang.Runnable
            public final void run() {
                M4 m42 = this.f5534a;
                m42.f4589k.p(m42.z0(n62));
            }
        });
    }

    @Override // F3.n.b
    public void f() {
        B0(12, new i() { // from class: E3.G4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                this.f4451a.f4585g.j0().T0();
            }
        }, this.f4589k.c(), true);
    }

    public void f1(final N6 n62) {
        t2.a0.g1(this.f4585g.X(), new Runnable() { // from class: E3.F4
            @Override // java.lang.Runnable
            public final void run() {
                M4.F(this.f4436a, n62);
            }
        });
    }

    @Override // F3.n.b
    public boolean g(Intent intent) {
        return this.f4585g.B0(new C1375h3.g((q.b) AbstractC6614a.e(this.f4589k.c()), 0, 0, false, null, Bundle.EMPTY, 0), intent);
    }

    @Override // F3.n.b
    public void h() {
        B0(1, new i() { // from class: E3.k4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                t2.a0.A0(this.f5376a.f4585g.j0());
            }
        }, this.f4589k.c(), true);
    }

    @Override // F3.n.b
    public void i() {
        B0(1, new i() { // from class: E3.J4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                this.f4546a.f4585g.p0(gVar, true);
            }
        }, this.f4589k.c(), false);
    }

    @Override // F3.n.b
    public void j(String str, Bundle bundle) {
        M0(y0(str, null, null, bundle), true);
    }

    @Override // F3.n.b
    public void k(String str, Bundle bundle) {
        M0(y0(null, null, str, bundle), true);
    }

    @Override // F3.n.b
    public void l(Uri uri, Bundle bundle) {
        M0(y0(null, uri, null, bundle), true);
    }

    @Override // F3.n.b
    public void m() {
        B0(2, new i() { // from class: E3.x4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                this.f5596a.f4585g.j0().s();
            }
        }, this.f4589k.c(), true);
    }

    @Override // F3.n.b
    public void n(String str, Bundle bundle) {
        M0(y0(str, null, null, bundle), false);
    }

    @Override // F3.n.b
    public void o(String str, Bundle bundle) {
        M0(y0(null, null, str, bundle), false);
    }

    @Override // F3.n.b
    public void p(Uri uri, Bundle bundle) {
        M0(y0(null, uri, null, bundle), false);
    }

    @Override // F3.n.b
    public void q(final F3.l lVar) {
        if (lVar == null) {
            return;
        }
        B0(20, new i() { // from class: E3.H4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                M4.I(this.f4466a, lVar, gVar);
            }
        }, this.f4589k.c(), true);
    }

    @Override // F3.n.b
    public void r() {
        B0(11, new i() { // from class: E3.v4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                this.f5557a.f4585g.j0().U0();
            }
        }, this.f4589k.c(), true);
    }

    @Override // F3.n.b
    public void s(final long j10) {
        B0(5, new i() { // from class: E3.I4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                this.f4523a.f4585g.j0().z(j10);
            }
        }, this.f4589k.c(), true);
    }

    @Override // F3.n.b
    public void u(final float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        B0(13, new i() { // from class: E3.l4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                this.f5388a.f4585g.j0().t(f10);
            }
        }, this.f4589k.c(), true);
    }

    @Override // F3.n.b
    public void v(F3.w wVar) {
        w(wVar, null);
    }

    @Override // F3.n.b
    public void w(F3.w wVar, Bundle bundle) {
        final q2.S sR = AbstractC1466t.R(wVar);
        if (sR != null) {
            C0(40010, new i() { // from class: E3.p4
                @Override // E3.M4.i
                public final void a(C1375h3.g gVar) {
                    M4.U(this.f5486a, sR, gVar);
                }
            });
            return;
        }
        AbstractC6635w.i("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + wVar);
    }

    @Override // F3.n.b
    public void x(final int i10) {
        B0(15, new i() { // from class: E3.u4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                this.f5543a.f4585g.j0().v(AbstractC1466t.T(i10));
            }
        }, this.f4589k.c(), true);
    }

    @Override // F3.n.b
    public void y(final int i10) {
        B0(14, new i() { // from class: E3.K4
            @Override // E3.M4.i
            public final void a(C1375h3.g gVar) {
                this.f4555a.f4585g.j0().r0(AbstractC1466t.Y(i10));
            }
        }, this.f4589k.c(), true);
    }

    @Override // F3.n.b
    public void z() {
        if (this.f4585g.j0().k(9)) {
            B0(9, new i() { // from class: E3.D4
                @Override // E3.M4.i
                public final void a(C1375h3.g gVar) {
                    this.f4405a.f4585g.j0().k0();
                }
            }, this.f4589k.c(), true);
        } else {
            B0(8, new i() { // from class: E3.E4
                @Override // E3.M4.i
                public final void a(C1375h3.g gVar) {
                    this.f4421a.f4585g.j0().W();
                }
            }, this.f4589k.c(), true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1375h3.g f4604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4605b;

        a(C1375h3.g gVar, boolean z10) {
            this.f4604a = gVar;
            this.f4605b = z10;
        }

        public static /* synthetic */ void b(a aVar, C1375h3.i iVar, boolean z10, C1375h3.g gVar) {
            N6 n6J0 = M4.this.f4585g.j0();
            L6.i(n6J0, iVar);
            int iP = n6J0.p();
            if (iP == 1) {
                n6J0.q1();
            } else if (iP == 4) {
                n6J0.r1();
            }
            if (z10) {
                n6J0.p1();
            }
            M4.this.f4585g.F0(gVar, new InterfaceC6084P.b.a().c(31, 2).e(1, z10).f());
        }

        @Override // com.google.common.util.concurrent.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final C1375h3.i iVar) {
            Handler handlerX = M4.this.f4585g.X();
            I3 i32 = M4.this.f4585g;
            final C1375h3.g gVar = this.f4604a;
            final boolean z10 = this.f4605b;
            t2.a0.g1(handlerX, i32.L(gVar, new Runnable() { // from class: E3.L4
                @Override // java.lang.Runnable
                public final void run() {
                    M4.a.b(this.f4569a, iVar, z10, gVar);
                }
            }));
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements com.google.common.util.concurrent.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1375h3.g f4607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4608b;

        b(C1375h3.g gVar, int i10) {
            this.f4607a = gVar;
            this.f4608b = i10;
        }

        public static /* synthetic */ void b(b bVar, int i10, List list, C1375h3.g gVar) {
            if (i10 == -1) {
                M4.this.f4585g.j0().O0(list);
            } else {
                M4.this.f4585g.j0().H0(i10, list);
            }
            M4.this.f4585g.F0(gVar, new InterfaceC6084P.b.a().a(20).f());
        }

        @Override // com.google.common.util.concurrent.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final List list) {
            Handler handlerX = M4.this.f4585g.X();
            I3 i32 = M4.this.f4585g;
            final C1375h3.g gVar = this.f4607a;
            final int i10 = this.f4608b;
            t2.a0.g1(handlerX, i32.L(gVar, new Runnable() { // from class: E3.N4
                @Override // java.lang.Runnable
                public final void run() {
                    M4.b.b(this.f4738a, i10, list, gVar);
                }
            }));
        }

        @Override // com.google.common.util.concurrent.i
        public void a(Throwable th2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class g implements C1375h3.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Uri f4617c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C6077I f4615a = C6077I.f56472K;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f4616b = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f4618d = -9223372036854775807L;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements com.google.common.util.concurrent.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6077I f4620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f4621b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f4622c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f4623d;

            a(C6077I c6077i, String str, Uri uri, long j10) {
                this.f4620a = c6077i;
                this.f4621b = str;
                this.f4622c = uri;
                this.f4623d = j10;
            }

            @Override // com.google.common.util.concurrent.i
            public void a(Throwable th2) {
                if (this != M4.this.f4595q) {
                    return;
                }
                AbstractC6635w.i("MediaSessionLegacyStub", M4.F0(th2));
            }

            @Override // com.google.common.util.concurrent.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Bitmap bitmap) {
                if (this != M4.this.f4595q) {
                    return;
                }
                M4.W0(M4.this.f4589k, AbstractC1466t.E(this.f4620a, this.f4621b, this.f4622c, this.f4623d, bitmap));
                M4.this.f4585g.C0();
            }
        }

        public g() {
        }

        public static /* synthetic */ void H(g gVar, AtomicInteger atomicInteger, List list, List list2) {
            gVar.getClass();
            if (atomicInteger.incrementAndGet() == list.size()) {
                gVar.J(list2, list);
            }
        }

        private void J(List list, List list2) {
            Bitmap bitmap;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) list.get(i10);
                if (pVar != null) {
                    try {
                        bitmap = (Bitmap) com.google.common.util.concurrent.j.b(pVar);
                    } catch (CancellationException | ExecutionException e10) {
                        AbstractC6635w.c("MediaSessionLegacyStub", "Failed to get bitmap", e10);
                        bitmap = null;
                    }
                } else {
                    bitmap = null;
                }
                arrayList.add(AbstractC1466t.P((C6071C) list2.get(i10), i10, bitmap));
            }
            M4.Z0(M4.this.f4589k, arrayList);
        }

        private void L() {
            C6077I c6077i;
            Uri uri;
            g gVar;
            Bitmap bitmap;
            Uri uri2;
            N6 n6J0 = M4.this.f4585g.j0();
            C6071C c6071cF1 = n6J0.f1();
            C6077I c6077iK1 = n6J0.k1();
            long jJ1 = n6J0.n1() ? -9223372036854775807L : n6J0.j1();
            String str = c6071cF1 != null ? c6071cF1.f56327a : "";
            Uri uri3 = (c6071cF1 == null || (uri2 = c6071cF1.f56334h.f56443a) == null) ? null : uri2;
            if (Objects.equals(this.f4615a, c6077iK1) && Objects.equals(this.f4616b, str) && Objects.equals(this.f4617c, uri3) && this.f4618d == jJ1) {
                return;
            }
            this.f4616b = str;
            this.f4617c = uri3;
            this.f4615a = c6077iK1;
            this.f4618d = jJ1;
            com.google.common.util.concurrent.p pVarA = M4.this.f4585g.Y().a(c6077iK1);
            if (pVarA != null) {
                M4.this.f4595q = null;
                if (pVarA.isDone()) {
                    try {
                        Uri uri4 = uri3;
                        c6077i = c6077iK1;
                        uri = uri4;
                        gVar = this;
                        bitmap = (Bitmap) com.google.common.util.concurrent.j.b(pVarA);
                    } catch (CancellationException | ExecutionException e10) {
                        AbstractC6635w.i("MediaSessionLegacyStub", M4.F0(e10));
                        Uri uri5 = uri3;
                        c6077i = c6077iK1;
                        uri = uri5;
                        gVar = this;
                        bitmap = null;
                    }
                } else {
                    M4 m42 = M4.this;
                    Uri uri6 = uri3;
                    c6077i = c6077iK1;
                    a aVar = new a(c6077i, str, uri6, jJ1);
                    gVar = this;
                    str = str;
                    uri = uri6;
                    jJ1 = jJ1;
                    m42.f4595q = aVar;
                    com.google.common.util.concurrent.i iVar = M4.this.f4595q;
                    Handler handlerX = M4.this.f4585g.X();
                    Objects.requireNonNull(handlerX);
                    com.google.common.util.concurrent.j.a(pVarA, iVar, new C2.V(handlerX));
                    bitmap = null;
                }
            } else {
                Uri uri52 = uri3;
                c6077i = c6077iK1;
                uri = uri52;
                gVar = this;
                bitmap = null;
            }
            M4.W0(M4.this.f4589k, AbstractC1466t.E(c6077i, str, uri, jJ1, bitmap));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void M(q2.Y y10) {
            if (!M4.this.P0() || y10.u()) {
                M4.Z0(M4.this.f4589k, null);
                return;
            }
            final List listZ = AbstractC1466t.z(y10);
            final ArrayList arrayList = new ArrayList();
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            Runnable runnable = new Runnable() { // from class: E3.R4
                @Override // java.lang.Runnable
                public final void run() {
                    M4.g.H(this.f4896a, atomicInteger, listZ, arrayList);
                }
            };
            for (int i10 = 0; i10 < listZ.size(); i10++) {
                C6077I c6077i = ((C6071C) listZ.get(i10)).f56331e;
                if (c6077i.f56528k == null) {
                    arrayList.add(null);
                    runnable.run();
                } else {
                    com.google.common.util.concurrent.p pVarC = M4.this.f4585g.Y().c(c6077i.f56528k);
                    arrayList.add(pVarC);
                    Handler handlerX = M4.this.f4585g.X();
                    Objects.requireNonNull(handlerX);
                    pVarC.k(runnable, new C2.V(handlerX));
                }
            }
        }

        @Override // E3.C1375h3.f
        public void A(int i10, int i11) {
            if (K()) {
                return;
            }
            M4 m42 = M4.this;
            m42.e1(m42.f4585g.j0());
        }

        @Override // E3.C1375h3.f
        public void D(int i10, N6 n62, N6 n63) {
            q2.Y yG1 = n63.g1();
            if (n62 == null || !Objects.equals(n62.g1(), yG1)) {
                r(i10, yG1, 0);
            }
            C6077I c6077iL1 = n63.l1();
            if (n62 == null || !Objects.equals(n62.l1(), c6077iL1)) {
                w(i10, c6077iL1);
            }
            C6077I c6077iK1 = n63.k1();
            if (n62 == null || !Objects.equals(n62.k1(), c6077iK1)) {
                c(i10, c6077iK1);
            }
            if (n62 == null || n62.Q0() != n63.Q0()) {
                p(i10, n63.Q0());
            }
            if (n62 == null || n62.x() != n63.x()) {
                h(i10, n63.x());
            }
            u(i10, n63.getDeviceInfo());
            M4.this.Q0(n63);
            C6071C c6071cF1 = n63.f1();
            if (n62 == null || !Objects.equals(n62.f1(), c6071cF1)) {
                k(i10, c6071cF1, 3);
            } else {
                if (K()) {
                    return;
                }
                M4.this.e1(n63);
            }
        }

        @Override // E3.C1375h3.f
        public void E(int i10, C6088c c6088c) {
            if (M4.this.f4585g.j0().getDeviceInfo().f56933a == 0) {
                M4.this.f4589k.q(AbstractC1466t.g0(c6088c));
            }
        }

        @Override // E3.C1375h3.f
        public void F(int i10, T6 t62, Bundle bundle) {
            M4.this.f4589k.i(t62.f4975b, bundle);
        }

        public boolean K() {
            return M4.this.f4602x != null;
        }

        @Override // E3.C1375h3.f
        public void a(int i10, W6 w62, boolean z10, boolean z11, int i11) {
            if (K()) {
                return;
            }
            M4 m42 = M4.this;
            m42.e1(m42.f4585g.j0());
        }

        @Override // E3.C1375h3.f
        public void c(int i10, C6077I c6077i) {
            if (K()) {
                return;
            }
            L();
        }

        @Override // E3.C1375h3.f
        public void f(int i10, InterfaceC6084P.e eVar, InterfaceC6084P.e eVar2, int i11) {
            if (K()) {
                return;
            }
            M4 m42 = M4.this;
            m42.e1(m42.f4585g.j0());
        }

        @Override // E3.C1375h3.f
        public void g(int i10, int i11, C6082N c6082n) {
            if (K()) {
                return;
            }
            M4 m42 = M4.this;
            m42.e1(m42.f4585g.j0());
        }

        @Override // E3.C1375h3.f
        public void h(int i10, int i11) {
            M4.this.f4589k.v(AbstractC1466t.L(i11));
        }

        @Override // E3.C1375h3.f
        public void i(int i10, C6082N c6082n) {
            if (K()) {
                return;
            }
            M4 m42 = M4.this;
            m42.e1(m42.f4585g.j0());
        }

        @Override // E3.C1375h3.f
        public void j(int i10, C6083O c6083o) {
            if (K()) {
                return;
            }
            M4 m42 = M4.this;
            m42.e1(m42.f4585g.j0());
        }

        @Override // E3.C1375h3.f
        public void k(int i10, C6071C c6071c, int i11) {
            if (K()) {
                return;
            }
            L();
            if (c6071c == null) {
                M4.this.f4589k.u(0);
            } else {
                M4.this.f4589k.u(AbstractC1466t.h0(c6071c.f56331e.f56526i));
            }
            M4 m42 = M4.this;
            m42.e1(m42.f4585g.j0());
        }

        @Override // E3.C1375h3.f
        public void m(int i10, boolean z10, int i11) {
            if (K()) {
                return;
            }
            M4 m42 = M4.this;
            m42.e1(m42.f4585g.j0());
        }

        @Override // E3.C1375h3.f
        public void n(int i10, int i11, boolean z10) {
            if (M4.this.f4592n != null) {
                F3.x xVar = M4.this.f4592n;
                if (z10) {
                    i11 = 0;
                }
                xVar.d(i11);
            }
        }

        @Override // E3.C1375h3.f
        public void o(int i10, Bundle bundle) {
            AbstractC6614a.a(!bundle.containsKey("EXO_SPEED"));
            AbstractC6614a.a(!bundle.containsKey("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID"));
            M4.this.f4597s = new Bundle(bundle);
            if (!M4.this.f4599u.isEmpty()) {
                M4.this.d1();
            }
            M4.this.f4589k.l(M4.this.f4597s);
            M4 m42 = M4.this;
            m42.e1(m42.f4585g.j0());
        }

        @Override // E3.C1375h3.f
        public void p(int i10, boolean z10) {
            M4.this.f4589k.x(AbstractC1466t.M(z10));
        }

        @Override // E3.C1375h3.f
        public void q(int i10, boolean z10) {
            if (K()) {
                return;
            }
            M4 m42 = M4.this;
            m42.e1(m42.f4585g.j0());
        }

        @Override // E3.C1375h3.f
        public void r(int i10, q2.Y y10, int i11) {
            if (K()) {
                return;
            }
            M(y10);
            L();
        }

        @Override // E3.C1375h3.f
        public void s(int i10, InterfaceC6084P.b bVar) {
            if (K()) {
                return;
            }
            N6 n6J0 = M4.this.f4585g.j0();
            M4.this.Q0(n6J0);
            M4.this.e1(n6J0);
        }

        @Override // E3.C1375h3.f
        public void u(int i10, C6101p c6101p) {
            N6 n6J0 = M4.this.f4585g.j0();
            M4.this.f4592n = M4.A0(n6J0);
            if (M4.this.f4592n != null) {
                M4.this.f4589k.r(M4.this.f4592n);
            } else {
                M4.this.f4589k.q(AbstractC1466t.g0(n6J0.d1()));
            }
        }

        @Override // E3.C1375h3.f
        public void w(int i10, C6077I c6077i) {
            if (K()) {
                return;
            }
            CharSequence charSequenceL = M4.this.f4589k.b().l();
            CharSequence charSequence = c6077i.f56518a;
            if (TextUtils.equals(charSequenceL, charSequence)) {
                return;
            }
            M4 m42 = M4.this;
            m42.a1(m42.f4589k, charSequence);
        }

        @Override // E3.C1375h3.f
        public void b(int i10) {
        }
    }

    private static void O0(Future future) {
    }

    @Override // F3.n.b
    public void t(boolean z10) {
    }
}
