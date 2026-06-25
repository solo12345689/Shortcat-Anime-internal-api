package U;

import R0.C2099h;
import Y.AbstractC2409g1;
import Y.InterfaceC2425m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6230l;
import w0.AbstractC6923b;
import x0.C7032d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a */
    private static final androidx.compose.ui.e f17579a = androidx.compose.foundation.layout.s.r(androidx.compose.ui.e.f26613a, X.g.f21162a.a());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7032d f17580a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f17581b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.ui.e f17582c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f17583d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f17584e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f17585f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7032d c7032d, String str, androidx.compose.ui.e eVar, long j10, int i10, int i11) {
            super(2);
            this.f17580a = c7032d;
            this.f17581b = str;
            this.f17582c = eVar;
            this.f17583d = j10;
            this.f17584e = i10;
            this.f17585f = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            B.b(this.f17580a, this.f17581b, this.f17582c, this.f17583d, interfaceC2425m, AbstractC2409g1.a(this.f17584e | 1), this.f17585f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC6923b f17586a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f17587b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.ui.e f17588c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f17589d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f17590e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f17591f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC6923b abstractC6923b, String str, androidx.compose.ui.e eVar, long j10, int i10, int i11) {
            super(2);
            this.f17586a = abstractC6923b;
            this.f17587b = str;
            this.f17588c = eVar;
            this.f17589d = j10;
            this.f17590e = i10;
            this.f17591f = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            B.a(this.f17586a, this.f17587b, this.f17588c, this.f17589d, interfaceC2425m, AbstractC2409g1.a(this.f17590e | 1), this.f17591f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f17592a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f17592a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((R0.C) obj);
            return Td.L.f17438a;
        }

        public final void invoke(R0.C c10) {
            R0.A.U(c10, this.f17592a);
            R0.A.c0(c10, C2099h.f14960b.e());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(w0.AbstractC6923b r19, java.lang.String r20, androidx.compose.ui.e r21, long r22, Y.InterfaceC2425m r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U.B.a(w0.b, java.lang.String, androidx.compose.ui.e, long, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(x0.C7032d r15, java.lang.String r16, androidx.compose.ui.e r17, long r18, Y.InterfaceC2425m r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U.B.b(x0.d, java.lang.String, androidx.compose.ui.e, long, Y.m, int, int):void");
    }

    private static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, AbstractC6923b abstractC6923b) {
        return eVar.then((C6230l.f(abstractC6923b.k(), C6230l.f58350b.a()) || d(abstractC6923b.k())) ? f17579a : androidx.compose.ui.e.f26613a);
    }

    private static final boolean d(long j10) {
        return Float.isInfinite(C6230l.i(j10)) && Float.isInfinite(C6230l.g(j10));
    }
}
