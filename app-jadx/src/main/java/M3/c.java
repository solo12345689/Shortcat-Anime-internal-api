package M3;

import Td.L;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f12074m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S3.h f12075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f12076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f12077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f12078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f12079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f12080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f12081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f12082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private S3.g f12083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f12085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f12086l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(long j10, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        AbstractC5504s.h(autoCloseTimeUnit, "autoCloseTimeUnit");
        AbstractC5504s.h(autoCloseExecutor, "autoCloseExecutor");
        this.f12076b = new Handler(Looper.getMainLooper());
        this.f12078d = new Object();
        this.f12079e = autoCloseTimeUnit.toMillis(j10);
        this.f12080f = autoCloseExecutor;
        this.f12082h = SystemClock.uptimeMillis();
        this.f12085k = new Runnable() { // from class: M3.a
            @Override // java.lang.Runnable
            public final void run() {
                c.f(this.f12072a);
            }
        };
        this.f12086l = new Runnable() { // from class: M3.b
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f12073a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(c this$0) {
        L l10;
        AbstractC5504s.h(this$0, "this$0");
        synchronized (this$0.f12078d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f12082h < this$0.f12079e) {
                    return;
                }
                if (this$0.f12081g != 0) {
                    return;
                }
                Runnable runnable = this$0.f12077c;
                if (runnable != null) {
                    runnable.run();
                    l10 = L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                S3.g gVar = this$0.f12083i;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                this$0.f12083i = null;
                L l11 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c this$0) {
        AbstractC5504s.h(this$0, "this$0");
        this$0.f12080f.execute(this$0.f12086l);
    }

    public final void d() {
        synchronized (this.f12078d) {
            try {
                this.f12084j = true;
                S3.g gVar = this.f12083i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f12083i = null;
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f12078d) {
            try {
                int i10 = this.f12081g;
                if (i10 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i11 = i10 - 1;
                this.f12081g = i11;
                if (i11 == 0) {
                    if (this.f12083i == null) {
                        return;
                    } else {
                        this.f12076b.postDelayed(this.f12085k, this.f12079e);
                    }
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object g(Function1 block) {
        AbstractC5504s.h(block, "block");
        try {
            return block.invoke(j());
        } finally {
            e();
        }
    }

    public final S3.g h() {
        return this.f12083i;
    }

    public final S3.h i() {
        S3.h hVar = this.f12075a;
        if (hVar != null) {
            return hVar;
        }
        AbstractC5504s.u("delegateOpenHelper");
        return null;
    }

    public final S3.g j() {
        synchronized (this.f12078d) {
            this.f12076b.removeCallbacks(this.f12085k);
            this.f12081g++;
            if (this.f12084j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            S3.g gVar = this.f12083i;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            S3.g writableDatabase = i().getWritableDatabase();
            this.f12083i = writableDatabase;
            return writableDatabase;
        }
    }

    public final void k(S3.h delegateOpenHelper) {
        AbstractC5504s.h(delegateOpenHelper, "delegateOpenHelper");
        m(delegateOpenHelper);
    }

    public final void l(Runnable onAutoClose) {
        AbstractC5504s.h(onAutoClose, "onAutoClose");
        this.f12077c = onAutoClose;
    }

    public final void m(S3.h hVar) {
        AbstractC5504s.h(hVar, "<set-?>");
        this.f12075a = hVar;
    }
}
