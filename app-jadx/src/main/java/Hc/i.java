package Hc;

import Hc.m;
import Td.AbstractC2163n;
import Td.L;
import Ub.s;
import Ub.u;
import Ud.AbstractC2279u;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.core.app.p;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
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
import qb.InterfaceC6168b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LHc/i;", "Lgc/c;", "LHc/m;", "<init>", "()V", "Lqb/b;", "groupOptions", "", "D", "(Lqb/b;)Ljava/lang/String;", "Lgc/e;", "n", "()Lgc/e;", "LIc/e;", "d", "Lkotlin/Lazy;", "k", "()LIc/e;", "groupManager", "LJc/d;", "e", "h", "()LJc/d;", "groupSerializer", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class i extends gc.c implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy groupManager = AbstractC2163n.b(new InterfaceC5082a() { // from class: Hc.g
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return i.E(this.f8385a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy groupSerializer = AbstractC2163n.b(new InterfaceC5082a() { // from class: Hc.h
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return i.F(this.f8386a);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Function1 {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            String str = (String) objArr[0];
            if (Build.VERSION.SDK_INT >= 26) {
                i.this.k().d(str);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Function2 {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            NotificationChannelGroup notificationChannelGroupC;
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            String str = (String) promise;
            if (Build.VERSION.SDK_INT < 26 || (notificationChannelGroupC = i.this.k().c(str)) == null) {
                return;
            }
            i.this.h().a(notificationChannelGroupC);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f8391a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            NotificationChannelGroup notificationChannelGroupC;
            AbstractC5504s.h(objArr, "<destruct>");
            String str = (String) objArr[0];
            if (Build.VERSION.SDK_INT < 26 || (notificationChannelGroupC = i.this.k().c(str)) == null) {
                return null;
            }
            return i.this.h().a(notificationChannelGroupC);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function1 {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            List listB = i.this.k().b();
            AbstractC5504s.g(listB, "getNotificationChannelGroups(...)");
            Jc.d dVarH = i.this.h();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listB, 10));
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                arrayList.add(dVarH.a(p.a(it2.next())));
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f8394a = new f();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f8395a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(InterfaceC6168b.class);
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
            Object obj = objArr[0];
            InterfaceC6168b interfaceC6168b = (InterfaceC6168b) objArr[1];
            String str = (String) obj;
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            NotificationChannelGroup notificationChannelGroupA = i.this.k().a(str, i.this.D(interfaceC6168b), interfaceC6168b);
            Jc.d dVarH = i.this.h();
            AbstractC5504s.e(notificationChannelGroupA);
            return dVarH.a(notificationChannelGroupA);
        }
    }

    /* JADX INFO: renamed from: Hc.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0109i implements Function2 {
        public C0109i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            String str = (String) promise;
            if (Build.VERSION.SDK_INT >= 26) {
                i.this.k().d(str);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f8398a = new j();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D(InterfaceC6168b groupOptions) {
        String string = groupOptions.getString("name");
        AbstractC5504s.g(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ic.e E(i iVar) {
        return iVar.C(iVar.i().C()).k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Jc.d F(i iVar) {
        return iVar.C(iVar.i().C()).h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Jc.d h() {
        return (Jc.d) this.groupSerializer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ic.e k() {
        return (Ic.e) this.groupManager.getValue();
    }

    public n C(s sVar) {
        return m.a.a(this, sVar);
    }

    @Override // gc.c
    public gc.e n() {
        dc.g sVar;
        dc.g lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoNotificationChannelGroupManager");
            if (AbstractC5504s.c(String.class, u.class)) {
                sVar = new dc.f("getNotificationChannelGroupAsync", new C5972b[0], new b());
            } else {
                X xM = dVar.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(String.class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(String.class), false, c.f8391a), xM);
                }
                sVar = new dc.s("getNotificationChannelGroupAsync", new C5972b[]{c5972b}, new d());
            }
            dVar.k().put("getNotificationChannelGroupAsync", sVar);
            dVar.k().put("getNotificationChannelGroupsAsync", new dc.s("getNotificationChannelGroupsAsync", new C5972b[0], new e()));
            X xM2 = dVar.m();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b2 == null) {
                c5972b2 = new C5972b(new M(O.b(String.class), false, f.f8394a), xM2);
            }
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(O.b(InterfaceC6168b.class), bool));
            if (c5972b3 == null) {
                c5972b3 = new C5972b(new M(O.b(InterfaceC6168b.class), false, g.f8395a), xM2);
            }
            dVar.k().put("setNotificationChannelGroupAsync", new dc.s("setNotificationChannelGroupAsync", new C5972b[]{c5972b2, c5972b3}, new h()));
            if (AbstractC5504s.c(String.class, u.class)) {
                lVar = new dc.f("deleteNotificationChannelGroupAsync", new C5972b[0], new C0109i());
            } else {
                X xM3 = dVar.m();
                C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
                if (c5972b4 == null) {
                    c5972b4 = new C5972b(new M(O.b(String.class), false, j.f8398a), xM3);
                }
                C5972b[] c5972bArr = {c5972b4};
                a aVar = new a();
                lVar = AbstractC5504s.c(L.class, Integer.TYPE) ? new dc.l("deleteNotificationChannelGroupAsync", c5972bArr, aVar) : AbstractC5504s.c(L.class, Boolean.TYPE) ? new dc.h("deleteNotificationChannelGroupAsync", c5972bArr, aVar) : AbstractC5504s.c(L.class, Double.TYPE) ? new dc.i("deleteNotificationChannelGroupAsync", c5972bArr, aVar) : AbstractC5504s.c(L.class, Float.TYPE) ? new dc.j("deleteNotificationChannelGroupAsync", c5972bArr, aVar) : AbstractC5504s.c(L.class, String.class) ? new dc.n("deleteNotificationChannelGroupAsync", c5972bArr, aVar) : new dc.s("deleteNotificationChannelGroupAsync", c5972bArr, aVar);
            }
            dVar.k().put("deleteNotificationChannelGroupAsync", lVar);
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
