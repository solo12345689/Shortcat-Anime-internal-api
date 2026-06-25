package u2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.a0;

/* JADX INFO: renamed from: u2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6729k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f61345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f61346b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f61347c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityQueue f61348d = new PriorityQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f61349e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f61350f;

    /* JADX INFO: renamed from: u2.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f61352b = -9223372036854775807L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f61351a = new ArrayList();

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f61352b, aVar.f61352b);
        }

        public void b(long j10, C6609I c6609i) {
            AbstractC6614a.a(j10 != -9223372036854775807L);
            AbstractC6614a.g(this.f61351a.isEmpty());
            this.f61352b = j10;
            this.f61351a.add(c6609i);
        }
    }

    /* JADX INFO: renamed from: u2.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(long j10, C6609I c6609i);
    }

    public C6729k(b bVar) {
        this.f61345a = bVar;
    }

    private C6609I c(C6609I c6609i) {
        C6609I c6609i2 = this.f61346b.isEmpty() ? new C6609I() : (C6609I) this.f61346b.pop();
        c6609i2.X(c6609i.a());
        System.arraycopy(c6609i.f(), c6609i.g(), c6609i2.f(), 0, c6609i2.a());
        return c6609i2;
    }

    private void e(int i10) {
        while (this.f61348d.size() > i10) {
            a aVar = (a) a0.l((a) this.f61348d.poll());
            for (int i11 = 0; i11 < aVar.f61351a.size(); i11++) {
                this.f61345a.a(aVar.f61352b, (C6609I) aVar.f61351a.get(i11));
                this.f61346b.push((C6609I) aVar.f61351a.get(i11));
            }
            aVar.f61351a.clear();
            a aVar2 = this.f61350f;
            if (aVar2 != null && aVar2.f61352b == aVar.f61352b) {
                this.f61350f = null;
            }
            this.f61347c.push(aVar);
        }
    }

    public void a(long j10, C6609I c6609i) {
        int i10 = this.f61349e;
        if (i10 == 0 || (i10 != -1 && this.f61348d.size() >= this.f61349e && j10 < ((a) a0.l((a) this.f61348d.peek())).f61352b)) {
            this.f61345a.a(j10, c6609i);
            return;
        }
        C6609I c6609iC = c(c6609i);
        a aVar = this.f61350f;
        if (aVar != null && j10 == aVar.f61352b) {
            aVar.f61351a.add(c6609iC);
            return;
        }
        a aVar2 = this.f61347c.isEmpty() ? new a() : (a) this.f61347c.pop();
        aVar2.b(j10, c6609iC);
        this.f61348d.add(aVar2);
        this.f61350f = aVar2;
        int i11 = this.f61349e;
        if (i11 != -1) {
            e(i11);
        }
    }

    public void b() {
        this.f61348d.clear();
    }

    public void d() {
        e(0);
    }

    public int f() {
        return this.f61349e;
    }

    public void g(int i10) {
        AbstractC6614a.g(i10 >= 0);
        this.f61349e = i10;
        e(i10);
    }
}
