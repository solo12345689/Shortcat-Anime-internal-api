package s0;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import t0.AbstractC6580c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class T0 {

    /* JADX INFO: renamed from: a */
    public static final T0 f58915a = new T0();

    private T0() {
    }

    public static final ColorSpace c(AbstractC6580c abstractC6580c) {
        ColorSpace.Rgb.TransferParameters transferParametersA;
        ColorSpace.Rgb rgbA;
        ColorSpace colorSpaceA;
        t0.k kVar = t0.k.f60205a;
        if (AbstractC5504s.c(abstractC6580c, kVar.G())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.m())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.n())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.o())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.p())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.s())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.t())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.u())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.w())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.x())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.y())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.z())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.A())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.B())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.E())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.F())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (colorSpaceA = W0.a(abstractC6580c)) != null) {
            return colorSpaceA;
        }
        if (!(abstractC6580c instanceof t0.F)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        t0.F f10 = (t0.F) abstractC6580c;
        float[] fArrC = f10.F().c();
        t0.G gD = f10.D();
        if (gD != null) {
            K0.a();
            transferParametersA = AbstractC6391u0.a(gD.a(), gD.b(), gD.c(), gD.d(), gD.e(), gD.f(), gD.g());
        } else {
            transferParametersA = null;
        }
        if (transferParametersA != null) {
            L0.a();
            rgbA = F0.a(abstractC6580c.f(), f10.C(), fArrC, transferParametersA);
        } else {
            L0.a();
            String strF = abstractC6580c.f();
            float[] fArrC2 = f10.C();
            final Function1 function1Z = f10.z();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: s0.R0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return T0.d(function1Z, d10);
                }
            };
            final Function1 function1V = f10.v();
            rgbA = J0.a(strF, fArrC2, fArrC, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: s0.S0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return T0.e(function1V, d10);
                }
            }, f10.d(0), f10.c(0));
        }
        return E0.a(rgbA);
    }

    public static final double d(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }

    public static final double e(Function1 function1, double d10) {
        return ((Number) function1.invoke(Double.valueOf(d10))).doubleValue();
    }
}
