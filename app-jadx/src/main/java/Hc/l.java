package Hc;

import Hc.m;
import Td.AbstractC2163n;
import Td.L;
import Ub.s;
import Ub.u;
import Ud.AbstractC2279u;
import android.app.NotificationChannel;
import android.os.Build;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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
import r4.N;
import ub.C6752d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LHc/l;", "Lgc/c;", "LHc/m;", "<init>", "()V", "Lqb/b;", "channelOptions", "", "H", "(Lqb/b;)Ljava/lang/CharSequence;", "", "G", "(Lqb/b;)I", "Lgc/e;", "n", "()Lgc/e;", "LIc/f;", "d", "Lkotlin/Lazy;", "j", "()LIc/f;", "channelManager", "LJc/e;", "e", "()LJc/e;", "channelSerializer", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class l extends gc.c implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy channelManager = AbstractC2163n.b(new InterfaceC5082a() { // from class: Hc.j
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return l.D(this.f8399a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy channelSerializer = AbstractC2163n.b(new InterfaceC5082a() { // from class: Hc.k
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return l.E(this.f8400a);
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
                l.this.j().a(str);
            }
            return L.f17438a;
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
            if (Build.VERSION.SDK_INT < 26) {
                return AbstractC2279u.m();
            }
            List listD = l.this.j().d();
            AbstractC5504s.g(listD, "getNotificationChannels(...)");
            Jc.e eVarE = l.this.e();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listD, 10));
            Iterator it2 = listD.iterator();
            while (it2.hasNext()) {
                arrayList.add(eVarE.a(N.a(it2.next())));
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function2 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            NotificationChannel notificationChannelB;
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            String str = (String) promise;
            if (Build.VERSION.SDK_INT < 26 || (notificationChannelB = l.this.j().b(str)) == null) {
                return;
            }
            l.this.e().a(notificationChannelB);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f8406a = new d();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function1 {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            NotificationChannel notificationChannelB;
            AbstractC5504s.h(objArr, "<destruct>");
            String str = (String) objArr[0];
            if (Build.VERSION.SDK_INT < 26 || (notificationChannelB = l.this.j().b(str)) == null) {
                return null;
            }
            return l.this.e().a(notificationChannelB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f8408a = new f();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f8409a = new g();

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
            C6752d c6752dU;
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            InterfaceC6168b interfaceC6168b = (InterfaceC6168b) objArr[1];
            String str = (String) obj;
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            if (!l.this.j().e(interfaceC6168b) && (c6752dU = l.this.i().u()) != null) {
                C6752d.c(c6752dU, "expo-notifications: Custom sound '" + interfaceC6168b.getString("sound", null) + "' not found in native app. Make sure the sound file (e.g. 'custom_sound.wav') is included in the expo-notifications config plugin sounds array in app config.", null, 2, null);
            }
            NotificationChannel notificationChannelC = l.this.j().c(str, l.this.H(interfaceC6168b), l.this.G(interfaceC6168b), interfaceC6168b);
            Jc.e eVarE = l.this.e();
            AbstractC5504s.e(notificationChannelC);
            return eVarE.a(notificationChannelC);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements Function2 {
        public i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            String str = (String) promise;
            if (Build.VERSION.SDK_INT >= 26) {
                l.this.j().a(str);
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
        public static final j f8412a = new j();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ic.f D(l lVar) {
        return lVar.F(lVar.i().C()).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Jc.e E(l lVar) {
        return lVar.F(lVar.i().C()).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G(InterfaceC6168b channelOptions) {
        Mc.c cVarB = Mc.c.b(channelOptions.getInt("importance", Mc.c.DEFAULT.h()));
        Objects.requireNonNull(cVarB);
        return cVarB.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence H(InterfaceC6168b channelOptions) {
        String string = channelOptions.getString("name");
        AbstractC5504s.g(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Jc.e e() {
        return (Jc.e) this.channelSerializer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ic.f j() {
        return (Ic.f) this.channelManager.getValue();
    }

    public n F(s sVar) {
        return m.a.a(this, sVar);
    }

    @Override // gc.c
    public gc.e n() {
        dc.g sVar;
        Class cls;
        gc.d dVar;
        C5974d c5974d;
        dc.g lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar2 = new gc.d(this);
            dVar2.s("ExpoNotificationChannelManager");
            C5972b[] c5972bArr = new C5972b[0];
            b bVar = new b();
            Class cls2 = Integer.TYPE;
            boolean zC = AbstractC5504s.c(List.class, cls2);
            Class cls3 = Float.TYPE;
            Class cls4 = Double.TYPE;
            Class cls5 = Boolean.TYPE;
            dVar2.k().put("getNotificationChannelsAsync", zC ? new dc.l("getNotificationChannelsAsync", c5972bArr, bVar) : AbstractC5504s.c(List.class, cls5) ? new dc.h("getNotificationChannelsAsync", c5972bArr, bVar) : AbstractC5504s.c(List.class, cls4) ? new dc.i("getNotificationChannelsAsync", c5972bArr, bVar) : AbstractC5504s.c(List.class, cls3) ? new dc.j("getNotificationChannelsAsync", c5972bArr, bVar) : AbstractC5504s.c(List.class, String.class) ? new dc.n("getNotificationChannelsAsync", c5972bArr, bVar) : new dc.s("getNotificationChannelsAsync", c5972bArr, bVar));
            if (AbstractC5504s.c(String.class, u.class)) {
                sVar = new dc.f("getNotificationChannelAsync", new C5972b[0], new c());
            } else {
                X xM = dVar2.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(String.class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(String.class), false, d.f8406a), xM);
                }
                sVar = new dc.s("getNotificationChannelAsync", new C5972b[]{c5972b}, new e());
            }
            dVar2.k().put("getNotificationChannelAsync", sVar);
            X xM2 = dVar2.m();
            C5974d c5974d2 = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b2 = (C5972b) c5974d2.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b2 == null) {
                cls = InterfaceC6168b.class;
                dVar = dVar2;
                c5972b2 = new C5972b(new M(O.b(String.class), false, f.f8408a), xM2);
            } else {
                cls = InterfaceC6168b.class;
                dVar = dVar2;
            }
            C5972b c5972b3 = (C5972b) c5974d2.a().get(new Pair(O.b(cls), bool));
            if (c5972b3 == null) {
                g gVar = g.f8409a;
                InterfaceC6014d interfaceC6014dB2 = O.b(cls);
                c5974d = c5974d2;
                c5972b3 = new C5972b(new M(interfaceC6014dB2, false, gVar), xM2);
            } else {
                c5974d = c5974d2;
            }
            dVar.k().put("setNotificationChannelAsync", new dc.s("setNotificationChannelAsync", new C5972b[]{c5972b2, c5972b3}, new h()));
            if (AbstractC5504s.c(String.class, u.class)) {
                lVar = new dc.f("deleteNotificationChannelAsync", new C5972b[0], new i());
            } else {
                X xM3 = dVar.m();
                C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
                if (c5972b4 == null) {
                    c5972b4 = new C5972b(new M(O.b(String.class), false, j.f8412a), xM3);
                }
                C5972b[] c5972bArr2 = {c5972b4};
                a aVar = new a();
                lVar = AbstractC5504s.c(L.class, cls2) ? new dc.l("deleteNotificationChannelAsync", c5972bArr2, aVar) : AbstractC5504s.c(L.class, cls5) ? new dc.h("deleteNotificationChannelAsync", c5972bArr2, aVar) : AbstractC5504s.c(L.class, cls4) ? new dc.i("deleteNotificationChannelAsync", c5972bArr2, aVar) : AbstractC5504s.c(L.class, cls3) ? new dc.j("deleteNotificationChannelAsync", c5972bArr2, aVar) : AbstractC5504s.c(L.class, String.class) ? new dc.n("deleteNotificationChannelAsync", c5972bArr2, aVar) : new dc.s("deleteNotificationChannelAsync", c5972bArr2, aVar);
            }
            dVar.k().put("deleteNotificationChannelAsync", lVar);
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
