package u2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t2.C6609I;

/* JADX INFO: renamed from: u2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6723e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61226a;

    /* JADX INFO: renamed from: u2.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC6723e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f61227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f61228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f61229d;

        public b(int i10, long j10) {
            super(i10);
            this.f61227b = j10;
            this.f61228c = new ArrayList();
            this.f61229d = new ArrayList();
        }

        public void b(b bVar) {
            this.f61229d.add(bVar);
        }

        public void c(c cVar) {
            this.f61228c.add(cVar);
        }

        public b d(int i10) {
            int size = this.f61229d.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f61229d.get(i11);
                if (bVar.f61226a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public c e(int i10) {
            int size = this.f61228c.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = (c) this.f61228c.get(i11);
                if (cVar.f61226a == i10) {
                    return cVar;
                }
            }
            return null;
        }

        @Override // u2.AbstractC6723e
        public String toString() {
            return AbstractC6723e.a(this.f61226a) + " leaves: " + Arrays.toString(this.f61228c.toArray()) + " containers: " + Arrays.toString(this.f61229d.toArray());
        }
    }

    /* JADX INFO: renamed from: u2.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC6723e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6609I f61230b;

        public c(int i10, C6609I c6609i) {
            super(i10);
            this.f61230b = c6609i;
        }
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f61226a);
    }

    private AbstractC6723e(int i10) {
        this.f61226a = i10;
    }
}
