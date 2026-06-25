package q8;

import java.util.List;
import q8.C6154g;

/* JADX INFO: renamed from: q8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6160m {

    /* JADX INFO: renamed from: q8.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {
        public abstract AbstractC6160m a();

        public abstract a b(AbstractC6158k abstractC6158k);

        public abstract a c(List list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(EnumC6163p enumC6163p);

        public abstract a g(long j10);

        public abstract a h(long j10);

        public a i(int i10) {
            return d(Integer.valueOf(i10));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new C6154g.b();
    }

    public abstract AbstractC6158k b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract EnumC6163p f();

    public abstract long g();

    public abstract long h();
}
