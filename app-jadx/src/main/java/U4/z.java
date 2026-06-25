package U4;

import U4.f;
import Y4.n;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import o5.AbstractC5830g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class z implements f, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f19346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.a f19347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f19348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f19349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f19350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile n.a f19351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile d f19352g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f19353a;

        a(n.a aVar) {
            this.f19353a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (z.this.f(this.f19353a)) {
                z.this.h(this.f19353a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (z.this.f(this.f19353a)) {
                z.this.g(this.f19353a, obj);
            }
        }
    }

    z(g gVar, f.a aVar) {
        this.f19346a = gVar;
        this.f19347b = aVar;
    }

    private boolean d(Object obj) throws Throwable {
        Throwable th2;
        long jB = AbstractC5830g.b();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e eVarO = this.f19346a.o(obj);
            Object objA = eVarO.a();
            S4.d dVarQ = this.f19346a.q(objA);
            e eVar = new e(dVarQ, objA, this.f19346a.k());
            d dVar = new d(this.f19351f.f22810a, this.f19346a.p());
            W4.a aVarD = this.f19346a.d();
            aVarD.b(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + dVarQ + ", duration: " + AbstractC5830g.a(jB));
            }
            if (aVarD.a(dVar) != null) {
                this.f19352g = dVar;
                this.f19349d = new c(Collections.singletonList(this.f19351f.f22810a), this.f19346a, this);
                this.f19351f.f22812c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f19352g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f19347b.a(this.f19351f.f22810a, eVarO.a(), this.f19351f.f22812c, this.f19351f.f22812c.d(), this.f19351f.f22810a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z10 = true;
                if (z10) {
                    throw th2;
                }
                this.f19351f.f22812c.b();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private boolean e() {
        return this.f19348c < this.f19346a.g().size();
    }

    private void i(n.a aVar) {
        this.f19351f.f22812c.e(this.f19346a.l(), new a(aVar));
    }

    @Override // U4.f.a
    public void a(S4.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, S4.a aVar, S4.f fVar2) {
        this.f19347b.a(fVar, obj, dVar, this.f19351f.f22812c.d(), fVar);
    }

    @Override // U4.f
    public boolean b() {
        if (this.f19350e != null) {
            Object obj = this.f19350e;
            this.f19350e = null;
            try {
                if (!d(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f19349d != null && this.f19349d.b()) {
            return true;
        }
        this.f19349d = null;
        this.f19351f = null;
        boolean z10 = false;
        while (!z10 && e()) {
            List listG = this.f19346a.g();
            int i10 = this.f19348c;
            this.f19348c = i10 + 1;
            this.f19351f = (n.a) listG.get(i10);
            if (this.f19351f != null && (this.f19346a.e().c(this.f19351f.f22812c.d()) || this.f19346a.u(this.f19351f.f22812c.a()))) {
                i(this.f19351f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // U4.f.a
    public void c(S4.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, S4.a aVar) {
        this.f19347b.c(fVar, exc, dVar, this.f19351f.f22812c.d());
    }

    @Override // U4.f
    public void cancel() {
        n.a aVar = this.f19351f;
        if (aVar != null) {
            aVar.f22812c.cancel();
        }
    }

    boolean f(n.a aVar) {
        n.a aVar2 = this.f19351f;
        return aVar2 != null && aVar2 == aVar;
    }

    void g(n.a aVar, Object obj) {
        j jVarE = this.f19346a.e();
        if (obj != null && jVarE.c(aVar.f22812c.d())) {
            this.f19350e = obj;
            this.f19347b.k();
        } else {
            f.a aVar2 = this.f19347b;
            S4.f fVar = aVar.f22810a;
            com.bumptech.glide.load.data.d dVar = aVar.f22812c;
            aVar2.a(fVar, obj, dVar, dVar.d(), this.f19352g);
        }
    }

    void h(n.a aVar, Exception exc) {
        f.a aVar2 = this.f19347b;
        d dVar = this.f19352g;
        com.bumptech.glide.load.data.d dVar2 = aVar.f22812c;
        aVar2.c(dVar, exc, dVar2, dVar2.d());
    }

    @Override // U4.f.a
    public void k() {
        throw new UnsupportedOperationException();
    }
}
