package com.facebook.react.views.image;

import V5.q;
import android.graphics.Shader;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f37911a = new d();

    private d() {
    }

    public static final Shader.TileMode a() {
        return Shader.TileMode.CLAMP;
    }

    public static final q b() {
        q CENTER_CROP = q.f19909i;
        AbstractC5504s.g(CENTER_CROP, "CENTER_CROP");
        return CENTER_CROP;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final q c(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        q FIT_XY = q.f19901a;
                        AbstractC5504s.g(FIT_XY, "FIT_XY");
                        return FIT_XY;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        q CENTER_INSIDE = q.f19908h;
                        AbstractC5504s.g(CENTER_INSIDE, "CENTER_INSIDE");
                        return CENTER_INSIDE;
                    }
                    break;
                case -934531685:
                    if (str.equals("repeat")) {
                        return i.f37942l.a();
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        return i.f37942l.a();
                    }
                    break;
                case 94852023:
                    if (str.equals("cover")) {
                        q CENTER_CROP = q.f19909i;
                        AbstractC5504s.g(CENTER_CROP, "CENTER_CROP");
                        return CENTER_CROP;
                    }
                    break;
                case 951526612:
                    if (str.equals("contain")) {
                        q FIT_CENTER = q.f19905e;
                        AbstractC5504s.g(FIT_CENTER, "FIT_CENTER");
                        return FIT_CENTER;
                    }
                    break;
            }
        }
        if (str != null) {
            AbstractC7283a.I("ReactNative", "Invalid resize mode: '" + str + "'");
        }
        return b();
    }

    public static final Shader.TileMode d(String str) {
        if (AbstractC5504s.c("contain", str) || AbstractC5504s.c("cover", str) || AbstractC5504s.c("stretch", str) || AbstractC5504s.c("center", str) || AbstractC5504s.c("none", str)) {
            return Shader.TileMode.CLAMP;
        }
        if (AbstractC5504s.c("repeat", str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str != null) {
            AbstractC7283a.I("ReactNative", "Invalid resize mode: '" + str + "'");
        }
        return a();
    }
}
