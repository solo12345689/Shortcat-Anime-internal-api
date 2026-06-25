package r8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r8.C6276b;

/* JADX INFO: renamed from: r8.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6283i {

    /* JADX INFO: renamed from: r8.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {
        public final a a(String str, int i10) {
            e().put(str, String.valueOf(i10));
            return this;
        }

        public final a b(String str, long j10) {
            e().put(str, String.valueOf(j10));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract AbstractC6283i d();

        protected abstract Map e();

        protected abstract a f(Map map);

        public abstract a g(Integer num);

        public abstract a h(C6282h c6282h);

        public abstract a i(long j10);

        public abstract a j(String str);

        public abstract a k(long j10);
    }

    public static a a() {
        return new C6276b.C0887b().f(new HashMap());
    }

    public final String b(String str) {
        String str2 = (String) c().get(str);
        return str2 == null ? "" : str2;
    }

    protected abstract Map c();

    public abstract Integer d();

    public abstract C6282h e();

    public abstract long f();

    public final int g(String str) {
        String str2 = (String) c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h(String str) {
        String str2 = (String) c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map i() {
        return Collections.unmodifiableMap(c());
    }

    public abstract String j();

    public abstract long k();

    public a l() {
        return new C6276b.C0887b().j(j()).g(d()).h(e()).i(f()).k(k()).f(new HashMap(c()));
    }
}
