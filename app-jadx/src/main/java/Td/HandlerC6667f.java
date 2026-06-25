package td;

import Td.r;
import Ud.AbstractC2279u;
import Ud.a0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import be.AbstractC3048a;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import expo.modules.updates.d;
import java.util.ArrayList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import td.HandlerC6667f;
import td.InterfaceC6665d;
import vd.InterfaceC6861b;
import xd.C7136g;
import xd.EnumC7131b;

/* JADX INFO: renamed from: td.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC6667f extends Handler {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f60883h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6665d f60884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7136g f60885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f60886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f60888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f60889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f60890g;

    /* JADX INFO: renamed from: td.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: td.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f60891a = new b("WAIT_FOR_REMOTE_UPDATE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f60892b = new b("LAUNCH_NEW_UPDATE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f60893c = new b("LAUNCH_CACHED_UPDATE", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f60894d = new b("CRASH", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f60895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f60896f;

        static {
            b[] bVarArrA = a();
            f60895e = bVarArrA;
            f60896f = AbstractC3048a.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f60891a, f60892b, f60893c, f60894d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f60895e.clone();
        }
    }

    /* JADX INFO: renamed from: td.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60897a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f60891a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f60892b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f60893c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f60894d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f60897a = iArr;
        }
    }

    /* JADX INFO: renamed from: td.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC6861b.a {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(HandlerC6667f handlerC6667f, Exception exc) {
            handlerC6667f.f60890g.add(exc);
            handlerC6667f.f60886c.removeAll(a0.h(b.f60892b, b.f60893c));
            handlerC6667f.j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(HandlerC6667f handlerC6667f) {
            handlerC6667f.f60887d = false;
        }

        @Override // vd.InterfaceC6861b.a
        public void a() {
            final HandlerC6667f handlerC6667f = HandlerC6667f.this;
            handlerC6667f.post(new Runnable() { // from class: td.g
                @Override // java.lang.Runnable
                public final void run() {
                    HandlerC6667f.d.e(handlerC6667f);
                }
            });
        }

        @Override // vd.InterfaceC6861b.a
        public void onFailure(final Exception e10) {
            AbstractC5504s.h(e10, "e");
            final HandlerC6667f handlerC6667f = HandlerC6667f.this;
            handlerC6667f.post(new Runnable() { // from class: td.h
                @Override // java.lang.Runnable
                public final void run() {
                    HandlerC6667f.d.d(handlerC6667f, e10);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6667f(Looper looper, InterfaceC6665d delegate, C7136g logger) {
        super(looper);
        AbstractC5504s.h(looper, "looper");
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(logger, "logger");
        this.f60884a = delegate;
        this.f60885b = logger;
        this.f60886c = AbstractC2279u.g(b.f60891a, b.f60892b, b.f60893c, b.f60894d);
        this.f60890g = new ArrayList();
    }

    private final void f() {
        InterfaceC6665d interfaceC6665d = this.f60884a;
        Object obj = this.f60890g.get(0);
        AbstractC5504s.g(obj, "get(...)");
        interfaceC6665d.d((Exception) obj);
    }

    private final void g() {
        this.f60889f = true;
        this.f60886c.retainAll(a0.h(b.f60891a, b.f60894d));
        this.f60884a.b();
    }

    private final void h(InterfaceC6665d.a aVar) {
        if (this.f60888e) {
            this.f60888e = false;
            if (aVar != InterfaceC6665d.a.f60879c) {
                this.f60886c.remove(b.f60892b);
            }
            j();
        }
    }

    private final void i(Exception exc) {
        this.f60890g.add(exc);
        if (this.f60884a.e() > 0) {
            this.f60886c.remove(b.f60893c);
        } else if (!this.f60889f) {
            this.f60884a.f();
        }
        if (this.f60887d) {
            return;
        }
        this.f60887d = true;
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        int i10 = c.f60897a[((b) this.f60886c.remove(0)).ordinal()];
        if (i10 == 1) {
            C7136g.k(this.f60885b, "UpdatesErrorRecovery: attempting to fetch a new update, waiting", null, 2, null);
            l();
            return;
        }
        if (i10 == 2) {
            C7136g.k(this.f60885b, "UpdatesErrorRecovery: launching new update", null, 2, null);
            k();
            return;
        }
        if (i10 == 3) {
            C7136g.k(this.f60885b, "UpdatesErrorRecovery: falling back to older update", null, 2, null);
            k();
        } else {
            if (i10 != 4) {
                throw new r();
            }
            C7136g c7136g = this.f60885b;
            Object obj = this.f60890g.get(0);
            AbstractC5504s.g(obj, "get(...)");
            c7136g.f("UpdatesErrorRecovery: could not recover from error, crashing", (Exception) obj, EnumC7131b.f64350l);
            f();
        }
    }

    private final void k() {
        this.f60884a.c(new d());
    }

    private final void l() {
        InterfaceC6665d.a aVarG = this.f60884a.g();
        if (aVarG == InterfaceC6665d.a.f60879c) {
            j();
            return;
        }
        InterfaceC6665d.a aVar = InterfaceC6665d.a.f60878b;
        if (aVarG != aVar && this.f60884a.h() == d.a.f46430a) {
            this.f60886c.remove(b.f60892b);
            j();
        } else {
            this.f60888e = true;
            if (this.f60884a.g() != aVar) {
                this.f60884a.a();
            }
            postDelayed(new Runnable() { // from class: td.e
                @Override // java.lang.Runnable
                public final void run() {
                    HandlerC6667f.m(this.f60882a);
                }
            }, HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HandlerC6667f handlerC6667f) {
        handlerC6667f.h(InterfaceC6665d.a.f60877a);
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        AbstractC5504s.h(msg, "msg");
        int i10 = msg.what;
        if (i10 == 0) {
            Object obj = msg.obj;
            AbstractC5504s.f(obj, "null cannot be cast to non-null type java.lang.Exception");
            i((Exception) obj);
        } else {
            if (i10 == 1) {
                g();
                return;
            }
            if (i10 == 2) {
                Object obj2 = msg.obj;
                AbstractC5504s.f(obj2, "null cannot be cast to non-null type expo.modules.updates.errorrecovery.ErrorRecoveryDelegate.RemoteLoadStatus");
                h((InterfaceC6665d.a) obj2);
            } else {
                throw new RuntimeException("ErrorRecoveryHandler cannot handle message " + msg.what);
            }
        }
    }
}
