package i4;

import i4.u;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends u {

    /* JADX INFO: renamed from: e */
    public static final b f48684e = new b(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a builder) {
        super(builder.e(), builder.h(), builder.f());
        AbstractC5504s.h(builder, "builder");
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends u.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass, long j10, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            AbstractC5504s.h(workerClass, "workerClass");
            AbstractC5504s.h(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            h().k(repeatIntervalTimeUnit.toMillis(j10));
        }

        @Override // i4.u.a
        /* JADX INFO: renamed from: l */
        public n c() {
            if (d() && h().f53952j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (h().f53959q) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new n(this);
        }

        @Override // i4.u.a
        /* JADX INFO: renamed from: m */
        public a g() {
            return this;
        }
    }
}
