package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import o1.C5800a;
import org.xmlpull.v1.XmlPullParserException;
import v1.AbstractC6835a;
import v1.AbstractC6836b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: f */
    private static final int[] f28089f = {0, 4, 8};

    /* JADX INFO: renamed from: g */
    private static SparseIntArray f28090g = new SparseIntArray();

    /* JADX INFO: renamed from: h */
    private static SparseIntArray f28091h = new SparseIntArray();

    /* JADX INFO: renamed from: a */
    public String f28092a = "";

    /* JADX INFO: renamed from: b */
    public int f28093b = 0;

    /* JADX INFO: renamed from: c */
    private HashMap f28094c = new HashMap();

    /* JADX INFO: renamed from: d */
    private boolean f28095d = true;

    /* JADX INFO: renamed from: e */
    private HashMap f28096e = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a */
        int f28097a;

        /* JADX INFO: renamed from: b */
        String f28098b;

        /* JADX INFO: renamed from: c */
        public final d f28099c = new d();

        /* JADX INFO: renamed from: d */
        public final c f28100d = new c();

        /* JADX INFO: renamed from: e */
        public final b f28101e = new b();

        /* JADX INFO: renamed from: f */
        public final C0489e f28102f = new C0489e();

        /* JADX INFO: renamed from: g */
        public HashMap f28103g = new HashMap();

        /* JADX INFO: renamed from: h */
        C0488a f28104h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class C0488a {

            /* JADX INFO: renamed from: a */
            int[] f28105a = new int[10];

            /* JADX INFO: renamed from: b */
            int[] f28106b = new int[10];

            /* JADX INFO: renamed from: c */
            int f28107c = 0;

            /* JADX INFO: renamed from: d */
            int[] f28108d = new int[10];

            /* JADX INFO: renamed from: e */
            float[] f28109e = new float[10];

            /* JADX INFO: renamed from: f */
            int f28110f = 0;

            /* JADX INFO: renamed from: g */
            int[] f28111g = new int[5];

            /* JADX INFO: renamed from: h */
            String[] f28112h = new String[5];

            /* JADX INFO: renamed from: i */
            int f28113i = 0;

            /* JADX INFO: renamed from: j */
            int[] f28114j = new int[4];

            /* JADX INFO: renamed from: k */
            boolean[] f28115k = new boolean[4];

            /* JADX INFO: renamed from: l */
            int f28116l = 0;

            C0488a() {
            }

            void a(int i10, float f10) {
                int i11 = this.f28110f;
                int[] iArr = this.f28108d;
                if (i11 >= iArr.length) {
                    this.f28108d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f28109e;
                    this.f28109e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f28108d;
                int i12 = this.f28110f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f28109e;
                this.f28110f = i12 + 1;
                fArr2[i12] = f10;
            }

            void b(int i10, int i11) {
                int i12 = this.f28107c;
                int[] iArr = this.f28105a;
                if (i12 >= iArr.length) {
                    this.f28105a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f28106b;
                    this.f28106b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f28105a;
                int i13 = this.f28107c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f28106b;
                this.f28107c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f28113i;
                int[] iArr = this.f28111g;
                if (i11 >= iArr.length) {
                    this.f28111g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f28112h;
                    this.f28112h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f28111g;
                int i12 = this.f28113i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f28112h;
                this.f28113i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f28116l;
                int[] iArr = this.f28114j;
                if (i11 >= iArr.length) {
                    this.f28114j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f28115k;
                    this.f28115k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f28114j;
                int i12 = this.f28116l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f28115k;
                this.f28116l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public void d(int i10, ConstraintLayout.b bVar) {
            this.f28097a = i10;
            b bVar2 = this.f28101e;
            bVar2.f28160i = bVar.f27993d;
            bVar2.f28162j = bVar.f27995e;
            bVar2.f28164k = bVar.f27997f;
            bVar2.f28166l = bVar.f27999g;
            bVar2.f28168m = bVar.f28001h;
            bVar2.f28170n = bVar.f28003i;
            bVar2.f28172o = bVar.f28005j;
            bVar2.f28174p = bVar.f28007k;
            bVar2.f28176q = bVar.f28009l;
            bVar2.f28177r = bVar.f28011m;
            bVar2.f28178s = bVar.f28013n;
            bVar2.f28179t = bVar.f28021r;
            bVar2.f28180u = bVar.f28023s;
            bVar2.f28181v = bVar.f28025t;
            bVar2.f28182w = bVar.f28027u;
            bVar2.f28183x = bVar.f27966F;
            bVar2.f28184y = bVar.f27967G;
            bVar2.f28185z = bVar.f27968H;
            bVar2.f28118A = bVar.f28015o;
            bVar2.f28119B = bVar.f28017p;
            bVar2.f28120C = bVar.f28019q;
            bVar2.f28121D = bVar.f27983W;
            bVar2.f28122E = bVar.f27984X;
            bVar2.f28123F = bVar.f27985Y;
            bVar2.f28158h = bVar.f27991c;
            bVar2.f28154f = bVar.f27987a;
            bVar2.f28156g = bVar.f27989b;
            bVar2.f28150d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f28152e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f28124G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f28125H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f28126I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f28127J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f28130M = bVar.f27963C;
            bVar2.f28138U = bVar.f27972L;
            bVar2.f28139V = bVar.f27971K;
            bVar2.f28141X = bVar.f27974N;
            bVar2.f28140W = bVar.f27973M;
            bVar2.f28169m0 = bVar.f27986Z;
            bVar2.f28171n0 = bVar.f27988a0;
            bVar2.f28142Y = bVar.f27975O;
            bVar2.f28143Z = bVar.f27976P;
            bVar2.f28145a0 = bVar.f27979S;
            bVar2.f28147b0 = bVar.f27980T;
            bVar2.f28149c0 = bVar.f27977Q;
            bVar2.f28151d0 = bVar.f27978R;
            bVar2.f28153e0 = bVar.f27981U;
            bVar2.f28155f0 = bVar.f27982V;
            bVar2.f28167l0 = bVar.f27990b0;
            bVar2.f28132O = bVar.f28031w;
            bVar2.f28134Q = bVar.f28033y;
            bVar2.f28131N = bVar.f28029v;
            bVar2.f28133P = bVar.f28032x;
            bVar2.f28136S = bVar.f28034z;
            bVar2.f28135R = bVar.f27961A;
            bVar2.f28137T = bVar.f27962B;
            bVar2.f28175p0 = bVar.f27992c0;
            bVar2.f28128K = bVar.getMarginEnd();
            this.f28101e.f28129L = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f28101e;
            bVar.f27993d = bVar2.f28160i;
            bVar.f27995e = bVar2.f28162j;
            bVar.f27997f = bVar2.f28164k;
            bVar.f27999g = bVar2.f28166l;
            bVar.f28001h = bVar2.f28168m;
            bVar.f28003i = bVar2.f28170n;
            bVar.f28005j = bVar2.f28172o;
            bVar.f28007k = bVar2.f28174p;
            bVar.f28009l = bVar2.f28176q;
            bVar.f28011m = bVar2.f28177r;
            bVar.f28013n = bVar2.f28178s;
            bVar.f28021r = bVar2.f28179t;
            bVar.f28023s = bVar2.f28180u;
            bVar.f28025t = bVar2.f28181v;
            bVar.f28027u = bVar2.f28182w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f28124G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f28125H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f28126I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f28127J;
            bVar.f28034z = bVar2.f28136S;
            bVar.f27961A = bVar2.f28135R;
            bVar.f28031w = bVar2.f28132O;
            bVar.f28033y = bVar2.f28134Q;
            bVar.f27966F = bVar2.f28183x;
            bVar.f27967G = bVar2.f28184y;
            bVar.f28015o = bVar2.f28118A;
            bVar.f28017p = bVar2.f28119B;
            bVar.f28019q = bVar2.f28120C;
            bVar.f27968H = bVar2.f28185z;
            bVar.f27983W = bVar2.f28121D;
            bVar.f27984X = bVar2.f28122E;
            bVar.f27972L = bVar2.f28138U;
            bVar.f27971K = bVar2.f28139V;
            bVar.f27974N = bVar2.f28141X;
            bVar.f27973M = bVar2.f28140W;
            bVar.f27986Z = bVar2.f28169m0;
            bVar.f27988a0 = bVar2.f28171n0;
            bVar.f27975O = bVar2.f28142Y;
            bVar.f27976P = bVar2.f28143Z;
            bVar.f27979S = bVar2.f28145a0;
            bVar.f27980T = bVar2.f28147b0;
            bVar.f27977Q = bVar2.f28149c0;
            bVar.f27978R = bVar2.f28151d0;
            bVar.f27981U = bVar2.f28153e0;
            bVar.f27982V = bVar2.f28155f0;
            bVar.f27985Y = bVar2.f28123F;
            bVar.f27991c = bVar2.f28158h;
            bVar.f27987a = bVar2.f28154f;
            bVar.f27989b = bVar2.f28156g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f28150d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f28152e;
            String str = bVar2.f28167l0;
            if (str != null) {
                bVar.f27990b0 = str;
            }
            bVar.f27992c0 = bVar2.f28175p0;
            bVar.setMarginStart(bVar2.f28129L);
            bVar.setMarginEnd(this.f28101e.f28128K);
            bVar.a();
        }

        /* JADX INFO: renamed from: c */
        public a clone() {
            a aVar = new a();
            aVar.f28101e.a(this.f28101e);
            aVar.f28100d.a(this.f28100d);
            aVar.f28099c.a(this.f28099c);
            aVar.f28102f.a(this.f28102f);
            aVar.f28097a = this.f28097a;
            aVar.f28104h = this.f28104h;
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: q0 */
        private static SparseIntArray f28117q0;

        /* JADX INFO: renamed from: d */
        public int f28150d;

        /* JADX INFO: renamed from: e */
        public int f28152e;

        /* JADX INFO: renamed from: j0 */
        public int[] f28163j0;

        /* JADX INFO: renamed from: k0 */
        public String f28165k0;

        /* JADX INFO: renamed from: l0 */
        public String f28167l0;

        /* JADX INFO: renamed from: a */
        public boolean f28144a = false;

        /* JADX INFO: renamed from: b */
        public boolean f28146b = false;

        /* JADX INFO: renamed from: c */
        public boolean f28148c = false;

        /* JADX INFO: renamed from: f */
        public int f28154f = -1;

        /* JADX INFO: renamed from: g */
        public int f28156g = -1;

        /* JADX INFO: renamed from: h */
        public float f28158h = -1.0f;

        /* JADX INFO: renamed from: i */
        public int f28160i = -1;

        /* JADX INFO: renamed from: j */
        public int f28162j = -1;

        /* JADX INFO: renamed from: k */
        public int f28164k = -1;

        /* JADX INFO: renamed from: l */
        public int f28166l = -1;

        /* JADX INFO: renamed from: m */
        public int f28168m = -1;

        /* JADX INFO: renamed from: n */
        public int f28170n = -1;

        /* JADX INFO: renamed from: o */
        public int f28172o = -1;

        /* JADX INFO: renamed from: p */
        public int f28174p = -1;

        /* JADX INFO: renamed from: q */
        public int f28176q = -1;

        /* JADX INFO: renamed from: r */
        public int f28177r = -1;

        /* JADX INFO: renamed from: s */
        public int f28178s = -1;

        /* JADX INFO: renamed from: t */
        public int f28179t = -1;

        /* JADX INFO: renamed from: u */
        public int f28180u = -1;

        /* JADX INFO: renamed from: v */
        public int f28181v = -1;

        /* JADX INFO: renamed from: w */
        public int f28182w = -1;

        /* JADX INFO: renamed from: x */
        public float f28183x = 0.5f;

        /* JADX INFO: renamed from: y */
        public float f28184y = 0.5f;

        /* JADX INFO: renamed from: z */
        public String f28185z = null;

        /* JADX INFO: renamed from: A */
        public int f28118A = -1;

        /* JADX INFO: renamed from: B */
        public int f28119B = 0;

        /* JADX INFO: renamed from: C */
        public float f28120C = 0.0f;

        /* JADX INFO: renamed from: D */
        public int f28121D = -1;

        /* JADX INFO: renamed from: E */
        public int f28122E = -1;

        /* JADX INFO: renamed from: F */
        public int f28123F = -1;

        /* JADX INFO: renamed from: G */
        public int f28124G = 0;

        /* JADX INFO: renamed from: H */
        public int f28125H = 0;

        /* JADX INFO: renamed from: I */
        public int f28126I = 0;

        /* JADX INFO: renamed from: J */
        public int f28127J = 0;

        /* JADX INFO: renamed from: K */
        public int f28128K = 0;

        /* JADX INFO: renamed from: L */
        public int f28129L = 0;

        /* JADX INFO: renamed from: M */
        public int f28130M = 0;

        /* JADX INFO: renamed from: N */
        public int f28131N = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: O */
        public int f28132O = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: P */
        public int f28133P = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Q */
        public int f28134Q = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: R */
        public int f28135R = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: S */
        public int f28136S = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: T */
        public int f28137T = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: U */
        public float f28138U = -1.0f;

        /* JADX INFO: renamed from: V */
        public float f28139V = -1.0f;

        /* JADX INFO: renamed from: W */
        public int f28140W = 0;

        /* JADX INFO: renamed from: X */
        public int f28141X = 0;

        /* JADX INFO: renamed from: Y */
        public int f28142Y = 0;

        /* JADX INFO: renamed from: Z */
        public int f28143Z = 0;

        /* JADX INFO: renamed from: a0 */
        public int f28145a0 = -1;

        /* JADX INFO: renamed from: b0 */
        public int f28147b0 = -1;

        /* JADX INFO: renamed from: c0 */
        public int f28149c0 = -1;

        /* JADX INFO: renamed from: d0 */
        public int f28151d0 = -1;

        /* JADX INFO: renamed from: e0 */
        public float f28153e0 = 1.0f;

        /* JADX INFO: renamed from: f0 */
        public float f28155f0 = 1.0f;

        /* JADX INFO: renamed from: g0 */
        public int f28157g0 = -1;

        /* JADX INFO: renamed from: h0 */
        public int f28159h0 = 0;

        /* JADX INFO: renamed from: i0 */
        public int f28161i0 = -1;

        /* JADX INFO: renamed from: m0 */
        public boolean f28169m0 = false;

        /* JADX INFO: renamed from: n0 */
        public boolean f28171n0 = false;

        /* JADX INFO: renamed from: o0 */
        public boolean f28173o0 = true;

        /* JADX INFO: renamed from: p0 */
        public int f28175p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f28117q0 = sparseIntArray;
            sparseIntArray.append(i.f28398U5, 24);
            f28117q0.append(i.f28406V5, 25);
            f28117q0.append(i.f28422X5, 28);
            f28117q0.append(i.f28430Y5, 29);
            f28117q0.append(i.f28474d6, 35);
            f28117q0.append(i.f28465c6, 34);
            f28117q0.append(i.f28263E5, 4);
            f28117q0.append(i.f28254D5, 3);
            f28117q0.append(i.f28236B5, 1);
            f28117q0.append(i.f28528j6, 6);
            f28117q0.append(i.f28537k6, 7);
            f28117q0.append(i.f28326L5, 17);
            f28117q0.append(i.f28334M5, 18);
            f28117q0.append(i.f28342N5, 19);
            f28117q0.append(i.f28536k5, 26);
            f28117q0.append(i.f28438Z5, 31);
            f28117q0.append(i.f28447a6, 32);
            f28117q0.append(i.f28317K5, 10);
            f28117q0.append(i.f28308J5, 9);
            f28117q0.append(i.f28564n6, 13);
            f28117q0.append(i.f28591q6, 16);
            f28117q0.append(i.f28573o6, 14);
            f28117q0.append(i.f28546l6, 11);
            f28117q0.append(i.f28582p6, 15);
            f28117q0.append(i.f28555m6, 12);
            f28117q0.append(i.f28501g6, 38);
            f28117q0.append(i.f28382S5, 37);
            f28117q0.append(i.f28374R5, 39);
            f28117q0.append(i.f28492f6, 40);
            f28117q0.append(i.f28366Q5, 20);
            f28117q0.append(i.f28483e6, 36);
            f28117q0.append(i.f28299I5, 5);
            f28117q0.append(i.f28390T5, 76);
            f28117q0.append(i.f28456b6, 76);
            f28117q0.append(i.f28414W5, 76);
            f28117q0.append(i.f28245C5, 76);
            f28117q0.append(i.f28227A5, 76);
            f28117q0.append(i.f28563n5, 23);
            f28117q0.append(i.f28581p5, 27);
            f28117q0.append(i.f28599r5, 30);
            f28117q0.append(i.f28608s5, 8);
            f28117q0.append(i.f28572o5, 33);
            f28117q0.append(i.f28590q5, 2);
            f28117q0.append(i.f28545l5, 22);
            f28117q0.append(i.f28554m5, 21);
            f28117q0.append(i.f28510h6, 41);
            f28117q0.append(i.f28350O5, 42);
            f28117q0.append(i.f28671z5, 41);
            f28117q0.append(i.f28662y5, 42);
            f28117q0.append(i.f28600r6, 97);
            f28117q0.append(i.f28272F5, 61);
            f28117q0.append(i.f28290H5, 62);
            f28117q0.append(i.f28281G5, 63);
            f28117q0.append(i.f28519i6, 69);
            f28117q0.append(i.f28358P5, 70);
            f28117q0.append(i.f28644w5, 71);
            f28117q0.append(i.f28626u5, 72);
            f28117q0.append(i.f28635v5, 73);
            f28117q0.append(i.f28653x5, 74);
            f28117q0.append(i.f28617t5, 75);
        }

        public void a(b bVar) {
            this.f28144a = bVar.f28144a;
            this.f28150d = bVar.f28150d;
            this.f28146b = bVar.f28146b;
            this.f28152e = bVar.f28152e;
            this.f28154f = bVar.f28154f;
            this.f28156g = bVar.f28156g;
            this.f28158h = bVar.f28158h;
            this.f28160i = bVar.f28160i;
            this.f28162j = bVar.f28162j;
            this.f28164k = bVar.f28164k;
            this.f28166l = bVar.f28166l;
            this.f28168m = bVar.f28168m;
            this.f28170n = bVar.f28170n;
            this.f28172o = bVar.f28172o;
            this.f28174p = bVar.f28174p;
            this.f28176q = bVar.f28176q;
            this.f28177r = bVar.f28177r;
            this.f28178s = bVar.f28178s;
            this.f28179t = bVar.f28179t;
            this.f28180u = bVar.f28180u;
            this.f28181v = bVar.f28181v;
            this.f28182w = bVar.f28182w;
            this.f28183x = bVar.f28183x;
            this.f28184y = bVar.f28184y;
            this.f28185z = bVar.f28185z;
            this.f28118A = bVar.f28118A;
            this.f28119B = bVar.f28119B;
            this.f28120C = bVar.f28120C;
            this.f28121D = bVar.f28121D;
            this.f28122E = bVar.f28122E;
            this.f28123F = bVar.f28123F;
            this.f28124G = bVar.f28124G;
            this.f28125H = bVar.f28125H;
            this.f28126I = bVar.f28126I;
            this.f28127J = bVar.f28127J;
            this.f28128K = bVar.f28128K;
            this.f28129L = bVar.f28129L;
            this.f28130M = bVar.f28130M;
            this.f28131N = bVar.f28131N;
            this.f28132O = bVar.f28132O;
            this.f28133P = bVar.f28133P;
            this.f28134Q = bVar.f28134Q;
            this.f28135R = bVar.f28135R;
            this.f28136S = bVar.f28136S;
            this.f28137T = bVar.f28137T;
            this.f28138U = bVar.f28138U;
            this.f28139V = bVar.f28139V;
            this.f28140W = bVar.f28140W;
            this.f28141X = bVar.f28141X;
            this.f28142Y = bVar.f28142Y;
            this.f28143Z = bVar.f28143Z;
            this.f28145a0 = bVar.f28145a0;
            this.f28147b0 = bVar.f28147b0;
            this.f28149c0 = bVar.f28149c0;
            this.f28151d0 = bVar.f28151d0;
            this.f28153e0 = bVar.f28153e0;
            this.f28155f0 = bVar.f28155f0;
            this.f28157g0 = bVar.f28157g0;
            this.f28159h0 = bVar.f28159h0;
            this.f28161i0 = bVar.f28161i0;
            this.f28167l0 = bVar.f28167l0;
            int[] iArr = bVar.f28163j0;
            if (iArr != null) {
                this.f28163j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f28163j0 = null;
            }
            this.f28165k0 = bVar.f28165k0;
            this.f28169m0 = bVar.f28169m0;
            this.f28171n0 = bVar.f28171n0;
            this.f28173o0 = bVar.f28173o0;
            this.f28175p0 = bVar.f28175p0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f28527j5);
            this.f28146b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f28117q0.get(index);
                if (i11 == 80) {
                    this.f28169m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f28169m0);
                } else if (i11 == 81) {
                    this.f28171n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f28171n0);
                } else if (i11 != 97) {
                    switch (i11) {
                        case 1:
                            this.f28176q = e.m(typedArrayObtainStyledAttributes, index, this.f28176q);
                            break;
                        case 2:
                            this.f28127J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28127J);
                            break;
                        case 3:
                            this.f28174p = e.m(typedArrayObtainStyledAttributes, index, this.f28174p);
                            break;
                        case 4:
                            this.f28172o = e.m(typedArrayObtainStyledAttributes, index, this.f28172o);
                            break;
                        case 5:
                            this.f28185z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f28121D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f28121D);
                            break;
                        case 7:
                            this.f28122E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f28122E);
                            break;
                        case 8:
                            this.f28128K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28128K);
                            break;
                        case 9:
                            this.f28182w = e.m(typedArrayObtainStyledAttributes, index, this.f28182w);
                            break;
                        case 10:
                            this.f28181v = e.m(typedArrayObtainStyledAttributes, index, this.f28181v);
                            break;
                        case 11:
                            this.f28134Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28134Q);
                            break;
                        case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                            this.f28135R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28135R);
                            break;
                        case 13:
                            this.f28131N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28131N);
                            break;
                        case 14:
                            this.f28133P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28133P);
                            break;
                        case 15:
                            this.f28136S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28136S);
                            break;
                        case 16:
                            this.f28132O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28132O);
                            break;
                        case 17:
                            this.f28154f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f28154f);
                            break;
                        case 18:
                            this.f28156g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f28156g);
                            break;
                        case 19:
                            this.f28158h = typedArrayObtainStyledAttributes.getFloat(index, this.f28158h);
                            break;
                        case 20:
                            this.f28183x = typedArrayObtainStyledAttributes.getFloat(index, this.f28183x);
                            break;
                        case 21:
                            this.f28152e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f28152e);
                            break;
                        case 22:
                            this.f28150d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f28150d);
                            break;
                        case 23:
                            this.f28124G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28124G);
                            break;
                        case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                            this.f28160i = e.m(typedArrayObtainStyledAttributes, index, this.f28160i);
                            break;
                        case 25:
                            this.f28162j = e.m(typedArrayObtainStyledAttributes, index, this.f28162j);
                            break;
                        case 26:
                            this.f28123F = typedArrayObtainStyledAttributes.getInt(index, this.f28123F);
                            break;
                        case 27:
                            this.f28125H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28125H);
                            break;
                        case 28:
                            this.f28164k = e.m(typedArrayObtainStyledAttributes, index, this.f28164k);
                            break;
                        case 29:
                            this.f28166l = e.m(typedArrayObtainStyledAttributes, index, this.f28166l);
                            break;
                        case 30:
                            this.f28129L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28129L);
                            break;
                        case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                            this.f28179t = e.m(typedArrayObtainStyledAttributes, index, this.f28179t);
                            break;
                        case 32:
                            this.f28180u = e.m(typedArrayObtainStyledAttributes, index, this.f28180u);
                            break;
                        case 33:
                            this.f28126I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28126I);
                            break;
                        case 34:
                            this.f28170n = e.m(typedArrayObtainStyledAttributes, index, this.f28170n);
                            break;
                        case 35:
                            this.f28168m = e.m(typedArrayObtainStyledAttributes, index, this.f28168m);
                            break;
                        case 36:
                            this.f28184y = typedArrayObtainStyledAttributes.getFloat(index, this.f28184y);
                            break;
                        case 37:
                            this.f28139V = typedArrayObtainStyledAttributes.getFloat(index, this.f28139V);
                            break;
                        case 38:
                            this.f28138U = typedArrayObtainStyledAttributes.getFloat(index, this.f28138U);
                            break;
                        case 39:
                            this.f28140W = typedArrayObtainStyledAttributes.getInt(index, this.f28140W);
                            break;
                        case 40:
                            this.f28141X = typedArrayObtainStyledAttributes.getInt(index, this.f28141X);
                            break;
                        case 41:
                            e.n(this, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 42:
                            e.n(this, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.f28142Y = typedArrayObtainStyledAttributes.getInt(index, this.f28142Y);
                                    break;
                                case 55:
                                    this.f28143Z = typedArrayObtainStyledAttributes.getInt(index, this.f28143Z);
                                    break;
                                case 56:
                                    this.f28145a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28145a0);
                                    break;
                                case 57:
                                    this.f28147b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28147b0);
                                    break;
                                case 58:
                                    this.f28149c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28149c0);
                                    break;
                                case 59:
                                    this.f28151d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28151d0);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f28118A = e.m(typedArrayObtainStyledAttributes, index, this.f28118A);
                                            break;
                                        case 62:
                                            this.f28119B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28119B);
                                            break;
                                        case 63:
                                            this.f28120C = typedArrayObtainStyledAttributes.getFloat(index, this.f28120C);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f28153e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f28155f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f28157g0 = typedArrayObtainStyledAttributes.getInt(index, this.f28157g0);
                                                    break;
                                                case 73:
                                                    this.f28159h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28159h0);
                                                    break;
                                                case 74:
                                                    this.f28165k0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f28173o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f28173o0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f28117q0.get(index));
                                                    break;
                                                case 77:
                                                    this.f28167l0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 91:
                                                            this.f28177r = e.m(typedArrayObtainStyledAttributes, index, this.f28177r);
                                                            break;
                                                        case 92:
                                                            this.f28178s = e.m(typedArrayObtainStyledAttributes, index, this.f28178s);
                                                            break;
                                                        case 93:
                                                            this.f28130M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28130M);
                                                            break;
                                                        case 94:
                                                            this.f28137T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28137T);
                                                            break;
                                                        default:
                                                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f28117q0.get(index));
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f28175p0 = typedArrayObtainStyledAttributes.getInt(index, this.f28175p0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: o */
        private static SparseIntArray f28186o;

        /* JADX INFO: renamed from: a */
        public boolean f28187a = false;

        /* JADX INFO: renamed from: b */
        public int f28188b = -1;

        /* JADX INFO: renamed from: c */
        public int f28189c = 0;

        /* JADX INFO: renamed from: d */
        public String f28190d = null;

        /* JADX INFO: renamed from: e */
        public int f28191e = -1;

        /* JADX INFO: renamed from: f */
        public int f28192f = 0;

        /* JADX INFO: renamed from: g */
        public float f28193g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public int f28194h = -1;

        /* JADX INFO: renamed from: i */
        public float f28195i = Float.NaN;

        /* JADX INFO: renamed from: j */
        public float f28196j = Float.NaN;

        /* JADX INFO: renamed from: k */
        public int f28197k = -1;

        /* JADX INFO: renamed from: l */
        public String f28198l = null;

        /* JADX INFO: renamed from: m */
        public int f28199m = -3;

        /* JADX INFO: renamed from: n */
        public int f28200n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f28186o = sparseIntArray;
            sparseIntArray.append(i.f28255D6, 1);
            f28186o.append(i.f28273F6, 2);
            f28186o.append(i.f28309J6, 3);
            f28186o.append(i.f28246C6, 4);
            f28186o.append(i.f28237B6, 5);
            f28186o.append(i.f28228A6, 6);
            f28186o.append(i.f28264E6, 7);
            f28186o.append(i.f28300I6, 8);
            f28186o.append(i.f28291H6, 9);
            f28186o.append(i.f28282G6, 10);
        }

        public void a(c cVar) {
            this.f28187a = cVar.f28187a;
            this.f28188b = cVar.f28188b;
            this.f28190d = cVar.f28190d;
            this.f28191e = cVar.f28191e;
            this.f28192f = cVar.f28192f;
            this.f28195i = cVar.f28195i;
            this.f28193g = cVar.f28193g;
            this.f28194h = cVar.f28194h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f28672z6);
            this.f28187a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f28186o.get(index)) {
                    case 1:
                        this.f28195i = typedArrayObtainStyledAttributes.getFloat(index, this.f28195i);
                        break;
                    case 2:
                        this.f28191e = typedArrayObtainStyledAttributes.getInt(index, this.f28191e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f28190d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f28190d = C5800a.f54214c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f28192f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f28188b = e.m(typedArrayObtainStyledAttributes, index, this.f28188b);
                        break;
                    case 6:
                        this.f28189c = typedArrayObtainStyledAttributes.getInteger(index, this.f28189c);
                        break;
                    case 7:
                        this.f28193g = typedArrayObtainStyledAttributes.getFloat(index, this.f28193g);
                        break;
                    case 8:
                        this.f28197k = typedArrayObtainStyledAttributes.getInteger(index, this.f28197k);
                        break;
                    case 9:
                        this.f28196j = typedArrayObtainStyledAttributes.getFloat(index, this.f28196j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f28200n = resourceId;
                            if (resourceId != -1) {
                                this.f28199m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f28198l = string;
                            if (string.indexOf("/") > 0) {
                                this.f28200n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f28199m = -2;
                            } else {
                                this.f28199m = -1;
                            }
                        } else {
                            this.f28199m = typedArrayObtainStyledAttributes.getInteger(index, this.f28200n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d {

        /* JADX INFO: renamed from: a */
        public boolean f28201a = false;

        /* JADX INFO: renamed from: b */
        public int f28202b = 0;

        /* JADX INFO: renamed from: c */
        public int f28203c = 0;

        /* JADX INFO: renamed from: d */
        public float f28204d = 1.0f;

        /* JADX INFO: renamed from: e */
        public float f28205e = Float.NaN;

        public void a(d dVar) {
            this.f28201a = dVar.f28201a;
            this.f28202b = dVar.f28202b;
            this.f28204d = dVar.f28204d;
            this.f28205e = dVar.f28205e;
            this.f28203c = dVar.f28203c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f28399U6);
            this.f28201a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f28415W6) {
                    this.f28204d = typedArrayObtainStyledAttributes.getFloat(index, this.f28204d);
                } else if (index == i.f28407V6) {
                    this.f28202b = typedArrayObtainStyledAttributes.getInt(index, this.f28202b);
                    this.f28202b = e.f28089f[this.f28202b];
                } else if (index == i.f28431Y6) {
                    this.f28203c = typedArrayObtainStyledAttributes.getInt(index, this.f28203c);
                } else if (index == i.f28423X6) {
                    this.f28205e = typedArrayObtainStyledAttributes.getFloat(index, this.f28205e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0489e {

        /* JADX INFO: renamed from: o */
        private static SparseIntArray f28206o;

        /* JADX INFO: renamed from: a */
        public boolean f28207a = false;

        /* JADX INFO: renamed from: b */
        public float f28208b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f28209c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f28210d = 0.0f;

        /* JADX INFO: renamed from: e */
        public float f28211e = 1.0f;

        /* JADX INFO: renamed from: f */
        public float f28212f = 1.0f;

        /* JADX INFO: renamed from: g */
        public float f28213g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public float f28214h = Float.NaN;

        /* JADX INFO: renamed from: i */
        public int f28215i = -1;

        /* JADX INFO: renamed from: j */
        public float f28216j = 0.0f;

        /* JADX INFO: renamed from: k */
        public float f28217k = 0.0f;

        /* JADX INFO: renamed from: l */
        public float f28218l = 0.0f;

        /* JADX INFO: renamed from: m */
        public boolean f28219m = false;

        /* JADX INFO: renamed from: n */
        public float f28220n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f28206o = sparseIntArray;
            sparseIntArray.append(i.f28619t7, 1);
            f28206o.append(i.f28628u7, 2);
            f28206o.append(i.f28637v7, 3);
            f28206o.append(i.f28601r7, 4);
            f28206o.append(i.f28610s7, 5);
            f28206o.append(i.f28565n7, 6);
            f28206o.append(i.f28574o7, 7);
            f28206o.append(i.f28583p7, 8);
            f28206o.append(i.f28592q7, 9);
            f28206o.append(i.f28646w7, 10);
            f28206o.append(i.f28655x7, 11);
            f28206o.append(i.f28664y7, 12);
        }

        public void a(C0489e c0489e) {
            this.f28207a = c0489e.f28207a;
            this.f28208b = c0489e.f28208b;
            this.f28209c = c0489e.f28209c;
            this.f28210d = c0489e.f28210d;
            this.f28211e = c0489e.f28211e;
            this.f28212f = c0489e.f28212f;
            this.f28213g = c0489e.f28213g;
            this.f28214h = c0489e.f28214h;
            this.f28215i = c0489e.f28215i;
            this.f28216j = c0489e.f28216j;
            this.f28217k = c0489e.f28217k;
            this.f28218l = c0489e.f28218l;
            this.f28219m = c0489e.f28219m;
            this.f28220n = c0489e.f28220n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f28556m7);
            this.f28207a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f28206o.get(index)) {
                    case 1:
                        this.f28208b = typedArrayObtainStyledAttributes.getFloat(index, this.f28208b);
                        break;
                    case 2:
                        this.f28209c = typedArrayObtainStyledAttributes.getFloat(index, this.f28209c);
                        break;
                    case 3:
                        this.f28210d = typedArrayObtainStyledAttributes.getFloat(index, this.f28210d);
                        break;
                    case 4:
                        this.f28211e = typedArrayObtainStyledAttributes.getFloat(index, this.f28211e);
                        break;
                    case 5:
                        this.f28212f = typedArrayObtainStyledAttributes.getFloat(index, this.f28212f);
                        break;
                    case 6:
                        this.f28213g = typedArrayObtainStyledAttributes.getDimension(index, this.f28213g);
                        break;
                    case 7:
                        this.f28214h = typedArrayObtainStyledAttributes.getDimension(index, this.f28214h);
                        break;
                    case 8:
                        this.f28216j = typedArrayObtainStyledAttributes.getDimension(index, this.f28216j);
                        break;
                    case 9:
                        this.f28217k = typedArrayObtainStyledAttributes.getDimension(index, this.f28217k);
                        break;
                    case 10:
                        this.f28218l = typedArrayObtainStyledAttributes.getDimension(index, this.f28218l);
                        break;
                    case 11:
                        this.f28219m = true;
                        this.f28220n = typedArrayObtainStyledAttributes.getDimension(index, this.f28220n);
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        this.f28215i = e.m(typedArrayObtainStyledAttributes, index, this.f28215i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f28090g.append(i.f28666z0, 25);
        f28090g.append(i.f28222A0, 26);
        f28090g.append(i.f28240C0, 29);
        f28090g.append(i.f28249D0, 30);
        f28090g.append(i.f28303J0, 36);
        f28090g.append(i.f28294I0, 35);
        f28090g.append(i.f28495g0, 4);
        f28090g.append(i.f28486f0, 3);
        f28090g.append(i.f28450b0, 1);
        f28090g.append(i.f28468d0, 91);
        f28090g.append(i.f28459c0, 92);
        f28090g.append(i.f28377S0, 6);
        f28090g.append(i.f28385T0, 7);
        f28090g.append(i.f28558n0, 17);
        f28090g.append(i.f28567o0, 18);
        f28090g.append(i.f28576p0, 19);
        f28090g.append(i.f28620u, 27);
        f28090g.append(i.f28258E0, 32);
        f28090g.append(i.f28267F0, 33);
        f28090g.append(i.f28549m0, 10);
        f28090g.append(i.f28540l0, 9);
        f28090g.append(i.f28409W0, 13);
        f28090g.append(i.f28433Z0, 16);
        f28090g.append(i.f28417X0, 14);
        f28090g.append(i.f28393U0, 11);
        f28090g.append(i.f28425Y0, 15);
        f28090g.append(i.f28401V0, 12);
        f28090g.append(i.f28329M0, 40);
        f28090g.append(i.f28648x0, 39);
        f28090g.append(i.f28639w0, 41);
        f28090g.append(i.f28321L0, 42);
        f28090g.append(i.f28630v0, 20);
        f28090g.append(i.f28312K0, 37);
        f28090g.append(i.f28531k0, 5);
        f28090g.append(i.f28657y0, 87);
        f28090g.append(i.f28285H0, 87);
        f28090g.append(i.f28231B0, 87);
        f28090g.append(i.f28477e0, 87);
        f28090g.append(i.f28441a0, 87);
        f28090g.append(i.f28665z, 24);
        f28090g.append(i.f28230B, 28);
        f28090g.append(i.f28336N, 31);
        f28090g.append(i.f28344O, 8);
        f28090g.append(i.f28221A, 34);
        f28090g.append(i.f28239C, 2);
        f28090g.append(i.f28647x, 23);
        f28090g.append(i.f28656y, 21);
        f28090g.append(i.f28337N0, 95);
        f28090g.append(i.f28585q0, 96);
        f28090g.append(i.f28638w, 22);
        f28090g.append(i.f28248D, 43);
        f28090g.append(i.f28360Q, 44);
        f28090g.append(i.f28320L, 45);
        f28090g.append(i.f28328M, 46);
        f28090g.append(i.f28311K, 60);
        f28090g.append(i.f28293I, 47);
        f28090g.append(i.f28302J, 48);
        f28090g.append(i.f28257E, 49);
        f28090g.append(i.f28266F, 50);
        f28090g.append(i.f28275G, 51);
        f28090g.append(i.f28284H, 52);
        f28090g.append(i.f28352P, 53);
        f28090g.append(i.f28345O0, 54);
        f28090g.append(i.f28594r0, 55);
        f28090g.append(i.f28353P0, 56);
        f28090g.append(i.f28603s0, 57);
        f28090g.append(i.f28361Q0, 58);
        f28090g.append(i.f28612t0, 59);
        f28090g.append(i.f28504h0, 61);
        f28090g.append(i.f28522j0, 62);
        f28090g.append(i.f28513i0, 63);
        f28090g.append(i.f28368R, 64);
        f28090g.append(i.f28523j1, 65);
        f28090g.append(i.f28416X, 66);
        f28090g.append(i.f28532k1, 67);
        f28090g.append(i.f28460c1, 79);
        f28090g.append(i.f28629v, 38);
        f28090g.append(i.f28451b1, 68);
        f28090g.append(i.f28369R0, 69);
        f28090g.append(i.f28621u0, 70);
        f28090g.append(i.f28442a1, 97);
        f28090g.append(i.f28400V, 71);
        f28090g.append(i.f28384T, 72);
        f28090g.append(i.f28392U, 73);
        f28090g.append(i.f28408W, 74);
        f28090g.append(i.f28376S, 75);
        f28090g.append(i.f28469d1, 76);
        f28090g.append(i.f28276G0, 77);
        f28090g.append(i.f28541l1, 78);
        f28090g.append(i.f28432Z, 80);
        f28090g.append(i.f28424Y, 81);
        f28090g.append(i.f28478e1, 82);
        f28090g.append(i.f28514i1, 83);
        f28090g.append(i.f28505h1, 84);
        f28090g.append(i.f28496g1, 85);
        f28090g.append(i.f28487f1, 86);
        f28091h.append(i.f28571o4, 6);
        f28091h.append(i.f28571o4, 7);
        f28091h.append(i.f28525j3, 27);
        f28091h.append(i.f28598r4, 13);
        f28091h.append(i.f28625u4, 16);
        f28091h.append(i.f28607s4, 14);
        f28091h.append(i.f28580p4, 11);
        f28091h.append(i.f28616t4, 15);
        f28091h.append(i.f28589q4, 12);
        f28091h.append(i.f28517i4, 40);
        f28091h.append(i.f28454b4, 39);
        f28091h.append(i.f28445a4, 41);
        f28091h.append(i.f28508h4, 42);
        f28091h.append(i.f28436Z3, 20);
        f28091h.append(i.f28499g4, 37);
        f28091h.append(i.f28388T3, 5);
        f28091h.append(i.f28463c4, 87);
        f28091h.append(i.f28490f4, 87);
        f28091h.append(i.f28472d4, 87);
        f28091h.append(i.f28364Q3, 87);
        f28091h.append(i.f28356P3, 87);
        f28091h.append(i.f28570o3, 24);
        f28091h.append(i.f28588q3, 28);
        f28091h.append(i.f28243C3, 31);
        f28091h.append(i.f28252D3, 8);
        f28091h.append(i.f28579p3, 34);
        f28091h.append(i.f28597r3, 2);
        f28091h.append(i.f28552m3, 23);
        f28091h.append(i.f28561n3, 21);
        f28091h.append(i.f28526j4, 95);
        f28091h.append(i.f28396U3, 96);
        f28091h.append(i.f28543l3, 22);
        f28091h.append(i.f28606s3, 43);
        f28091h.append(i.f28270F3, 44);
        f28091h.append(i.f28225A3, 45);
        f28091h.append(i.f28234B3, 46);
        f28091h.append(i.f28669z3, 60);
        f28091h.append(i.f28651x3, 47);
        f28091h.append(i.f28660y3, 48);
        f28091h.append(i.f28615t3, 49);
        f28091h.append(i.f28624u3, 50);
        f28091h.append(i.f28633v3, 51);
        f28091h.append(i.f28642w3, 52);
        f28091h.append(i.f28261E3, 53);
        f28091h.append(i.f28535k4, 54);
        f28091h.append(i.f28404V3, 55);
        f28091h.append(i.f28544l4, 56);
        f28091h.append(i.f28412W3, 57);
        f28091h.append(i.f28553m4, 58);
        f28091h.append(i.f28420X3, 59);
        f28091h.append(i.f28380S3, 62);
        f28091h.append(i.f28372R3, 63);
        f28091h.append(i.f28279G3, 64);
        f28091h.append(i.f28271F4, 65);
        f28091h.append(i.f28332M3, 66);
        f28091h.append(i.f28280G4, 67);
        f28091h.append(i.f28652x4, 79);
        f28091h.append(i.f28534k3, 38);
        f28091h.append(i.f28661y4, 98);
        f28091h.append(i.f28643w4, 68);
        f28091h.append(i.f28562n4, 69);
        f28091h.append(i.f28428Y3, 70);
        f28091h.append(i.f28315K3, 71);
        f28091h.append(i.f28297I3, 72);
        f28091h.append(i.f28306J3, 73);
        f28091h.append(i.f28324L3, 74);
        f28091h.append(i.f28288H3, 75);
        f28091h.append(i.f28670z4, 76);
        f28091h.append(i.f28481e4, 77);
        f28091h.append(i.f28289H4, 78);
        f28091h.append(i.f28348O3, 80);
        f28091h.append(i.f28340N3, 81);
        f28091h.append(i.f28226A4, 82);
        f28091h.append(i.f28262E4, 83);
        f28091h.append(i.f28253D4, 84);
        f28091h.append(i.f28244C4, 85);
        f28091h.append(i.f28235B4, 86);
        f28091h.append(i.f28634v4, 97);
    }

    private int[] h(View view, String str) {
        int iIntValue;
        Object objG;
        String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f34694a);
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, DiagnosticsEntry.ID_KEY, context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objG = ((ConstraintLayout) view.getParent()).g(0, strTrim)) != null && (objG instanceof Integer)) {
                iIntValue = ((Integer) objG).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? i.f28516i3 : i.f28611t);
        q(context, aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a j(int i10) {
        if (!this.f28096e.containsKey(Integer.valueOf(i10))) {
            this.f28096e.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f28096e.get(Integer.valueOf(i10));
    }

    public static int m(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void n(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L4
            goto L71
        L4:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L72
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2b
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L27
            r6 = -3
            if (r5 == r6) goto L21
            if (r5 == r0) goto L23
            r6 = -1
            if (r5 == r6) goto L23
        L21:
            r5 = r2
            goto L30
        L23:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L30
        L27:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L30
        L2b:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L23
        L30:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L42
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L3d
            r4.width = r2
            r4.f27986Z = r5
            return
        L3d:
            r4.height = r2
            r4.f27988a0 = r5
            return
        L42:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.b
            if (r6 == 0) goto L54
            androidx.constraintlayout.widget.e$b r4 = (androidx.constraintlayout.widget.e.b) r4
            if (r7 != 0) goto L4f
            r4.f28150d = r2
            r4.f28169m0 = r5
            return
        L4f:
            r4.f28152e = r2
            r4.f28171n0 = r5
            return
        L54:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.a.C0488a
            if (r6 == 0) goto L71
            androidx.constraintlayout.widget.e$a$a r4 = (androidx.constraintlayout.widget.e.a.C0488a) r4
            if (r7 != 0) goto L67
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            return
        L67:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L71:
            return
        L72:
            java.lang.String r5 = r5.getString(r6)
            o(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.n(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void o(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    p(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f28185z = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0488a) {
                        ((a.C0488a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.f27971K = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.f27972L = f10;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f28150d = 0;
                            bVar3.f28139V = f10;
                            return;
                        } else {
                            bVar3.f28152e = 0;
                            bVar3.f28138U = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C0488a) {
                        a.C0488a c0488a = (a.C0488a) obj;
                        if (i10 == 0) {
                            c0488a.b(23, 0);
                            c0488a.a(39, f10);
                            return;
                        } else {
                            c0488a.b(21, 0);
                            c0488a.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.f27981U = fMax;
                            bVar4.f27975O = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.f27982V = fMax;
                            bVar4.f27976P = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f28150d = 0;
                            bVar5.f28153e0 = fMax;
                            bVar5.f28142Y = 2;
                            return;
                        } else {
                            bVar5.f28152e = 0;
                            bVar5.f28155f0 = fMax;
                            bVar5.f28143Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0488a) {
                        a.C0488a c0488a2 = (a.C0488a) obj;
                        if (i10 == 0) {
                            c0488a2.b(23, 0);
                            c0488a2.b(54, 2);
                        } else {
                            c0488a2.b(21, 0);
                            c0488a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void p(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f27968H = str;
        bVar.f27969I = fAbs;
        bVar.f27970J = i10;
    }

    private void q(Context context, a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            r(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != i.f28629v && i.f28336N != index && i.f28344O != index) {
                aVar.f28100d.f28187a = true;
                aVar.f28101e.f28146b = true;
                aVar.f28099c.f28201a = true;
                aVar.f28102f.f28207a = true;
            }
            switch (f28090g.get(index)) {
                case 1:
                    b bVar = aVar.f28101e;
                    bVar.f28176q = m(typedArray, index, bVar.f28176q);
                    break;
                case 2:
                    b bVar2 = aVar.f28101e;
                    bVar2.f28127J = typedArray.getDimensionPixelSize(index, bVar2.f28127J);
                    break;
                case 3:
                    b bVar3 = aVar.f28101e;
                    bVar3.f28174p = m(typedArray, index, bVar3.f28174p);
                    break;
                case 4:
                    b bVar4 = aVar.f28101e;
                    bVar4.f28172o = m(typedArray, index, bVar4.f28172o);
                    break;
                case 5:
                    aVar.f28101e.f28185z = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f28101e;
                    bVar5.f28121D = typedArray.getDimensionPixelOffset(index, bVar5.f28121D);
                    break;
                case 7:
                    b bVar6 = aVar.f28101e;
                    bVar6.f28122E = typedArray.getDimensionPixelOffset(index, bVar6.f28122E);
                    break;
                case 8:
                    b bVar7 = aVar.f28101e;
                    bVar7.f28128K = typedArray.getDimensionPixelSize(index, bVar7.f28128K);
                    break;
                case 9:
                    b bVar8 = aVar.f28101e;
                    bVar8.f28182w = m(typedArray, index, bVar8.f28182w);
                    break;
                case 10:
                    b bVar9 = aVar.f28101e;
                    bVar9.f28181v = m(typedArray, index, bVar9.f28181v);
                    break;
                case 11:
                    b bVar10 = aVar.f28101e;
                    bVar10.f28134Q = typedArray.getDimensionPixelSize(index, bVar10.f28134Q);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    b bVar11 = aVar.f28101e;
                    bVar11.f28135R = typedArray.getDimensionPixelSize(index, bVar11.f28135R);
                    break;
                case 13:
                    b bVar12 = aVar.f28101e;
                    bVar12.f28131N = typedArray.getDimensionPixelSize(index, bVar12.f28131N);
                    break;
                case 14:
                    b bVar13 = aVar.f28101e;
                    bVar13.f28133P = typedArray.getDimensionPixelSize(index, bVar13.f28133P);
                    break;
                case 15:
                    b bVar14 = aVar.f28101e;
                    bVar14.f28136S = typedArray.getDimensionPixelSize(index, bVar14.f28136S);
                    break;
                case 16:
                    b bVar15 = aVar.f28101e;
                    bVar15.f28132O = typedArray.getDimensionPixelSize(index, bVar15.f28132O);
                    break;
                case 17:
                    b bVar16 = aVar.f28101e;
                    bVar16.f28154f = typedArray.getDimensionPixelOffset(index, bVar16.f28154f);
                    break;
                case 18:
                    b bVar17 = aVar.f28101e;
                    bVar17.f28156g = typedArray.getDimensionPixelOffset(index, bVar17.f28156g);
                    break;
                case 19:
                    b bVar18 = aVar.f28101e;
                    bVar18.f28158h = typedArray.getFloat(index, bVar18.f28158h);
                    break;
                case 20:
                    b bVar19 = aVar.f28101e;
                    bVar19.f28183x = typedArray.getFloat(index, bVar19.f28183x);
                    break;
                case 21:
                    b bVar20 = aVar.f28101e;
                    bVar20.f28152e = typedArray.getLayoutDimension(index, bVar20.f28152e);
                    break;
                case 22:
                    d dVar = aVar.f28099c;
                    dVar.f28202b = typedArray.getInt(index, dVar.f28202b);
                    d dVar2 = aVar.f28099c;
                    dVar2.f28202b = f28089f[dVar2.f28202b];
                    break;
                case 23:
                    b bVar21 = aVar.f28101e;
                    bVar21.f28150d = typedArray.getLayoutDimension(index, bVar21.f28150d);
                    break;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    b bVar22 = aVar.f28101e;
                    bVar22.f28124G = typedArray.getDimensionPixelSize(index, bVar22.f28124G);
                    break;
                case 25:
                    b bVar23 = aVar.f28101e;
                    bVar23.f28160i = m(typedArray, index, bVar23.f28160i);
                    break;
                case 26:
                    b bVar24 = aVar.f28101e;
                    bVar24.f28162j = m(typedArray, index, bVar24.f28162j);
                    break;
                case 27:
                    b bVar25 = aVar.f28101e;
                    bVar25.f28123F = typedArray.getInt(index, bVar25.f28123F);
                    break;
                case 28:
                    b bVar26 = aVar.f28101e;
                    bVar26.f28125H = typedArray.getDimensionPixelSize(index, bVar26.f28125H);
                    break;
                case 29:
                    b bVar27 = aVar.f28101e;
                    bVar27.f28164k = m(typedArray, index, bVar27.f28164k);
                    break;
                case 30:
                    b bVar28 = aVar.f28101e;
                    bVar28.f28166l = m(typedArray, index, bVar28.f28166l);
                    break;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    b bVar29 = aVar.f28101e;
                    bVar29.f28129L = typedArray.getDimensionPixelSize(index, bVar29.f28129L);
                    break;
                case 32:
                    b bVar30 = aVar.f28101e;
                    bVar30.f28179t = m(typedArray, index, bVar30.f28179t);
                    break;
                case 33:
                    b bVar31 = aVar.f28101e;
                    bVar31.f28180u = m(typedArray, index, bVar31.f28180u);
                    break;
                case 34:
                    b bVar32 = aVar.f28101e;
                    bVar32.f28126I = typedArray.getDimensionPixelSize(index, bVar32.f28126I);
                    break;
                case 35:
                    b bVar33 = aVar.f28101e;
                    bVar33.f28170n = m(typedArray, index, bVar33.f28170n);
                    break;
                case 36:
                    b bVar34 = aVar.f28101e;
                    bVar34.f28168m = m(typedArray, index, bVar34.f28168m);
                    break;
                case 37:
                    b bVar35 = aVar.f28101e;
                    bVar35.f28184y = typedArray.getFloat(index, bVar35.f28184y);
                    break;
                case 38:
                    aVar.f28097a = typedArray.getResourceId(index, aVar.f28097a);
                    break;
                case 39:
                    b bVar36 = aVar.f28101e;
                    bVar36.f28139V = typedArray.getFloat(index, bVar36.f28139V);
                    break;
                case 40:
                    b bVar37 = aVar.f28101e;
                    bVar37.f28138U = typedArray.getFloat(index, bVar37.f28138U);
                    break;
                case 41:
                    b bVar38 = aVar.f28101e;
                    bVar38.f28140W = typedArray.getInt(index, bVar38.f28140W);
                    break;
                case 42:
                    b bVar39 = aVar.f28101e;
                    bVar39.f28141X = typedArray.getInt(index, bVar39.f28141X);
                    break;
                case 43:
                    d dVar3 = aVar.f28099c;
                    dVar3.f28204d = typedArray.getFloat(index, dVar3.f28204d);
                    break;
                case 44:
                    C0489e c0489e = aVar.f28102f;
                    c0489e.f28219m = true;
                    c0489e.f28220n = typedArray.getDimension(index, c0489e.f28220n);
                    break;
                case 45:
                    C0489e c0489e2 = aVar.f28102f;
                    c0489e2.f28209c = typedArray.getFloat(index, c0489e2.f28209c);
                    break;
                case 46:
                    C0489e c0489e3 = aVar.f28102f;
                    c0489e3.f28210d = typedArray.getFloat(index, c0489e3.f28210d);
                    break;
                case 47:
                    C0489e c0489e4 = aVar.f28102f;
                    c0489e4.f28211e = typedArray.getFloat(index, c0489e4.f28211e);
                    break;
                case 48:
                    C0489e c0489e5 = aVar.f28102f;
                    c0489e5.f28212f = typedArray.getFloat(index, c0489e5.f28212f);
                    break;
                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    C0489e c0489e6 = aVar.f28102f;
                    c0489e6.f28213g = typedArray.getDimension(index, c0489e6.f28213g);
                    break;
                case 50:
                    C0489e c0489e7 = aVar.f28102f;
                    c0489e7.f28214h = typedArray.getDimension(index, c0489e7.f28214h);
                    break;
                case 51:
                    C0489e c0489e8 = aVar.f28102f;
                    c0489e8.f28216j = typedArray.getDimension(index, c0489e8.f28216j);
                    break;
                case 52:
                    C0489e c0489e9 = aVar.f28102f;
                    c0489e9.f28217k = typedArray.getDimension(index, c0489e9.f28217k);
                    break;
                case 53:
                    C0489e c0489e10 = aVar.f28102f;
                    c0489e10.f28218l = typedArray.getDimension(index, c0489e10.f28218l);
                    break;
                case 54:
                    b bVar40 = aVar.f28101e;
                    bVar40.f28142Y = typedArray.getInt(index, bVar40.f28142Y);
                    break;
                case 55:
                    b bVar41 = aVar.f28101e;
                    bVar41.f28143Z = typedArray.getInt(index, bVar41.f28143Z);
                    break;
                case 56:
                    b bVar42 = aVar.f28101e;
                    bVar42.f28145a0 = typedArray.getDimensionPixelSize(index, bVar42.f28145a0);
                    break;
                case 57:
                    b bVar43 = aVar.f28101e;
                    bVar43.f28147b0 = typedArray.getDimensionPixelSize(index, bVar43.f28147b0);
                    break;
                case 58:
                    b bVar44 = aVar.f28101e;
                    bVar44.f28149c0 = typedArray.getDimensionPixelSize(index, bVar44.f28149c0);
                    break;
                case 59:
                    b bVar45 = aVar.f28101e;
                    bVar45.f28151d0 = typedArray.getDimensionPixelSize(index, bVar45.f28151d0);
                    break;
                case 60:
                    C0489e c0489e11 = aVar.f28102f;
                    c0489e11.f28208b = typedArray.getFloat(index, c0489e11.f28208b);
                    break;
                case 61:
                    b bVar46 = aVar.f28101e;
                    bVar46.f28118A = m(typedArray, index, bVar46.f28118A);
                    break;
                case 62:
                    b bVar47 = aVar.f28101e;
                    bVar47.f28119B = typedArray.getDimensionPixelSize(index, bVar47.f28119B);
                    break;
                case 63:
                    b bVar48 = aVar.f28101e;
                    bVar48.f28120C = typedArray.getFloat(index, bVar48.f28120C);
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    c cVar = aVar.f28100d;
                    cVar.f28188b = m(typedArray, index, cVar.f28188b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f28100d.f28190d = typedArray.getString(index);
                    } else {
                        aVar.f28100d.f28190d = C5800a.f54214c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f28100d.f28192f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f28100d;
                    cVar2.f28195i = typedArray.getFloat(index, cVar2.f28195i);
                    break;
                case 68:
                    d dVar4 = aVar.f28099c;
                    dVar4.f28205e = typedArray.getFloat(index, dVar4.f28205e);
                    break;
                case 69:
                    aVar.f28101e.f28153e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f28101e.f28155f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f28101e;
                    bVar49.f28157g0 = typedArray.getInt(index, bVar49.f28157g0);
                    break;
                case 73:
                    b bVar50 = aVar.f28101e;
                    bVar50.f28159h0 = typedArray.getDimensionPixelSize(index, bVar50.f28159h0);
                    break;
                case 74:
                    aVar.f28101e.f28165k0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f28101e;
                    bVar51.f28173o0 = typedArray.getBoolean(index, bVar51.f28173o0);
                    break;
                case 76:
                    c cVar3 = aVar.f28100d;
                    cVar3.f28191e = typedArray.getInt(index, cVar3.f28191e);
                    break;
                case 77:
                    aVar.f28101e.f28167l0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f28099c;
                    dVar5.f28203c = typedArray.getInt(index, dVar5.f28203c);
                    break;
                case 79:
                    c cVar4 = aVar.f28100d;
                    cVar4.f28193g = typedArray.getFloat(index, cVar4.f28193g);
                    break;
                case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                    b bVar52 = aVar.f28101e;
                    bVar52.f28169m0 = typedArray.getBoolean(index, bVar52.f28169m0);
                    break;
                case 81:
                    b bVar53 = aVar.f28101e;
                    bVar53.f28171n0 = typedArray.getBoolean(index, bVar53.f28171n0);
                    break;
                case 82:
                    c cVar5 = aVar.f28100d;
                    cVar5.f28189c = typedArray.getInteger(index, cVar5.f28189c);
                    break;
                case 83:
                    C0489e c0489e12 = aVar.f28102f;
                    c0489e12.f28215i = m(typedArray, index, c0489e12.f28215i);
                    break;
                case 84:
                    c cVar6 = aVar.f28100d;
                    cVar6.f28197k = typedArray.getInteger(index, cVar6.f28197k);
                    break;
                case 85:
                    c cVar7 = aVar.f28100d;
                    cVar7.f28196j = typedArray.getFloat(index, cVar7.f28196j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f28100d.f28200n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f28100d;
                        if (cVar8.f28200n != -1) {
                            cVar8.f28199m = -2;
                        }
                    } else if (i11 == 3) {
                        aVar.f28100d.f28198l = typedArray.getString(index);
                        if (aVar.f28100d.f28198l.indexOf("/") > 0) {
                            aVar.f28100d.f28200n = typedArray.getResourceId(index, -1);
                            aVar.f28100d.f28199m = -2;
                        } else {
                            aVar.f28100d.f28199m = -1;
                        }
                    } else {
                        c cVar9 = aVar.f28100d;
                        cVar9.f28199m = typedArray.getInteger(index, cVar9.f28200n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f28090g.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f28090g.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f28101e;
                    bVar54.f28177r = m(typedArray, index, bVar54.f28177r);
                    break;
                case 92:
                    b bVar55 = aVar.f28101e;
                    bVar55.f28178s = m(typedArray, index, bVar55.f28178s);
                    break;
                case 93:
                    b bVar56 = aVar.f28101e;
                    bVar56.f28130M = typedArray.getDimensionPixelSize(index, bVar56.f28130M);
                    break;
                case 94:
                    b bVar57 = aVar.f28101e;
                    bVar57.f28137T = typedArray.getDimensionPixelSize(index, bVar57.f28137T);
                    break;
                case 95:
                    n(aVar.f28101e, typedArray, index, 0);
                    break;
                case 96:
                    n(aVar.f28101e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f28101e;
                    bVar58.f28175p0 = typedArray.getInt(index, bVar58.f28175p0);
                    break;
            }
        }
    }

    private static void r(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0488a c0488a = new a.C0488a();
        aVar.f28104h = c0488a;
        aVar.f28100d.f28187a = false;
        aVar.f28101e.f28146b = false;
        aVar.f28099c.f28201a = false;
        aVar.f28102f.f28207a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f28091h.get(index)) {
                case 2:
                    c0488a.b(2, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28127J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f28090g.get(index));
                    break;
                case 5:
                    c0488a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0488a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f28101e.f28121D));
                    break;
                case 7:
                    c0488a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f28101e.f28122E));
                    break;
                case 8:
                    c0488a.b(8, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28128K));
                    break;
                case 11:
                    c0488a.b(11, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28134Q));
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    c0488a.b(12, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28135R));
                    break;
                case 13:
                    c0488a.b(13, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28131N));
                    break;
                case 14:
                    c0488a.b(14, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28133P));
                    break;
                case 15:
                    c0488a.b(15, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28136S));
                    break;
                case 16:
                    c0488a.b(16, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28132O));
                    break;
                case 17:
                    c0488a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f28101e.f28154f));
                    break;
                case 18:
                    c0488a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f28101e.f28156g));
                    break;
                case 19:
                    c0488a.a(19, typedArray.getFloat(index, aVar.f28101e.f28158h));
                    break;
                case 20:
                    c0488a.a(20, typedArray.getFloat(index, aVar.f28101e.f28183x));
                    break;
                case 21:
                    c0488a.b(21, typedArray.getLayoutDimension(index, aVar.f28101e.f28152e));
                    break;
                case 22:
                    c0488a.b(22, f28089f[typedArray.getInt(index, aVar.f28099c.f28202b)]);
                    break;
                case 23:
                    c0488a.b(23, typedArray.getLayoutDimension(index, aVar.f28101e.f28150d));
                    break;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    c0488a.b(24, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28124G));
                    break;
                case 27:
                    c0488a.b(27, typedArray.getInt(index, aVar.f28101e.f28123F));
                    break;
                case 28:
                    c0488a.b(28, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28125H));
                    break;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    c0488a.b(31, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28129L));
                    break;
                case 34:
                    c0488a.b(34, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28126I));
                    break;
                case 37:
                    c0488a.a(37, typedArray.getFloat(index, aVar.f28101e.f28184y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f28097a);
                    aVar.f28097a = resourceId;
                    c0488a.b(38, resourceId);
                    break;
                case 39:
                    c0488a.a(39, typedArray.getFloat(index, aVar.f28101e.f28139V));
                    break;
                case 40:
                    c0488a.a(40, typedArray.getFloat(index, aVar.f28101e.f28138U));
                    break;
                case 41:
                    c0488a.b(41, typedArray.getInt(index, aVar.f28101e.f28140W));
                    break;
                case 42:
                    c0488a.b(42, typedArray.getInt(index, aVar.f28101e.f28141X));
                    break;
                case 43:
                    c0488a.a(43, typedArray.getFloat(index, aVar.f28099c.f28204d));
                    break;
                case 44:
                    c0488a.d(44, true);
                    c0488a.a(44, typedArray.getDimension(index, aVar.f28102f.f28220n));
                    break;
                case 45:
                    c0488a.a(45, typedArray.getFloat(index, aVar.f28102f.f28209c));
                    break;
                case 46:
                    c0488a.a(46, typedArray.getFloat(index, aVar.f28102f.f28210d));
                    break;
                case 47:
                    c0488a.a(47, typedArray.getFloat(index, aVar.f28102f.f28211e));
                    break;
                case 48:
                    c0488a.a(48, typedArray.getFloat(index, aVar.f28102f.f28212f));
                    break;
                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    c0488a.a(49, typedArray.getDimension(index, aVar.f28102f.f28213g));
                    break;
                case 50:
                    c0488a.a(50, typedArray.getDimension(index, aVar.f28102f.f28214h));
                    break;
                case 51:
                    c0488a.a(51, typedArray.getDimension(index, aVar.f28102f.f28216j));
                    break;
                case 52:
                    c0488a.a(52, typedArray.getDimension(index, aVar.f28102f.f28217k));
                    break;
                case 53:
                    c0488a.a(53, typedArray.getDimension(index, aVar.f28102f.f28218l));
                    break;
                case 54:
                    c0488a.b(54, typedArray.getInt(index, aVar.f28101e.f28142Y));
                    break;
                case 55:
                    c0488a.b(55, typedArray.getInt(index, aVar.f28101e.f28143Z));
                    break;
                case 56:
                    c0488a.b(56, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28145a0));
                    break;
                case 57:
                    c0488a.b(57, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28147b0));
                    break;
                case 58:
                    c0488a.b(58, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28149c0));
                    break;
                case 59:
                    c0488a.b(59, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28151d0));
                    break;
                case 60:
                    c0488a.a(60, typedArray.getFloat(index, aVar.f28102f.f28208b));
                    break;
                case 62:
                    c0488a.b(62, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28119B));
                    break;
                case 63:
                    c0488a.a(63, typedArray.getFloat(index, aVar.f28101e.f28120C));
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    c0488a.b(64, m(typedArray, index, aVar.f28100d.f28188b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0488a.c(65, typedArray.getString(index));
                    } else {
                        c0488a.c(65, C5800a.f54214c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0488a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0488a.a(67, typedArray.getFloat(index, aVar.f28100d.f28195i));
                    break;
                case 68:
                    c0488a.a(68, typedArray.getFloat(index, aVar.f28099c.f28205e));
                    break;
                case 69:
                    c0488a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0488a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0488a.b(72, typedArray.getInt(index, aVar.f28101e.f28157g0));
                    break;
                case 73:
                    c0488a.b(73, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28159h0));
                    break;
                case 74:
                    c0488a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0488a.d(75, typedArray.getBoolean(index, aVar.f28101e.f28173o0));
                    break;
                case 76:
                    c0488a.b(76, typedArray.getInt(index, aVar.f28100d.f28191e));
                    break;
                case 77:
                    c0488a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0488a.b(78, typedArray.getInt(index, aVar.f28099c.f28203c));
                    break;
                case 79:
                    c0488a.a(79, typedArray.getFloat(index, aVar.f28100d.f28193g));
                    break;
                case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                    c0488a.d(80, typedArray.getBoolean(index, aVar.f28101e.f28169m0));
                    break;
                case 81:
                    c0488a.d(81, typedArray.getBoolean(index, aVar.f28101e.f28171n0));
                    break;
                case 82:
                    c0488a.b(82, typedArray.getInteger(index, aVar.f28100d.f28189c));
                    break;
                case 83:
                    c0488a.b(83, m(typedArray, index, aVar.f28102f.f28215i));
                    break;
                case 84:
                    c0488a.b(84, typedArray.getInteger(index, aVar.f28100d.f28197k));
                    break;
                case 85:
                    c0488a.a(85, typedArray.getFloat(index, aVar.f28100d.f28196j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f28100d.f28200n = typedArray.getResourceId(index, -1);
                        c0488a.b(89, aVar.f28100d.f28200n);
                        c cVar = aVar.f28100d;
                        if (cVar.f28200n != -1) {
                            cVar.f28199m = -2;
                            c0488a.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        aVar.f28100d.f28198l = typedArray.getString(index);
                        c0488a.c(90, aVar.f28100d.f28198l);
                        if (aVar.f28100d.f28198l.indexOf("/") > 0) {
                            aVar.f28100d.f28200n = typedArray.getResourceId(index, -1);
                            c0488a.b(89, aVar.f28100d.f28200n);
                            aVar.f28100d.f28199m = -2;
                            c0488a.b(88, -2);
                        } else {
                            aVar.f28100d.f28199m = -1;
                            c0488a.b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.f28100d;
                        cVar2.f28199m = typedArray.getInteger(index, cVar2.f28200n);
                        c0488a.b(88, aVar.f28100d.f28199m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f28090g.get(index));
                    break;
                case 93:
                    c0488a.b(93, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28130M));
                    break;
                case 94:
                    c0488a.b(94, typedArray.getDimensionPixelSize(index, aVar.f28101e.f28137T));
                    break;
                case 95:
                    n(c0488a, typedArray, index, 0);
                    break;
                case 96:
                    n(c0488a, typedArray, index, 1);
                    break;
                case 97:
                    c0488a.b(97, typedArray.getInt(index, aVar.f28101e.f28175p0));
                    break;
                case 98:
                    if (AbstractC6836b.f61859y) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f28097a);
                        aVar.f28097a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f28098b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f28098b = typedArray.getString(index);
                    } else {
                        aVar.f28097a = typedArray.getResourceId(index, aVar.f28097a);
                    }
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f28096e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f28096e.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + AbstractC6835a.a(childAt));
            } else {
                if (this.f28095d && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f28096e.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = (a) this.f28096e.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                aVar.f28101e.f28161i0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id2);
                                aVar2.setType(aVar.f28101e.f28157g0);
                                aVar2.setMargin(aVar.f28101e.f28159h0);
                                aVar2.setAllowsGoneWidget(aVar.f28101e.f28173o0);
                                b bVar = aVar.f28101e;
                                int[] iArr = bVar.f28163j0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f28165k0;
                                    if (str != null) {
                                        bVar.f28163j0 = h(aVar2, str);
                                        aVar2.setReferencedIds(aVar.f28101e.f28163j0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.b(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.b.c(childAt, aVar.f28103g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f28099c;
                            if (dVar.f28203c == 0) {
                                childAt.setVisibility(dVar.f28202b);
                            }
                            childAt.setAlpha(aVar.f28099c.f28204d);
                            childAt.setRotation(aVar.f28102f.f28208b);
                            childAt.setRotationX(aVar.f28102f.f28209c);
                            childAt.setRotationY(aVar.f28102f.f28210d);
                            childAt.setScaleX(aVar.f28102f.f28211e);
                            childAt.setScaleY(aVar.f28102f.f28212f);
                            C0489e c0489e = aVar.f28102f;
                            if (c0489e.f28215i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f28102f.f28215i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0489e.f28213g)) {
                                    childAt.setPivotX(aVar.f28102f.f28213g);
                                }
                                if (!Float.isNaN(aVar.f28102f.f28214h)) {
                                    childAt.setPivotY(aVar.f28102f.f28214h);
                                }
                            }
                            childAt.setTranslationX(aVar.f28102f.f28216j);
                            childAt.setTranslationY(aVar.f28102f.f28217k);
                            childAt.setTranslationZ(aVar.f28102f.f28218l);
                            C0489e c0489e2 = aVar.f28102f;
                            if (c0489e2.f28219m) {
                                childAt.setElevation(c0489e2.f28220n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar3 = (a) this.f28096e.get(num);
            if (aVar3 != null) {
                if (aVar3.f28101e.f28161i0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f28101e;
                    int[] iArr2 = bVar3.f28163j0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f28165k0;
                        if (str2 != null) {
                            bVar3.f28163j0 = h(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f28101e.f28163j0);
                        }
                    }
                    aVar4.setType(aVar3.f28101e.f28157g0);
                    aVar4.setMargin(aVar3.f28101e.f28159h0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    aVar4.o();
                    aVar3.b(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(aVar4, bVarGenerateDefaultLayoutParams);
                }
                if (aVar3.f28101e.f28144a) {
                    View gVar = new g(constraintLayout.getContext());
                    gVar.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.b(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(gVar, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).f(constraintLayout);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f28096e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f28095d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f28096e.containsKey(Integer.valueOf(id2))) {
                this.f28096e.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f28096e.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f28103g = androidx.constraintlayout.widget.b.a(this.f28094c, childAt);
                aVar.d(id2, bVar);
                aVar.f28099c.f28202b = childAt.getVisibility();
                aVar.f28099c.f28204d = childAt.getAlpha();
                aVar.f28102f.f28208b = childAt.getRotation();
                aVar.f28102f.f28209c = childAt.getRotationX();
                aVar.f28102f.f28210d = childAt.getRotationY();
                aVar.f28102f.f28211e = childAt.getScaleX();
                aVar.f28102f.f28212f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0489e c0489e = aVar.f28102f;
                    c0489e.f28213g = pivotX;
                    c0489e.f28214h = pivotY;
                }
                aVar.f28102f.f28216j = childAt.getTranslationX();
                aVar.f28102f.f28217k = childAt.getTranslationY();
                aVar.f28102f.f28218l = childAt.getTranslationZ();
                C0489e c0489e2 = aVar.f28102f;
                if (c0489e2.f28219m) {
                    c0489e2.f28220n = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.f28101e.f28173o0 = aVar2.getAllowsGoneWidget();
                    aVar.f28101e.f28163j0 = aVar2.getReferencedIds();
                    aVar.f28101e.f28157g0 = aVar2.getType();
                    aVar.f28101e.f28159h0 = aVar2.getMargin();
                }
            }
        }
    }

    public void g(int i10, int i11, int i12, float f10) {
        b bVar = j(i10).f28101e;
        bVar.f28118A = i11;
        bVar.f28119B = i12;
        bVar.f28120C = f10;
    }

    public void k(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarI = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarI.f28101e.f28144a = true;
                    }
                    this.f28096e.put(Integer.valueOf(aVarI.f28097a), aVarI);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x01aa, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(android.content.Context r8, org.xmlpull.v1.XmlPullParser r9) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
