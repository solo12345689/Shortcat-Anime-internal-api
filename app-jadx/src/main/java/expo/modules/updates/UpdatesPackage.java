package expo.modules.updates;

import Gf.AbstractC1613i;
import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.O;
import Gf.P;
import Td.L;
import Td.v;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.app.Application;
import android.content.Context;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactHost;
import com.facebook.react.bridge.ReactContext;
import expo.modules.updates.UpdatesPackage;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sb.InterfaceC6447b;
import sb.h;
import sb.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lexpo/modules/updates/UpdatesPackage;", "Lsb/g;", "<init>", "()V", "", "j", "()Z", "Landroid/content/Context;", "context", "", "Lsb/j;", "a", "(Landroid/content/Context;)Ljava/util/List;", "activityContext", "Lsb/h;", "d", "Lsb/b;", "e", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpdatesPackage implements sb.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f46294b = UpdatesPackage.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f46295c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f46296d = false;

    /* JADX INFO: renamed from: expo.modules.updates.UpdatesPackage$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return UpdatesPackage.f46296d;
        }

        public final boolean b() {
            return UpdatesPackage.f46295c;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC6447b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f46298b;

        b(Context context) {
            this.f46298b = context;
        }

        @Override // sb.InterfaceC6447b
        public void a(Application application) {
            AbstractC5504s.h(application, "application");
            super.a(application);
            if (UpdatesPackage.this.j()) {
                f.c(this.f46298b, false, 2, null);
                f.a().b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements h {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f46299a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f46301c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f46302d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Runnable f46303e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, boolean z10, Runnable runnable, Zd.e eVar) {
                super(2, eVar);
                this.f46301c = context;
                this.f46302d = z10;
                this.f46303e = runnable;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return c.this.new a(this.f46301c, this.f46302d, this.f46303e, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
            
                if (r6.i(r1, r5) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = ae.AbstractC2605b.f()
                    int r1 = r5.f46299a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    Td.v.b(r6)
                    goto L43
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    Td.v.b(r6)
                    goto L33
                L1e:
                    Td.v.b(r6)
                    expo.modules.updates.UpdatesPackage$c r6 = expo.modules.updates.UpdatesPackage.c.this
                    android.content.Context r1 = r5.f46301c
                    kotlin.jvm.internal.AbstractC5504s.e(r1)
                    boolean r4 = r5.f46302d
                    r5.f46299a = r3
                    java.lang.Object r6 = expo.modules.updates.UpdatesPackage.c.g(r6, r1, r4, r5)
                    if (r6 != r0) goto L33
                    goto L42
                L33:
                    expo.modules.updates.UpdatesPackage$c r6 = expo.modules.updates.UpdatesPackage.c.this
                    java.lang.Runnable r1 = r5.f46303e
                    kotlin.jvm.internal.AbstractC5504s.e(r1)
                    r5.f46299a = r2
                    java.lang.Object r6 = expo.modules.updates.UpdatesPackage.c.f(r6, r1, r5)
                    if (r6 != r0) goto L43
                L42:
                    return r0
                L43:
                    Td.L r6 = Td.L.f17438a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: expo.modules.updates.UpdatesPackage.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f46304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f46305b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Runnable runnable, Zd.e eVar) {
                super(2, eVar);
                this.f46305b = runnable;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new b(this.f46305b, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f46304a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                this.f46305b.run();
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: expo.modules.updates.UpdatesPackage$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0735c extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f46306a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f46307b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f46308c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0735c(Context context, boolean z10, Zd.e eVar) {
                super(2, eVar);
                this.f46307b = context;
                this.f46308c = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0735c(this.f46307b, this.f46308c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((C0735c) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f46306a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                if (!UpdatesPackage.INSTANCE.a()) {
                    f.b(this.f46307b, this.f46308c);
                    f.a().b();
                }
                return L.f17438a;
            }
        }

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(c cVar, Context context, boolean z10, Runnable runnable) {
            AbstractC1617k.d(P.a(C1608f0.b()), null, null, cVar.new a(context, z10, runnable, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object i(Runnable runnable, Zd.e eVar) {
            Object objG = AbstractC1613i.g(C1608f0.c(), new b(runnable, null), eVar);
            return objG == AbstractC2605b.f() ? objG : L.f17438a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object j(Context context, boolean z10, Zd.e eVar) {
            Object objG = AbstractC1613i.g(C1608f0.b(), new C0735c(context, z10, null), eVar);
            return objG == AbstractC2605b.f() ? objG : L.f17438a;
        }

        @Override // sb.h
        public h.a c(ReactActivity activity, ReactHost reactHost) {
            AbstractC5504s.h(activity, "activity");
            AbstractC5504s.h(reactHost, "reactHost");
            Companion companion = UpdatesPackage.INSTANCE;
            if (companion.a()) {
                return null;
            }
            final Context applicationContext = activity.getApplicationContext();
            c7.f devSupportManager = reactHost.getDevSupportManager();
            final boolean zM = devSupportManager != null ? devSupportManager.m() : false;
            if (!zM || companion.b()) {
                return new h.a() { // from class: nd.g
                    @Override // sb.h.a
                    public final void a(Runnable runnable) {
                        UpdatesPackage.c.h(this.f54126a, applicationContext, zM, runnable);
                    }
                };
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f46309a;

        d(Context context) {
            this.f46309a = context;
        }

        @Override // sb.j
        public void a(c7.f devSupportManager) {
            AbstractC5504s.h(devSupportManager, "devSupportManager");
            f.a().a(devSupportManager);
        }

        @Override // sb.j
        public String b(boolean z10) {
            if (f.a().f()) {
                return f.a().c();
            }
            return null;
        }

        @Override // sb.j
        public void c(Context context, ReactHost reactNativeHost) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(reactNativeHost, "reactNativeHost");
            f.a().l(new WeakReference(reactNativeHost));
        }

        @Override // sb.j
        public String d(boolean z10) {
            if (f.a().f()) {
                return f.a().b();
            }
            return null;
        }

        @Override // sb.j
        public void e(boolean z10, Exception exception) {
            AbstractC5504s.h(exception, "exception");
            f.a().o(exception);
        }

        @Override // sb.j
        public void f(boolean z10, ReactContext reactContext) {
            AbstractC5504s.h(reactContext, "reactContext");
            f.a().m(reactContext);
        }

        @Override // sb.j
        public void h(boolean z10) {
            f.b(this.f46309a, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        try {
            Class.forName("androidx.test.espresso.Espresso");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // sb.g
    public List a(Context context) {
        AbstractC5504s.h(context, "context");
        return AbstractC2279u.e(new d(context));
    }

    @Override // sb.g
    public List d(Context activityContext) {
        AbstractC5504s.h(activityContext, "activityContext");
        return AbstractC2279u.e(new c());
    }

    @Override // sb.g
    public List e(Context context) {
        AbstractC5504s.h(context, "context");
        return AbstractC2279u.e(new b(context));
    }
}
