package r8;

import p8.AbstractC5939d;
import p8.C5938c;
import p8.InterfaceC5942g;
import r8.C6277c;

/* JADX INFO: renamed from: r8.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6288n {

    /* JADX INFO: renamed from: r8.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {
        public abstract AbstractC6288n a();

        abstract a b(C5938c c5938c);

        abstract a c(AbstractC5939d abstractC5939d);

        abstract a d(InterfaceC5942g interfaceC5942g);

        public abstract a e(AbstractC6289o abstractC6289o);

        public abstract a f(String str);
    }

    AbstractC6288n() {
    }

    public static a a() {
        return new C6277c.b();
    }

    public abstract C5938c b();

    abstract AbstractC5939d c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    abstract InterfaceC5942g e();

    public abstract AbstractC6289o f();

    public abstract String g();
}
