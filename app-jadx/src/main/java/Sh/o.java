package sh;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f59882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f59883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f59884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59885d;

    protected static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f59886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f59887b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f59888c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f59889d = 0;

        protected a(int i10) {
            this.f59886a = i10;
        }

        protected abstract a e();

        protected a f(int i10) {
            this.f59889d = i10;
            return e();
        }

        protected a g(int i10) {
            this.f59887b = i10;
            return e();
        }

        protected a h(long j10) {
            this.f59888c = j10;
            return e();
        }
    }

    protected o(a aVar) {
        this.f59882a = aVar.f59887b;
        this.f59883b = aVar.f59888c;
        this.f59884c = aVar.f59886a;
        this.f59885d = aVar.f59889d;
    }

    public final int a() {
        return this.f59885d;
    }

    protected final int b() {
        return this.f59882a;
    }

    protected final long c() {
        return this.f59883b;
    }

    protected byte[] d() {
        byte[] bArr = new byte[32];
        Oh.g.c(this.f59882a, bArr, 0);
        Oh.g.h(this.f59883b, bArr, 4);
        Oh.g.c(this.f59884c, bArr, 12);
        Oh.g.c(this.f59885d, bArr, 28);
        return bArr;
    }
}
