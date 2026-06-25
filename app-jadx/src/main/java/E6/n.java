package E6;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f5690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f5691e;

    public n(int i10, int i11, int i12, p pVar, Map map) {
        this.f5687a = i10;
        this.f5688b = i11;
        this.f5689c = i12;
        this.f5690d = pVar;
        this.f5691e = map;
    }

    @Override // E6.l, k6.InterfaceC5452a
    public Map getExtras() {
        return this.f5691e;
    }

    @Override // E6.m
    public int getHeight() {
        return this.f5688b;
    }

    @Override // E6.m
    public int getWidth() {
        return this.f5687a;
    }
}
