package s0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import i1.C5021n;
import kotlin.jvm.internal.AbstractC5504s;
import r0.C6226h;

/* JADX INFO: renamed from: s0.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6335D implements InterfaceC6364j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f58872a = E.f58875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f58873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f58874c;

    public final Canvas a() {
        return this.f58872a;
    }

    @Override // s0.InterfaceC6364j0
    public void b(InterfaceC6374m1 interfaceC6374m1, int i10) {
        Canvas canvas = this.f58872a;
        if (!(interfaceC6374m1 instanceof S)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((S) interfaceC6374m1).v(), z(i10));
    }

    @Override // s0.InterfaceC6364j0
    public void c(float f10, float f11, float f12, float f13, int i10) {
        this.f58872a.clipRect(f10, f11, f12, f13, z(i10));
    }

    @Override // s0.InterfaceC6364j0
    public void d(float f10, float f11) {
        this.f58872a.translate(f10, f11);
    }

    @Override // s0.InterfaceC6364j0
    public void e(float f10, float f11) {
        this.f58872a.scale(f10, f11);
    }

    @Override // s0.InterfaceC6364j0
    public void f(float f10, float f11, float f12, float f13, float f14, float f15, InterfaceC6368k1 interfaceC6368k1) {
        this.f58872a.drawRoundRect(f10, f11, f12, f13, f14, f15, interfaceC6368k1.u());
    }

    @Override // s0.InterfaceC6364j0
    public void g(long j10, long j11, InterfaceC6368k1 interfaceC6368k1) {
        this.f58872a.drawLine(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), interfaceC6368k1.u());
    }

    @Override // s0.InterfaceC6364j0
    public void i(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, InterfaceC6368k1 interfaceC6368k1) {
        this.f58872a.drawArc(f10, f11, f12, f13, f14, f15, z10, interfaceC6368k1.u());
    }

    @Override // s0.InterfaceC6364j0
    public void k() {
        this.f58872a.restore();
    }

    @Override // s0.InterfaceC6364j0
    public void l(InterfaceC6341b1 interfaceC6341b1, long j10, long j11, long j12, long j13, InterfaceC6368k1 interfaceC6368k1) {
        if (this.f58873b == null) {
            this.f58873b = new Rect();
            this.f58874c = new Rect();
        }
        Canvas canvas = this.f58872a;
        Bitmap bitmapB = O.b(interfaceC6341b1);
        Rect rect = this.f58873b;
        AbstractC5504s.e(rect);
        rect.left = C5021n.k(j10);
        rect.top = C5021n.l(j10);
        rect.right = C5021n.k(j10) + ((int) (j11 >> 32));
        rect.bottom = C5021n.l(j10) + ((int) (j11 & 4294967295L));
        Td.L l10 = Td.L.f17438a;
        Rect rect2 = this.f58874c;
        AbstractC5504s.e(rect2);
        rect2.left = C5021n.k(j12);
        rect2.top = C5021n.l(j12);
        rect2.right = C5021n.k(j12) + ((int) (j13 >> 32));
        rect2.bottom = C5021n.l(j12) + ((int) (j13 & 4294967295L));
        canvas.drawBitmap(bitmapB, rect, rect2, interfaceC6368k1.u());
    }

    @Override // s0.InterfaceC6364j0
    public void m() {
        C6373m0.f58962a.a(this.f58872a, true);
    }

    @Override // s0.InterfaceC6364j0
    public void o(float f10) {
        this.f58872a.rotate(f10);
    }

    @Override // s0.InterfaceC6364j0
    public void p() {
        this.f58872a.save();
    }

    @Override // s0.InterfaceC6364j0
    public void q() {
        C6373m0.f58962a.a(this.f58872a, false);
    }

    @Override // s0.InterfaceC6364j0
    public void r(float[] fArr) {
        if (AbstractC6359h1.a(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        P.a(matrix, fArr);
        this.f58872a.concat(matrix);
    }

    @Override // s0.InterfaceC6364j0
    public void s(C6226h c6226h, InterfaceC6368k1 interfaceC6368k1) {
        this.f58872a.saveLayer(c6226h.i(), c6226h.l(), c6226h.j(), c6226h.e(), interfaceC6368k1.u(), 31);
    }

    @Override // s0.InterfaceC6364j0
    public void t(InterfaceC6374m1 interfaceC6374m1, InterfaceC6368k1 interfaceC6368k1) {
        Canvas canvas = this.f58872a;
        if (!(interfaceC6374m1 instanceof S)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((S) interfaceC6374m1).v(), interfaceC6368k1.u());
    }

    @Override // s0.InterfaceC6364j0
    public void u(long j10, float f10, InterfaceC6368k1 interfaceC6368k1) {
        this.f58872a.drawCircle(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f10, interfaceC6368k1.u());
    }

    @Override // s0.InterfaceC6364j0
    public void w(float f10, float f11, float f12, float f13, InterfaceC6368k1 interfaceC6368k1) {
        this.f58872a.drawRect(f10, f11, f12, f13, interfaceC6368k1.u());
    }

    @Override // s0.InterfaceC6364j0
    public void x(InterfaceC6341b1 interfaceC6341b1, long j10, InterfaceC6368k1 interfaceC6368k1) {
        this.f58872a.drawBitmap(O.b(interfaceC6341b1), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), interfaceC6368k1.u());
    }

    public final void y(Canvas canvas) {
        this.f58872a = canvas;
    }

    public final Region.Op z(int i10) {
        return AbstractC6384q0.d(i10, AbstractC6384q0.f58976a.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }
}
