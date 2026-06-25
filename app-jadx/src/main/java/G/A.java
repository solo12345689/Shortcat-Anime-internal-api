package G;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface A {

    /* JADX INFO: renamed from: a */
    public static final a f6697a = a.f6698a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f6698a = new a();

        private a() {
        }

        public final A a(int i10) {
            if (i10 >= 0) {
                return new B(i10);
            }
            throw new IllegalArgumentException(("pages should be greater than or equal to 0. You have used " + i10 + com.amazon.a.a.o.c.a.b.f34706a).toString());
        }
    }

    int a(int i10, int i11, float f10, int i12, int i13);
}
