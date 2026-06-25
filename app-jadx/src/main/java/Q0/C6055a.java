package q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: q0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6055a implements InterfaceC6057c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56107b;

    public /* synthetic */ C6055a(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @Override // q0.InterfaceC6057c
    public void a() {
        this.f56107b = true;
    }

    @Override // q0.InterfaceC6057c
    public int b() {
        return this.f56106a;
    }

    public final boolean c() {
        return this.f56107b;
    }

    private C6055a(int i10) {
        this.f56106a = i10;
    }
}
