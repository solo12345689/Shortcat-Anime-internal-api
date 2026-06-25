package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import c2.C3063a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f29621d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f29623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f29624c = 0;

    o(m mVar, int i10) {
        this.f29623b = mVar;
        this.f29622a = i10;
    }

    private C3063a g() {
        ThreadLocal threadLocal = f29621d;
        C3063a c3063a = (C3063a) threadLocal.get();
        if (c3063a == null) {
            c3063a = new C3063a();
            threadLocal.set(c3063a);
        }
        this.f29623b.d().j(c3063a, this.f29622a);
        return c3063a;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface typefaceG = this.f29623b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f29623b.c(), this.f29622a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f29624c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f29624c & 4) > 0;
    }

    public void l(boolean z10) {
        int iD = d();
        if (z10) {
            this.f29624c = iD | 4;
        } else {
            this.f29624c = iD;
        }
    }

    public void m(boolean z10) {
        int i10 = this.f29624c & 4;
        this.f29624c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
