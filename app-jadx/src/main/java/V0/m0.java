package V0;

import android.text.Layout;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f19667a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Layout.Alignment f19668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Layout.Alignment f19669c;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (AbstractC5504s.c(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC5504s.c(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f19668b = alignment;
        f19669c = alignment2;
    }

    private m0() {
    }

    public final Layout.Alignment a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : f19669c : f19668b : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }
}
