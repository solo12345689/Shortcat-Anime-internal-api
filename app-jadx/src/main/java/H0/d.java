package h0;

import Df.AbstractC1268a;
import Td.L;
import Y.AbstractC2393b0;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import i0.InterfaceC4957A;
import ie.InterfaceC5082a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f47548a = 36;

    public static final String c(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object d(Object[] objArr, v vVar, InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(674689872, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:180)");
        }
        Object objE = e(Arrays.copyOf(objArr, objArr.length), vVar, null, interfaceC5082a, interfaceC2425m, (i10 & 112) | 384 | ((i10 << 3) & 7168), 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return objE;
    }

    public static final Object e(Object[] objArr, v vVar, String str, InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        Object[] objArr2;
        final Object obj;
        Object objE;
        if ((i11 & 2) != 0) {
            vVar = y.f();
        }
        final v vVar2 = vVar;
        int i12 = i11 & 4;
        Object objInvoke = null;
        if (i12 != 0) {
            str = null;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(441892779, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)");
        }
        long jB = AbstractC2410h.b(interfaceC2425m, 0);
        if (str == null || str.length() == 0) {
            str = Long.toString(jB, AbstractC1268a.a(f47548a));
            AbstractC5504s.g(str, "toString(...)");
        }
        final String str2 = str;
        AbstractC5504s.f(vVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final p pVar = (p) interfaceC2425m.n(s.g());
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            if (pVar != null && (objE = pVar.e(str2)) != null) {
                objInvoke = vVar2.b(objE);
            }
            if (objInvoke == null) {
                objInvoke = interfaceC5082a.invoke();
            }
            objArr2 = objArr;
            Object fVar = new f(vVar2, pVar, str2, objInvoke, objArr2);
            interfaceC2425m.u(fVar);
            objD = fVar;
        } else {
            objArr2 = objArr;
        }
        final f fVar2 = (f) objD;
        Object objF = fVar2.f(objArr2);
        if (objF == null) {
            objF = interfaceC5082a.invoke();
        }
        boolean zF = interfaceC2425m.F(fVar2) | ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.F(vVar2)) || (i10 & 48) == 32) | interfaceC2425m.F(pVar) | interfaceC2425m.U(str2) | interfaceC2425m.F(objF) | interfaceC2425m.F(objArr2);
        Object objD2 = interfaceC2425m.D();
        if (zF || objD2 == aVar.a()) {
            final Object[] objArr3 = objArr2;
            obj = objF;
            Object obj2 = new InterfaceC5082a() { // from class: h0.c
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return d.g(fVar2, vVar2, pVar, str2, obj, objArr3);
                }
            };
            interfaceC2425m.u(obj2);
            objD2 = obj2;
        } else {
            obj = objF;
        }
        AbstractC2393b0.g((InterfaceC5082a) objD2, interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return obj;
    }

    public static final Object f(Object[] objArr, InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1564532345, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        Object objE = e(Arrays.copyOf(objArr, objArr.length), y.f(), null, interfaceC5082a, interfaceC2425m, ((i10 << 6) & 7168) | 384, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L g(f fVar, v vVar, p pVar, String str, Object obj, Object[] objArr) {
        fVar.h(vVar, pVar, str, obj, objArr);
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(p pVar, Object obj) {
        String strC;
        if (obj == null || pVar.a(obj)) {
            return;
        }
        if (obj instanceof InterfaceC4957A) {
            InterfaceC4957A interfaceC4957A = (InterfaceC4957A) obj;
            if (interfaceC4957A.d() == U1.j() || interfaceC4957A.d() == U1.q() || interfaceC4957A.d() == U1.n()) {
                strC = "MutableState containing " + interfaceC4957A.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strC = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strC = c(obj);
        }
        throw new IllegalArgumentException(strC);
    }
}
