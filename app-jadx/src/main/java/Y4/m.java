package Y4;

import java.util.Queue;
import o5.C5831h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5831h f22804a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends C5831h {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o5.C5831h
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Queue f22806d = o5.l.g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f22809c;

        private b() {
        }

        static b a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f22806d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i10, i11);
            return bVar;
        }

        private void b(Object obj, int i10, int i11) {
            this.f22809c = obj;
            this.f22808b = i10;
            this.f22807a = i11;
        }

        public void c() {
            Queue queue = f22806d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f22808b == bVar.f22808b && this.f22807a == bVar.f22807a && this.f22809c.equals(bVar.f22809c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f22807a * 31) + this.f22808b) * 31) + this.f22809c.hashCode();
        }
    }

    public m(long j10) {
        this.f22804a = new a(j10);
    }

    public Object a(Object obj, int i10, int i11) {
        b bVarA = b.a(obj, i10, i11);
        Object objG = this.f22804a.g(bVarA);
        bVarA.c();
        return objG;
    }

    public void b(Object obj, int i10, int i11, Object obj2) {
        this.f22804a.k(b.a(obj, i10, i11), obj2);
    }
}
