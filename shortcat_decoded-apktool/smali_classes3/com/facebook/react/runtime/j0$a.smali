.class public final Lcom/facebook/react/runtime/j0$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/runtime/j0;
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
    invoke-direct {p0}, Lcom/facebook/react/runtime/j0$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/runtime/j0$a;Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/j0$a;->e(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic b(Lcom/facebook/react/runtime/j0$a;Landroid/content/Context;)F
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/j0$a;->f(Landroid/content/Context;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic c(Lcom/facebook/react/runtime/j0$a;Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/j0$a;->g(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final e(Landroid/content/Context;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/i18nmanager/a;->a:Lcom/facebook/react/modules/i18nmanager/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/modules/i18nmanager/a$a;->a()Lcom/facebook/react/modules/i18nmanager/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/facebook/react/modules/i18nmanager/a;->d(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method private final f(Landroid/content/Context;)F
    .locals 1

    .line 1
    invoke-static {}, Lh7/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget p1, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 19
    .line 20
    return p1
.end method

.method private final g(Landroid/content/Context;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/i18nmanager/a;->a:Lcom/facebook/react/modules/i18nmanager/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/modules/i18nmanager/a$a;->a()Lcom/facebook/react/modules/i18nmanager/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/facebook/react/modules/i18nmanager/a;->i(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method


# virtual methods
.method public final d(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lcom/facebook/react/runtime/j0;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "moduleName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/facebook/react/runtime/j0;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/react/runtime/j0;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Lcom/facebook/react/runtime/k0;

    .line 17
    .line 18
    invoke-direct {p2, p1, v0}, Lcom/facebook/react/runtime/k0;-><init>(Landroid/content/Context;Lcom/facebook/react/runtime/j0;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lcom/facebook/react/runtime/j0;->d(Lcom/facebook/react/runtime/k0;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
