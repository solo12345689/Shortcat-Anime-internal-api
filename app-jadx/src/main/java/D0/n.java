package d0;

import Ud.AbstractC2270k;
import b0.InterfaceC2967d;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC2270k implements InterfaceC2967d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4553d f44923b;

    public n(C4553d c4553d) {
        this.f44923b = c4553d;
    }

    @Override // Ud.AbstractC2261b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return f((Map.Entry) obj);
        }
        return false;
    }

    @Override // Ud.AbstractC2261b
    public int d() {
        return this.f44923b.size();
    }

    public boolean f(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.f44923b.get(entry.getKey());
        return obj != null ? AbstractC5504s.c(obj, entry.getValue()) : entry.getValue() == null && this.f44923b.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new o(this.f44923b.q());
    }
}
