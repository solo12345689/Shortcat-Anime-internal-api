package tg;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class a0 {

    /* JADX INFO: renamed from: d */
    public static final b f61003d = new b(null);

    /* JADX INFO: renamed from: e */
    public static final a0 f61004e = new a();

    /* JADX INFO: renamed from: a */
    private boolean f61005a;

    /* JADX INFO: renamed from: b */
    private long f61006b;

    /* JADX INFO: renamed from: c */
    private long f61007c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(long j10, long j11) {
            return (j10 != 0 && (j11 == 0 || j10 < j11)) ? j10 : j11;
        }

        private b() {
        }
    }

    public a0 a() {
        this.f61005a = false;
        return this;
    }

    public a0 b() {
        this.f61007c = 0L;
        return this;
    }

    public long c() {
        if (this.f61005a) {
            return this.f61006b;
        }
        throw new IllegalStateException("No deadline");
    }

    public a0 d(long j10) {
        this.f61005a = true;
        this.f61006b = j10;
        return this;
    }

    public boolean e() {
        return this.f61005a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f61005a && this.f61006b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public a0 g(long j10, TimeUnit unit) {
        AbstractC5504s.h(unit, "unit");
        if (j10 >= 0) {
            this.f61007c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f61007c;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends a0 {
        a() {
        }

        @Override // tg.a0
        public a0 g(long j10, TimeUnit unit) {
            AbstractC5504s.h(unit, "unit");
            return this;
        }

        @Override // tg.a0
        public void f() {
        }

        @Override // tg.a0
        public a0 d(long j10) {
            return this;
        }
    }
}
