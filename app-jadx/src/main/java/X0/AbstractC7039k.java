package x0;

import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import java.util.List;
import s0.InterfaceC6374m1;
import x0.AbstractC7036h;

/* JADX INFO: renamed from: x0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7039k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f63554a = new float[0];

    private static final void a(InterfaceC6374m1 interfaceC6374m1, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d18 * d19) / 3.141592653589793d));
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double d20 = -d12;
        double d21 = d20 * dCos;
        double d22 = d13 * dSin;
        double d23 = (d21 * dSin2) - (d22 * dCos2);
        double d24 = d20 * dSin;
        double d25 = d13 * dCos;
        double d26 = (dSin2 * d24) + (dCos2 * d25);
        double d27 = d18 / ((double) iCeil);
        double d28 = d26;
        double d29 = d23;
        int i10 = 0;
        double d30 = d14;
        double d31 = d15;
        double d32 = d17;
        while (i10 < iCeil) {
            double d33 = d32 + d27;
            double dSin3 = Math.sin(d33);
            double dCos3 = Math.cos(d33);
            int i11 = i10;
            double d34 = (d10 + ((d12 * dCos) * dCos3)) - (d22 * dSin3);
            double d35 = d19;
            double d36 = d11 + (d12 * dSin * dCos3) + (d25 * dSin3);
            double d37 = (d21 * dSin3) - (d22 * dCos3);
            double d38 = (dSin3 * d24) + (dCos3 * d25);
            double d39 = d33 - d32;
            int i12 = iCeil;
            double dTan = Math.tan(d39 / ((double) 2));
            double dSin4 = (Math.sin(d39) * (Math.sqrt(d35 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            interfaceC6374m1.b((float) (d30 + (d29 * dSin4)), (float) (d31 + (d28 * dSin4)), (float) (d34 - (dSin4 * d37)), (float) (d36 - (dSin4 * d38)), (float) d34, (float) d36);
            dSin = dSin;
            d27 = d27;
            d30 = d34;
            d31 = d36;
            i10 = i11 + 1;
            d32 = d33;
            d28 = d38;
            iCeil = i12;
            d29 = d37;
            dCos = dCos;
            d19 = d35;
        }
    }

    private static final void b(InterfaceC6374m1 interfaceC6374m1, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = (d16 / ((double) SensibleDefaults.X_OFFSET)) * 3.141592653589793d;
        double dCos = Math.cos(d19);
        double dSin = Math.sin(d19);
        double d20 = ((d10 * dCos) + (d11 * dSin)) / d14;
        double d21 = (((-d10) * dSin) + (d11 * dCos)) / d15;
        double d22 = ((d12 * dCos) + (d13 * dSin)) / d14;
        double d23 = (((-d12) * dSin) + (d13 * dCos)) / d15;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d24 * d24) + (d25 * d25);
        if (d29 == 0.0d) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d29) / 1.99999d);
            b(interfaceC6374m1, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d30);
        double d31 = d24 * dSqrt2;
        double d32 = dSqrt2 * d25;
        if (z10 == z11) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double dAtan2 = Math.atan2(d21 - d18, d20 - d17);
        double dAtan22 = Math.atan2(d23 - d18, d22 - d17) - dAtan2;
        if (z11 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d33 = d17 * d14;
        double d34 = d18 * d15;
        a(interfaceC6374m1, (d33 * dCos) - (d34 * dSin), (d33 * dSin) + (d34 * dCos), d14, d15, d10, d11, d19, dAtan2, dAtan22);
    }

    public static final InterfaceC6374m1 c(List list, InterfaceC6374m1 interfaceC6374m1) {
        int i10;
        float f10;
        int i11;
        AbstractC7036h abstractC7036h;
        float f11;
        float f12;
        float fC;
        float fD;
        float f13;
        float f14;
        float f15;
        float f16;
        float fC2;
        float fE;
        float f17;
        List list2 = list;
        InterfaceC6374m1 interfaceC6374m12 = interfaceC6374m1;
        int iR = interfaceC6374m12.r();
        interfaceC6374m12.C();
        interfaceC6374m12.h(iR);
        AbstractC7036h abstractC7036h2 = list2.isEmpty() ? AbstractC7036h.b.f63501c : (AbstractC7036h) list2.get(0);
        int size = list2.size();
        float f18 = 0.0f;
        int i12 = 0;
        float fC3 = 0.0f;
        float fD2 = 0.0f;
        float fC4 = 0.0f;
        float fD3 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        while (i12 < size) {
            AbstractC7036h abstractC7036h3 = (AbstractC7036h) list2.get(i12);
            if (abstractC7036h3 instanceof AbstractC7036h.b) {
                interfaceC6374m12.close();
                i10 = size;
                f10 = f18;
                i11 = i12;
                abstractC7036h = abstractC7036h3;
                fC3 = f19;
                fC4 = fC3;
                fD2 = f20;
            } else {
                if (abstractC7036h3 instanceof AbstractC7036h.n) {
                    AbstractC7036h.n nVar = (AbstractC7036h.n) abstractC7036h3;
                    fC4 += nVar.c();
                    fD3 += nVar.d();
                    interfaceC6374m12.f(nVar.c(), nVar.d());
                    i10 = size;
                    f10 = f18;
                    i11 = i12;
                    f19 = fC4;
                    f20 = fD3;
                } else {
                    if (abstractC7036h3 instanceof AbstractC7036h.f) {
                        AbstractC7036h.f fVar = (AbstractC7036h.f) abstractC7036h3;
                        float fC5 = fVar.c();
                        float fD4 = fVar.d();
                        interfaceC6374m12.a(fVar.c(), fVar.d());
                        fC4 = fC5;
                        f19 = fC4;
                        fD3 = fD4;
                        f20 = fD3;
                    } else {
                        if (abstractC7036h3 instanceof AbstractC7036h.m) {
                            AbstractC7036h.m mVar = (AbstractC7036h.m) abstractC7036h3;
                            interfaceC6374m12.u(mVar.c(), mVar.d());
                            fC4 += mVar.c();
                            f14 = mVar.d();
                        } else {
                            if (abstractC7036h3 instanceof AbstractC7036h.e) {
                                AbstractC7036h.e eVar = (AbstractC7036h.e) abstractC7036h3;
                                interfaceC6374m12.c(eVar.c(), eVar.d());
                                fD = eVar.c();
                                f13 = eVar.d();
                            } else if (abstractC7036h3 instanceof AbstractC7036h.l) {
                                AbstractC7036h.l lVar = (AbstractC7036h.l) abstractC7036h3;
                                interfaceC6374m12.u(lVar.c(), f18);
                                fC4 += lVar.c();
                            } else if (abstractC7036h3 instanceof AbstractC7036h.d) {
                                AbstractC7036h.d dVar = (AbstractC7036h.d) abstractC7036h3;
                                interfaceC6374m12.c(dVar.c(), fD3);
                                fC4 = dVar.c();
                            } else if (abstractC7036h3 instanceof AbstractC7036h.r) {
                                AbstractC7036h.r rVar = (AbstractC7036h.r) abstractC7036h3;
                                interfaceC6374m12.u(f18, rVar.c());
                                f14 = rVar.c();
                            } else if (abstractC7036h3 instanceof AbstractC7036h.s) {
                                AbstractC7036h.s sVar = (AbstractC7036h.s) abstractC7036h3;
                                interfaceC6374m12.c(fC4, sVar.c());
                                fD3 = sVar.c();
                            } else {
                                if (abstractC7036h3 instanceof AbstractC7036h.k) {
                                    AbstractC7036h.k kVar = (AbstractC7036h.k) abstractC7036h3;
                                    interfaceC6374m12.g(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
                                    fC2 = kVar.d() + fC4;
                                    fE = kVar.g() + fD3;
                                    fC4 += kVar.e();
                                    f17 = kVar.h();
                                } else {
                                    if (abstractC7036h3 instanceof AbstractC7036h.c) {
                                        AbstractC7036h.c cVar = (AbstractC7036h.c) abstractC7036h3;
                                        interfaceC6374m1.b(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
                                        float fD5 = cVar.d();
                                        float fG = cVar.g();
                                        float fE2 = cVar.e();
                                        float fH = cVar.h();
                                        fC4 = fE2;
                                        fD3 = fH;
                                        i10 = size;
                                        f10 = f18;
                                        i11 = i12;
                                        abstractC7036h = abstractC7036h3;
                                        fC3 = fD5;
                                        fD2 = fG;
                                    } else if (abstractC7036h3 instanceof AbstractC7036h.p) {
                                        if (abstractC7036h2.a()) {
                                            float f21 = fC4 - fC3;
                                            f16 = fD3 - fD2;
                                            f15 = f21;
                                        } else {
                                            f15 = f18;
                                            f16 = f15;
                                        }
                                        AbstractC7036h.p pVar = (AbstractC7036h.p) abstractC7036h3;
                                        interfaceC6374m1.g(f15, f16, pVar.c(), pVar.e(), pVar.d(), pVar.f());
                                        fC2 = pVar.c() + fC4;
                                        fE = pVar.e() + fD3;
                                        fC4 += pVar.d();
                                        f17 = pVar.f();
                                    } else {
                                        if (abstractC7036h3 instanceof AbstractC7036h.C0958h) {
                                            if (abstractC7036h2.a()) {
                                                float f22 = 2;
                                                fC4 = (fC4 * f22) - fC3;
                                                fD3 = (f22 * fD3) - fD2;
                                            }
                                            AbstractC7036h.C0958h c0958h = (AbstractC7036h.C0958h) abstractC7036h3;
                                            interfaceC6374m1.b(fC4, fD3, c0958h.c(), c0958h.e(), c0958h.d(), c0958h.f());
                                            fC = c0958h.c();
                                            float fE3 = c0958h.e();
                                            float fD6 = c0958h.d();
                                            float f23 = c0958h.f();
                                            fC4 = fD6;
                                            fD3 = f23;
                                            i10 = size;
                                            f10 = f18;
                                            i11 = i12;
                                            abstractC7036h = abstractC7036h3;
                                            fD2 = fE3;
                                        } else if (abstractC7036h3 instanceof AbstractC7036h.o) {
                                            AbstractC7036h.o oVar = (AbstractC7036h.o) abstractC7036h3;
                                            interfaceC6374m1.o(oVar.c(), oVar.e(), oVar.d(), oVar.f());
                                            fC3 = oVar.c() + fC4;
                                            fD2 = oVar.e() + fD3;
                                            fC4 += oVar.d();
                                            f14 = oVar.f();
                                        } else if (abstractC7036h3 instanceof AbstractC7036h.g) {
                                            AbstractC7036h.g gVar = (AbstractC7036h.g) abstractC7036h3;
                                            interfaceC6374m1.j(gVar.c(), gVar.e(), gVar.d(), gVar.f());
                                            fC3 = gVar.c();
                                            fD2 = gVar.e();
                                            fD = gVar.d();
                                            f13 = gVar.f();
                                        } else if (abstractC7036h3 instanceof AbstractC7036h.q) {
                                            if (abstractC7036h2.b()) {
                                                f11 = fC4 - fC3;
                                                f12 = fD3 - fD2;
                                            } else {
                                                f11 = f18;
                                                f12 = f11;
                                            }
                                            AbstractC7036h.q qVar = (AbstractC7036h.q) abstractC7036h3;
                                            interfaceC6374m1.o(f11, f12, qVar.c(), qVar.d());
                                            fC = f11 + fC4;
                                            float f24 = f12 + fD3;
                                            fC4 += qVar.c();
                                            fD3 += qVar.d();
                                            fD2 = f24;
                                            i10 = size;
                                            f10 = f18;
                                            i11 = i12;
                                            abstractC7036h = abstractC7036h3;
                                        } else if (abstractC7036h3 instanceof AbstractC7036h.i) {
                                            if (abstractC7036h2.b()) {
                                                float f25 = 2;
                                                fC4 = (fC4 * f25) - fC3;
                                                fD3 = (f25 * fD3) - fD2;
                                            }
                                            AbstractC7036h.i iVar = (AbstractC7036h.i) abstractC7036h3;
                                            interfaceC6374m1.j(fC4, fD3, iVar.c(), iVar.d());
                                            float f26 = fC4;
                                            fC4 = iVar.c();
                                            fC3 = f26;
                                            i10 = size;
                                            f10 = f18;
                                            i11 = i12;
                                            fD2 = fD3;
                                            abstractC7036h = abstractC7036h3;
                                            fD3 = iVar.d();
                                        } else if (abstractC7036h3 instanceof AbstractC7036h.j) {
                                            AbstractC7036h.j jVar = (AbstractC7036h.j) abstractC7036h3;
                                            float fC6 = jVar.c() + fC4;
                                            float fD7 = jVar.d() + fD3;
                                            f10 = f18;
                                            abstractC7036h = abstractC7036h3;
                                            i10 = size;
                                            i11 = i12;
                                            b(interfaceC6374m1, fC4, fD3, fC6, fD7, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
                                            fC3 = fC6;
                                            fC4 = fC3;
                                            fD2 = fD7;
                                        } else {
                                            i10 = size;
                                            f10 = f18;
                                            i11 = i12;
                                            abstractC7036h = abstractC7036h3;
                                            if (!(abstractC7036h instanceof AbstractC7036h.a)) {
                                                throw new Td.r();
                                            }
                                            AbstractC7036h.a aVar = (AbstractC7036h.a) abstractC7036h;
                                            b(interfaceC6374m1, fC4, fD3, aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
                                            fC3 = aVar.c();
                                            fC4 = fC3;
                                            fD2 = aVar.d();
                                        }
                                        fC3 = fC;
                                    }
                                    i12 = i11 + 1;
                                    interfaceC6374m12 = interfaceC6374m1;
                                    abstractC7036h2 = abstractC7036h;
                                    size = i10;
                                    f18 = f10;
                                    list2 = list;
                                }
                                fD3 += f17;
                                fC3 = fC2;
                                fD2 = fE;
                            }
                            fD3 = f13;
                            fC4 = fD;
                        }
                        fD3 += f14;
                    }
                    i10 = size;
                    f10 = f18;
                    i11 = i12;
                }
                abstractC7036h = abstractC7036h3;
                i12 = i11 + 1;
                interfaceC6374m12 = interfaceC6374m1;
                abstractC7036h2 = abstractC7036h;
                size = i10;
                f18 = f10;
                list2 = list;
            }
            fD3 = fD2;
            i12 = i11 + 1;
            interfaceC6374m12 = interfaceC6374m1;
            abstractC7036h2 = abstractC7036h;
            size = i10;
            f18 = f10;
            list2 = list;
        }
        return interfaceC6374m1;
    }
}
