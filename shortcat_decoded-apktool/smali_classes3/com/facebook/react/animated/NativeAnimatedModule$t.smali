.class public final Lcom/facebook/react/animated/NativeAnimatedModule$t;
.super Lcom/facebook/react/animated/NativeAnimatedModule$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->setAnimatedNodeOffset(DD)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:D


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;ID)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$t;->c:I

    .line 2
    .line 3
    iput-wide p3, p0, Lcom/facebook/react/animated/NativeAnimatedModule$t;->d:D

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$d;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V

    .line 6
    .line 7
    .line 8
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
    iget v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$t;->c:I

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$t;->d:D

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1, v2}, LT6/t;->v(ID)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
