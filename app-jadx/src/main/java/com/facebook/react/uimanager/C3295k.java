package com.facebook.react.uimanager;

/* JADX INFO: renamed from: com.facebook.react.uimanager.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3295k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3295k f37790a = new C3295k();

    private C3295k() {
    }

    public static final boolean a(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) && Float.isNaN(f11) : Math.abs(f11 - f10) < 1.0E-5f;
    }

    public static final boolean b(Float f10, Float f11) {
        if (f10 == null) {
            return f11 == null;
        }
        if (f11 == null) {
            return false;
        }
        return a(f10.floatValue(), f11.floatValue());
    }
}
