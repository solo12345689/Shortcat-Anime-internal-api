package E0;

import com.adjust.sdk.network.ErrorCodes;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1313x f4024a = new C1291a(1000);

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1313x f4025b = new C1291a(ErrorCodes.IO_EXCEPTION);

    /* JADX INFO: renamed from: c */
    private static final InterfaceC1313x f4026c = new C1291a(1008);

    /* JADX INFO: renamed from: d */
    private static final InterfaceC1313x f4027d = new C1291a(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);

    public static final InterfaceC1313x a(int i10) {
        return new C1291a(i10);
    }

    public static final InterfaceC1313x b() {
        return f4025b;
    }

    public static final InterfaceC1313x c() {
        return f4024a;
    }

    public static final InterfaceC1313x d() {
        return f4027d;
    }

    public static final InterfaceC1313x e() {
        return f4026c;
    }
}
