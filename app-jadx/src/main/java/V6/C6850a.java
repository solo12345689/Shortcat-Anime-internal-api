package v6;

import android.content.Context;
import dg.C4618A;
import kotlin.jvm.internal.AbstractC5504s;
import z6.C7306u;

/* JADX INFO: renamed from: v6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6850a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6850a f61968a = new C6850a();

    private C6850a() {
    }

    public static final C7306u.a a(Context context, C4618A okHttpClient) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(okHttpClient, "okHttpClient");
        return C7306u.f65758M.i(context).S(new b(okHttpClient));
    }
}
