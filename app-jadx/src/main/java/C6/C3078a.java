package c6;

import Df.r;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s5.InterfaceC6433d;

/* JADX INFO: renamed from: c6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3078a implements InterfaceC6433d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0569a f33515c = new C0569a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33517b;

    /* JADX INFO: renamed from: c6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0569a {
        public /* synthetic */ C0569a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0569a() {
        }
    }

    public C3078a(int i10, boolean z10) {
        this.f33516a = z10;
        this.f33517b = "anim://" + i10;
    }

    @Override // s5.InterfaceC6433d
    public String a() {
        return this.f33517b;
    }

    @Override // s5.InterfaceC6433d
    public boolean b(Uri uri) {
        AbstractC5504s.h(uri, "uri");
        String string = uri.toString();
        AbstractC5504s.g(string, "toString(...)");
        return r.Q(string, this.f33517b, false, 2, null);
    }

    @Override // s5.InterfaceC6433d
    public boolean c() {
        return false;
    }

    @Override // s5.InterfaceC6433d
    public boolean equals(Object obj) {
        if (!this.f33516a) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC5504s.c(C3078a.class, obj.getClass())) {
            return false;
        }
        return AbstractC5504s.c(this.f33517b, ((C3078a) obj).f33517b);
    }

    @Override // s5.InterfaceC6433d
    public int hashCode() {
        return !this.f33516a ? super.hashCode() : this.f33517b.hashCode();
    }
}
