package Pb;

import S4.h;
import S4.j;
import U4.v;
import android.graphics.RectF;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5504s;
import q5.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements j {
    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(InputStream source, int i10, int i11, h options) throws IOException {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(options, "options");
        try {
            g gVarL = g.l(source);
            AbstractC5504s.g(gVarL, "getFromInputStream(...)");
            if (gVarL.g() == null) {
                float fH = gVarL.h();
                float f10 = gVarL.f();
                if (fH != -1.0f && f10 != -1.0f) {
                    gVarL.u(0.0f, 0.0f, fH, f10);
                }
            }
            RectF rectFG = gVarL.g();
            if (rectFG != null && rectFG.width() > 0.0f && rectFG.height() > 0.0f) {
                float fWidth = i10 > 0 ? i10 / rectFG.width() : Float.POSITIVE_INFINITY;
                float fHeight = i11 > 0 ? i11 / rectFG.height() : Float.POSITIVE_INFINITY;
                float fMin = (Math.abs(fWidth) > Float.MAX_VALUE && Math.abs(fHeight) > Float.MAX_VALUE) ? 1.0f : Math.min(fWidth, fHeight);
                if (Math.abs(fMin) <= Float.MAX_VALUE && fMin > 0.0f) {
                    gVarL.v(rectFG.width() * fMin);
                    gVarL.t(rectFG.height() * fMin);
                }
            } else if (i10 > 0 && i11 > 0) {
                gVarL.v(i10);
                gVarL.t(i11);
            }
            return new a5.j(gVarL);
        } catch (q5.j e10) {
            throw new IOException("Cannot load SVG from stream", e10);
        }
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream source, h options) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(options, "options");
        return true;
    }
}
