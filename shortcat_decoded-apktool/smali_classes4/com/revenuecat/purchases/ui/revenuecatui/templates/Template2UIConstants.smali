.class final Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001d\u0010\t\u001a\u00020\u00048\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008R\u001d\u0010\u000b\u001a\u00020\u00048\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0006\u001a\u0004\u0008\u000c\u0010\u0008R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0006\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;",
        "",
        "<init>",
        "()V",
        "Li1/h;",
        "maxIconWidth",
        "F",
        "getMaxIconWidth-D9Ej5fM",
        "()F",
        "iconCornerRadius",
        "getIconCornerRadius-D9Ej5fM",
        "checkmarkSize",
        "getCheckmarkSize-D9Ej5fM",
        "",
        "fadedColorOpacity",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;

.field private static final checkmarkSize:F

.field public static final fadedColorOpacity:F = 0.3f

.field private static final iconCornerRadius:F

.field private static final maxIconWidth:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;

    .line 7
    .line 8
    const/16 v0, 0x8c

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
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;->maxIconWidth:F

    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    int-to-float v0, v0

    .line 20
    invoke-static {v0}, Li1/h;->n(F)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;->iconCornerRadius:F

    .line 25
    .line 26
    const/16 v0, 0x12

    .line 27
    .line 28
    int-to-float v0, v0

    .line 29
    invoke-static {v0}, Li1/h;->n(F)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;->checkmarkSize:F

    .line 34
    .line 35
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
.method public final getCheckmarkSize-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;->checkmarkSize:F

    .line 2
    .line 3
    return v0
.end method

.method public final getIconCornerRadius-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;->iconCornerRadius:F

    .line 2
    .line 3
    return v0
.end method

.method public final getMaxIconWidth-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template2UIConstants;->maxIconWidth:F

    .line 2
    .line 3
    return v0
.end method
