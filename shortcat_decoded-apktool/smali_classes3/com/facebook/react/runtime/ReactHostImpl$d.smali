.class public final Lcom/facebook/react/runtime/ReactHostImpl$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lc7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/runtime/ReactHostImpl;->loadJSBundleFromMetro()Ly7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/facebook/react/devsupport/Y;

.field final synthetic e:Ly7/o;


# direct methods
.method constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/devsupport/Y;Ly7/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl$d;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl$d;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl$d;->c:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/facebook/react/runtime/ReactHostImpl$d;->d:Lcom/facebook/react/devsupport/Y;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/facebook/react/runtime/ReactHostImpl$d;->e:Ly7/o;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$d;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->access$getStateTracker$p(Lcom/facebook/react/runtime/ReactHostImpl;)Lcom/facebook/react/runtime/c0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl$d;->b:Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "Creating BundleLoader"

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/runtime/c0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lcom/facebook/react/bridge/JSBundleLoader;->Companion:Lcom/facebook/react/bridge/JSBundleLoader$Companion;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl$d;->c:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl$d;->d:Lcom/facebook/react/devsupport/Y;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/facebook/react/devsupport/Y;->j()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/bridge/JSBundleLoader$Companion;->createCachedBundleFromNetworkLoader(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/JSBundleLoader;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl$d;->e:Ly7/o;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ly7/o;->d(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "cause"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl$d;->e:Ly7/o;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ly7/o;->c(Ljava/lang/Exception;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
