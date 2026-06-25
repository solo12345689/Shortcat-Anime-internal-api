package d0;

import f0.AbstractC4747a;
import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f44935a = t.f44926e.a().p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44937c;

    public final Object b() {
        AbstractC4747a.a(g());
        return this.f44935a[this.f44937c];
    }

    public final t d() {
        AbstractC4747a.a(i());
        Object obj = this.f44935a[this.f44937c];
        AbstractC5504s.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    protected final Object[] e() {
        return this.f44935a;
    }

    protected final int f() {
        return this.f44937c;
    }

    public final boolean g() {
        return this.f44937c < this.f44936b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return g();
    }

    public final boolean i() {
        AbstractC4747a.a(this.f44937c >= this.f44936b);
        return this.f44937c < this.f44935a.length;
    }

    public final void j() {
        AbstractC4747a.a(g());
        this.f44937c += 2;
    }

    public final void k() {
        AbstractC4747a.a(i());
        this.f44937c++;
    }

    public final void l(Object[] objArr, int i10) {
        m(objArr, i10, 0);
    }

    public final void m(Object[] objArr, int i10, int i11) {
        this.f44935a = objArr;
        this.f44936b = i10;
        this.f44937c = i11;
    }

    protected final void n(int i10) {
        this.f44937c = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
