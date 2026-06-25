package o4;

import android.app.Application;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: o4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C5820a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5820a f54482a = new C5820a();

    private C5820a() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        AbstractC5504s.g(processName, "getProcessName()");
        return processName;
    }
}
