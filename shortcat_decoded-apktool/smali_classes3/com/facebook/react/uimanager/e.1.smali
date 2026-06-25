.class public final Lcom/facebook/react/uimanager/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lcom/facebook/react/uimanager/e;

.field private static b:Landroid/util/DisplayMetrics;

.field private static c:Landroid/util/DisplayMetrics;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/uimanager/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/uimanager/e;->a:Lcom/facebook/react/uimanager/e;

    .line 7
    .line 8
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

.method public static final b(D)Lcom/facebook/react/bridge/WritableMap;
    .locals 5

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/e;->b:Landroid/util/DisplayMetrics;

    .line 2
    .line 3
    const-string v1, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics"

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-object v0, Lcom/facebook/react/uimanager/e;->c:Landroid/util/DisplayMetrics;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/facebook/react/uimanager/e;->a:Lcom/facebook/react/uimanager/e;

    .line 17
    .line 18
    sget-object v2, Lcom/facebook/react/uimanager/e;->b:Landroid/util/DisplayMetrics;

    .line 19
    .line 20
    const-string v3, "null cannot be cast to non-null type android.util.DisplayMetrics"

    .line 21
    .line 22
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, v2, p0, p1}, Lcom/facebook/react/uimanager/e;->d(Landroid/util/DisplayMetrics;D)Lcom/facebook/react/bridge/WritableMap;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v4, "windowPhysicalPixels"

    .line 30
    .line 31
    invoke-virtual {v0, v4, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 32
    .line 33
    .line 34
    sget-object v2, Lcom/facebook/react/uimanager/e;->c:Landroid/util/DisplayMetrics;

    .line 35
    .line 36
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v2, p0, p1}, Lcom/facebook/react/uimanager/e;->d(Landroid/util/DisplayMetrics;D)Lcom/facebook/react/bridge/WritableMap;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string p1, "screenPhysicalPixels"

    .line 44
    .line 45
    invoke-virtual {v0, p1, p0}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0
.end method

.method public static final c(Landroid/app/Activity;)J
    .locals 5

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_3

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/core/view/a0;->F(Landroid/view/View;)Landroidx/core/view/L0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {}, Landroidx/core/view/L0$p;->h()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    or-int/2addr v0, v1

    .line 31
    invoke-static {}, Landroidx/core/view/L0$p;->c()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    or-int/2addr v0, v1

    .line 36
    invoke-virtual {p0, v0}, Landroidx/core/view/L0;->f(I)LA1/b;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string v0, "getInsets(...)"

    .line 41
    .line 42
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget v0, p0, LA1/b;->b:I

    .line 46
    .line 47
    iget p0, p0, LA1/b;->d:I

    .line 48
    .line 49
    add-int/2addr v0, p0

    .line 50
    sget-object p0, Lcom/facebook/react/uimanager/e;->a:Lcom/facebook/react/uimanager/e;

    .line 51
    .line 52
    sget-object v1, Lcom/facebook/react/uimanager/B;->a:Lcom/facebook/react/uimanager/B;

    .line 53
    .line 54
    sget-object v2, Lcom/facebook/react/uimanager/e;->c:Landroid/util/DisplayMetrics;

    .line 55
    .line 56
    const-string v3, "Required value was null."

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 61
    .line 62
    int-to-float v2, v2

    .line 63
    invoke-virtual {v1, v2}, Lcom/facebook/react/uimanager/B;->e(F)F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    sget-object v4, Lcom/facebook/react/uimanager/e;->c:Landroid/util/DisplayMetrics;

    .line 68
    .line 69
    if-eqz v4, :cond_1

    .line 70
    .line 71
    iget v3, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 72
    .line 73
    sub-int/2addr v3, v0

    .line 74
    int-to-float v0, v3

    .line 75
    invoke-virtual {v1, v0}, Lcom/facebook/react/uimanager/B;->e(F)F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p0, v2, v0}, Lcom/facebook/react/uimanager/e;->a(FF)J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    return-wide v0

    .line 84
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p0

    .line 90
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :cond_3
    :goto_0
    const-wide/16 v0, 0x0

    .line 97
    .line 98
    return-wide v0
.end method

.method private final d(Landroid/util/DisplayMetrics;D)Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "width"

    .line 7
    .line 8
    iget v2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putInt(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const-string v1, "height"

    .line 14
    .line 15
    iget v2, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putInt(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    iget v1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 21
    .line 22
    float-to-double v1, v1

    .line 23
    const-string v3, "scale"

    .line 24
    .line 25
    invoke-virtual {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 26
    .line 27
    .line 28
    const-string v1, "fontScale"

    .line 29
    .line 30
    invoke-virtual {v0, v1, p2, p3}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 31
    .line 32
    .line 33
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 34
    .line 35
    int-to-double p1, p1

    .line 36
    const-string p3, "densityDpi"

    .line 37
    .line 38
    invoke-virtual {v0, p3, p1, p2}, Lcom/facebook/react/bridge/WritableNativeMap;->putDouble(Ljava/lang/String;D)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public static final e()Landroid/util/DisplayMetrics;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/e;->c:Landroid/util/DisplayMetrics;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "null cannot be cast to non-null type android.util.DisplayMetrics"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v1, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public static final g()Landroid/util/DisplayMetrics;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/e;->b:Landroid/util/DisplayMetrics;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "null cannot be cast to non-null type android.util.DisplayMetrics"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v1, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public static final h(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/facebook/react/uimanager/e;->b:Landroid/util/DisplayMetrics;

    .line 15
    .line 16
    new-instance v1, Landroid/util/DisplayMetrics;

    .line 17
    .line 18
    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroid/util/DisplayMetrics;->setTo(Landroid/util/DisplayMetrics;)V

    .line 22
    .line 23
    .line 24
    const-string v2, "window"

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v2, "null cannot be cast to non-null type android.view.WindowManager"

    .line 31
    .line 32
    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast p0, Landroid/view/WindowManager;

    .line 36
    .line 37
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0, v1}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 42
    .line 43
    .line 44
    iget p0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 45
    .line 46
    iput p0, v1, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 47
    .line 48
    sput-object v1, Lcom/facebook/react/uimanager/e;->c:Landroid/util/DisplayMetrics;

    .line 49
    .line 50
    return-void
.end method

.method public static final i(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/uimanager/e;->c:Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {p0}, Lcom/facebook/react/uimanager/e;->h(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(FF)J
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-long v0, p1

    .line 6
    const/16 p1, 0x20

    .line 7
    .line 8
    shl-long/2addr v0, p1

    .line 9
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    int-to-long p1, p1

    .line 14
    or-long/2addr p1, v0

    .line 15
    return-wide p1
.end method

.method public final f(Landroid/app/Activity;)I
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-static {p1}, Landroidx/core/view/a0;->F(Landroid/view/View;)Landroidx/core/view/L0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {}, Landroidx/core/view/L0$p;->h()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    or-int/2addr v0, v1

    .line 31
    invoke-static {}, Landroidx/core/view/L0$p;->c()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    or-int/2addr v0, v1

    .line 36
    invoke-virtual {p1, v0}, Landroidx/core/view/L0;->f(I)LA1/b;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget p1, p1, LA1/b;->b:I

    .line 41
    .line 42
    return p1

    .line 43
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 44
    return p1
.end method
