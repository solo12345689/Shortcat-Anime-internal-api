.class public final Lcom/facebook/react/animated/NativeAnimatedModule$f;
.super Lcom/facebook/react/animated/NativeAnimatedModule$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->addAnimatedEventToView(DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$f;->c:I

    .line 2
    .line 3
    iput-object p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$f;->d:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/facebook/react/animated/NativeAnimatedModule$f;->e:Lcom/facebook/react/bridge/ReadableMap;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$d;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(LT6/t;)V
    .locals 3

    .line 1
    const-string v0, "animatedNodesManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$f;->c:I

    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$f;->d:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$f;->e:Lcom/facebook/react/bridge/ReadableMap;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1, v2}, LT6/t;->b(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
