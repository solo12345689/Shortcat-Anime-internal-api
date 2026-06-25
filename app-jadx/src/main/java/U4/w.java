package U4;

import U4.f;
import Y4.n;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class w implements f, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f.a f19325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f19326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19328d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private S4.f f19329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f19330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile n.a f19332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f19333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private x f19334j;

    w(g gVar, f.a aVar) {
        this.f19326b = gVar;
        this.f19325a = aVar;
    }

    private boolean a() {
        return this.f19331g < this.f19330f.size();
    }

    @Override // U4.f
    public boolean b() {
        p5.b.a("ResourceCacheGenerator.startNext");
        try {
            List listC = this.f19326b.c();
            boolean z10 = false;
            if (listC.isEmpty()) {
                p5.b.e();
                return false;
            }
            List listM = this.f19326b.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f19326b.r())) {
                    p5.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f19326b.i() + " to " + this.f19326b.r());
            }
            while (true) {
                if (this.f19330f != null && a()) {
                    this.f19332h = null;
                    while (!z10 && a()) {
                        List list = this.f19330f;
                        int i10 = this.f19331g;
                        this.f19331g = i10 + 1;
                        this.f19332h = ((Y4.n) list.get(i10)).b(this.f19333i, this.f19326b.t(), this.f19326b.f(), this.f19326b.k());
                        if (this.f19332h != null && this.f19326b.u(this.f19332h.f22812c.a())) {
                            this.f19332h.f22812c.e(this.f19326b.l(), this);
                            z10 = true;
                        }
                    }
                    p5.b.e();
                    return z10;
                }
                int i11 = this.f19328d + 1;
                this.f19328d = i11;
                if (i11 >= listM.size()) {
                    int i12 = this.f19327c + 1;
                    this.f19327c = i12;
                    if (i12 >= listC.size()) {
                        p5.b.e();
                        return false;
                    }
                    this.f19328d = 0;
                }
                S4.f fVar = (S4.f) listC.get(this.f19327c);
                Class cls = (Class) listM.get(this.f19328d);
                this.f19334j = new x(this.f19326b.b(), fVar, this.f19326b.p(), this.f19326b.t(), this.f19326b.f(), this.f19326b.s(cls), cls, this.f19326b.k());
                File fileA = this.f19326b.d().a(this.f19334j);
                this.f19333i = fileA;
                if (fileA != null) {
                    this.f19329e = fVar;
                    this.f19330f = this.f19326b.j(fileA);
                    this.f19331g = 0;
                }
            }
        } catch (Throwable th2) {
            p5.b.e();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f19325a.c(this.f19334j, exc, this.f19332h.f22812c, S4.a.RESOURCE_DISK_CACHE);
    }

    @Override // U4.f
    public void cancel() {
        n.a aVar = this.f19332h;
        if (aVar != null) {
            aVar.f22812c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f19325a.a(this.f19329e, obj, this.f19332h.f22812c, S4.a.RESOURCE_DISK_CACHE, this.f19334j);
    }
}
