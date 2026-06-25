package Ph;

/* JADX INFO: loaded from: classes5.dex */
public class b extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Throwable f13978a;

    b(String str, Throwable th2) {
        super(str);
        this.f13978a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f13978a;
    }
}
