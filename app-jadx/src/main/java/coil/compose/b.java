package coil.compose;

import G4.h;
import H4.c;
import I0.InterfaceC1680f;
import K4.d;
import Td.C2160k;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.U0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function1;
import r0.C6230l;
import s0.InterfaceC6341b1;
import u0.InterfaceC6711f;
import v4.InterfaceC6845d;
import w0.AbstractC6923b;
import x0.C7032d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    private static final a f33868a = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements d {
        a() {
        }

        @Override // K4.d
        public Drawable b() {
            return null;
        }
    }

    private static final boolean c(long j10) {
        return ((double) C6230l.i(j10)) >= 0.5d && ((double) C6230l.g(j10)) >= 0.5d;
    }

    public static final AsyncImagePainter d(Object obj, InterfaceC6845d interfaceC6845d, AbstractC6923b abstractC6923b, AbstractC6923b abstractC6923b2, AbstractC6923b abstractC6923b3, Function1 function1, Function1 function12, Function1 function13, InterfaceC1680f interfaceC1680f, int i10, InterfaceC2425m interfaceC2425m, int i11, int i12) {
        interfaceC2425m.C(2140758544);
        if ((i12 & 4) != 0) {
            abstractC6923b = null;
        }
        AbstractC6923b abstractC6923b4 = (i12 & 8) != 0 ? null : abstractC6923b2;
        AbstractC6923b abstractC6923b5 = (i12 & 16) != 0 ? abstractC6923b4 : abstractC6923b3;
        Function1 function14 = (i12 & 32) != 0 ? null : function1;
        Function1 function15 = (i12 & 64) != 0 ? null : function12;
        Function1 function16 = (i12 & 128) == 0 ? function13 : null;
        InterfaceC1680f interfaceC1680fB = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? InterfaceC1680f.f8703a.b() : interfaceC1680f;
        int iB = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? InterfaceC6711f.f61110j0.b() : i10;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(2140758544, i11, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:83)");
        }
        int i13 = i11 >> 12;
        AsyncImagePainter asyncImagePainterE = e(obj, interfaceC6845d, c.h(abstractC6923b, abstractC6923b4, abstractC6923b5), c.d(function14, function15, function16), interfaceC1680fB, iB, interfaceC2425m, (57344 & i13) | 72 | (i13 & 458752), 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.T();
        return asyncImagePainterE;
    }

    public static final AsyncImagePainter e(Object obj, InterfaceC6845d interfaceC6845d, Function1 function1, Function1 function12, InterfaceC1680f interfaceC1680f, int i10, InterfaceC2425m interfaceC2425m, int i11, int i12) {
        interfaceC2425m.C(-2020614074);
        if ((i12 & 4) != 0) {
            function1 = AsyncImagePainter.INSTANCE.a();
        }
        if ((i12 & 8) != 0) {
            function12 = null;
        }
        if ((i12 & 16) != 0) {
            interfaceC1680f = InterfaceC1680f.f8703a.b();
        }
        if ((i12 & 32) != 0) {
            i10 = InterfaceC6711f.f61110j0.b();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-2020614074, i11, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:128)");
        }
        h hVarE = c.e(obj, interfaceC2425m, 8);
        i(hVarE);
        interfaceC2425m.C(-492369756);
        Object objD = interfaceC2425m.D();
        if (objD == InterfaceC2425m.f22370a.a()) {
            objD = new AsyncImagePainter(hVarE, interfaceC6845d);
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.T();
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objD;
        asyncImagePainter.K(function1);
        asyncImagePainter.F(function12);
        asyncImagePainter.C(interfaceC1680f);
        asyncImagePainter.D(i10);
        asyncImagePainter.H(((Boolean) interfaceC2425m.n(U0.a())).booleanValue());
        asyncImagePainter.E(interfaceC6845d);
        asyncImagePainter.I(hVarE);
        asyncImagePainter.c();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.T();
        return asyncImagePainter;
    }

    public static final H4.h f(long j10) {
        if (j10 == C6230l.f58350b.a()) {
            return H4.h.f7921d;
        }
        if (!c(j10)) {
            return null;
        }
        float fI = C6230l.i(j10);
        H4.c cVarA = (Float.isInfinite(fI) || Float.isNaN(fI)) ? c.b.f7910a : H4.a.a(AbstractC5466a.d(C6230l.i(j10)));
        float fG = C6230l.g(j10);
        return new H4.h(cVarA, (Float.isInfinite(fG) || Float.isNaN(fG)) ? c.b.f7910a : H4.a.a(AbstractC5466a.d(C6230l.g(j10))));
    }

    private static final Void g(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    static /* synthetic */ Void h(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return g(str, str2);
    }

    private static final void i(h hVar) {
        Object objM = hVar.m();
        if (objM instanceof h.a) {
            g("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new C2160k();
        }
        if (objM instanceof InterfaceC6341b1) {
            h("ImageBitmap", null, 2, null);
            throw new C2160k();
        }
        if (objM instanceof C7032d) {
            h("ImageVector", null, 2, null);
            throw new C2160k();
        }
        if (objM instanceof AbstractC6923b) {
            h("Painter", null, 2, null);
            throw new C2160k();
        }
        if (hVar.M() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
