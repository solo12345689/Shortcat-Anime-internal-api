package Vc;

import Td.L;
import Td.z;
import Ub.u;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.q;
import cc.i;
import com.facebook.react.bridge.BaseJavaModule;
import dc.f;
import dc.g;
import dc.h;
import dc.j;
import dc.l;
import dc.n;
import dc.s;
import ie.InterfaceC5082a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6027q;
import qb.InterfaceC6168b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LVc/c;", "Lgc/c;", "<init>", "()V", "LUb/u;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTd/L;", "F", "(LUb/u;)V", "H", "I", "Lgc/e;", "n", "()Lgc/e;", "LRb/a;", "E", "()LRb/a;", "permissions", "Landroid/content/Context;", "D", "()Landroid/content/Context;", "context", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Function2 {
        public a() {
        }

        public final void a(Object[] objArr, u promise) throws Bc.a {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            if (c.this.D().getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                c.this.H(promise);
            } else {
                c.this.F(promise);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Bc.a {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f19977a = new b();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(u.class);
        }
    }

    /* JADX INFO: renamed from: Vc.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0346c implements Function1 {
        public C0346c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws Bc.a {
            AbstractC5504s.h(objArr, "<destruct>");
            u uVar = (u) objArr[0];
            if (c.this.D().getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                c.this.H(uVar);
            } else {
                c.this.F(uVar);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f19979a = new d();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(InterfaceC6168b.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function2 {
        public e() {
        }

        public final void a(Object[] objArr, u promise) throws Bc.a {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            if (c.this.D().getApplicationContext().getApplicationInfo().targetSdkVersion < 33 || Build.VERSION.SDK_INT < 33) {
                c.this.H(promise);
            } else {
                c.this.I(promise);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Bc.a {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context D() throws i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new i();
    }

    private final Rb.a E() throws Bc.a {
        Rb.a aVarZ = i().z();
        if (aVarZ != null) {
            return aVarZ;
        }
        throw new Bc.a(O.b(Rb.a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(final u promise) throws Bc.a {
        Rb.a aVarE = E();
        Rb.c cVar = new Rb.c() { // from class: Vc.a
            @Override // Rb.c
            public final void a(Map map) {
                c.G(this.f19972a, promise, map);
            }
        };
        String[] strArr = Vc.d.f19981a;
        aVarE.a(cVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(c cVar, u uVar, Map permissionsMap) {
        boolean z10;
        boolean z11;
        AbstractC5504s.h(permissionsMap, "permissionsMap");
        q qVarI = q.i(cVar.D());
        AbstractC5504s.g(qVarI, "from(...)");
        boolean zA = qVarI.a();
        Bundle bundleA = G1.c.a(z.a("importance", Integer.valueOf(qVarI.k())));
        Object systemService = cVar.D().getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            bundleA.putInt("interruptionFilter", notificationManager.getCurrentInterruptionFilter());
        }
        boolean z12 = false;
        if (permissionsMap.isEmpty()) {
            z10 = true;
        } else {
            Iterator it = permissionsMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Rb.b) ((Map.Entry) it.next()).getValue()).b() != Rb.d.GRANTED) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        if (permissionsMap.isEmpty()) {
            z11 = true;
        } else {
            Iterator it2 = permissionsMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((Rb.b) ((Map.Entry) it2.next()).getValue()).b() != Rb.d.DENIED) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
        }
        if (permissionsMap.isEmpty()) {
            z12 = true;
        } else {
            Iterator it3 = permissionsMap.entrySet().iterator();
            while (it3.hasNext()) {
                if (!((Rb.b) ((Map.Entry) it3.next()).getValue()).a()) {
                    break;
                }
            }
            z12 = true;
        }
        String strB = (!z11 && zA) ? z10 ? Rb.d.GRANTED.b() : Rb.d.UNDETERMINED.b() : Rb.d.DENIED.b();
        uVar.resolve(G1.c.a(z.a("expires", "never"), z.a("status", strB), z.a("canAskAgain", Boolean.valueOf(z12)), z.a("granted", Boolean.valueOf(z10)), z.a("android", bundleA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(u promise) {
        q qVarI = q.i(D());
        AbstractC5504s.g(qVarI, "from(...)");
        boolean zA = qVarI.a();
        Rb.d dVar = zA ? Rb.d.GRANTED : Rb.d.DENIED;
        Bundle bundleA = G1.c.a(z.a("importance", Integer.valueOf(qVarI.k())));
        Object systemService = D().getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            bundleA.putInt("interruptionFilter", notificationManager.getCurrentInterruptionFilter());
        }
        promise.resolve(G1.c.a(z.a("expires", "never"), z.a("status", dVar.b()), z.a("canAskAgain", Boolean.valueOf(zA)), z.a("granted", Boolean.valueOf(dVar == Rb.d.GRANTED)), z.a("android", bundleA)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(final u promise) throws Bc.a {
        Rb.a aVarE = E();
        Rb.c cVar = new Rb.c() { // from class: Vc.b
            @Override // Rb.c
            public final void a(Map map) throws Bc.a {
                c.J(this.f19974a, promise, map);
            }
        };
        String[] strArr = Vc.d.f19981a;
        aVarE.b(cVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(c cVar, u uVar, Map map) throws Bc.a {
        cVar.F(uVar);
    }

    @Override // gc.c
    public gc.e n() {
        g lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoNotificationPermissionsModule");
            if (AbstractC5504s.c(u.class, u.class)) {
                lVar = new f("getPermissionsAsync", new C5972b[0], new a());
            } else {
                X xM = dVar.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(u.class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(u.class), false, b.f19977a), xM);
                }
                C5972b[] c5972bArr = {c5972b};
                C0346c c0346c = new C0346c();
                lVar = AbstractC5504s.c(L.class, Integer.TYPE) ? new l("getPermissionsAsync", c5972bArr, c0346c) : AbstractC5504s.c(L.class, Boolean.TYPE) ? new h("getPermissionsAsync", c5972bArr, c0346c) : AbstractC5504s.c(L.class, Double.TYPE) ? new dc.i("getPermissionsAsync", c5972bArr, c0346c) : AbstractC5504s.c(L.class, Float.TYPE) ? new j("getPermissionsAsync", c5972bArr, c0346c) : AbstractC5504s.c(L.class, String.class) ? new n("getPermissionsAsync", c5972bArr, c0346c) : new s("getPermissionsAsync", c5972bArr, c0346c);
            }
            dVar.k().put("getPermissionsAsync", lVar);
            X xM2 = dVar.m();
            C5972b c5972b2 = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(InterfaceC6168b.class), Boolean.TRUE));
            if (c5972b2 == null) {
                c5972b2 = new C5972b(new M(O.b(InterfaceC6168b.class), true, d.f19979a), xM2);
            }
            dVar.k().put("requestPermissionsAsync", new f("requestPermissionsAsync", new C5972b[]{c5972b2}, new e()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
