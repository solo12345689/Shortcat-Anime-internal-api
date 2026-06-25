package s0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6226h;
import r0.C6228j;
import s0.InterfaceC6374m1;
import s0.q1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC6374m1 {

    /* JADX INFO: renamed from: b */
    private final Path f58909b;

    /* JADX INFO: renamed from: c */
    private RectF f58910c;

    /* JADX INFO: renamed from: d */
    private float[] f58911d;

    /* JADX INFO: renamed from: e */
    private Matrix f58912e;

    public S(Path path) {
        this.f58909b = path;
    }

    private final void w(C6226h c6226h) {
        if (Float.isNaN(c6226h.i()) || Float.isNaN(c6226h.l()) || Float.isNaN(c6226h.j()) || Float.isNaN(c6226h.e())) {
            V.d("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // s0.InterfaceC6374m1
    public void C() {
        this.f58909b.rewind();
    }

    @Override // s0.InterfaceC6374m1
    public void a(float f10, float f11) {
        this.f58909b.moveTo(f10, f11);
    }

    @Override // s0.InterfaceC6374m1
    public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f58909b.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // s0.InterfaceC6374m1
    public void c(float f10, float f11) {
        this.f58909b.lineTo(f10, f11);
    }

    @Override // s0.InterfaceC6374m1
    public void close() {
        this.f58909b.close();
    }

    @Override // s0.InterfaceC6374m1
    public boolean d() {
        return this.f58909b.isConvex();
    }

    @Override // s0.InterfaceC6374m1
    public void e(C6226h c6226h, InterfaceC6374m1.b bVar) {
        if (this.f58910c == null) {
            this.f58910c = new RectF();
        }
        RectF rectF = this.f58910c;
        AbstractC5504s.e(rectF);
        rectF.set(c6226h.i(), c6226h.l(), c6226h.j(), c6226h.e());
        Path path = this.f58909b;
        RectF rectF2 = this.f58910c;
        AbstractC5504s.e(rectF2);
        path.addOval(rectF2, V.e(bVar));
    }

    @Override // s0.InterfaceC6374m1
    public void f(float f10, float f11) {
        this.f58909b.rMoveTo(f10, f11);
    }

    @Override // s0.InterfaceC6374m1
    public void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f58909b.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // s0.InterfaceC6374m1
    public C6226h getBounds() {
        if (this.f58910c == null) {
            this.f58910c = new RectF();
        }
        RectF rectF = this.f58910c;
        AbstractC5504s.e(rectF);
        this.f58909b.computeBounds(rectF, true);
        return new C6226h(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // s0.InterfaceC6374m1
    public void h(int i10) {
        this.f58909b.setFillType(AbstractC6380o1.d(i10, AbstractC6380o1.f58972a.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // s0.InterfaceC6374m1
    public void i(C6226h c6226h, InterfaceC6374m1.b bVar) {
        w(c6226h);
        if (this.f58910c == null) {
            this.f58910c = new RectF();
        }
        RectF rectF = this.f58910c;
        AbstractC5504s.e(rectF);
        rectF.set(c6226h.i(), c6226h.l(), c6226h.j(), c6226h.e());
        Path path = this.f58909b;
        RectF rectF2 = this.f58910c;
        AbstractC5504s.e(rectF2);
        path.addRect(rectF2, V.e(bVar));
    }

    @Override // s0.InterfaceC6374m1
    public boolean isEmpty() {
        return this.f58909b.isEmpty();
    }

    @Override // s0.InterfaceC6374m1
    public void j(float f10, float f11, float f12, float f13) {
        this.f58909b.quadTo(f10, f11, f12, f13);
    }

    @Override // s0.InterfaceC6374m1
    public void k(C6228j c6228j, InterfaceC6374m1.b bVar) {
        if (this.f58910c == null) {
            this.f58910c = new RectF();
        }
        RectF rectF = this.f58910c;
        AbstractC5504s.e(rectF);
        rectF.set(c6228j.e(), c6228j.g(), c6228j.f(), c6228j.a());
        if (this.f58911d == null) {
            this.f58911d = new float[8];
        }
        float[] fArr = this.f58911d;
        AbstractC5504s.e(fArr);
        fArr[0] = Float.intBitsToFloat((int) (c6228j.h() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (c6228j.h() & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (c6228j.i() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (c6228j.i() & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (c6228j.c() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (c6228j.c() & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (c6228j.b() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (c6228j.b() & 4294967295L));
        Path path = this.f58909b;
        RectF rectF2 = this.f58910c;
        AbstractC5504s.e(rectF2);
        float[] fArr2 = this.f58911d;
        AbstractC5504s.e(fArr2);
        path.addRoundRect(rectF2, fArr2, V.e(bVar));
    }

    @Override // s0.InterfaceC6374m1
    public void l(long j10) {
        Matrix matrix = this.f58912e;
        if (matrix == null) {
            this.f58912e = new Matrix();
        } else {
            AbstractC5504s.e(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f58912e;
        AbstractC5504s.e(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        Path path = this.f58909b;
        Matrix matrix3 = this.f58912e;
        AbstractC5504s.e(matrix3);
        path.transform(matrix3);
    }

    @Override // s0.InterfaceC6374m1
    public boolean m(InterfaceC6374m1 interfaceC6374m1, InterfaceC6374m1 interfaceC6374m12, int i10) {
        q1.a aVar = q1.f58979a;
        Path.Op op = q1.f(i10, aVar.a()) ? Path.Op.DIFFERENCE : q1.f(i10, aVar.b()) ? Path.Op.INTERSECT : q1.f(i10, aVar.c()) ? Path.Op.REVERSE_DIFFERENCE : q1.f(i10, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.f58909b;
        if (!(interfaceC6374m1 instanceof S)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path pathV = ((S) interfaceC6374m1).v();
        if (interfaceC6374m12 instanceof S) {
            return path.op(pathV, ((S) interfaceC6374m12).v(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // s0.InterfaceC6374m1
    public void o(float f10, float f11, float f12, float f13) {
        this.f58909b.rQuadTo(f10, f11, f12, f13);
    }

    @Override // s0.InterfaceC6374m1
    public void q(InterfaceC6374m1 interfaceC6374m1, long j10) {
        Path path = this.f58909b;
        if (!(interfaceC6374m1 instanceof S)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((S) interfaceC6374m1).v(), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    @Override // s0.InterfaceC6374m1
    public int r() {
        return this.f58909b.getFillType() == Path.FillType.EVEN_ODD ? AbstractC6380o1.f58972a.a() : AbstractC6380o1.f58972a.b();
    }

    @Override // s0.InterfaceC6374m1
    public void reset() {
        this.f58909b.reset();
    }

    @Override // s0.InterfaceC6374m1
    public void u(float f10, float f11) {
        this.f58909b.rLineTo(f10, f11);
    }

    public final Path v() {
        return this.f58909b;
    }

    public /* synthetic */ S(Path path, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Path() : path);
    }
}
