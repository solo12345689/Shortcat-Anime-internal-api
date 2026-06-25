package Y0;

import Y0.K;
import android.content.Context;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import i1.AbstractC5008a;
import i1.InterfaceC5011d;
import java.util.List;
import k1.AbstractC5436a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    private static final float b(float f10) {
        return AbstractC5874j.l(f10, 1.0f, 1000.0f);
    }

    public static final int c(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) {
            return 0;
        }
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }

    public static final FontVariationAxis[] d(K.d dVar, InterfaceC5011d interfaceC5011d, int i10) {
        int size;
        FontVariationAxis fontVariationAxisA;
        int i11 = 0;
        if (i10 == 0) {
            int size2 = dVar.b().size();
            FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[size2];
            while (i11 < size2) {
                W.a();
                fontVariationAxisArr[i11] = V.a(((K.a) dVar.b().get(i11)).c(), ((K.a) dVar.b().get(i11)).b(interfaceC5011d));
                i11++;
            }
            return fontVariationAxisArr;
        }
        int size3 = dVar.b().size();
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                size = dVar.b().size() + 1;
                break;
            }
            if (AbstractC5504s.c(((K.a) dVar.b().get(i12)).c(), "wght")) {
                size = dVar.b().size();
                break;
            }
            i12++;
        }
        FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[size];
        while (i11 < size) {
            if (i11 == dVar.b().size()) {
                W.a();
                fontVariationAxisA = V.a("wght", b(i10 + 400.0f));
            } else if (AbstractC5504s.c(((K.a) dVar.b().get(i11)).c(), "wght")) {
                W.a();
                fontVariationAxisA = V.a("wght", b(((K.a) dVar.b().get(i11)).b(interfaceC5011d) + i10));
            } else {
                W.a();
                fontVariationAxisA = V.a(((K.a) dVar.b().get(i11)).c(), ((K.a) dVar.b().get(i11)).b(interfaceC5011d));
            }
            fontVariationAxisArr2[i11] = fontVariationAxisA;
            i11++;
        }
        return fontVariationAxisArr2;
    }

    public static final String e(K.d dVar, Context context) {
        return f(dVar, AbstractC5008a.a(context), c(context));
    }

    public static final String f(K.d dVar, final InterfaceC5011d interfaceC5011d, int i10) {
        boolean z10;
        float fB;
        if (i10 == 0) {
            return AbstractC5436a.e(dVar.b(), null, null, null, 0, null, new Function1() { // from class: Y0.X
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Y.g(interfaceC5011d, (K.a) obj);
                }
            }, 31, null);
        }
        List listB = dVar.b();
        int size = listB.size();
        int i11 = 0;
        String str = "";
        boolean z11 = false;
        while (i11 < size) {
            K.a aVar = (K.a) listB.get(i11);
            if (AbstractC5504s.c(aVar.c(), "wght")) {
                fB = b(aVar.b(interfaceC5011d) + i10);
                z10 = true;
            } else {
                z10 = z11;
                fB = aVar.b(interfaceC5011d);
            }
            if (i11 != 0) {
                str = str + ',';
            }
            str = str + '\'' + aVar.c() + "' " + fB;
            i11++;
            z11 = z10;
        }
        if (z11) {
            return str;
        }
        float fB2 = b(i10 + 400.0f);
        if (!dVar.b().isEmpty()) {
            str = str + ',';
        }
        return str + "'wght' " + fB2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(InterfaceC5011d interfaceC5011d, K.a aVar) {
        return '\'' + aVar.c() + "' " + aVar.b(interfaceC5011d);
    }
}
