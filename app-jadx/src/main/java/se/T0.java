package se;

import ie.InterfaceC5082a;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes5.dex */
class T0 implements InterfaceC5082a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U0 f59420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f59422c;

    public T0(U0 u02, int i10, Lazy lazy) {
        this.f59420a = u02;
        this.f59421b = i10;
        this.f59422c = lazy;
    }

    @Override // ie.InterfaceC5082a
    public Object invoke() {
        return U0.x(this.f59420a, this.f59421b, this.f59422c);
    }
}
