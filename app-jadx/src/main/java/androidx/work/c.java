package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.p;
import i4.v;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a */
    private Context f32693a;

    /* JADX INFO: renamed from: b */
    private WorkerParameters f32694b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f32695c;

    /* JADX INFO: renamed from: d */
    private boolean f32696d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.c$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0546a extends a {

            /* JADX INFO: renamed from: a */
            private final androidx.work.b f32697a;

            public C0546a() {
                this(androidx.work.b.f32690c);
            }

            public androidx.work.b e() {
                return this.f32697a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0546a.class != obj.getClass()) {
                    return false;
                }
                return this.f32697a.equals(((C0546a) obj).f32697a);
            }

            public int hashCode() {
                return (C0546a.class.getName().hashCode() * 31) + this.f32697a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f32697a + '}';
            }

            public C0546a(androidx.work.b bVar) {
                this.f32697a = bVar;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.c$a$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0547c extends a {

            /* JADX INFO: renamed from: a */
            private final androidx.work.b f32698a;

            public C0547c() {
                this(androidx.work.b.f32690c);
            }

            public androidx.work.b e() {
                return this.f32698a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0547c.class != obj.getClass()) {
                    return false;
                }
                return this.f32698a.equals(((C0547c) obj).f32698a);
            }

            public int hashCode() {
                return (C0547c.class.getName().hashCode() * 31) + this.f32698a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f32698a + '}';
            }

            public C0547c(androidx.work.b bVar) {
                this.f32698a = bVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0546a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new C0547c();
        }

        public static a d(androidx.work.b bVar) {
            return new C0547c(bVar);
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f32693a = context;
        this.f32694b = workerParameters;
    }

    public final Context a() {
        return this.f32693a;
    }

    public Executor c() {
        return this.f32694b.a();
    }

    public p d() {
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        cVarU.r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVarU;
    }

    public final UUID f() {
        return this.f32694b.c();
    }

    public final b g() {
        return this.f32694b.d();
    }

    public v h() {
        return this.f32694b.e();
    }

    public final boolean i() {
        return this.f32695c;
    }

    public final boolean j() {
        return this.f32696d;
    }

    public final void l() {
        this.f32696d = true;
    }

    public abstract p m();

    public final void n() {
        this.f32695c = true;
        k();
    }

    public void k() {
    }
}
