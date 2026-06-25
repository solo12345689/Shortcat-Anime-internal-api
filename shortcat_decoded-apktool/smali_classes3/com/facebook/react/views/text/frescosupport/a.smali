.class public final Lcom/facebook/react/views/text/frescosupport/a;
.super LO7/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/frescosupport/a$a;
    }
.end annotation


# static fields
.field public static final i:Lcom/facebook/react/views/text/frescosupport/a$a;


# instance fields
.field private final a:LS5/b;

.field private final b:Ljava/lang/Object;

.field private c:Landroid/net/Uri;

.field private d:Lcom/facebook/react/bridge/ReadableMap;

.field private e:F

.field private f:Ljava/lang/String;

.field private g:F

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/frescosupport/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/frescosupport/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/text/frescosupport/a;->i:Lcom/facebook/react/views/text/frescosupport/a$a;

    .line 8
    .line 9
    const-string v0, "FrescoBasedReactTextInlineImageShadowNode"

    .line 10
    .line 11
    sget-object v1, LW6/a;->b:LW6/a;

    .line 12
    .line 13
    invoke-static {v0, v1}, LW6/b;->a(Ljava/lang/String;LW6/a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(LS5/b;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "draweeControllerBuilder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LO7/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->a:LS5/b;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/facebook/react/views/text/frescosupport/a;->b:Ljava/lang/Object;

    .line 12
    .line 13
    sget p1, Lcom/facebook/yoga/g;->b:F

    .line 14
    .line 15
    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->e:F

    .line 16
    .line 17
    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->g:F

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public f()LP7/r;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->getThemedContext()Lcom/facebook/react/uimanager/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->e:F

    .line 10
    .line 11
    float-to-double v0, v0

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    double-to-int v4, v0

    .line 17
    iget v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->g:F

    .line 18
    .line 19
    float-to-double v0, v0

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    double-to-int v3, v0

    .line 25
    new-instance v1, Lcom/facebook/react/views/text/frescosupport/b;

    .line 26
    .line 27
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget v5, p0, Lcom/facebook/react/views/text/frescosupport/a;->h:I

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/react/views/text/frescosupport/a;->j()Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {p0}, Lcom/facebook/react/views/text/frescosupport/a;->i()Lcom/facebook/react/bridge/ReadableMap;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-virtual {p0}, Lcom/facebook/react/views/text/frescosupport/a;->h()LS5/b;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-virtual {p0}, Lcom/facebook/react/views/text/frescosupport/a;->g()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    iget-object v10, p0, Lcom/facebook/react/views/text/frescosupport/a;->f:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v10}, Lcom/facebook/react/views/text/frescosupport/b;-><init>(Landroid/content/res/Resources;IIILandroid/net/Uri;Lcom/facebook/react/bridge/ReadableMap;LS5/b;Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v1
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()LS5/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->a:LS5/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Lcom/facebook/react/bridge/ReadableMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->d:Lcom/facebook/react/bridge/ReadableMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public isVirtual()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final j()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->c:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setHeaders(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "headers"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->d:Lcom/facebook/react/bridge/ReadableMap;

    .line 2
    .line 3
    return-void
.end method

.method public setHeight(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2

    .line 1
    const-string v0, "newHeight"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    double-to-float p1, v0

    .line 19
    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->g:F

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p1, "ReactNative"

    .line 23
    .line 24
    const-string v0, "Inline images must not have percentage based height"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget p1, Lcom/facebook/yoga/g;->b:F

    .line 30
    .line 31
    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->g:F

    .line 32
    .line 33
    return-void
.end method

.method public final setResizeMode(Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "resizeMode"
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSource(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 4
    .annotation runtime LB7/a;
        name = "src"
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Map:Lcom/facebook/react/bridge/ReadableType;

    .line 16
    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    const-string v1, "uri"

    .line 27
    .line 28
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "Required value was null."

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_2
    :goto_0
    move-object p1, v0

    .line 42
    :goto_1
    if-eqz p1, :cond_4

    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 45
    .line 46
    .line 47
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 48
    :try_start_1
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 52
    if-nez v2, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :catch_0
    :cond_3
    move-object v0, v1

    .line 56
    :catch_1
    :goto_2
    if-nez v0, :cond_4

    .line 57
    .line 58
    sget-object v0, Lcom/facebook/react/views/text/frescosupport/a;->i:Lcom/facebook/react/views/text/frescosupport/a$a;

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->getThemedContext()Lcom/facebook/react/uimanager/b0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "getThemedContext(...)"

    .line 65
    .line 66
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/views/text/frescosupport/a$a;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :cond_4
    iget-object p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->c:Landroid/net/Uri;

    .line 74
    .line 75
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_5

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/P;->markUpdated()V

    .line 82
    .line 83
    .line 84
    :cond_5
    iput-object v0, p0, Lcom/facebook/react/views/text/frescosupport/a;->c:Landroid/net/Uri;

    .line 85
    .line 86
    return-void
.end method

.method public final setTintColor(I)V
    .locals 0
    .annotation runtime LB7/a;
        customType = "Color"
        name = "tintColor"
    .end annotation

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->h:I

    .line 2
    .line 3
    return-void
.end method

.method public setWidth(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2

    .line 1
    const-string v0, "newWidth"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    double-to-float p1, v0

    .line 19
    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->e:F

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p1, "ReactNative"

    .line 23
    .line 24
    const-string v0, "Inline images must not have percentage based width"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lz5/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget p1, Lcom/facebook/yoga/g;->b:F

    .line 30
    .line 31
    iput p1, p0, Lcom/facebook/react/views/text/frescosupport/a;->e:F

    .line 32
    .line 33
    return-void
.end method
