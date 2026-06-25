package Kh;

/* JADX INFO: loaded from: classes5.dex */
public class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Mh.a f11170e;

    public c(int i10, int i11, Mh.a aVar, String str) {
        super(false, str);
        this.f11168c = i10;
        this.f11169d = i11;
        this.f11170e = new Mh.a(aVar);
    }

    public Mh.a c() {
        return this.f11170e;
    }

    public int d() {
        return this.f11168c;
    }

    public int e() {
        return this.f11169d;
    }
}
