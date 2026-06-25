package d1;

import U0.C2215n;
import U0.C2232w;
import android.graphics.Matrix;
import android.graphics.Shader;
import g1.C4831k;
import java.util.List;
import r0.C6230l;
import s0.A1;
import s0.AbstractC6358h0;
import s0.AbstractC6361i0;
import s0.C1;
import s0.F1;
import s0.InterfaceC6364j0;
import u0.AbstractC6712g;

/* JADX INFO: renamed from: d1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4556b {
    public static final void a(C2215n c2215n, InterfaceC6364j0 interfaceC6364j0, AbstractC6358h0 abstractC6358h0, float f10, C1 c12, C4831k c4831k, AbstractC6712g abstractC6712g, int i10) {
        interfaceC6364j0.p();
        if (c2215n.z().size() <= 1 || (abstractC6358h0 instanceof F1)) {
            b(c2215n, interfaceC6364j0, abstractC6358h0, f10, c12, c4831k, abstractC6712g, i10);
        } else {
            if (!(abstractC6358h0 instanceof A1)) {
                throw new Td.r();
            }
            List listZ = c2215n.z();
            int size = listZ.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                C2232w c2232w = (C2232w) listZ.get(i11);
                height += c2232w.e().getHeight();
                fMax = Math.max(fMax, c2232w.e().getWidth());
            }
            Shader shaderMo483createShaderuvyYCjk = ((A1) abstractC6358h0).mo483createShaderuvyYCjk(C6230l.d((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(height)) & 4294967295L)));
            Matrix matrix = new Matrix();
            shaderMo483createShaderuvyYCjk.getLocalMatrix(matrix);
            List listZ2 = c2215n.z();
            int size2 = listZ2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                C2232w c2232w2 = (C2232w) listZ2.get(i12);
                c2232w2.e().y(interfaceC6364j0, AbstractC6361i0.a(shaderMo483createShaderuvyYCjk), f10, c12, c4831k, abstractC6712g, i10);
                interfaceC6364j0.d(0.0f, c2232w2.e().getHeight());
                matrix.setTranslate(0.0f, -c2232w2.e().getHeight());
                shaderMo483createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        interfaceC6364j0.k();
    }

    private static final void b(C2215n c2215n, InterfaceC6364j0 interfaceC6364j0, AbstractC6358h0 abstractC6358h0, float f10, C1 c12, C4831k c4831k, AbstractC6712g abstractC6712g, int i10) {
        List listZ = c2215n.z();
        int size = listZ.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2232w c2232w = (C2232w) listZ.get(i11);
            c2232w.e().y(interfaceC6364j0, abstractC6358h0, f10, c12, c4831k, abstractC6712g, i10);
            interfaceC6364j0.d(0.0f, c2232w.e().getHeight());
        }
    }
}
