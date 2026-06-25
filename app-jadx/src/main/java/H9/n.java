package H9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f8299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f8300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f8305g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f8306h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8307i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f8308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f8309d;

        a(List list, Matrix matrix) {
            this.f8308c = list;
            this.f8309d = matrix;
        }

        @Override // H9.n.g
        public void b(Matrix matrix, G9.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f8308c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(this.f8309d, aVar, i10, canvas);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f8311c;

        public b(d dVar) {
            this.f8311c = dVar;
        }

        @Override // H9.n.g
        public void b(Matrix matrix, G9.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f8311c.k(), this.f8311c.o(), this.f8311c.l(), this.f8311c.j()), i10, this.f8311c.m(), this.f8311c.n());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f8312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f8313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f8314e;

        public c(e eVar, float f10, float f11) {
            this.f8312c = eVar;
            this.f8313d = f10;
            this.f8314e = f11;
        }

        @Override // H9.n.g
        public void b(Matrix matrix, G9.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f8312c.f8323c - this.f8314e, this.f8312c.f8322b - this.f8313d), 0.0f);
            this.f8326a.set(matrix);
            this.f8326a.preTranslate(this.f8313d, this.f8314e);
            this.f8326a.preRotate(c());
            aVar.b(canvas, this.f8326a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f8312c.f8323c - this.f8314e) / (this.f8312c.f8322b - this.f8313d)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f8315h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f8318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f8320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f8321g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f8319e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f8316b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f8318d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f8320f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f8321g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f8317c;
        }

        private void p(float f10) {
            this.f8319e = f10;
        }

        private void q(float f10) {
            this.f8316b = f10;
        }

        private void r(float f10) {
            this.f8318d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f8320f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f8321g = f10;
        }

        private void u(float f10) {
            this.f8317c = f10;
        }

        @Override // H9.n.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f8324a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f8315h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f8322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f8323c;

        @Override // H9.n.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f8324a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f8322b, this.f8323c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f8324a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f8325b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f8326a = new Matrix();

        g() {
        }

        public final void a(G9.a aVar, int i10, Canvas canvas) {
            b(f8325b, aVar, i10, canvas);
        }

        public abstract void b(Matrix matrix, G9.a aVar, int i10, Canvas canvas);
    }

    public n() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float fG = ((f10 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f8306h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f8306h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f8303e;
    }

    private float h() {
        return this.f8304f;
    }

    private void p(float f10) {
        this.f8303e = f10;
    }

    private void q(float f10) {
        this.f8304f = f10;
    }

    private void r(float f10) {
        this.f8301c = f10;
    }

    private void s(float f10) {
        this.f8302d = f10;
    }

    private void t(float f10) {
        this.f8299a = f10;
    }

    private void u(float f10) {
        this.f8300b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f8305g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f8305g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f8305g.get(i10)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f8307i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f8306h), new Matrix(matrix));
    }

    float i() {
        return this.f8301c;
    }

    float j() {
        return this.f8302d;
    }

    float k() {
        return this.f8299a;
    }

    float l() {
        return this.f8300b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f8322b = f10;
        eVar.f8323c = f11;
        this.f8305g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f8305g.clear();
        this.f8306h.clear();
        this.f8307i = false;
    }
}
