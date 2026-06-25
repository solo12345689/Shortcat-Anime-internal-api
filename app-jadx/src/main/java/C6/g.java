package C6;

import E6.o;
import E6.p;
import java.util.Collections;
import java.util.List;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f2892a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements b {
        @Override // C6.g.b
        public List a() {
            return Collections.EMPTY_LIST;
        }

        @Override // C6.g.b
        public int b() {
            return 0;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        List a();

        int b();
    }

    public g() {
        this(new a());
    }

    @Override // C6.e
    public int a(int i10) {
        List listA = this.f2892a.a();
        if (listA == null || listA.isEmpty()) {
            return i10 + 1;
        }
        for (int i11 = 0; i11 < listA.size(); i11++) {
            if (((Integer) listA.get(i11)).intValue() > i10) {
                return ((Integer) listA.get(i11)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // C6.e
    public p b(int i10) {
        return o.d(i10, i10 >= this.f2892a.b(), false);
    }

    @Override // C6.e
    public boolean c() {
        return true;
    }

    public g(b bVar) {
        this.f2892a = (b) k.g(bVar);
    }
}
