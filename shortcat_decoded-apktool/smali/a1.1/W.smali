.class public La1/W;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:La1/M;

.field private final b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(La1/M;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La1/W;->a:La1/M;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La1/W;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()La1/c0;
    .locals 1

    .line 1
    iget-object v0, p0, La1/W;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La1/c0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, La1/W;->a:La1/M;

    .line 2
    .line 3
    invoke-interface {v0}, La1/M;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La1/W;->a()La1/c0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La1/W;->a:La1/M;

    .line 8
    .line 9
    invoke-interface {v0}, La1/M;->g()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public d(La1/U;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La1/c0;
    .locals 1

    .line 1
    iget-object v0, p0, La1/W;->a:La1/M;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, La1/M;->h(La1/U;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, La1/c0;

    .line 7
    .line 8
    iget-object p2, p0, La1/W;->a:La1/M;

    .line 9
    .line 10
    invoke-direct {p1, p0, p2}, La1/c0;-><init>(La1/W;La1/M;)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, La1/W;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p1
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, La1/W;->a:La1/M;

    .line 2
    .line 3
    invoke-interface {v0}, La1/M;->a()V

    .line 4
    .line 5
    .line 6
    new-instance v0, La1/c0;

    .line 7
    .line 8
    iget-object v1, p0, La1/W;->a:La1/M;

    .line 9
    .line 10
    invoke-direct {v0, p0, v1}, La1/c0;-><init>(La1/W;La1/M;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, La1/W;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, La1/W;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La1/W;->a:La1/M;

    .line 8
    .line 9
    invoke-interface {v0}, La1/M;->b()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public g(La1/c0;)V
    .locals 2

    .line 1
    iget-object v0, p0, La1/W;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p1, v1}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, La1/W;->a:La1/M;

    .line 11
    .line 12
    invoke-interface {p1}, La1/M;->b()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
