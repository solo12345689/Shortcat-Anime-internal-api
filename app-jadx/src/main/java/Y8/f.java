package y8;

import android.app.job.JobInfo;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p8.EnumC5940e;
import y8.C7210c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private B8.a f64926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f64927b = new HashMap();

        public a a(EnumC5940e enumC5940e, b bVar) {
            this.f64927b.put(enumC5940e, bVar);
            return this;
        }

        public f b() {
            if (this.f64926a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f64927b.keySet().size() < EnumC5940e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f64927b;
            this.f64927b = new HashMap();
            return f.d(this.f64926a, map);
        }

        public a c(B8.a aVar) {
            this.f64926a = aVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new C7210c.b().c(Collections.EMPTY_SET);
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) r7))));
    }

    public static a b() {
        return new a();
    }

    static f d(B8.a aVar, Map map) {
        return new C7209b(aVar, map);
    }

    public static f f(B8.a aVar) {
        return b().a(EnumC5940e.DEFAULT, b.a().b(HTTPTimeoutManager.DEFAULT_TIMEOUT_MS).d(86400000L).a()).a(EnumC5940e.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(EnumC5940e.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, EnumC5940e enumC5940e, long j10, int i10) {
        builder.setMinimumLatency(g(enumC5940e, j10, i10));
        j(builder, ((b) h().get(enumC5940e)).c());
        return builder;
    }

    abstract B8.a e();

    public long g(EnumC5940e enumC5940e, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = (b) h().get(enumC5940e);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    abstract Map h();
}
