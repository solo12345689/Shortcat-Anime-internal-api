package androidx.compose.ui.platform;

import P3.f;
import Td.InterfaceC2158i;
import Y.U1;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import i0.InterfaceC4957A;
import ie.InterfaceC5082a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class[] f27201a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ P3.f f27203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27204c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, P3.f fVar, String str) {
            super(0);
            this.f27202a = z10;
            this.f27203b = fVar;
            this.f27204c = str;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m81invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m81invoke() {
            if (this.f27202a) {
                this.f27203b.e(this.f27204c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27205a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(C0.f(obj));
        }
    }

    public static final A0 b(View view, P3.i iVar) {
        Object parent = view.getParent();
        AbstractC5504s.f(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(l0.l.f52355H);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, iVar);
    }

    public static final A0 c(String str, P3.i iVar) {
        boolean z10;
        String str2 = h0.p.class.getSimpleName() + ':' + str;
        P3.f savedStateRegistry = iVar.getSavedStateRegistry();
        Bundle bundleA = savedStateRegistry.a(str2);
        final h0.p pVarC = h0.s.c(bundleA != null ? h(bundleA) : null, b.f27205a);
        try {
            savedStateRegistry.c(str2, new f.b() { // from class: androidx.compose.ui.platform.B0
                @Override // P3.f.b
                public final Bundle a() {
                    return C0.d(pVarC);
                }
            });
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new A0(pVarC, new a(z10, savedStateRegistry, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(h0.p pVar) {
        return g(pVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof InterfaceC4957A) {
            InterfaceC4957A interfaceC4957A = (InterfaceC4957A) obj;
            if (interfaceC4957A.d() != U1.j() && interfaceC4957A.d() != U1.q() && interfaceC4957A.d() != U1.n()) {
                return false;
            }
            Object value = interfaceC4957A.getValue();
            if (value == null) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof InterfaceC2158i) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class cls : f27201a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    private static final Map h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            AbstractC5504s.f(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
