package tg;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C6693s extends a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a0 f61074f;

    public C6693s(a0 delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f61074f = delegate;
    }

    @Override // tg.a0
    public a0 a() {
        return this.f61074f.a();
    }

    @Override // tg.a0
    public a0 b() {
        return this.f61074f.b();
    }

    @Override // tg.a0
    public long c() {
        return this.f61074f.c();
    }

    @Override // tg.a0
    public a0 d(long j10) {
        return this.f61074f.d(j10);
    }

    @Override // tg.a0
    public boolean e() {
        return this.f61074f.e();
    }

    @Override // tg.a0
    public void f() throws InterruptedIOException {
        this.f61074f.f();
    }

    @Override // tg.a0
    public a0 g(long j10, TimeUnit unit) {
        AbstractC5504s.h(unit, "unit");
        return this.f61074f.g(j10, unit);
    }

    @Override // tg.a0
    public long h() {
        return this.f61074f.h();
    }

    public final a0 i() {
        return this.f61074f;
    }

    public final C6693s j(a0 delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f61074f = delegate;
        return this;
    }
}
