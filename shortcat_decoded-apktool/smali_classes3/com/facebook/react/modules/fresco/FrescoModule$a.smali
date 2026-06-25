.class public final Lcom/facebook/react/modules/fresco/FrescoModule$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/fresco/FrescoModule;
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
    invoke-direct {p0}, Lcom/facebook/react/modules/fresco/FrescoModule$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/modules/fresco/FrescoModule$a;Lcom/facebook/react/bridge/ReactContext;)Lz6/u;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/fresco/FrescoModule$a;->b(Lcom/facebook/react/bridge/ReactContext;)Lz6/u;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b(Lcom/facebook/react/bridge/ReactContext;)Lz6/u;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/modules/fresco/FrescoModule$a;->c(Lcom/facebook/react/bridge/ReactContext;)Lz6/u$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lz6/u$a;->a()Lz6/u;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method


# virtual methods
.method public final c(Lcom/facebook/react/bridge/ReactContext;)Lz6/u$a;
    .locals 5

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lu7/d;

    .line 12
    .line 13
    invoke-direct {v1}, Lu7/d;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lv7/f;->a()Ldg/A;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ldg/A;->d()Ldg/n;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer"

    .line 28
    .line 29
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v2, Lv7/a;

    .line 33
    .line 34
    new-instance v3, Lv7/d;

    .line 35
    .line 36
    invoke-direct {v3}, Lv7/d;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v4, Ldg/w;

    .line 40
    .line 41
    invoke-direct {v4, v3}, Ldg/w;-><init>(Ljava/net/CookieHandler;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v2, v4}, Lv7/a;->a(Ldg/n;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v2, "getApplicationContext(...)"

    .line 52
    .line 53
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v1}, Lv6/a;->a(Landroid/content/Context;Ldg/A;)Lz6/u$a;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v2, Lu7/c;

    .line 61
    .line 62
    invoke-direct {v2, v1}, Lu7/c;-><init>(Ldg/A;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2}, Lz6/u$a;->S(Lcom/facebook/imagepipeline/producers/X;)Lz6/u$a;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v1, Lz6/n;->b:Lz6/n;

    .line 70
    .line 71
    invoke-virtual {p1, v1}, Lz6/u$a;->R(Lz6/n;)Lz6/u$a;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1, v0}, Lz6/u$a;->T(Ljava/util/Set;)Lz6/u$a;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Lz6/u$a;->b()Lz6/x$a;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-virtual {v0, v1}, Lz6/x$a;->d(Z)Lz6/x$a;

    .line 85
    .line 86
    .line 87
    return-object p1
.end method

.method public final d()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/modules/fresco/FrescoModule;->access$getHasBeenInitialized$cp()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
