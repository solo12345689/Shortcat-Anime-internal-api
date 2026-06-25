.class public final Lcom/revenuecat/purchases/paywalls/components/VideoComponent;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;,
        Lcom/revenuecat/purchases/paywalls/components/VideoComponent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008:\u0008\u0007\u0018\u0000 e2\u00020\u0001:\u0002feB\u00b1\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001d0\u001c\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008!\u0010\"B\u00d9\u0001\u0008\u0011\u0012\u0006\u0010$\u001a\u00020#\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001d0\u001c\u0018\u00010\u001b\u0012\n\u0008\u0001\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0008\u0010&\u001a\u0004\u0018\u00010%\u00a2\u0006\u0004\u0008!\u0010\'J(\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u00c1\u0001\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u00103R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00104\u0012\u0004\u00087\u00108\u001a\u0004\u00085\u00106R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008:\u0010;R \u0010\u0008\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010<\u0012\u0004\u0008?\u00108\u001a\u0004\u0008=\u0010>R \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010<\u0012\u0004\u0008A\u00108\u001a\u0004\u0008@\u0010>R\u0017\u0010\n\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010<\u001a\u0004\u0008B\u0010>R \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010<\u0012\u0004\u0008D\u00108\u001a\u0004\u0008C\u0010>R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010E\u001a\u0004\u0008F\u0010GR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010H\u0012\u0004\u0008K\u00108\u001a\u0004\u0008I\u0010JR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010L\u0012\u0004\u0008O\u00108\u001a\u0004\u0008M\u0010NR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010P\u0012\u0004\u0008S\u00108\u001a\u0004\u0008Q\u0010RR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010T\u001a\u0004\u0008U\u0010VR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010T\u001a\u0004\u0008W\u0010VR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010X\u001a\u0004\u0008Y\u0010ZR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010[\u001a\u0004\u0008\\\u0010]R%\u0010\u001e\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001d0\u001c\u0018\u00010\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010^\u001a\u0004\u0008_\u0010`R(\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008 \u0010a\u0012\u0004\u0008d\u00108\u001a\u0004\u0008b\u0010c\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006g"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/VideoComponent;",
        "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;",
        "source",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;",
        "fallbackSource",
        "",
        "visible",
        "showControls",
        "autoplay",
        "loop",
        "muteAudio",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "size",
        "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;",
        "fitMode",
        "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;",
        "maskShape",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
        "colorOverlay",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
        "padding",
        "margin",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Border;",
        "border",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;",
        "shadow",
        "",
        "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;",
        "Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;",
        "overrides",
        "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;",
        "overrideSourceLid",
        "<init>",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "",
        "seen1",
        "LVf/t0;",
        "serializationConstructorMarker",
        "(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "self",
        "LUf/d;",
        "output",
        "LTf/e;",
        "serialDesc",
        "LTd/L;",
        "write$Self$purchases_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/paywalls/components/VideoComponent;LUf/d;LTf/e;)V",
        "write$Self",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;",
        "getSource",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;",
        "getFallbackSource",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;",
        "getFallbackSource$annotations",
        "()V",
        "Ljava/lang/Boolean;",
        "getVisible",
        "()Ljava/lang/Boolean;",
        "Z",
        "getShowControls",
        "()Z",
        "getShowControls$annotations",
        "getAutoplay",
        "getAutoplay$annotations",
        "getLoop",
        "getMuteAudio",
        "getMuteAudio$annotations",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "getSize",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;",
        "getFitMode",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;",
        "getFitMode$annotations",
        "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;",
        "getMaskShape",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;",
        "getMaskShape$annotations",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
        "getColorOverlay",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
        "getColorOverlay$annotations",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
        "getPadding",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
        "getMargin",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Border;",
        "getBorder",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;",
        "getShadow",
        "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;",
        "Ljava/util/List;",
        "getOverrides",
        "()Ljava/util/List;",
        "Ljava/lang/String;",
        "getOverrideSourceLid-sa7TU9Q",
        "()Ljava/lang/String;",
        "getOverrideSourceLid-sa7TU9Q$annotations",
        "Companion",
        "$serializer",
        "purchases_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final $childSerializers:[LRf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LRf/b;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/revenuecat/purchases/paywalls/components/VideoComponent$Companion;


# instance fields
.field private final autoplay:Z

.field private final border:Lcom/revenuecat/purchases/paywalls/components/properties/Border;

.field private final colorOverlay:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

.field private final fallbackSource:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

.field private final fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

.field private final loop:Z

.field private final margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

.field private final maskShape:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

.field private final muteAudio:Z

