.class public abstract Lr3/i;
.super Lz2/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lr3/k;


# instance fields
.field private final o:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Lr3/o;

    .line 3
    .line 4
    new-array v0, v0, [Lr3/p;

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lz2/h;-><init>([Lz2/f;[Lz2/g;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lr3/i;->o:Ljava/lang/String;

    .line 10
    .line 11
    const/16 p1, 0x400

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lz2/h;->x(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method static synthetic y(Lr3/i;Lz2/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lz2/h;->u(Lz2/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method protected final A()Lr3/p;
    .locals 1

    .line 1
    new-instance v0, Lr3/i$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lr3/i$a;-><init>(Lr3/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected final B(Ljava/lang/Throwable;)Lr3/l;
    .locals 2

    .line 1
    new-instance v0, Lr3/l;

    .line 2
    .line 3
    const-string v1, "Unexpected decode error"

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lr3/l;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method protected abstract C([BIZ)Lr3/j;
.end method

.method protected final D(Lr3/o;Lr3/p;Z)Lr3/l;
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p1, Lz2/f;->d:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p0, v1, v0, p3}, Lr3/i;->C([BIZ)Lr3/j;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-wide v3, p1, Lz2/f;->f:J

    .line 22
    .line 23
    iget-wide v6, p1, Lr3/o;->j:J

    .line 24
    .line 25
    move-object v2, p2

    .line 26
    invoke-virtual/range {v2 .. v7}, Lr3/p;->x(JLr3/j;J)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-boolean p1, v2, Lz2/g;->d:Z
    :try_end_0
    .catch Lr3/l; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return-object p1

    .line 34
    :catch_0
    move-exception v0

    .line 35
    move-object p1, v0

    .line 36
    return-object p1
.end method

.method public c(J)V
    .locals 0

    .line 1
    return-void
.end method

.method protected bridge synthetic j()Lz2/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr3/i;->z()Lr3/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected bridge synthetic k()Lz2/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr3/i;->A()Lr3/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected bridge synthetic l(Ljava/lang/Throwable;)Lz2/e;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr3/i;->B(Ljava/lang/Throwable;)Lr3/l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected bridge synthetic m(Lz2/f;Lz2/g;Z)Lz2/e;
    .locals 0

    .line 1
    check-cast p1, Lr3/o;

    .line 2
    .line 3
    check-cast p2, Lr3/p;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lr3/i;->D(Lr3/o;Lr3/p;Z)Lr3/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method protected final z()Lr3/o;
    .locals 1

    .line 1
    new-instance v0, Lr3/o;

    .line 2
    .line 3
    invoke-direct {v0}, Lr3/o;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
