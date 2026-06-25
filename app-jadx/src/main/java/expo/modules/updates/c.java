package expo.modules.updates;

import be.AbstractC3048a;
import com.facebook.react.bridge.ReactContext;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import expo.modules.updates.d;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ud.InterfaceC6765a;
import wd.o;
import yd.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        private final d f46376a;

        /* JADX INFO: renamed from: expo.modules.updates.c$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0738a extends a {

            /* JADX INFO: renamed from: b */
            private final Exception f46377b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0738a(Exception error) {
                super(d.f46383d, null);
                AbstractC5504s.h(error, "error");
                this.f46377b = error;
            }

            public final Exception a() {
                return this.f46377b;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends a {

            /* JADX INFO: renamed from: b */
            private final o.d f46378b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o.d reason) {
                super(d.f46380a, null);
                AbstractC5504s.h(reason, "reason");
                this.f46378b = reason;
            }

            public final o.d a() {
                return this.f46378b;
            }
        }

        /* JADX INFO: renamed from: expo.modules.updates.c$a$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0739c extends a {

            /* JADX INFO: renamed from: b */
            private final Date f46379b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0739c(Date commitTime) {
                super(d.f46382c, null);
                AbstractC5504s.h(commitTime, "commitTime");
                this.f46379b = commitTime;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class d extends Enum {

            /* JADX INFO: renamed from: a */
            public static final d f46380a = new d("NO_UPDATE_AVAILABLE", 0);

            /* JADX INFO: renamed from: b */
            public static final d f46381b = new d("UPDATE_AVAILABLE", 1);

            /* JADX INFO: renamed from: c */
            public static final d f46382c = new d("ROLL_BACK_TO_EMBEDDED", 2);

            /* JADX INFO: renamed from: d */
            public static final d f46383d = new d(HybridPurchaseLogicBridge.RESULT_ERROR, 3);

            /* JADX INFO: renamed from: e */
            private static final /* synthetic */ d[] f46384e;

            /* JADX INFO: renamed from: f */
            private static final /* synthetic */ EnumEntries f46385f;

            static {
                d[] dVarArrA = a();
                f46384e = dVarArrA;
                f46385f = AbstractC3048a.a(dVarArrA);
            }

            private d(String str, int i10) {
                super(str, i10);
            }

            private static final /* synthetic */ d[] a() {
                return new d[]{f46380a, f46381b, f46382c, f46383d};
            }

            public static d valueOf(String str) {
                return (d) Enum.valueOf(d.class, str);
            }

            public static d[] values() {
                return (d[]) f46384e.clone();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class e extends a {

            /* JADX INFO: renamed from: b */
            private final q f46386b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(q update) {
                super(d.f46381b, null);
                AbstractC5504s.h(update, "update");
                this.f46386b = update;
            }

            public final q a() {
                return this.f46386b;
            }
        }

        public /* synthetic */ a(d dVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar);
        }

        private a(d dVar) {
            this.f46376a = dVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        private final d f46387a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends b {

            /* JADX INFO: renamed from: b */
            private final Exception f46388b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception error) {
                super(d.f46392d, null);
                AbstractC5504s.h(error, "error");
                this.f46388b = error;
            }

            public final Exception a() {
                return this.f46388b;
            }
        }

        /* JADX INFO: renamed from: expo.modules.updates.c$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0740b extends b {
            public C0740b() {
                super(d.f46390b, null);
            }
        }

        /* JADX INFO: renamed from: expo.modules.updates.c$b$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0741c extends b {
            public C0741c() {
                super(d.f46391c, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class d extends Enum {

            /* JADX INFO: renamed from: a */
            public static final d f46389a = new d(HybridPurchaseLogicBridge.RESULT_SUCCESS, 0);

            /* JADX INFO: renamed from: b */
            public static final d f46390b = new d("FAILURE", 1);

            /* JADX INFO: renamed from: c */
            public static final d f46391c = new d("ROLL_BACK_TO_EMBEDDED", 2);

            /* JADX INFO: renamed from: d */
            public static final d f46392d = new d(HybridPurchaseLogicBridge.RESULT_ERROR, 3);

            /* JADX INFO: renamed from: e */
            private static final /* synthetic */ d[] f46393e;

            /* JADX INFO: renamed from: f */
            private static final /* synthetic */ EnumEntries f46394f;

            static {
                d[] dVarArrA = a();
                f46393e = dVarArrA;
                f46394f = AbstractC3048a.a(dVarArrA);
            }

            private d(String str, int i10) {
                super(str, i10);
            }

            private static final /* synthetic */ d[] a() {
                return new d[]{f46389a, f46390b, f46391c, f46392d};
            }

            public static d valueOf(String str) {
                return (d) Enum.valueOf(d.class, str);
            }

            public static d[] values() {
                return (d[]) f46393e.clone();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class e extends b {

            /* JADX INFO: renamed from: b */
            private final rd.d f46395b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(rd.d update) {
                super(d.f46389a, null);
                AbstractC5504s.h(update, "update");
                this.f46395b = update;
            }

            public final rd.d a() {
                return this.f46395b;
            }
        }

        public /* synthetic */ b(d dVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar);
        }

        private b(d dVar) {
            this.f46387a = dVar;
        }
    }

    /* JADX INFO: renamed from: expo.modules.updates.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0742c {

        /* JADX INFO: renamed from: a */
        private final rd.d f46396a;

        /* JADX INFO: renamed from: b */
        private final Ef.a f46397b;

        /* JADX INFO: renamed from: c */
        private final rd.d f46398c;

        /* JADX INFO: renamed from: d */
        private final Exception f46399d;

        /* JADX INFO: renamed from: e */
        private final boolean f46400e;

        /* JADX INFO: renamed from: f */
        private final boolean f46401f;

        /* JADX INFO: renamed from: g */
        private final String f46402g;

        /* JADX INFO: renamed from: h */
        private final d.a f46403h;

        /* JADX INFO: renamed from: i */
        private final Map f46404i;

        /* JADX INFO: renamed from: j */
        private final Map f46405j;

        /* JADX INFO: renamed from: k */
        private final boolean f46406k;

        /* JADX INFO: renamed from: l */
        private final Cd.b f46407l;

        public /* synthetic */ C0742c(rd.d dVar, Ef.a aVar, rd.d dVar2, Exception exc, boolean z10, boolean z11, String str, d.a aVar2, Map map, Map map2, boolean z12, Cd.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, aVar, dVar2, exc, z10, z11, str, aVar2, map, map2, z12, bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:75:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Map a() {
            /*
                Method dump skipped, instruction units count: 310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.updates.c.C0742c.a():java.util.Map");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0742c)) {
                return false;
            }
            C0742c c0742c = (C0742c) obj;
            return AbstractC5504s.c(this.f46396a, c0742c.f46396a) && AbstractC5504s.c(this.f46397b, c0742c.f46397b) && AbstractC5504s.c(this.f46398c, c0742c.f46398c) && AbstractC5504s.c(this.f46399d, c0742c.f46399d) && this.f46400e == c0742c.f46400e && this.f46401f == c0742c.f46401f && AbstractC5504s.c(this.f46402g, c0742c.f46402g) && this.f46403h == c0742c.f46403h && AbstractC5504s.c(this.f46404i, c0742c.f46404i) && AbstractC5504s.c(this.f46405j, c0742c.f46405j) && this.f46406k == c0742c.f46406k && AbstractC5504s.c(this.f46407l, c0742c.f46407l);
        }

        public int hashCode() {
            rd.d dVar = this.f46396a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            Ef.a aVar = this.f46397b;
            int iE = (iHashCode + (aVar == null ? 0 : Ef.a.E(aVar.S()))) * 31;
            rd.d dVar2 = this.f46398c;
            int iHashCode2 = (iE + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
            Exception exc = this.f46399d;
            int iHashCode3 = (((((iHashCode2 + (exc == null ? 0 : exc.hashCode())) * 31) + Boolean.hashCode(this.f46400e)) * 31) + Boolean.hashCode(this.f46401f)) * 31;
            String str = this.f46402g;
            int iHashCode4 = (((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f46403h.hashCode()) * 31) + this.f46404i.hashCode()) * 31;
            Map map = this.f46405j;
            return ((((iHashCode4 + (map != null ? map.hashCode() : 0)) * 31) + Boolean.hashCode(this.f46406k)) * 31) + this.f46407l.hashCode();
        }

        public String toString() {
            return "UpdatesModuleConstants(launchedUpdate=" + this.f46396a + ", launchDuration=" + this.f46397b + ", embeddedUpdate=" + this.f46398c + ", emergencyLaunchException=" + this.f46399d + ", isEnabled=" + this.f46400e + ", isUsingEmbeddedAssets=" + this.f46401f + ", runtimeVersion=" + this.f46402g + ", checkOnLaunch=" + this.f46403h + ", requestHeaders=" + this.f46404i + ", localAssetFiles=" + this.f46405j + ", shouldDeferToNativeForAPIMethodAvailabilityInDevelopment=" + this.f46406k + ", initialContext=" + this.f46407l + ")";
        }

        private C0742c(rd.d dVar, Ef.a aVar, rd.d dVar2, Exception exc, boolean z10, boolean z11, String str, d.a checkOnLaunch, Map requestHeaders, Map map, boolean z12, Cd.b initialContext) {
            AbstractC5504s.h(checkOnLaunch, "checkOnLaunch");
            AbstractC5504s.h(requestHeaders, "requestHeaders");
            AbstractC5504s.h(initialContext, "initialContext");
            this.f46396a = dVar;
            this.f46397b = aVar;
            this.f46398c = dVar2;
            this.f46399d = exc;
            this.f46400e = z10;
            this.f46401f = z11;
            this.f46402g = str;
            this.f46403h = checkOnLaunch;
            this.f46404i = requestHeaders;
            this.f46405j = map;
            this.f46406k = z12;
            this.f46407l = initialContext;
        }
    }

    void a(c7.f fVar);

    String b();

    String c();

    InterfaceC6765a d();

    Object e(Zd.e eVar);

    boolean f();

    void g(Map map);

    WeakReference getReactHost();

    Object h(String str, String str2, Zd.e eVar);

    Object i(Zd.e eVar);

    C0742c j();

    Ad.d k();

    void l(WeakReference weakReference);

    void m(ReactContext reactContext);

    void n();

    void o(Exception exc);

    Object p(Zd.e eVar);

    Object q(Zd.e eVar);

    void r(e eVar);

    void start();
}
