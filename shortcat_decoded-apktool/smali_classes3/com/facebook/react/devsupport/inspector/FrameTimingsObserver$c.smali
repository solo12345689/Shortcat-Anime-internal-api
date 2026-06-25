.class final Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->emitFrameEvent(IIJJ[B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:J

.field final synthetic f:J

.field final synthetic g:[B


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;IIJJ[BLZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 2
    .line 3
    iput p2, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->c:I

    .line 4
    .line 5
    iput p3, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->d:I

    .line 6
    .line 7
    iput-wide p4, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->e:J

    .line 8
    .line 9
    iput-wide p6, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->f:J

    .line 10
    .line 11
    iput-object p8, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->g:[B

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 10

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 4
    .line 5
    iget v2, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->c:I

    .line 6
    .line 7
    iget v3, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->d:I

    .line 8
    .line 9
    iget-wide v4, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->e:J

    .line 10
    .line 11
    iget-wide v6, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->f:J

    .line 12
    .line 13
    iget-object v8, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->g:[B

    .line 14
    .line 15
    move-object v9, p2

    .line 16
    invoke-direct/range {v0 .. v9}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;-><init>(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;IIJJ[BLZd/e;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->access$getOnFrameTimingSequence$p(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;)Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;

    .line 18
    .line 19
    iget v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->c:I

    .line 20
    .line 21
    iget v2, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->d:I

    .line 22
    .line 23
    iget-wide v3, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->e:J

    .line 24
    .line 25
    iget-wide v5, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->f:J

    .line 26
    .line 27
    iget-object v7, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$c;->g:[B

    .line 28
    .line 29
    invoke-direct/range {v0 .. v7}, Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;-><init>(IIJJ[B)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object p1, LTd/L;->a:LTd/L;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method
