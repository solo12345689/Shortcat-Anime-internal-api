package r2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import r2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected o.a f58448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected o.a f58449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o.a f58450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o.a f58451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f58452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f58453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f58454h;

    public q() {
        ByteBuffer byteBuffer = o.f58441a;
        this.f58452f = byteBuffer;
        this.f58453g = byteBuffer;
        o.a aVar = o.a.f58442e;
        this.f58450d = aVar;
        this.f58451e = aVar;
        this.f58448b = aVar;
        this.f58449c = aVar;
    }

    @Override // r2.o
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f58453g;
        this.f58453g = o.f58441a;
        return byteBuffer;
    }

    @Override // r2.o
    public boolean b() {
        return this.f58451e != o.a.f58442e;
    }

    @Override // r2.o
    public boolean d() {
        return this.f58454h && this.f58453g == o.f58441a;
    }

    @Override // r2.o
    public final void e() {
        this.f58454h = true;
        j();
    }

    @Override // r2.o
    public final o.a f(o.a aVar) {
        this.f58450d = aVar;
        this.f58451e = h(aVar);
        return b() ? this.f58451e : o.a.f58442e;
    }

    @Override // r2.o
    public final void flush() {
        this.f58453g = o.f58441a;
        this.f58454h = false;
        this.f58448b = this.f58450d;
        this.f58449c = this.f58451e;
        i();
    }

    protected final boolean g() {
        return this.f58453g.hasRemaining();
    }

    protected abstract o.a h(o.a aVar);

    protected final ByteBuffer l(int i10) {
        if (this.f58452f.capacity() < i10) {
            this.f58452f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f58452f.clear();
        }
        ByteBuffer byteBuffer = this.f58452f;
        this.f58453g = byteBuffer;
        return byteBuffer;
    }

    @Override // r2.o
    public final void reset() {
        ByteBuffer byteBuffer = o.f58441a;
        this.f58453g = byteBuffer;
        this.f58454h = false;
        this.f58452f = byteBuffer;
        o.a aVar = o.a.f58442e;
        this.f58450d = aVar;
        this.f58451e = aVar;
        this.f58448b = aVar;
        this.f58449c = aVar;
        k();
    }

    protected void i() {
    }

    protected void j() {
    }

    protected void k() {
    }
}
