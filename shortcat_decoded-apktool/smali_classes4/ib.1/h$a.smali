.class final Lib/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/runtime/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lib/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private final b:Ljava/util/List;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Z

.field private final g:Lcom/facebook/react/runtime/BindingsInstaller;

.field private final h:Lcom/facebook/react/T$a;

.field private final i:Ljava/util/List;

.field private j:Lcom/facebook/react/bridge/JSBundleLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/T$a;Ljava/util/List;)V
    .locals 1

    const-string v0, "weakContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jsMainModulePath"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turboModuleManagerDelegateBuilder"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hostHandlers"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lib/h$a;->a:Ljava/lang/ref/WeakReference;

    .line 3
    iput-object p2, p0, Lib/h$a;->b:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lib/h$a;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lib/h$a;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lib/h$a;->e:Ljava/lang/String;

    .line 7
    iput-boolean p6, p0, Lib/h$a;->f:Z

    .line 8
    iput-object p7, p0, Lib/h$a;->g:Lcom/facebook/react/runtime/BindingsInstaller;

    .line 9
    iput-object p8, p0, Lib/h$a;->h:Lcom/facebook/react/T$a;

    .line 10
    iput-object p9, p0, Lib/h$a;->i:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ref/WeakReference;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/T$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x10

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_1

    move-object p7, v0

    :cond_1
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_2

    .line 11
    new-instance p8, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;

    invoke-direct {p8}, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;-><init>()V

    :cond_2
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 12
    invoke-direct/range {p1 .. p10}, Lib/h$a;-><init>(Ljava/lang/ref/WeakReference;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/T$a;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic g(Lib/h$a;Lsb/j;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lib/h$a;->k(Lib/h$a;Lsb/j;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h(Lsb/j;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-static {p0}, Lib/h$a;->l(Lsb/j;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Lib/h$a;Lsb/j;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lib/h$a;->j(Lib/h$a;Lsb/j;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final j(Lib/h$a;Lsb/j;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p0, Lib/h$a;->f:Z

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lsb/j;->b(Z)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private static final k(Lib/h$a;Lsb/j;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p0, Lib/h$a;->f:Z

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lsb/j;->d(Z)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private static final l(Lsb/j;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lsb/j;->g()Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public a()Lcom/facebook/react/runtime/JSRuntimeFactory;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/hermes/HermesInstance;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/runtime/hermes/HermesInstance;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public b()Lcom/facebook/react/bridge/JSBundleLoader;
    .locals 7

    .line 1
    iget-object v0, p0, Lib/h$a;->j:Lcom/facebook/react/bridge/JSBundleLoader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lib/h$a;->a:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0}, Lib/h$a;->n()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    const-string v3, "assets://"

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    invoke-static {v1, v3, v6, v4, v5}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    sget-object v3, Lcom/facebook/react/bridge/JSBundleLoader;->Companion:Lcom/facebook/react/bridge/JSBundleLoader$Companion;

    .line 35
    .line 36
    invoke-virtual {v3, v0, v1, v2}, Lcom/facebook/react/bridge/JSBundleLoader$Companion;->createAssetLoader(Landroid/content/Context;Ljava/lang/String;Z)Lcom/facebook/react/bridge/JSBundleLoader;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :cond_1
    sget-object v0, Lcom/facebook/react/bridge/JSBundleLoader;->Companion:Lcom/facebook/react/bridge/JSBundleLoader$Companion;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/JSBundleLoader$Companion;->createFileLoader(Ljava/lang/String;)Lcom/facebook/react/bridge/JSBundleLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_2
    sget-object v1, Lcom/facebook/react/bridge/JSBundleLoader;->Companion:Lcom/facebook/react/bridge/JSBundleLoader$Companion;

    .line 49
    .line 50
    invoke-virtual {p0}, Lib/h$a;->m()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    new-instance v5, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v1, v0, v3, v2}, Lcom/facebook/react/bridge/JSBundleLoader$Companion;->createAssetLoader(Landroid/content/Context;Ljava/lang/String;Z)Lcom/facebook/react/bridge/JSBundleLoader;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0

    .line 74
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v1, "Unable to get concrete Context"

    .line 77
    .line 78
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lib/h$a;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lib/h$a;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lib/h$a;->i:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lib/h$a;->i:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lsb/j;

    .line 31
    .line 32
    invoke-virtual {p0}, Lib/h$a;->o()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-interface {v1, v2, p1}, Lsb/j;->e(ZLjava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void

    .line 41
    :cond_1
    throw p1
.end method

.method public f()Lcom/facebook/react/T$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lib/h$a;->h:Lcom/facebook/react/T$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBindingsInstaller()Lcom/facebook/react/runtime/BindingsInstaller;
    .locals 1

    .line 1
    iget-object v0, p0, Lib/h$a;->g:Lcom/facebook/react/runtime/BindingsInstaller;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lib/h$a;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, LUd/u;->c0(Ljava/lang/Iterable;)LCf/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lib/f;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lib/f;-><init>(Lib/h$a;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, LCf/l;->L(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, LCf/l;->D(LCf/i;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/String;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lib/h$a;->d:Ljava/lang/String;

    .line 25
    .line 26
    :cond_0
    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lib/h$a;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, LUd/u;->c0(Ljava/lang/Iterable;)LCf/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lib/g;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lib/g;-><init>(Lib/h$a;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, LCf/l;->L(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, LCf/l;->D(LCf/i;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/String;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lib/h$a;->e:Ljava/lang/String;

    .line 25
    .line 26
    :cond_0
    return-object v0
.end method

.method public final o()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lib/h$a;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, LUd/u;->c0(Ljava/lang/Iterable;)LCf/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lib/e;

    .line 8
    .line 9
    invoke-direct {v1}, Lib/e;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, LCf/l;->L(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, LCf/l;->D(LCf/i;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Boolean;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0

    .line 29
    :cond_0
    iget-boolean v0, p0, Lib/h$a;->f:Z

    .line 30
    .line 31
    return v0
.end method