.field private final overrideSourceLid:Ljava/lang/String;

.field private final overrides:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride<",
            "Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;",
            ">;>;"
        }
    .end annotation
.end field

.field private final padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

.field private final shadow:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

.field private final showControls:Z

.field private final size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

.field private final source:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

.field private final visible:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->Companion:Lcom/revenuecat/purchases/paywalls/components/VideoComponent$Companion;

    .line 8
    .line 9
    new-instance v0, LVf/e;

    .line 10
    .line 11
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;->Companion:Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Companion;

    .line 12
    .line 13
    sget-object v3, Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent$$serializer;

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Companion;->serializer(LRf/b;)LRf/b;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v0, v2}, LVf/e;-><init>(LRf/b;)V

    .line 20
    .line 21
    .line 22
    const/16 v2, 0x11

    .line 23
    .line 24
    new-array v2, v2, [LRf/b;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    aput-object v1, v2, v3

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    aput-object v1, v2, v3

    .line 31
    .line 32
    const/4 v3, 0x2

    .line 33
    aput-object v1, v2, v3

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    aput-object v1, v2, v3

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    aput-object v1, v2, v3

    .line 40
    .line 41
    const/4 v3, 0x5

    .line 42
    aput-object v1, v2, v3

    .line 43
    .line 44
    const/4 v3, 0x6

    .line 45
    aput-object v1, v2, v3

    .line 46
    .line 47
    const/4 v3, 0x7

    .line 48
    aput-object v1, v2, v3

    .line 49
    .line 50
    const/16 v3, 0x8

    .line 51
    .line 52
    aput-object v1, v2, v3

    .line 53
    .line 54
    const/16 v3, 0x9

    .line 55
    .line 56
    aput-object v1, v2, v3

    .line 57
    .line 58
    const/16 v3, 0xa

    .line 59
    .line 60
    aput-object v1, v2, v3

    .line 61
    .line 62
    const/16 v3, 0xb

    .line 63
    .line 64
    aput-object v1, v2, v3

    .line 65
    .line 66
    const/16 v3, 0xc

    .line 67
    .line 68
    aput-object v1, v2, v3

    .line 69
    .line 70
    const/16 v3, 0xd

    .line 71
    .line 72
    aput-object v1, v2, v3

    .line 73
    .line 74
    const/16 v3, 0xe

    .line 75
    .line 76
    aput-object v1, v2, v3

    .line 77
    .line 78
    const/16 v3, 0xf

    .line 79
    .line 80
    aput-object v0, v2, v3

    .line 81
    .line 82
    const/16 v0, 0x10

    .line 83
    .line 84
    aput-object v1, v2, v0

    .line 85
    .line 86
    sput-object v2, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->$childSerializers:[LRf/b;

    .line 87
    .line 88
    return-void
.end method

.method private constructor <init>(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;LVf/t0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;",
            "Ljava/lang/Boolean;",
            "ZZZZ",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Border;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride<",
            "Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;",
            ">;>;",
            "Ljava/lang/String;",
            "LVf/t0;",
            ")V"
        }
    .end annotation

    const v0, 0xffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 3
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent$$serializer;->getDescriptor()LTf/e;

    move-result-object v1

    invoke-static {p1, v0, v1}, LVf/f0;->a(IILTf/e;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->source:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    iput-object p3, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fallbackSource:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    iput-object p4, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->visible:Ljava/lang/Boolean;

    iput-boolean p5, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->showControls:Z

    iput-boolean p6, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->autoplay:Z

    iput-boolean p7, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->loop:Z

    iput-boolean p8, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->muteAudio:Z

    iput-object p9, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    iput-object p10, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    iput-object p11, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->maskShape:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    iput-object p12, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->colorOverlay:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    iput-object p13, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->border:Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->shadow:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrides:Ljava/util/List;

    const/high16 p2, 0x10000

    and-int/2addr p1, p2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrideSourceLid:Ljava/lang/String;

    return-void

    :cond_1
    move-object/from16 p1, p18

    goto :goto_0
.end method

.method public synthetic constructor <init>(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    invoke-direct/range {p0 .. p19}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;-><init>(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;LVf/t0;)V

    return-void
.end method

.method private constructor <init>(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;",
            "Ljava/lang/Boolean;",
            "ZZZZ",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Border;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride<",
            "Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;",
            ">;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fitMode"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->source:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fallbackSource:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 7
    iput-object p3, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->visible:Ljava/lang/Boolean;

    .line 8
    iput-boolean p4, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->showControls:Z

    .line 9
    iput-boolean p5, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->autoplay:Z

    .line 10
    iput-boolean p6, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->loop:Z

    .line 11
    iput-boolean p7, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->muteAudio:Z

    .line 12
    iput-object p8, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 13
    iput-object p9, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 14
    iput-object p10, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->maskShape:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    .line 15
    iput-object p11, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->colorOverlay:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 16
    iput-object p12, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 17
    iput-object p13, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 18
    iput-object p14, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->border:Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    move-object/from16 p1, p15

    .line 19
    iput-object p1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->shadow:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    move-object/from16 p1, p16

    .line 20
    iput-object p1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrides:Ljava/util/List;

    move-object/from16 p1, p17

    .line 21
    iput-object p1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrideSourceLid:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    const/high16 v0, 0x10000

    and-int v0, p18, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object/from16 v18, v0

    goto :goto_0

    :cond_0
    move-object/from16 v18, p17

    :goto_0
    const/16 v19, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    .line 22
    invoke-direct/range {v1 .. v19}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p17}, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[LRf/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->$childSerializers:[LRf/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getAutoplay$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getColorOverlay$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getFallbackSource$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getFitMode$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getMaskShape$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getMuteAudio$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getOverrideSourceLid-sa7TU9Q$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getShowControls$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final synthetic write$Self$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/paywalls/components/VideoComponent;LUf/d;LTf/e;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->$childSerializers:[LRf/b;

    .line 2
    .line 3
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls$$serializer;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->source:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-interface {p1, p2, v3, v1, v2}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$$serializer;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fallbackSource:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-interface {p1, p2, v3, v1, v2}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object v1, LVf/h;->a:LVf/h;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->visible:Ljava/lang/Boolean;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    invoke-interface {p1, p2, v3, v1, v2}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    iget-boolean v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->showControls:Z

    .line 29
    .line 30
    invoke-interface {p1, p2, v1, v2}, LUf/d;->B(LTf/e;IZ)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x4

    .line 34
    iget-boolean v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->autoplay:Z

    .line 35
    .line 36
    invoke-interface {p1, p2, v1, v2}, LUf/d;->B(LTf/e;IZ)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x5

    .line 40
    iget-boolean v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->loop:Z

    .line 41
    .line 42
    invoke-interface {p1, p2, v1, v2}, LUf/d;->B(LTf/e;IZ)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x6

    .line 46
    iget-boolean v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->muteAudio:Z

    .line 47
    .line 48
    invoke-interface {p1, p2, v1, v2}, LUf/d;->B(LTf/e;IZ)V

    .line 49
    .line 50
    .line 51
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Size$$serializer;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 54
    .line 55
    const/4 v3, 0x7

    .line 56
    invoke-interface {p1, p2, v3, v1, v2}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/FitModeDeserializer;

    .line 60
    .line 61
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 62
    .line 63
    const/16 v3, 0x8

    .line 64
    .line 65
    invoke-interface {p1, p2, v3, v1, v2}, LUf/d;->m(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShapeDeserializer;

    .line 69
    .line 70
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->maskShape:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    .line 71
    .line 72
    const/16 v3, 0x9

    .line 73
    .line 74
    invoke-interface {p1, p2, v3, v1, v2}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$$serializer;

    .line 78
    .line 79
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->colorOverlay:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 80
    .line 81
    const/16 v3, 0xa

    .line 82
    .line 83
    invoke-interface {p1, p2, v3, v1, v2}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Padding$$serializer;

    .line 87
    .line 88
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 89
    .line 90
    const/16 v3, 0xb

    .line 91
    .line 92
    invoke-interface {p1, p2, v3, v1, v2}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const/16 v2, 0xc

    .line 96
    .line 97
    iget-object v3, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 98
    .line 99
    invoke-interface {p1, p2, v2, v1, v3}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Border$$serializer;

    .line 103
    .line 104
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->border:Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    .line 105
    .line 106
    const/16 v3, 0xd

    .line 107
    .line 108
    invoke-interface {p1, p2, v3, v1, v2}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$$serializer;

    .line 112
    .line 113
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->shadow:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    .line 114
    .line 115
    const/16 v3, 0xe

    .line 116
    .line 117
    invoke-interface {p1, p2, v3, v1, v2}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const/16 v1, 0xf

    .line 121
    .line 122
    aget-object v0, v0, v1

    .line 123
    .line 124
    iget-object v2, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrides:Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {p1, p2, v1, v0, v2}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    const/16 v0, 0x10

    .line 130
    .line 131
    invoke-interface {p1, p2, v0}, LUf/d;->g(LTf/e;I)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_0

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_0
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrideSourceLid:Ljava/lang/String;

    .line 139
    .line 140
    if-eqz v1, :cond_2

    .line 141
    .line 142
    :goto_0
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey$$serializer;

    .line 143
    .line 144
    iget-object p0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrideSourceLid:Ljava/lang/String;

    .line 145
    .line 146
    if-eqz p0, :cond_1

    .line 147
    .line 148
    invoke-static {p0}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->box-impl(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    goto :goto_1

    .line 153
    :cond_1
    const/4 p0, 0x0

    .line 154
    :goto_1
    invoke-interface {p1, p2, v0, v1, p0}, LUf/d;->f(LTf/e;ILRf/k;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_2
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->source:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->source:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fallbackSource:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fallbackSource:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->visible:Ljava/lang/Boolean;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->visible:Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->showControls:Z

    .line 47
    .line 48
    iget-boolean v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->showControls:Z

    .line 49
    .line 50
    if-eq v1, v3, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->autoplay:Z

    .line 54
    .line 55
    iget-boolean v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->autoplay:Z

    .line 56
    .line 57
    if-eq v1, v3, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->loop:Z

    .line 61
    .line 62
    iget-boolean v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->loop:Z

    .line 63
    .line 64
    if-eq v1, v3, :cond_7

    .line 65
    .line 66
    return v2

    .line 67
    :cond_7
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->muteAudio:Z

    .line 68
    .line 69
    iget-boolean v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->muteAudio:Z

    .line 70
    .line 71
    if-eq v1, v3, :cond_8

    .line 72
    .line 73
    return v2

    .line 74
    :cond_8
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 75
    .line 76
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 77
    .line 78
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_9

    .line 83
    .line 84
    return v2

    .line 85
    :cond_9
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 86
    .line 87
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 88
    .line 89
    if-eq v1, v3, :cond_a

    .line 90
    .line 91
    return v2

    .line 92
    :cond_a
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->maskShape:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    .line 93
    .line 94
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->maskShape:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    .line 95
    .line 96
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_b

    .line 101
    .line 102
    return v2

    .line 103
    :cond_b
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->colorOverlay:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 104
    .line 105
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->colorOverlay:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 106
    .line 107
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_c

    .line 112
    .line 113
    return v2

    .line 114
    :cond_c
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 115
    .line 116
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 117
    .line 118
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_d

    .line 123
    .line 124
    return v2

    .line 125
    :cond_d
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 126
    .line 127
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 128
    .line 129
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_e

    .line 134
    .line 135
    return v2

    .line 136
    :cond_e
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->border:Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    .line 137
    .line 138
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->border:Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    .line 139
    .line 140
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-nez v1, :cond_f

    .line 145
    .line 146
    return v2

    .line 147
    :cond_f
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->shadow:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    .line 148
    .line 149
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->shadow:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    .line 150
    .line 151
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_10

    .line 156
    .line 157
    return v2

    .line 158
    :cond_10
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrides:Ljava/util/List;

    .line 159
    .line 160
    iget-object v3, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrides:Ljava/util/List;

    .line 161
    .line 162
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-nez v1, :cond_11

    .line 167
    .line 168
    return v2

    .line 169
    :cond_11
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrideSourceLid:Ljava/lang/String;

    .line 170
    .line 171
    iget-object p1, p1, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrideSourceLid:Ljava/lang/String;

    .line 172
    .line 173
    if-nez v1, :cond_13

    .line 174
    .line 175
    if-nez p1, :cond_12

    .line 176
    .line 177
    move p1, v0

    .line 178
    goto :goto_1

    .line 179
    :cond_12
    :goto_0
    move p1, v2

    .line 180
    goto :goto_1

    .line 181
    :cond_13
    if-nez p1, :cond_14

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_14
    invoke-static {v1, p1}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->equals-impl0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    :goto_1
    if-nez p1, :cond_15

    .line 189
    .line 190
    return v2

    .line 191
    :cond_15
    return v0
.end method

.method public final synthetic getAutoplay()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->autoplay:Z

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic getBorder()Lcom/revenuecat/purchases/paywalls/components/properties/Border;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->border:Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getColorOverlay()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->colorOverlay:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getFallbackSource()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fallbackSource:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getFitMode()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getLoop()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->loop:Z

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic getMargin()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getMaskShape()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->maskShape:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getMuteAudio()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->muteAudio:Z

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic getOverrideSourceLid-sa7TU9Q()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrideSourceLid:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getOverrides()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrides:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getPadding()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getShadow()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->shadow:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getShowControls()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->showControls:Z

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getSource()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->source:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic getVisible()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->visible:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->source:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fallbackSource:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->visible:Ljava/lang/Boolean;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    move v1, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :goto_1
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->showControls:Z

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->autoplay:Z

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    mul-int/lit8 v0, v0, 0x1f

    .line 53
    .line 54
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->loop:Z

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v0, v1

    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->muteAudio:Z

    .line 64
    .line 65
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-int/2addr v0, v1

    .line 70
    mul-int/lit8 v0, v0, 0x1f

    .line 71
    .line 72
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-int/2addr v0, v1

    .line 79
    mul-int/lit8 v0, v0, 0x1f

    .line 80
    .line 81
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    add-int/2addr v0, v1

    .line 88
    mul-int/lit8 v0, v0, 0x1f

    .line 89
    .line 90
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->maskShape:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    .line 91
    .line 92
    if-nez v1, :cond_2

    .line 93
    .line 94
    move v1, v2

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    :goto_2
    add-int/2addr v0, v1

    .line 101
    mul-int/lit8 v0, v0, 0x1f

    .line 102
    .line 103
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->colorOverlay:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 104
    .line 105
    if-nez v1, :cond_3

    .line 106
    .line 107
    move v1, v2

    .line 108
    goto :goto_3

    .line 109
    :cond_3
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;->hashCode()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    :goto_3
    add-int/2addr v0, v1

    .line 114
    mul-int/lit8 v0, v0, 0x1f

    .line 115
    .line 116
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 117
    .line 118
    if-nez v1, :cond_4

    .line 119
    .line 120
    move v1, v2

    .line 121
    goto :goto_4

    .line 122
    :cond_4
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    :goto_4
    add-int/2addr v0, v1

    .line 127
    mul-int/lit8 v0, v0, 0x1f

    .line 128
    .line 129
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 130
    .line 131
    if-nez v1, :cond_5

    .line 132
    .line 133
    move v1, v2

    .line 134
    goto :goto_5

    .line 135
    :cond_5
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Padding;->hashCode()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    :goto_5
    add-int/2addr v0, v1

    .line 140
    mul-int/lit8 v0, v0, 0x1f

    .line 141
    .line 142
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->border:Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    .line 143
    .line 144
    if-nez v1, :cond_6

    .line 145
    .line 146
    move v1, v2

    .line 147
    goto :goto_6

    .line 148
    :cond_6
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Border;->hashCode()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    :goto_6
    add-int/2addr v0, v1

    .line 153
    mul-int/lit8 v0, v0, 0x1f

    .line 154
    .line 155
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->shadow:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    .line 156
    .line 157
    if-nez v1, :cond_7

    .line 158
    .line 159
    move v1, v2

    .line 160
    goto :goto_7

    .line 161
    :cond_7
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;->hashCode()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    :goto_7
    add-int/2addr v0, v1

    .line 166
    mul-int/lit8 v0, v0, 0x1f

    .line 167
    .line 168
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrides:Ljava/util/List;

    .line 169
    .line 170
    if-nez v1, :cond_8

    .line 171
    .line 172
    move v1, v2

    .line 173
    goto :goto_8

    .line 174
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    :goto_8
    add-int/2addr v0, v1

    .line 179
    mul-int/lit8 v0, v0, 0x1f

    .line 180
    .line 181
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrideSourceLid:Ljava/lang/String;

    .line 182
    .line 183
    if-nez v1, :cond_9

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_9
    invoke-static {v1}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->hashCode-impl(Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    :goto_9
    add-int/2addr v0, v2

    .line 191
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "VideoComponent(source="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->source:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", fallbackSource="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fallbackSource:Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", visible="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->visible:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", showControls="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->showControls:Z

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", autoplay="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->autoplay:Z

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ", loop="

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->loop:Z

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", muteAudio="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-boolean v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->muteAudio:Z

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, ", size="

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->size:Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", fitMode="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->fitMode:Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", maskShape="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->maskShape:Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", colorOverlay="

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->colorOverlay:Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ", padding="

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->padding:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v1, ", margin="

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->margin:Lcom/revenuecat/purchases/paywalls/components/properties/Padding;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v1, ", border="

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->border:Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v1, ", shadow="

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->shadow:Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v1, ", overrides="

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrides:Ljava/util/List;

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v1, ", overrideSourceLid="

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    iget-object v1, p0, Lcom/revenuecat/purchases/paywalls/components/VideoComponent;->overrideSourceLid:Ljava/lang/String;

    .line 172
    .line 173
    if-nez v1, :cond_0

    .line 174
    .line 175
    const-string v1, "null"

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_0
    invoke-static {v1}, Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const/16 v1, 0x29

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0
.end method
