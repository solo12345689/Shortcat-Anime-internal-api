package S4;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15941a;

    public e(int i10) {
        this("Http request failed", i10);
    }

    public e(String str, int i10) {
        this(str, i10, null);
    }

    public e(String str, int i10, Throwable th2) {
        super(str + ", status code: " + i10, th2);
        this.f15941a = i10;
    }
}
