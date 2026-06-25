package U2;

import java.util.Arrays;
import q2.C6109x;
import q2.InterfaceC6098m;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface O {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f18934a;

        /* JADX INFO: renamed from: b */
        public final byte[] f18935b;

        /* JADX INFO: renamed from: c */
        public final int f18936c;

        /* JADX INFO: renamed from: d */
        public final int f18937d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f18934a = i10;
            this.f18935b = bArr;
            this.f18936c = i11;
            this.f18937d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f18934a == aVar.f18934a && this.f18936c == aVar.f18936c && this.f18937d == aVar.f18937d && Arrays.equals(this.f18935b, aVar.f18935b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f18934a * 31) + Arrays.hashCode(this.f18935b)) * 31) + this.f18936c) * 31) + this.f18937d;
        }
    }

    void a(long j10, int i10, int i11, int i12, a aVar);

    int b(InterfaceC6098m interfaceC6098m, int i10, boolean z10, int i11);

    void c(C6109x c6109x);

    default int e(InterfaceC6098m interfaceC6098m, int i10, boolean z10) {
        return b(interfaceC6098m, i10, z10, 0);
    }

    default void f(C6609I c6609i, int i10) {
        g(c6609i, i10, 0);
    }

    void g(C6609I c6609i, int i10, int i11);

    default void d(long j10) {
    }
}
