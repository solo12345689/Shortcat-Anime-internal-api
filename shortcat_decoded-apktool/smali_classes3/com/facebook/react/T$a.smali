.class public abstract Lcom/facebook/react/T$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/List;

.field private b:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Lcom/facebook/react/T;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/T$a;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/T$a;->a:Ljava/util/List;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/T$a;->b(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/T;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v1, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string v1, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method

.method protected abstract b(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/T;
.end method

.method public final c(Ljava/util/List;)Lcom/facebook/react/T$a;
    .locals 1

    .line 1
    const-string v0, "packages"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/facebook/react/T$a;->a:Ljava/util/List;

    .line 11
    .line 12
    return-object p0
.end method

.method public final d(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/T$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/T$a;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    return-object p0
.end method
