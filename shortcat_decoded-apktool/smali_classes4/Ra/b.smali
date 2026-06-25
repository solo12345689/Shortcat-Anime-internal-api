.class public abstract LRa/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(LQa/d;)V
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, LQa/d;->O()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, LRa/b;->a:I

    .line 14
    .line 15
    invoke-virtual {p1}, LQa/d;->T()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, LRa/b;->b:I

    .line 20
    .line 21
    invoke-virtual {p1}, LQa/d;->S()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, LRa/b;->c:I

    .line 26
    .line 27
    invoke-virtual {p1}, LQa/d;->Q()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, LRa/b;->d:I

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 1
    const-string v0, "eventData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "numberOfPointers"

    .line 7
    .line 8
    iget v1, p0, LRa/b;->a:I

    .line 9
    .line 10
    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const-string v0, "handlerTag"

    .line 14
    .line 15
    iget v1, p0, LRa/b;->b:I

    .line 16
    .line 17
    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    const-string v0, "state"

    .line 21
    .line 22
    iget v1, p0, LRa/b;->c:I

    .line 23
    .line 24
    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    const-string v0, "pointerType"

    .line 28
    .line 29
    iget v1, p0, LRa/b;->d:I

    .line 30
    .line 31
    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
