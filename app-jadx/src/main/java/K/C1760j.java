package K;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* JADX INFO: renamed from: K.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1760j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f10236a;

    public final Integer a(KeyEvent keyEvent) {
        int iC = C0.d.c(keyEvent);
        if ((Integer.MIN_VALUE & iC) != 0) {
            this.f10236a = Integer.valueOf(iC & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.f10236a;
        if (num == null) {
            return Integer.valueOf(iC);
        }
        this.f10236a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iC));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? Integer.valueOf(iC) : num2;
    }
}
