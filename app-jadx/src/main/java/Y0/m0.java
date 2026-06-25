package Y0;

import Y0.K;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import i1.AbstractC5008a;
import i1.AbstractC5013f;
import i1.InterfaceC5011d;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class m0 {

    /* JADX INFO: renamed from: a */
    public static final m0 f22695a = new m0();

    private m0() {
    }

    private final FontVariationAxis[] c(K.d dVar, Context context) {
        InterfaceC5011d interfaceC5011dA;
        if (context != null) {
            interfaceC5011dA = AbstractC5008a.a(context);
        } else {
            if (dVar.a()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            interfaceC5011dA = AbstractC5013f.a(1.0f, 1.0f);
        }
        return Y.d(dVar, interfaceC5011dA, Y.c(context));
    }

    public final Typeface a(AssetManager assetManager, String str, Context context, K.d dVar) {
        if (context == null) {
            return null;
        }
        return l0.a(assetManager, str).setFontVariationSettings(c(dVar, context)).build();
    }

    public final Typeface b(File file, Context context, K.d dVar) {
        if (context == null) {
            return null;
        }
        return k0.a(file).setFontVariationSettings(c(dVar, context)).build();
    }
}
