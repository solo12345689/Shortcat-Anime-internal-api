package ye;

import java.util.Collection;

/* JADX INFO: renamed from: ye.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC7224b extends InterfaceC7223a, D {

    /* JADX INFO: renamed from: ye.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean a() {
            return this != FAKE_OVERRIDE;
        }
    }

    void E0(Collection collection);

    InterfaceC7224b a();

    Collection e();

    a h();

    InterfaceC7224b l0(InterfaceC7235m interfaceC7235m, E e10, AbstractC7242u abstractC7242u, a aVar, boolean z10);
}
