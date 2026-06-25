package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import je.InterfaceC5371a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Cf.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Menu f28937a;

        a(Menu menu) {
            this.f28937a = menu;
        }

        @Override // Cf.i
        public Iterator iterator() {
            return A.b(this.f28937a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f28938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Menu f28939b;

        b(Menu menu) {
            this.f28939b = menu;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f28939b;
            int i10 = this.f28938a;
            this.f28938a = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28938a < this.f28939b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            Menu menu = this.f28939b;
            int i10 = this.f28938a - 1;
            this.f28938a = i10;
            MenuItem item = menu.getItem(i10);
            if (item == null) {
                throw new IndexOutOfBoundsException();
            }
            menu.removeItem(item.getItemId());
        }
    }

    public static final Cf.i a(Menu menu) {
        return new a(menu);
    }

    public static final Iterator b(Menu menu) {
        return new b(menu);
    }
}
