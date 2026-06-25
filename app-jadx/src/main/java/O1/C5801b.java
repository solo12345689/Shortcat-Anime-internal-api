package o1;

import java.util.Arrays;

/* JADX INFO: renamed from: o1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5801b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f54216a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f54217b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f54218c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f54219d = new int[10];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float[] f54220e = new float[10];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f54221f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int[] f54222g = new int[5];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String[] f54223h = new String[5];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f54224i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int[] f54225j = new int[4];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean[] f54226k = new boolean[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f54227l = 0;

    public void a(int i10, float f10) {
        int i11 = this.f54221f;
        int[] iArr = this.f54219d;
        if (i11 >= iArr.length) {
            this.f54219d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f54220e;
            this.f54220e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f54219d;
        int i12 = this.f54221f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f54220e;
        this.f54221f = i12 + 1;
        fArr2[i12] = f10;
    }

    public void b(int i10, int i11) {
        int i12 = this.f54218c;
        int[] iArr = this.f54216a;
        if (i12 >= iArr.length) {
            this.f54216a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f54217b;
            this.f54217b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f54216a;
        int i13 = this.f54218c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f54217b;
        this.f54218c = i13 + 1;
        iArr4[i13] = i11;
    }

    public void c(int i10, String str) {
        int i11 = this.f54224i;
        int[] iArr = this.f54222g;
        if (i11 >= iArr.length) {
            this.f54222g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f54223h;
            this.f54223h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f54222g;
        int i12 = this.f54224i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f54223h;
        this.f54224i = i12 + 1;
        strArr2[i12] = str;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.f54218c + ", mCountFloat=" + this.f54221f + ", mCountString=" + this.f54224i + ", mCountBoolean=" + this.f54227l + '}';
    }
}
