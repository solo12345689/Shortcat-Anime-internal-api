.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u001d\u0010\u0008\u001a\u00020\u00078\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001d\u0010\u000c\u001a\u00020\u00078\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\t\u001a\u0004\u0008\r\u0010\u000bR\u001d\u0010\u000e\u001a\u00020\u00078\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000f\u0010\u000bR\u001d\u0010\u0010\u001a\u00020\u00078\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\t\u001a\u0004\u0008\u0011\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\u00078\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\t\u001a\u0004\u0008\u0013\u0010\u000bR\u001d\u0010\u0014\u001a\u00020\u00078\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\t\u001a\u0004\u0008\u0015\u0010\u000b\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;",
        "",
        "<init>",
        "()V",
        "",
        "roundedCorner",
        "I",
        "Li1/h;",
        "minimumHeight",
        "F",
        "getMinimumHeight-D9Ej5fM",
        "()F",
        "selectedTierPadding",
        "getSelectedTierPadding-D9Ej5fM",
        "tierTextPaddingHorizontal",
        "getTierTextPaddingHorizontal-D9Ej5fM",
        "tierTextPaddingVertical",
        "getTierTextPaddingVertical-D9Ej5fM",
        "tierHorizontalPadding",
        "getTierHorizontalPadding-D9Ej5fM",
        "tierVerticalPadding",
        "getTierVerticalPadding-D9Ej5fM",
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
.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;

.field private static final minimumHeight:F

.field public static final roundedCorner:I = 0x32

.field private static final selectedTierPadding:F

.field private static final tierHorizontalPadding:F

.field private static final tierTextPaddingHorizontal:F

.field private static final tierTextPaddingVertical:F

.field private static final tierVerticalPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;

    .line 7
    .line 8
    const/16 v0, 0x28

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
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->minimumHeight:F

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    int-to-float v0, v0

    .line 19
    invoke-static {v0}, Li1/h;->n(F)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->selectedTierPadding:F

    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    int-to-float v0, v0

    .line 28
    invoke-static {v0}, Li1/h;->n(F)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->tierTextPaddingHorizontal:F

    .line 33
    .line 34
    const/4 v0, 0x4

    .line 35
    int-to-float v0, v0

    .line 36
    invoke-static {v0}, Li1/h;->n(F)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->tierTextPaddingVertical:F

    .line 41
    .line 42
    const/16 v0, 0x10

    .line 43
    .line 44
    int-to-float v0, v0

    .line 45
    invoke-static {v0}, Li1/h;->n(F)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->tierHorizontalPadding:F

    .line 50
    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    int-to-float v0, v0

    .line 54
    invoke-static {v0}, Li1/h;->n(F)F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->tierVerticalPadding:F

    .line 59
    .line 60
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
.method public final getMinimumHeight-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->minimumHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public final getSelectedTierPadding-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->selectedTierPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public final getTierHorizontalPadding-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->tierHorizontalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method public final getTierTextPaddingHorizontal-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->tierTextPaddingHorizontal:F

    .line 2
    .line 3
    return v0
.end method

.method public final getTierTextPaddingVertical-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->tierTextPaddingVertical:F

    .line 2
    .line 3
    return v0
.end method

.method public final getTierVerticalPadding-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/TierSwitcherUIConstants;->tierVerticalPadding:F

    .line 2
    .line 3
    return v0
.end method
