package e9;

import android.os.Build;

/* JADX INFO: renamed from: e9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4658a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f45818a;

    static {
        f45818a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
