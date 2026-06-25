package K;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static final int a(String str, int i10) {
        androidx.emoji2.text.e eVarC = c();
        Integer num = null;
        if (eVarC != null) {
            Integer numValueOf = Integer.valueOf(eVarC.d(str, i10));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    public static final int b(String str, int i10) {
        androidx.emoji2.text.e eVarC = c();
        Integer num = null;
        if (eVarC != null) {
            Integer numValueOf = Integer.valueOf(eVarC.f(str, Math.max(0, i10 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    private static final androidx.emoji2.text.e c() {
        if (androidx.emoji2.text.e.k()) {
            androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
            if (eVarC.g() == 1) {
                return eVarC;
            }
        }
        return null;
    }
}
