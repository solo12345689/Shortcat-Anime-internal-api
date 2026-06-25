package u0;

import r0.C6230l;
import s0.AbstractC6350e1;
import s0.InterfaceC6364j0;
import s0.InterfaceC6374m1;

/* JADX INFO: renamed from: u0.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6707b {

    /* JADX INFO: renamed from: u0.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC6713h {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6709d f61108a;

        a(InterfaceC6709d interfaceC6709d) {
            this.f61108a = interfaceC6709d;
        }

        @Override // u0.InterfaceC6713h
        public void a(float[] fArr) {
            this.f61108a.b().r(fArr);
        }

        @Override // u0.InterfaceC6713h
        public void b(InterfaceC6374m1 interfaceC6374m1, int i10) {
            this.f61108a.b().b(interfaceC6374m1, i10);
        }

        @Override // u0.InterfaceC6713h
        public void c(float f10, float f11, float f12, float f13, int i10) {
            this.f61108a.b().c(f10, f11, f12, f13, i10);
        }

        @Override // u0.InterfaceC6713h
        public void d(float f10, float f11) {
            this.f61108a.b().d(f10, f11);
        }

        @Override // u0.InterfaceC6713h
        public void f(float f10, float f11, long j10) {
            InterfaceC6364j0 interfaceC6364j0B = this.f61108a.b();
            int i10 = (int) (j10 >> 32);
            int i11 = (int) (j10 & 4294967295L);
            interfaceC6364j0B.d(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
            interfaceC6364j0B.e(f10, f11);
            interfaceC6364j0B.d(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        }

        @Override // u0.InterfaceC6713h
        public void g(float f10, long j10) {
            InterfaceC6364j0 interfaceC6364j0B = this.f61108a.b();
            int i10 = (int) (j10 >> 32);
            int i11 = (int) (j10 & 4294967295L);
            interfaceC6364j0B.d(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
            interfaceC6364j0B.o(f10);
            interfaceC6364j0B.d(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        }

        @Override // u0.InterfaceC6713h
        public void i(float f10, float f11, float f12, float f13) {
            InterfaceC6364j0 interfaceC6364j0B = this.f61108a.b();
            InterfaceC6709d interfaceC6709d = this.f61108a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j() >> 32)) - (f12 + f10);
            long jD = C6230l.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j() & 4294967295L)) - (f13 + f11))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
            if (!(Float.intBitsToFloat((int) (jD >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jD & 4294967295L)) >= 0.0f)) {
                AbstractC6350e1.a("Width and height must be greater than or equal to zero");
            }
            interfaceC6709d.e(jD);
            interfaceC6364j0B.d(f10, f11);
        }

        public long j() {
            return this.f61108a.f();
        }
    }

    public static final InterfaceC6713h b(InterfaceC6709d interfaceC6709d) {
        return new a(interfaceC6709d);
    }
}
