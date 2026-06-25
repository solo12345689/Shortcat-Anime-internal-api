package P4;

import P4.a;
import android.graphics.Bitmap;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f13492u = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f13493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f13494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0215a f13495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f13496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f13497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short[] f13498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f13499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f13500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f13501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f13502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f13504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f13505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f13506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f13507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f13508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f13509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f13511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Bitmap.Config f13512t;

    public e(a.InterfaceC0215a interfaceC0215a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0215a);
        r(cVar, byteBuffer, i10);
    }

    private int b(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f13508p + i10; i18++) {
            byte[] bArr = this.f13501i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f13493a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f13508p + i20; i21++) {
            byte[] bArr2 = this.f13501i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f13493a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void c(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f13502j;
        int i14 = bVar.f13467d;
        int i15 = this.f13508p;
        int i16 = i14 / i15;
        int i17 = bVar.f13465b / i15;
        int i18 = bVar.f13466c / i15;
        int i19 = bVar.f13464a / i15;
        boolean z10 = this.f13503k == 0;
        int i20 = this.f13510r;
        int i21 = this.f13509q;
        byte[] bArr = this.f13501i;
        int[] iArr2 = this.f13493a;
        Boolean bool = this.f13511s;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (bVar.f13468e) {
                if (i23 >= i16) {
                    int i26 = i25 + 1;
                    i10 = i16;
                    if (i26 == 2) {
                        i25 = i26;
                        i23 = 4;
                    } else if (i26 == 3) {
                        i25 = i26;
                        i22 = 4;
                        i23 = 2;
                    } else if (i26 != 4) {
                        i25 = i26;
                    } else {
                        i25 = i26;
                        i23 = 1;
                        i22 = 2;
                    }
                } else {
                    i10 = i16;
                }
                i11 = i23 + i22;
            } else {
                i10 = i16;
                i11 = i23;
                i23 = i24;
            }
            int i27 = i23 + i17;
            boolean z11 = i15 == 1;
            if (i27 < i21) {
                int i28 = i27 * i20;
                int i29 = i28 + i19;
                int i30 = i29 + i18;
                int i31 = i28 + i20;
                if (i31 < i30) {
                    i30 = i31;
                }
                i12 = i11;
                int i32 = i24 * i15 * bVar.f13466c;
                if (z11) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & 255];
                        if (i35 != 0) {
                            iArr3[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i15;
                        i33 = i34 + 1;
                    }
                } else {
                    int i36 = ((i30 - i29) * i15) + i32;
                    i13 = i15;
                    int i37 = i29;
                    while (i37 < i30) {
                        int i38 = i30;
                        int iB = b(i32, i36, bVar.f13466c);
                        if (iB != 0) {
                            iArr3[i37] = iB;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i13;
                        i37++;
                        i30 = i38;
                    }
                    i24++;
                    i15 = i13;
                    iArr = iArr3;
                    i16 = i10;
                    i23 = i12;
                }
            } else {
                i12 = i11;
            }
            i13 = i15;
            i24++;
            i15 = i13;
            iArr = iArr3;
            i16 = i10;
            i23 = i12;
        }
        if (this.f13511s == null) {
            this.f13511s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void d(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f13502j;
        int i10 = bVar2.f13467d;
        int i11 = bVar2.f13465b;
        int i12 = bVar2.f13466c;
        int i13 = bVar2.f13464a;
        boolean z10 = this.f13503k == 0;
        int i14 = this.f13510r;
        byte[] bArr = this.f13501i;
        int[] iArr2 = this.f13493a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f13466c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & 255;
                if (i22 != b10) {
                    int i23 = iArr2[i22];
                    if (i23 != 0) {
                        iArr3[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                iArr = iArr3;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f13511s;
        this.f13511s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f13511s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void m(b bVar) {
        int i10;
        int i11;
        byte[] bArr;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f13496d.position(bVar.f13473j);
        }
        if (bVar == null) {
            c cVar = eVar.f13504l;
            i10 = cVar.f13480f;
            i11 = cVar.f13481g;
        } else {
            i10 = bVar.f13466c;
            i11 = bVar.f13467d;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = eVar.f13501i;
        if (bArr2 == null || bArr2.length < i12) {
            eVar.f13501i = eVar.f13495c.b(i12);
        }
        byte[] bArr3 = eVar.f13501i;
        if (eVar.f13498f == null) {
            eVar.f13498f = new short[4096];
        }
        short[] sArr = eVar.f13498f;
        if (eVar.f13499g == null) {
            eVar.f13499g = new byte[4096];
        }
        byte[] bArr4 = eVar.f13499g;
        if (eVar.f13500h == null) {
            eVar.f13500h = new byte[4097];
        }
        byte[] bArr5 = eVar.f13500h;
        int iQ = eVar.q();
        int i13 = 1 << iQ;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iQ + 1;
        int i17 = (1 << i16) - 1;
        byte b10 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr4[i18] = (byte) i18;
        }
        byte[] bArr6 = eVar.f13497e;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int iP = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (true) {
            if (i22 >= i12) {
                break;
            }
            if (iP == 0) {
                iP = eVar.p();
                if (iP <= 0) {
                    eVar.f13507o = 3;
                    break;
                }
                i23 = b10;
            }
            i25 += (bArr6[i23] & 255) << i24;
            i23++;
            iP--;
            int i30 = i24 + 8;
            int i31 = i20;
            int i32 = i19;
            int i33 = i29;
            short[] sArr2 = sArr;
            int i34 = i27;
            while (true) {
                bArr = bArr4;
                if (i30 < i32) {
                    i20 = i31;
                    i27 = i34;
                    break;
                }
                int i35 = i25 & i21;
                i25 >>= i32;
                i30 -= i32;
                if (i35 == i13) {
                    i32 = i16;
                    i31 = i15;
                    i21 = i17;
                    bArr4 = bArr;
                    i33 = -1;
                } else {
                    if (i35 == i14) {
                        i27 = i34;
                        i20 = i31;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i33 == -1) {
                        bArr3[i26] = bArr[i35];
                        i26++;
                        i22++;
                        i33 = i35;
                        i34 = i33;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i35 >= i31) {
                            bArr7[i28] = (byte) i34;
                            i28++;
                            s10 = i33;
                        } else {
                            s10 = i35;
                        }
                        while (s10 >= i13) {
                            bArr7[i28] = bArr[s10];
                            i28++;
                            s10 = sArr2[s10];
                        }
                        int i36 = bArr[s10] & 255;
                        byte b11 = (byte) i36;
                        bArr3[i26] = b11;
                        while (true) {
                            i26++;
                            i22++;
                            if (i28 <= 0) {
                                break;
                            }
                            i28--;
                            bArr3[i26] = bArr7[i28];
                        }
                        if (i31 < 4096) {
                            sArr2[i31] = (short) i33;
                            bArr[i31] = b11;
                            i31++;
                            if ((i31 & i21) == 0 && i31 < 4096) {
                                i32++;
                                i21 += i31;
                            }
                        }
                        i33 = i35;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i34 = i36;
                    }
                }
            }
            i24 = i30;
            sArr = sArr2;
            bArr4 = bArr;
            b10 = 0;
            i29 = i33;
            i19 = i32;
            eVar = this;
        }
        Arrays.fill(bArr3, i26, i12, b10);
    }

    private Bitmap o() {
        Boolean bool = this.f13511s;
        Bitmap bitmapC = this.f13495c.c(this.f13510r, this.f13509q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f13512t);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    private int p() {
        int iQ = q();
        if (iQ <= 0) {
            return iQ;
        }
        ByteBuffer byteBuffer = this.f13496d;
        byteBuffer.get(this.f13497e, 0, Math.min(iQ, byteBuffer.remaining()));
        return iQ;
    }

    private int q() {
        return this.f13496d.get() & 255;
    }

    private Bitmap s(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f13502j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f13505m;
            if (bitmap2 != null) {
                this.f13495c.a(bitmap2);
            }
            this.f13505m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f13470g == 3 && this.f13505m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f13470g) > 0) {
            if (i11 == 2) {
                if (!bVar.f13469f) {
                    c cVar = this.f13504l;
                    int i13 = cVar.f13486l;
                    if (bVar.f13474k == null || cVar.f13484j != bVar.f13471h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f13467d;
                int i15 = this.f13508p;
                int i16 = i14 / i15;
                int i17 = bVar2.f13465b / i15;
                int i18 = bVar2.f13466c / i15;
                int i19 = bVar2.f13464a / i15;
                int i20 = this.f13510r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f13510r;
                }
            } else if (i11 == 3 && (bitmap = this.f13505m) != null) {
                int i25 = this.f13510r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f13509q);
            }
        }
        m(bVar);
        if (bVar.f13468e || this.f13508p != 1) {
            c(bVar);
        } else {
            d(bVar);
        }
        if (this.f13506n && ((i10 = bVar.f13470g) == 0 || i10 == 1)) {
            if (this.f13505m == null) {
                this.f13505m = o();
            }
            Bitmap bitmap3 = this.f13505m;
            int i26 = this.f13510r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f13509q);
        }
        Bitmap bitmapO = o();
        int i27 = this.f13510r;
        bitmapO.setPixels(iArr, 0, i27, 0, 0, i27, this.f13509q);
        return bitmapO;
    }

    @Override // P4.a
    public int a() {
        return this.f13504l.f13477c;
    }

    @Override // P4.a
    public void clear() {
        this.f13504l = null;
        byte[] bArr = this.f13501i;
        if (bArr != null) {
            this.f13495c.e(bArr);
        }
        int[] iArr = this.f13502j;
        if (iArr != null) {
            this.f13495c.f(iArr);
        }
        Bitmap bitmap = this.f13505m;
        if (bitmap != null) {
            this.f13495c.a(bitmap);
        }
        this.f13505m = null;
        this.f13496d = null;
        this.f13511s = null;
        byte[] bArr2 = this.f13497e;
        if (bArr2 != null) {
            this.f13495c.e(bArr2);
        }
    }

    @Override // P4.a
    public ByteBuffer e() {
        return this.f13496d;
    }

    @Override // P4.a
    public synchronized Bitmap f() {
        try {
            if (this.f13504l.f13477c <= 0 || this.f13503k < 0) {
                String str = f13492u;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f13504l.f13477c + ", framePointer=" + this.f13503k);
                }
                this.f13507o = 1;
            }
            int i10 = this.f13507o;
            if (i10 != 1 && i10 != 2) {
                this.f13507o = 0;
                if (this.f13497e == null) {
                    this.f13497e = this.f13495c.b(255);
                }
                b bVar = (b) this.f13504l.f13479e.get(this.f13503k);
                int i11 = this.f13503k - 1;
                b bVar2 = i11 >= 0 ? (b) this.f13504l.f13479e.get(i11) : null;
                int[] iArr = bVar.f13474k;
                if (iArr == null) {
                    iArr = this.f13504l.f13475a;
                }
                this.f13493a = iArr;
                if (iArr == null) {
                    String str2 = f13492u;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f13503k);
                    }
                    this.f13507o = 1;
                    return null;
                }
                if (bVar.f13469f) {
                    System.arraycopy(iArr, 0, this.f13494b, 0, iArr.length);
                    int[] iArr2 = this.f13494b;
                    this.f13493a = iArr2;
                    iArr2[bVar.f13471h] = 0;
                    if (bVar.f13470g == 2 && this.f13503k == 0) {
                        this.f13511s = Boolean.TRUE;
                    }
                }
                return s(bVar, bVar2);
            }
            String str3 = f13492u;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f13507o);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // P4.a
    public void g() {
        this.f13503k = (this.f13503k + 1) % this.f13504l.f13477c;
    }

    @Override // P4.a
    public void h(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f13512t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // P4.a
    public int i() {
        int i10;
        if (this.f13504l.f13477c <= 0 || (i10 = this.f13503k) < 0) {
            return 0;
        }
        return n(i10);
    }

    @Override // P4.a
    public void j() {
        this.f13503k = -1;
    }

    @Override // P4.a
    public int k() {
        return this.f13503k;
    }

    @Override // P4.a
    public int l() {
        return this.f13496d.limit() + this.f13501i.length + (this.f13502j.length * 4);
    }

    public int n(int i10) {
        if (i10 < 0) {
            return -1;
        }
        c cVar = this.f13504l;
        if (i10 < cVar.f13477c) {
            return ((b) cVar.f13479e.get(i10)).f13472i;
        }
        return -1;
    }

    public synchronized void r(c cVar, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f13507o = 0;
            this.f13504l = cVar;
            this.f13503k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f13496d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f13496d.order(ByteOrder.LITTLE_ENDIAN);
            this.f13506n = false;
            Iterator it = cVar.f13479e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b) it.next()).f13470g == 3) {
                    this.f13506n = true;
                    break;
                }
            }
            this.f13508p = iHighestOneBit;
            int i11 = cVar.f13480f;
            this.f13510r = i11 / iHighestOneBit;
            int i12 = cVar.f13481g;
            this.f13509q = i12 / iHighestOneBit;
            this.f13501i = this.f13495c.b(i11 * i12);
            this.f13502j = this.f13495c.d(this.f13510r * this.f13509q);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public e(a.InterfaceC0215a interfaceC0215a) {
        this.f13494b = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        this.f13512t = Bitmap.Config.ARGB_8888;
        this.f13495c = interfaceC0215a;
        this.f13504l = new c();
    }
}
