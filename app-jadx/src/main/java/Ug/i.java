package ug;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P f61542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f61543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f61544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f61545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f61546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f61547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f61548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f61549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f61550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f61551j;

    public i(P canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, Long l10, long j13) {
        AbstractC5504s.h(canonicalPath, "canonicalPath");
        AbstractC5504s.h(comment, "comment");
        this.f61542a = canonicalPath;
        this.f61543b = z10;
        this.f61544c = comment;
        this.f61545d = j10;
        this.f61546e = j11;
        this.f61547f = j12;
        this.f61548g = i10;
        this.f61549h = l10;
        this.f61550i = j13;
        this.f61551j = new ArrayList();
    }

    public final P a() {
        return this.f61542a;
    }

    public final List b() {
        return this.f61551j;
    }

    public final long c() {
        return this.f61546e;
    }

    public final int d() {
        return this.f61548g;
    }

    public final Long e() {
        return this.f61549h;
    }

    public final long f() {
        return this.f61550i;
    }

    public final long g() {
        return this.f61547f;
    }

    public final boolean h() {
        return this.f61543b;
    }

    public /* synthetic */ i(P p10, boolean z10, String str, long j10, long j11, long j12, int i10, Long l10, long j13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(p10, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? -1L : j10, (i11 & 16) != 0 ? -1L : j11, (i11 & 32) != 0 ? -1L : j12, (i11 & 64) != 0 ? -1 : i10, (i11 & 128) != 0 ? null : l10, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? -1L : j13);
    }
}
