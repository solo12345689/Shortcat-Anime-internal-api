package Nc;

import Oc.c;
import Pc.h;
import Pc.i;
import Td.L;
import Ub.u;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import bc.C3042a;
import bc.EnumC3046e;
import bc.InterfaceC3043b;
import com.facebook.react.bridge.BaseJavaModule;
import dc.f;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006$"}, d2 = {"LNc/a;", "Lgc/c;", "LOc/c;", "<init>", "()V", "", "identifier", "Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;", "behavior", "LUb/u;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTd/L;", "C", "(Ljava/lang/String;Lexpo/modules/notifications/notifications/model/NotificationBehaviorRecord;LUb/u;)V", "Lgc/e;", "n", "()Lgc/e;", "LPc/a;", "notification", "f", "(LPc/a;)V", "LNc/c;", "task", "D", "(LNc/c;)V", "Landroid/os/HandlerThread;", "d", "Landroid/os/HandlerThread;", "notificationsHandlerThread", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "handler", "", "Ljava/util/Map;", "tasksMap", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a extends gc.c implements Oc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private HandlerThread notificationsHandlerThread;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map tasksMap = new LinkedHashMap();

    /* JADX INFO: renamed from: Nc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0199a implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0199a f12786a = new C0199a();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12787a = new b();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(NotificationBehaviorRecord.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function2 {
        public c() {
        }

        public final void a(Object[] objArr, u promise) throws Bc.b {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            Object obj = objArr[0];
            NotificationBehaviorRecord notificationBehaviorRecord = (NotificationBehaviorRecord) objArr[1];
            a.this.C((String) obj, notificationBehaviorRecord, promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Bc.b {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gc.d f12790b;

        public d(gc.d dVar) {
            this.f12790b = dVar;
        }

        public final void a() {
            Dc.b.f3684a.a(a.this);
            a.this.notificationsHandlerThread = new HandlerThread("NotificationsHandlerThread - " + this.f12790b.getClass());
            HandlerThread handlerThread = a.this.notificationsHandlerThread;
            HandlerThread handlerThread2 = null;
            if (handlerThread == null) {
                AbstractC5504s.u("notificationsHandlerThread");
                handlerThread = null;
            }
            handlerThread.start();
            a aVar = a.this;
            HandlerThread handlerThread3 = a.this.notificationsHandlerThread;
            if (handlerThread3 == null) {
                AbstractC5504s.u("notificationsHandlerThread");
            } else {
                handlerThread2 = handlerThread3;
            }
            aVar.handler = new Handler(handlerThread2.getLooper());
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC5082a {
        public e() {
        }

        public final void a() {
            Dc.b.f3684a.f(a.this);
            Iterator it = a.this.tasksMap.values().iterator();
            while (it.hasNext()) {
                ((Nc.c) it.next()).k();
            }
            HandlerThread handlerThread = a.this.notificationsHandlerThread;
            if (handlerThread == null) {
                AbstractC5504s.u("notificationsHandlerThread");
                handlerThread = null;
            }
            handlerThread.quit();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(String identifier, NotificationBehaviorRecord behavior, u promise) throws Bc.b {
        Nc.c cVar = (Nc.c) this.tasksMap.get(identifier);
        if (cVar == null) {
            throw new Bc.b(identifier);
        }
        cVar.i(behavior, promise);
    }

    public final void D(Nc.c task) {
        AbstractC5504s.h(task, "task");
        this.tasksMap.remove(task.g());
    }

    @Override // Oc.c
    public void c(Bundle bundle) {
        c.a.a(this, bundle);
    }

    @Override // Oc.c
    public void d() {
        c.a.c(this);
    }

    @Override // Oc.c
    public void f(Pc.a notification) {
        AbstractC5504s.h(notification, "notification");
        Context contextB = i().B();
        if (contextB == null) {
            return;
        }
        Oc.a aVarA = notification.a().a();
        if ((aVarA instanceof i) && ((i) aVarA).b()) {
            return;
        }
        InterfaceC3043b interfaceC3043bI = i().i(this);
        Handler handler = this.handler;
        if (handler == null) {
            AbstractC5504s.u("handler");
            handler = null;
        }
        Nc.c cVar = new Nc.c(contextB, interfaceC3043bI, handler, notification, this);
        this.tasksMap.put(cVar.g(), cVar);
        cVar.j();
    }

    @Override // Oc.c
    public boolean g(h hVar) {
        return c.a.b(this, hVar);
    }

    @Override // gc.c
    public gc.e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoNotificationsHandlerModule");
            dVar.d("onHandleNotification", "onHandleNotificationTimeout");
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33268a;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new d(dVar)));
            Map mapW2 = dVar.w();
            EnumC3046e enumC3046e2 = EnumC3046e.f33269b;
            mapW2.put(enumC3046e2, new C3042a(enumC3046e2, new e()));
            X xM = dVar.m();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                c5972b = new C5972b(new M(O.b(String.class), false, C0199a.f12786a), xM);
            }
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(O.b(NotificationBehaviorRecord.class), bool));
            if (c5972b2 == null) {
                c5972b2 = new C5972b(new M(O.b(NotificationBehaviorRecord.class), false, b.f12787a), xM);
            }
            dVar.k().put("handleNotificationAsync", new f("handleNotificationAsync", new C5972b[]{c5972b, c5972b2}, new c()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
