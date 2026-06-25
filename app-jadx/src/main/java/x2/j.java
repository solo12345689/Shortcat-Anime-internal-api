package x2;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TreeSet f63755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f63756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n f63757e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f63758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f63759b;

        public a(long j10, long j11) {
            this.f63758a = j10;
            this.f63759b = j11;
        }

        public boolean a(long j10, long j11) {
            long j12 = this.f63759b;
            if (j12 == -1) {
                return j10 >= this.f63758a;
            }
            if (j11 == -1) {
                return false;
            }
            long j13 = this.f63758a;
            return j13 <= j10 && j10 + j11 <= j13 + j12;
        }

        public boolean b(long j10, long j11) {
            long j12 = this.f63758a;
            if (j12 > j10) {
                return j11 == -1 || j10 + j11 > j12;
            }
            long j13 = this.f63759b;
            return j13 == -1 || j12 + j13 > j10;
        }
    }

    public j(int i10, String str) {
        this(i10, str, n.f63780c);
    }

    public void a(s sVar) {
        this.f63755c.add(sVar);
    }

    public boolean b(m mVar) {
        this.f63757e = this.f63757e.g(mVar);
        return !r2.equals(r0);
    }

    public n c() {
        return this.f63757e;
    }

    public s d(long j10, long j11) {
        s sVarP = s.p(this.f63754b, j10);
        s sVar = (s) this.f63755c.floor(sVarP);
        if (sVar != null && sVar.f63748b + sVar.f63749c > j10) {
            return sVar;
        }
        s sVar2 = (s) this.f63755c.ceiling(sVarP);
        if (sVar2 != null) {
            long j12 = sVar2.f63748b - j10;
            j11 = j11 == -1 ? j12 : Math.min(j12, j11);
        }
        return s.n(this.f63754b, j10, j11);
    }

    public TreeSet e() {
        return this.f63755c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f63753a == jVar.f63753a && this.f63754b.equals(jVar.f63754b) && this.f63755c.equals(jVar.f63755c) && this.f63757e.equals(jVar.f63757e)) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f63755c.isEmpty();
    }

    public boolean g(long j10, long j11) {
        for (int i10 = 0; i10 < this.f63756d.size(); i10++) {
            if (((a) this.f63756d.get(i10)).a(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.f63756d.isEmpty();
    }

    public int hashCode() {
        return (((this.f63753a * 31) + this.f63754b.hashCode()) * 31) + this.f63757e.hashCode();
    }

    public boolean i(long j10, long j11) {
        for (int i10 = 0; i10 < this.f63756d.size(); i10++) {
            if (((a) this.f63756d.get(i10)).b(j10, j11)) {
                return false;
            }
        }
        this.f63756d.add(new a(j10, j11));
        return true;
    }

    public boolean j(i iVar) {
        if (!this.f63755c.remove(iVar)) {
            return false;
        }
        File file = iVar.f63751e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public s k(s sVar, long j10, boolean z10) {
        long j11;
        AbstractC6614a.g(this.f63755c.remove(sVar));
        File file = (File) AbstractC6614a.e(sVar.f63751e);
        if (z10) {
            j11 = j10;
            File fileQ = s.q((File) AbstractC6614a.e(file.getParentFile()), this.f63753a, sVar.f63748b, j11);
            if (file.renameTo(fileQ)) {
                file = fileQ;
            } else {
                AbstractC6635w.i("CachedContent", "Failed to rename " + file + " to " + fileQ);
            }
        } else {
            j11 = j10;
        }
        s sVarH = sVar.h(file, j11);
        this.f63755c.add(sVarH);
        return sVarH;
    }

    public void l(long j10) {
        for (int i10 = 0; i10 < this.f63756d.size(); i10++) {
            if (((a) this.f63756d.get(i10)).f63758a == j10) {
                this.f63756d.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public j(int i10, String str, n nVar) {
        this.f63753a = i10;
        this.f63754b = str;
        this.f63757e = nVar;
        this.f63755c = new TreeSet();
        this.f63756d = new ArrayList();
    }
}
