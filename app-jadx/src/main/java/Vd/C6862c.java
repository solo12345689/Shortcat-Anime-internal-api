package vd;

import Df.C1271d;
import Gf.AbstractC1617k;
import Gf.O;
import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import android.content.Context;
import fe.k;
import java.io.File;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rd.d;
import xd.C7136g;

/* JADX INFO: renamed from: vd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6862c implements InterfaceC6861b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f62079h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f62080i = C6862c.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7136g f62082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f62083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Void f62084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Void f62085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Void f62086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f62087g;

    /* JADX INFO: renamed from: vd.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f62088a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Exception f62090c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Exception exc, e eVar) {
            super(2, eVar);
            this.f62090c = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return C6862c.this.new a(this.f62090c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f62088a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            C6862c.this.j(this.f62090c);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: vd.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(File filesDir, C7136g logger) {
            AbstractC5504s.h(filesDir, "filesDir");
            AbstractC5504s.h(logger, "logger");
            try {
                File file = new File(filesDir, "expo-error.log");
                if (!file.exists()) {
                    return null;
                }
                String strL = k.l(file, C1271d.f3718b);
                file.delete();
                return strL;
            } catch (Exception e10) {
                C7136g.h(logger, "Failed to read error log", e10, null, 4, null);
                return null;
            }
        }

        private b() {
        }
    }

    public C6862c(Context context, C7136g logger, Exception exc, O launcherScope) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(launcherScope, "launcherScope");
        this.f62081a = context;
        this.f62082b = logger;
        this.f62083c = "index.android.bundle";
        this.f62087g = true;
        if (exc != null) {
            AbstractC1617k.d(launcherScope, null, null, new a(exc, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Exception exc) {
        try {
            k.e(new File(this.f62081a.getFilesDir(), "expo-error.log"), exc.toString(), C1271d.f3718b);
        } catch (Exception e10) {
            C7136g.h(this.f62082b, "Failed to write fatal error to log", e10, null, 4, null);
        }
    }

    @Override // vd.InterfaceC6861b
    public /* bridge */ /* synthetic */ Map a() {
        return (Map) i();
    }

    @Override // vd.InterfaceC6861b
    public /* bridge */ /* synthetic */ String b() {
        return (String) g();
    }

    @Override // vd.InterfaceC6861b
    public String c() {
        return this.f62083c;
    }

    @Override // vd.InterfaceC6861b
    public /* bridge */ /* synthetic */ d d() {
        return (d) h();
    }

    @Override // vd.InterfaceC6861b
    public boolean e() {
        return this.f62087g;
    }

    public Void g() {
        return this.f62085e;
    }

    public Void h() {
        return this.f62084d;
    }

    public Void i() {
        return this.f62086f;
    }
}
