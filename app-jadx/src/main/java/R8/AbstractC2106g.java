package R8;

import P8.a;
import P8.f;
import Q8.InterfaceC2056d;
import Q8.InterfaceC2064l;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.C3333a;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: R8.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2106g extends AbstractC2102c implements a.f {

    /* JADX INFO: renamed from: F */
    private final C2103d f15309F;

    /* JADX INFO: renamed from: G */
    private final Set f15310G;

    /* JADX INFO: renamed from: H */
    private final Account f15311H;

    protected AbstractC2106g(Context context, Looper looper, int i10, C2103d c2103d, f.a aVar, f.b bVar) {
        this(context, looper, i10, c2103d, (InterfaceC2056d) aVar, (InterfaceC2064l) bVar);
    }

    private final Set k0(Set set) {
        Set setJ0 = j0(set);
        Iterator it = setJ0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setJ0;
    }

    @Override // R8.AbstractC2102c
    protected final Set B() {
        return this.f15310G;
    }

    @Override // P8.a.f
    public Set h() {
        return f() ? this.f15310G : Collections.EMPTY_SET;
    }

    protected final C2103d i0() {
        return this.f15309F;
    }

    @Override // R8.AbstractC2102c
    public final Account s() {
        return this.f15311H;
    }

    @Override // R8.AbstractC2102c
    protected Executor u() {
        return null;
    }

    protected AbstractC2106g(Context context, Looper looper, int i10, C2103d c2103d, InterfaceC2056d interfaceC2056d, InterfaceC2064l interfaceC2064l) {
        this(context, looper, AbstractC2107h.b(context), C3333a.n(), i10, c2103d, (InterfaceC2056d) AbstractC2115p.l(interfaceC2056d), (InterfaceC2064l) AbstractC2115p.l(interfaceC2064l));
    }

    protected AbstractC2106g(Context context, Looper looper, AbstractC2107h abstractC2107h, C3333a c3333a, int i10, C2103d c2103d, InterfaceC2056d interfaceC2056d, InterfaceC2064l interfaceC2064l) {
        super(context, looper, abstractC2107h, c3333a, i10, interfaceC2056d == null ? null : new F(interfaceC2056d), interfaceC2064l != null ? new G(interfaceC2064l) : null, c2103d.j());
        this.f15309F = c2103d;
        this.f15311H = c2103d.a();
        this.f15310G = k0(c2103d.d());
    }

    protected Set j0(Set set) {
        return set;
    }
}
