package R8;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends W {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ AbstractC2102c f15329g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(AbstractC2102c abstractC2102c, int i10, Bundle bundle) {
        super(abstractC2102c, i10, bundle);
        Objects.requireNonNull(abstractC2102c);
        this.f15329g = abstractC2102c;
    }

    @Override // R8.W
    protected final boolean e() {
        this.f15329g.f15257p.a(ConnectionResult.f38918f);
        return true;
    }

    @Override // R8.W
    protected final void f(ConnectionResult connectionResult) {
        AbstractC2102c abstractC2102c = this.f15329g;
        if (abstractC2102c.r() && abstractC2102c.Y()) {
            abstractC2102c.X(16);
        } else {
            abstractC2102c.f15257p.a(connectionResult);
            abstractC2102c.K(connectionResult);
        }
    }
}
