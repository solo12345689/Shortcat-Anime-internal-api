package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3406y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC3400w0 f39319a = new C3403x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3400w0 f39320b;

    static {
        AbstractC3400w0 abstractC3400w0 = null;
        try {
            abstractC3400w0 = (AbstractC3400w0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f39320b = abstractC3400w0;
    }

    static AbstractC3400w0 a() {
        AbstractC3400w0 abstractC3400w0 = f39320b;
        if (abstractC3400w0 != null) {
            return abstractC3400w0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC3400w0 b() {
        return f39319a;
    }
}
