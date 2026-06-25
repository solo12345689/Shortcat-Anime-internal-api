package s0;

import android.graphics.Shader;
import kotlin.jvm.internal.AbstractC5504s;
import r0.C6230l;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class A1 extends AbstractC6358h0 {
    private long createdSize;
    private M1 internalTransformShader;
    private float[] transform;

    public A1() {
        super(null);
        this.createdSize = C6230l.f58350b.a();
    }

    private final M1 a() {
        M1 m12 = this.internalTransformShader;
        if (m12 != null) {
            return m12;
        }
        M1 m13 = new M1();
        this.internalTransformShader = m13;
        return m13;
    }

    @Override // s0.AbstractC6358h0
    /* JADX INFO: renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public final void mo965applyToPq9zytI(long j10, InterfaceC6368k1 interfaceC6368k1, float f10) {
        M1 m1A = this.internalTransformShader;
        if (m1A == null || !C6230l.f(this.createdSize, j10)) {
            if (C6230l.k(j10)) {
                this.internalTransformShader = null;
                this.createdSize = C6230l.f58350b.a();
                m1A = null;
            } else {
                m1A = a();
                float[] fArr = this.transform;
                if (fArr != null) {
                    m1A.d(fArr);
                }
                m1A.c(mo483createShaderuvyYCjk(j10));
                this.internalTransformShader = m1A;
                this.createdSize = j10;
            }
        }
        long jB = interfaceC6368k1.b();
        C6385r0.a aVar = C6385r0.f58985b;
        if (!C6385r0.s(jB, aVar.a())) {
            interfaceC6368k1.p(aVar.a());
        }
        if (!AbstractC5504s.c(interfaceC6368k1.w(), m1A != null ? m1A.a() : null)) {
            interfaceC6368k1.v(m1A != null ? m1A.a() : null);
        }
        if (interfaceC6368k1.a() == f10) {
            return;
        }
        interfaceC6368k1.e(f10);
    }

    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public abstract Shader mo483createShaderuvyYCjk(long j10);

    /* JADX INFO: renamed from: getTransform-3i98HWw, reason: not valid java name */
    public final float[] m966getTransform3i98HWw() {
        return this.transform;
    }

    /* JADX INFO: renamed from: setTransform-Q8lPUPs, reason: not valid java name */
    public final void m967setTransformQ8lPUPs(float[] fArr) {
        this.transform = fArr;
        M1 m12 = this.internalTransformShader;
        if (m12 != null) {
            m12.d(fArr);
        }
    }
}
