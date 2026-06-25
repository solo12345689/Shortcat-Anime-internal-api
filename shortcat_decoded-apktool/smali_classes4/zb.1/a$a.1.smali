.class public final Lzb/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzb/a$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lzb/a$a;Landroid/content/Context;)Lzb/a$b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lzb/a$a;->c(Landroid/content/Context;)Lzb/a$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Lzb/a$a;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lzb/a$a;->f()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final c(Landroid/content/Context;)Lzb/a$b;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "amazon.hardware.fire_tv"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object p1, Lzb/a$b;->f:Lzb/a$b;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const-string v0, "uimode"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/app/UiModeManager;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x4

    .line 35
    if-ne v0, v1, :cond_1

    .line 36
    .line 37
    sget-object p1, Lzb/a$b;->f:Lzb/a$b;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    invoke-direct {p0, p1}, Lzb/a$a;->e(Landroid/content/Context;)Lzb/a$b;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, Lzb/a$b;->b:Lzb/a$b;

    .line 45
    .line 46
    if-eq v0, v1, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    invoke-direct {p0, p1}, Lzb/a$a;->d(Landroid/content/Context;)Lzb/a$b;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
.end method

.method private final d(Landroid/content/Context;)Lzb/a$b;
    .locals 7

    .line 1
    const-string v0, "window"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/WindowManager;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object p1, Lzb/a$b;->b:Lzb/a$b;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v2, 0x1e

    .line 17
    .line 18
    if-lt v1, v2, :cond_1

    .line 19
    .line 20
    invoke-static {v0}, Lg4/c;->a(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lg4/d;->a(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "getBounds(...)"

    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget p1, p1, Landroid/content/res/Configuration;->densityDpi:I

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    int-to-double v1, v1

    .line 48
    int-to-double v3, p1

    .line 49
    div-double/2addr v1, v3

    .line 50
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    int-to-double v5, p1

    .line 55
    div-double/2addr v5, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    new-instance p1, Landroid/util/DisplayMetrics;

    .line 58
    .line 59
    invoke-direct {p1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0, p1}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 67
    .line 68
    .line 69
    iget v0, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 70
    .line 71
    int-to-double v0, v0

    .line 72
    iget v2, p1, Landroid/util/DisplayMetrics;->xdpi:F

    .line 73
    .line 74
    float-to-double v2, v2

    .line 75
    div-double v1, v0, v2

    .line 76
    .line 77
    iget v0, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 78
    .line 79
    int-to-double v3, v0

    .line 80
    iget p1, p1, Landroid/util/DisplayMetrics;->ydpi:F

    .line 81
    .line 82
    float-to-double v5, p1

    .line 83
    div-double v5, v3, v5

    .line 84
    .line 85
    :goto_0
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 86
    .line 87
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 92
    .line 93
    .line 94
    move-result-wide v2

    .line 95
    add-double/2addr v0, v2

    .line 96
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    .line 101
    .line 102
    cmpg-double p1, v2, v0

    .line 103
    .line 104
    const-wide v2, 0x401b99999999999aL    # 6.9

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    if-gtz p1, :cond_2

    .line 110
    .line 111
    cmpg-double p1, v0, v2

    .line 112
    .line 113
    if-gtz p1, :cond_2

    .line 114
    .line 115
    sget-object p1, Lzb/a$b;->c:Lzb/a$b;

    .line 116
    .line 117
    return-object p1

    .line 118
    :cond_2
    cmpl-double p1, v0, v2

    .line 119
    .line 120
    if-lez p1, :cond_3

    .line 121
    .line 122
    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    .line 123
    .line 124
    cmpg-double p1, v0, v2

    .line 125
    .line 126
    if-gtz p1, :cond_3

    .line 127
    .line 128
    sget-object p1, Lzb/a$b;->d:Lzb/a$b;

    .line 129
    .line 130
    return-object p1

    .line 131
    :cond_3
    sget-object p1, Lzb/a$b;->b:Lzb/a$b;

    .line 132
    .line 133
    return-object p1
.end method

.method private final e(Landroid/content/Context;)Lzb/a$b;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Lzb/a$b;->b:Lzb/a$b;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/16 v0, 0x258

    .line 17
    .line 18
    if-lt p1, v0, :cond_1

    .line 19
    .line 20
    sget-object p1, Lzb/a$b;->d:Lzb/a$b;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    sget-object p1, Lzb/a$b;->c:Lzb/a$b;

    .line 24
    .line 25
    return-object p1
.end method

.method private final f()Z
    .locals 1

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvb/a;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
