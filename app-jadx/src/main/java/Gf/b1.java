package Gf;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class b1 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient C0 f7552a;

    public b1(String str, C0 c02) {
        super(str);
        this.f7552a = c02;
    }

    public b1(String str) {
        this(str, null);
    }
}
