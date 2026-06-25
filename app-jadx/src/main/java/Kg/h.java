package kg;

import dg.F;
import dg.x;
import kotlin.jvm.internal.AbstractC5504s;
import tg.InterfaceC6685j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f52217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6685j f52218d;

    public h(String str, long j10, InterfaceC6685j source) {
        AbstractC5504s.h(source, "source");
        this.f52216b = str;
        this.f52217c = j10;
        this.f52218d = source;
    }

    @Override // dg.F
    public long h() {
        return this.f52217c;
    }

    @Override // dg.F
    public x j() {
        String str = this.f52216b;
        if (str != null) {
            return x.f45605e.c(str);
        }
        return null;
    }

    @Override // dg.F
    public InterfaceC6685j k() {
        return this.f52218d;
    }
}
