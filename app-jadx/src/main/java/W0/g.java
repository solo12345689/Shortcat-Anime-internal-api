package W0;

import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final f a(CharSequence charSequence, TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new d(charSequence, textPaint) : new e(charSequence);
    }
}
