package P2;

import M2.D;
import java.util.List;
import q2.C6109x;
import q2.Y;
import q2.a0;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface A extends E {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final a0 f13260a;

        /* JADX INFO: renamed from: b */
        public final int[] f13261b;

        /* JADX INFO: renamed from: c */
        public final int f13262c;

        public a(a0 a0Var, int... iArr) {
            this(a0Var, iArr, 0);
        }

        public a(a0 a0Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                AbstractC6635w.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f13260a = a0Var;
            this.f13261b = iArr;
            this.f13262c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        A[] a(a[] aVarArr, Q2.d dVar, D.b bVar, Y y10);
    }

    boolean a(int i10, long j10);

    int b();

    default boolean c(long j10, N2.e eVar, List list) {
        return false;
    }

    void disable();

    void enable();

    boolean g(int i10, long j10);

    void h(float f10);

    Object i();

    void k(long j10, long j11, long j12, List list, N2.n[] nVarArr);

    void n(boolean z10);

    int o(long j10, List list);

    int p();

    C6109x q();

    int r();

    default void j() {
    }

    default void s() {
    }
}
