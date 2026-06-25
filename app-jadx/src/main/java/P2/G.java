package P2;

import M2.D;
import M2.n0;
import androidx.media3.exoplayer.N0;
import androidx.media3.exoplayer.O0;
import q2.C6088c;
import q2.Y;
import q2.d0;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a */
    private a f13274a;

    /* JADX INFO: renamed from: b */
    private Q2.d f13275b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(N0 n02);

        void c();
    }

    protected final Q2.d b() {
        return (Q2.d) AbstractC6614a.i(this.f13275b);
    }

    public abstract d0 c();

    public abstract O0.a d();

    public void e(a aVar, Q2.d dVar) {
        AbstractC6614a.g(this.f13274a == null);
        this.f13274a = aVar;
        this.f13275b = dVar;
    }

    protected final void f() {
        a aVar = this.f13274a;
        if (aVar != null) {
            aVar.c();
        }
    }

    protected final void g(N0 n02) {
        a aVar = this.f13274a;
        if (aVar != null) {
            aVar.a(n02);
        }
    }

    public abstract boolean h();

    public abstract void i(Object obj);

    public void j() {
        this.f13274a = null;
        this.f13275b = null;
    }

    public abstract H k(O0[] o0Arr, n0 n0Var, D.b bVar, Y y10);

    public abstract void l(C6088c c6088c);

    public abstract void m(d0 d0Var);
}
