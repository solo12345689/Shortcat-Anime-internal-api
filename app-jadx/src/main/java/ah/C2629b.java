package ah;

/* JADX INFO: renamed from: ah.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C2629b implements Fg.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2629b f24090d = new C2629b("falcon-512", 9, 40);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2629b f24091e = new C2629b("falcon-1024", 10, 40);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24094c;

    private C2629b(String str, int i10, int i11) {
        if (i10 < 1 || i10 > 10) {
            throw new IllegalArgumentException("Log N degree should be between 1 and 10");
        }
        this.f24092a = str;
        this.f24093b = i10;
        this.f24094c = i11;
    }

    public int a() {
        return this.f24093b;
    }

    public String b() {
        return this.f24092a;
    }
}
