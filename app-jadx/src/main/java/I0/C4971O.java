package i0;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: i0.O, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4971O extends AbstractC4978W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b0.e f48438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48440e;

    public C4971O(long j10, b0.e eVar) {
        super(j10);
        this.f48438c = eVar;
    }

    @Override // i0.AbstractC4978W
    public void c(AbstractC4978W abstractC4978W) {
        synchronized (AbstractC4962F.f48395a) {
            AbstractC5504s.f(abstractC4978W, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f48438c = ((C4971O) abstractC4978W).f48438c;
            this.f48439d = ((C4971O) abstractC4978W).f48439d;
            this.f48440e = ((C4971O) abstractC4978W).f48440e;
            Td.L l10 = Td.L.f17438a;
        }
    }

    @Override // i0.AbstractC4978W
    public AbstractC4978W d(long j10) {
        return new C4971O(j10, this.f48438c);
    }

    public final b0.e i() {
        return this.f48438c;
    }

    public final int j() {
        return this.f48439d;
    }

    public final int k() {
        return this.f48440e;
    }

    public final void l(b0.e eVar) {
        this.f48438c = eVar;
    }

    public final void m(int i10) {
        this.f48439d = i10;
    }

    public final void n(int i10) {
        this.f48440e = i10;
    }
}
