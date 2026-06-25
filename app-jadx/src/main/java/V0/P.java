package V0;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5489c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f19631a = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(float f10, CharSequence charSequence, TextPaint textPaint) {
        if (f10 == 0.0f) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (U.a(spanned, X0.f.class) || U.a(spanned, X0.e.class)) {
                return true;
            }
        }
        return textPaint.getLetterSpacing() != 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence e(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (U.a(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                Iterator itA = AbstractC5489c.a(characterStyleArr);
                SpannableString spannableString = null;
                while (itA.hasNext()) {
                    CharacterStyle characterStyle = (CharacterStyle) itA.next();
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        if (spannableString == null) {
                            spannableString = new SpannableString(charSequence);
                        }
                        spannableString.removeSpan(characterStyle);
                    }
                }
                if (spannableString != null) {
                    return spannableString;
                }
            }
        }
        return charSequence;
    }
}
