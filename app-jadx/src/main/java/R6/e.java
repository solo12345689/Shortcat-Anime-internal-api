package r6;

import java.util.List;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a */
    private final c f58625a;

    /* JADX INFO: renamed from: b */
    private final int f58626b;

    /* JADX INFO: renamed from: c */
    private String f58627c;

    /* JADX INFO: renamed from: d */
    private C5.a f58628d;

    /* JADX INFO: renamed from: e */
    private List f58629e;

    e(f fVar) {
        this.f58625a = (c) k.g(fVar.e());
        this.f58626b = fVar.d();
        this.f58628d = fVar.f();
        this.f58629e = fVar.c();
        fVar.b();
        this.f58627c = fVar.g();
    }

    public static e b(c cVar) {
        return new e(cVar);
    }

    public static f f(c cVar) {
        return new f(cVar);
    }

    public synchronized void a() {
        C5.a.m(this.f58628d);
        this.f58628d = null;
        C5.a.q(this.f58629e);
        this.f58629e = null;
    }

    public N6.a c() {
        return null;
    }

    public c d() {
        return this.f58625a;
    }

    public String e() {
        return this.f58627c;
    }

    private e(c cVar) {
        this.f58625a = (c) k.g(cVar);
        this.f58626b = 0;
    }
}
