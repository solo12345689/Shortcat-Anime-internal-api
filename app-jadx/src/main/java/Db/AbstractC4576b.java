package db;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: db.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4576b implements InterfaceC4575a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f45086a;

    public AbstractC4576b(boolean z10) {
        this.f45086a = z10;
    }

    public boolean b() {
        return this.f45086a;
    }

    @Override // db.InterfaceC4575a
    public void disable() {
        this.f45086a = false;
    }

    @Override // db.InterfaceC4575a
    public void enable() {
        this.f45086a = true;
    }

    public /* synthetic */ AbstractC4576b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
