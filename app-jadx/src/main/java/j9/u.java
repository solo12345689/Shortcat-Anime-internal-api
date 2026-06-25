package j9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum u {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51709a;

    u(String str) {
        this.f51709a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f51709a;
    }
}
