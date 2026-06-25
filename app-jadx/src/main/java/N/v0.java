package N;

import U0.W0;
import a1.C2527U;
import android.view.inputmethod.ExtractedText;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {
    public static final ExtractedText b(C2527U c2527u) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = c2527u.l();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = c2527u.l().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = W0.l(c2527u.k());
        extractedText.selectionEnd = W0.k(c2527u.k());
        extractedText.flags = !Df.r.V(c2527u.l(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
