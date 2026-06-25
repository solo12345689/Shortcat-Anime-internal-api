package zg;

/* JADX INFO: renamed from: zg.x */
/* JADX INFO: loaded from: classes5.dex */
public class C7431x extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    private Throwable f66448a;

    public C7431x(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f66448a;
    }

    public C7431x(String str, Throwable th2) {
        super(str);
        this.f66448a = th2;
    }
}
