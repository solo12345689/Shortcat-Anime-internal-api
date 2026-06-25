package lb;

import Td.L;
import Ub.u;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.provider.Settings;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import dc.l;
import dc.n;
import dc.s;
import hc.C4931c;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: lb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\n \f*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Llb/a;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "A", "()Landroid/content/Context;", "context", "", "kotlin.jvm.PlatformType", "C", "()Ljava/lang/String;", "packageName", "Landroid/content/pm/PackageManager;", "B", "()Landroid/content/pm/PackageManager;", "packageManager", "expo-application_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C5584a extends gc.c {

    /* JADX INFO: renamed from: lb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0822a implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f52726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InstallReferrerClient f52727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ StringBuilder f52728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f52729d;

        C0822a(J j10, InstallReferrerClient installReferrerClient, StringBuilder sb2, u uVar) {
            this.f52726a = j10;
            this.f52727b = installReferrerClient;
            this.f52728c = sb2;
            this.f52729d = uVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            J j10 = this.f52726a;
            if (j10.f52255a) {
                return;
            }
            j10.f52255a = true;
            this.f52729d.reject("ERR_APPLICATION_INSTALL_REFERRER_SERVICE_DISCONNECTED", "Connection to install referrer service was lost.", null);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            J j10 = this.f52726a;
            if (j10.f52255a) {
                return;
            }
            try {
                if (i10 == 0) {
                    try {
                        this.f52728c.append(this.f52727b.getInstallReferrer().getInstallReferrer());
                        this.f52726a.f52255a = true;
                        u uVar = this.f52729d;
                        String string = this.f52728c.toString();
                        AbstractC5504s.g(string, "toString(...)");
                        uVar.resolve(string);
                    } catch (RemoteException e10) {
                        this.f52729d.reject("ERR_APPLICATION_INSTALL_REFERRER_REMOTE_EXCEPTION", "RemoteException getting install referrer information. This may happen if the process hosting the remote object is no longer available.", e10);
                        this.f52726a.f52255a = true;
                        return;
                    }
                } else if (i10 == 1) {
                    j10.f52255a = true;
                    this.f52729d.reject("ERR_APPLICATION_INSTALL_REFERRER", "General error retrieving the install referrer: response code " + i10, null);
                } else if (i10 != 2) {
                    j10.f52255a = true;
                    this.f52729d.reject("ERR_APPLICATION_INSTALL_REFERRER", "General error retrieving the install referrer: response code " + i10, null);
                } else {
                    j10.f52255a = true;
                    this.f52729d.reject("ERR_APPLICATION_INSTALL_REFERRER_UNAVAILABLE", "The current Play Store app doesn't provide the installation referrer API, or the Play Store may not be installed.", null);
                }
                this.f52727b.endConnection();
            } catch (Throwable th2) {
                this.f52726a.f52255a = true;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: lb.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Function1 {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            PackageManager packageManager = C5584a.this.A().getPackageManager();
            String packageName = C5584a.this.A().getPackageName();
            AbstractC5504s.e(packageManager);
            AbstractC5504s.e(packageName);
            return Double.valueOf(lb.e.d(packageManager, packageName, 0).firstInstallTime);
        }
    }

    /* JADX INFO: renamed from: lb.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function1 {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            PackageManager packageManager = C5584a.this.A().getPackageManager();
            String packageName = C5584a.this.A().getPackageName();
            AbstractC5504s.e(packageManager);
            AbstractC5504s.e(packageName);
            return Double.valueOf(lb.e.d(packageManager, packageName, 0).lastUpdateTime);
        }
    }

    /* JADX INFO: renamed from: lb.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function2 {
        public d() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            StringBuilder sb2 = new StringBuilder();
            J j10 = new J();
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(C5584a.this.A()).build();
            installReferrerClientBuild.startConnection(new C0822a(j10, installReferrerClientBuild, sb2, promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: lb.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f52733a = new e();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(u.class);
        }
    }

    /* JADX INFO: renamed from: lb.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements Function1 {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            u uVar = (u) objArr[0];
            StringBuilder sb2 = new StringBuilder();
            J j10 = new J();
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(C5584a.this.A()).build();
            installReferrerClientBuild.startConnection(new C0822a(j10, installReferrerClientBuild, sb2, uVar));
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: lb.a$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {
        public g() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return C5584a.this.A().getApplicationInfo().loadLabel(C5584a.this.A().getPackageManager()).toString();
        }
    }

    /* JADX INFO: renamed from: lb.a$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements InterfaceC5082a {
        public h() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return C5584a.this.C();
        }
    }

    /* JADX INFO: renamed from: lb.a$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5082a {
        public i() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            PackageManager packageManagerB = C5584a.this.B();
            AbstractC5504s.g(packageManagerB, "access$getPackageManager(...)");
            String strC = C5584a.this.C();
            AbstractC5504s.g(strC, "access$getPackageName(...)");
            return lb.e.d(packageManagerB, strC, 0).versionName;
        }
    }

    /* JADX INFO: renamed from: lb.a$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements InterfaceC5082a {
        public j() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            PackageManager packageManagerB = C5584a.this.B();
            AbstractC5504s.g(packageManagerB, "access$getPackageManager(...)");
            String strC = C5584a.this.C();
            AbstractC5504s.g(strC, "access$getPackageName(...)");
            return String.valueOf((int) lb.e.c(lb.e.d(packageManagerB, strC, 0)));
        }
    }

    /* JADX INFO: renamed from: lb.a$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements InterfaceC5082a {
        public k() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Settings.Secure.getString(C5584a.this.A().getContentResolver(), "android_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context A() throws cc.i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new cc.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PackageManager B() {
        return A().getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String C() {
        return A().getPackageName();
    }

    @Override // gc.c
    public gc.e n() {
        dc.g lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoApplication");
            C4931c c4931c = new C4931c("applicationName");
            c4931c.b(new g());
            dVar.l().put("applicationName", c4931c);
            C4931c c4931c2 = new C4931c("applicationId");
            c4931c2.b(new h());
            dVar.l().put("applicationId", c4931c2);
            C4931c c4931c3 = new C4931c("nativeApplicationVersion");
            c4931c3.b(new i());
            dVar.l().put("nativeApplicationVersion", c4931c3);
            C4931c c4931c4 = new C4931c("nativeBuildVersion");
            c4931c4.b(new j());
            dVar.l().put("nativeBuildVersion", c4931c4);
            C4931c c4931c5 = new C4931c("androidId");
            c4931c5.b(new k());
            dVar.l().put("androidId", c4931c5);
            C5972b[] c5972bArr = new C5972b[0];
            b bVar = new b();
            Class cls = Integer.TYPE;
            boolean zC = AbstractC5504s.c(Double.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            dVar.k().put("getInstallationTimeAsync", zC ? new l("getInstallationTimeAsync", c5972bArr, bVar) : AbstractC5504s.c(Double.class, cls4) ? new dc.h("getInstallationTimeAsync", c5972bArr, bVar) : AbstractC5504s.c(Double.class, cls3) ? new dc.i("getInstallationTimeAsync", c5972bArr, bVar) : AbstractC5504s.c(Double.class, cls2) ? new dc.j("getInstallationTimeAsync", c5972bArr, bVar) : AbstractC5504s.c(Double.class, String.class) ? new n("getInstallationTimeAsync", c5972bArr, bVar) : new s("getInstallationTimeAsync", c5972bArr, bVar));
            C5972b[] c5972bArr2 = new C5972b[0];
            c cVar = new c();
            dVar.k().put("getLastUpdateTimeAsync", AbstractC5504s.c(Double.class, cls) ? new l("getLastUpdateTimeAsync", c5972bArr2, cVar) : AbstractC5504s.c(Double.class, cls4) ? new dc.h("getLastUpdateTimeAsync", c5972bArr2, cVar) : AbstractC5504s.c(Double.class, cls3) ? new dc.i("getLastUpdateTimeAsync", c5972bArr2, cVar) : AbstractC5504s.c(Double.class, cls2) ? new dc.j("getLastUpdateTimeAsync", c5972bArr2, cVar) : AbstractC5504s.c(Double.class, String.class) ? new n("getLastUpdateTimeAsync", c5972bArr2, cVar) : new s("getLastUpdateTimeAsync", c5972bArr2, cVar));
            if (AbstractC5504s.c(u.class, u.class)) {
                lVar = new dc.f("getInstallReferrerAsync", new C5972b[0], new d());
            } else {
                X xM = dVar.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(u.class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(u.class), false, e.f52733a), xM);
                }
                C5972b[] c5972bArr3 = {c5972b};
                f fVar = new f();
                lVar = AbstractC5504s.c(L.class, cls) ? new l("getInstallReferrerAsync", c5972bArr3, fVar) : AbstractC5504s.c(L.class, cls4) ? new dc.h("getInstallReferrerAsync", c5972bArr3, fVar) : AbstractC5504s.c(L.class, cls3) ? new dc.i("getInstallReferrerAsync", c5972bArr3, fVar) : AbstractC5504s.c(L.class, cls2) ? new dc.j("getInstallReferrerAsync", c5972bArr3, fVar) : AbstractC5504s.c(L.class, String.class) ? new n("getInstallReferrerAsync", c5972bArr3, fVar) : new s("getInstallReferrerAsync", c5972bArr3, fVar);
            }
            dVar.k().put("getInstallReferrerAsync", lVar);
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
