package P0;

import Df.r;
import P0.b;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5504s;
import org.xmlpull.v1.XmlPullParserException;
import s0.InterfaceC6341b1;
import w0.AbstractC6923b;
import x0.C7032d;
import x0.q;
import y0.AbstractC7192c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    private static final InterfaceC6341b1 a(CharSequence charSequence, Resources resources, int i10) {
        try {
            return a.a(InterfaceC6341b1.f58928a, resources, i10);
        } catch (Exception e10) {
            throw new e("Error attempting to load resource: " + ((Object) charSequence), e10);
        }
    }

    private static final C7032d b(Resources.Theme theme, Resources resources, int i10, int i11, InterfaceC2425m interfaceC2425m, int i12) throws XmlPullParserException, IOException {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(21855625, i12, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:87)");
        }
        b bVar = (b) interfaceC2425m.n(AndroidCompositionLocals_androidKt.h());
        b.C0212b c0212b = new b.C0212b(theme, i10);
        b.a aVarB = bVar.b(c0212b);
        if (aVarB == null) {
            XmlResourceParser xml = resources.getXml(i10);
            if (!AbstractC5504s.c(AbstractC7192c.j(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            aVarB = g.a(theme, resources, xml, i11);
            bVar.d(c0212b, aVarB);
        }
        C7032d c7032dB = aVarB.b();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c7032dB;
    }

    public static final AbstractC6923b c(int i10, InterfaceC2425m interfaceC2425m, int i11) {
        AbstractC6923b abstractC6923bG;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(473971343, i11, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g());
        Resources resources = (Resources) interfaceC2425m.n(AndroidCompositionLocals_androidKt.j());
        TypedValue typedValueB = ((d) interfaceC2425m.n(AndroidCompositionLocals_androidKt.i())).b(resources, i10);
        CharSequence charSequence = typedValueB.string;
        boolean z10 = true;
        if (charSequence == null || !r.a0(charSequence, ".xml", false, 2, null)) {
            interfaceC2425m.V(-1771631096);
            Object theme = context.getTheme();
            boolean zU = interfaceC2425m.U(charSequence);
            if ((((i11 & 14) ^ 6) <= 4 || !interfaceC2425m.c(i10)) && (i11 & 6) != 4) {
                z10 = false;
            }
            boolean zU2 = interfaceC2425m.U(theme) | zU | z10;
            Object objD = interfaceC2425m.D();
            if (zU2 || objD == InterfaceC2425m.f22370a.a()) {
                objD = a(charSequence, resources, i10);
                interfaceC2425m.u(objD);
            }
            BitmapPainter bitmapPainter = new BitmapPainter((InterfaceC6341b1) objD, 0L, 0L, 6, null);
            interfaceC2425m.O();
            abstractC6923bG = bitmapPainter;
        } else {
            interfaceC2425m.V(-1771786530);
            abstractC6923bG = q.g(b(context.getTheme(), resources, i10, typedValueB.changingConfigurations, interfaceC2425m, (i11 << 6) & 896), interfaceC2425m, 0);
            interfaceC2425m.O();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return abstractC6923bG;
    }
}
