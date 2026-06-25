package G4;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum b {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7236b;

    b(boolean z10, boolean z11) {
        this.f7235a = z10;
        this.f7236b = z11;
    }

    public final boolean b() {
        return this.f7235a;
    }

    public final boolean c() {
        return this.f7236b;
    }
}
