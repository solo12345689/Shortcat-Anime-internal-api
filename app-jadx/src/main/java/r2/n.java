package r2;

import P9.AbstractC2011u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import r2.o;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2011u f58435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f58436b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f58437c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o.a f58438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o.a f58439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f58440f;

    public n(AbstractC2011u abstractC2011u) {
        this.f58435a = abstractC2011u;
        o.a aVar = o.a.f58442e;
        this.f58438d = aVar;
        this.f58439e = aVar;
        this.f58440f = false;
    }

    private int c() {
        return this.f58437c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i10 = 0;
            while (i10 <= c()) {
                if (!this.f58437c[i10].hasRemaining()) {
                    o oVar = (o) this.f58436b.get(i10);
                    if (!oVar.d()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f58437c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : o.f58441a;
                        long jRemaining = byteBuffer2.remaining();
                        oVar.c(byteBuffer2);
                        this.f58437c[i10] = oVar.a();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f58437c[i10].hasRemaining();
                    } else if (!this.f58437c[i10].hasRemaining() && i10 < c()) {
                        ((o) this.f58436b.get(i10 + 1)).e();
                    }
                }
                i10++;
            }
        }
    }

    public o.a a(o.a aVar) throws o.b {
        if (aVar.equals(o.a.f58442e)) {
            throw new o.b(aVar);
        }
        for (int i10 = 0; i10 < this.f58435a.size(); i10++) {
            o oVar = (o) this.f58435a.get(i10);
            o.a aVarF = oVar.f(aVar);
            if (oVar.b()) {
                AbstractC6614a.g(!aVarF.equals(o.a.f58442e));
                aVar = aVarF;
            }
        }
        this.f58439e = aVar;
        return aVar;
    }

    public void b() {
        this.f58436b.clear();
        this.f58438d = this.f58439e;
        this.f58440f = false;
        for (int i10 = 0; i10 < this.f58435a.size(); i10++) {
            o oVar = (o) this.f58435a.get(i10);
            oVar.flush();
            if (oVar.b()) {
                this.f58436b.add(oVar);
            }
        }
        this.f58437c = new ByteBuffer[this.f58436b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f58437c[i11] = ((o) this.f58436b.get(i11)).a();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return o.f58441a;
        }
        ByteBuffer byteBuffer = this.f58437c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(o.f58441a);
        return this.f58437c[c()];
    }

    public boolean e() {
        return this.f58440f && ((o) this.f58436b.get(c())).d() && !this.f58437c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f58435a.size() != nVar.f58435a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f58435a.size(); i10++) {
            if (this.f58435a.get(i10) != nVar.f58435a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f58436b.isEmpty();
    }

    public void h() {
        if (!f() || this.f58440f) {
            return;
        }
        this.f58440f = true;
        ((o) this.f58436b.get(0)).e();
    }

    public int hashCode() {
        return this.f58435a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f58440f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i10 = 0; i10 < this.f58435a.size(); i10++) {
            o oVar = (o) this.f58435a.get(i10);
            oVar.flush();
            oVar.reset();
        }
        this.f58437c = new ByteBuffer[0];
        o.a aVar = o.a.f58442e;
        this.f58438d = aVar;
        this.f58439e = aVar;
        this.f58440f = false;
    }
}
