package io.sentry.android.replay;

import Td.L;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import ge.AbstractC4877a;
import io.sentry.InterfaceC5192e0;
import io.sentry.android.replay.p;
import io.sentry.util.C5288a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f50329e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50330f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f50331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5288a f50332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f50333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f50334d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: io.sentry.android.replay.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0793a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f50335a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0793a(p pVar) {
                super(1);
                this.f50335a = pVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList invoke(ArrayList mViews) throws Exception {
                AbstractC5504s.h(mViews, "mViews");
                InterfaceC5192e0 interfaceC5192e0A = this.f50335a.f50332b.a();
                try {
                    ArrayList arrayList = this.f50335a.f50334d;
                    arrayList.addAll(mViews);
                    AbstractC4877a.a(interfaceC5192e0A, null);
                    return arrayList;
                } finally {
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(p pVar) {
            if (pVar.f50331a.get()) {
                return;
            }
            v.f50441a.e(new C0793a(pVar));
        }

        public final p b() {
            final p pVar = new p(null);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: io.sentry.android.replay.o
                @Override // java.lang.Runnable
                public final void run() {
                    p.a.c(pVar);
                }
            });
            return pVar;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends ArrayList {
        b() {
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            AbstractC5504s.h(elements, "elements");
            for (e eVar : p.this.h()) {
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    eVar.a((View) it.next(), true);
                }
            }
            return super.addAll(elements);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(View element) {
            AbstractC5504s.h(element, "element");
            Iterator it = p.this.h().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(element, true);
            }
            return super.add(element);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return d((View) obj);
            }
            return false;
        }

        public /* bridge */ boolean d(View view) {
            return super.contains(view);
        }

        public /* bridge */ int e() {
            return super.size();
        }

        public /* bridge */ int f(View view) {
            return super.indexOf(view);
        }

        public /* bridge */ int i(View view) {
            return super.lastIndexOf(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return f((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return i((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final /* bridge */ View remove(int i10) {
            return t(i10);
        }

        public /* bridge */ boolean s(View view) {
            return super.remove(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return e();
        }

        public View t(int i10) {
            Object objRemove = super.remove(i10);
            AbstractC5504s.g(objRemove, "removeAt(...)");
            View view = (View) objRemove;
            Iterator it = p.this.h().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(view, false);
            }
            return view;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return s((View) obj);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends CopyOnWriteArrayList {
        c() {
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(e eVar) throws Exception {
            InterfaceC5192e0 interfaceC5192e0A = p.this.f50332b.a();
            try {
                for (View view : p.this.f50334d) {
                    if (eVar != null) {
                        eVar.a(view, true);
                    }
                }
                L l10 = L.f17438a;
                AbstractC4877a.a(interfaceC5192e0A, null);
                return super.add(eVar);
            } finally {
            }
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return d((e) obj);
            }
            return false;
        }

        public /* bridge */ boolean d(e eVar) {
            return super.contains(eVar);
        }

        public /* bridge */ int e() {
            return super.size();
        }

        public /* bridge */ int f(e eVar) {
            return super.indexOf(eVar);
        }

        public /* bridge */ int i(e eVar) {
            return super.lastIndexOf(eVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return f((e) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return i((e) obj);
            }
            return -1;
        }

        public /* bridge */ boolean p(e eVar) {
            return super.remove(eVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return p((e) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50331a.set(true);
        this.f50333c.clear();
    }

    public final CopyOnWriteArrayList h() {
        return this.f50333c;
    }

    private p() {
        this.f50331a = new AtomicBoolean(false);
        this.f50332b = new C5288a();
        this.f50333c = new c();
        this.f50334d = new b();
    }
}
