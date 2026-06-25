.class public final Lw/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw/d;


# instance fields
.field private final a:Lw/x0;

.field private final b:Lw/s0;

.field private final c:Ljava/lang/Object;

.field private final d:Lw/q;

.field private final e:Lw/q;

.field private final f:Lw/q;

.field private final g:Ljava/lang/Object;

.field private final h:J

.field private final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lw/x0;Lw/s0;Ljava/lang/Object;Lw/q;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw/y;->a:Lw/x0;

    .line 3
    iput-object p2, p0, Lw/y;->b:Lw/s0;

    .line 4
    iput-object p3, p0, Lw/y;->c:Ljava/lang/Object;

    .line 5
    invoke-virtual {p0}, Lw/y;->e()Lw/s0;

    move-result-object p2

    invoke-interface {p2}, Lw/s0;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lw/q;

    iput-object p2, p0, Lw/y;->d:Lw/q;

    .line 6
    invoke-static {p4}, Lw/r;->e(Lw/q;)Lw/q;

    move-result-object p3

    iput-object p3, p0, Lw/y;->e:Lw/q;

    .line 7
    invoke-virtual {p0}, Lw/y;->e()Lw/s0;

    move-result-object p3

    invoke-interface {p3}, Lw/s0;->b()Lkotlin/jvm/functions/Function1;

    move-result-object p3

    .line 8
    invoke-interface {p1, p2, p4}, Lw/x0;->b(Lw/q;Lw/q;)Lw/q;

    move-result-object v0

    .line 9
    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, p0, Lw/y;->g:Ljava/lang/Object;

    .line 10
    invoke-interface {p1, p2, p4}, Lw/x0;->c(Lw/q;Lw/q;)J

    move-result-wide v0

    iput-wide v0, p0, Lw/y;->h:J

    .line 11
    invoke-virtual {p0}, Lw/y;->d()J

    move-result-wide v0

    .line 12
    invoke-interface {p1, v0, v1, p2, p4}, Lw/x0;->e(JLw/q;Lw/q;)Lw/q;

    move-result-object p1

    .line 13
    invoke-static {p1}, Lw/r;->e(Lw/q;)Lw/q;

    move-result-object p1

    .line 14
    iput-object p1, p0, Lw/y;->f:Lw/q;

    .line 15
    invoke-virtual {p1}, Lw/q;->b()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    .line 16
    iget-object p3, p0, Lw/y;->f:Lw/q;

    invoke-virtual {p3, p2}, Lw/q;->a(I)F

    move-result p4

    .line 17
    iget-object v0, p0, Lw/y;->a:Lw/x0;

    invoke-interface {v0}, Lw/x0;->a()F

    move-result v0

    neg-float v0, v0

    .line 18
    iget-object v1, p0, Lw/y;->a:Lw/x0;

    invoke-interface {v1}, Lw/x0;->a()F

    move-result v1

    .line 19
    invoke-static {p4, v0, v1}, Loe/j;->l(FFF)F

    move-result p4

    invoke-virtual {p3, p2, p4}, Lw/q;->e(IF)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lw/z;Lw/s0;Ljava/lang/Object;Lw/q;)V
    .locals 0

    .line 20
    invoke-interface {p1, p2}, Lw/z;->a(Lw/s0;)Lw/x0;

    move-result-object p1

    .line 21
    invoke-direct {p0, p1, p2, p3, p4}, Lw/y;-><init>(Lw/x0;Lw/s0;Ljava/lang/Object;Lw/q;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lw/y;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public b(J)Lw/q;
    .locals 3

    .line 1
    invoke-interface {p0, p1, p2}, Lw/d;->c(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lw/y;->a:Lw/x0;

    .line 8
    .line 9
    iget-object v1, p0, Lw/y;->d:Lw/q;

    .line 10
    .line 11
    iget-object v2, p0, Lw/y;->e:Lw/q;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2, v1, v2}, Lw/x0;->e(JLw/q;Lw/q;)Lw/q;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object p1, p0, Lw/y;->f:Lw/q;

    .line 19
    .line 20
    return-object p1
.end method

.method public d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lw/y;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public e()Lw/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/y;->b:Lw/s0;

    .line 2
    .line 3
    return-object v0
.end method

.method public f(J)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p0, p1, p2}, Lw/d;->c(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lw/y;->e()Lw/s0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lw/s0;->b()Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lw/y;->a:Lw/x0;

    .line 16
    .line 17
    iget-object v2, p0, Lw/y;->d:Lw/q;

    .line 18
    .line 19
    iget-object v3, p0, Lw/y;->e:Lw/q;

    .line 20
    .line 21
    invoke-interface {v1, p1, p2, v2, v3}, Lw/x0;->d(JLw/q;Lw/q;)Lw/q;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-virtual {p0}, Lw/y;->g()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/y;->g:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
