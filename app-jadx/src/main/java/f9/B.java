package f9;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class B implements Iterable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CharSequence f46952a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ E f46953b;

    B(E e10, CharSequence charSequence) {
        this.f46952a = charSequence;
        Objects.requireNonNull(e10);
        this.f46953b = e10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f46953b.e(this.f46952a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb2.append(y.a(it.next(), ", "));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ", ");
                    sb2.append(y.a(it.next(), ", "));
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
