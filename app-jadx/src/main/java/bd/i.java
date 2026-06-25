package Bd;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f1660a = new i();

    private i() {
    }

    public static final h a(String runtimeVersion, expo.modules.updates.d config) {
        AbstractC5504s.h(runtimeVersion, "runtimeVersion");
        AbstractC5504s.h(config, "config");
        return new h(new b(runtimeVersion, config), new d(config), new f());
    }
}
