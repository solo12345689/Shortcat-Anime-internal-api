package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T3 {
    public static G0 a(Q3 q32) {
        O3 o32 = new O3();
        S3 s32 = new S3(o32);
        o32.f40243b = s32;
        o32.f40242a = q32.getClass();
        try {
            o32.f40242a = q32.a(o32);
            return s32;
        } catch (Exception e10) {
            s32.b(e10);
            return s32;
        }
    }
}
