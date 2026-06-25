package ub;

import Td.AbstractC2156g;
import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ub.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6761m extends AbstractC6749a {

    /* JADX INFO: renamed from: a */
    private final C6760l f61496a;

    public C6761m(String category, File filesDirectory) {
        AbstractC5504s.h(category, "category");
        AbstractC5504s.h(filesDirectory, "filesDirectory");
        this.f61496a = new C6760l(category, filesDirectory);
    }

    @Override // ub.AbstractC6749a
    public void a(EnumC6751c type, String message, Throwable th2) {
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(message, "message");
        C6760l.e(this.f61496a, message, null, 2, null);
        if (th2 != null) {
            C6760l.e(this.f61496a, AbstractC6754f.a(th2) + "\n" + AbstractC2156g.c(th2), null, 2, null);
        }
    }
}
