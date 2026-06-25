.class public final synthetic Lcom/facebook/react/devsupport/inspector/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:J

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;IIJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/inspector/a;->a:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/devsupport/inspector/a;->b:I

    .line 7
    .line 8
    iput p3, p0, Lcom/facebook/react/devsupport/inspector/a;->c:I

    .line 9
    .line 10
    iput-wide p4, p0, Lcom/facebook/react/devsupport/inspector/a;->d:J

    .line 11
    .line 12
    iput-wide p6, p0, Lcom/facebook/react/devsupport/inspector/a;->e:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/inspector/a;->a:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/devsupport/inspector/a;->b:I

    .line 4
    .line 5
    iget v2, p0, Lcom/facebook/react/devsupport/inspector/a;->c:I

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/facebook/react/devsupport/inspector/a;->d:J

    .line 8
    .line 9
    iget-wide v5, p0, Lcom/facebook/react/devsupport/inspector/a;->e:J

    .line 10
    .line 11
    move-object v7, p1

    .line 12
    check-cast v7, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;

    .line 13
    .line 14
    invoke-static/range {v0 .. v7}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->b(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;IIJJLcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;)LTd/L;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
