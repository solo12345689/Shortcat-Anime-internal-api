package m6;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: m6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5643a implements InterfaceC5645c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5643a f53212a = new C5643a();

    private C5643a() {
    }

    @Override // m6.InterfaceC5645c
    public Uri a(Uri uri, Object obj) {
        AbstractC5504s.h(uri, "uri");
        return uri;
    }
}
