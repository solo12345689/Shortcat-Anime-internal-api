package K0;

/* JADX INFO: renamed from: K0.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1792i {
    public static final Object a(InterfaceC1790h interfaceC1790h, Y.D d10) {
        if (!interfaceC1790h.getNode().isAttached()) {
            H0.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return AbstractC1796k.n(interfaceC1790h).Q().a(d10);
    }
}
