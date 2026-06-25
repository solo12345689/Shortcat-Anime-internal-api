package Rc;

import Td.L;
import Ub.u;
import Ud.AbstractC2279u;
import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.facebook.react.bridge.BaseJavaModule;
import dc.j;
import dc.l;
import dc.n;
import dc.s;
import expo.modules.notifications.service.NotificationsService;
import ie.InterfaceC5082a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\bH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LRc/c;", "Lgc/c;", "<init>", "()V", "Lkotlin/Function2;", "", "Landroid/os/Bundle;", "LTd/L;", "Lexpo/modules/notifications/ResultReceiverBody;", "body", "Landroid/os/ResultReceiver;", "A", "(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;", "Lgc/e;", "n", "()Lgc/e;", "", "identifier", "LUb/u;", BaseJavaModule.METHOD_TYPE_PROMISE, "D", "(Ljava/lang/String;LUb/u;)V", "B", "(LUb/u;)V", "", "LPc/a;", "notifications", "", "G", "(Ljava/util/Collection;)Ljava/util/List;", "Landroid/content/Context;", "F", "()Landroid/content/Context;", "context", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f15455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f15456b;

        a(u uVar, c cVar) {
            this.f15455a = uVar;
            this.f15456b = cVar;
        }

        public final void a(int i10, Bundle bundle) {
            ArrayList parcelableArrayList = bundle != null ? bundle.getParcelableArrayList("notifications") : null;
            if (i10 == 0 && parcelableArrayList != null) {
                this.f15455a.g(this.f15456b.G(parcelableArrayList));
            } else {
                Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
                this.f15455a.reject("ERR_NOTIFICATIONS_FETCH_FAILED", "A list of displayed notifications could not be fetched.", serializable instanceof Exception ? (Exception) serializable : null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), (Bundle) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Function2 {
        public b() {
        }

        public final void a(Object[] objArr, u promise) throws cc.i {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            Context contextF = c.this.F();
            c cVar = c.this;
            companion.i(contextF, cVar.A(new a(promise, cVar)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws cc.i {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Rc.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0264c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0264c f15458a = new C0264c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(u.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws cc.i {
            AbstractC5504s.h(objArr, "<destruct>");
            u uVar = (u) objArr[0];
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            Context contextF = c.this.F();
            c cVar = c.this;
            companion.i(contextF, cVar.A(new a(uVar, cVar)));
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function2 {
        public e() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            c.this.B(promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f15461a = new f();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(u.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements Function1 {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            c.this.B((u) objArr[0]);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f15463a = new h();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements Function2 {
        public i() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            c.this.D((String) objArr[0], promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L C(u uVar, int i10, Bundle bundle) {
        if (i10 == 0) {
            uVar.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
            uVar.reject("ERR_NOTIFICATIONS_DISMISSAL_FAILED", "Notifications could not be dismissed.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L E(u uVar, int i10, Bundle bundle) {
        if (i10 == 0) {
            uVar.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
            uVar.reject("ERR_NOTIFICATION_DISMISSAL_FAILED", "Notification could not be dismissed.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context F() throws cc.i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new cc.i();
    }

    protected final ResultReceiver A(Function2 body) {
        AbstractC5504s.h(body, "body");
        return Bc.e.b(null, body);
    }

    protected void B(final u promise) {
        AbstractC5504s.h(promise, "promise");
        NotificationsService.INSTANCE.f(F(), A(new Function2() { // from class: Rc.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return c.C(promise, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }

    protected void D(String identifier, final u promise) {
        AbstractC5504s.h(identifier, "identifier");
        AbstractC5504s.h(promise, "promise");
        NotificationsService.INSTANCE.e(F(), new String[]{identifier}, A(new Function2() { // from class: Rc.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return c.E(promise, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }

    protected List G(Collection notifications) {
        AbstractC5504s.h(notifications, "notifications");
        Collection collection = notifications;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Dc.c.b((Pc.a) it.next()));
        }
        return arrayList;
    }

    @Override // gc.c
    public gc.e n() {
        dc.g lVar;
        gc.d dVar;
        Object obj;
        C5974d c5974d;
        dc.g lVar2;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar2 = new gc.d(this);
            dVar2.s("ExpoNotificationPresenter");
            boolean zC = AbstractC5504s.c(u.class, u.class);
            Class cls = Float.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            if (zC) {
                lVar = new dc.f("getPresentedNotificationsAsync", new C5972b[0], new b());
            } else {
                X xM = dVar2.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(u.class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(u.class), false, C0264c.f15458a), xM);
                }
                C5972b[] c5972bArr = {c5972b};
                d dVar3 = new d();
                lVar = AbstractC5504s.c(L.class, cls4) ? new l("getPresentedNotificationsAsync", c5972bArr, dVar3) : AbstractC5504s.c(L.class, cls3) ? new dc.h("getPresentedNotificationsAsync", c5972bArr, dVar3) : AbstractC5504s.c(L.class, cls2) ? new dc.i("getPresentedNotificationsAsync", c5972bArr, dVar3) : AbstractC5504s.c(L.class, cls) ? new j("getPresentedNotificationsAsync", c5972bArr, dVar3) : AbstractC5504s.c(L.class, String.class) ? new n("getPresentedNotificationsAsync", c5972bArr, dVar3) : new s("getPresentedNotificationsAsync", c5972bArr, dVar3);
            }
            dVar2.k().put("getPresentedNotificationsAsync", lVar);
            X xM2 = dVar2.m();
            C5974d c5974d2 = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b2 = (C5972b) c5974d2.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b2 == null) {
                dVar = dVar2;
                c5974d = c5974d2;
                obj = String.class;
                c5972b2 = new C5972b(new M(O.b(String.class), false, h.f15463a), xM2);
            } else {
                dVar = dVar2;
                obj = String.class;
                c5974d = c5974d2;
            }
            dVar.k().put("dismissNotificationAsync", new dc.f("dismissNotificationAsync", new C5972b[]{c5972b2}, new i()));
            if (AbstractC5504s.c(u.class, u.class)) {
                lVar2 = new dc.f("dismissAllNotificationsAsync", new C5972b[0], new e());
            } else {
                X xM3 = dVar.m();
                C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(O.b(u.class), bool));
                if (c5972b3 == null) {
                    c5972b3 = new C5972b(new M(O.b(u.class), false, f.f15461a), xM3);
                }
                C5972b[] c5972bArr2 = {c5972b3};
                g gVar = new g();
                lVar2 = AbstractC5504s.c(L.class, cls4) ? new l("dismissAllNotificationsAsync", c5972bArr2, gVar) : AbstractC5504s.c(L.class, cls3) ? new dc.h("dismissAllNotificationsAsync", c5972bArr2, gVar) : AbstractC5504s.c(L.class, cls2) ? new dc.i("dismissAllNotificationsAsync", c5972bArr2, gVar) : AbstractC5504s.c(L.class, cls) ? new j("dismissAllNotificationsAsync", c5972bArr2, gVar) : AbstractC5504s.c(L.class, obj) ? new n("dismissAllNotificationsAsync", c5972bArr2, gVar) : new s("dismissAllNotificationsAsync", c5972bArr2, gVar);
            }
            dVar.k().put("dismissAllNotificationsAsync", lVar2);
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
