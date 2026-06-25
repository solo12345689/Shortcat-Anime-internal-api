package com.horcrux.svg;

import com.adjust.sdk.Constants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class SVGLength {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f43656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final UnitType f43657b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43658a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f43658a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43658a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43658a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.f43656a = 0.0d;
        this.f43657b = UnitType.UNKNOWN;
    }

    static ArrayList a(Dynamic dynamic) {
        int i10 = a.f43658a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        int i11 = 0;
        if (i10 == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(com.amazon.a.a.o.b.f.f34694a, " ").split(" ");
            ArrayList arrayList2 = new ArrayList(strArrSplit.length);
            int length = strArrSplit.length;
            while (i11 < length) {
                arrayList2.add(new SVGLength(strArrSplit[i11]));
                i11++;
            }
            return arrayList2;
        }
        if (i10 != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList arrayList3 = new ArrayList(size);
        while (i11 < size) {
            arrayList3.add(b(readableArrayAsArray.getDynamic(i11)));
            i11++;
        }
        return arrayList3;
    }

    static SVGLength b(Dynamic dynamic) {
        int i10 = a.f43658a[dynamic.getType().ordinal()];
        return i10 != 1 ? i10 != 2 ? new SVGLength() : new SVGLength(dynamic.asString()) : new SVGLength(dynamic.asDouble());
    }

    static String c(Dynamic dynamic) {
        int i10 = a.f43658a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i10 != 2) {
            return null;
        }
        return dynamic.asString();
    }

    SVGLength(double d10) {
        this.f43656a = d10;
        this.f43657b = UnitType.NUMBER;
    }

    SVGLength(String str) {
        String strTrim = str.trim();
        int length = strTrim.length();
        int i10 = length - 1;
        if (length != 0 && !strTrim.equals(Constants.NORMAL)) {
            if (strTrim.codePointAt(i10) == 37) {
                this.f43657b = UnitType.PERCENTAGE;
                this.f43656a = Double.valueOf(strTrim.substring(0, i10)).doubleValue();
                return;
            }
            int i11 = length - 2;
            if (i11 > 0) {
                String strSubstring = strTrim.substring(i11);
                strSubstring.getClass();
                switch (strSubstring) {
                    case "cm":
                        this.f43657b = UnitType.CM;
                        length = i11;
                        break;
                    case "em":
                        this.f43657b = UnitType.EMS;
                        length = i11;
                        break;
                    case "ex":
                        this.f43657b = UnitType.EXS;
                        length = i11;
                        break;
                    case "in":
                        this.f43657b = UnitType.IN;
                        length = i11;
                        break;
                    case "mm":
                        this.f43657b = UnitType.MM;
                        length = i11;
                        break;
                    case "pc":
                        this.f43657b = UnitType.PC;
                        length = i11;
                        break;
                    case "pt":
                        this.f43657b = UnitType.PT;
                        length = i11;
                        break;
                    case "px":
                        this.f43657b = UnitType.NUMBER;
                        length = i11;
                        break;
                    default:
                        this.f43657b = UnitType.NUMBER;
                        break;
                }
                this.f43656a = Double.valueOf(strTrim.substring(0, length)).doubleValue();
                return;
            }
            this.f43657b = UnitType.NUMBER;
            this.f43656a = Double.valueOf(strTrim).doubleValue();
            return;
        }
        this.f43657b = UnitType.UNKNOWN;
        this.f43656a = 0.0d;
    }
}
