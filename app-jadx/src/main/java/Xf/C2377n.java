package Xf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Xf.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C2377n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2385w f22003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22004b;

    public C2377n(InterfaceC2385w writer) {
        AbstractC5504s.h(writer, "writer");
        this.f22003a = writer;
        this.f22004b = true;
    }

    public final boolean a() {
        return this.f22004b;
    }

    public void b() {
        this.f22004b = true;
    }

    public void c() {
        this.f22004b = false;
    }

    public void d() {
        this.f22004b = false;
    }

    public void e(byte b10) {
        this.f22003a.writeLong(b10);
    }

    public final void f(char c10) {
        this.f22003a.a(c10);
    }

    public void g(double d10) {
        this.f22003a.c(String.valueOf(d10));
    }

    public void h(float f10) {
        this.f22003a.c(String.valueOf(f10));
    }

    public void i(int i10) {
        this.f22003a.writeLong(i10);
    }

    public void j(long j10) {
        this.f22003a.writeLong(j10);
    }

    public final void k(String v10) {
        AbstractC5504s.h(v10, "v");
        this.f22003a.c(v10);
    }

    public void l(short s10) {
        this.f22003a.writeLong(s10);
    }

    public void m(boolean z10) {
        this.f22003a.c(String.valueOf(z10));
    }

    public void n(String value) {
        AbstractC5504s.h(value, "value");
        this.f22003a.b(value);
    }

    protected final void o(boolean z10) {
        this.f22004b = z10;
    }

    public void p() {
    }

    public void q() {
    }
}
