package ze;

/* JADX INFO: renamed from: ze.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7368b implements InterfaceC7367a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7374h f66200a;

    public AbstractC7368b(InterfaceC7374h interfaceC7374h) {
        if (interfaceC7374h == null) {
            T(0);
        }
        this.f66200a = interfaceC7374h;
    }

    private static /* synthetic */ void T(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // ze.InterfaceC7367a
    public InterfaceC7374h getAnnotations() {
        InterfaceC7374h interfaceC7374h = this.f66200a;
        if (interfaceC7374h == null) {
            T(1);
        }
        return interfaceC7374h;
    }
}
