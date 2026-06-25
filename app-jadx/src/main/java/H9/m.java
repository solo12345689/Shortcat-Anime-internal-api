package H9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n[] f8281a = new n[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f8282b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f8283c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f8284d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f8285e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f8286f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n f8287g = new n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f8288h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f8289i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f8290j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f8291k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8292l = true;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final m f8293a = new m();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(n nVar, Matrix matrix, int i10);

        void b(n nVar, Matrix matrix, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f8294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f8295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f8296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f8297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f8298e;

        c(l lVar, float f10, RectF rectF, b bVar, Path path) {
            this.f8297d = bVar;
            this.f8294a = lVar;
            this.f8298e = f10;
            this.f8296c = rectF;
            this.f8295b = path;
        }
    }

    public m() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f8281a[i10] = new n();
            this.f8282b[i10] = new Matrix();
            this.f8283c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f8288h[0] = this.f8281a[i10].k();
        this.f8288h[1] = this.f8281a[i10].l();
        this.f8282b[i10].mapPoints(this.f8288h);
        if (i10 == 0) {
            Path path = cVar.f8295b;
            float[] fArr = this.f8288h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f8295b;
            float[] fArr2 = this.f8288h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f8281a[i10].d(this.f8282b[i10], cVar.f8295b);
        b bVar = cVar.f8297d;
        if (bVar != null) {
            bVar.b(this.f8281a[i10], this.f8282b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f8288h[0] = this.f8281a[i10].i();
        this.f8288h[1] = this.f8281a[i10].j();
        this.f8282b[i10].mapPoints(this.f8288h);
        this.f8289i[0] = this.f8281a[i11].k();
        this.f8289i[1] = this.f8281a[i11].l();
        this.f8282b[i11].mapPoints(this.f8289i);
        float f10 = this.f8288h[0];
        float[] fArr = this.f8289i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fH = h(cVar.f8296c, i10);
        this.f8287g.n(0.0f, 0.0f);
        g gVarI = i(i10, cVar.f8294a);
        gVarI.b(fMax, fH, cVar.f8298e, this.f8287g);
        this.f8290j.reset();
        this.f8287g.d(this.f8283c[i10], this.f8290j);
        if (this.f8292l && (gVarI.a() || k(this.f8290j, i10) || k(this.f8290j, i11))) {
            Path path = this.f8290j;
            path.op(path, this.f8286f, Path.Op.DIFFERENCE);
            this.f8288h[0] = this.f8287g.k();
            this.f8288h[1] = this.f8287g.l();
            this.f8283c[i10].mapPoints(this.f8288h);
            Path path2 = this.f8285e;
            float[] fArr2 = this.f8288h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f8287g.d(this.f8283c[i10], this.f8285e);
        } else {
            this.f8287g.d(this.f8283c[i10], cVar.f8295b);
        }
        b bVar = cVar.f8297d;
        if (bVar != null) {
            bVar.a(this.f8287g, this.f8283c[i10], i10);
        }
    }

    private void e(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private e g(int i10, l lVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? lVar.s() : lVar.q() : lVar.i() : lVar.k();
    }

    private float h(RectF rectF, int i10) {
        float[] fArr = this.f8288h;
        n nVar = this.f8281a[i10];
        fArr[0] = nVar.f8301c;
        fArr[1] = nVar.f8302d;
        this.f8282b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f8288h[0]) : Math.abs(rectF.centerY() - this.f8288h[1]);
    }

    private g i(int i10, l lVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? lVar.o() : lVar.p() : lVar.n() : lVar.h();
    }

    public static m j() {
        return a.f8293a;
    }

    private boolean k(Path path, int i10) {
        this.f8291k.reset();
        this.f8281a[i10].d(this.f8282b[i10], this.f8291k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f8291k.computeBounds(rectF, true);
        path.op(this.f8291k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void l(c cVar, int i10, float[] fArr) {
        g(i10, cVar.f8294a).b(this.f8281a[i10], 90.0f, cVar.f8298e, cVar.f8296c, fArr == null ? f(i10, cVar.f8294a) : new H9.c(fArr[i10]));
        float fA = a(i10);
        this.f8282b[i10].reset();
        e(i10, cVar.f8296c, this.f8284d);
        Matrix matrix = this.f8282b[i10];
        PointF pointF = this.f8284d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f8282b[i10].preRotate(fA);
    }

    private void m(int i10) {
        this.f8288h[0] = this.f8281a[i10].i();
        this.f8288h[1] = this.f8281a[i10].j();
        this.f8282b[i10].mapPoints(this.f8288h);
        float fA = a(i10);
        this.f8283c[i10].reset();
        Matrix matrix = this.f8283c[i10];
        float[] fArr = this.f8288h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f8283c[i10].preRotate(fA);
    }

    public void d(l lVar, float[] fArr, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f8285e.rewind();
        this.f8286f.rewind();
        this.f8286f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(lVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            l(cVar, i10, fArr);
            m(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f8285e.close();
        if (this.f8285e.isEmpty()) {
            return;
        }
        path.op(this.f8285e, Path.Op.UNION);
    }

    d f(int i10, l lVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? lVar.t() : lVar.r() : lVar.j() : lVar.l();
    }
}
