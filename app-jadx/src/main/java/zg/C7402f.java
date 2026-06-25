package zg;

/* JADX INFO: renamed from: zg.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7402f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final InterfaceC7400e[] f66398d = new InterfaceC7400e[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC7400e[] f66399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f66400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f66401c;

    public C7402f() {
        this(10);
    }

    static InterfaceC7400e[] b(InterfaceC7400e[] interfaceC7400eArr) {
        return interfaceC7400eArr.length < 1 ? f66398d : (InterfaceC7400e[]) interfaceC7400eArr.clone();
    }

    private void e(int i10) {
        InterfaceC7400e[] interfaceC7400eArr = new InterfaceC7400e[Math.max(this.f66399a.length, i10 + (i10 >> 1))];
        System.arraycopy(this.f66399a, 0, interfaceC7400eArr, 0, this.f66400b);
        this.f66399a = interfaceC7400eArr;
        this.f66401c = false;
    }

    public void a(InterfaceC7400e interfaceC7400e) {
        if (interfaceC7400e == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        int length = this.f66399a.length;
        int i10 = this.f66400b + 1;
        if (this.f66401c | (i10 > length)) {
            e(i10);
        }
        this.f66399a[this.f66400b] = interfaceC7400e;
        this.f66400b = i10;
    }

    InterfaceC7400e[] c() {
        int i10 = this.f66400b;
        if (i10 == 0) {
            return f66398d;
        }
        InterfaceC7400e[] interfaceC7400eArr = new InterfaceC7400e[i10];
        System.arraycopy(this.f66399a, 0, interfaceC7400eArr, 0, i10);
        return interfaceC7400eArr;
    }

    public InterfaceC7400e d(int i10) {
        if (i10 < this.f66400b) {
            return this.f66399a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10 + " >= " + this.f66400b);
    }

    public int f() {
        return this.f66400b;
    }

    InterfaceC7400e[] g() {
        int i10 = this.f66400b;
        if (i10 == 0) {
            return f66398d;
        }
        InterfaceC7400e[] interfaceC7400eArr = this.f66399a;
        if (interfaceC7400eArr.length == i10) {
            this.f66401c = true;
            return interfaceC7400eArr;
        }
        InterfaceC7400e[] interfaceC7400eArr2 = new InterfaceC7400e[i10];
        System.arraycopy(interfaceC7400eArr, 0, interfaceC7400eArr2, 0, i10);
        return interfaceC7400eArr2;
    }

    public C7402f(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f66399a = i10 == 0 ? f66398d : new InterfaceC7400e[i10];
        this.f66400b = 0;
        this.f66401c = false;
    }
}
