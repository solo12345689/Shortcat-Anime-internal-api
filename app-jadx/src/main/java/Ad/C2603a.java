package ad;

import Td.L;
import Td.u;
import Td.v;
import Td.z;
import Ub.u;
import Ud.S;
import bc.C3042a;
import bc.EnumC3046e;
import bd.InterfaceC3047a;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.firebase.messaging.FirebaseMessaging;
import dc.l;
import dc.n;
import dc.s;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import n9.InterfaceC5760d;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6027q;

/* JADX INFO: renamed from: ad.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lad/a;", "Lgc/c;", "Lbd/a;", "<init>", "()V", "LUb/u;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/google/firebase/messaging/FirebaseMessaging;", "y", "(LUb/u;)Lcom/google/firebase/messaging/FirebaseMessaging;", "", "token", "LTd/L;", "a", "(Ljava/lang/String;)V", "Lgc/e;", "n", "()Lgc/e;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C2603a extends gc.c implements InterfaceC3047a {

    /* JADX INFO: renamed from: ad.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0416a implements InterfaceC5760d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f23918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gc.d f23919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2603a f23920c;

        C0416a(u uVar, gc.d dVar, C2603a c2603a) {
            this.f23918a = uVar;
            this.f23919b = dVar;
            this.f23920c = c2603a;
        }

        @Override // n9.InterfaceC5760d
        public final void a(n9.i task) {
            String message;
            AbstractC5504s.h(task, "task");
            if (task.o()) {
                String str = (String) task.k();
                if (str == null) {
                    this.f23918a.reject("E_REGISTRATION_FAILED", "Fetching the token failed. Invalid token.", null);
                    return;
                } else {
                    this.f23918a.resolve(str);
                    this.f23920c.a(str);
                    return;
                }
            }
            Exception excJ = task.j();
            u uVar = this.f23918a;
            if (excJ == null || (message = excJ.getMessage()) == null) {
                message = "unknown";
            }
            uVar.reject("E_REGISTRATION_FAILED", "Fetching the token failed: " + message, excJ);
        }
    }

    /* JADX INFO: renamed from: ad.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements InterfaceC5760d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f23921a;

        b(u uVar) {
            this.f23921a = uVar;
        }

        @Override // n9.InterfaceC5760d
        public final void a(n9.i task) {
            String message;
            AbstractC5504s.h(task, "task");
            if (task.o()) {
                this.f23921a.resolve((Object) null);
                return;
            }
            Exception excJ = task.j();
            u uVar = this.f23921a;
            if (excJ == null || (message = excJ.getMessage()) == null) {
                message = "unknown";
            }
            uVar.reject("E_UNREGISTER_FOR_NOTIFICATIONS_FAILED", "Unregistering for notifications failed: " + message, excJ);
        }
    }

    /* JADX INFO: renamed from: ad.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gc.d f23923b;

        public c(gc.d dVar) {
            this.f23923b = dVar;
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            FirebaseMessaging firebaseMessagingY = C2603a.this.y(promise);
            if (firebaseMessagingY == null) {
                return;
            }
            firebaseMessagingY.w().c(new C0416a(promise, this.f23923b, C2603a.this));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ad.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f23924a = new d();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(u.class);
        }
    }

    /* JADX INFO: renamed from: ad.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gc.d f23926b;

        public e(gc.d dVar) {
            this.f23926b = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            u uVar = (u) objArr[0];
            FirebaseMessaging firebaseMessagingY = C2603a.this.y(uVar);
            if (firebaseMessagingY != null) {
                firebaseMessagingY.w().c(new C0416a(uVar, this.f23926b, C2603a.this));
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ad.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements Function2 {
        public f() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            FirebaseMessaging firebaseMessagingY = C2603a.this.y(promise);
            if (firebaseMessagingY == null) {
                return;
            }
            firebaseMessagingY.p().c(new b(promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ad.a$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f23928a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(u.class);
        }
    }

    /* JADX INFO: renamed from: ad.a$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Function1 {
        public h() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            u uVar = (u) objArr[0];
            FirebaseMessaging firebaseMessagingY = C2603a.this.y(uVar);
            if (firebaseMessagingY != null) {
                firebaseMessagingY.p().c(new b(uVar));
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ad.a$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5082a {
        public i() {
        }

        public final void a() {
            Yc.g.f22917b.a(C2603a.this);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ad.a$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements InterfaceC5082a {
        public j() {
        }

        public final void a() {
            Yc.g.f22917b.f(C2603a.this);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FirebaseMessaging y(u promise) {
        try {
            return FirebaseMessaging.t();
        } catch (IllegalStateException e10) {
            promise.reject("E_REGISTRATION_FAILED", "Make sure to complete the guide at https://docs.expo.dev/push-notifications/fcm-credentials/ : " + e10.getMessage(), e10);
            return null;
        }
    }

    @Override // bd.InterfaceC3047a
    public void a(String token) {
        AbstractC5504s.h(token, "token");
        try {
            u.a aVar = Td.u.f17466b;
            t("onDevicePushToken", S.f(z.a("devicePushToken", token)));
            Td.u.b(L.f17438a);
        } catch (Throwable th2) {
            u.a aVar2 = Td.u.f17466b;
            Td.u.b(v.a(th2));
        }
    }

    @Override // gc.c
    public gc.e n() {
        dc.g lVar;
        dc.g lVar2;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoPushTokenManager");
            dVar.d("onDevicePushToken");
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33268a;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new i()));
            Map mapW2 = dVar.w();
            EnumC3046e enumC3046e2 = EnumC3046e.f33269b;
            mapW2.put(enumC3046e2, new C3042a(enumC3046e2, new j()));
            boolean zC = AbstractC5504s.c(Ub.u.class, Ub.u.class);
            Class cls = Float.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            if (zC) {
                lVar = new dc.f("getDevicePushTokenAsync", new C5972b[0], new c(dVar));
            } else {
                X xM = dVar.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(Ub.u.class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(Ub.u.class), false, d.f23924a), xM);
                }
                C5972b[] c5972bArr = {c5972b};
                e eVar = new e(dVar);
                lVar = AbstractC5504s.c(L.class, cls4) ? new l("getDevicePushTokenAsync", c5972bArr, eVar) : AbstractC5504s.c(L.class, cls3) ? new dc.h("getDevicePushTokenAsync", c5972bArr, eVar) : AbstractC5504s.c(L.class, cls2) ? new dc.i("getDevicePushTokenAsync", c5972bArr, eVar) : AbstractC5504s.c(L.class, cls) ? new dc.j("getDevicePushTokenAsync", c5972bArr, eVar) : AbstractC5504s.c(L.class, String.class) ? new n("getDevicePushTokenAsync", c5972bArr, eVar) : new s("getDevicePushTokenAsync", c5972bArr, eVar);
            }
            dVar.k().put("getDevicePushTokenAsync", lVar);
            if (AbstractC5504s.c(Ub.u.class, Ub.u.class)) {
                lVar2 = new dc.f("unregisterForNotificationsAsync", new C5972b[0], new f());
            } else {
                X xM2 = dVar.m();
                C5972b c5972b2 = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(Ub.u.class), Boolean.FALSE));
                if (c5972b2 == null) {
                    c5972b2 = new C5972b(new M(O.b(Ub.u.class), false, g.f23928a), xM2);
                }
                C5972b[] c5972bArr2 = {c5972b2};
                h hVar = new h();
                lVar2 = AbstractC5504s.c(L.class, cls4) ? new l("unregisterForNotificationsAsync", c5972bArr2, hVar) : AbstractC5504s.c(L.class, cls3) ? new dc.h("unregisterForNotificationsAsync", c5972bArr2, hVar) : AbstractC5504s.c(L.class, cls2) ? new dc.i("unregisterForNotificationsAsync", c5972bArr2, hVar) : AbstractC5504s.c(L.class, cls) ? new dc.j("unregisterForNotificationsAsync", c5972bArr2, hVar) : AbstractC5504s.c(L.class, String.class) ? new n("unregisterForNotificationsAsync", c5972bArr2, hVar) : new s("unregisterForNotificationsAsync", c5972bArr2, hVar);
            }
            dVar.k().put("unregisterForNotificationsAsync", lVar2);
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
