package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.core.view.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2759g0 {

    /* JADX INFO: renamed from: androidx.core.view.g0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Cf.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f29047a;

        a(ViewGroup viewGroup) {
            this.f29047a = viewGroup;
        }

        @Override // Cf.i
        public Iterator iterator() {
            return AbstractC2759g0.c(this.f29047a);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.g0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29048a = new b();

        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(View view) {
            Cf.i iVarA;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (iVarA = AbstractC2759g0.a(viewGroup)) == null) {
                return null;
            }
            return iVarA.iterator();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.g0$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f29050b;

        c(ViewGroup viewGroup) {
            this.f29050b = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f29050b;
            int i10 = this.f29049a;
            this.f29049a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29049a < this.f29050b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f29050b;
            int i10 = this.f29049a - 1;
            this.f29049a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.g0$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Cf.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f29051a;

        public d(ViewGroup viewGroup) {
            this.f29051a = viewGroup;
        }

        @Override // Cf.i
        public Iterator iterator() {
            return new W(AbstractC2759g0.a(this.f29051a).iterator(), b.f29048a);
        }
    }

    public static final Cf.i a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Cf.i b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
