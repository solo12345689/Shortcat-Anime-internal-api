.class final Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->encodeFrame(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

.field final synthetic c:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->c:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance p1, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->c:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;-><init>(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->c:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->b()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p1, v0}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->access$encodeScreenshot(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;Landroid/graphics/Bitmap;)[B

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    iget-object v1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 24
    .line 25
    iget-object p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->c:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->d()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->c:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->e()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->c:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->a()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    iget-object p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->c:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->c()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    invoke-static/range {v1 .. v8}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->access$emitFrameEvent(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;IIJJ[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->c:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->b()Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->access$getEncodingInProgress$p(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const/4 v0, 0x0

    .line 68
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->access$getLastFrameBuffer$p(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;

    .line 83
    .line 84
    if-eqz p1, :cond_0

    .line 85
    .line 86
    :try_start_1
    iget-object v0, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->b()Landroid/graphics/Bitmap;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->access$encodeScreenshot(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;Landroid/graphics/Bitmap;)[B

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    iget-object v2, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->b:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->d()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->e()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->a()J

    .line 107
    .line 108
    .line 109
    move-result-wide v5

    .line 110
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->c()J

    .line 111
    .line 112
    .line 113
    move-result-wide v7

    .line 114
    invoke-static/range {v2 .. v9}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->access$emitFrameEvent(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;IIJJ[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->b()Landroid/graphics/Bitmap;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :catchall_0
    move-exception v0

    .line 126
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->b()Landroid/graphics/Bitmap;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 131
    .line 132
    .line 133
    throw v0

    .line 134
    :cond_0
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 135
    .line 136
    return-object p1

    .line 137
    :catchall_1
    move-exception v0

    .line 138
    move-object p1, v0

    .line 139
    iget-object v0, p0, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$d;->c:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;

    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver$b;->b()Landroid/graphics/Bitmap;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 152
    .line 153
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p1
.end method
