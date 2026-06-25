package Tc;

import Td.L;
import Ub.u;
import Ud.AbstractC2279u;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.facebook.react.bridge.BaseJavaModule;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import dc.s;
import expo.modules.notifications.service.NotificationsService;
import ie.InterfaceC5082a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.U;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;
import qb.InterfaceC6168b;
import rb.C6303d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\bH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#H\u0014¢\u0006\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"LTc/c;", "Lgc/c;", "<init>", "()V", "Lkotlin/Function2;", "", "Landroid/os/Bundle;", "LTd/L;", "Lexpo/modules/notifications/ResultReceiverBody;", "body", "Landroid/os/ResultReceiver;", "E", "(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;", "Lgc/e;", "n", "()Lgc/e;", "", "identifier", "LUb/u;", BaseJavaModule.METHOD_TYPE_PROMISE, "B", "(Ljava/lang/String;LUb/u;)V", "z", "(LUb/u;)V", "Lqb/b;", "params", "LOc/d;", "H", "(Lqb/b;)LOc/d;", "LPc/e;", "content", "notificationTrigger", "LPc/g;", "D", "(Ljava/lang/String;LPc/e;LOc/d;)LPc/g;", "", "requests", "", "G", "(Ljava/util/Collection;)Ljava/util/List;", "Landroid/os/Handler;", "d", "Landroid/os/Handler;", "handler", "Landroid/content/Context;", "F", "()Landroid/content/Context;", "schedulingContext", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f17399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f17400b;

        a(u uVar, c cVar) {
            this.f17399a = uVar;
            this.f17400b = cVar;
        }

        public final void a(int i10, Bundle bundle) {
            if (i10 != 0) {
                Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
                AbstractC5504s.f(serializable, "null cannot be cast to non-null type java.lang.Exception");
                this.f17399a.reject("ERR_NOTIFICATIONS_FAILED_TO_FETCH", "Failed to fetch scheduled notifications.", (Exception) serializable);
            } else {
                ArrayList parcelableArrayList = bundle != null ? bundle.getParcelableArrayList("notificationRequests") : null;
                if (parcelableArrayList == null) {
                    this.f17399a.reject("ERR_NOTIFICATIONS_FAILED_TO_FETCH", "Failed to fetch scheduled notifications.", null);
                } else {
                    this.f17399a.g(this.f17400b.G(parcelableArrayList));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), (Bundle) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f17401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17402b;

        b(u uVar, String str) {
            this.f17401a = uVar;
            this.f17402b = str;
        }

        public final void a(int i10, Bundle bundle) {
            if (i10 == 0) {
                this.f17401a.resolve(this.f17402b);
                return;
            }
            Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
            Exception exc = serializable instanceof Exception ? (Exception) serializable : null;
            this.f17401a.reject("ERR_NOTIFICATIONS_FAILED_TO_SCHEDULE", "Failed to schedule the notification. " + (exc != null ? exc.getMessage() : null), exc);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), (Bundle) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Tc.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0300c implements Function2 {
        public C0300c() {
        }

        public final void a(Object[] objArr, u promise) throws cc.i {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            Context contextF = c.this.F();
            c cVar = c.this;
            companion.j(contextF, cVar.E(new a(promise, cVar)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws cc.i {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f17404a = new d();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(u.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function1 {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws cc.i {
            AbstractC5504s.h(objArr, "<destruct>");
            u uVar = (u) objArr[0];
            NotificationsService.Companion companion = NotificationsService.INSTANCE;
            Context contextF = c.this.F();
            c cVar = c.this;
            companion.j(contextF, cVar.E(new a(uVar, cVar)));
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements Function2 {
        public f() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            c.this.z(promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f17407a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(u.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Function1 {
        public h() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            c.this.z((u) objArr[0]);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f17409a = new i();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f17410a = new j();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(InterfaceC6168b.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f17411a = new k();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(InterfaceC6168b.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements Function2 {
        public l() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            InterfaceC6168b interfaceC6168b = (InterfaceC6168b) objArr[2];
            String str = (String) obj;
            try {
                Pc.e eVarA = new Dc.a(c.this.F()).y((InterfaceC6168b) obj2).a();
                c cVar = c.this;
                AbstractC5504s.e(eVarA);
                NotificationsService.INSTANCE.y(c.this.F(), cVar.D(str, eVarA, c.this.H(interfaceC6168b)), c.this.E(new b(promise, str)));
            } catch (NullPointerException e10) {
                promise.reject("ERR_NOTIFICATIONS_FAILED_TO_SCHEDULE", "Failed to schedule the notification. Encountered unexpected null value. " + e10.getMessage(), e10);
            } catch (C6303d e11) {
                promise.reject("ERR_NOTIFICATIONS_FAILED_TO_SCHEDULE", "Failed to schedule the notification. " + e11.getMessage(), e11);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f17413a = new m();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n implements Function2 {
        public n() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            c.this.B((String) objArr[0], promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f17415a = new o();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(InterfaceC6168b.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p implements Function2 {
        public p() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            try {
                Oc.d dVarH = c.this.H((InterfaceC6168b) objArr[0]);
                if (dVarH instanceof Oc.e) {
                    if (((Oc.e) dVarH).n() == null) {
                        promise.resolve((Object) null);
                        return;
                    } else {
                        promise.d(r5.getTime());
                        return;
                    }
                }
                String name = dVarH == null ? "null" : dVarH.getClass().getName();
                U u10 = U.f52264a;
                String str = String.format("It is not possible to get next trigger date for triggers other than calendar-based. Provided trigger resulted in %s trigger.", Arrays.copyOf(new Object[]{name}, 1));
                AbstractC5504s.g(str, "format(...)");
                promise.reject("ERR_NOTIFICATIONS_INVALID_CALENDAR_TRIGGER", str, null);
            } catch (NullPointerException e10) {
                promise.reject("ERR_NOTIFICATIONS_FAILED_TO_GET_NEXT_TRIGGER_DATE", "Failed to get next trigger date for the trigger. Encountered unexpected null value. " + e10.getMessage(), e10);
            } catch (C6303d e11) {
                promise.reject("ERR_NOTIFICATIONS_FAILED_TO_GET_NEXT_TRIGGER_DATE", "Failed to get next trigger date for the trigger. " + e11.getMessage(), e11);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L A(u uVar, int i10, Bundle bundle) {
        if (i10 == 0) {
            uVar.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
            uVar.reject("ERR_NOTIFICATIONS_FAILED_TO_CANCEL", "Failed to cancel all notifications.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L C(u uVar, int i10, Bundle bundle) {
        if (i10 == 0) {
            uVar.resolve((Object) null);
        } else {
            Serializable serializable = bundle != null ? bundle.getSerializable("exception") : null;
            uVar.reject("ERR_NOTIFICATIONS_FAILED_TO_CANCEL", "Failed to cancel notification.", serializable instanceof Exception ? (Exception) serializable : null);
        }
        return L.f17438a;
    }

    public void B(String identifier, final u promise) {
        AbstractC5504s.h(identifier, "identifier");
        AbstractC5504s.h(promise, "promise");
        NotificationsService.INSTANCE.v(F(), identifier, E(new Function2() { // from class: Tc.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return c.C(promise, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }

    protected Pc.g D(String identifier, Pc.e content, Oc.d notificationTrigger) {
        AbstractC5504s.h(identifier, "identifier");
        AbstractC5504s.h(content, "content");
        return new Pc.g(identifier, content, notificationTrigger);
    }

    protected final ResultReceiver E(Function2 body) {
        AbstractC5504s.h(body, "body");
        return Bc.e.b(this.handler, body);
    }

    protected Context F() throws cc.i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new cc.i();
    }

    protected List G(Collection requests) {
        AbstractC5504s.h(requests, "requests");
        Collection collection = requests;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Dc.c.c((Pc.g) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected final Oc.d H(InterfaceC6168b params) {
        Number number;
        if (params == null) {
            return null;
        }
        String string = params.getString("channelId", null);
        String string2 = params.getString("type");
        if (string2 != null) {
            switch (string2.hashCode()) {
                case -791707519:
                    if (string2.equals("weekly")) {
                        Object objB = params.b("weekday");
                        Number number2 = objB instanceof Number ? (Number) objB : null;
                        Object objB2 = params.b("hour");
                        Number number3 = objB2 instanceof Number ? (Number) objB2 : null;
                        Object objB3 = params.b("minute");
                        number = objB3 instanceof Number ? (Number) objB3 : null;
                        if (number2 == null || number3 == null || number == null) {
                            throw new C6303d("Invalid value(s) provided for weekly trigger.");
                        }
                        return new Uc.f(string, number2.intValue(), number3.intValue(), number.intValue());
                    }
                    break;
                case -734561654:
                    if (string2.equals("yearly")) {
                        Object objB4 = params.b("day");
                        Number number4 = objB4 instanceof Number ? (Number) objB4 : null;
                        Object objB5 = params.b("month");
                        Number number5 = objB5 instanceof Number ? (Number) objB5 : null;
                        Object objB6 = params.b("hour");
                        Number number6 = objB6 instanceof Number ? (Number) objB6 : null;
                        Object objB7 = params.b("minute");
                        number = objB7 instanceof Number ? (Number) objB7 : null;
                        if (number4 == null || number5 == null || number6 == null || number == null) {
                            throw new C6303d("Invalid value(s) provided for yearly trigger.");
                        }
                        return new Uc.g(string, number4.intValue(), number5.intValue(), number6.intValue(), number.intValue());
                    }
                    break;
                case 3076014:
                    if (string2.equals("date")) {
                        Object objB8 = params.b(DiagnosticsEntry.TIMESTAMP_KEY);
                        number = objB8 instanceof Number ? (Number) objB8 : null;
                        if (number != null) {
                            return new Uc.c(string, number.longValue());
                        }
                        throw new C6303d("Invalid value provided as date of trigger.");
                    }
                    break;
                case 95346201:
                    if (string2.equals("daily")) {
                        Object objB9 = params.b("hour");
                        Number number7 = objB9 instanceof Number ? (Number) objB9 : null;
                        Object objB10 = params.b("minute");
                        number = objB10 instanceof Number ? (Number) objB10 : null;
                        if (number7 == null || number == null) {
                            throw new C6303d("Invalid value(s) provided for daily trigger.");
                        }
                        return new Uc.b(string, number7.intValue(), number.intValue());
                    }
                    break;
                case 738950403:
                    if (string2.equals("channel")) {
                        return new Uc.a(string);
                    }
                    break;
                case 913014450:
                    if (string2.equals("timeInterval")) {
                        Object objB11 = params.b("seconds");
                        number = objB11 instanceof Number ? (Number) objB11 : null;
                        if (number != null) {
                            return new Uc.e(string, number.longValue(), params.getBoolean("repeats"), null, 8, null);
                        }
                        throw new C6303d("Invalid value provided as interval of trigger.");
                    }
                    break;
                case 1236635661:
                    if (string2.equals("monthly")) {
                        Object objB12 = params.b("day");
                        Number number8 = objB12 instanceof Number ? (Number) objB12 : null;
                        Object objB13 = params.b("hour");
                        Number number9 = objB13 instanceof Number ? (Number) objB13 : null;
                        Object objB14 = params.b("minute");
                        number = objB14 instanceof Number ? (Number) objB14 : null;
                        if (number8 == null || number9 == null || number == null) {
                            throw new C6303d("Invalid value(s) provided for yearly trigger.");
                        }
                        return new Uc.d(string, number8.intValue(), number9.intValue(), number.intValue());
                    }
                    break;
            }
        }
        throw new C6303d("Trigger of type: " + string2 + " is not supported on Android.");
    }

    @Override // gc.c
    public gc.e n() {
        Class cls;
        dc.g lVar;
        gc.d dVar;
        Class cls2;
        C5974d c5974d;
        Class cls3;
        Class cls4;
        Boolean bool;
        dc.g lVar2;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar2 = new gc.d(this);
            dVar2.s("ExpoNotificationScheduler");
            boolean zC = AbstractC5504s.c(u.class, u.class);
            Class cls5 = Float.TYPE;
            Class cls6 = Double.TYPE;
            Class cls7 = Boolean.TYPE;
            Class cls8 = Integer.TYPE;
            if (zC) {
                lVar = new dc.f("getAllScheduledNotificationsAsync", new C5972b[0], new C0300c());
                cls = InterfaceC6168b.class;
            } else {
                X xM = dVar2.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(u.class), Boolean.FALSE));
                if (c5972b == null) {
                    cls = InterfaceC6168b.class;
                    c5972b = new C5972b(new M(O.b(u.class), false, d.f17404a), xM);
                } else {
                    cls = InterfaceC6168b.class;
                }
                C5972b[] c5972bArr = {c5972b};
                e eVar = new e();
                lVar = AbstractC5504s.c(L.class, cls8) ? new dc.l("getAllScheduledNotificationsAsync", c5972bArr, eVar) : AbstractC5504s.c(L.class, cls7) ? new dc.h("getAllScheduledNotificationsAsync", c5972bArr, eVar) : AbstractC5504s.c(L.class, cls6) ? new dc.i("getAllScheduledNotificationsAsync", c5972bArr, eVar) : AbstractC5504s.c(L.class, cls5) ? new dc.j("getAllScheduledNotificationsAsync", c5972bArr, eVar) : AbstractC5504s.c(L.class, String.class) ? new dc.n("getAllScheduledNotificationsAsync", c5972bArr, eVar) : new s("getAllScheduledNotificationsAsync", c5972bArr, eVar);
            }
            dVar2.k().put("getAllScheduledNotificationsAsync", lVar);
            X xM2 = dVar2.m();
            C5974d c5974d2 = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool2 = Boolean.FALSE;
            C5972b c5972b2 = (C5972b) c5974d2.a().get(new Pair(interfaceC6014dB, bool2));
            if (c5972b2 == null) {
                dVar = dVar2;
                c5974d = c5974d2;
                cls2 = String.class;
                c5972b2 = new C5972b(new M(O.b(String.class), false, i.f17409a), xM2);
            } else {
                dVar = dVar2;
                cls2 = String.class;
                c5974d = c5974d2;
            }
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(O.b(cls), bool2));
            if (c5972b3 == null) {
                cls3 = cls5;
                c5972b3 = new C5972b(new M(O.b(cls), false, j.f17410a), xM2);
            } else {
                cls3 = cls5;
            }
            InterfaceC6014d interfaceC6014dB2 = O.b(cls);
            Boolean bool3 = Boolean.TRUE;
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB2, bool3));
            if (c5972b4 == null) {
                bool = bool3;
                cls4 = cls6;
                c5972b4 = new C5972b(new M(O.b(cls), true, k.f17411a), xM2);
            } else {
                cls4 = cls6;
                bool = bool3;
            }
            dVar.k().put("scheduleNotificationAsync", new dc.f("scheduleNotificationAsync", new C5972b[]{c5972b2, c5972b3, c5972b4}, new l()));
            X xM3 = dVar.m();
            C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(O.b(cls2), bool2));
            if (c5972b5 == null) {
                c5972b5 = new C5972b(new M(O.b(cls2), false, m.f17413a), xM3);
            }
            dVar.k().put("cancelScheduledNotificationAsync", new dc.f("cancelScheduledNotificationAsync", new C5972b[]{c5972b5}, new n()));
            if (AbstractC5504s.c(u.class, u.class)) {
                lVar2 = new dc.f("cancelAllScheduledNotificationsAsync", new C5972b[0], new f());
            } else {
                X xM4 = dVar.m();
                C5972b c5972b6 = (C5972b) c5974d.a().get(new Pair(O.b(u.class), bool2));
                if (c5972b6 == null) {
                    c5972b6 = new C5972b(new M(O.b(u.class), false, g.f17407a), xM4);
                }
                C5972b[] c5972bArr2 = {c5972b6};
                h hVar = new h();
                lVar2 = AbstractC5504s.c(L.class, cls8) ? new dc.l("cancelAllScheduledNotificationsAsync", c5972bArr2, hVar) : AbstractC5504s.c(L.class, cls7) ? new dc.h("cancelAllScheduledNotificationsAsync", c5972bArr2, hVar) : AbstractC5504s.c(L.class, cls4) ? new dc.i("cancelAllScheduledNotificationsAsync", c5972bArr2, hVar) : AbstractC5504s.c(L.class, cls3) ? new dc.j("cancelAllScheduledNotificationsAsync", c5972bArr2, hVar) : AbstractC5504s.c(L.class, cls2) ? new dc.n("cancelAllScheduledNotificationsAsync", c5972bArr2, hVar) : new s("cancelAllScheduledNotificationsAsync", c5972bArr2, hVar);
            }
            dVar.k().put("cancelAllScheduledNotificationsAsync", lVar2);
            X xM5 = dVar.m();
            C5972b c5972b7 = (C5972b) c5974d.a().get(new Pair(O.b(cls), bool));
            if (c5972b7 == null) {
                c5972b7 = new C5972b(new M(O.b(cls), true, o.f17415a), xM5);
            }
            dVar.k().put("getNextTriggerDateAsync", new dc.f("getNextTriggerDateAsync", new C5972b[]{c5972b7}, new p()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }

    public void z(final u promise) {
        AbstractC5504s.h(promise, "promise");
        NotificationsService.INSTANCE.u(F(), E(new Function2() { // from class: Tc.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return c.A(promise, ((Integer) obj).intValue(), (Bundle) obj2);
            }
        }));
    }
}
