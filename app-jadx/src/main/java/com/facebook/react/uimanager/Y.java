package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f37538d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f37539a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseBooleanArray f37540b = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f37541c = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Thread f37542a;

        public b() {
        }

        public final void a() {
            Thread threadCurrentThread = Thread.currentThread();
            if (this.f37542a == null) {
                this.f37542a = threadCurrentThread;
            }
            Q6.a.a(AbstractC5504s.c(this.f37542a, threadCurrentThread));
        }
    }

    static {
        W6.b.a("ShadowNodeRegistry", W6.a.f20778b);
    }

    public final void a(O node) {
        AbstractC5504s.h(node, "node");
        this.f37541c.a();
        this.f37539a.put(node.getReactTag(), node);
    }

    public final void b(O node) {
        AbstractC5504s.h(node, "node");
        this.f37541c.a();
        int reactTag = node.getReactTag();
        this.f37539a.put(reactTag, node);
        this.f37540b.put(reactTag, true);
    }

    public final O c(int i10) {
        this.f37541c.a();
        return (O) this.f37539a.get(i10);
    }

    public final int d() {
        this.f37541c.a();
        return this.f37540b.size();
    }

    public final int e(int i10) {
        this.f37541c.a();
        return this.f37540b.keyAt(i10);
    }

    public final boolean f(int i10) {
        this.f37541c.a();
        return this.f37540b.get(i10);
    }

    public final void g(int i10) {
        this.f37541c.a();
        if (!this.f37540b.get(i10)) {
            this.f37539a.remove(i10);
            return;
        }
        throw new C3299o("Trying to remove root node " + i10 + " without using removeRootNode!");
    }

    public final void h(int i10) {
        this.f37541c.a();
        if (i10 == -1) {
            return;
        }
        if (this.f37540b.get(i10)) {
            this.f37539a.remove(i10);
            this.f37540b.delete(i10);
        } else {
            throw new C3299o("View with tag " + i10 + " is not registered as a root view");
        }
    }
}
