package Lc;

import Pc.h;
import Td.L;
import android.os.Bundle;
import bc.C3042a;
import bc.EnumC3046e;
import dc.r;
import gc.e;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.U;
import pc.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0004R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LLc/a;", "Lgc/c;", "LOc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "LPc/a;", "notification", "LTd/L;", "f", "(LPc/a;)V", "LPc/h;", "response", "", "g", "(LPc/h;)Z", "Landroid/os/Bundle;", "extras", "c", "(Landroid/os/Bundle;)V", "d", "Landroid/os/Bundle;", "lastNotificationResponseBundle", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a extends gc.c implements Oc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bundle lastNotificationResponseBundle;

    /* JADX INFO: renamed from: Lc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0180a implements Function1 {
        public C0180a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return a.this.lastNotificationResponseBundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Function1 {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            a.this.lastNotificationResponseBundle = null;
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {
        public c() {
        }

        public final void a() {
            Dc.b.f3684a.a(a.this);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {
        public d() {
        }

        public final void a() {
            Dc.b.f3684a.f(a.this);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    @Override // Oc.c
    public void c(Bundle extras) {
        AbstractC5504s.h(extras, "extras");
        Bundle bundleF = Dc.c.f(extras);
        AbstractC5504s.g(bundleF, "toResponseBundleFromExtras(...)");
        Kc.a.a("NotificationsEmitter.onNotificationResponseIntentReceived", bundleF);
        this.lastNotificationResponseBundle = bundleF;
        s("onDidReceiveNotificationResponse", bundleF);
    }

    @Override // Oc.c
    public void d() {
        s("onNotificationsDeleted", Bundle.EMPTY);
    }

    @Override // Oc.c
    public void f(Pc.a notification) {
        AbstractC5504s.h(notification, "notification");
        Bundle bundleB = Dc.c.b(notification);
        AbstractC5504s.e(bundleB);
        Kc.a.a("NotificationsEmitter.onNotificationReceived", bundleB);
        s("onDidReceiveNotification", bundleB);
    }

    @Override // Oc.c
    public boolean g(h response) {
        AbstractC5504s.h(response, "response");
        Bundle bundleD = Dc.c.d(response);
        AbstractC5504s.e(bundleD);
        Kc.a.a("NotificationsEmitter.onNotificationResponseReceived", bundleD);
        this.lastNotificationResponseBundle = bundleD;
        s("onDidReceiveNotificationResponse", bundleD);
        return true;
    }

    @Override // gc.c
    public e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoNotificationsEmitter");
            dVar.d("onDidReceiveNotification", "onNotificationsDeleted", "onDidReceiveNotificationResponse");
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33268a;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new c()));
            Map mapW2 = dVar.w();
            EnumC3046e enumC3046e2 = EnumC3046e.f33269b;
            mapW2.put(enumC3046e2, new C3042a(enumC3046e2, new d()));
            C5972b[] c5972bArr = new C5972b[0];
            V v10 = V.f55908a;
            U u10 = (U) v10.a().get(O.b(Bundle.class));
            if (u10 == null) {
                u10 = new U(O.b(Bundle.class));
                v10.a().put(O.b(Bundle.class), u10);
            }
            dVar.p().put("getLastNotificationResponse", new r("getLastNotificationResponse", c5972bArr, u10, new C0180a()));
            C5972b[] c5972bArr2 = new C5972b[0];
            U u11 = (U) v10.a().get(O.b(Object.class));
            if (u11 == null) {
                u11 = new U(O.b(Object.class));
                v10.a().put(O.b(Object.class), u11);
            }
            dVar.p().put("clearLastNotificationResponse", new r("clearLastNotificationResponse", c5972bArr2, u11, new b()));
            e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
