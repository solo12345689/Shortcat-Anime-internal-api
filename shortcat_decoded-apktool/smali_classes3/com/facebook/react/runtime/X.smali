.class public final synthetic Lcom/facebook/react/runtime/X;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/facebook/react/bridge/NativeArray;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/runtime/X;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/runtime/X;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/runtime/X;->c:Lcom/facebook/react/bridge/NativeArray;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/X;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/runtime/X;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/runtime/X;->c:Lcom/facebook/react/bridge/NativeArray;

    .line 6
    .line 7
    check-cast p1, Lcom/facebook/react/runtime/ReactInstance;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->K(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;Lcom/facebook/react/runtime/ReactInstance;)LTd/L;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
