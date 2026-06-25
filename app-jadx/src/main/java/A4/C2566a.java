package a4;

import android.util.Log;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: a4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2566a implements InterfaceC2572g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2566a f23761a = new C2566a();

    private C2566a() {
    }

    @Override // a4.InterfaceC2572g
    public void a(String tag, String message) {
        AbstractC5504s.h(tag, "tag");
        AbstractC5504s.h(message, "message");
        Log.d(tag, message);
    }
}
