package com.facebook.react.views.image;

import Ud.AbstractC2279u;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s5.C6435f;
import s5.InterfaceC6433d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements K6.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37912b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f37913a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final K6.d a(List postprocessors) {
            AbstractC5504s.h(postprocessors, "postprocessors");
            int size = postprocessors.size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (size != 0) {
                return size != 1 ? new e(postprocessors, defaultConstructorMarker) : (K6.d) postprocessors.get(0);
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ e(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Override // K6.d
    public C5.a a(Bitmap sourceBitmap, w6.d bitmapFactory) {
        Bitmap bitmap;
        AbstractC5504s.h(sourceBitmap, "sourceBitmap");
        AbstractC5504s.h(bitmapFactory, "bitmapFactory");
        C5.a aVarA = null;
        try {
            C5.a aVarClone = null;
            for (K6.d dVar : this.f37913a) {
                if (aVarClone == null || (bitmap = (Bitmap) aVarClone.C()) == null) {
                    bitmap = sourceBitmap;
                }
                aVarA = dVar.a(bitmap, bitmapFactory);
                C5.a.m(aVarClone);
                aVarClone = aVarA.clone();
            }
            if (aVarA != null) {
                C5.a aVarClone2 = aVarA.clone();
                AbstractC5504s.g(aVarClone2, "clone(...)");
                C5.a.m(aVarA);
                return aVarClone2;
            }
            throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + this.f37913a.size()).toString());
        } catch (Throwable th2) {
            C5.a.m(null);
            throw th2;
        }
    }

    @Override // K6.d
    public InterfaceC6433d b() {
        List list = this.f37913a;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((K6.d) it.next()).b());
        }
        return new C6435f(arrayList);
    }

    @Override // K6.d
    public String getName() {
        return "MultiPostProcessor (" + AbstractC2279u.w0(this.f37913a, com.amazon.a.a.o.b.f.f34694a, null, null, 0, null, null, 62, null) + ")";
    }

    private e(List list) {
        this.f37913a = new LinkedList(list);
    }
}
