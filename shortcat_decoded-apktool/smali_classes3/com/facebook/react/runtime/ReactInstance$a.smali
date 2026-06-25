.class public final Lcom/facebook/react/runtime/ReactInstance$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/uimanager/ComponentNameResolver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/runtime/ReactInstance;-><init>(Lcom/facebook/react/runtime/c;Lcom/facebook/react/runtime/f;Lcom/facebook/react/fabric/ComponentFactory;Lc7/f;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;ZLcom/facebook/react/runtime/ReactHostInspectorTarget;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/runtime/ReactInstance;


# direct methods
.method constructor <init>(Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactInstance$a;->a:Lcom/facebook/react/runtime/ReactInstance;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getComponentNames()[Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactInstance$a;->a:Lcom/facebook/react/runtime/ReactInstance;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/runtime/ReactInstance;->j(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/runtime/ReactInstance$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactInstance$b;->a()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-static {}, Lcom/facebook/react/runtime/ReactInstance;->i()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "No ViewManager names found"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lz5/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-array v0, v2, [Ljava/lang/String;

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    new-array v1, v2, [Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, [Ljava/lang/String;

    .line 37
    .line 38
    return-object v0
.end method
