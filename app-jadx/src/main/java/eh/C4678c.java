package eh;

/* JADX INFO: renamed from: eh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4678c extends AbstractC4676a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f46006c;

    public C4678c(C4677b c4677b, byte[] bArr) {
        super(true, c4677b);
        this.f46006c = Oh.a.f(bArr);
    }

    public byte[] getEncoded() {
        return Oh.a.f(this.f46006c);
    }
}
