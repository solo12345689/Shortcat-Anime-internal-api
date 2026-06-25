package androidx.compose.ui.platform;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2683b implements InterfaceC2698g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f27414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f27415b = new int[2];

    protected final int[] c(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = this.f27415b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    protected final String d() {
        String str = this.f27414a;
        if (str != null) {
            return str;
        }
        AbstractC5504s.u("text");
        return null;
    }

    public void e(String str) {
        f(str);
    }

    protected final void f(String str) {
        this.f27414a = str;
    }
}
