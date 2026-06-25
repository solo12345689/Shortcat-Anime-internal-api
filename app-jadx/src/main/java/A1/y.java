package A1;

import H1.j;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class y extends x {
    private static Typeface o(String str) {
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    @Override // A1.x
    protected Font m(j.b bVar) {
        Typeface typefaceO;
        Font fontJ;
        String strC = bVar.c();
        if (strC == null || (typefaceO = o(strC)) == null || (fontJ = s.j(typefaceO)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(bVar.f())) {
            return fontJ;
        }
        try {
            return new Font.Builder(fontJ).setFontVariationSettings(bVar.f()).build();
        } catch (IOException unused) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
