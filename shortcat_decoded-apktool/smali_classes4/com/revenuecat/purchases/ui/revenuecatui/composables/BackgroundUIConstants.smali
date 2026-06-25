.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;",
        "",
        "<init>",
        "()V",
        "Li1/h;",
        "blurSize",
        "F",
        "getBlurSize-D9Ej5fM",
        "()F",
        "LI0/f;",
        "contentScale",
        "LI0/f;",
        "getContentScale",
        "()LI0/f;",
        "",
        "blurAlpha",
        "",
        "minSDKVersionSupportingBlur",
        "I",
        "revenuecatui_defaultsBc8Release"
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;

.field public static final blurAlpha:F = 0.7f

.field private static final blurSize:F

.field private static final contentScale:LI0/f;

.field public static final minSDKVersionSupportingBlur:I = 0x1f


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;

    .line 7
    .line 8
    const/16 v0, 0x3c

    .line 9
    .line 10
    int-to-float v0, v0

    .line 11
    invoke-static {v0}, Li1/h;->n(F)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;->blurSize:F

    .line 16
    .line 17
    sget-object v0, LI0/f;->a:LI0/f$a;

    .line 18
    .line 19
    invoke-virtual {v0}, LI0/f$a;->a()LI0/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;->contentScale:LI0/f;

    .line 24
    .line 25
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getBlurSize-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;->blurSize:F

    .line 2
    .line 3
    return v0
.end method

.method public final getContentScale()LI0/f;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/BackgroundUIConstants;->contentScale:LI0/f;

    .line 2
    .line 3
    return-object v0
.end method
