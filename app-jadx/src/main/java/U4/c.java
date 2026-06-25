package U4;

import U4.f;
import Y4.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class c implements f, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f19132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.a f19133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private S4.f f19135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f19136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile n.a f19138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f19139i;

    c(g gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        return this.f19137g < this.f19136f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (a() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f19136f;
        r3 = r7.f19137g;
        r7.f19137g = r3 + 1;
        r7.f19138h = ((Y4.n) r0.get(r3)).b(r7.f19139i, r7.f19132b.t(), r7.f19132b.f(), r7.f19132b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f19138h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f19132b.u(r7.f19138h.f22812c.a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f19138h.f22812c.e(r7.f19132b.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f19138h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // U4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            p5.b.a(r0)
        L5:
            java.util.List r0 = r7.f19136f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f19138h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.a()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List r0 = r7.f19136f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f19137g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f19137g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            Y4.n r0 = (Y4.n) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f19139i     // Catch: java.lang.Throwable -> L68
            U4.g r4 = r7.f19132b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.t()     // Catch: java.lang.Throwable -> L68
            U4.g r5 = r7.f19132b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L68
            U4.g r6 = r7.f19132b     // Catch: java.lang.Throwable -> L68
            S4.h r6 = r6.k()     // Catch: java.lang.Throwable -> L68
            Y4.n$a r0 = r0.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f19138h = r0     // Catch: java.lang.Throwable -> L68
            Y4.n$a r0 = r7.f19138h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            U4.g r0 = r7.f19132b     // Catch: java.lang.Throwable -> L68
            Y4.n$a r3 = r7.f19138h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r3 = r3.f22812c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            Y4.n$a r0 = r7.f19138h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r0 = r0.f22812c     // Catch: java.lang.Throwable -> L68
            U4.g r2 = r7.f19132b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.g r2 = r2.l()     // Catch: java.lang.Throwable -> L68
            r0.e(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            p5.b.e()
            return r2
        L6e:
            int r0 = r7.f19134d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f19134d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List r1 = r7.f19131a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            p5.b.e()
            return r2
        L7f:
            java.util.List r0 = r7.f19131a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f19134d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            S4.f r0 = (S4.f) r0     // Catch: java.lang.Throwable -> L68
            U4.d r1 = new U4.d     // Catch: java.lang.Throwable -> L68
            U4.g r3 = r7.f19132b     // Catch: java.lang.Throwable -> L68
            S4.f r3 = r3.p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            U4.g r3 = r7.f19132b     // Catch: java.lang.Throwable -> L68
            W4.a r3 = r3.d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L68
            r7.f19139i = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f19135e = r0     // Catch: java.lang.Throwable -> L68
            U4.g r0 = r7.f19132b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f19136f = r0     // Catch: java.lang.Throwable -> L68
            r7.f19137g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            p5.b.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.c.b():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f19133c.c(this.f19135e, exc, this.f19138h.f22812c, S4.a.DATA_DISK_CACHE);
    }

    @Override // U4.f
    public void cancel() {
        n.a aVar = this.f19138h;
        if (aVar != null) {
            aVar.f22812c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f19133c.a(this.f19135e, obj, this.f19138h.f22812c, S4.a.DATA_DISK_CACHE, this.f19135e);
    }

    c(List list, g gVar, f.a aVar) {
        this.f19134d = -1;
        this.f19131a = list;
        this.f19132b = gVar;
        this.f19133c = aVar;
    }
}
