package O9;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13081a;

    private g(String str) {
        this.f13081a = (String) n.j(str);
    }

    public static g f(char c10) {
        return new g(String.valueOf(c10));
    }

    public static g g(String str) {
        return new g(str);
    }

    public Appendable a(Appendable appendable, Iterator it) throws IOException {
        n.j(appendable);
        if (it.hasNext()) {
            appendable.append(h(it.next()));
            while (it.hasNext()) {
                appendable.append(this.f13081a);
                appendable.append(h(it.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder sb2, Iterable iterable) {
        return c(sb2, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb2, Iterator it) {
        try {
            a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String d(Iterable iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator it) {
        return c(new StringBuilder(), it).toString();
    }

    CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
