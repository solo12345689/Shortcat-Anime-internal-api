.class public final Lexpo/modules/kotlin/views/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lkotlin/jvm/functions/Function2;

.field private final b:Ljava/lang/Class;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/lang/String;

.field private final e:Lkotlin/jvm/functions/Function1;

.field private final f:Lexpo/modules/kotlin/views/b;

.field private final g:Lkotlin/jvm/functions/Function1;

.field private final h:Ljava/util/List;

.field private final i:Ljava/util/List;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Ljava/lang/Class;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/views/b;Lexpo/modules/kotlin/views/q;Lkotlin/jvm/functions/Function1;Ljava/util/List;)V
    .locals 0

    .line 1
    const-string p7, "viewFactory"

    .line 2
    .line 3
    invoke-static {p1, p7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p7, "viewType"

    .line 7
    .line 8
    invoke-static {p2, p7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p7, "props"

    .line 12
    .line 13
    invoke-static {p3, p7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p7, "name"

    .line 17
    .line 18
    invoke-static {p4, p7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p7, "asyncFunctions"

    .line 22
    .line 23
    invoke-static {p9, p7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lexpo/modules/kotlin/views/r;->a:Lkotlin/jvm/functions/Function2;

    .line 30
    .line 31
    iput-object p2, p0, Lexpo/modules/kotlin/views/r;->b:Ljava/lang/Class;

    .line 32
    .line 33
    iput-object p3, p0, Lexpo/modules/kotlin/views/r;->c:Ljava/util/Map;

    .line 34
    .line 35
    iput-object p4, p0, Lexpo/modules/kotlin/views/r;->d:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p5, p0, Lexpo/modules/kotlin/views/r;->e:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    iput-object p6, p0, Lexpo/modules/kotlin/views/r;->f:Lexpo/modules/kotlin/views/b;

    .line 40
    .line 41
    iput-object p8, p0, Lexpo/modules/kotlin/views/r;->g:Lkotlin/jvm/functions/Function1;

    .line 42
    .line 43
    iput-object p9, p0, Lexpo/modules/kotlin/views/r;->h:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/lang/Iterable;

    .line 50
    .line 51
    invoke-static {p1}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lexpo/modules/kotlin/views/r;->i:Ljava/util/List;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LUb/d;)Landroid/view/View;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lexpo/modules/kotlin/views/r;->a:Lkotlin/jvm/functions/Function2;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroid/view/View;

    .line 18
    .line 19
    return-object p1
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/r;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lexpo/modules/kotlin/views/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/r;->f:Lexpo/modules/kotlin/views/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/r;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/r;->e:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/r;->g:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/r;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/r;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Lexpo/modules/kotlin/views/q;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final j()Lexpo/modules/kotlin/views/s;
    .locals 2

    .line 1
    const-class v0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/views/r;->b:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lexpo/modules/kotlin/views/s;->b:Lexpo/modules/kotlin/views/s;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    sget-object v0, Lexpo/modules/kotlin/views/s;->a:Lexpo/modules/kotlin/views/s;

    .line 15
    .line 16
    return-object v0
.end method

.method public final k()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/r;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l(Landroid/view/View;Lexpo/modules/kotlin/exception/CodedException;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "exception"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    instance-of v0, p1, Lcom/facebook/react/bridge/ReactContext;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {p1}, LUb/w;->a(Lcom/facebook/react/bridge/ReactContext;)Lexpo/modules/adapters/react/NativeModulesProxy;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-virtual {p1}, Lexpo/modules/adapters/react/NativeModulesProxy;->getKotlinInteropModuleRegistry()LUb/p;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, LUb/p;->f()LUb/d;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, LUb/d;->r()LZb/b;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1, p2}, LZb/b;->B(Lexpo/modules/kotlin/exception/CodedException;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_1
    return-void
.end method
